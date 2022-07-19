public class Source {
    public static void main(String[] args) {
        int num =6;
        System.out.println(even_or_odd(num).equals("Even"));
    }
    public static String even_or_odd(int number) {
    return (number%2==0)? "Even" : "Odd";
    }
}
