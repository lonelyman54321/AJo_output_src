/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class GeoParsedResult
extends ParsedResult {
    private final double altitude;
    private final double latitude;
    private final double longitude;
    private final String query;

    public GeoParsedResult(double d2, double d5, double d7, String string2) {
        ParsedResultType parsedResultType = ParsedResultType.GEO;
        super(parsedResultType);
        this.latitude = d2;
        this.longitude = d5;
        this.altitude = d7;
        this.query = string2;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public String getDisplayResult() {
        char c2 = '\u0014';
        StringBuilder stringBuilder = new StringBuilder(c2);
        double d2 = this.latitude;
        stringBuilder.append(d2);
        String string2 = ", ";
        stringBuilder.append(string2);
        double d5 = this.longitude;
        stringBuilder.append(d5);
        d5 = this.altitude;
        double d7 = 0.0;
        double d9 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
        if (d9 > 0) {
            stringBuilder.append(string2);
            d2 = this.altitude;
            stringBuilder.append(d2);
            c2 = 'm';
            stringBuilder.append(c2);
        }
        if ((string2 = this.query) != null) {
            stringBuilder.append(" (");
            string2 = this.query;
            stringBuilder.append(string2);
            c2 = ')';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public String getGeoURI() {
        String string2 = "geo:";
        StringBuilder stringBuilder = new StringBuilder(string2);
        double d2 = this.latitude;
        stringBuilder.append(d2);
        char c2 = ',';
        stringBuilder.append(c2);
        double d5 = this.longitude;
        stringBuilder.append(d5);
        d5 = this.altitude;
        double d7 = 0.0;
        double d9 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
        if (d9 > 0) {
            stringBuilder.append(c2);
            d2 = this.altitude;
            stringBuilder.append(d2);
        }
        if ((string2 = this.query) != null) {
            c2 = '?';
            stringBuilder.append(c2);
            string2 = this.query;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getQuery() {
        return this.query;
    }
}

