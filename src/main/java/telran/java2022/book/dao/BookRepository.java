package telran.java2022.book.dao;

import org.springframework.data.repository.CrudRepository;
import telran.java2022.book.model.Author;
import telran.java2022.book.model.Book;
import telran.java2022.book.model.Publisher;

import java.util.Set;
import java.util.stream.Stream;

public interface BookRepository extends CrudRepository<Book, String> {

//    @Query("select b from Book b join Author a where a.name = ?1")
    Stream<Book> findAllByAuthorsIsIn(Set<Author> authors);

    Stream<Book> findBooksByPublisher(Publisher publisher);





}
