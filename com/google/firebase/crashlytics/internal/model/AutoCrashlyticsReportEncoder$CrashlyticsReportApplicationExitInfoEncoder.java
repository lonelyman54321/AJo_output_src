/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder
implements ObjectEncoder {
    private static final FieldDescriptor BUILDIDMAPPINGFORARCH_DESCRIPTOR;
    private static final FieldDescriptor IMPORTANCE_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder INSTANCE;
    private static final FieldDescriptor PID_DESCRIPTOR;
    private static final FieldDescriptor PROCESSNAME_DESCRIPTOR;
    private static final FieldDescriptor PSS_DESCRIPTOR;
    private static final FieldDescriptor REASONCODE_DESCRIPTOR;
    private static final FieldDescriptor RSS_DESCRIPTOR;
    private static final FieldDescriptor TIMESTAMP_DESCRIPTOR;
    private static final FieldDescriptor TRACEFILE_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder autoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder();
        PID_DESCRIPTOR = FieldDescriptor.of("pid");
        PROCESSNAME_DESCRIPTOR = FieldDescriptor.of("processName");
        REASONCODE_DESCRIPTOR = FieldDescriptor.of("reasonCode");
        IMPORTANCE_DESCRIPTOR = FieldDescriptor.of("importance");
        PSS_DESCRIPTOR = FieldDescriptor.of("pss");
        RSS_DESCRIPTOR = FieldDescriptor.of("rss");
        TIMESTAMP_DESCRIPTOR = FieldDescriptor.of("timestamp");
        TRACEFILE_DESCRIPTOR = FieldDescriptor.of("traceFile");
        BUILDIDMAPPINGFORARCH_DESCRIPTOR = FieldDescriptor.of("buildIdMappingForArch");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoEncoder() {
    }

    public void encode(CrashlyticsReport$ApplicationExitInfo object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PID_DESCRIPTOR;
        int n3 = ((CrashlyticsReport$ApplicationExitInfo)object).getPid();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = PROCESSNAME_DESCRIPTOR;
        String string2 = ((CrashlyticsReport$ApplicationExitInfo)object).getProcessName();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = REASONCODE_DESCRIPTOR;
        n3 = ((CrashlyticsReport$ApplicationExitInfo)object).getReasonCode();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = IMPORTANCE_DESCRIPTOR;
        n3 = ((CrashlyticsReport$ApplicationExitInfo)object).getImportance();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = PSS_DESCRIPTOR;
        long l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getPss();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = RSS_DESCRIPTOR;
        l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getRss();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = TIMESTAMP_DESCRIPTOR;
        l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getTimestamp();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = TRACEFILE_DESCRIPTOR;
        string2 = ((CrashlyticsReport$ApplicationExitInfo)object).getTraceFile();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = BUILDIDMAPPINGFORARCH_DESCRIPTOR;
        object = ((CrashlyticsReport$ApplicationExitInfo)object).getBuildIdMappingForArch();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

