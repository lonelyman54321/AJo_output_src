/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricDescriptor$MetricKind;
import com.google.protobuf.Internal$EnumVerifier;

final class MetricDescriptor$MetricKind$MetricKindVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        MetricDescriptor$MetricKind$MetricKindVerifier metricDescriptor$MetricKind$MetricKindVerifier = new MetricDescriptor$MetricKind$MetricKindVerifier();
        INSTANCE = metricDescriptor$MetricKind$MetricKindVerifier;
    }

    private MetricDescriptor$MetricKind$MetricKindVerifier() {
    }

    public boolean isInRange(int n3) {
        MetricDescriptor$MetricKind metricDescriptor$MetricKind = MetricDescriptor$MetricKind.forNumber(n3);
        if (metricDescriptor$MetricKind != null) {
            n3 = 1;
        } else {
            n3 = 0;
            metricDescriptor$MetricKind = null;
        }
        return n3 != 0;
    }
}

