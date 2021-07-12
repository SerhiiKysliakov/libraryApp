package books.authors.service;

import books.authors.model.Book;
import books.authors.model.dto.BookDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {

    Book create(Book book);

    ResponseEntity<Object> update(Book book, Long id);

    BookDto getById(Long id);

    List<BookDto> getAll();
}
