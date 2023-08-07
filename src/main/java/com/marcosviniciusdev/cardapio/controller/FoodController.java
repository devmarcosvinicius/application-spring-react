package com.marcosviniciusdev.cardapio.controller;

import com.marcosviniciusdev.cardapio.entities.Food;
import com.marcosviniciusdev.cardapio.repository.FoodRepository;
import com.marcosviniciusdev.cardapio.repository.FoodRequestDTO;
import com.marcosviniciusdev.cardapio.repository.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    // Restringir a aplicação quando for para produção apenas para o front.
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        return repository.findAll().stream().map(FoodResponseDTO::new).toList();
    }

    // Restringir a aplicação quando for para produção apenas para o front.
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        repository.save(new Food(data));
    }

}
