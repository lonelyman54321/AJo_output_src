/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder
implements ObjectEncoder {
    private static final FieldDescriptor DEFAULTPROCESS_DESCRIPTOR;
    private static final FieldDescriptor IMPORTANCE_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder INSTANCE;
    private static final FieldDescriptor PID_DESCRIPTOR;
    private static final FieldDescriptor PROCESSNAME_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();
        PROCESSNAME_DESCRIPTOR = FieldDescriptor.of("processName");
        PID_DESCRIPTOR = FieldDescriptor.of("pid");
        IMPORTANCE_DESCRIPTOR = FieldDescriptor.of("importance");
        DEFAULTPROCESS_DESCRIPTOR = FieldDescriptor.of("defaultProcess");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event$Application$ProcessDetails crashlyticsReport$Session$Event$Application$ProcessDetails, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PROCESSNAME_DESCRIPTOR;
        String string2 = crashlyticsReport$Session$Event$Application$ProcessDetails.getProcessName();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = PID_DESCRIPTOR;
        int n3 = crashlyticsReport$Session$Event$Application$ProcessDetails.getPid();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = IMPORTANCE_DESCRIPTOR;
        n3 = crashlyticsReport$Session$Event$Application$ProcessDetails.getImportance();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = DEFAULTPROCESS_DESCRIPTOR;
        boolean bl2 = crashlyticsReport$Session$Event$Application$ProcessDetails.isDefaultProcess();
        objectEncoderContext.add(fieldDescriptor, bl2);
    }
}

