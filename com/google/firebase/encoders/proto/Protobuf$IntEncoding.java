/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

public final class Protobuf$IntEncoding
extends Enum {
    private static final /* synthetic */ Protobuf$IntEncoding[] $VALUES;
    public static final /* enum */ Protobuf$IntEncoding DEFAULT;
    public static final /* enum */ Protobuf$IntEncoding FIXED;
    public static final /* enum */ Protobuf$IntEncoding SIGNED;

    static {
        Protobuf$IntEncoding protobuf$IntEncoding;
        Protobuf$IntEncoding protobuf$IntEncoding2;
        Protobuf$IntEncoding protobuf$IntEncoding3;
        DEFAULT = protobuf$IntEncoding3 = new Protobuf$IntEncoding("DEFAULT", 0);
        int n3 = 1;
        SIGNED = protobuf$IntEncoding2 = new Protobuf$IntEncoding("SIGNED", n3);
        int n4 = 2;
        FIXED = protobuf$IntEncoding = new Protobuf$IntEncoding("FIXED", n4);
        Protobuf$IntEncoding[] protobuf$IntEncodingArray = new Protobuf$IntEncoding[3];
        protobuf$IntEncodingArray[0] = protobuf$IntEncoding3;
        protobuf$IntEncodingArray[n3] = protobuf$IntEncoding2;
        protobuf$IntEncodingArray[n4] = protobuf$IntEncoding;
        $VALUES = protobuf$IntEncodingArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Protobuf$IntEncoding() {
        void var2_-1;
        void var1_-1;
    }

    public static Protobuf$IntEncoding valueOf(String string2) {
        return Enum.valueOf(Protobuf$IntEncoding.class, string2);
    }

    public static Protobuf$IntEncoding[] values() {
        return (Protobuf$IntEncoding[])$VALUES.clone();
    }
}

