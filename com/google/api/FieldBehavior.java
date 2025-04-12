/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.FieldBehavior$1;
import com.google.api.FieldBehavior$FieldBehaviorVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class FieldBehavior
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ FieldBehavior[] $VALUES;
    public static final /* enum */ FieldBehavior FIELD_BEHAVIOR_UNSPECIFIED;
    public static final int FIELD_BEHAVIOR_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ FieldBehavior IMMUTABLE;
    public static final int IMMUTABLE_VALUE = 5;
    public static final /* enum */ FieldBehavior INPUT_ONLY;
    public static final int INPUT_ONLY_VALUE = 4;
    public static final /* enum */ FieldBehavior OPTIONAL;
    public static final int OPTIONAL_VALUE = 1;
    public static final /* enum */ FieldBehavior OUTPUT_ONLY;
    public static final int OUTPUT_ONLY_VALUE = 3;
    public static final /* enum */ FieldBehavior REQUIRED;
    public static final int REQUIRED_VALUE = 2;
    public static final /* enum */ FieldBehavior UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        FieldBehavior fieldBehavior;
        FieldBehavior fieldBehavior2;
        FieldBehavior fieldBehavior3;
        FieldBehavior fieldBehavior4;
        FieldBehavior fieldBehavior5;
        FieldBehavior fieldBehavior6;
        Object object = new FieldBehavior("FIELD_BEHAVIOR_UNSPECIFIED", 0, 0);
        FIELD_BEHAVIOR_UNSPECIFIED = object;
        int n3 = 1;
        OPTIONAL = fieldBehavior6 = new FieldBehavior("OPTIONAL", n3, n3);
        int n4 = 2;
        REQUIRED = fieldBehavior5 = new FieldBehavior("REQUIRED", n4, n4);
        int n7 = 3;
        OUTPUT_ONLY = fieldBehavior4 = new FieldBehavior("OUTPUT_ONLY", n7, n7);
        int n8 = 4;
        INPUT_ONLY = fieldBehavior3 = new FieldBehavior("INPUT_ONLY", n8, n8);
        int n10 = 5;
        IMMUTABLE = fieldBehavior2 = new FieldBehavior("IMMUTABLE", n10, n10);
        int n14 = 6;
        UNRECOGNIZED = fieldBehavior = new FieldBehavior("UNRECOGNIZED", n14, -1);
        FieldBehavior[] fieldBehaviorArray = new FieldBehavior[7];
        fieldBehaviorArray[0] = object;
        fieldBehaviorArray[n3] = fieldBehavior6;
        fieldBehaviorArray[n4] = fieldBehavior5;
        fieldBehaviorArray[n7] = fieldBehavior4;
        fieldBehaviorArray[n8] = fieldBehavior3;
        fieldBehaviorArray[n10] = fieldBehavior2;
        fieldBehaviorArray[n14] = fieldBehavior;
        $VALUES = fieldBehaviorArray;
        internalValueMap = object = new FieldBehavior$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FieldBehavior() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static FieldBehavior forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                return null;
                            }
                            return IMMUTABLE;
                        }
                        return INPUT_ONLY;
                    }
                    return OUTPUT_ONLY;
                }
                return REQUIRED;
            }
            return OPTIONAL;
        }
        return FIELD_BEHAVIOR_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return FieldBehavior$FieldBehaviorVerifier.INSTANCE;
    }

    public static FieldBehavior valueOf(int n3) {
        return FieldBehavior.forNumber(n3);
    }

    public static FieldBehavior valueOf(String string2) {
        return Enum.valueOf(FieldBehavior.class, string2);
    }

    public static FieldBehavior[] values() {
        return (FieldBehavior[])$VALUES.clone();
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

