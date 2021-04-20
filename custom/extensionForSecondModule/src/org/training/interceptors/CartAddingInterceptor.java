package org.training.interceptors;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.training.events.PrintLogEvent;

import javax.annotation.Resource;

public class CartAddingInterceptor implements PrepareInterceptor {

    @Resource
    private EventService eventService;
    @Override
    public void onPrepare(Object o, InterceptorContext interceptorContext) throws InterceptorException {
        if(o instanceof CartModel){
            eventService.publishEvent(new PrintLogEvent());
        }
    }
}
