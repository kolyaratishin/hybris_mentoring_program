package org.training.service.impl;


import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.impl.SearchResultImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.training.DAO.Impl.UserDaoImpl;

import java.util.ArrayList;
import java.util.List;

import static de.hybris.platform.testframework.Assert.assertEquals;
import static org.mockito.Mockito.*;

@UnitTest
public class UserDaoImplTest {

    @InjectMocks
    private UserDaoImpl userDao;

    @Mock
    private FlexibleSearchService flexibleSearchService;

    private SearchResult<UserModel> resultForUser;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        this.userDao.setFlexibleSearchService(flexibleSearchService);
        List<UserModel> userList = new ArrayList<>();
        userList.add(new UserModel());
        this.resultForUser = new SearchResultImpl<>(userList,userList.size(),0,0);
    }


    @Test
    public void findUserWithMostOrdersTest(){
        final String queryString = "SELECT {u:PK} FROM {Order as o JOIN User as u ON {o:user}={u:PK}} GROUP BY {u:PK} ORDER BY COUNT({u:PK}) DESC";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        doReturn(resultForUser).when(flexibleSearchService).search(query);

        UserModel expectedUser = userDao.findUserWithMostOrders();

        assertEquals(resultForUser.getResult().get(0),expectedUser);

    }
}
