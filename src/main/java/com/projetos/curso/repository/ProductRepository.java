package com.projetos.curso.repository;

import com.projetos.curso.model.Category;
import com.projetos.curso.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
