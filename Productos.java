package proyectomercado;

public class Productos extends Pasillos implements Metodos {

    public Productos(String nombre, int NuID, int Invet) {
        super(nombre, NuID, Invet);
    }

    @Override
    public String NombredelProducto() {
        return this.nombre;
    }

    @Override
    public int NuID() {
        return this.NuID;
    }

    @Override
    public int Invetario() {
        return this.Invet;
    }

    @Override
    public String toString() {
        return "Nombre del producto: " + this.nombre + " Numero de identificacion: " + this.NuID + " Cantidad en el inventario: " + this.Invet;
    }
}
