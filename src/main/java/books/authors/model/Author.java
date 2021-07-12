package books.authors.model;

import lombok.Data;

import java.util.List;
import javax.persistence.*;

@Data
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> books;
}
