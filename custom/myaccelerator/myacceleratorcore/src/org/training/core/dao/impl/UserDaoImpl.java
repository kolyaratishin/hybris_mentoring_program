package org.training.core.dao.impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.dao.UserDao;

import javax.annotation.Resource;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<UserModel> getUserRegisteredInLast24() {
        final String queryString = "SELECT {PK} FROM {User}";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<UserModel> result = this.flexibleSearchService.search(query);
        return result.getResult();
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
