package com.kalinowskim.recipeproject.services;

import com.kalinowskim.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getAllRecipes();
}
