package books.authors.model;

import lombok.Data;

import java.util.List;
import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors;
}
