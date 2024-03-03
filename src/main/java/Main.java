public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int count_month = service.calculate(10000, 3000, 20000);

        System.out.println("Количество месяцев отдыха в году: " + count_month);
    }
}