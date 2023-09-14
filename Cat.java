public class Cat {
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;


    String name;

    int age;

    int livesRemaining;

    String catSound;

    public Cat (String name){
        this.name = name;
    }
    public Cat (){
        this.name = "Not named";
    }
    public void meow() {
        System.out.println("\n Meow" + catSound);

    }
}