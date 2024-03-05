import java.util.*;
public class Inicio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Calculator 2000");
        System.out.print("Digite numero 1: ");
        int a = scn.nextInt();
        System.out.print("\nDigite numero 2: ");
        int b = scn.nextInt();
        int rSum = Sumar.calcular(a,b);
        System.out.println("La suma es "+ rSum);
        //System.out.println(Sumar.calcular(a,b));
        Resta objResta = new Resta();
        int rResta = objResta.calcular(a,b);
        System.out.println("La resta es " + rResta);

        Multiplicacion.calcular(a,b);
        int rMul = Multiplicacion.resul;
        System.out.println("La multiplicacion es "+ rMul);

        if (b==0){
            System.out.println("No se puede dividir por cero");
        }else {
            double rDiv = Division.calcular(a,b);
            System.out.println("La division es: " + rDiv);

        }

    }
}
