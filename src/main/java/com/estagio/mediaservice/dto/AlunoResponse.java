package com.estagio.mediaservice.dto;

/**
 * DTO de resposta: o que devolvemos para quem chamou o endpoint.
 */
public class AlunoResponse {

    private String nome;
    private Double media;
    private String mensagem;

    public AlunoResponse() {
    }

    public AlunoResponse(String nome, Double media, String mensagem) {
        this.nome = nome;
        this.media = media;
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
