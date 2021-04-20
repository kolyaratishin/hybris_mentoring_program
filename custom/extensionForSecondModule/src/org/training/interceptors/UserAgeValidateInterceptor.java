package org.training.interceptors;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class UserAgeValidateInterceptor implements ValidateInterceptor
{
    @Override
    public void onValidate(final Object o, final InterceptorContext ctx) throws InterceptorException
    {
        if (o instanceof UserModel)
        {
            final UserModel user = (UserModel) o;
            if (user.getAge()<0)
            {
                throw new InterceptorException("User cannot have age below 0");
            }
        }
    }
}
