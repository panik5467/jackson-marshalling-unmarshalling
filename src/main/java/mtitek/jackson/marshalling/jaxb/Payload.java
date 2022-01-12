package mtitek.jackson.marshalling.jaxb.payload;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "payload")
@XmlType(name = "payload", propOrder = { "id", "code", "parameters" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Payload {
    @XmlElement(name = "id", required = true)
    private String id;

    @XmlElement(name = "code", required = true)
    private String code;

    @XmlTransient
    private String desc;

    @XmlElementWrapper(name = "parameters")
    @XmlElement(name = "parameter")
    private final List<PayloadParameter> parameters = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<PayloadParameter> getParameters() {
        List<PayloadParameter> copyParameters = new ArrayList<PayloadParameter>();
        copyParameters.addAll(this.parameters);
        return copyParameters;
    }

    public void setParameters(final List<PayloadParameter> parameters) {
        this.parameters.clear();

        if (parameters != null) {
            this.parameters.addAll(parameters);
        }
    }

    @Override
    public String toString() {
        return "Payload [id=" + id + ", code=" + code + "]";
    }
}