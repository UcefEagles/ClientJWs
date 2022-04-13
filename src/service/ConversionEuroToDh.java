
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConversionEuroToDh complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConversionEuroToDh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monatant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionEuroToDh", propOrder = {
    "monatant"
})
public class ConversionEuroToDh {

    protected double monatant;

    /**
     * Obtient la valeur de la propriété monatant.
     * 
     */
    public double getMonatant() {
        return monatant;
    }

    /**
     * Définit la valeur de la propriété monatant.
     * 
     */
    public void setMonatant(double value) {
        this.monatant = value;
    }

}
