package org.training.interceptors;

import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.processengine.BusinessProcessEvent;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import javax.annotation.Resource;

public class RemoveCartInterceptor implements RemoveInterceptor<CartEntryModel> {
    @Resource
    private BusinessProcessService businessProcessService;

    @Override
    public void onRemove(CartEntryModel cartEntryModel, InterceptorContext interceptorContext) throws InterceptorException {
        BusinessProcessEvent event = BusinessProcessEvent.builder("waitWhenOrderIsPlacedOrProductIsRemoved").withChoice("removeProduct").build();
        businessProcessService.triggerEvent(event);
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}
