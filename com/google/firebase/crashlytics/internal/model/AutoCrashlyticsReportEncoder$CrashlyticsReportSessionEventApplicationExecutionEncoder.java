/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder
implements ObjectEncoder {
    private static final FieldDescriptor APPEXITINFO_DESCRIPTOR;
    private static final FieldDescriptor BINARIES_DESCRIPTOR;
    private static final FieldDescriptor EXCEPTION_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE;
    private static final FieldDescriptor SIGNAL_DESCRIPTOR;
    private static final FieldDescriptor THREADS_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder();
        THREADS_DESCRIPTOR = FieldDescriptor.of("threads");
        EXCEPTION_DESCRIPTOR = FieldDescriptor.of("exception");
        APPEXITINFO_DESCRIPTOR = FieldDescriptor.of("appExitInfo");
        SIGNAL_DESCRIPTOR = FieldDescriptor.of("signal");
        BINARIES_DESCRIPTOR = FieldDescriptor.of("binaries");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionEncoder() {
    }

    public void encode(CrashlyticsReport$Session$Event$Application$Execution object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = THREADS_DESCRIPTOR;
        Object object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getThreads();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = EXCEPTION_DESCRIPTOR;
        object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getException();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPEXITINFO_DESCRIPTOR;
        object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getAppExitInfo();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SIGNAL_DESCRIPTOR;
        object2 = ((CrashlyticsReport$Session$Event$Application$Execution)object).getSignal();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = BINARIES_DESCRIPTOR;
        object = ((CrashlyticsReport$Session$Event$Application$Execution)object).getBinaries();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

