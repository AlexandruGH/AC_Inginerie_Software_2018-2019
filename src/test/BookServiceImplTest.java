package test;

import model.Book;
import org.junit.*;
import repository.BookRepositoryMock;
import service.BookService;
import service.BookServiceImpl;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BookServiceImplTest {

    private BookService bookService;

    @BeforeClass
    public static void init()
    {
        System.out.println("Unit tests are initialized.");
    }


    @Before
    public void setup()
    {
        bookService = new BookServiceImpl(new BookRepositoryMock());
        System.out.println("Setup before each execution.");
    }


    @Before
    public void clean()
    {
        System.out.println("Clean after each execution.");
    }

    @AfterClass
    public static void cleanUp()
    {
        System.out.println("Unit tests are cleaned up.");
    }

    @Test
    public void findAll()
    {
        assertEquals(0, bookService.findAll().size());
    }

    @Test
    public void findById()
    {
        Long id = 1L;
        assertNull(bookService.findById(id));
    }

    @Test
    public void save(){
        assertTrue(bookService.save(new Book()));
    }

}
