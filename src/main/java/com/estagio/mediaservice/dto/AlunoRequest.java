package com.estagio.mediaservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * DTO (Data Transfer Object): uma classe simples que so existe para
 * representar os dados que chegam no corpo (body) da requisicao JSON.
 *
 * Exemplo de JSON esperado:
 * {
 *   "nome": "Maria",
 *   "nota1": 7.5,
 *   "nota2": 6.0
 * }
 *
 * O Spring converte (deserializa) o JSON recebido automaticamente para
 * um objeto desta classe.
 */
public class AlunoRequest {

    @NotBlank(message = "O nome do aluno é obrigatório")
    private String nome;

    @NotNull(message = "A nota1 é obrigatória")
    private Double nota1;

    @NotNull(message = "A nota2 é obrigatória")
    private Double nota2;

    // Construtor vazio (obrigatório para o Spring/Jackson conseguir criar o objeto)
    public AlunoRequest() {
    }

    public AlunoRequest(String nome, Double nota1, Double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters e Setters: forma clássica de encapsulamento em Java.
    // Os atributos ficam 'private' e só são acessados por estes métodos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}
