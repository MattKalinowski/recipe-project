package com.kalinowskim.recipeproject.repositories;

import com.kalinowskim.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
