/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.ProcessDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final List appProcessDetails;
    private final ProcessDetails currentProcessDetails;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;

    public AndroidApplicationInfo(String string2, String string3, String string4, String string5, ProcessDetails processDetails, List list) {
        Intrinsics.checkNotNullParameter(string2, "packageName");
        Intrinsics.checkNotNullParameter(string3, "versionName");
        Intrinsics.checkNotNullParameter(string4, "appBuildVersion");
        Intrinsics.checkNotNullParameter(string5, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(processDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(list, "appProcessDetails");
        this.packageName = string2;
        this.versionName = string3;
        this.appBuildVersion = string4;
        this.deviceManufacturer = string5;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list;
    }

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String string2, String object, String string3, String object2, ProcessDetails object3, List object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = androidApplicationInfo.packageName;
        }
        if ((n4 = n3 & 2) != 0) {
            object = androidApplicationInfo.versionName;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = androidApplicationInfo.appBuildVersion;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = androidApplicationInfo.deviceManufacturer;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = androidApplicationInfo.currentProcessDetails;
        }
        ProcessDetails processDetails = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = androidApplicationInfo.appProcessDetails;
        }
        List list = object4;
        object = androidApplicationInfo;
        string3 = string2;
        object2 = object5;
        object3 = string4;
        object4 = string5;
        object5 = list;
        return androidApplicationInfo.copy(string2, (String)object2, string4, string5, processDetails, list);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.appBuildVersion;
    }

    public final String component4() {
        return this.deviceManufacturer;
    }

    public final ProcessDetails component5() {
        return this.currentProcessDetails;
    }

    public final List component6() {
        return this.appProcessDetails;
    }

    public final AndroidApplicationInfo copy(String string2, String string3, String string4, String string5, ProcessDetails processDetails, List list) {
        Intrinsics.checkNotNullParameter(string2, "packageName");
        Intrinsics.checkNotNullParameter(string3, "versionName");
        Intrinsics.checkNotNullParameter(string4, "appBuildVersion");
        Intrinsics.checkNotNullParameter(string5, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(processDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(list, "appProcessDetails");
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo(string2, string3, string4, string5, processDetails, list);
        return androidApplicationInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AndroidApplicationInfo;
        if (!bl3) {
            return false;
        }
        object = (AndroidApplicationInfo)object;
        Object object2 = this.packageName;
        Object object3 = ((AndroidApplicationInfo)object).packageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.versionName;
        object3 = ((AndroidApplicationInfo)object).versionName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appBuildVersion;
        object3 = ((AndroidApplicationInfo)object).appBuildVersion;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deviceManufacturer;
        object3 = ((AndroidApplicationInfo)object).deviceManufacturer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currentProcessDetails;
        object3 = ((AndroidApplicationInfo)object).currentProcessDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appProcessDetails;
        object = ((AndroidApplicationInfo)object).appProcessDetails;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final List getAppProcessDetails() {
        return this.appProcessDetails;
    }

    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int n3 = this.packageName.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.versionName;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.appBuildVersion;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.deviceManufacturer;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = (this.currentProcessDetails.hashCode() + n3) * 31;
        return ((Object)this.appProcessDetails).hashCode() + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AndroidApplicationInfo(packageName=");
        Object object = this.packageName;
        stringBuilder.append((String)object);
        stringBuilder.append(", versionName=");
        object = this.versionName;
        stringBuilder.append((String)object);
        stringBuilder.append(", appBuildVersion=");
        object = this.appBuildVersion;
        stringBuilder.append((String)object);
        stringBuilder.append(", deviceManufacturer=");
        object = this.deviceManufacturer;
        stringBuilder.append((String)object);
        stringBuilder.append(", currentProcessDetails=");
        object = this.currentProcessDetails;
        stringBuilder.append(object);
        stringBuilder.append(", appProcessDetails=");
        object = this.appProcessDetails;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

