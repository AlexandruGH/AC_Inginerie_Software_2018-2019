package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepositoryMock implements BookRepository {

    private List<Book> books;

    public BookRepositoryMock() {
        books = new ArrayList<>();
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(Long id) {
        List<Book> filteredBooks = books.parallelStream()
                .filter(i -> i.getId().equals(id))
                .collect(Collectors.toList());
        if (filteredBooks.size() > 0) {
            return filteredBooks.get(0);
        }

        return null;
    }

    @Override
    public boolean save(Book book) {
        return books.add(book);
    }

    @Override
    public void removeAll() {
        books.clear();
    }
}
