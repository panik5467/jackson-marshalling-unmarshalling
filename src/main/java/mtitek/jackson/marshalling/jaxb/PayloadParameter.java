package mtitek.jackson.marshalling.jaxb.payload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "parameter")
@XmlType(name = "parameterType", propOrder = { "name", "value" })
@XmlAccessorType(XmlAccessType.FIELD)
public class PayloadParameter {
    @XmlAttribute(name = "id", required = true)
    private String id;

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "value", required = true)
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PayloadParameter [id=" + id + ", name=" + name + ", value=" + value + "]";
    }
}