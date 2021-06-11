package org.training.v2.controller;

import de.hybris.platform.cmsfacades.data.UserData;
import de.hybris.platform.cmswebservices.dto.UserDataWsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.training.core.dto.UserDataList;
import org.training.core.dto.UserDataListWsDto;
import org.training.facades.user.UserFacade;

import javax.annotation.Resource;

@Controller
@RequestMapping(value= "/{baseSiteId}")
public class UserController extends BaseCommerceController {
    @Resource(name = "myUserFacade")
    private UserFacade userFacade;

    @RequestMapping(value = "/task3", method = RequestMethod.GET)
    @ResponseBody
    public UserDataListWsDto getUserRegisteredInLast24(){
        UserDataList userDataList = new UserDataList();
        userDataList.setUsersData(userFacade.getUserRegisteredInLast24());
        UserDataListWsDto userDataListWsDto = getDataMapper().map(userDataList,UserDataListWsDto.class);
        return userDataListWsDto;
    }
}
