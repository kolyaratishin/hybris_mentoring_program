package org.training.service.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import org.training.DAO.OrderDao;
import org.training.DAO.UserDao;
import org.training.service.MyService;

import javax.annotation.Resource;

public class MyServiceImpl implements MyService {

    @Resource(name = "kolya.UserDao")
    private UserDao userDao;

    @Resource(name = "kolya.OrderDao")
    private OrderDao orderDao;

	public MyServiceImpl(){}

    @Override
    public Long countOrders() {
      return orderDao.getOrdersCount();
    }

    @Override
    public UserModel findUserWithMostOrders() {
        return userDao.findUserWithMostOrders();
    }

    @Override
    public OrderModel findLatestOrder() {
        return orderDao.findOrderByLatestDate();
    }

	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}

	public void setOrderDao(OrderDao orderDao){
		this.orderDao=orderDao;
	}
}
