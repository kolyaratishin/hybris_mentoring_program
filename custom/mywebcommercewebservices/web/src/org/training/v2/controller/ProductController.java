package org.training.v2.controller;


import de.hybris.platform.cmswebservices.dto.ProductDataListWsDTO;
import de.hybris.platform.cmswebservices.dto.ProductWsDTO;
import de.hybris.platform.commercefacades.product.data.ProductData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.training.facades.product.ProductFacade;
import org.training.product.data.ProductDataList;

import javax.annotation.Resource;


@Controller
@RequestMapping(value = "/{baseSiteId}")
public class ProductController extends BaseCommerceController{

    @Resource(name = "myProductFacade")
    private ProductFacade productFacade;

    @ResponseBody
    @RequestMapping(value = "/task4", method = RequestMethod.GET)
    public ProductDataListWsDTO getProductsSortedByGbSize(){
        ProductDataList productDataList = new ProductDataList();
        productDataList.setProducts(productFacade.getProductsSortedByGbSize());
        ProductDataListWsDTO productDataListWsDTO = getDataMapper().map(productDataList,ProductDataListWsDTO.class);
        return productDataListWsDTO;
    }
}
