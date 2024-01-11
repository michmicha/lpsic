/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.lpsic.lpsicapi.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kmaco
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
    @Id
    private String id;
    private String nom;
    private String description;
    @DBRef
    private List<Produits> prodList;
}
