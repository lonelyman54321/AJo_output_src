/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder
implements ObjectEncoder {
    private static final FieldDescriptor ARCH_DESCRIPTOR;
    private static final FieldDescriptor BUILDID_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE;
    private static final FieldDescriptor LIBRARYNAME_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder autoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        ARCH_DESCRIPTOR = FieldDescriptor.of("arch");
        LIBRARYNAME_DESCRIPTOR = FieldDescriptor.of("libraryName");
        BUILDID_DESCRIPTOR = FieldDescriptor.of("buildId");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
    }

    public void encode(CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = ARCH_DESCRIPTOR;
        String string2 = ((CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)object).getArch();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = LIBRARYNAME_DESCRIPTOR;
        string2 = ((CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)object).getLibraryName();
        objectEncoderContext.add(fieldDescriptor, (Object)string2);
        fieldDescriptor = BUILDID_DESCRIPTOR;
        object = ((CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)object).getBuildId();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

