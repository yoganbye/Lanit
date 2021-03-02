import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik tomas = new Kotik("Tomas", "skrt meow", 2, 1);
        Kotik richard = new Kotik();
        richard.setKotik("Richard", "grrrr meow", 3);
        tomas.liveAnotherDay();
        System.out.println("Имя котика: " + tomas.getName() );
        System.out.println("Масса котика: " + tomas.getWeight());

    }
}
