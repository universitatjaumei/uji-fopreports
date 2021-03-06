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
 * <p>Java class for rule_style_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rule_style_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="dashed"/>
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="groove"/>
 *     &lt;enumeration value="ridge"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rule_style_Type")
@XmlEnum
public enum RuleStyleType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("dotted")
    DOTTED("dotted"),
    @XmlEnumValue("dashed")
    DASHED("dashed"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("groove")
    GROOVE("groove"),
    @XmlEnumValue("ridge")
    RIDGE("ridge"),
    @XmlEnumValue("inherit")
    INHERIT("inherit");
    private final String value;

    RuleStyleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleStyleType fromValue(String v) {
        for (RuleStyleType c: RuleStyleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
