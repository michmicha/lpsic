/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.lpsic.lpsicapi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tg.lpsic.lpsicapi.models.Produits;
import tg.lpsic.lpsicapi.repositories.ProduitsRepository;

/**
 *
 * @author kmaco
 */
@RestController
@RequestMapping("produits")
public class ProduitsController {
    @Autowired
    private ProduitsRepository produitsRepository;

    @GetMapping(value = "/")
    public List<Produits> getAllProduits() {
        return produitsRepository.findAll();
    }

    @PostMapping(value = "/create")
    public Produits addProduit(@RequestBody Produits produits) {
        return produitsRepository.save(produits);
    }

    @GetMapping(value = "/{produitsId}")
    public Produits getProduitById(@PathVariable String produitsId) {
        return produitsRepository.findProduitsById(produitsId);
    }

    @PutMapping(value = "/update/{produitsId}")
    public Produits updateProduit(@PathVariable String produitsId, @RequestBody Produits produits) {
        return produitsRepository.save(produits);
    }

    @DeleteMapping(value = "/delete/{produitsId}")
    public void deleteProduit(@PathVariable String produitsId) {
        produitsRepository.deleteById(produitsId);
    }
}
