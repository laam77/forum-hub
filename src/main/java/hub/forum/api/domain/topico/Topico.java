package hub.forum.api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDate datacriacao;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private String autor;
    private String curso;

    private Boolean ativo;

    public Topico(DadosCadastroTopico dados) {
        this.ativo = true;
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.datacriacao = dados.datacriacao();
        this.estado = dados.estado();
        this.autor = dados.autor();
        this.curso = dados.curso();
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {

        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.datacriacao() != null) {
            this.datacriacao = dados.datacriacao();
        }
        if (dados.estado() != null) {
            this.estado = dados.estado();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
