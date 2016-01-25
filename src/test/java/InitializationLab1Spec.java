import com.sun.org.apache.xml.internal.security.Init;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Taylor on 1/25/16.
 */
public class InitializationLab1Spec {
    ColorfulThing init1;

    @Before
    public void assets(){
        init1 = new ColorfulThing("red"); //this test object
    }

    @Test
            public void getColorTest(){
        //insert sample input, call method on test obj
        assertEquals("getColor will return the color red","red",init1.getColor());
    }




}
