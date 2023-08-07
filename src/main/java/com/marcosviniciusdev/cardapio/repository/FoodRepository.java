package com.marcosviniciusdev.cardapio.repository;

import com.marcosviniciusdev.cardapio.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
