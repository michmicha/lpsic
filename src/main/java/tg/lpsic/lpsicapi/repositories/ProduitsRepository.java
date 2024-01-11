/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tg.lpsic.lpsicapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tg.lpsic.lpsicapi.models.Produits;

/**
 *
 * @author kmaco
 */
public interface ProduitsRepository extends MongoRepository<Produits, String>{
    Produits findProduitsById(String produitsId);
}
