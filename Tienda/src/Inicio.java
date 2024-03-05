import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int codigo;
        String nombre, registroDian, licenciaImportacion;
        int tam = 3;
        Nacional[] listaProductoNal =new Nacional[tam];
        Importado[] listaProductoImp = new Importado[tam];
        for (int i = 0; i <listaProductoNal.length ; i++) {
            System.out.println("Digite codigo producto " + (i+1));
            codigo= snc.nextInt();
            System.out.println("Digite Nombre producto "+ (i+1));
            nombre = snc.next();
            System.out.println("Digite registro DIAN producto "+ (i+1));
            registroDian = snc.next();
            listaProductoNal[i] = new Nacional(nombre,codigo,registroDian);

        }
        System.out.println("Productos Nacionales registrados");
        for (int i = 0; i < listaProductoNal.length; i++) {
            System.out.println("Codigo"+ listaProductoNal[i].getCodigo());
            System.out.println("Nombre"+ listaProductoNal[i].nombre);
        }

    }

}
