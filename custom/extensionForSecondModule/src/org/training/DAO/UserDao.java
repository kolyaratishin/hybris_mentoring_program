package org.training.DAO;

import de.hybris.platform.core.model.user.UserModel;

public interface UserDao {
    UserModel findUserWithMostOrders();
}
