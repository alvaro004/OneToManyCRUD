/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidoonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alvaro Llano
 */
@Entity
public class Partido {
    @Id String idPartido;
    @ManyToOne Equipo Local; 
    @ManyToOne Equipo Visitante;
    @ManyToOne Arbitro arbitro;
    String Ronda;

    public Partido(String idPartido,  String Ronda, Equipo Local, Equipo Visitante, Arbitro arbitro) {
        this.idPartido = idPartido;
        this.Local = Local;
        this.Visitante = Visitante;
        this.Ronda = Ronda;
        this.arbitro = arbitro;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public void setLocal(Equipo Local) {
        this.Local = Local;
    }

    public void setVisitante(Equipo Visitante) {
        this.Visitante = Visitante;
    }

    public void setRonda(String Ronda) {
        this.Ronda = Ronda;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Equipo getLocal() {
        return Local;
    }

    public Equipo getVisitante() {
        return Visitante;
    }

    public String getIdPartido() {
        return idPartido;
    }

    public String getRonda() {
        return Ronda;
    }
    
    
    public String descripcionPartido(){
        return idPartido+", "+ Local.getNombreEquipo() + ", "+Visitante.getNombreEquipo();
    
    }


    
}
