package ArgsCommandLine;

public class CalculatorCLI {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: CalculatorCLI <operation: add, sub, mul, div> <nr a> <nr b>");
            System.exit(-1);
        }
        String operation = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double result = 0.00;
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed");
                    System.exit(-1);
                }
                result = (double) a / b;
                break;
            default:
                result = a + b;
        }

        System.out.println("Result: " + result);
    }
}
