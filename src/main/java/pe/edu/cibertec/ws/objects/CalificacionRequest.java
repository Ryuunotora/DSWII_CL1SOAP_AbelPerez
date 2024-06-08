//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 12:32:59 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calificacion1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calificacion2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calificacion3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calificacion1",
    "calificacion2",
    "calificacion3"
})
@XmlRootElement(name = "CalificacionRequest")
public class CalificacionRequest {

    protected int calificacion1;
    protected int calificacion2;
    protected int calificacion3;

    /**
     * Obtiene el valor de la propiedad calificacion1.
     * 
     */
    public int getCalificacion1() {
        return calificacion1;
    }

    /**
     * Define el valor de la propiedad calificacion1.
     * 
     */
    public void setCalificacion1(int value) {
        this.calificacion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacion2.
     * 
     */
    public int getCalificacion2() {
        return calificacion2;
    }

    /**
     * Define el valor de la propiedad calificacion2.
     * 
     */
    public void setCalificacion2(int value) {
        this.calificacion2 = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacion3.
     * 
     */
    public int getCalificacion3() {
        return calificacion3;
    }

    /**
     * Define el valor de la propiedad calificacion3.
     * 
     */
    public void setCalificacion3(int value) {
        this.calificacion3 = value;
    }

}
