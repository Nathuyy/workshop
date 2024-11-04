package com.projetos.curso.repository;

import com.projetos.curso.model.Category;
import com.projetos.curso.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
