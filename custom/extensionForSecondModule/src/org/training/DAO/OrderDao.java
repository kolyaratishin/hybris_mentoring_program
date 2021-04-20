package org.training.DAO;

import de.hybris.platform.core.model.order.OrderModel;

public interface OrderDao {
    OrderModel findOrderByLatestDate();
    Long getOrdersCount();
}
