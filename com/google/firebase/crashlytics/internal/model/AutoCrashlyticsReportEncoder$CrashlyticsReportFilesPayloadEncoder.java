/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.List;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder
implements ObjectEncoder {
    private static final FieldDescriptor FILES_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder INSTANCE;
    private static final FieldDescriptor ORGID_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder autoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder();
        FILES_DESCRIPTOR = FieldDescriptor.of("files");
        ORGID_DESCRIPTOR = FieldDescriptor.of("orgId");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder() {
    }

    public void encode(CrashlyticsReport$FilesPayload object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = FILES_DESCRIPTOR;
        List list = ((CrashlyticsReport$FilesPayload)object).getFiles();
        objectEncoderContext.add(fieldDescriptor, (Object)list);
        fieldDescriptor = ORGID_DESCRIPTOR;
        object = ((CrashlyticsReport$FilesPayload)object).getOrgId();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

