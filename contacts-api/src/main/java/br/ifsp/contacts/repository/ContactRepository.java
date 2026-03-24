package br.ifsp.contacts.repository;

import br.ifsp.contacts.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//interface repository extende JpaRepository, que fornece metodos prontos
// para acessar e manipular dados de banco de dados
public interface ContactRepository extends JpaRepository<Contact, Long> {
    //metodos aqui se precisar

    List<Contact> findByNomeContainingIgnoreCase(String nome);
}
