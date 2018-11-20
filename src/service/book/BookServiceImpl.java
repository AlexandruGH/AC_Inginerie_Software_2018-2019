package service.book;

import model.Book;
import repository.book.BookRepository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository aBookRepository)
    {
        bookRepository = aBookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public boolean save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public int getAgeOfBook(Long id) {
        Book book = findById(id);
        Date publishedDate = book.getPublishedDate();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(publishedDate);

        int yearOfPublishing = calendar.get(Calendar.YEAR);
        calendar.setTime(new Date());
        int yearToday = calendar.get(Calendar.YEAR);

        return yearToday - yearOfPublishing;

    }
}
