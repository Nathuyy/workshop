package com.projetos.curso.service;

import com.projetos.curso.model.Category;
import com.projetos.curso.model.Order;
import com.projetos.curso.repository.CategoryRepository;
import com.projetos.curso.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> cat = categoryRepository.findById(id);
        return cat.get();
    }
}
