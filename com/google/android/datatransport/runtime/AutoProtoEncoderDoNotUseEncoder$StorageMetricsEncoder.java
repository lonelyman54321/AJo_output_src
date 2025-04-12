/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder
implements ObjectEncoder {
    private static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR;
    static final AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder INSTANCE;
    private static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("currentCacheSizeBytes");
        CURRENTCACHESIZEBYTES_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("maxCacheSizeBytes");
        MAXCACHESIZEBYTES_DESCRIPTOR = E1.b(2, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder() {
    }

    public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = CURRENTCACHESIZEBYTES_DESCRIPTOR;
        long l2 = storageMetrics.getCurrentCacheSizeBytes();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = MAXCACHESIZEBYTES_DESCRIPTOR;
        l2 = storageMetrics.getMaxCacheSizeBytes();
        objectEncoderContext.add(fieldDescriptor, l2);
    }
}

