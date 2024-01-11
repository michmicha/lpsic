/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tg.lpsic.lpsicapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tg.lpsic.lpsicapi.models.Categorie;

/**
 *
 * @author kmaco
 */
public interface CategorieRepository extends MongoRepository<Categorie, String>{
    Categorie findCategorieById(String categorieId);
}
