package org.training.core.dao;

import de.hybris.platform.core.model.user.UserModel;

import java.util.List;

public interface UserDao {
    List<UserModel> getUserRegisteredInLast24();
}
