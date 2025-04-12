/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import kotlin.jvm.internal.Intrinsics;

public final class NudgeInformation {
    private final String appType;
    private final String channelType;
    private final String customerType;
    private final String deviceId;
    private final String orderId;

    public NudgeInformation(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Intrinsics.checkNotNullParameter(string3, "deviceId");
        Intrinsics.checkNotNullParameter(string4, "appType");
        Intrinsics.checkNotNullParameter(string5, "channelType");
        Intrinsics.checkNotNullParameter(string6, "customerType");
        this.orderId = string2;
        this.deviceId = string3;
        this.appType = string4;
        this.channelType = string5;
        this.customerType = string6;
    }

    public static /* synthetic */ NudgeInformation copy$default(NudgeInformation nudgeInformation, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = nudgeInformation.orderId;
        }
        if ((n4 = n3 & 2) != 0) {
            object = nudgeInformation.deviceId;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = nudgeInformation.appType;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = nudgeInformation.channelType;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = nudgeInformation.customerType;
        }
        String string7 = string4;
        object = nudgeInformation;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return nudgeInformation.copy(string2, (String)object2, string5, string6, string7);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.appType;
    }

    public final String component4() {
        return this.channelType;
    }

    public final String component5() {
        return this.customerType;
    }

    public final NudgeInformation copy(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Intrinsics.checkNotNullParameter(string3, "deviceId");
        Intrinsics.checkNotNullParameter(string4, "appType");
        Intrinsics.checkNotNullParameter(string5, "channelType");
        Intrinsics.checkNotNullParameter(string6, "customerType");
        NudgeInformation nudgeInformation = new NudgeInformation(string2, string3, string4, string5, string6);
        return nudgeInformation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NudgeInformation;
        if (!bl3) {
            return false;
        }
        object = (NudgeInformation)object;
        String string2 = this.orderId;
        String string3 = ((NudgeInformation)object).orderId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.deviceId;
        string3 = ((NudgeInformation)object).deviceId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.appType;
        string3 = ((NudgeInformation)object).appType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.channelType;
        string3 = ((NudgeInformation)object).channelType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.customerType;
        object = ((NudgeInformation)object).customerType;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        int n3 = this.orderId.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.deviceId;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.appType;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.channelType;
        n3 = zy_2.b(n3, n4, string2);
        return this.customerType.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.orderId;
        String string2 = this.deviceId;
        String string3 = this.appType;
        String string4 = this.channelType;
        String string5 = this.customerType;
        charSequence = og_1.a("NudgeInformation(orderId=", charSequence, ", deviceId=", string2, ", appType=");
        X50.a((StringBuilder)charSequence, string3, ", channelType=", string4, ", customerType=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

