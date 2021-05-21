/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20 мая 2021 г., 17:47:59                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.ExtensionForFourthModuleConstants;

/**
 * Generated class for type <code>ExtensionForFourthModuleManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class ExtensionForFourthModuleManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isOnline", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.User", Collections.unmodifiableMap(tmp));
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
	
	public static final ExtensionForFourthModuleManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ExtensionForFourthModuleManager) em.getExtension(ExtensionForFourthModuleConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return ExtensionForFourthModuleConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.isOnline</code> attribute.
	 * @return the isOnline - Age
	 */
	public Boolean isIsOnline(final SessionContext ctx, final User item)
	{
		return (Boolean)item.getProperty( ctx, ExtensionForFourthModuleConstants.Attributes.User.ISONLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.isOnline</code> attribute.
	 * @return the isOnline - Age
	 */
	public Boolean isIsOnline(final User item)
	{
		return isIsOnline( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.isOnline</code> attribute. 
	 * @return the isOnline - Age
	 */
	public boolean isIsOnlineAsPrimitive(final SessionContext ctx, final User item)
	{
		Boolean value = isIsOnline( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.isOnline</code> attribute. 
	 * @return the isOnline - Age
	 */
	public boolean isIsOnlineAsPrimitive(final User item)
	{
		return isIsOnlineAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.isOnline</code> attribute. 
	 * @param value the isOnline - Age
	 */
	public void setIsOnline(final SessionContext ctx, final User item, final Boolean value)
	{
		item.setProperty(ctx, ExtensionForFourthModuleConstants.Attributes.User.ISONLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.isOnline</code> attribute. 
	 * @param value the isOnline - Age
	 */
	public void setIsOnline(final User item, final Boolean value)
	{
		setIsOnline( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.isOnline</code> attribute. 
	 * @param value the isOnline - Age
	 */
	public void setIsOnline(final SessionContext ctx, final User item, final boolean value)
	{
		setIsOnline( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.isOnline</code> attribute. 
	 * @param value the isOnline - Age
	 */
	public void setIsOnline(final User item, final boolean value)
	{
		setIsOnline( getSession().getSessionContext(), item, value );
	}
	
}
