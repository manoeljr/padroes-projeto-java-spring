package one.digitalinnovation.gof.model;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @JoinColumn(name = "endereco_ID")
    @ManyToOne
    private Endereco Endereco;

    public Cliente() {}

    public Cliente(Long id, String nome, one.digitalinnovation.gof.model.Endereco endereco) {
        this.id = id;
        this.nome = nome;
        Endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }
}
