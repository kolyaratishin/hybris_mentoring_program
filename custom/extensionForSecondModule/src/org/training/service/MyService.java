package org.training.service;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;

public interface MyService {
    Long countOrders();
    UserModel findUserWithMostOrders();
    OrderModel findLatestOrder();
}
