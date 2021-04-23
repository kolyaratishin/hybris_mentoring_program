/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.setup;

import static org.training.constants.ExtensionForThirdModuleConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.training.constants.ExtensionForThirdModuleConstants;
import org.training.service.ExtensionForThirdModuleService;


@SystemSetup(extension = ExtensionForThirdModuleConstants.EXTENSIONNAME)
public class ExtensionForThirdModuleSystemSetup
{
	private final ExtensionForThirdModuleService extensionForThirdModuleService;

	public ExtensionForThirdModuleSystemSetup(final ExtensionForThirdModuleService extensionForThirdModuleService)
	{
		this.extensionForThirdModuleService = extensionForThirdModuleService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		extensionForThirdModuleService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ExtensionForThirdModuleSystemSetup.class.getResourceAsStream("/extensionForThirdModule/sap-hybris-platform.png");
	}
}
