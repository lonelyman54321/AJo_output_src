/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder
implements ObjectEncoder {
    private static final FieldDescriptor APPNAMESPACE_DESCRIPTOR;
    private static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR;
    static final AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder INSTANCE;
    private static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR;
    private static final FieldDescriptor WINDOW_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("window");
        WINDOW_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("logSourceMetrics");
        LOGSOURCEMETRICS_DESCRIPTOR = E1.b(2, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("globalMetrics");
        GLOBALMETRICS_DESCRIPTOR = E1.b(3, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("appNamespace");
        APPNAMESPACE_DESCRIPTOR = E1.b(4, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder() {
    }

    public void encode(ClientMetrics object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = WINDOW_DESCRIPTOR;
        Object object2 = ((ClientMetrics)object).getWindowInternal();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = LOGSOURCEMETRICS_DESCRIPTOR;
        object2 = ((ClientMetrics)object).getLogSourceMetricsList();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = GLOBALMETRICS_DESCRIPTOR;
        object2 = ((ClientMetrics)object).getGlobalMetricsInternal();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPNAMESPACE_DESCRIPTOR;
        object = ((ClientMetrics)object).getAppNamespace();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

