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
 * <p>Java class for white_space_collapse_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="white_space_collapse_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "white_space_collapse_Type")
@XmlEnum
public enum WhiteSpaceCollapseType {

    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("true")
    TRUE("true"),

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
    INHERIT("inherit");
    private final String value;

    WhiteSpaceCollapseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WhiteSpaceCollapseType fromValue(String v) {
        for (WhiteSpaceCollapseType c: WhiteSpaceCollapseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
