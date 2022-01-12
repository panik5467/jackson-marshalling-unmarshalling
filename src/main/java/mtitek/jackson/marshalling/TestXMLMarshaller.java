package mtitek.jackson.marshalling;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mtitek.jackson.marshalling.payload.Payload;
import mtitek.jackson.marshalling.payload.PayloadParameter;

public class TestXMLMarshaller {
    public static void main(String[] args) throws Exception {
        final Payload payload = initPayload();

        JacksonXmlModule xmlModule = new JacksonXmlModule();
        xmlModule.setDefaultUseWrapper(false);

        ObjectMapper objectMapper = new XmlMapper(xmlModule);

        // Indentation
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        System.out.println(objectMapper.writeValueAsString(payload));
    }

    private static Payload initPayload() {
        final Payload payload = new Payload();

        payload.setId("1");
        payload.setCode("111");
        payload.setLabel("aa vvv ddd");
        payload.setDesc("transient");

        final List<PayloadParameter> parameters = new ArrayList<>();

        {
            final PayloadParameter parameter = new PayloadParameter();

            parameter.setId("1");
            parameter.setName("aaa");
            parameter.setValue("bbb");

            parameters.add(parameter);
        }

        {
            final PayloadParameter parameter = new PayloadParameter();

            parameter.setId("2");
            parameter.setName("ccc");
            parameter.setValue("ddd");

            parameters.add(parameter);
        }

        payload.setParameters(parameters);

        return payload;
    }
}