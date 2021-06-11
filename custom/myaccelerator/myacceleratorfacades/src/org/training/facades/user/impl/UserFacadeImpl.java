package org.training.facades.user.impl;

import de.hybris.platform.cmsfacades.data.UserData;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.service.UserService;
import org.training.facades.user.UserFacade;

import javax.annotation.Resource;
import java.util.List;

public class UserFacadeImpl implements UserFacade {
    @Resource(name = "myUserService")
    private UserService userService;

    private Converter<UserModel, UserData> converter;

    @Override
    public List<UserData> getUserRegisteredInLast24() {
        List<UserModel> users = userService.getUserRegisteredInLast24();
        return converter.convertAll(users);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setConverter(Converter<UserModel, UserData> converter) {
        this.converter = converter;
    }
}
