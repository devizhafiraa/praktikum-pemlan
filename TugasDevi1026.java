public class TugasDevi1026 {
    public static void main(String[] args) {
        System.out.println("Jumlah argumen: " + args.length); // Debugging

        if (args.length == 0) {
            System.out.println("Usage: java TugasDevi1026 \"operand1 operator operand2\"");
            return;
        }

        String input = args[0].replaceAll(" ", "")
                              .replaceAll("([+\\-*/])", "#$1#");

        String[] tokens = input.split("#");

        if (tokens.length != 3) {
            System.out.println("Invalid expression format.");
            return;
        }

        int num1 = Integer.parseInt(tokens[0]);
        char operator = tokens[1].charAt(0);
        int num2 = Integer.parseInt(tokens[2]);
        int result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = (num2 != 0) ? num1 / num2 : 0;
            default -> {
                System.out.println("Invalid operator.");
                return;
            }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
