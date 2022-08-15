import org.junit.jupiter.api.*;

public class Firsttest {
    @BeforeAll
    static void beforeall() {
        System.out.println("This is before method");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("This is after all methods!");
    }



    @BeforeEach
    void openGoogle() {
        System.out.println("open https://www.google.com/search?q=google&rlz=1C1GCEA_enUA988UA988&oq=google&aqs=chrome..69i57j46i131i199i433i465i512j0i131i433i512l2j69i60l4.3336j0j7&sourceid=chrome&ie=UTF-8");
    }
    @AfterEach
   void takeScreen() {
        //takescreen
        System.out.println("takeScreen();");}
    @Test
    void firsttest() {
        System.out.println("first test() ");
        Assertions.assertTrue(true);

    }
@Test
    void secondtest() {
        System.out.println("second test()");
        Assertions.assertTrue(true);
    }

}
