/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.lpsic.lpsicapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kmaco
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produits {
    @Id
    private String id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    private Categorie categorie;
}
