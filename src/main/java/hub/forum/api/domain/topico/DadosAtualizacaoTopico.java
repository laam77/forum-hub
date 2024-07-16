package hub.forum.api.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoTopico(

        @NotNull
        Long id,

        String titulo,

        String mensagem,

        LocalDate datacriacao,

        Estado estado) {
}
