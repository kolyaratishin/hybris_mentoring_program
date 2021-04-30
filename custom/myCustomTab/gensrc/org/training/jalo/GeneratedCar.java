/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27 апр. 2021 г., 12:56:30                   ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.MyCustomTabConstants;
import org.training.jalo.Driver;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Car}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCar extends GenericItem
{
	/** Qualifier of the <code>Car.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Car.color</code> attribute **/
	public static final String COLOR = "color";
	/** Qualifier of the <code>Car.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>Car.drivers</code> attribute **/
	public static final String DRIVERS = "drivers";
	/** Relation ordering override parameter constants for CarToDriver from ((myCustomTab))*/
	protected static String CARTODRIVER_SRC_ORDERED = "relation.CarToDriver.source.ordered";
	protected static String CARTODRIVER_TGT_ORDERED = "relation.CarToDriver.target.ordered";
	/** Relation disable markmodifed parameter constants for CarToDriver from ((myCustomTab))*/
	protected static String CARTODRIVER_MARKMODIFIED = "relation.CarToDriver.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(COLOR, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.color</code> attribute.
	 * @return the color
	 */
	public String getColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.color</code> attribute.
	 * @return the color
	 */
	public String getColor()
	{
		return getColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.color</code> attribute. 
	 * @param value the color
	 */
	public void setColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.color</code> attribute. 
	 * @param value the color
	 */
	public void setColor(final String value)
	{
		setColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.drivers</code> attribute.
	 * @return the drivers
	 */
	public Collection<Driver> getDrivers(final SessionContext ctx)
	{
		final List<Driver> items = getLinkedItems( 
			ctx,
			true,
			MyCustomTabConstants.Relations.CARTODRIVER,
			"Driver",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.drivers</code> attribute.
	 * @return the drivers
	 */
	public Collection<Driver> getDrivers()
	{
		return getDrivers( getSession().getSessionContext() );
	}
	
	public long getDriversCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MyCustomTabConstants.Relations.CARTODRIVER,
			"Driver",
			null
		);
	}
	
	public long getDriversCount()
	{
		return getDriversCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final SessionContext ctx, final Collection<Driver> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MyCustomTabConstants.Relations.CARTODRIVER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CARTODRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final Collection<Driver> value)
	{
		setDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers
	 */
	public void addToDrivers(final SessionContext ctx, final Driver value)
	{
		addLinkedItems( 
			ctx,
			true,
			MyCustomTabConstants.Relations.CARTODRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CARTODRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers
	 */
	public void addToDrivers(final Driver value)
	{
		addToDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers
	 */
	public void removeFromDrivers(final SessionContext ctx, final Driver value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MyCustomTabConstants.Relations.CARTODRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CARTODRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers
	 */
	public void removeFromDrivers(final Driver value)
	{
		removeFromDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Driver");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(CARTODRIVER_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYear( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive()
	{
		return getYearAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Integer value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final int value)
	{
		setYear( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final int value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
