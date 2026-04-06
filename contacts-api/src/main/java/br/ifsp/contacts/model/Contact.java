package br.ifsp.contacts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// classe modelo de dados para contatos
@Entity //indica que o objeto será mapeado para uma tabela
public class Contact {

    @Id //indica que o campo é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera um valor unico para o campo
    private Long id;

    @NotBlank(message = "O campo nome não pode estra vazio")
    private String nome;

    @NotBlank(message = "O campo telefone não pode estar vazio")
    @Size(min = 8, max = 15, message = "O telefone deve ter entre 8 e 15 caracteres")
    private String telefone;

    @NotBlank(message = "O campo email não pode estar vazio")
    @Email(message = "Digite um email válido")
    private String email;

    public Contact() {//metodo contrutor vazio exigido pelo JPA
    }

    public Contact(String nome, String telefone, String email) { //contrutor para criação de objetos
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    //metodos getters e setters
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
