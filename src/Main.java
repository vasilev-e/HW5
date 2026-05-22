//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//Задача 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else {
            System.out.println("ОС не выбрана!");
        }
        //Задача 2
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else {
            System.out.println("Установите облегченную версию приложения для " + (clientOS == 1 ? "Android" : "iOS") + " по ссылке");
        }
        //Задача 3
        int year = 2021;
        if ( year < 1584) {
            System.out.println( year + " год не является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");}
        else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 95;
        int deliveryTimeZone1 = 1;
        int deliveryTimeZone2 = deliveryTimeZone1 + 1;
        int deliveryTimeZone3 = deliveryTimeZone2 + 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTimeZone1);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + (deliveryDistance < 60 ? deliveryTimeZone2 : deliveryTimeZone3));
        }
        //Задача 5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " +  monthNumber + " принадлежит сезону: " + "Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " +  monthNumber + " принадлежит сезону: " + "Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " +  monthNumber + " принадлежит сезону: " + "Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " +  monthNumber + " принадлежит сезону: " + "Осень");
            default:

        }
    }
}