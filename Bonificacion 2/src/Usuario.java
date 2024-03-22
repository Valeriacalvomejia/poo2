public class Usuario {

    static boolean validarUsuario(String usuario, String password){
        boolean bnd=false;
        String usuarios = leertxt.leer("usuarios.txt");
        System.out.println(usuarios);
        String[] usuarioclave= usuario.split(";");
        String[] us;

        for (int i = 0; i < usuarioclave.length; i++) {
            us=usuarioclave[i].split(",");
            if(us[0].equals(usuario) && us[1].equals(password)){
                bnd=true;
            }
        }
        return bnd;
    }
}