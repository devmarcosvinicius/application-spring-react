package com.marcosviniciusdev.cardapio.repository;

import com.marcosviniciusdev.cardapio.entities.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
