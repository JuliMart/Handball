
package Ach.DTO;

public class Club {
    private int Rol;
    private String Nombre;
    private String Fundador;
    private int AnoFund;
    private String Pais;
    private String Lema;
    private String Color;
    private int ValorSus;
    
    
    public Club(){
        this.Rol = 0;
        this.Nombre = "";
        this.Fundador = "";
        this.AnoFund = 0;
        this.Pais = "";
        this.Lema = "";
        this.Color = "";
        this.ValorSus = 0;
    }    
    public Club(int Rol, String Nombre, String Fundador, int AnoFund, String Pais, String Lema,String Color, int ValorSus){
        this.Rol = Rol;
        this.Nombre = Nombre;
        this.Fundador = Fundador;
        this.AnoFund = AnoFund;
        this.Pais = Pais;
        this.Lema = Lema;
        this.Color = Color;
        this.ValorSus = ValorSus;
        
    }    
        
        
        
    

    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFundador() {
        return Fundador;
    }

    public void setFundador(String Fundador) {
        this.Fundador = Fundador;
    }

    public int getAnoFund() {
        return AnoFund;
    }

    public void setAnoFund(int AnoFund) {
        this.AnoFund = AnoFund;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getValorSus() {
        return ValorSus;
    }

    public void setValorSus(int ValorSus) {
        this.ValorSus = ValorSus;
    }
    
    
}
