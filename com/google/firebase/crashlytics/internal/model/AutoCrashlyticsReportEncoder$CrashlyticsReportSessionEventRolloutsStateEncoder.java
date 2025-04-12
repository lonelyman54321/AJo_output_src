/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder
implements ObjectEncoder {
    private static final FieldDescriptor ASSIGNMENTS_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder INSTANCE;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder();
        ASSIGNMENTS_DESCRIPTOR = FieldDescriptor.of("assignments");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutsStateEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event$RolloutsState object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ASSIGNMENTS_DESCRIPTOR;
        object = ((CrashlyticsReport$Session$Event$RolloutsState)object).getRolloutAssignments();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

