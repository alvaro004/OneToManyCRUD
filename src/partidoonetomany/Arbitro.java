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
public class Arbitro {
    @Id String idArbitro;
    String nombreArbitro;
    
    @OneToMany (mappedBy = "arbitro") Set<Partido> Arbitro;

    public Arbitro(String idArbitro, String nombreArbitro) {
        this.idArbitro = idArbitro;
        this.nombreArbitro = nombreArbitro;

    }

    public String getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(String idArbitro) {
        this.idArbitro = idArbitro;
    }

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public Set<Partido> getArbitro() {
        return Arbitro;
    }

    public void setArbitro(Set<Partido> Arbitro) {
        this.Arbitro = Arbitro;
    }
    
    //Para el combo box de Arbitros
    public String toString(){
        return nombreArbitro;
    }   
    
    
    
   
    
    
}
