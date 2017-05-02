/**
 *
 */
package de.hybris.platform.recipes.handlers;

import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.apache.commons.collections.CollectionUtils;


public class NumberOfIngredientsAttributeHandler implements DynamicAttributeHandler<Integer, RecipeModel>
{


	@Override
	public Integer get(final RecipeModel arg0)
	{
		if (CollectionUtils.isNotEmpty(arg0.getRecipeEntries()))
		{
			return Integer.valueOf(arg0.getRecipeEntries().size());
		}

		return null;
	}


	@Override
	public void set(final RecipeModel arg0, final Integer arg1)
	{
		throw new IllegalStateException();
	}

}
