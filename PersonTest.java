import pkg.Person;
import java.util.logging.Logger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest{

      @Test
      public void testPerson(){

            Person p = new Person("Mark Soliman", 28, 175, 116, "Hazel", "Male");
            Logger l = Logger.getLogger(Person.class.getName());
      
            l.info("Name: " + p.getName());
            l.info("Age: " + p.getAge());
            l.info("Height: " + p.getHeight());
            l.info("Weight: " + p.getWeight());
            l.info("Eye Color: " + p.getEyeColor());
            l.info("Gender: " + p.getGender());
            assertEquals("Mark Soliman", p.getName());
      }
}