


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Class1 {

Class2 c2;

@BeforeEach
void testsetUp()
{
    c2= new Class2();
}

@Test
void test2Char()
{
  testsetUp();
 String actual = c2.swap("AB");
 assertEquals("BA",actual);
}

@Test 
void test4Chars()
{
 testsetUp();
 String actual = c2.swap("ABCD");
 assertEquals("ABDC",actual);
}

}
