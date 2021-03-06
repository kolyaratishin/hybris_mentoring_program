/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.training.fulfilmentprocess.constants.MyacceleratorFulfilmentProcessConstants;

public class MyacceleratorFulfilmentProcessManager extends GeneratedMyacceleratorFulfilmentProcessManager
{
	public static final MyacceleratorFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MyacceleratorFulfilmentProcessManager) em.getExtension(MyacceleratorFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
