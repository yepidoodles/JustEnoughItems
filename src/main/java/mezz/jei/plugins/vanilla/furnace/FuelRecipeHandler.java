package mezz.jei.plugins.vanilla.furnace;

import javax.annotation.Nonnull;

import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class FuelRecipeHandler implements IRecipeHandler {
	@Nonnull
	@Override
	public Class getRecipeClass() {
		return FuelRecipe.class;
	}

	@Nonnull
	@Override
	public Class<? extends IRecipeCategory> getRecipeCategoryClass() {
		return FurnaceRecipeCategory.class;
	}

	@Override
	public IRecipeWrapper getRecipeWrapper(@Nonnull Object recipe) {
		return (FuelRecipe) recipe;
	}

}