//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 01:08:49 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="vehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tasaAlcohol" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "vehiculo",
    "tasaAlcohol"
})
@XmlRootElement(name = "ControlAlcoholemiaRequest")
public class ControlAlcoholemiaRequest {

    @XmlElement(required = true)
    protected String vehiculo;
    protected double tasaAlcohol;

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiculo(String value) {
        this.vehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaAlcohol.
     * 
     */
    public double getTasaAlcohol() {
        return tasaAlcohol;
    }

    /**
     * Define el valor de la propiedad tasaAlcohol.
     * 
     */
    public void setTasaAlcohol(double value) {
        this.tasaAlcohol = value;
    }

}
