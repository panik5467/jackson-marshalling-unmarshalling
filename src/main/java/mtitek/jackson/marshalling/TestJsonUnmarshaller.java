package mtitek.jackson.marshalling;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import mtitek.jackson.marshalling.payload.Payload;
import mtitek.jackson.marshalling.utils.ResourceUtils;

public class TestJsonUnmarshaller {
    public static void main(String[] args) throws SAXException, IOException, JAXBException {
        try (final InputStream inputStream = ResourceUtils.getResourceAsStream("payload.json")) {
            ObjectMapper objectMapper = new ObjectMapper();

            final Payload payload = objectMapper.readValue(inputStream, Payload.class);

            System.out.println(payload);
            System.out.println(payload.getParameters());
        }
    }
}