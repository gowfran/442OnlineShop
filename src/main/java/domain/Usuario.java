package domain;
public class Usuario {
    /*
    En esta clase definimos los atributos de la tabla usuario
    que serán utilizados cuando se creen objetos de este tipo
    cada uno de ellos debe tener su getter y setter
    
    Tambien se define un metodo toString para ver la información que contiene el objeto usuario
    */
    private int id_uaurio;
    private String usuario;
    private String password;

    public int getId_uaurio() {
        return id_uaurio;
    }

    public void setId_uaurio(int id_uaurio) {
        this.id_uaurio = id_uaurio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Objeto Usuario{" + "id_uaurio=" + id_uaurio + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
    
}
