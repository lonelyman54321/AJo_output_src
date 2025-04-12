/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

public final class ProtoSyntax
extends Enum {
    private static final /* synthetic */ ProtoSyntax[] $VALUES;
    public static final /* enum */ ProtoSyntax EDITIONS;
    public static final /* enum */ ProtoSyntax PROTO2;
    public static final /* enum */ ProtoSyntax PROTO3;

    static {
        ProtoSyntax protoSyntax;
        ProtoSyntax protoSyntax2;
        ProtoSyntax protoSyntax3;
        PROTO2 = protoSyntax3 = new ProtoSyntax("PROTO2", 0);
        int n3 = 1;
        PROTO3 = protoSyntax2 = new ProtoSyntax("PROTO3", n3);
        int n4 = 2;
        EDITIONS = protoSyntax = new ProtoSyntax("EDITIONS", n4);
        ProtoSyntax[] protoSyntaxArray = new ProtoSyntax[3];
        protoSyntaxArray[0] = protoSyntax3;
        protoSyntaxArray[n3] = protoSyntax2;
        protoSyntaxArray[n4] = protoSyntax;
        $VALUES = protoSyntaxArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ProtoSyntax() {
        void var2_-1;
        void var1_-1;
    }

    public static ProtoSyntax valueOf(String string2) {
        return Enum.valueOf(ProtoSyntax.class, string2);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[])$VALUES.clone();
    }
}

