/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Field$Cardinality$1;
import com.google.protobuf.Field$Cardinality$CardinalityVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class Field$Cardinality
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ Field$Cardinality[] $VALUES;
    public static final /* enum */ Field$Cardinality CARDINALITY_OPTIONAL;
    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final /* enum */ Field$Cardinality CARDINALITY_REPEATED;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final /* enum */ Field$Cardinality CARDINALITY_REQUIRED;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final /* enum */ Field$Cardinality CARDINALITY_UNKNOWN;
    public static final int CARDINALITY_UNKNOWN_VALUE;
    public static final /* enum */ Field$Cardinality UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        Field$Cardinality field$Cardinality;
        Field$Cardinality field$Cardinality2;
        Field$Cardinality field$Cardinality3;
        Field$Cardinality field$Cardinality4;
        Object object = new Field$Cardinality("CARDINALITY_UNKNOWN", 0, 0);
        CARDINALITY_UNKNOWN = object;
        int n3 = 1;
        CARDINALITY_OPTIONAL = field$Cardinality4 = new Field$Cardinality("CARDINALITY_OPTIONAL", n3, n3);
        int n4 = 2;
        CARDINALITY_REQUIRED = field$Cardinality3 = new Field$Cardinality("CARDINALITY_REQUIRED", n4, n4);
        int n7 = 3;
        CARDINALITY_REPEATED = field$Cardinality2 = new Field$Cardinality("CARDINALITY_REPEATED", n7, n7);
        int n8 = 4;
        UNRECOGNIZED = field$Cardinality = new Field$Cardinality("UNRECOGNIZED", n8, -1);
        Field$Cardinality[] field$CardinalityArray = new Field$Cardinality[5];
        field$CardinalityArray[0] = object;
        field$CardinalityArray[n3] = field$Cardinality4;
        field$CardinalityArray[n4] = field$Cardinality3;
        field$CardinalityArray[n7] = field$Cardinality2;
        field$CardinalityArray[n8] = field$Cardinality;
        $VALUES = field$CardinalityArray;
        internalValueMap = object = new Field$Cardinality$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Field$Cardinality() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Field$Cardinality forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return CARDINALITY_REPEATED;
                }
                return CARDINALITY_REQUIRED;
            }
            return CARDINALITY_OPTIONAL;
        }
        return CARDINALITY_UNKNOWN;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return Field$Cardinality$CardinalityVerifier.INSTANCE;
    }

    public static Field$Cardinality valueOf(int n3) {
        return Field$Cardinality.forNumber(n3);
    }

    public static Field$Cardinality valueOf(String string2) {
        return Enum.valueOf(Field$Cardinality.class, string2);
    }

    public static Field$Cardinality[] values() {
        return (Field$Cardinality[])$VALUES.clone();
    }

    public final int getNumber() {
        Object object = UNRECOGNIZED;
        if (this != object) {
            return this.value;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

