
package co.edu.unipiloto.ws.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author asus
 */
@XmlRootElement(name ="Postulante")
@XmlType(propOrder={"id", "Nombre", "Apellido", "Estado"})

public class Postulante {
    
    private int id;
    private String Nombre;
    private String Apellido;
    private int Estado;
    
public Postulante(){
    
}   
    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @XmlElement
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @XmlElement
    public String getApellido() {
        return Apellido;
    }

    public void setApeliido(String Apeliido) {
        this.Apellido = Apeliido;
    }

    @XmlElement
    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

}
