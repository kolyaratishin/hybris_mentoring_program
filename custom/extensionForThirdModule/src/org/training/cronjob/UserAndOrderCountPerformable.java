package org.training.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.CronJobService;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.model.UserAndOrderCountCronJobModel;

import javax.annotation.Resource;

public class UserAndOrderCountPerformable extends AbstractJobPerformable<UserAndOrderCountCronJobModel> {
    @Resource
    private CronJobService cronJobService;

    @Override
    public PerformResult perform(UserAndOrderCountCronJobModel userAndOrderCountCronJobModel) {
        cronJobService.performCronJob(userAndOrderCountCronJobModel.getOrderCountCronJob());
        cronJobService.performCronJob(userAndOrderCountCronJobModel.getUserCountCronJob());

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public void setCronJobService(CronJobService cronJobService) {
        this.cronJobService = cronJobService;
    }
}
