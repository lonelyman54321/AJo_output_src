/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.sessions.DataCollectionState;
import com.google.firebase.sessions.DataCollectionStatus;

final class AutoSessionEventEncoder$DataCollectionStatusEncoder
implements ObjectEncoder {
    private static final FieldDescriptor CRASHLYTICS_DESCRIPTOR;
    static final AutoSessionEventEncoder$DataCollectionStatusEncoder INSTANCE;
    private static final FieldDescriptor PERFORMANCE_DESCRIPTOR;
    private static final FieldDescriptor SESSIONSAMPLINGRATE_DESCRIPTOR;

    static {
        AutoSessionEventEncoder$DataCollectionStatusEncoder autoSessionEventEncoder$DataCollectionStatusEncoder;
        INSTANCE = autoSessionEventEncoder$DataCollectionStatusEncoder = new AutoSessionEventEncoder$DataCollectionStatusEncoder();
        PERFORMANCE_DESCRIPTOR = FieldDescriptor.of("performance");
        CRASHLYTICS_DESCRIPTOR = FieldDescriptor.of("crashlytics");
        SESSIONSAMPLINGRATE_DESCRIPTOR = FieldDescriptor.of("sessionSamplingRate");
    }

    private AutoSessionEventEncoder$DataCollectionStatusEncoder() {
    }

    public void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PERFORMANCE_DESCRIPTOR;
        DataCollectionState dataCollectionState = dataCollectionStatus.getPerformance();
        objectEncoderContext.add(fieldDescriptor, (Object)dataCollectionState);
        fieldDescriptor = CRASHLYTICS_DESCRIPTOR;
        dataCollectionState = dataCollectionStatus.getCrashlytics();
        objectEncoderContext.add(fieldDescriptor, (Object)dataCollectionState);
        fieldDescriptor = SESSIONSAMPLINGRATE_DESCRIPTOR;
        double d2 = dataCollectionStatus.getSessionSamplingRate();
        objectEncoderContext.add(fieldDescriptor, d2);
    }
}

