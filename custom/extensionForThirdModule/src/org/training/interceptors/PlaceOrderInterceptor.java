package org.training.interceptors;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.processengine.BusinessProcessEvent;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import javax.annotation.Resource;

public class PlaceOrderInterceptor implements PrepareInterceptor<OrderModel> {
    @Resource
    private BusinessProcessService businessProcessService;

    @Override
    public void onPrepare(OrderModel orderModel, InterceptorContext interceptorContext) throws InterceptorException {
        if (orderModel != null){
        BusinessProcessEvent event = BusinessProcessEvent.builder("waitWhenOrderIsPlacedOrProductIsRemoved").withChoice("placeOrder").build();
        businessProcessService.triggerEvent(event);
        }
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}
