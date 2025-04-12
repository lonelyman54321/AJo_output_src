/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.Syntax$1;
import com.google.protobuf.Syntax$SyntaxVerifier;

public final class Syntax
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ Syntax[] $VALUES;
    public static final /* enum */ Syntax SYNTAX_EDITIONS;
    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final /* enum */ Syntax SYNTAX_PROTO2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final /* enum */ Syntax SYNTAX_PROTO3;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final /* enum */ Syntax UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        Syntax syntax;
        Syntax syntax2;
        Syntax syntax3;
        Object object = new Syntax("SYNTAX_PROTO2", 0, 0);
        SYNTAX_PROTO2 = object;
        int n3 = 1;
        SYNTAX_PROTO3 = syntax3 = new Syntax("SYNTAX_PROTO3", n3, n3);
        int n4 = 2;
        SYNTAX_EDITIONS = syntax2 = new Syntax("SYNTAX_EDITIONS", n4, n4);
        int n7 = 3;
        UNRECOGNIZED = syntax = new Syntax("UNRECOGNIZED", n7, -1);
        Syntax[] syntaxArray = new Syntax[4];
        syntaxArray[0] = object;
        syntaxArray[n3] = syntax3;
        syntaxArray[n4] = syntax2;
        syntaxArray[n7] = syntax;
        $VALUES = syntaxArray;
        internalValueMap = object = new Syntax$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Syntax() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Syntax forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return SYNTAX_EDITIONS;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return Syntax$SyntaxVerifier.INSTANCE;
    }

    public static Syntax valueOf(int n3) {
        return Syntax.forNumber(n3);
    }

    public static Syntax valueOf(String string2) {
        return Enum.valueOf(Syntax.class, string2);
    }

    public static Syntax[] values() {
        return (Syntax[])$VALUES.clone();
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

