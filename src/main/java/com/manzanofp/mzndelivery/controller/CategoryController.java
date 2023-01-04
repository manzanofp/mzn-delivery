package com.manzanofp.mzndelivery.controller;

import com.manzanofp.mzndelivery.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public List<Category> hello(){

        Category cat = new Category(1L,"Informática");
        Category cat2 = new Category(2L,"Escritório");

        List<Category> list = new ArrayList<>();
        list.add(cat);
        list.add(cat2);

        return list;
    }


}
