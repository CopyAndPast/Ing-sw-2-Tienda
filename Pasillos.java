
package proyectomercado;

public class Pasillos implements Metodos {

    public String nombre;
    public int NuID;
    public int Invet;

    public Pasillos(String nombre, int NuID, int Invet) {
        this.nombre = nombre;
        this.NuID = NuID;
        this.Invet = Invet;
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
