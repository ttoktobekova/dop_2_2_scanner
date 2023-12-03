import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возрасть:");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("Введите температуру");

            if ((scanner.hasNextInt())){
                int temperature = scanner.nextInt();
                getDic(age, temperature);}
            else {
                System.out.println("Noooo");
            }

        } else {
            System.out.println("Ошибка введен не коректное значение");
        }
        scanner.close();
    }

    public static void getDic(int age, int temp) {
        String result = getRecommendation(age, temp);
        System.out.println("Result: " + result);
    }

    public static String getRecommendation(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}