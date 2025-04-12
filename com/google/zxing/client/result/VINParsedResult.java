/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class VINParsedResult
extends ParsedResult {
    private final String countryCode;
    private final int modelYear;
    private final char plantCode;
    private final String sequentialNumber;
    private final String vehicleAttributes;
    private final String vehicleDescriptorSection;
    private final String vehicleIdentifierSection;
    private final String vin;
    private final String worldManufacturerID;

    public VINParsedResult(String string2, String string3, String string4, String string5, String string6, String string7, int n3, char c2, String string8) {
        ParsedResultType parsedResultType = ParsedResultType.VIN;
        super(parsedResultType);
        this.vin = string2;
        this.worldManufacturerID = string3;
        this.vehicleDescriptorSection = string4;
        this.vehicleIdentifierSection = string5;
        this.countryCode = string6;
        this.vehicleAttributes = string7;
        this.modelYear = n3;
        this.plantCode = c2;
        this.sequentialNumber = string8;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(50);
        String string2 = this.worldManufacturerID;
        stringBuilder.append(string2);
        char c2 = ' ';
        stringBuilder.append(c2);
        String string3 = this.vehicleDescriptorSection;
        stringBuilder.append(string3);
        stringBuilder.append(c2);
        string3 = this.vehicleIdentifierSection;
        stringBuilder.append(string3);
        char c3 = '\n';
        stringBuilder.append(c3);
        String string4 = this.countryCode;
        if (string4 != null) {
            stringBuilder.append(string4);
            stringBuilder.append(c2);
        }
        int c5 = this.modelYear;
        stringBuilder.append(c5);
        stringBuilder.append(c2);
        char c6 = this.plantCode;
        stringBuilder.append(c6);
        stringBuilder.append(c2);
        string2 = this.sequentialNumber;
        return ui0_1.a(stringBuilder, string2, c3);
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public char getPlantCode() {
        return this.plantCode;
    }

    public String getSequentialNumber() {
        return this.sequentialNumber;
    }

    public String getVIN() {
        return this.vin;
    }

    public String getVehicleAttributes() {
        return this.vehicleAttributes;
    }

    public String getVehicleDescriptorSection() {
        return this.vehicleDescriptorSection;
    }

    public String getVehicleIdentifierSection() {
        return this.vehicleIdentifierSection;
    }

    public String getWorldManufacturerID() {
        return this.worldManufacturerID;
    }
}

