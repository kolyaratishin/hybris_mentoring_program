package org.training.DAO.Impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.springframework.stereotype.Component;
import org.training.DAO.UserDao;
import java.util.List;
import javax.annotation.Resource;

@Component
public class UserDaoImpl implements UserDao {

    @Resource
    private FlexibleSearchService flexibleSearchService;

    public UserDaoImpl(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService=flexibleSearchService;
    }
	public UserDaoImpl() {}

    @Override
    public UserModel findUserWithMostOrders() {
        final String queryString = "SELECT {u:PK} FROM {Order as o JOIN User as u ON {o:user}={u:PK}} GROUP BY {u:PK} ORDER BY COUNT({u:PK}) DESC";
	final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<UserModel> result = this.flexibleSearchService.search(query);
        return result.getResult().get(0);
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Resource
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
