package books.authors.model.dto.mapper;

import books.authors.model.Author;
import books.authors.model.dto.AuthorDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper/*(uses = BookMapper.class)*/
public interface AuthorMapper {
    AuthorMapper authorMapper = Mappers.getMapper(AuthorMapper.class);
    AuthorDto fromAuthor(Author author);

    @InheritInverseConfiguration
    Author toAuthor(AuthorDto authorDto);
}
