package org.training.service.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.impl.DefaultFlexibleSearchService;
import de.hybris.platform.servicelayer.search.impl.SearchResultImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.training.DAO.Impl.OrderDaoImpl;

import java.util.ArrayList;
import java.util.List;

import static de.hybris.platform.testframework.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@UnitTest
public class OrderDaoTest {

    @InjectMocks
    private OrderDaoImpl orderDao;

    @Mock
    private FlexibleSearchService flexibleSearchService;

    private SearchResult<OrderModel> resultForOrder;

    private SearchResult<Long> resultForLong;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        this.orderDao.setFlexibleSearchService(this.flexibleSearchService);
        List<OrderModel> orderList = new ArrayList<>();
        List<Long> longList = new ArrayList<>();
        orderList.add(new OrderModel());
        longList.add(1L);
        this.resultForOrder = new SearchResultImpl<>(orderList,orderList.size(),0,0);
        this.resultForLong = new SearchResultImpl<>(longList,longList.size(),0,0);
    }

    @Test
    public void findOrdersCountTest(){
        final String queryString = "SELECT {PK} FROM {Order}";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        doReturn(resultForLong).when(flexibleSearchService).search(query);

        Long expectedCount = orderDao.getOrdersCount();

        assertEquals(expectedCount,(long)resultForLong.getCount());
    }
    @Test
    public void findOrderByLatestDateTest(){
        final String queryString = "SELECT {PK} FROM {Order} ORDER BY {date} DESC";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        doReturn(resultForOrder).when(flexibleSearchService).search(query);

        OrderModel  expectedOrderModel = orderDao.findOrderByLatestDate();

        assertEquals(expectedOrderModel,resultForOrder.getResult().get(0));
    }
}
