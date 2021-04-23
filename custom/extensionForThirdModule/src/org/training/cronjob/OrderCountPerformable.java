package org.training.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.model.OrderCountCronJobModel;
import org.training.service.MyService;

import javax.annotation.Resource;

public class OrderCountPerformable extends AbstractJobPerformable<OrderCountCronJobModel> {
    @Resource
    private MyService myService;

    @Override
    public PerformResult perform(OrderCountCronJobModel orderCountCronJobModel) {
        System.out.println("Order count: " + myService.countOrders());
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

	public void setMyService(MyService myService){
		this.myService=myService;
	}
}
