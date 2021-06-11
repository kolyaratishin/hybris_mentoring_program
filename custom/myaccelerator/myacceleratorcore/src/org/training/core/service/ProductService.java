package org.training.core.service;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getProductsSortedByGbSize();
}
