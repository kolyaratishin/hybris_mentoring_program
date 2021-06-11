package org.training.facades.product;

import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public interface ProductFacade {
    List<ProductData> getProductsSortedByGbSize();
}
