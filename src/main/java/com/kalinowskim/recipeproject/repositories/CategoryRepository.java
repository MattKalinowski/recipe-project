package com.kalinowskim.recipeproject.repositories;

import com.kalinowskim.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
