package org.training.facades.product.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import org.training.core.service.ProductService;
import org.training.facades.product.ProductFacade;

import javax.annotation.Resource;
import java.util.List;

public class ProductFacadeImpl implements ProductFacade {
    @Resource(name = "myProductService")
    private ProductService productService;

    private Converter<ProductModel,ProductData> converter;

    @Override
    public List<ProductData> getProductsSortedByGbSize() {
        List<ProductModel> products = productService.getProductsSortedByGbSize();
        return converter.convertAll(products);
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void setConverter(Converter<ProductModel, ProductData> converter) {
        this.converter = converter;
    }
}
