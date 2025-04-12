/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

final class AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder
implements ObjectEncoder {
    static final AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder INSTANCE;
    private static final FieldDescriptor MESSAGINGCLIENTEVENT_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("messagingClientEvent");
        MESSAGINGCLIENTEVENT_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder() {
    }

    public void encode(MessagingClientEventExtension object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = MESSAGINGCLIENTEVENT_DESCRIPTOR;
        object = ((MessagingClientEventExtension)object).getMessagingClientEventInternal();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

