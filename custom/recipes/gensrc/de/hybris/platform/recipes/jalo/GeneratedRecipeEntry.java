/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-mag-2017 17.52.32                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.recipes.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.recipes.constants.RecipesConstants;
import de.hybris.platform.recipes.jalo.Food;
import de.hybris.platform.recipes.jalo.Recipe;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RecipeEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipeEntry extends GenericItem
{
	/** Qualifier of the <code>RecipeEntry.food</code> attribute **/
	public static final String FOOD = "food";
	/** Qualifier of the <code>RecipeEntry.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>RecipeEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>RecipeEntry.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>RecipeEntry.recipe_cardinality</code> attribute **/
	public static final String RECIPE_CARDINALITY = "recipe_cardinality";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECIPE_CARDINALITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecipeEntry> RECIPE_CARDINALITYHANDLER = new BidirectionalOneToManyHandler<GeneratedRecipeEntry>(
	RecipesConstants.TC.RECIPEENTRY,
	false,
	"recipe_cardinality",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FOOD, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(RECIPE_CARDINALITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public Integer getAmount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public Integer getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.amount</code> attribute. 
	 * @return the amount - Amount
	 */
	public int getAmountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAmount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.amount</code> attribute. 
	 * @return the amount - Amount
	 */
	public int getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final Integer value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final SessionContext ctx, final int value)
	{
		setAmount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final int value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RECIPE_CARDINALITYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.food</code> attribute.
	 * @return the food - Food
	 */
	public Food getFood(final SessionContext ctx)
	{
		return (Food)getProperty( ctx, FOOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.food</code> attribute.
	 * @return the food - Food
	 */
	public Food getFood()
	{
		return getFood( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.food</code> attribute. 
	 * @param value the food - Food
	 */
	public void setFood(final SessionContext ctx, final Food value)
	{
		setProperty(ctx, FOOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.food</code> attribute. 
	 * @param value the food - Food
	 */
	public void setFood(final Food value)
	{
		setFood( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipeEntry.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipeEntry.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.recipe_cardinality</code> attribute.
	 * @return the recipe_cardinality
	 */
	public Recipe getRecipe_cardinality(final SessionContext ctx)
	{
		return (Recipe)getProperty( ctx, RECIPE_CARDINALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.recipe_cardinality</code> attribute.
	 * @return the recipe_cardinality
	 */
	public Recipe getRecipe_cardinality()
	{
		return getRecipe_cardinality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.recipe_cardinality</code> attribute. 
	 * @param value the recipe_cardinality
	 */
	public void setRecipe_cardinality(final SessionContext ctx, final Recipe value)
	{
		RECIPE_CARDINALITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.recipe_cardinality</code> attribute. 
	 * @param value the recipe_cardinality
	 */
	public void setRecipe_cardinality(final Recipe value)
	{
		setRecipe_cardinality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public Unit getUnit(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.unit</code> attribute.
	 * @return the unit - Unit
	 */
	public Unit getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.unit</code> attribute. 
	 * @param value the unit - Unit
	 */
	public void setUnit(final Unit value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
}
