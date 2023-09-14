import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my Cat Program! ");

        Cat myCat = new Cat();

        myCat.name = "Felix";
        myCat.age = 3;
        myCat.catSound = "GGRRR";

        ArrayList<Cat> catList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Cat cat = new Cat("Cat" + i+1);
            catList.add(cat);

            System.out.println(" My new cat's name is: "+ myCat.name);
            myCat.meow();

        }




    }
}