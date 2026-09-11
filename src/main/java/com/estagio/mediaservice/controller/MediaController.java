package com.estagio.mediaservice.controller;

import com.estagio.mediaservice.dto.AlunoRequest;
import com.estagio.mediaservice.dto.AlunoResponse;
import com.estagio.mediaservice.service.MediaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Controller: camada responsável por expor os endpoints HTTP.
 * @RestController = @Controller + @ResponseBody (retorna JSON direto, sem view).
 */
@RestController
@RequestMapping("/api")
public class MediaController {

    // Injeção de dependência via construtor (o Spring cria e entrega
    // a instância de MediaService automaticamente).
    private final MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    /**
     * Endpoint 1 - Calcular média
     * POST /api/alunos/media
     * Body (JSON): { "nome": "Maria", "nota1": 7.5, "nota2": 6.0 }
     */
    @PostMapping("/alunos/media")
    public AlunoResponse calcularMedia(@Valid @RequestBody AlunoRequest request) {
        return mediaService.calcularMedia(request);
    }

    /**
     * Endpoint 2 - Consulta de data e hora local
     * GET /api/data-hora
     */
    @GetMapping("/data-hora")
    public String consultarDataHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
