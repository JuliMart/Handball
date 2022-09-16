
package Ach.DTO;


public class Suscrip {
    
    private static int Correlativo = 1000;
    
    public static int getCorrelativo() {
        return Correlativo+10;
    }
    
    private String Fecha;
    private int Valor;
    private String EquipoSuscr;
    private int AbonoTotal;
    private int Numero;
    private String UsuarioSus; 
    private String Equipos;
    
    public Suscrip(){
        this.Fecha = "";
        this.Valor = 0;
        this.EquipoSuscr = "";
        this.AbonoTotal = 0;
        this.Numero = 0;
        this.UsuarioSus = "";
        this.Equipos = "";
    }
    public Suscrip(String Fecha, int Valor, String EquipoSuscr,int AbonoTotal, int Numero,String UsuarioSus, String Equipos){
        this.Fecha = Fecha;
        this.Valor = Valor;
        this.EquipoSuscr = EquipoSuscr;
        this.AbonoTotal = AbonoTotal;
        this.Numero = Numero;
        this.UsuarioSus = UsuarioSus;
        this.Equipos = Equipos;
    
    
    }
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getEquipoSuscr() {
        return EquipoSuscr;
    }

    public void setEquipoSuscr(String EquipoSuscr) {
        this.EquipoSuscr = EquipoSuscr;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getUsuarioSus() {
        return UsuarioSus;
    }

    public void setUsuarioSus(String UsuarioSus) {
        this.UsuarioSus = UsuarioSus;
    }

    public String getEquipos() {
        return Equipos;
    }
    
    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
   
}
