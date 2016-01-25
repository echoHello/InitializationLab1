import java.lang.reflect.Array;

/**
 * Created by Taylor on 1/20/16.
 */

class BoringThing {
    }

class ColorfulThing {
        String color; //what is passed in will be stored here


        public ColorfulThing(String theColor) {

            this.color = theColor; // because I set theColor equal to this.color.
        }

        public String getColor() {

            return color;
        }


    }

public class InitializationLab1 {
    public static void main(String[] args) {
        ColorfulThing colorThing = new ColorfulThing("red");
        System.out.println(colorThing.getColor());
    }
}
