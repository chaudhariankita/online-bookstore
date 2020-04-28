package in.ankitachaudhari.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankitachaudhari.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
