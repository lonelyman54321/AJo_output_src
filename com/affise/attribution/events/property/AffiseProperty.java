/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.property;

public final class AffiseProperty
extends Enum {
    private static final /* synthetic */ AffiseProperty[] $VALUES;
    public static final /* enum */ AffiseProperty DATA;
    public static final /* enum */ AffiseProperty TIMESTAMP;
    public static final /* enum */ AffiseProperty TYPE;
    private final String type;

    private static final /* synthetic */ AffiseProperty[] $values() {
        AffiseProperty affiseProperty = TIMESTAMP;
        affiseProperty = TYPE;
        affiseProperty = DATA;
        AffiseProperty[] affisePropertyArray = new AffiseProperty[]{affiseProperty, affiseProperty, affiseProperty};
        return affisePropertyArray;
    }

    static {
        AffiseProperty affiseProperty;
        TIMESTAMP = affiseProperty = new AffiseProperty("TIMESTAMP", 0, "timestamp");
        TYPE = affiseProperty = new AffiseProperty("TYPE", 1, "type");
        DATA = affiseProperty = new AffiseProperty("DATA", 2, "data");
        $VALUES = AffiseProperty.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AffiseProperty() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static AffiseProperty valueOf(String string2) {
        return Enum.valueOf(AffiseProperty.class, string2);
    }

    public static AffiseProperty[] values() {
        return (AffiseProperty[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

