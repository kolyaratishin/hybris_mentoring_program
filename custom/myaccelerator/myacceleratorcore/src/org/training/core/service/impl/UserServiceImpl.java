package org.training.core.service.impl;

import de.hybris.platform.core.model.user.UserModel;
import org.training.core.dao.UserDao;
import org.training.core.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Resource(name = "myUserDao")
    private UserDao userDao;

    @Override
    public List<UserModel> getUserRegisteredInLast24() {
        return userDao.getUserRegisteredInLast24();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
