/**
 *
 */
/*
 * package de.hybris.platform.recipes.jobs;
 * 
 * import de.hybris.platform.core.model.media.MediaModel; import de.hybris.platform.cronjob.enums.CronJobResult; import
 * de.hybris.platform.cronjob.enums.CronJobStatus; import de.hybris.platform.cronjob.model.CronJobModel; import
 * de.hybris.platform.cuppy.services.RankingData; import de.hybris.platform.jalo.SearchResult; import
 * de.hybris.platform.recipes.model.MenuModel; import de.hybris.platform.recipes.model.RecipeModel; import
 * de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable; import
 * de.hybris.platform.servicelayer.cronjob.PerformResult; import de.hybris.platform.servicelayer.model.ModelService;
 * import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
 * 
 * import java.util.List;
 * 
 * import org.apache.log4j.Logger;
 * 
 * 
 * public class RecipeMenuJob extends AbstractJobPerformable<CronJobModel> {
 * 
 * private ModelService modelService; //private static final Logger LOG = Logger.getLogger(SendRankingJob.class);
 * 
 * @Override public PerformResult perform(final CronJobModel arg0) {
 * 
 * modelService.create(MenuModel.class);
 * 
 * final String fsq = "SELECT {r.PK} FROM {Recipe as r}"; final FlexibleSearchQuery query = new
 * FlexibleSearchQuery(fsq); final SearchResult<RecipeModel> result = (SearchResult<RecipeModel>)
 * flexibleSearchService.search(query); final List<RecipeModel> recipes = result.getResult();
 * 
 * if (recipes.isEmpty()) { //LOG.info("The Recipe List is empty!"); return new PerformResult(CronJobResult.FAILURE,
 * CronJobStatus.FINISHED); }
 * 
 * 
 * 
 * /* for (final RecipeModel recipe : recipes) {
 * 
 * } } }
 */