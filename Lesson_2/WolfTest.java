public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.nickname = "Полкан";
        wolfOne.weight = 100;
        wolfOne.age = 10;
        wolfOne.color = "grey";

        System.out.println("Пол = " + wolfOne.gender);
        System.out.println("Кличка = " + wolfOne.nickname);
        System.out.println("Вес = " + wolfOne.weight);
        System.out.println("Возраст = " + wolfOne.age);
        System.out.println("Окрас = " + wolfOne.color);

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}