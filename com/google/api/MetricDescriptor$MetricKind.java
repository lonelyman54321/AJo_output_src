/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricDescriptor$MetricKind$1;
import com.google.api.MetricDescriptor$MetricKind$MetricKindVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class MetricDescriptor$MetricKind
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ MetricDescriptor$MetricKind[] $VALUES;
    public static final /* enum */ MetricDescriptor$MetricKind CUMULATIVE;
    public static final int CUMULATIVE_VALUE = 3;
    public static final /* enum */ MetricDescriptor$MetricKind DELTA;
    public static final int DELTA_VALUE = 2;
    public static final /* enum */ MetricDescriptor$MetricKind GAUGE;
    public static final int GAUGE_VALUE = 1;
    public static final /* enum */ MetricDescriptor$MetricKind METRIC_KIND_UNSPECIFIED;
    public static final int METRIC_KIND_UNSPECIFIED_VALUE;
    public static final /* enum */ MetricDescriptor$MetricKind UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        MetricDescriptor$MetricKind metricDescriptor$MetricKind;
        MetricDescriptor$MetricKind metricDescriptor$MetricKind2;
        MetricDescriptor$MetricKind metricDescriptor$MetricKind3;
        MetricDescriptor$MetricKind metricDescriptor$MetricKind4;
        Object object = new MetricDescriptor$MetricKind("METRIC_KIND_UNSPECIFIED", 0, 0);
        METRIC_KIND_UNSPECIFIED = object;
        int n3 = 1;
        GAUGE = metricDescriptor$MetricKind4 = new MetricDescriptor$MetricKind("GAUGE", n3, n3);
        int n4 = 2;
        DELTA = metricDescriptor$MetricKind3 = new MetricDescriptor$MetricKind("DELTA", n4, n4);
        int n7 = 3;
        CUMULATIVE = metricDescriptor$MetricKind2 = new MetricDescriptor$MetricKind("CUMULATIVE", n7, n7);
        int n8 = 4;
        UNRECOGNIZED = metricDescriptor$MetricKind = new MetricDescriptor$MetricKind("UNRECOGNIZED", n8, -1);
        MetricDescriptor$MetricKind[] metricDescriptor$MetricKindArray = new MetricDescriptor$MetricKind[5];
        metricDescriptor$MetricKindArray[0] = object;
        metricDescriptor$MetricKindArray[n3] = metricDescriptor$MetricKind4;
        metricDescriptor$MetricKindArray[n4] = metricDescriptor$MetricKind3;
        metricDescriptor$MetricKindArray[n7] = metricDescriptor$MetricKind2;
        metricDescriptor$MetricKindArray[n8] = metricDescriptor$MetricKind;
        $VALUES = metricDescriptor$MetricKindArray;
        internalValueMap = object = new MetricDescriptor$MetricKind$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MetricDescriptor$MetricKind() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static MetricDescriptor$MetricKind forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return CUMULATIVE;
                }
                return DELTA;
            }
            return GAUGE;
        }
        return METRIC_KIND_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return MetricDescriptor$MetricKind$MetricKindVerifier.INSTANCE;
    }

    public static MetricDescriptor$MetricKind valueOf(int n3) {
        return MetricDescriptor$MetricKind.forNumber(n3);
    }

    public static MetricDescriptor$MetricKind valueOf(String string2) {
        return Enum.valueOf(MetricDescriptor$MetricKind.class, string2);
    }

    public static MetricDescriptor$MetricKind[] values() {
        return (MetricDescriptor$MetricKind[])$VALUES.clone();
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

