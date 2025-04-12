/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;

final class AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder
implements ObjectEncoder {
    static final AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder INSTANCE;
    private static final FieldDescriptor MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR;

    static {
        AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder autoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder;
        INSTANCE = autoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder = new AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder();
        MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR = FieldDescriptor.of("messagingClientEventExtension");
    }

    private AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder() {
    }

    public void encode(ProtoEncoderDoNotUse object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR;
        object = ((ProtoEncoderDoNotUse)object).getMessagingClientEventExtension();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

