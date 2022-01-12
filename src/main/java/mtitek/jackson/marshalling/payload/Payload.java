package mtitek.jackson.marshalling.payload;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(namespace = "http://marshalling.jackson.mtitek/payload", localName = "payload")
@JsonPropertyOrder({ "id", "code" })
public class Payload {
    @JsonProperty("id")
    @JacksonXmlProperty(isAttribute = false, localName = "id", namespace = "")
    private String id;

    @JsonProperty("code")
    @JacksonXmlProperty(isAttribute = false, localName = "code", namespace = "")
    private String code;

    @JsonProperty("label")
    @JacksonXmlProperty(isAttribute = false, localName = "label", namespace = "")
    @JacksonXmlCData
    private String label;

    @JsonIgnore
    private String desc;

    @JacksonXmlElementWrapper(localName = "parameters")
    @JsonProperty("parameter")
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
        return "Payload [id=" + id + ", code=" + code + ", label=" + label + "]";
    }
}