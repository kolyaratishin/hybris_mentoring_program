package org.training.core.service.impl;

import de.hybris.platform.core.model.product.ProductModel;
import org.training.core.dao.ProductDao;
import org.training.core.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Resource(name = "myProductDao")
    private ProductDao productDao;

    @Override
    public List<ProductModel> getProductsSortedByGbSize() {
        return productDao.getProductsSortedByGbSize();
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
