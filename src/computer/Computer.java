package computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor_type;
    private int ram_size;
    private int hard_disk_space;

    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i3", 8, 80);
        System.out.println("Если хотите включить компьютер нажмите 1!" +
                " Если хотите посмотреть характеристики компьютера нажмите 2!" +
                "Если хотите включить компьютер нажмите 3! \r");
        int n = scannerInt();
        if (n < 1 && n > 4) {
            System.out.println("Введите правильно цифру (от 1 до 3)! \r");
        }
        switch (n){
            case 1:
                turningOn(computer);
                break;
            case 2:
                outPut(computer);
                break;
            case 3:
                shutDown(computer);
                break;
            default:
                System.out.println("Wrong number entered!");
        }
    }

    public Computer(String processor_type, int ram_size, int hard_disk_space) {
        this.processor_type = processor_type;
        this.ram_size = ram_size;
        this.hard_disk_space = hard_disk_space;
    }

    public static void outPut (Computer t) {
        System.out.println("Тип процессора " + t.processor_type + " Объем оперативной памяти " + t.ram_size
                + " Объем жесткого диска " + t.hard_disk_space);
    }

    public static void turningOn (Computer t) {
        int n = scannerInt();
        if (n < 0 && n > 1) {
            System.out.println("Введите правильно цифру (от 0 до 1)! \r");
        }
        Random ran = new Random();
        int random = ran.nextInt(2);
        if (n == random)
            System.out.println("Компьютер включен!");
        else
            System.out.println("Компьютер сгорел!");
    }

    public static void shutDown (Computer t) {
        int n = scannerInt();
        if (n < 0 && n > 1) {
            System.out.println("Введите правильно цифру (от 0 до 1)! \r");
        }
        Random ran = new Random();
        int random = ran.nextInt(1);
        if (n == random)
            System.out.println("Компьютер выключен!");
        else
            System.out.println("Компьютер сгорел!");
    }

    public static int scannerInt() {


        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Введите цифру: \r");

        while(!in.hasNextInt()) {

            in.next();

            System.out.println("Введите правильно цифру! \r");
        }

        number = in.nextInt();

        return number;

    }
}
