package qa.quru;

public class Main {
    public static void main(String[] args) {
        int x = 2147483647; // максимальное значение int
        int y = 1;
        int z = x + y;
        System.out.println(z); // выведет -2147483648 (переполнение)

        int a = 5;
        int b = 7;
        int c = 10;
        boolean result1 = (a > b) && (b < c); // false (логическое И)
        boolean result2 = (a > b) || (b < c); // true (логическое ИЛИ)
        boolean result3 = !(a > b); // true (логическое НЕ)
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        int g = 10;
        int v = 3;
        int l = g / v; // целочисленное деление
        int d = g % v; // остаток от деления
        double e = Math.pow(g, v); // возведение в степень
        double f = Math.sqrt(g); // квадратный корень
        System.out.println(l);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int k = 5;
        double v1 = 2.5;
        double c2 = k + v1;
        double j2 = k / v1;
        int u1 = (int) (v1 * c2);
        System.out.println(c2);
        System.out.println(j2);
        System.out.println(u1);
    }
}