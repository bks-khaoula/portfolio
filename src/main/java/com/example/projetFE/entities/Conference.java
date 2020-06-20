package com.example.projetFE.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Conference implements Serializable {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String categorie;
    private String description;
    private String site;
    private String email;
    private String image;
    private Boolean acceptation;

    @Temporal(TemporalType.DATE)
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    private Date date_fin;
    @OneToMany(mappedBy = "conference" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection <Localisation> localisations;
    @OneToMany(mappedBy = "conference",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection <Comite> comites;
    @OneToMany(mappedBy = "conference",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Collection<Planning> plannings;



    public Conference(Object o, String rida, String el, String maza, String image, Date parse, Date parse1, Object o1) {
    }
}