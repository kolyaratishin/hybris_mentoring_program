/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.setup;

import static org.training.constants.ExtensionForFourthModuleConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.training.constants.ExtensionForFourthModuleConstants;
import org.training.service.ExtensionForFourthModuleService;


@SystemSetup(extension = ExtensionForFourthModuleConstants.EXTENSIONNAME)
public class ExtensionForFourthModuleSystemSetup
{
	private final ExtensionForFourthModuleService extensionForFourthModuleService;

	public ExtensionForFourthModuleSystemSetup(final ExtensionForFourthModuleService extensionForFourthModuleService)
	{
		this.extensionForFourthModuleService = extensionForFourthModuleService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		extensionForFourthModuleService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ExtensionForFourthModuleSystemSetup.class.getResourceAsStream("/extensionForFourthModule/sap-hybris-platform.png");
	}
}
