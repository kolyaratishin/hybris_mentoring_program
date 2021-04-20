package org.training.service.impl;


import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.i18n.daos.CurrencyDao;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import org.junit.Before;
import org.junit.Test;
import org.training.service.impl.MyServiceImpl;
import org.training.DAO.Impl.UserDaoImpl;
import org.training.DAO.Impl.OrderDaoImpl;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import static de.hybris.platform.testframework.Assert.assertEquals;
import static de.hybris.platform.testframework.Assert.assertNotEquals;

import java.lang.Thread;

@IntegrationTest
public class MyServiceImplTest extends ServicelayerTransactionalTest {
	
    @InjectMocks
    private MyServiceImpl myService;

    @Resource
    private UserService userService;

    @Resource
    private OrderService orderService;

    @Resource
    private ModelService modelService;

    @Resource
    private CurrencyDao currencyDao;
	@Resource
	private FlexibleSearchService flexibleSearchService;

    @Before
    public void  setUp(){
        MockitoAnnotations.initMocks(this);
	myService.setUserDao(new UserDaoImpl(flexibleSearchService));
	myService.setOrderDao(new OrderDaoImpl(flexibleSearchService));
    }

    @Test
    public void countOrdersTest(){
	UserModel user = createUser("1");
	CurrencyModel currency = createCurrency();
       	List<OrderModel> orders = createOrders(5,user,currency);
        Long expectedCount = myService.countOrders();

        assertEquals((long)orders.size(),expectedCount);
    }

    @Test
    public void findUserWithMostOrdersTest(){
        UserModel user1 = createUser("2");
        UserModel user2 = createUser("1");
	CurrencyModel currency = createCurrency();
	createOrders(2,user1,currency);
	createOrders(1,user2,currency);
        UserModel expectedUser = myService.findUserWithMostOrders();
	assertEquals(expectedUser.getUid(), user1.getUid());
        assertNotEquals(expectedUser.getUid(),user2.getUid());
    }
	public UserModel createUser(String uid){
        	UserModel user = new UserModel();
		user.setUid(uid);
        	return user;
    }
	public CurrencyModel createCurrency(){
        	CurrencyModel currency = new CurrencyModel();
		currency.setIsocode("j");
		currency.setSymbol("j");
		modelService.save(currency);
       		return currency;
    }
	public List<OrderModel> createOrders(Integer ordersCount,UserModel user,CurrencyModel currency){
	List<OrderModel> orders = new ArrayList<>();
        for(int i = 0;i < ordersCount;i++){
        	OrderModel order = new OrderModel();
  		order.setCurrency(currency);
        	order.setDate(new Date());
        	order.setUser(user);
		orders.add(order);
  		modelService.save(order);
	}
	return orders;

}

    @Test
    public void findLatestOrderTest(){
        UserModel user = createUser("1");
	CurrencyModel currency = createCurrency();
       	List<OrderModel> orders = createOrders(5,user,currency);
        OrderModel expectedOrderModel = myService.findLatestOrder();

        assertEquals(orders.get(orders.size()-1),expectedOrderModel);
    }
}
