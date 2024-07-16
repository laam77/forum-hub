package hub.forum.api.domain.topico;

import java.time.LocalDate;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDate datacricao, Estado estado, String autor, String curso) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDatacriacao(), topico.getEstado(), topico.getAutor(), topico.getCurso());
    }
}
