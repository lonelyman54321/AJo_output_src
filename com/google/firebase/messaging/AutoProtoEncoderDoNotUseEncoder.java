/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder;
import com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder;
import com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

public final class AutoProtoEncoderDoNotUseEncoder
implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoProtoEncoderDoNotUseEncoder autoProtoEncoderDoNotUseEncoder = new AutoProtoEncoderDoNotUseEncoder();
        CONFIG = autoProtoEncoderDoNotUseEncoder;
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    public void configure(EncoderConfig encoderConfig) {
        ObjectEncoder objectEncoder = AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder.INSTANCE;
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$MessagingClientEventExtensionEncoder.INSTANCE;
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder.INSTANCE;
        encoderConfig.registerEncoder(MessagingClientEvent.class, objectEncoder);
    }
}

