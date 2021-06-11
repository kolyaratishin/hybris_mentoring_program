package org.training.facades.user;

import de.hybris.platform.cmsfacades.data.UserData;


import java.util.List;

public interface UserFacade {
    List<UserData> getUserRegisteredInLast24();
}
