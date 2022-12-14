package springcourse.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springcourse.models.Book;
import springcourse.models.Person;

import java.util.List;
import java.util.Optional;


@Repository
public interface BooksRepository extends JpaRepository<Book, Integer>{
    List<Book> findByOwner(Person owner);
    List<Book> findByTitleStartingWith (String title);

}
