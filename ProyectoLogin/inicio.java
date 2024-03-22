import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite usuario");
        String u = scn.next();

        System.out.println("Digite clave");
        String c = scn.next();

        if(Usuarios.validarUsuario(u,c)){
            System.out.println("Bienvenid@ "+u);
            inicioAdmin.saludar(u);
        }else{
            System.out.println("Usuario o clave incorrecta");
        }
    }
}