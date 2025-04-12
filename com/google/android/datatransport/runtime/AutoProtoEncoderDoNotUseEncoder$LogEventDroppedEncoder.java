/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder
implements ObjectEncoder {
    private static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR;
    static final AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder INSTANCE;
    private static final FieldDescriptor REASON_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("eventsDroppedCount");
        EVENTSDROPPEDCOUNT_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("reason");
        REASON_DESCRIPTOR = E1.b(3, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder() {
    }

    public void encode(LogEventDropped object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = EVENTSDROPPEDCOUNT_DESCRIPTOR;
        long l2 = ((LogEventDropped)object).getEventsDroppedCount();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = REASON_DESCRIPTOR;
        object = ((LogEventDropped)object).getReason();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

