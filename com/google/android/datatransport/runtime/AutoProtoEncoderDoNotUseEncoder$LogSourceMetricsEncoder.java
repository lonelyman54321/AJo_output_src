/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder
implements ObjectEncoder {
    static final AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder INSTANCE;
    private static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR;
    private static final FieldDescriptor LOGSOURCE_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("logSource");
        LOGSOURCE_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("logEventDropped");
        LOGEVENTDROPPED_DESCRIPTOR = E1.b(2, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder() {
    }

    public void encode(LogSourceMetrics object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = LOGSOURCE_DESCRIPTOR;
        String string2 = ((LogSourceMetrics)object).getLogSource();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = LOGEVENTDROPPED_DESCRIPTOR;
        object = ((LogSourceMetrics)object).getLogEventDroppedList();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

