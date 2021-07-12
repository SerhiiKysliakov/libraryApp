package books.authors.model.dto.mapper;

import books.authors.model.Book;
import books.authors.model.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = AuthorMapper.class)
public interface BookMapper {
    BookMapper BOOK_MAPPER = Mappers.getMapper(BookMapper.class);
    @Mapping(source = "books", target = "booksList")
    BookDto fromBook(Book book);
}
