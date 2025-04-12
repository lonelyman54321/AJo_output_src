/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session;

final class AutoValue_CrashlyticsReport$Builder
extends CrashlyticsReport$Builder {
    private CrashlyticsReport$ApplicationExitInfo appExitInfo;
    private String appQualitySessionId;
    private String buildVersion;
    private String displayVersion;
    private String firebaseAuthenticationToken;
    private String firebaseInstallationId;
    private String gmpAppId;
    private String installationUuid;
    private CrashlyticsReport$FilesPayload ndkPayload;
    private int platform;
    private String sdkVersion;
    private CrashlyticsReport$Session session;
    private byte set$0;

    public AutoValue_CrashlyticsReport$Builder() {
    }

    private AutoValue_CrashlyticsReport$Builder(CrashlyticsReport object) {
        int n3;
        Object object2 = ((CrashlyticsReport)object).getSdkVersion();
        this.sdkVersion = object2;
        object2 = ((CrashlyticsReport)object).getGmpAppId();
        this.gmpAppId = object2;
        this.platform = n3 = ((CrashlyticsReport)object).getPlatform();
        object2 = ((CrashlyticsReport)object).getInstallationUuid();
        this.installationUuid = object2;
        object2 = ((CrashlyticsReport)object).getFirebaseInstallationId();
        this.firebaseInstallationId = object2;
        object2 = ((CrashlyticsReport)object).getFirebaseAuthenticationToken();
        this.firebaseAuthenticationToken = object2;
        object2 = ((CrashlyticsReport)object).getAppQualitySessionId();
        this.appQualitySessionId = object2;
        object2 = ((CrashlyticsReport)object).getBuildVersion();
        this.buildVersion = object2;
        object2 = ((CrashlyticsReport)object).getDisplayVersion();
        this.displayVersion = object2;
        this.session = object2 = ((CrashlyticsReport)object).getSession();
        this.ndkPayload = object2 = ((CrashlyticsReport)object).getNdkPayload();
        this.appExitInfo = object = ((CrashlyticsReport)object).getAppExitInfo();
        this.set$0 = 1;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport$Builder(CrashlyticsReport crashlyticsReport, AutoValue_CrashlyticsReport$1 autoValue_CrashlyticsReport$1) {
        this(crashlyticsReport);
    }

    public CrashlyticsReport build() {
        Object object;
        byte by2;
        Object object2;
        AutoValue_CrashlyticsReport$Builder autoValue_CrashlyticsReport$Builder = this;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (object2 = this.sdkVersion) != null && (object2 = this.gmpAppId) != null && (object2 = this.installationUuid) != null && (object2 = this.buildVersion) != null && (object2 = this.displayVersion) != null) {
            String string2 = this.sdkVersion;
            String string3 = this.gmpAppId;
            int n7 = this.platform;
            String string4 = this.installationUuid;
            String string5 = this.firebaseInstallationId;
            String string6 = this.firebaseAuthenticationToken;
            String string7 = this.appQualitySessionId;
            String string8 = this.buildVersion;
            String string9 = this.displayVersion;
            CrashlyticsReport$Session crashlyticsReport$Session = this.session;
            CrashlyticsReport$FilesPayload crashlyticsReport$FilesPayload = this.ndkPayload;
            CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo = this.appExitInfo;
            Object object3 = object2;
            object2 = new AutoValue_CrashlyticsReport(string2, string3, n7, string4, string5, string6, string7, string8, string9, crashlyticsReport$Session, crashlyticsReport$FilesPayload, crashlyticsReport$ApplicationExitInfo, null);
            return object2;
        }
        object2 = new StringBuilder();
        String string10 = autoValue_CrashlyticsReport$Builder.sdkVersion;
        if (string10 == null) {
            string10 = " sdkVersion";
            ((StringBuilder)object2).append(string10);
        }
        if ((string10 = autoValue_CrashlyticsReport$Builder.gmpAppId) == null) {
            string10 = " gmpAppId";
            ((StringBuilder)object2).append(string10);
        }
        if ((n4 &= (by2 = autoValue_CrashlyticsReport$Builder.set$0)) == 0) {
            object = " platform";
            ((StringBuilder)object2).append((String)object);
        }
        if ((object = autoValue_CrashlyticsReport$Builder.installationUuid) == null) {
            object = " installationUuid";
            ((StringBuilder)object2).append((String)object);
        }
        if ((object = autoValue_CrashlyticsReport$Builder.buildVersion) == null) {
            object = " buildVersion";
            ((StringBuilder)object2).append((String)object);
        }
        if ((object = autoValue_CrashlyticsReport$Builder.displayVersion) == null) {
            object = " displayVersion";
            ((StringBuilder)object2).append((String)object);
        }
        object2 = Gs.a("Missing required properties:", (StringBuilder)object2);
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public CrashlyticsReport$Builder setAppExitInfo(CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        this.appExitInfo = crashlyticsReport$ApplicationExitInfo;
        return this;
    }

    public CrashlyticsReport$Builder setAppQualitySessionId(String string2) {
        this.appQualitySessionId = string2;
        return this;
    }

    public CrashlyticsReport$Builder setBuildVersion(String object) {
        if (object != null) {
            this.buildVersion = object;
            return this;
        }
        object = new NullPointerException("Null buildVersion");
        throw object;
    }

    public CrashlyticsReport$Builder setDisplayVersion(String object) {
        if (object != null) {
            this.displayVersion = object;
            return this;
        }
        object = new NullPointerException("Null displayVersion");
        throw object;
    }

    public CrashlyticsReport$Builder setFirebaseAuthenticationToken(String string2) {
        this.firebaseAuthenticationToken = string2;
        return this;
    }

    public CrashlyticsReport$Builder setFirebaseInstallationId(String string2) {
        this.firebaseInstallationId = string2;
        return this;
    }

    public CrashlyticsReport$Builder setGmpAppId(String object) {
        if (object != null) {
            this.gmpAppId = object;
            return this;
        }
        object = new NullPointerException("Null gmpAppId");
        throw object;
    }

    public CrashlyticsReport$Builder setInstallationUuid(String object) {
        if (object != null) {
            this.installationUuid = object;
            return this;
        }
        object = new NullPointerException("Null installationUuid");
        throw object;
    }

    public CrashlyticsReport$Builder setNdkPayload(CrashlyticsReport$FilesPayload crashlyticsReport$FilesPayload) {
        this.ndkPayload = crashlyticsReport$FilesPayload;
        return this;
    }

    public CrashlyticsReport$Builder setPlatform(int n3) {
        this.platform = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Builder setSdkVersion(String object) {
        if (object != null) {
            this.sdkVersion = object;
            return this;
        }
        object = new NullPointerException("Null sdkVersion");
        throw object;
    }

    public CrashlyticsReport$Builder setSession(CrashlyticsReport$Session crashlyticsReport$Session) {
        this.session = crashlyticsReport$Session;
        return this;
    }
}

