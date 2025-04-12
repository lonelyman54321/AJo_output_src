/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceDescriptor$History$1;
import com.google.api.ResourceDescriptor$History$HistoryVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class ResourceDescriptor$History
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ ResourceDescriptor$History[] $VALUES;
    public static final /* enum */ ResourceDescriptor$History FUTURE_MULTI_PATTERN;
    public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
    public static final /* enum */ ResourceDescriptor$History HISTORY_UNSPECIFIED;
    public static final int HISTORY_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ ResourceDescriptor$History ORIGINALLY_SINGLE_PATTERN;
    public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
    public static final /* enum */ ResourceDescriptor$History UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        ResourceDescriptor$History resourceDescriptor$History;
        ResourceDescriptor$History resourceDescriptor$History2;
        ResourceDescriptor$History resourceDescriptor$History3;
        Object object = new ResourceDescriptor$History("HISTORY_UNSPECIFIED", 0, 0);
        HISTORY_UNSPECIFIED = object;
        int n3 = 1;
        ORIGINALLY_SINGLE_PATTERN = resourceDescriptor$History3 = new ResourceDescriptor$History("ORIGINALLY_SINGLE_PATTERN", n3, n3);
        int n4 = 2;
        FUTURE_MULTI_PATTERN = resourceDescriptor$History2 = new ResourceDescriptor$History("FUTURE_MULTI_PATTERN", n4, n4);
        int n7 = 3;
        UNRECOGNIZED = resourceDescriptor$History = new ResourceDescriptor$History("UNRECOGNIZED", n7, -1);
        ResourceDescriptor$History[] resourceDescriptor$HistoryArray = new ResourceDescriptor$History[4];
        resourceDescriptor$HistoryArray[0] = object;
        resourceDescriptor$HistoryArray[n3] = resourceDescriptor$History3;
        resourceDescriptor$HistoryArray[n4] = resourceDescriptor$History2;
        resourceDescriptor$HistoryArray[n7] = resourceDescriptor$History;
        $VALUES = resourceDescriptor$HistoryArray;
        internalValueMap = object = new ResourceDescriptor$History$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ResourceDescriptor$History() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ResourceDescriptor$History forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return FUTURE_MULTI_PATTERN;
            }
            return ORIGINALLY_SINGLE_PATTERN;
        }
        return HISTORY_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return ResourceDescriptor$History$HistoryVerifier.INSTANCE;
    }

    public static ResourceDescriptor$History valueOf(int n3) {
        return ResourceDescriptor$History.forNumber(n3);
    }

    public static ResourceDescriptor$History valueOf(String string2) {
        return Enum.valueOf(ResourceDescriptor$History.class, string2);
    }

    public static ResourceDescriptor$History[] values() {
        return (ResourceDescriptor$History[])$VALUES.clone();
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

