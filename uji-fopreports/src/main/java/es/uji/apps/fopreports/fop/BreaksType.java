//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.13 at 06:06:38 PM CEST 
//


package es.uji.apps.fopreports.fop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for breaks_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="breaks_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="inherit"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="column"/>
 *     &lt;enumeration value="page"/>
 *     &lt;enumeration value="even-page"/>
 *     &lt;enumeration value="odd-page"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "breaks_Type")
@XmlEnum
public enum BreaksType {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;fop_fail xmlns="http://www.w3.org/2001/XMLSchema" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Unknown enumerated value&lt;/fop_fail&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("inherit")
    INHERIT("inherit"),
    @XmlEnumValue("auto")
    AUTO("auto"),
    @XmlEnumValue("column")
    COLUMN("column"),
    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("even-page")
    EVEN_PAGE("even-page"),
    @XmlEnumValue("odd-page")
    ODD_PAGE("odd-page");
    private final String value;

    BreaksType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreaksType fromValue(String v) {
        for (BreaksType c: BreaksType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
