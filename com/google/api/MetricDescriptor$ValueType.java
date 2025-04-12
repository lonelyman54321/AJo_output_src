/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricDescriptor$ValueType$1;
import com.google.api.MetricDescriptor$ValueType$ValueTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class MetricDescriptor$ValueType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ MetricDescriptor$ValueType[] $VALUES;
    public static final /* enum */ MetricDescriptor$ValueType BOOL;
    public static final int BOOL_VALUE = 1;
    public static final /* enum */ MetricDescriptor$ValueType DISTRIBUTION;
    public static final int DISTRIBUTION_VALUE = 5;
    public static final /* enum */ MetricDescriptor$ValueType DOUBLE;
    public static final int DOUBLE_VALUE = 3;
    public static final /* enum */ MetricDescriptor$ValueType INT64;
    public static final int INT64_VALUE = 2;
    public static final /* enum */ MetricDescriptor$ValueType MONEY;
    public static final int MONEY_VALUE = 6;
    public static final /* enum */ MetricDescriptor$ValueType STRING;
    public static final int STRING_VALUE = 4;
    public static final /* enum */ MetricDescriptor$ValueType UNRECOGNIZED;
    public static final /* enum */ MetricDescriptor$ValueType VALUE_TYPE_UNSPECIFIED;
    public static final int VALUE_TYPE_UNSPECIFIED_VALUE;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        MetricDescriptor$ValueType metricDescriptor$ValueType;
        MetricDescriptor$ValueType metricDescriptor$ValueType2;
        MetricDescriptor$ValueType metricDescriptor$ValueType3;
        MetricDescriptor$ValueType metricDescriptor$ValueType4;
        MetricDescriptor$ValueType metricDescriptor$ValueType5;
        MetricDescriptor$ValueType metricDescriptor$ValueType6;
        MetricDescriptor$ValueType metricDescriptor$ValueType7;
        Object object = new MetricDescriptor$ValueType("VALUE_TYPE_UNSPECIFIED", 0, 0);
        VALUE_TYPE_UNSPECIFIED = object;
        int n3 = 1;
        BOOL = metricDescriptor$ValueType7 = new MetricDescriptor$ValueType("BOOL", n3, n3);
        int n4 = 2;
        INT64 = metricDescriptor$ValueType6 = new MetricDescriptor$ValueType("INT64", n4, n4);
        int n7 = 3;
        DOUBLE = metricDescriptor$ValueType5 = new MetricDescriptor$ValueType("DOUBLE", n7, n7);
        int n8 = 4;
        STRING = metricDescriptor$ValueType4 = new MetricDescriptor$ValueType("STRING", n8, n8);
        int n10 = 5;
        DISTRIBUTION = metricDescriptor$ValueType3 = new MetricDescriptor$ValueType("DISTRIBUTION", n10, n10);
        int n14 = 6;
        MONEY = metricDescriptor$ValueType2 = new MetricDescriptor$ValueType("MONEY", n14, n14);
        int n15 = 7;
        UNRECOGNIZED = metricDescriptor$ValueType = new MetricDescriptor$ValueType("UNRECOGNIZED", n15, -1);
        MetricDescriptor$ValueType[] metricDescriptor$ValueTypeArray = new MetricDescriptor$ValueType[8];
        metricDescriptor$ValueTypeArray[0] = object;
        metricDescriptor$ValueTypeArray[n3] = metricDescriptor$ValueType7;
        metricDescriptor$ValueTypeArray[n4] = metricDescriptor$ValueType6;
        metricDescriptor$ValueTypeArray[n7] = metricDescriptor$ValueType5;
        metricDescriptor$ValueTypeArray[n8] = metricDescriptor$ValueType4;
        metricDescriptor$ValueTypeArray[5] = metricDescriptor$ValueType3;
        metricDescriptor$ValueTypeArray[6] = metricDescriptor$ValueType2;
        metricDescriptor$ValueTypeArray[n15] = metricDescriptor$ValueType;
        $VALUES = metricDescriptor$ValueTypeArray;
        internalValueMap = object = new MetricDescriptor$ValueType$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MetricDescriptor$ValueType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static MetricDescriptor$ValueType forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 6: {
                return MONEY;
            }
            case 5: {
                return DISTRIBUTION;
            }
            case 4: {
                return STRING;
            }
            case 3: {
                return DOUBLE;
            }
            case 2: {
                return INT64;
            }
            case 1: {
                return BOOL;
            }
            case 0: 
        }
        return VALUE_TYPE_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return MetricDescriptor$ValueType$ValueTypeVerifier.INSTANCE;
    }

    public static MetricDescriptor$ValueType valueOf(int n3) {
        return MetricDescriptor$ValueType.forNumber(n3);
    }

    public static MetricDescriptor$ValueType valueOf(String string2) {
        return Enum.valueOf(MetricDescriptor$ValueType.class, string2);
    }

    public static MetricDescriptor$ValueType[] values() {
        return (MetricDescriptor$ValueType[])$VALUES.clone();
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

