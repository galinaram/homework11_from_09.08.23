class Homework {
    public static void leapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOS (int clientOS, int clientDeviceYear) {
        int currentYear = 2023;
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else {
            System.out.println("Приложение недоступно для данной скачивания");
        }
    }
    public static int countDeliveryTime (int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        }
        else if (deliveryDistance < 60) {
            return 2;
        }
        else if (deliveryDistance < 100) {
            return 3;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1:");
        int year = 1999;
        leapYear(year);
    }
    public static void task2() {
        System.out.println("Задание 2:");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkOS(clientOS, clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задание 3:");
        int deliveryDistance = 95;
        int deliveryTime;
        deliveryTime = countDeliveryTime(deliveryDistance);
        if (deliveryTime==0) {
            System.out.println("Доставки нет");
        }
        else {
            System.out.println("Доставка займет " + deliveryTime + " дней");
        }
    }
}