// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println((fibonacci(3)));
    }
    public static int fibonacci(int num){
         if(num <= 1){
             return 1;
         }
         return fibonacci(num -1) + fibonacci(num - 2);
    }
}