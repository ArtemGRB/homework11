

public class Main {

    //Задание 1
    public static void checkYear(int year) {
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год является високосным\n");
        } else {
            System.out.println(year + " год не является високосным\n");
        }
    }

    //Задание 2
    public static void printInstallApp(int typeOS, int releaseYear) {

        if (releaseYear < 2015 && typeOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        }
        if (releaseYear < 2015 && typeOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }
        if (releaseYear >= 2015 && typeOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        }
        if (releaseYear >= 2015 && typeOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }
    }

    //Задание 3
    public static int willDeliveryDays(int deliveryDistance) {

        byte deliveryDays = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        if (deliveryDistance > 100) {
            deliveryDays = 0;
            System.out.println("Свыше 100 км доставки нет");
        }
        if (deliveryDays != 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        return deliveryDays;
    }

    public static void main(String[] args) {

        // задание 1
        System.out.println("-------Задание 1------");
        checkYear(2004);

        //Задание 2
        System.out.println("-------Задание 2------");
        printInstallApp(1, 2024);

        //Задание 3
        System.out.println("-------Задание 3------");
        System.out.println(willDeliveryDays(95));

    }
}