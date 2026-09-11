package com.estagio.mediaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal (ponto de entrada) da aplicacao.
 * O metodo main() sobe um servidor web embutido (Tomcat) na porta 8080.
 */
@SpringBootApplication
public class MediaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaServiceApplication.class, args);
    }
}
