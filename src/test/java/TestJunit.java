import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;


import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@spring-boot-starter-test
public class TestJunit{

    public static String str;
    public static double d;
    @BeforeClass
    public static void before(){
        d = 3.2;
        str = "2015100000140";
        System.out.println("shihab");
    }

    @Test
    public void testAdd1(){
    System.out.println(d);
        String temp = null;
        assertEquals(str, "2015100000140");
        int num = 5;
        assertFalse(num > 6);
        assertTrue(num == 5);
        assertNotNull(str);
        assertNull(temp);
        assertThat(str).startsWith("20").endsWith("40");
        assertThat(str).as("Shihab id is: %s", str).isEqualTo("2015100000140");
        assertThat(d).isGreaterThan(3.21);
        //assertThatThrownBy(() -> { throw new Exception("boom!"); }).hasMessage("boom!");
        //fail("temp is null!");
        //System.out.println(this.getName());
        //System.out.println(this.countTestCases());
    }

    @Test
    public void testAdd2(){
        //System.out.println(this.getName());
        //System.out.println(this.countTestCases());
    }

    @Test
    public void testAdd3(){
          System.out.println(this.countTestCases());
        System.out.println(this.getName());
        System.out.println(this.countTestCases());
    }
    @AfterClass
    public static void t(){
        System.out.println("shihab");
    }

}
