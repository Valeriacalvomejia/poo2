public class Nacional extends Producto{
    public String registroDian;
    public Nacional(String nombre, int codigo, String registroDian) {
        super(nombre, codigo);
        this.registroDian = registroDian;
        //super es que le envía todo al padre


    }
}
