package org.training.service.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.service.MyUserService;

import javax.annotation.Resource;

public class MyUserServiceImpl implements MyUserService {
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public Long getUserCount() {
        final String queryString = "SELECT {PK} FROM {User}";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<Long> result = this.flexibleSearchService.search(query);
        return (long)result.getCount();
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
