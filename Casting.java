public class Casting {
    public static void main(String[] args) {
        double decimal = 112.35;
        int integer = (int)decimal;
        System.out.println("double: " + decimal + "\nint: " + integer);

        String data = "49";
        int numb = Integer.parseInt(data);
        System.out.println("the string value is: " + data + "\nThe integer value is: " + numb);
    }
}
