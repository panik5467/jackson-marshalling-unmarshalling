package mtitek.jackson.marshalling.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "parameter")
@JsonPropertyOrder({ "name", "value" })
public class PayloadParameter {
    @JsonProperty("id")
    @JacksonXmlProperty(isAttribute = true, localName = "id", namespace = "")
    private String id;

    @JsonProperty("name")
    @JacksonXmlProperty(isAttribute = false, localName = "name", namespace = "")
    private String name;

    @JsonProperty("value")
    @JacksonXmlProperty(isAttribute = false, localName = "value", namespace = "")
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