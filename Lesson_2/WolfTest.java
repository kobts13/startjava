public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("male");
        wolfOne.setNickname("Полкан");
        wolfOne.setWeight(100);
        wolfOne.setAge(10);
        wolfOne.setColor("grey");

        System.out.println("Пол = " + wolfOne.getGender());
        System.out.println("Кличка = " + wolfOne.getNickname());
        System.out.println("Вес = " + wolfOne.getWeight());
        System.out.println("Возраст = " + wolfOne.getAge());
        System.out.println("Окрас = " + wolfOne.getColor());

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}