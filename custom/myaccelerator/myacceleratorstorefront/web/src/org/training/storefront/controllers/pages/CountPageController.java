package org.training.storefront.controllers.pages;

import de.hybris.platform.cms2.model.contents.components.CMSParagraphComponentModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/countPage")
public class CountPageController {
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Resource
    private ModelService modelService;

    @RequestMapping(method = RequestMethod.GET)
    public String setUpContentForParagraphs(){
        final int ordersCount = getCount("Order");
        final int usersCount = getCount("User");
	final int onlineUsersCount = getOnlineUsersCount();

        final CMSParagraphComponentModel orderCountParagraph = getCMSParagraphComponent("orderCountParagraph");
        final CMSParagraphComponentModel userCountParagraph = getCMSParagraphComponent("userCountParagraph");
	final CMSParagraphComponentModel onlineUserCountParagraph = getCMSParagraphComponent("onlineUserCountParagraph");
        
	orderCountParagraph.setContent("Orders count:" + ordersCount);
        userCountParagraph.setContent("Users count:" + usersCount);
	onlineUserCountParagraph.setContent("Online users count:" + onlineUsersCount);

        modelService.save(orderCountParagraph);
        modelService.save(userCountParagraph);
	modelService.save(onlineUserCountParagraph);

        return "pages/CountPageTemplate";
    }
	private int getOnlineUsersCount(){
		final String orderQueryString = "SELECT {PK} FROM {User} WHERE {isOnline}=true";
        	final FlexibleSearchQuery orderQuery = new FlexibleSearchQuery(orderQueryString);
        	return this.flexibleSearchService.search(orderQuery).getCount();
}
    private int getCount(String modelName){
        final String orderQueryString = "SELECT {PK} FROM {" + modelName + "}";
        final FlexibleSearchQuery orderQuery = new FlexibleSearchQuery(orderQueryString);
        return this.flexibleSearchService.search(orderQuery).getCount();
    }
    private CMSParagraphComponentModel getCMSParagraphComponent(String componentName){
        final String componentQueryString = "SELECT {PK} FROM {CMSParagraphComponent} WHERE {uid} = '"+ componentName + "'";
        final FlexibleSearchQuery componentQuery = new FlexibleSearchQuery(componentQueryString);
        return (CMSParagraphComponentModel) this.flexibleSearchService.search(componentQuery).getResult().get(0);
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
