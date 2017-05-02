/**
 *
 */
package de.hybris.platform.recipes.interceptors;

import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;


public class RecipeTimePrepareInterceptor implements PrepareInterceptor<RecipeModel>
{


	@Override
	public void onPrepare(final RecipeModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		final int i = 10;
		final int t = arg0.getTime().intValue();
		final Integer s = Integer.valueOf(t + i);
		arg0.setTime(s);
	}

}
