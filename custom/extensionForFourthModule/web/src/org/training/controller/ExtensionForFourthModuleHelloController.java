/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.controller;

import static org.training.constants.ExtensionForFourthModuleConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.training.service.ExtensionForFourthModuleService;


@Controller
public class ExtensionForFourthModuleHelloController
{
	@Autowired
	private ExtensionForFourthModuleService extensionForFourthModuleService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", extensionForFourthModuleService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
