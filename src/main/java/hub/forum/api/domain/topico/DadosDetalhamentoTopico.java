package hub.forum.api.domain.topico;

import java.time.LocalDate;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDate datacriacao, Estado estado, String autor, String curso) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDatacriacao(), topico.getEstado(), topico.getAutor(), topico.getCurso());
    }
}
