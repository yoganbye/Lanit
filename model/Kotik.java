package model;


public class Kotik {
    private static int numObject = 0;

    public static int getNumObject() {
        return numObject;
    }

    private int satiety;
    private String name;
    private String meow;
    private int weight;
    private int prettiness;

    {
        satiety = 0;
        name = "Undefined";
        meow = "Undefined";
        weight = 0;
        prettiness = 0;
    }

    public Kotik() {
        numObject++;
    }

    public Kotik (int prettiness, String name, String meow, int weight, int satiety) {
        this.prettiness += prettiness;
        this.name = name;
        this.meow = meow;
        this.weight = weight;
        this.satiety = satiety;
        numObject++;
    }

    public void setKotik(int prettiness, String name, String meow, int weight) {
        this.prettiness += prettiness;
        satiety = 3;
        this.name = name;
        this.meow = meow;
        this.weight = weight;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }
    
    public int getWeight() {
        return weight;
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int random = 1 + (int) (Math.random() * 5);
            if (satiety <= 0) {
                switch (random){
                    case 1,2: eat(4); break;
                    case 3,4: eat(5, "вискас"); break;
                    default: eat();
                }
            }
            switch (random) {
                case 1: play(); break;
                case 2: eat(); break;
                case 3: sleep(); break;
                case 4: chaseMouse(); break;
                default: purs();
            }
        }
    }

    private void play() {
        // method #1
        System.out.println("Cat playing");
        System.out.println("Satiety: " + satiety + "\n");
    }

    private void eat(int foodValue) {
        // method #2
        satiety += foodValue; 
        System.out.println("Cat eating " + "\nSatiety: " + satiety + "\n");      
    }

    private void eat(int foodValue, String food) {
        // method #2
        satiety += foodValue; 
        System.out.println("Cat eating " + food + "\nSatiety: " + satiety + "\n");   
    }

    private void eat() {
        // method #2
        eat(6, "мясо");
    }    

    private void sleep() {
        // method #3
        satiety -= 2;
        System.out.println("Cat sleeping"); 
        System.out.println("Satiety: " + satiety + "\n");
    }

    private void chaseMouse() {
        // method #4
        satiety -= 3;
        System.out.println("Cat chase mouse");
        System.out.println("Satiety: " + satiety + "\n");
    }

    private void purs() {
        // method #5
        satiety -= 1;
        System.out.println("Cat pursing");
        System.out.println("Satiety: " + satiety + "\n");
    }
    
}
