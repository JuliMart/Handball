
package Ach.DTO;

import java.util.Date;
import java.util.Scanner;

public class Usuario {
    private int Id;
    private String Nombre;
    private int Rut;
    private int Dv;
    private String FecNac;
    private int Fono;
    private String Email;
    private String NomUsu;
    private String Contrasena;
    private int Edad;
    
    
    public Usuario(){
        this.Id = 0;
        this.Nombre = " ";
        this.Rut = 0;
        this.Dv = 0;
        this.FecNac = "";
        this.Fono = 0;
        this.Email = "";
        this.NomUsu = "";
        this.Contrasena = "";
        this.Edad = 0;
        
    
    }
    public Usuario(int Id, String Nombre, int Rut, int Dv, String FecNac, int Fono, String Email, String NomUsu, String Contrasena,int Edada){
        
        this.Id = Id;
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.Dv = Dv;
        this.FecNac = FecNac;
        this.Fono = Fono;
        this.Email = Email;
        this.NomUsu = NomUsu;
        this.Contrasena = Contrasena;
        this.Edad = Edad;
    
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        if(Nombre.length() >= 4){
        this.Nombre = Nombre;
        }
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Indica tu edad");
        if (num>21){
            this.Edad = Edad;
        }else{
            System.out.println("No puedes registrarte");
        
        }
        
        
        
        this.Edad = Edad;
    }
    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public int getDv() {
        return Dv;
    }

    public void setDv(int Dv) {
        this.Dv = Dv;
    }

    public String getFecNac() {
        return FecNac;
    }

    public void setFecNac(String FecNac) {
        this.FecNac = FecNac;
    }

    public int getFono() {
        return Fono;
    }

    public void setFono(int Fono) {
            StringBuilder sb = new StringBuilder();
        sb.append(Fono);
        
        if(sb.length() >= 8) {
            this.Fono = Fono;
        }
    
        this.Fono = Fono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@") && Email.contains(".cl")){
            this.Email = Email;
        }    
    }

    public String getNomUsu() {
        return NomUsu;
    }

    public void setNomUsu(String NomUsu) {
        this.NomUsu = NomUsu;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        
        
        
        this.Contrasena = Contrasena;
    }



}