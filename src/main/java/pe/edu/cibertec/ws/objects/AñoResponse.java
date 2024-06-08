//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 10:47:49 AM PET 
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
 *         &lt;element name="añobisiesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "a\u00f1obisiesto"
})
@XmlRootElement(name = "A\u00f1oResponse")
public class AñoResponse {

    @XmlElement(required = true)
    protected String añobisiesto;

    /**
     * Obtiene el valor de la propiedad añobisiesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAñobisiesto() {
        return añobisiesto;
    }

    /**
     * Define el valor de la propiedad añobisiesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAñobisiesto(String value) {
        this.añobisiesto = value;
    }

}
