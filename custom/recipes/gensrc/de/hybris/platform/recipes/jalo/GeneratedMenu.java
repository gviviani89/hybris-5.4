/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 12.09.06                         ---
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
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.recipes.constants.RecipesConstants;
import de.hybris.platform.recipes.jalo.Recipe;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Menu}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMenu extends GenericItem
{
	/** Qualifier of the <code>Menu.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Menu.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Menu.recipes</code> attribute **/
	public static final String RECIPES = "recipes";
	/** Relation ordering override parameter constants for RecipeMenuRelation from ((recipes))*/
	protected static String RECIPEMENURELATION_SRC_ORDERED = "relation.RecipeMenuRelation.source.ordered";
	protected static String RECIPEMENURELATION_TGT_ORDERED = "relation.RecipeMenuRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for RecipeMenuRelation from ((recipes))*/
	protected static String RECIPEMENURELATION_MARKMODIFIED = "relation.RecipeMenuRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMenu.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMenu.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.recipes</code> attribute.
	 * @return the recipes
	 */
	public Collection<Recipe> getRecipes(final SessionContext ctx)
	{
		final List<Recipe> items = getLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPEMENURELATION,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Menu.recipes</code> attribute.
	 * @return the recipes
	 */
	public Collection<Recipe> getRecipes()
	{
		return getRecipes( getSession().getSessionContext() );
	}
	
	public long getRecipesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			RecipesConstants.Relations.RECIPEMENURELATION,
			null
		);
	}
	
	public long getRecipesCount()
	{
		return getRecipesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.recipes</code> attribute. 
	 * @param value the recipes
	 */
	public void setRecipes(final SessionContext ctx, final Collection<Recipe> value)
	{
		setLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPEMENURELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEMENURELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Menu.recipes</code> attribute. 
	 * @param value the recipes
	 */
	public void setRecipes(final Collection<Recipe> value)
	{
		setRecipes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipes. 
	 * @param value the item to add to recipes
	 */
	public void addToRecipes(final SessionContext ctx, final Recipe value)
	{
		addLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPEMENURELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEMENURELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipes. 
	 * @param value the item to add to recipes
	 */
	public void addToRecipes(final Recipe value)
	{
		addToRecipes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipes. 
	 * @param value the item to remove from recipes
	 */
	public void removeFromRecipes(final SessionContext ctx, final Recipe value)
	{
		removeLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPEMENURELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEMENURELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipes. 
	 * @param value the item to remove from recipes
	 */
	public void removeFromRecipes(final Recipe value)
	{
		removeFromRecipes( getSession().getSessionContext(), value );
	}
	
}
