public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 28;
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        }

        boolean male = true;
        if (male) {
            System.out.println("Мужской пол");
        }

        if (!male) {
            System.out.println("Женский пол");
        }

        double height = 1.77;
        if (height < 1.80) {
            System.out.println("Низкий рост");
        } else {
            System.out.println("Высокий рост");
        }

        char firstLetterName = 'S';
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается с 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается с 'I'");
        } else {
            System.out.println("Имя начинается с другой буквы");
        }
    }
}