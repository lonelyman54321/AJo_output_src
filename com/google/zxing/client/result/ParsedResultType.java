/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

public final class ParsedResultType
extends Enum {
    private static final /* synthetic */ ParsedResultType[] $VALUES;
    public static final /* enum */ ParsedResultType ADDRESSBOOK;
    public static final /* enum */ ParsedResultType CALENDAR;
    public static final /* enum */ ParsedResultType EMAIL_ADDRESS;
    public static final /* enum */ ParsedResultType GEO;
    public static final /* enum */ ParsedResultType ISBN;
    public static final /* enum */ ParsedResultType PRODUCT;
    public static final /* enum */ ParsedResultType SMS;
    public static final /* enum */ ParsedResultType TEL;
    public static final /* enum */ ParsedResultType TEXT;
    public static final /* enum */ ParsedResultType URI;
    public static final /* enum */ ParsedResultType VIN;
    public static final /* enum */ ParsedResultType WIFI;

    static {
        ParsedResultType parsedResultType;
        ParsedResultType parsedResultType2;
        ParsedResultType parsedResultType3;
        ParsedResultType parsedResultType4;
        ParsedResultType parsedResultType5;
        ParsedResultType parsedResultType6;
        ParsedResultType parsedResultType7;
        ParsedResultType parsedResultType8;
        ParsedResultType parsedResultType9;
        ParsedResultType parsedResultType10;
        ParsedResultType parsedResultType11;
        ParsedResultType parsedResultType12;
        ADDRESSBOOK = parsedResultType12 = new ParsedResultType("ADDRESSBOOK", 0);
        int n3 = 1;
        EMAIL_ADDRESS = parsedResultType11 = new ParsedResultType("EMAIL_ADDRESS", n3);
        PRODUCT = parsedResultType10 = new ParsedResultType("PRODUCT", 2);
        URI = parsedResultType9 = new ParsedResultType("URI", 3);
        TEXT = parsedResultType8 = new ParsedResultType("TEXT", 4);
        GEO = parsedResultType7 = new ParsedResultType("GEO", 5);
        TEL = parsedResultType6 = new ParsedResultType("TEL", 6);
        SMS = parsedResultType5 = new ParsedResultType("SMS", 7);
        CALENDAR = parsedResultType4 = new ParsedResultType("CALENDAR", 8);
        WIFI = parsedResultType3 = new ParsedResultType("WIFI", 9);
        ISBN = parsedResultType2 = new ParsedResultType("ISBN", 10);
        int n4 = 11;
        VIN = parsedResultType = new ParsedResultType("VIN", n4);
        ParsedResultType[] parsedResultTypeArray = new ParsedResultType[12];
        parsedResultTypeArray[0] = parsedResultType12;
        parsedResultTypeArray[n3] = parsedResultType11;
        parsedResultTypeArray[2] = parsedResultType10;
        parsedResultTypeArray[3] = parsedResultType9;
        parsedResultTypeArray[4] = parsedResultType8;
        parsedResultTypeArray[5] = parsedResultType7;
        parsedResultTypeArray[6] = parsedResultType6;
        parsedResultTypeArray[7] = parsedResultType5;
        parsedResultTypeArray[8] = parsedResultType4;
        parsedResultTypeArray[9] = parsedResultType3;
        parsedResultTypeArray[10] = parsedResultType2;
        parsedResultTypeArray[n4] = parsedResultType;
        $VALUES = parsedResultTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ParsedResultType() {
        void var2_-1;
        void var1_-1;
    }

    public static ParsedResultType valueOf(String string2) {
        return Enum.valueOf(ParsedResultType.class, string2);
    }

    public static ParsedResultType[] values() {
        return (ParsedResultType[])$VALUES.clone();
    }
}

