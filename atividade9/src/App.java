import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float temp_f;
        float temp_c;
        System.out.printf("Informe a temperatura em Fahrenheit: ");
        temp_f = ler.nextFloat();
        temp_c = 5*((temp_f-32)/9);
        System.out.println("São " + temp_c + "° Celsius");
    }
}
