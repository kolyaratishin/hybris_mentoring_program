package org.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomSizeValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider, Serializable {

    private FieldNameProvider fieldNameProvider;

    @SuppressWarnings("deprecation")
    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object o) throws FieldValueProviderException {

        if (o instanceof ProductModel) {
            final ProductModel product = (ProductModel) o;
            final List<FieldValue> fieldValues = createFieldValue(product, indexConfig, indexedProperty);
            return fieldValues;
        }else throw new FieldValueProviderException("Cannot get online days for a product model");
    }

    @SuppressWarnings("boxing")
    protected List<FieldValue> createFieldValue(final ProductModel product, final IndexConfig indexConfig,
                                                final IndexedProperty indexedProperty)
    {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        final Double customSizeValueValue = product.getCustomSizeValue();

        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, null);

        for (final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, customSizeValueValue));
        }

        return fieldValues;
    }

    public FieldNameProvider getFieldNameProvider()
    {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
    {
        this.fieldNameProvider = fieldNameProvider;
    }
}