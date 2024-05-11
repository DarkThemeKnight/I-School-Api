package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query to find books by title
    List<Book> findByTitle(String title);

    // Custom query to find books by author
    List<Book> findByAuthor(String author);

    // Custom query to find books published in a specific year
    List<Book> findByPublicationYear(int publicationYear);

    // Custom query to find books by ISBN
    Book findByIsbn(String isbn);

    // Add more custom query methods if needed...
}
