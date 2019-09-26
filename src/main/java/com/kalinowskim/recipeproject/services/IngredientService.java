package com.kalinowskim.recipeproject.services;

import com.kalinowskim.recipeproject.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

}
