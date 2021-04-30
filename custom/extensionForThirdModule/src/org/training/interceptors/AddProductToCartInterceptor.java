package org.training.interceptors;

import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.processengine.BusinessProcessEvent;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import javax.annotation.Resource;

public class AddProductToCartInterceptor implements PrepareInterceptor<CartEntryModel> {
    @Resource
    private BusinessProcessService businessProcessService;
    @Override
    public void onPrepare(CartEntryModel cartEntryModel, InterceptorContext interceptorContext) throws InterceptorException {
        if(cartEntryModel!=null){
            businessProcessService.startProcess("myProcess","myProcessDefinition");
        }
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}
