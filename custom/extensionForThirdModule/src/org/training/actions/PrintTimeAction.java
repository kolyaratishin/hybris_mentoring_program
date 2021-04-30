package org.training.actions;

import de.hybris.platform.order.impl.DefaultOrderService;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.processengine.model.BusinessProcessModel;

import java.time.ZonedDateTime;

public class PrintTimeAction extends AbstractSimpleDecisionAction
{
    @Override
    public Transition executeAction(final BusinessProcessModel process){
        System.out.println(ZonedDateTime.now());
        return Transition.OK;
    }
}