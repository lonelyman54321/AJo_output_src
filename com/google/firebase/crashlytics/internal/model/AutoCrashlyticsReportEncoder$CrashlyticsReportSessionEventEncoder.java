/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder
implements ObjectEncoder {
    private static final FieldDescriptor APP_DESCRIPTOR;
    private static final FieldDescriptor DEVICE_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder INSTANCE;
    private static final FieldDescriptor LOG_DESCRIPTOR;
    private static final FieldDescriptor ROLLOUTS_DESCRIPTOR;
    private static final FieldDescriptor TIMESTAMP_DESCRIPTOR;
    private static final FieldDescriptor TYPE_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder();
        TIMESTAMP_DESCRIPTOR = FieldDescriptor.of("timestamp");
        TYPE_DESCRIPTOR = FieldDescriptor.of("type");
        APP_DESCRIPTOR = FieldDescriptor.of("app");
        DEVICE_DESCRIPTOR = FieldDescriptor.of("device");
        LOG_DESCRIPTOR = FieldDescriptor.of("log");
        ROLLOUTS_DESCRIPTOR = FieldDescriptor.of("rollouts");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = TIMESTAMP_DESCRIPTOR;
        long l2 = ((CrashlyticsReport$Session$Event)object).getTimestamp();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = TYPE_DESCRIPTOR;
        Object object2 = ((CrashlyticsReport$Session$Event)object).getType();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APP_DESCRIPTOR;
        object2 = ((CrashlyticsReport$Session$Event)object).getApp();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = DEVICE_DESCRIPTOR;
        object2 = ((CrashlyticsReport$Session$Event)object).getDevice();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = LOG_DESCRIPTOR;
        object2 = ((CrashlyticsReport$Session$Event)object).getLog();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = ROLLOUTS_DESCRIPTOR;
        object = ((CrashlyticsReport$Session$Event)object).getRollouts();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

