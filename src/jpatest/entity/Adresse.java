/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpatest.entity;

import javax.persistence.Embeddable;

/**
 *
 * @author admin
 */
@Embeddable
public class Adresse {
    
    private String rue;
    private Integer num;
    private Integer codePostal;
    private String ville;
    private String pays;

    public Adresse(String rue, Integer num, Integer codePostal, String ville, String pays) {
        this.rue = rue;
        this.num = num;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public Adresse() {
    }

    
    
    @Override
    public String toString() {
        return "Adresse{" + "rue=" + rue + ", num=" + num + ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + '}';
    }
    
    
            
}
