package dev.jaiane.CadastroDePessoas.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

//Entity transforma uma classe em entidade do DB
@Entity
@Table(name= "tb_cadastro")
public class PessoaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int idade;


    public PessoaModel() {

    }


}




