import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import static java.lang.Integer.parseInt;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//5.1
        String str1 = "20 20 20 20 20 20 20 20 20 20";
        System.out.println(str1);
//5.13
        int x1 = 0;
        int consta = 7;
        for (int i = 1; i <= 9; i++) {
            x1++;
            int res = x1 * consta;
            System.out.println(x1 + "*" + consta + "=" + res);
        }
        //5.27(a)
        int s1 = 0;
        int lp = 100;
        while (lp >= 100 && lp < 500) {
            s1 += lp;
            lp++;
        }
        System.out.println("Сумма всех чисел от 100 до 500 = " + s1);
        //5.27(г)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b>=a: ");
        int b = scanner.nextInt();
        int s2 = 0;
        if (a >= b) {
            System.out.println("Введите друие числа");
            return;
        }
        while (a < b) {
            s2 += a;
            a++;
        }
        System.out.println("Сумма всех чисел от a до b - " + s2);
        //5.28(a)
        int m1 = 1;
        int y1 = 8;
        while (y1 >= 8 && y1 < 15) {
            m1 *= y1;
            y1++;
        }
        System.out.println("Произвведвение чисел от 8 до 15 - " + m1);
        //5.28(г)
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите знач5ение a: ");
        int a1 = scanner1.nextInt();
        System.out.print("Введите значение b: ");
        int b1 = scanner1.nextInt();
        int m2 = 1;
        if (a1 >= b1) {
            System.out.println("Введите друие числа");
            return;
        }
        while (a1 < b1) {
            m2 *= a1;
            a1++;
        }
        System.out.println("Произведение всех чисел от a до b - " + m2);
        //5.8
        int funt = 0;
        double consta2 = 0.453;
        for (int i = 0; i < 10; i++) {
            double kg = funt * consta2;
            funt++;
            System.out.println(funt + " " + "фунт/фунтов" + " " + " " + "=" + " " + kg + " " + "кг");
        }
        //5.72(а)
        int N = 10;//кол-во дней тренировок
        double firstday = 10000;
        for (int i = 0; i <= 10; i++) {
            double day = firstday * 0.01 + firstday;
            int days = (int)Math.round(day);
            firstday = day;
            System.out.println(days);
        }
        //5.72(б)
        int N1 = 7;//кол-во дней тренировок
        int sum1 = 0;
        double firstday1 = 10000;
        for (int i = 0; i <= 7; i++) {
            double day1 = firstday1 * 0.01 + firstday1;
            int days1 = (int)Math.round(day1);
            sum1 += days1;
            firstday1 = day1;
            System.out.println(days1);

        }
        System.out.println("Суммарный путь лыжника за первые 7 дней: " + sum1);
        //6.21(a)
        Scanner scanner3 = new Scanner(System.in);
        int n = scanner.nextInt();
        int f5 = 1;
        int s5 = 1;
        int next = 0;
        while (next <= n) {
            next = f5 + s5;
            f5 = s5;
            s5 = next;
        }
        System.out.println(next);
        //6.21(b)
        int f6 = 1;
        int s6 = 1;
        int next1 = 0;
        int sumfs = f6 + s6;
        while (true) {
            next1 = f6 + s6;
            if (next1 > 1000) {
                break;
            }
            sumfs += next1;
            f6 = s6;
            s6 = next1;
        }
        System.out.println(sumfs);
        //7.1
        for (int i=100; i<=200; i++){
            if (i%3 ==0){
                System.out.println(i);
            }
        }
        //7.26
        int schet = 0;
        for (int i = 0; i<=30; i++){
            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Введите температуру: ");
            int t1 = scanner.nextInt();
            if (t1<0) {
                schet+=1;
            }
        }
        System.out.println(schet);
        //7.56
        int maxS = 0;
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Введите кол-во городов: ");
        int k = scanner.nextInt();//кол-во городов
        for (int i = 0; i <= k; i++){
            Scanner scanner8 = new Scanner(System.in);
            System.out.print("Введите расстояние города до Москвы: ");
            int S = scanner.nextInt();
            if (S>maxS) {
                maxS = S;
            }
        }
        System.out.println(maxS);
        //8.1(а)
        for (int i =0; i<=4; i++){
                System.out.println(5 + " " + 5 + " " + 5 + " " + 5 + " " + 5 + " " + 5) ;
            }
        //8.1(b)
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //8.1(c)
        for (int j = 41; j <= 50; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 51; j <= 60; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 61; j <= 70; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 71; j <= 80; j++) {
            System.out.print(j + " ");
        }
        //8.3(a)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //8.3(b)
        for (int i = 0; i < 5; i++) { // внешний цикл для строк
            for (int j = 0; j < 5 - i; j++) { // внутренний цикл для вывода чисел
                System.out.print((5 + i) + " "); // вывод числа
            }
            System.out.println(); // переход на новую строку после окончания строки
        }
        //8.3(c)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*10 + " ");
            }
            System.out.println();
        }
        //8.3(d)
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + 5 + " ");
            }
            System.out.println();
        }
        //8.4
        for (int i = 1; i <= 5; i++) {
            int number = i * 5;
            for (int j = 1; j <= (5 - i + 1); j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }




    }
}
