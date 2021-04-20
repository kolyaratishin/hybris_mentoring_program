/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.setup;

import static org.training.constants.ExtensionForSecondModuleConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.training.constants.ExtensionForSecondModuleConstants;
import org.training.service.ExtensionForSecondModuleService;


@SystemSetup(extension = ExtensionForSecondModuleConstants.EXTENSIONNAME)
public class ExtensionForSecondModuleSystemSetup
{
	private final ExtensionForSecondModuleService extensionForSecondModuleService;

	public ExtensionForSecondModuleSystemSetup(final ExtensionForSecondModuleService extensionForSecondModuleService)
	{
		this.extensionForSecondModuleService = extensionForSecondModuleService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		extensionForSecondModuleService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ExtensionForSecondModuleSystemSetup.class.getResourceAsStream("/extensionForSecondModule/sap-hybris-platform.png");
	}
}
