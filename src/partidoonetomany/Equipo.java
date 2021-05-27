/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidoonetomany;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Alvaro Llano
 */
@Entity
public class Equipo {
    @Id String idEquipo;
    String nombreEquipo;

    @OneToMany (mappedBy = "Local") Set<Partido> JugadoresLocales;
    @OneToMany (mappedBy = "Visitante") Set<Partido> JugadoresVisitantes;

    public Equipo(String idEquipo, String nombreEquipo) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    

    public String getIdEquipo() {
        return idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setJugadoresLocales(Set<Partido> JugadoresLocales) {
        this.JugadoresLocales = JugadoresLocales;
    }

    public void setJugadoresVisitantes(Set<Partido> JugadoresVisitantes) {
        this.JugadoresVisitantes = JugadoresVisitantes;
    }

    public Set<Partido> getJugadoresLocales() {
        return JugadoresLocales;
    }

    public Set<Partido> getJugadoresVisitantes() {
        return JugadoresVisitantes;
    }
    
    public String toString(){
        return nombreEquipo;
    }
    
}
