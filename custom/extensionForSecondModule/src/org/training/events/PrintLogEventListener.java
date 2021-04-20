package org.training.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class PrintLogEventListener extends AbstractEventListener<PrintLogEvent> {

    @Override
    protected void onEvent(PrintLogEvent printLogEvent) {
        if (printLogEvent != null)
            System.out.println("User have added new cart");
        }
}
