package com.example.api.DTO;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ProduitsSerializer extends JsonSerializer<Produits> {

    @Override
    public void serialize(Produits produits, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("produitID", produits.getProduitID());
        jsonGenerator.writeStringField("name",produits.getName());
        jsonGenerator.writeStringField("image",produits.getImage());
        jsonGenerator.writeEndObject();
    }
}

