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
import tg.lpsic.lpsicapi.models.Categorie;
import tg.lpsic.lpsicapi.repositories.CategorieRepository;

/**
 *
 * @author kmaco
 */
@RestController
@RequestMapping("categorie")
public class CategorieController {

    @Autowired
    private CategorieRepository categorieRepository;

    @GetMapping(value = "/")
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @PostMapping(value = "/create")
    public Categorie addCategorie(@RequestBody Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @GetMapping(value = "/{categorieId}")
    public Categorie getCategorieById(@PathVariable String categorieId) {
        return categorieRepository.findCategorieById(categorieId);
    }

    @PutMapping(value = "/update/{categorieId}")
    public Categorie updateCategorie(@PathVariable String categorieId, @RequestBody Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @DeleteMapping(value = "/delete/{categorieId}")
    public void deleteCategorie(@PathVariable String categorieId) {
        categorieRepository.deleteById(categorieId);
    }

}
