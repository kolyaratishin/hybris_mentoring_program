package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.model.contents.components.CMSParagraphComponentModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/myPage")
public class MyPageController extends AbstractPageController {

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Resource
    private ModelService modelService;

    @RequestMapping(method = RequestMethod.GET)
    public String setUpContentForParagraphs(){
        final String orderQueryString = "SELECT {PK} FROM {Order}";
        final FlexibleSearchQuery orderQuery = new FlexibleSearchQuery(orderQueryString);
        final int ordersCount = this.flexibleSearchService.search(orderQuery).getCount();

        final String componentQueryString = "SELECT {PK} FROM {CMSParagraphComponent} WHERE {uid} = 'orderCountParagraph'";
        final FlexibleSearchQuery componentQuery = new FlexibleSearchQuery(componentQueryString);
        CMSParagraphComponentModel component = (CMSParagraphComponentModel) this.flexibleSearchService.search(componentQuery).getResult().get(0);

        component.setContent("Orders count:" + String.valueOf(ordersCount));

        modelService.save(component);

	return "pages/myPageTemplate";
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
