/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricDescriptor$ValueType;
import com.google.protobuf.Internal$EnumVerifier;

final class MetricDescriptor$ValueType$ValueTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        MetricDescriptor$ValueType$ValueTypeVerifier metricDescriptor$ValueType$ValueTypeVerifier = new MetricDescriptor$ValueType$ValueTypeVerifier();
        INSTANCE = metricDescriptor$ValueType$ValueTypeVerifier;
    }

    private MetricDescriptor$ValueType$ValueTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        MetricDescriptor$ValueType metricDescriptor$ValueType = MetricDescriptor$ValueType.forNumber(n3);
        if (metricDescriptor$ValueType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            metricDescriptor$ValueType = null;
        }
        return n3 != 0;
    }
}

