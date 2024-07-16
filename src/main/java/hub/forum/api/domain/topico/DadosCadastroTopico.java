package hub.forum.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroTopico(

        @NotNull
        Long id,

        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotNull
        LocalDate datacriacao,

        @NotNull
        Estado estado,

        @NotBlank
        String autor,

        @NotBlank
        String curso) {
}
