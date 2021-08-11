public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 81; // kilograms
        int height = 2; // meters
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}

