/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder
implements ObjectEncoder {
    private static final FieldDescriptor CLIENTMETRICS_DESCRIPTOR;
    static final AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder INSTANCE;

    static {
        AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder autoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder;
        INSTANCE = autoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder = new AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder();
        CLIENTMETRICS_DESCRIPTOR = FieldDescriptor.of("clientMetrics");
    }

    private AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder() {
    }

    public void encode(ProtoEncoderDoNotUse object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = CLIENTMETRICS_DESCRIPTOR;
        object = ((ProtoEncoderDoNotUse)object).getClientMetrics();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

