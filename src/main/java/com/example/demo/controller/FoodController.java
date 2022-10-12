package com.example.demo.controller;

import com.example.demo.entity.FoodEntity;
import com.example.demo.service.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<FoodEntity> getAllFoods() {
        return foodService.findAll();
    }
}
