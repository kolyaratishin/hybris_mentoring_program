package org.training.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.model.UserCountCronJobModel;
import org.training.service.MyUserService;

import javax.annotation.Resource;

public class UserCountPerformable extends AbstractJobPerformable<UserCountCronJobModel> {
    @Resource(name="myUserService")
    private MyUserService myUserService;

    @Override
    public PerformResult perform(UserCountCronJobModel userCountCronJobModel) {
        System.out.println("User count: " + myUserService.getUserCount());
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public void setMyUserService(MyUserService myUserService) {
        this.myUserService = myUserService;
    }
}
