/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$1;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session;

final class AutoValue_CrashlyticsReport
extends CrashlyticsReport {
    private final CrashlyticsReport$ApplicationExitInfo appExitInfo;
    private final String appQualitySessionId;
    private final String buildVersion;
    private final String displayVersion;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String gmpAppId;
    private final String installationUuid;
    private final CrashlyticsReport$FilesPayload ndkPayload;
    private final int platform;
    private final String sdkVersion;
    private final CrashlyticsReport$Session session;

    private AutoValue_CrashlyticsReport(String string2, String string3, int n3, String string4, String string5, String string6, String string7, String string8, String string9, CrashlyticsReport$Session crashlyticsReport$Session, CrashlyticsReport$FilesPayload crashlyticsReport$FilesPayload, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        this.sdkVersion = string2;
        this.gmpAppId = string3;
        this.platform = n3;
        this.installationUuid = string4;
        this.firebaseInstallationId = string5;
        this.firebaseAuthenticationToken = string6;
        this.appQualitySessionId = string7;
        this.buildVersion = string8;
        this.displayVersion = string9;
        this.session = crashlyticsReport$Session;
        this.ndkPayload = crashlyticsReport$FilesPayload;
        this.appExitInfo = crashlyticsReport$ApplicationExitInfo;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport(String string2, String string3, int n3, String string4, String string5, String string6, String string7, String string8, String string9, CrashlyticsReport$Session crashlyticsReport$Session, CrashlyticsReport$FilesPayload crashlyticsReport$FilesPayload, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo, AutoValue_CrashlyticsReport$1 autoValue_CrashlyticsReport$1) {
        this(string2, string3, n3, string4, string5, string6, string7, string8, string9, crashlyticsReport$Session, crashlyticsReport$FilesPayload, crashlyticsReport$ApplicationExitInfo);
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    boolean bl4;
                    boolean bl5;
                    boolean bl6;
                    boolean bl7;
                    boolean bl8;
                    boolean bl9;
                    boolean bl10;
                    int n3;
                    int n4;
                    boolean bl11;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean n42 = object instanceof CrashlyticsReport;
                    if (!n42) break block4;
                    Object object2 = this.sdkVersion;
                    Object object3 = ((CrashlyticsReport)(object = (CrashlyticsReport)object)).getSdkVersion();
                    boolean bl12 = ((String)object2).equals(object3);
                    if (!bl12 || !(bl11 = ((String)(object2 = this.gmpAppId)).equals(object3 = ((CrashlyticsReport)object).getGmpAppId())) || (n4 = this.platform) != (n3 = ((CrashlyticsReport)object).getPlatform()) || !(bl10 = ((String)(object2 = this.installationUuid)).equals(object3 = ((CrashlyticsReport)object).getInstallationUuid())) || !((object2 = this.firebaseInstallationId) == null ? (object2 = ((CrashlyticsReport)object).getFirebaseInstallationId()) == null : (bl9 = ((String)object2).equals(object3 = ((CrashlyticsReport)object).getFirebaseInstallationId()))) || !((object2 = this.firebaseAuthenticationToken) == null ? (object2 = ((CrashlyticsReport)object).getFirebaseAuthenticationToken()) == null : (bl8 = ((String)object2).equals(object3 = ((CrashlyticsReport)object).getFirebaseAuthenticationToken()))) || !((object2 = this.appQualitySessionId) == null ? (object2 = ((CrashlyticsReport)object).getAppQualitySessionId()) == null : (bl7 = ((String)object2).equals(object3 = ((CrashlyticsReport)object).getAppQualitySessionId())))) break block5;
                    object2 = this.buildVersion;
                    object3 = ((CrashlyticsReport)object).getBuildVersion();
                    boolean bl13 = ((String)object2).equals(object3);
                    if (bl13 && (bl6 = ((String)(object2 = this.displayVersion)).equals(object3 = ((CrashlyticsReport)object).getDisplayVersion())) && ((object2 = this.session) == null ? (object2 = ((CrashlyticsReport)object).getSession()) == null : (bl5 = object2.equals(object3 = ((CrashlyticsReport)object).getSession()))) && ((object2 = this.ndkPayload) == null ? (object2 = ((CrashlyticsReport)object).getNdkPayload()) == null : (bl4 = object2.equals(object3 = ((CrashlyticsReport)object).getNdkPayload()))) && ((object2 = this.appExitInfo) == null ? (object = ((CrashlyticsReport)object).getAppExitInfo()) == null : (bl3 = object2.equals(object = ((CrashlyticsReport)object).getAppExitInfo())))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public CrashlyticsReport$ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    public String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public String getDisplayVersion() {
        return this.displayVersion;
    }

    public String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public String getGmpAppId() {
        return this.gmpAppId;
    }

    public String getInstallationUuid() {
        return this.installationUuid;
    }

    public CrashlyticsReport$FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public CrashlyticsReport$Session getSession() {
        return this.session;
    }

    public int hashCode() {
        String string2 = this.sdkVersion;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.gmpAppId.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.platform;
        n3 = (n3 ^ n7) * n4;
        n7 = this.installationUuid.hashCode();
        n3 = (n3 ^ n7) * n4;
        Object object = this.firebaseInstallationId;
        int n8 = 0;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.firebaseAuthenticationToken;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.appQualitySessionId;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        n7 = this.buildVersion.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.displayVersion.hashCode();
        n3 = (n3 ^ n7) * n4;
        object = this.session;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.ndkPayload;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo = this.appExitInfo;
        if (crashlyticsReport$ApplicationExitInfo != null) {
            n8 = crashlyticsReport$ApplicationExitInfo.hashCode();
        }
        return n3 ^ n8;
    }

    public CrashlyticsReport$Builder toBuilder() {
        AutoValue_CrashlyticsReport$Builder autoValue_CrashlyticsReport$Builder = new AutoValue_CrashlyticsReport$Builder(this, null);
        return autoValue_CrashlyticsReport$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CrashlyticsReport{sdkVersion=");
        Object object = this.sdkVersion;
        stringBuilder.append((String)object);
        stringBuilder.append(", gmpAppId=");
        object = this.gmpAppId;
        stringBuilder.append((String)object);
        stringBuilder.append(", platform=");
        int n3 = this.platform;
        stringBuilder.append(n3);
        stringBuilder.append(", installationUuid=");
        object = this.installationUuid;
        stringBuilder.append((String)object);
        stringBuilder.append(", firebaseInstallationId=");
        object = this.firebaseInstallationId;
        stringBuilder.append((String)object);
        stringBuilder.append(", firebaseAuthenticationToken=");
        object = this.firebaseAuthenticationToken;
        stringBuilder.append((String)object);
        stringBuilder.append(", appQualitySessionId=");
        object = this.appQualitySessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", buildVersion=");
        object = this.buildVersion;
        stringBuilder.append((String)object);
        stringBuilder.append(", displayVersion=");
        object = this.displayVersion;
        stringBuilder.append((String)object);
        stringBuilder.append(", session=");
        object = this.session;
        stringBuilder.append(object);
        stringBuilder.append(", ndkPayload=");
        object = this.ndkPayload;
        stringBuilder.append(object);
        stringBuilder.append(", appExitInfo=");
        object = this.appExitInfo;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

