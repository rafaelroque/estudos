package tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
   @Test//from  w w w .  ja  v  a2 s.  c o m
   public void testAdd() {
      String str= "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}