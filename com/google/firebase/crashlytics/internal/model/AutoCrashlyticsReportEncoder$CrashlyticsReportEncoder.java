/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

final class AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder
implements ObjectEncoder {
    private static final FieldDescriptor APPEXITINFO_DESCRIPTOR;
    private static final FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR;
    private static final FieldDescriptor BUILDVERSION_DESCRIPTOR;
    private static final FieldDescriptor DISPLAYVERSION_DESCRIPTOR;
    private static final FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR;
    private static final FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR;
    private static final FieldDescriptor GMPAPPID_DESCRIPTOR;
    private static final FieldDescriptor INSTALLATIONUUID_DESCRIPTOR;
    static final AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder INSTANCE;
    private static final FieldDescriptor NDKPAYLOAD_DESCRIPTOR;
    private static final FieldDescriptor PLATFORM_DESCRIPTOR;
    private static final FieldDescriptor SDKVERSION_DESCRIPTOR;
    private static final FieldDescriptor SESSION_DESCRIPTOR;

    static {
        AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder autoCrashlyticsReportEncoder$CrashlyticsReportEncoder;
        INSTANCE = autoCrashlyticsReportEncoder$CrashlyticsReportEncoder = new AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder();
        SDKVERSION_DESCRIPTOR = FieldDescriptor.of("sdkVersion");
        GMPAPPID_DESCRIPTOR = FieldDescriptor.of("gmpAppId");
        PLATFORM_DESCRIPTOR = FieldDescriptor.of("platform");
        INSTALLATIONUUID_DESCRIPTOR = FieldDescriptor.of("installationUuid");
        FIREBASEINSTALLATIONID_DESCRIPTOR = FieldDescriptor.of("firebaseInstallationId");
        FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = FieldDescriptor.of("firebaseAuthenticationToken");
        APPQUALITYSESSIONID_DESCRIPTOR = FieldDescriptor.of("appQualitySessionId");
        BUILDVERSION_DESCRIPTOR = FieldDescriptor.of("buildVersion");
        DISPLAYVERSION_DESCRIPTOR = FieldDescriptor.of("displayVersion");
        SESSION_DESCRIPTOR = FieldDescriptor.of("session");
        NDKPAYLOAD_DESCRIPTOR = FieldDescriptor.of("ndkPayload");
        APPEXITINFO_DESCRIPTOR = FieldDescriptor.of("appExitInfo");
    }

    private AutoCrashlyticsReportEncoder$CrashlyticsReportEncoder() {
    }

    public void encode(CrashlyticsReport object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = SDKVERSION_DESCRIPTOR;
        Object object2 = ((CrashlyticsReport)object).getSdkVersion();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = GMPAPPID_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getGmpAppId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = PLATFORM_DESCRIPTOR;
        int n3 = ((CrashlyticsReport)object).getPlatform();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = INSTALLATIONUUID_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getInstallationUuid();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = FIREBASEINSTALLATIONID_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getFirebaseInstallationId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getFirebaseAuthenticationToken();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPQUALITYSESSIONID_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getAppQualitySessionId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = BUILDVERSION_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getBuildVersion();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = DISPLAYVERSION_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getDisplayVersion();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SESSION_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getSession();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = NDKPAYLOAD_DESCRIPTOR;
        object2 = ((CrashlyticsReport)object).getNdkPayload();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = APPEXITINFO_DESCRIPTOR;
        object = ((CrashlyticsReport)object).getAppExitInfo();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

