package books.authors.controller;

import books.authors.model.Book;
import books.authors.model.dto.BookDto;
import books.authors.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<BookDto> getAllBooks() {
        return bookService.getAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateBook(@RequestBody Book book, Long id) {
        return bookService.update(book, id);
    }
}
