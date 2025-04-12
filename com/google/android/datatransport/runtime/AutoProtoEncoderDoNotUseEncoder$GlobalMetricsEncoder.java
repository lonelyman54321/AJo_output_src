/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder
implements ObjectEncoder {
    static final AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder INSTANCE;
    private static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("storageMetrics");
        STORAGEMETRICS_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder() {
    }

    public void encode(GlobalMetrics object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = STORAGEMETRICS_DESCRIPTOR;
        object = ((GlobalMetrics)object).getStorageMetricsInternal();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

