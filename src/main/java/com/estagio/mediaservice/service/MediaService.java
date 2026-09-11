package com.estagio.mediaservice.service;

import com.estagio.mediaservice.dto.AlunoRequest;
import com.estagio.mediaservice.dto.AlunoResponse;
import org.springframework.stereotype.Service;

/**
 * Service: camada responsável pela REGRA DE NEGÓCIO.
 * O Controller não deve calcular nada sozinho — ele apenas recebe a
 * requisição e delega o trabalho para o Service. Essa separação de
 * responsabilidades é uma boa prática (e também é POO: cada classe
 * tem uma única responsabilidade).
 */
@Service
public class MediaService {

    private static final double NOTA_DE_CORTE = 5.0;

    public AlunoResponse calcularMedia(AlunoRequest request) {
        double media = (request.getNota1() + request.getNota2()) / 2.0;

        String mensagem;
        if (media > NOTA_DE_CORTE) {
            mensagem = String.format("Parabéns %s, você foi aprovado.", request.getNome());
        } else if (media < NOTA_DE_CORTE) {
            mensagem = String.format("%s, você foi reprovado.", request.getNome());
        } else {
            mensagem = String.format("%s, você não atingiu a nota de corte e ficou de exame.", request.getNome());
        }

        return new AlunoResponse(request.getNome(), media, mensagem);
    }
}
