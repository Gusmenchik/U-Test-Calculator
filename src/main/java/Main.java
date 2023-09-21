public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        double a = calc.plus.apply(1, 2);
        double b = calc.minus.apply(1, 1);
        double c = calc.divide.apply(a, b);

        if (Double.isInfinite(c)) {
            System.out.println("Ошибка: деление на ноль");
        } else {
            calc.println.accept((int) c);
        }
    }
}
