package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
	private String descricao;
	private boolean concluida;
	private Descricao detalhes;

    @ManyToOne
    @JoinColumn (name="cliente_id")
    private Cliente cliente;
}