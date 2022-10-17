import com.company.Animal;
import com.company.Eagle;
import com.company.Shark;
import com.company.Turtle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[]animals = {new Shark(),new Turtle(),new Eagle()};
        for (Animal animal : animals){
            if(animal instanceof Shark){
                ((Shark) animal).attack();
            } else if (animals.getClass().getName().equals("com.company")) {
                ((Turtle) animal).swim();
            } else if (animals.getClass().getName().equals("com.company")) {
                ((Eagle) animal).fly();
            }

        }
        Shark[]sharks = { new Shark()};
        Turtle [] turtles ={new Turtle()};
        Eagle[] eagles = {new Eagle()};
        for (Turtle turtle : turtles){
            turtle.swim();

        }
        for (Eagle eagle : eagles){
            eagle.fly();
        }

    }
}