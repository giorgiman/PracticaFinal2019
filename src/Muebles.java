import java.util.ArrayList;

public class Muebles {
    private String nombre;
    final private TipoMueble tipo ;
    final private ArrayList<Integer> altura;
    private int precio;

    Muebles(String nombre, TipoMueble tipo, ArrayList altura){
        this.nombre=nombre;
        this.tipo=tipo;
        this.altura=altura;

    }

    public String getNombre() {
        return nombre;
    }
}
