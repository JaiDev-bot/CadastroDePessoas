package dev.jaiane.CadastroDePessoas;



import jakarta.persistence.*;


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


    public PessoaModel(){

    }

    public PessoaModel(String name, String email, int idade){

        this.name = name;
        this.email = email;
        this.idade = idade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


