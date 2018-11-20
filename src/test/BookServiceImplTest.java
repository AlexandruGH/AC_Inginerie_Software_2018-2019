package test;

import model.Book;
import org.junit.*;
import repository.book.BookRepositoryMock;
import service.book.BookService;
import service.book.BookServiceImpl;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BookServiceImplTest {

    private static BookService bookService;

    @BeforeClass
    public static void init()
    {
        bookService = new BookServiceImpl(new BookRepositoryMock());
        System.out.println("Before class.");
    }


    @Before
    public void setup()
    {
        System.out.println("Before.");

    }


    @After
    public void clean()
    {
        System.out.println("After");
    }

    @AfterClass
    public static void cleanUp()
    {
        System.out.println("After class");
    }

    @Test
    public void findAll()
    {
        assertEquals(0, bookService.findAll().size());
        System.out.println("find all");

    }

    @Test
    public void findById()
    {
        Long id = 1L;
        assertNull(bookService.findById(id));
        System.out.println("find by id");

    }

    @Test
    public void save(){
        assertTrue(bookService.save(new Book()));
        System.out.println("save");
    }

}
