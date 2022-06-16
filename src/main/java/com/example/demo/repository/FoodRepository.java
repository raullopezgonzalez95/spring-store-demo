package com.example.demo.repository;

import com.example.demo.entity.FoodEntity;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<FoodEntity, Integer> {
}
