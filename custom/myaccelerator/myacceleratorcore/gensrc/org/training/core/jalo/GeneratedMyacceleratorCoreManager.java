/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 июн. 2021 г., 11:37:09                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.MyacceleratorCoreConstants;
import org.training.core.jalo.ApparelProduct;
import org.training.core.jalo.ApparelSizeVariantProduct;
import org.training.core.jalo.ApparelStyleVariantProduct;
import org.training.core.jalo.ElectronicsColorVariantProduct;

/**
 * Generated class for type <code>MyacceleratorCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyacceleratorCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("gbSize", AttributeMode.INITIAL);
		tmp.put("customSize", AttributeMode.INITIAL);
		tmp.put("customSizeValue", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
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
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyacceleratorCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyacceleratorCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyacceleratorCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyacceleratorCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSize</code> attribute.
	 * @return the customSize
	 */
	public Double getCustomSize(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, MyacceleratorCoreConstants.Attributes.Product.CUSTOMSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSize</code> attribute.
	 * @return the customSize
	 */
	public Double getCustomSize(final Product item)
	{
		return getCustomSize( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSize</code> attribute. 
	 * @return the customSize
	 */
	public double getCustomSizeAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getCustomSize( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSize</code> attribute. 
	 * @return the customSize
	 */
	public double getCustomSizeAsPrimitive(final Product item)
	{
		return getCustomSizeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSize</code> attribute. 
	 * @param value the customSize
	 */
	public void setCustomSize(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, MyacceleratorCoreConstants.Attributes.Product.CUSTOMSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSize</code> attribute. 
	 * @param value the customSize
	 */
	public void setCustomSize(final Product item, final Double value)
	{
		setCustomSize( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSize</code> attribute. 
	 * @param value the customSize
	 */
	public void setCustomSize(final SessionContext ctx, final Product item, final double value)
	{
		setCustomSize( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSize</code> attribute. 
	 * @param value the customSize
	 */
	public void setCustomSize(final Product item, final double value)
	{
		setCustomSize( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSizeValue</code> attribute.
	 * @return the customSizeValue
	 */
	public Double getCustomSizeValue(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, MyacceleratorCoreConstants.Attributes.Product.CUSTOMSIZEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSizeValue</code> attribute.
	 * @return the customSizeValue
	 */
	public Double getCustomSizeValue(final Product item)
	{
		return getCustomSizeValue( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSizeValue</code> attribute. 
	 * @return the customSizeValue
	 */
	public double getCustomSizeValueAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getCustomSizeValue( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSizeValue</code> attribute. 
	 * @return the customSizeValue
	 */
	public double getCustomSizeValueAsPrimitive(final Product item)
	{
		return getCustomSizeValueAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSizeValue</code> attribute. 
	 * @param value the customSizeValue
	 */
	public void setCustomSizeValue(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, MyacceleratorCoreConstants.Attributes.Product.CUSTOMSIZEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSizeValue</code> attribute. 
	 * @param value the customSizeValue
	 */
	public void setCustomSizeValue(final Product item, final Double value)
	{
		setCustomSizeValue( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSizeValue</code> attribute. 
	 * @param value the customSizeValue
	 */
	public void setCustomSizeValue(final SessionContext ctx, final Product item, final double value)
	{
		setCustomSizeValue( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSizeValue</code> attribute. 
	 * @param value the customSizeValue
	 */
	public void setCustomSizeValue(final Product item, final double value)
	{
		setCustomSizeValue( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.gbSize</code> attribute.
	 * @return the gbSize - gbSize
	 */
	public Double getGbSize(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, MyacceleratorCoreConstants.Attributes.Product.GBSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.gbSize</code> attribute.
	 * @return the gbSize - gbSize
	 */
	public Double getGbSize(final Product item)
	{
		return getGbSize( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.gbSize</code> attribute. 
	 * @return the gbSize - gbSize
	 */
	public double getGbSizeAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getGbSize( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.gbSize</code> attribute. 
	 * @return the gbSize - gbSize
	 */
	public double getGbSizeAsPrimitive(final Product item)
	{
		return getGbSizeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.gbSize</code> attribute. 
	 * @param value the gbSize - gbSize
	 */
	public void setGbSize(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, MyacceleratorCoreConstants.Attributes.Product.GBSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.gbSize</code> attribute. 
	 * @param value the gbSize - gbSize
	 */
	public void setGbSize(final Product item, final Double value)
	{
		setGbSize( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.gbSize</code> attribute. 
	 * @param value the gbSize - gbSize
	 */
	public void setGbSize(final SessionContext ctx, final Product item, final double value)
	{
		setGbSize( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.gbSize</code> attribute. 
	 * @param value the gbSize - gbSize
	 */
	public void setGbSize(final Product item, final double value)
	{
		setGbSize( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return MyacceleratorCoreConstants.EXTENSIONNAME;
	}
	
}
