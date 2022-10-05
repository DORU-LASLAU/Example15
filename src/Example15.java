import java.util.Scanner;
class Example15 {
    public static void main(String[] argv) {
        int a;
        System.out.println("Enter first number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        a = inputValue.nextInt();

        if (a <=3) {
            System.out.println("Muy Deficiente");
        } else if(a >=3 && a<5) {
            System.out.println("Insuficiente");
        } else if(a >=5 && a<6) {
            System.out.println("Suficiente");
        } else if (a>=6 && a<7) {
            System.out.println("Bien");
        } else if (a>=7 && a<9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
