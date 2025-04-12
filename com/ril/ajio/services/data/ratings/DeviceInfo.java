/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceInfo {
    private String deviceId;
    private String deviceModel;
    private String deviceName;

    public DeviceInfo() {
        this(null, null, null, 7, null);
    }

    public DeviceInfo(String string2, String string3, String string4) {
        this.deviceId = string2;
        this.deviceModel = string3;
        this.deviceName = string4;
    }

    public /* synthetic */ DeviceInfo(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = deviceInfo.deviceId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = deviceInfo.deviceModel;
        }
        if ((n3 &= 4) != 0) {
            string4 = deviceInfo.deviceName;
        }
        return deviceInfo.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.deviceModel;
    }

    public final String component3() {
        return this.deviceName;
    }

    public final DeviceInfo copy(String string2, String string3, String string4) {
        DeviceInfo deviceInfo = new DeviceInfo(string2, string3, string4);
        return deviceInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeviceInfo;
        if (!bl3) {
            return false;
        }
        object = (DeviceInfo)object;
        String string2 = this.deviceId;
        String string3 = ((DeviceInfo)object).deviceId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.deviceModel;
        string3 = ((DeviceInfo)object).deviceModel;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.deviceName;
        object = ((DeviceInfo)object).deviceName;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.deviceId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.deviceModel;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.deviceName;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setDeviceId(String string2) {
        this.deviceId = string2;
    }

    public final void setDeviceModel(String string2) {
        this.deviceModel = string2;
    }

    public final void setDeviceName(String string2) {
        this.deviceName = string2;
    }

    public String toString() {
        String string2 = this.deviceId;
        String string3 = this.deviceModel;
        String string4 = this.deviceName;
        return h30_0.a(og_1.a("DeviceInfo(deviceId=", string2, ", deviceModel=", string3, ", deviceName="), string4, ")");
    }
}

