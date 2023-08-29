package com.example.api.DTO;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class BarsSerializer extends JsonSerializer<Bars> {

    @Override
    public void serialize(Bars bars, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("barID", bars.getBarID());
        jsonGenerator.writeStringField("name", bars.getName());
        jsonGenerator.writeStringField("latitude", bars.getLatitude());
        jsonGenerator.writeStringField("longitude", bars.getLongitude());
        jsonGenerator.writeStringField("Maps_url", bars.getMapsUrl());
        jsonGenerator.writeStringField("image", bars.getImage());
        jsonGenerator.writeNumberField("minCard", bars.getMinCard());
        jsonGenerator.writeNumberField("ouverture", bars.getOuverture());
        jsonGenerator.writeNumberField("fermeture", bars.getFermeture());
        jsonGenerator.writeBooleanField("exterieur", bars.getExterieur());
        jsonGenerator.writeBooleanField("interieur", bars.getInterieur());
        jsonGenerator.writeBooleanField("fumeur", bars.getFumeur());
        jsonGenerator.writeBooleanField("toilettes", bars.getToilettes());
        jsonGenerator.writeBooleanField("wifi", bars.getWifi());
        jsonGenerator.writeBooleanField("toilettesPayantes", bars.getToilettesPayante());
        jsonGenerator.writeBooleanField("manger", bars.getManger());
        jsonGenerator.writeStringField("happyHour", bars.getHappyHour());
        jsonGenerator.writeEndObject();

    }
}