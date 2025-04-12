/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;
import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder;
import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder;
import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder;
import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder;
import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder;
import com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder;
import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

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
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder.INSTANCE;
        encoderConfig.registerEncoder(ClientMetrics.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder.INSTANCE;
        encoderConfig.registerEncoder(TimeWindow.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogSourceMetrics.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogEventDropped.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder.INSTANCE;
        encoderConfig.registerEncoder(GlobalMetrics.class, objectEncoder);
        objectEncoder = AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder.INSTANCE;
        encoderConfig.registerEncoder(StorageMetrics.class, objectEncoder);
    }
}

