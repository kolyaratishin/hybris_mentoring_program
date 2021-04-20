package org.training.DAO.Impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.DAO.OrderDao;

import javax.annotation.Resource;

public class OrderDaoImpl implements OrderDao {

    @Resource
    private FlexibleSearchService flexibleSearchService;

    public OrderDaoImpl(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService=flexibleSearchService;
    }

    @Override
    public OrderModel findOrderByLatestDate() {
        final String queryString = "SELECT {PK} FROM {Order} ORDER BY {date} DESC";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<OrderModel> result = this.flexibleSearchService.search(query);
        return result.getResult().get(0);
    }

    @Override
    public Long getOrdersCount() {
        final String queryString = "SELECT {PK} FROM {Order}";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<Long> result = this.flexibleSearchService.search(query);
        return (long)result.getCount();
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
