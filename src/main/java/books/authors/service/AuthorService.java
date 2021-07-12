package books.authors.service;

import books.authors.model.Author;
import books.authors.model.dto.AuthorDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AuthorService {
    Author create(Author author);

    ResponseEntity<Object> update(Author author, Long id);

    List<AuthorDto> getAll();

    AuthorDto getById(Long id);

    List<AuthorDto> getByBookTitle(String title);
}
