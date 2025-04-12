/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder
implements ObjectEncoder {
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder INSTANCE;
    private static final FieldDescriptor PARAMETERKEY_DESCRIPTOR;
    private static final FieldDescriptor PARAMETERVALUE_DESCRIPTOR;
    private static final FieldDescriptor ROLLOUTVARIANT_DESCRIPTOR;
    private static final FieldDescriptor TEMPLATEVERSION_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder();
        ROLLOUTVARIANT_DESCRIPTOR = FieldDescriptor.of("rolloutVariant");
        PARAMETERKEY_DESCRIPTOR = FieldDescriptor.of("parameterKey");
        PARAMETERVALUE_DESCRIPTOR = FieldDescriptor.of("parameterValue");
        TEMPLATEVERSION_DESCRIPTOR = FieldDescriptor.of("templateVersion");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event$RolloutAssignment crashlyticsReport$Session$Event$RolloutAssignment, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ROLLOUTVARIANT_DESCRIPTOR;
        Object object = crashlyticsReport$Session$Event$RolloutAssignment.getRolloutVariant();
        objectEncoderContext.add(fieldDescriptor, object);
        fieldDescriptor = PARAMETERKEY_DESCRIPTOR;
        object = crashlyticsReport$Session$Event$RolloutAssignment.getParameterKey();
        objectEncoderContext.add(fieldDescriptor, object);
        fieldDescriptor = PARAMETERVALUE_DESCRIPTOR;
        object = crashlyticsReport$Session$Event$RolloutAssignment.getParameterValue();
        objectEncoderContext.add(fieldDescriptor, object);
        fieldDescriptor = TEMPLATEVERSION_DESCRIPTOR;
        long l2 = crashlyticsReport$Session$Event$RolloutAssignment.getTemplateVersion();
        objectEncoderContext.add(fieldDescriptor, l2);
    }
}

