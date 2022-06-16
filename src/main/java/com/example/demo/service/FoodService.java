package com.example.demo.service;

import com.example.demo.entity.FoodEntity;
import com.example.demo.repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    public Iterable<FoodEntity> findAll() {
        return foodRepository.findAll();
    }
}
