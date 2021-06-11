package org.training.facades.populators;

import de.hybris.platform.cmsfacades.data.UserData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class UserPopulator implements Populator<UserModel, UserData> {
    @Override
    public void populate(UserModel userModel, UserData userData) throws ConversionException {
        userData.setUid(userModel.getUid());
    }
}
