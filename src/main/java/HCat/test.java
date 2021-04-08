package HCat;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Plate plate = new Plate(30);
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Снежок", 10 + (int) (Math.random() * 30));
        cats[1] = new Cat("Дымок", 10 + (int) (Math.random() * 30));
        cats[2] = new Cat("Прыгун", 10 + (int) (Math.random() * 30));
        cats[3] = new Cat("Обжора", 10 + (int) (Math.random() * 30));
        cats[4] = new Cat("Злюка", 10 + (int) (Math.random() * 30));


        while (true) {
            System.out.println("1 - Покормить; 2 - Наполнить миску; 0 - Выйти;" );
            String command = in.next();
            switch (command) {
                case "1":
                    for (Cat cat : cats) {
                        cat.eat(plate);
                    }
                    break;
                case "2":
                    plate.addFood(50);
                    System.out.println("Миска наполнена");
                    break;
                case "0":
                    System.out.println("Программа завершена");
                    return;
            }
        }

    }
}
