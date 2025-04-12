/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;
import com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.OutputStream;

public abstract class ProtoEncoderDoNotUse {
    private static final ProtobufEncoder ENCODER;

    static {
        ProtobufEncoder$Builder protobufEncoder$Builder = ProtobufEncoder.builder();
        Configurator configurator = AutoProtoEncoderDoNotUseEncoder.CONFIG;
        ENCODER = protobufEncoder$Builder.configureWith(configurator).build();
    }

    private ProtoEncoderDoNotUse() {
    }

    public static void encode(Object object, OutputStream outputStream) {
        ENCODER.encode(object, outputStream);
    }

    public static byte[] encode(Object object) {
        return ENCODER.encode(object);
    }

    public abstract MessagingClientEventExtension getMessagingClientEventExtension();
}

