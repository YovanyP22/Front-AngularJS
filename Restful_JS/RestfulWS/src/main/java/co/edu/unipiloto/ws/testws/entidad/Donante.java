
package co.edu.unipiloto.ws.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author asus
 */
@XmlRootElement(name ="Donante")
@XmlType(propOrder={"id", "Nombre", "Apellido", "Email", "TipoProyecto"})

public class Donante {
    
    private int id;
    private String Nombre;
    private String Apellido;
    private int Email;
    private int TipoProyecto;
    
    public Donante(){
        
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

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @XmlElement
    public int getEmail() {
        return Email;
    }

    public void setEmail(int Email) {
        this.Email = Email;
    }

    @XmlElement
    public int getTipoProyecto() {
        return TipoProyecto;
    }

    public void setTipoProyecto(int TipoProyecto) {
        this.TipoProyecto = TipoProyecto;
    }
    
}
