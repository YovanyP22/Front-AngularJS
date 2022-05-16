
package co.edu.unipiloto.ws.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author asus
 */
@XmlRootElement(name ="Emprendedor")
@XmlType(propOrder={"id", "Nombre", "Apellido", "Email"})
public class Emprendedor {
    private int id;
    private String Nombre;
    private String Apellido;
    private int Email;
    
    public Emprendedor(){
        
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
    

    
}
