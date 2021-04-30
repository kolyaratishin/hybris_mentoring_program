/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27 апр. 2021 г., 12:56:30                   ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.jalo.OrderCountCronJob;
import org.training.jalo.UserCountCronJob;

/**
 * Generated class for type UserAndOrderCountCronJob.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class UserAndOrderCountCronJob extends CronJob
{
	/** Qualifier of the <code>UserAndOrderCountCronJob.userCountCronJob</code> attribute **/
	public static final String USERCOUNTCRONJOB = "userCountCronJob";
	/** Qualifier of the <code>UserAndOrderCountCronJob.orderCountCronJob</code> attribute **/
	public static final String ORDERCOUNTCRONJOB = "orderCountCronJob";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(USERCOUNTCRONJOB, AttributeMode.INITIAL);
		tmp.put(ORDERCOUNTCRONJOB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAndOrderCountCronJob.orderCountCronJob</code> attribute.
	 * @return the orderCountCronJob
	 */
	public OrderCountCronJob getOrderCountCronJob(final SessionContext ctx)
	{
		return (OrderCountCronJob)getProperty( ctx, "orderCountCronJob".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAndOrderCountCronJob.orderCountCronJob</code> attribute.
	 * @return the orderCountCronJob
	 */
	public OrderCountCronJob getOrderCountCronJob()
	{
		return getOrderCountCronJob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAndOrderCountCronJob.orderCountCronJob</code> attribute. 
	 * @param value the orderCountCronJob
	 */
	public void setOrderCountCronJob(final SessionContext ctx, final OrderCountCronJob value)
	{
		setProperty(ctx, "orderCountCronJob".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAndOrderCountCronJob.orderCountCronJob</code> attribute. 
	 * @param value the orderCountCronJob
	 */
	public void setOrderCountCronJob(final OrderCountCronJob value)
	{
		setOrderCountCronJob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAndOrderCountCronJob.userCountCronJob</code> attribute.
	 * @return the userCountCronJob
	 */
	public UserCountCronJob getUserCountCronJob(final SessionContext ctx)
	{
		return (UserCountCronJob)getProperty( ctx, "userCountCronJob".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAndOrderCountCronJob.userCountCronJob</code> attribute.
	 * @return the userCountCronJob
	 */
	public UserCountCronJob getUserCountCronJob()
	{
		return getUserCountCronJob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAndOrderCountCronJob.userCountCronJob</code> attribute. 
	 * @param value the userCountCronJob
	 */
	public void setUserCountCronJob(final SessionContext ctx, final UserCountCronJob value)
	{
		setProperty(ctx, "userCountCronJob".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAndOrderCountCronJob.userCountCronJob</code> attribute. 
	 * @param value the userCountCronJob
	 */
	public void setUserCountCronJob(final UserCountCronJob value)
	{
		setUserCountCronJob( getSession().getSessionContext(), value );
	}
	
}
