/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23 апр. 2021 г., 11:01:02                   ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.ExtensionForThirdModuleConstants;
import org.training.jalo.OrderCountCronJob;
import org.training.jalo.UserAndOrderCountCronJob;
import org.training.jalo.UserCountCronJob;

/**
 * Generated class for type <code>ExtensionForThirdModuleManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class ExtensionForThirdModuleManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public OrderCountCronJob createOrderCountCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("OrderCountCronJob");
			return (OrderCountCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OrderCountCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public OrderCountCronJob createOrderCountCronJob(final Map attributeValues)
	{
		return createOrderCountCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public UserAndOrderCountCronJob createUserAndOrderCountCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("UserAndOrderCountCronJob");
			return (UserAndOrderCountCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UserAndOrderCountCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public UserAndOrderCountCronJob createUserAndOrderCountCronJob(final Map attributeValues)
	{
		return createUserAndOrderCountCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public UserCountCronJob createUserCountCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("UserCountCronJob");
			return (UserCountCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UserCountCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public UserCountCronJob createUserCountCronJob(final Map attributeValues)
	{
		return createUserCountCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public static final ExtensionForThirdModuleManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ExtensionForThirdModuleManager) em.getExtension(ExtensionForThirdModuleConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return ExtensionForThirdModuleConstants.EXTENSIONNAME;
	}
	
}
