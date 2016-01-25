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
        ColorfulThing colorThing2 = new ColorfulThing("blue");
        ColorfulThing colorThing3 = new ColorfulThing("green");
        ColorfulThing colorThing4 = new ColorfulThing("orange");
        ColorfulThing colorThing5 = new ColorfulThing("yellow");
        System.out.println(colorThing.getColor());
        System.out.println(colorThing2.getColor());
        System.out.println(colorThing3.getColor());
        System.out.println(colorThing4.getColor());
        System.out.println(colorThing5.getColor());

    }
}
