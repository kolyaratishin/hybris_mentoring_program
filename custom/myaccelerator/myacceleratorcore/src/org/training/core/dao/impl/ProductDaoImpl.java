package org.training.core.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.dao.ProductDao;

import javax.annotation.Resource;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<ProductModel> getProductsSortedByGbSize() {
        final String queryString = "SELECT {PK} FROM {Product} ORDER BY {gbSize}";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<ProductModel> result = this.flexibleSearchService.search(query);
        return result.getResult();
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
