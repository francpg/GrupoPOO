package anajarro.seguridad.vo;

public class Auto {
    String placa = "";
    String nombre = "";
    String modelo = "";
    String pais = "";
    String clave = "";
    int idPerfil;
    
    public Auto(String placa, String nombre,String modelo, String pais){
        this.placa = placa;
        this.nombre = nombre;
        this.modelo = modelo;
        this.pais = pais;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getpais() {
        return pais;
    }

    public void setpais(String pais) {
        this.pais = pais;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }


    
}
