package com.project.ecommerce.store.repositories;

import com.project.ecommerce.store.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String>
{
}
