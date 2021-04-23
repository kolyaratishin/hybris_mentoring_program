package org.training.cronjob;

import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.TriggerModel;
import de.hybris.platform.servicelayer.cronjob.CronJobService;
import de.hybris.platform.servicelayer.internal.model.ServicelayerJobModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.training.model.OrderCountCronJobModel;
import org.training.model.UserAndOrderCountCronJobModel;
import org.training.model.UserCountCronJobModel;

import javax.annotation.Resource;

public class CronjobRunner {
    @Resource
    private CronJobService cronJobService;

    @Resource
    private ModelService modelService;

    @Resource
    private FlexibleSearchService flexibleSearchService;

    public void performOrderCountCronjob() {

        ServicelayerJobModel sjm = createServiceLayerJobModel("orderCountPerformable");

        OrderCountCronJobModel cronJobModel = createOrderCronJob(sjm);

        createTrigger(cronJobModel);

        cronJobService.performCronJob(cronJobModel);
    }

    public void performUserAndOrderCronJob(){
        ServicelayerJobModel orderSjm = createServiceLayerJobModel("orderCountPerformable");
        ServicelayerJobModel userSjm = createServiceLayerJobModel("userCountPerformable");
        ServicelayerJobModel userAndOrderSjm = createServiceLayerJobModel("userAndOrderCountPerformable");

        UserCountCronJobModel userCountCronJobModel = createUserCronJob(userSjm);
        OrderCountCronJobModel orderCountCronJobModel = createOrderCronJob(orderSjm);
        UserAndOrderCountCronJobModel userAndOrderCountCronJob = createUserAndOrderCronJob(userAndOrderSjm);

        createTrigger(userCountCronJobModel);
        createTrigger(orderCountCronJobModel);

        userAndOrderCountCronJob.setOrderCountCronJob(orderCountCronJobModel);
        userAndOrderCountCronJob.setUserCountCronJob(userCountCronJobModel);

        cronJobService.performCronJob(userAndOrderCountCronJob);
    }

    private UserAndOrderCountCronJobModel createUserAndOrderCronJob(ServicelayerJobModel sjm) {
        UserAndOrderCountCronJobModel cronJobModel = modelService.create(UserAndOrderCountCronJobModel.class);
        cronJobModel.setActive(Boolean.TRUE);
        cronJobModel.setJob(sjm);
        modelService.save(cronJobModel);
        return cronJobModel;
    }

    private UserCountCronJobModel createUserCronJob(ServicelayerJobModel sjm) {
        UserCountCronJobModel cronJobModel = modelService.create(UserCountCronJobModel.class);
        cronJobModel.setActive(Boolean.TRUE);
        cronJobModel.setJob(sjm);
        modelService.save(cronJobModel);
        return cronJobModel;
    }

    private void createTrigger(CronJobModel cronJob) {
        TriggerModel trigger = modelService.create(TriggerModel.class);
        trigger.setActive(Boolean.TRUE);
	trigger.setMinute(2);
        //trigger.setCronExpression("0/1 0 * * * ? *");
        trigger.setCronJob(cronJob);
        modelService.save(trigger);
    }

    private OrderCountCronJobModel createOrderCronJob(ServicelayerJobModel sjm) {
        OrderCountCronJobModel cronJobModel = modelService.create(OrderCountCronJobModel.class);
        cronJobModel.setActive(Boolean.TRUE);
        cronJobModel.setJob(sjm);
        modelService.save(cronJobModel);
        return cronJobModel;
    }

    private ServicelayerJobModel createServiceLayerJobModel(String springId) {
        ServicelayerJobModel sjm = new ServicelayerJobModel();
        sjm.setSpringId(springId);
        return flexibleSearchService.getModelByExample(sjm);
    }


    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public void setCronJobService(CronJobService cronJobService) {
        this.cronJobService = cronJobService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
