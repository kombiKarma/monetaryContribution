public class Main {
    public static void main(String[] args) {
        int percent = 3;
        double minContribution = 1000.00;
        double contribution = 10000.00;
        double income = (contribution / 100.0) * percent;
        if (contribution < minContribution) {
            income = 0;
        }
        System.out.println(income);
        }
}
