/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.BackendRule$PathTranslation$1;
import com.google.api.BackendRule$PathTranslation$PathTranslationVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class BackendRule$PathTranslation
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ BackendRule$PathTranslation[] $VALUES;
    public static final /* enum */ BackendRule$PathTranslation APPEND_PATH_TO_ADDRESS;
    public static final int APPEND_PATH_TO_ADDRESS_VALUE = 2;
    public static final /* enum */ BackendRule$PathTranslation CONSTANT_ADDRESS;
    public static final int CONSTANT_ADDRESS_VALUE = 1;
    public static final /* enum */ BackendRule$PathTranslation PATH_TRANSLATION_UNSPECIFIED;
    public static final int PATH_TRANSLATION_UNSPECIFIED_VALUE;
    public static final /* enum */ BackendRule$PathTranslation UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        BackendRule$PathTranslation backendRule$PathTranslation;
        BackendRule$PathTranslation backendRule$PathTranslation2;
        BackendRule$PathTranslation backendRule$PathTranslation3;
        Object object = new BackendRule$PathTranslation("PATH_TRANSLATION_UNSPECIFIED", 0, 0);
        PATH_TRANSLATION_UNSPECIFIED = object;
        int n3 = 1;
        CONSTANT_ADDRESS = backendRule$PathTranslation3 = new BackendRule$PathTranslation("CONSTANT_ADDRESS", n3, n3);
        int n4 = 2;
        APPEND_PATH_TO_ADDRESS = backendRule$PathTranslation2 = new BackendRule$PathTranslation("APPEND_PATH_TO_ADDRESS", n4, n4);
        int n7 = 3;
        UNRECOGNIZED = backendRule$PathTranslation = new BackendRule$PathTranslation("UNRECOGNIZED", n7, -1);
        BackendRule$PathTranslation[] backendRule$PathTranslationArray = new BackendRule$PathTranslation[4];
        backendRule$PathTranslationArray[0] = object;
        backendRule$PathTranslationArray[n3] = backendRule$PathTranslation3;
        backendRule$PathTranslationArray[n4] = backendRule$PathTranslation2;
        backendRule$PathTranslationArray[n7] = backendRule$PathTranslation;
        $VALUES = backendRule$PathTranslationArray;
        internalValueMap = object = new BackendRule$PathTranslation$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BackendRule$PathTranslation() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static BackendRule$PathTranslation forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return APPEND_PATH_TO_ADDRESS;
            }
            return CONSTANT_ADDRESS;
        }
        return PATH_TRANSLATION_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return BackendRule$PathTranslation$PathTranslationVerifier.INSTANCE;
    }

    public static BackendRule$PathTranslation valueOf(int n3) {
        return BackendRule$PathTranslation.forNumber(n3);
    }

    public static BackendRule$PathTranslation valueOf(String string2) {
        return Enum.valueOf(BackendRule$PathTranslation.class, string2);
    }

    public static BackendRule$PathTranslation[] values() {
        return (BackendRule$PathTranslation[])$VALUES.clone();
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

