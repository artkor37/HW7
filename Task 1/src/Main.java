import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount;          //Жабьи глаза
        int ghoulTearsCount;        //Слезы вурдалака
        int ravenBonesCount;        //Кости ворона
        int dumplingsCount;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Введите количество ингридиентов.");
        System.out.print("Жабьи глаза: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.print("Слезы вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.print("Кости ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.print("Пельмени: ");
        dumplingsCount = new Scanner(System.in).nextInt();


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        boolean isCount = false;

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Эликсир зоркости.");
            isCount = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Эликсир стойкости.");
            isCount = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Эликсир скрытности.");
            isCount = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Запретный эликсир.");
            isCount = true;
        }
        if (!isCount){
            System.out.println("Не хватает ингридиентов");
        }
    }
}
