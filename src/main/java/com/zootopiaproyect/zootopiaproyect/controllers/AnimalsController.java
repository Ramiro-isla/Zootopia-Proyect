package com.zootopiaproyect.zootopiaproyect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopiaproyect.zootopiaproyect.models.Animals;

@RestController
@RequestMapping(path = "/api")

public class AnimalsController {

    @GetMapping(value = "/animals")
    public Animals index() {
        Animals animals = new Animals("Doraemon", "cat", "gato cosmico", "indefinido", 2022);
        return animals;

    }

}
