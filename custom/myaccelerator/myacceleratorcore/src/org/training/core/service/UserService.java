package org.training.core.service;

import de.hybris.platform.core.model.user.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getUserRegisteredInLast24();
}
