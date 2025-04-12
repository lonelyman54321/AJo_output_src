/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.LogEnvironment;
import kotlin.jvm.internal.Intrinsics;

public final class ApplicationInfo {
    private final AndroidApplicationInfo androidAppInfo;
    private final String appId;
    private final String deviceModel;
    private final LogEnvironment logEnvironment;
    private final String osVersion;
    private final String sessionSdkVersion;

    public ApplicationInfo(String string2, String string3, String string4, String string5, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo) {
        Intrinsics.checkNotNullParameter(string2, "appId");
        Intrinsics.checkNotNullParameter(string3, "deviceModel");
        Intrinsics.checkNotNullParameter(string4, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(string5, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidApplicationInfo, "androidAppInfo");
        this.appId = string2;
        this.deviceModel = string3;
        this.sessionSdkVersion = string4;
        this.osVersion = string5;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidApplicationInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String string2, String object, String string3, String object2, LogEnvironment object3, AndroidApplicationInfo object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = applicationInfo.appId;
        }
        if ((n4 = n3 & 2) != 0) {
            object = applicationInfo.deviceModel;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = applicationInfo.sessionSdkVersion;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = applicationInfo.osVersion;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = applicationInfo.logEnvironment;
        }
        LogEnvironment logEnvironment = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = applicationInfo.androidAppInfo;
        }
        AndroidApplicationInfo androidApplicationInfo = object4;
        object = applicationInfo;
        string3 = string2;
        object2 = object5;
        object3 = string4;
        object4 = string5;
        object5 = androidApplicationInfo;
        return applicationInfo.copy(string2, (String)object2, string4, string5, logEnvironment, androidApplicationInfo);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component2() {
        return this.deviceModel;
    }

    public final String component3() {
        return this.sessionSdkVersion;
    }

    public final String component4() {
        return this.osVersion;
    }

    public final LogEnvironment component5() {
        return this.logEnvironment;
    }

    public final AndroidApplicationInfo component6() {
        return this.androidAppInfo;
    }

    public final ApplicationInfo copy(String string2, String string3, String string4, String string5, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo) {
        Intrinsics.checkNotNullParameter(string2, "appId");
        Intrinsics.checkNotNullParameter(string3, "deviceModel");
        Intrinsics.checkNotNullParameter(string4, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(string5, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidApplicationInfo, "androidAppInfo");
        ApplicationInfo applicationInfo = new ApplicationInfo(string2, string3, string4, string5, logEnvironment, androidApplicationInfo);
        return applicationInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApplicationInfo;
        if (!bl3) {
            return false;
        }
        object = (ApplicationInfo)object;
        Object object2 = this.appId;
        Object object3 = ((ApplicationInfo)object).appId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deviceModel;
        object3 = ((ApplicationInfo)object).deviceModel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sessionSdkVersion;
        object3 = ((ApplicationInfo)object).sessionSdkVersion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.osVersion;
        object3 = ((ApplicationInfo)object).osVersion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logEnvironment;
        object3 = ((ApplicationInfo)object).logEnvironment;
        if (object2 != object3) {
            return false;
        }
        object2 = this.androidAppInfo;
        object = ((ApplicationInfo)object).androidAppInfo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        int n3 = this.appId.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.deviceModel;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.sessionSdkVersion;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.osVersion;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = (this.logEnvironment.hashCode() + n3) * 31;
        return this.androidAppInfo.hashCode() + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplicationInfo(appId=");
        Object object = this.appId;
        stringBuilder.append((String)object);
        stringBuilder.append(", deviceModel=");
        object = this.deviceModel;
        stringBuilder.append((String)object);
        stringBuilder.append(", sessionSdkVersion=");
        object = this.sessionSdkVersion;
        stringBuilder.append((String)object);
        stringBuilder.append(", osVersion=");
        object = this.osVersion;
        stringBuilder.append((String)object);
        stringBuilder.append(", logEnvironment=");
        object = this.logEnvironment;
        stringBuilder.append(object);
        stringBuilder.append(", androidAppInfo=");
        object = this.androidAppInfo;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

