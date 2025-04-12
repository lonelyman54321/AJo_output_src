/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.rpc.Code$1;
import com.google.rpc.Code$CodeVerifier;

public final class Code
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ Code[] $VALUES;
    public static final /* enum */ Code ABORTED;
    public static final int ABORTED_VALUE = 10;
    public static final /* enum */ Code ALREADY_EXISTS;
    public static final int ALREADY_EXISTS_VALUE = 6;
    public static final /* enum */ Code CANCELLED;
    public static final int CANCELLED_VALUE = 1;
    public static final /* enum */ Code DATA_LOSS;
    public static final int DATA_LOSS_VALUE = 15;
    public static final /* enum */ Code DEADLINE_EXCEEDED;
    public static final int DEADLINE_EXCEEDED_VALUE = 4;
    public static final /* enum */ Code FAILED_PRECONDITION;
    public static final int FAILED_PRECONDITION_VALUE = 9;
    public static final /* enum */ Code INTERNAL;
    public static final int INTERNAL_VALUE = 13;
    public static final /* enum */ Code INVALID_ARGUMENT;
    public static final int INVALID_ARGUMENT_VALUE = 3;
    public static final /* enum */ Code NOT_FOUND;
    public static final int NOT_FOUND_VALUE = 5;
    public static final /* enum */ Code OK;
    public static final int OK_VALUE = 0;
    public static final /* enum */ Code OUT_OF_RANGE;
    public static final int OUT_OF_RANGE_VALUE = 11;
    public static final /* enum */ Code PERMISSION_DENIED;
    public static final int PERMISSION_DENIED_VALUE = 7;
    public static final /* enum */ Code RESOURCE_EXHAUSTED;
    public static final int RESOURCE_EXHAUSTED_VALUE = 8;
    public static final /* enum */ Code UNAUTHENTICATED;
    public static final int UNAUTHENTICATED_VALUE = 16;
    public static final /* enum */ Code UNAVAILABLE;
    public static final int UNAVAILABLE_VALUE = 14;
    public static final /* enum */ Code UNIMPLEMENTED;
    public static final int UNIMPLEMENTED_VALUE = 12;
    public static final /* enum */ Code UNKNOWN;
    public static final int UNKNOWN_VALUE = 2;
    public static final /* enum */ Code UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        Code code;
        Code code2;
        Code code3;
        Code code4;
        Code code5;
        Code code6;
        Code code7;
        Code code8;
        Code code9;
        Code code10;
        Code code11;
        Code code12;
        Code code13;
        Code code14;
        Object object = new Code("OK", 0, 0);
        OK = object;
        int n3 = 1;
        CANCELLED = code14 = new Code("CANCELLED", n3, n3);
        int n4 = 2;
        UNKNOWN = code13 = new Code("UNKNOWN", n4, n4);
        int n7 = 3;
        INVALID_ARGUMENT = code12 = new Code("INVALID_ARGUMENT", n7, n7);
        int n8 = 4;
        DEADLINE_EXCEEDED = code11 = new Code("DEADLINE_EXCEEDED", n8, n8);
        int n10 = 5;
        NOT_FOUND = code10 = new Code("NOT_FOUND", n10, n10);
        int n14 = 6;
        ALREADY_EXISTS = code9 = new Code("ALREADY_EXISTS", n14, n14);
        n14 = 7;
        PERMISSION_DENIED = code8 = new Code("PERMISSION_DENIED", n14, n14);
        n10 = 8;
        UNAUTHENTICATED = code7 = new Code("UNAUTHENTICATED", n10, 16);
        n4 = 9;
        RESOURCE_EXHAUSTED = code6 = new Code("RESOURCE_EXHAUSTED", n4, n10);
        n3 = 10;
        FAILED_PRECONDITION = code5 = new Code("FAILED_PRECONDITION", n3, n4);
        int n15 = 11;
        ABORTED = code4 = new Code("ABORTED", n15, n3);
        n8 = 12;
        OUT_OF_RANGE = code3 = new Code("OUT_OF_RANGE", n8, n15);
        Code code15 = code3;
        n4 = 13;
        UNIMPLEMENTED = code2 = new Code("UNIMPLEMENTED", n4, n8);
        Code code16 = code2;
        n3 = 14;
        Code[] codeArray = new Code("INTERNAL", n3, n4);
        INTERNAL = codeArray;
        Code[] codeArray2 = codeArray;
        n15 = 15;
        UNAVAILABLE = code = new Code("UNAVAILABLE", n15, n3);
        DATA_LOSS = code3 = new Code("DATA_LOSS", 16, n15);
        n8 = 17;
        UNRECOGNIZED = code2 = new Code("UNRECOGNIZED", n8, -1);
        codeArray = new Code[18];
        codeArray[0] = object;
        codeArray[1] = code14;
        codeArray[2] = code13;
        codeArray[3] = code12;
        codeArray[4] = code11;
        codeArray[5] = code10;
        codeArray[6] = code9;
        codeArray[7] = code8;
        codeArray[8] = code7;
        codeArray[9] = code6;
        codeArray[10] = code5;
        codeArray[11] = code4;
        codeArray[12] = code15;
        codeArray[13] = code16;
        codeArray[14] = codeArray2;
        codeArray[15] = code;
        codeArray[16] = code3;
        codeArray[n8] = code2;
        $VALUES = codeArray;
        internalValueMap = object = new Code$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Code() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Code forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 16: {
                return UNAUTHENTICATED;
            }
            case 15: {
                return DATA_LOSS;
            }
            case 14: {
                return UNAVAILABLE;
            }
            case 13: {
                return INTERNAL;
            }
            case 12: {
                return UNIMPLEMENTED;
            }
            case 11: {
                return OUT_OF_RANGE;
            }
            case 10: {
                return ABORTED;
            }
            case 9: {
                return FAILED_PRECONDITION;
            }
            case 8: {
                return RESOURCE_EXHAUSTED;
            }
            case 7: {
                return PERMISSION_DENIED;
            }
            case 6: {
                return ALREADY_EXISTS;
            }
            case 5: {
                return NOT_FOUND;
            }
            case 4: {
                return DEADLINE_EXCEEDED;
            }
            case 3: {
                return INVALID_ARGUMENT;
            }
            case 2: {
                return UNKNOWN;
            }
            case 1: {
                return CANCELLED;
            }
            case 0: 
        }
        return OK;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return Code$CodeVerifier.INSTANCE;
    }

    public static Code valueOf(int n3) {
        return Code.forNumber(n3);
    }

    public static Code valueOf(String string2) {
        return Enum.valueOf(Code.class, string2);
    }

    public static Code[] values() {
        return (Code[])$VALUES.clone();
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

