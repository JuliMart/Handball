
package handballop;


import Ach.DTO.Club;
import Ach.DTO.Suscrip;
import Ach.DTO.Usuario;
import java.io.ObjectInputStream;



public class Handball {


    public static void main(String[] args) {
        
        System.out.println("Registrando un usuario");
        Usuario a = new Usuario();
        a.setId(1000);
        a.setNombre("");
        a.setRut(0);
        a.setDv(0);
        a.setFecNac("");
        a.setFono(0);
        a.setEmail("david.gogiolle@gmail.com");
        a.setNomUsu("dcog");
        a.setContrasena("Afds22231");
        
        System.out.println("Creado usuario: "+ a.getNomUsu());
        
        System.out.println("Registrando un usuario");
        Usuario b = new Usuario();
        b.setId(1001);
        b.setNombre("");
        b.setRut(0);
        b.setDv(0);
        b.setFecNac("");
        b.setFono(0);
        b.setEmail("gerr.adere@live.cl");
        b.setNomUsu("ggft");
        b.setContrasena("G1ovanniGg34");
        
        
        System.out.println("Creado usuario: "+ b.getNomUsu());
        
        
        System.out.println("Registrando un usuario");
        Usuario c = new Usuario();
        c.setId(1002);
        c.setNombre("");
        c.setRut(0);
        c.setDv(0);
        c.setFecNac("");
        c.setFono(0);
        c.setEmail("sergio.villanueva@gmail.com");
        c.setNomUsu("scodiio");
        c.setContrasena("Afds22231");
        
        
        System.out.println("Creado usuario: "+ c.getNomUsu());
        
        
        System.out.println("Registrando un Club");
        Club d = new Club();
        d.setRol(0);
        d.setNombre("Arsenal de Coquimbo");
        d.setFundador("");
        d.setAnoFund(0);
        d.setPais("");
        d.setLema("Canones a los puertos");
        d.setColor("Amarillo, rojo");
        d.setValorSus(10050);
        System.out.println("Registrado club: "+ d.getNombre());
        
        
        System.out.println("Registrando un Club");
        Club e = new Club();
        e.setRol(0);
        e.setNombre("Manquehue City");
        e.setFundador("");
        e.setAnoFund(0);
        e.setPais("");
        e.setLema("Vivir y fuerza");
        e.setColor("Celeste, blanco");
        e.setValorSus(15100);
        System.out.println("Registrado club: "+ e.getNombre());
        
        
        
        System.out.println("Registrando un Club");
        Club f = new Club();
        f.setRol(0);
        f.setNombre("Los condores unidos");
        f.setFundador("");
        f.setAnoFund(0);
        f.setPais("");
        f.setLema("Desde lo alto al sol");
        f.setColor("Amarillo, naranjo");
        f.setValorSus(13200);
        System.out.println("Registrado club: "+ f.getNombre());
        
        
        System.out.println("Realizando una suscripcion");
        Suscrip h = new Suscrip();
        h.setFecha("");
        h.setValor(0);
        h.setEquipoSuscr("ARH11 ; MCH12 ");
        h.setAbonoTotal(25150);
        h.setNumero(1010);
        h.setUsuarioSus("Usuario 1");
        System.out.println("Se ha suscrito a: "+h.getEquipoSuscr());
        
        
        System.out.println("Realizando una suscripcion");
        Suscrip i = new Suscrip();
        i.setFecha("");
        i.setValor(0);
        i.setEquipoSuscr("LCH13");
        i.setAbonoTotal(13200);
        i.setNumero(1020);
        i.setUsuarioSus("Usuario 2");
        System.out.println("Se ha suscrito a: "+i.getEquipoSuscr());
        
        
        
        System.out.println("Realizando una suscripcion");
        Suscrip j = new Suscrip();
        j.setFecha("");
        j.setValor(0);
        j.setEquipoSuscr("LCH13 , MCH12 ");
        j.setAbonoTotal(18300);
        j.setNumero(1030);
        j.setUsuarioSus("Usuario 3");
        System.out.println("Se ha suscrito a: "+j.getEquipoSuscr());
        
// TODO code application logic here
    }

    public Handball() {
    }
    
}

