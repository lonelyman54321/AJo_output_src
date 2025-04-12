/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.AutoSessionEventEncoder$AndroidApplicationInfoEncoder;
import com.google.firebase.sessions.AutoSessionEventEncoder$ApplicationInfoEncoder;
import com.google.firebase.sessions.AutoSessionEventEncoder$DataCollectionStatusEncoder;
import com.google.firebase.sessions.AutoSessionEventEncoder$ProcessDetailsEncoder;
import com.google.firebase.sessions.AutoSessionEventEncoder$SessionEventEncoder;
import com.google.firebase.sessions.AutoSessionEventEncoder$SessionInfoEncoder;
import com.google.firebase.sessions.DataCollectionStatus;
import com.google.firebase.sessions.ProcessDetails;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionInfo;

public final class AutoSessionEventEncoder
implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoSessionEventEncoder autoSessionEventEncoder = new AutoSessionEventEncoder();
        CONFIG = autoSessionEventEncoder;
    }

    private AutoSessionEventEncoder() {
    }

    public void configure(EncoderConfig encoderConfig) {
        ObjectEncoder objectEncoder = AutoSessionEventEncoder$SessionEventEncoder.INSTANCE;
        encoderConfig.registerEncoder(SessionEvent.class, objectEncoder);
        objectEncoder = AutoSessionEventEncoder$SessionInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(SessionInfo.class, objectEncoder);
        objectEncoder = AutoSessionEventEncoder$DataCollectionStatusEncoder.INSTANCE;
        encoderConfig.registerEncoder(DataCollectionStatus.class, objectEncoder);
        objectEncoder = AutoSessionEventEncoder$ApplicationInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(ApplicationInfo.class, objectEncoder);
        objectEncoder = AutoSessionEventEncoder$AndroidApplicationInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, objectEncoder);
        objectEncoder = AutoSessionEventEncoder$ProcessDetailsEncoder.INSTANCE;
        encoderConfig.registerEncoder(ProcessDetails.class, objectEncoder);
    }
}

