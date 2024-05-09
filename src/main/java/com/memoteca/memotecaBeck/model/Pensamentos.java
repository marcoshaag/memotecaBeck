package com.memoteca.memotecaBeck.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pensamentos")
public class Pensamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "conteudo")
    public String conteudo;

    @Column(name = "autoria")
    public String autoria;
}
