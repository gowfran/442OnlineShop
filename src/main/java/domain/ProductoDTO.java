package domain;
public class ProductoDTO {
    private int id_producto;
    private String nombre_producto;
    private String precio_producto;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(String precio_producto) {
        this.precio_producto = precio_producto;
    }


    @Override
    public String toString() {
        return "Objeto Persona{" + "id_persona=" + id_producto + ", nombre=" + nombre_producto + ", apellido=" + precio_producto +'}';
    }
    
     
    
}