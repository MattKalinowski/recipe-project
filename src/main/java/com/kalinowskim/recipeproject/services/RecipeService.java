package com.kalinowskim.recipeproject.services;

import com.kalinowskim.recipeproject.commands.RecipeCommand;
import com.kalinowskim.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getAllRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long id);
}
