package books.authors.dao;

import books.authors.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    Book create(Book book);

    Book update(Book book);

    Optional<Book> getById(Long id);

    List<Book> getAll();
}
