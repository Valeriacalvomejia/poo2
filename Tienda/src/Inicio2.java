import java.util.ArrayList;
import java.util.Scanner;

public class Inicio2 {
    static Scanner scn = new Scanner(System.in);
    static Nacional objN;
    static Importado objI;
    static ArrayList<Nacional> listN;
    static ArrayList<Importado> listI;

    public static void main(String[] args) {
        System.out.println("Digite la procedencia del producto\n1.Registar Nacional\n2.Regitrar Importado\n "
                + "3.Buscar Nacional\n 4.Buscar Importado\n0. Salir");
        int opcion = scn.nextInt();
        while (opcion != 0){
            if (opcion == 1) {
                listN = new ArrayList<>();
                for (int i = 0; i < 1; i++) {
                    objN = crearObjetoN();
                    listN.add(objN);

                }
                System.out.println("Objetos creados");

                verListaN();
            } else if (opcion == 2) {
                listI = new ArrayList<>();
                for (int i = 0; i < 1; i++) {
                    objI = crearObjetoI();
                    listI.add(objI);
                }
                System.out.println("Objetos creados");

                verListaI();
            } else if (opcion == 3) {
                int codBuscar = scn.nextInt();
                for (int i = 0; i < listN.size(); i++) {
                    Nacional actualN = listN.get(i);
                    if (actualN.getCodigo() == codBuscar) {
                        System.out.println("Codigo encontrado" + actualN.getCodigo());
                        break;
                    }
                }

            }else if (opcion==4) {
                int codBuscar = scn.nextInt();
                for (int i = 0; i < listI.size(); i++) {
                    Importado actualI= listI.get(i);
                    if (actualI.getCodigo() == codBuscar) {
                        System.out.println("Codigo encontrado " + actualI.getCodigo());
                        break;
                    }
                }
            } else {
                System.out.println("error opción no contemplada");
            }
            System.out.println("Digite la procedencia del producto\n1.Registar Nacional\n2.Regitrar Importado\n "
                    + "3.Buscar Nacional\n 4.Buscar Importado\n0. Salir");
            opcion = scn.nextInt();
        }
    }


    static Nacional crearObjetoN() {

        System.out.println("Digite Codigo Producto Nacional");
        int c = scn.nextInt();
        System.out.println("digite Nombre Producto Nacional");
        String n = scn.next();
        System.out.println("digite Registro DIAN");
        String rd = scn.next();
        objN = new Nacional(n, c, rd);
        return objN;
    }

    static void verListaN() {
        for (int i = 0; i < Inicio2.listN.size(); i++) {
            System.out.println(Inicio2.listN.get(i).getCodigo());
        }
    }
    static void verListaI(){
        for (int i = 0; i < Inicio2.listI.size(); i++) {
            System.out.println(Inicio2.listI.get(i).getCodigo());
        }
    }

    static Importado crearObjetoI() {

        System.out.println("Digite Nombre Producto Importado");
        String NI = scn.next();
        System.out.println("Digite Codigo Producto Importado");
        int CI = scn.nextInt();
        System.out.println("Digite Licencia de importación");
        String LI = scn.next();
        objI = new Importado(NI, CI, LI);
        return objI;
    }

}

