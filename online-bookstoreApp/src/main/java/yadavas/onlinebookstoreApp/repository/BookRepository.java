package yadavas.onlinebookstoreApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import yadavas.onlinebookstoreApp.entity.Book;

@RepositoryRestResource(collectionResourceRel="books",path="books")
public interface BookRepository extends JpaRepository<Book,Long> {

}
