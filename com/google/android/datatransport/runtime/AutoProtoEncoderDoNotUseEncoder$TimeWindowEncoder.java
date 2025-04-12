/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder
implements ObjectEncoder {
    private static final FieldDescriptor ENDMS_DESCRIPTOR;
    static final AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder INSTANCE;
    private static final FieldDescriptor STARTMS_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("startMs");
        STARTMS_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("endMs");
        ENDMS_DESCRIPTOR = E1.b(2, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder() {
    }

    public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = STARTMS_DESCRIPTOR;
        long l2 = timeWindow.getStartMs();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = ENDMS_DESCRIPTOR;
        l2 = timeWindow.getEndMs();
        objectEncoderContext.add(fieldDescriptor, l2);
    }
}

