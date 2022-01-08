package com.joao.myfirstapi.model;

import lombok.Data;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@Entity
public class Locacao {
    @Id
    @Column(name = "id_locacao", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocacao;

    private Date dataLocacao;

    @Column(nullable = false)
    private Time horaLocacao;

    @Column
    private Date dataDevolucao;

    private Time horaDevolucao;

    private Long quilometragemLocacao;
    private Long quilometragemDevolucao;
    private double valorCaucao;
    private double valorLocacao;
    private boolean locacaoDevolvida;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
