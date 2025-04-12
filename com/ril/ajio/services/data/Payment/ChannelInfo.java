/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ChannelInfo
implements Serializable {
    private String appType;
    private String appVersion;
    private String channelType;
    private String deviceId;
    private String nthOrderOnChannel;
    private String osType;
    private String osVersion;
    private String sessionId;

    public ChannelInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public ChannelInfo(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        this.channelType = string2;
        this.appType = string3;
        this.deviceId = string4;
        this.nthOrderOnChannel = string5;
        this.appVersion = string6;
        this.osVersion = string7;
        this.osType = string8;
        this.sessionId = string9;
    }

    public /* synthetic */ ChannelInfo(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = null;
        if (n7 != 0) {
            n7 = 0;
            string15 = null;
        } else {
            string15 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string14 = null;
        } else {
            string14 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string13 = null;
        } else {
            string13 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string12 = null;
        } else {
            string12 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string11 = null;
        } else {
            string11 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string10 = null;
        } else {
            string10 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string9 = null;
        } else {
            string9 = string7;
        }
        if ((n4 &= 0x80) == 0) {
            string16 = string8;
        }
        object = this;
        string2 = string15;
        string3 = string14;
        string4 = string13;
        string5 = string12;
        string6 = string11;
        string7 = string10;
        string8 = string9;
        this(string15, string14, string13, string12, string11, string10, string9, string16);
    }

    public static /* synthetic */ ChannelInfo copy$default(ChannelInfo channelInfo, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, int n3, Object object) {
        ChannelInfo channelInfo2 = channelInfo;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? channelInfo.channelType : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? channelInfo2.appType : string3;
        int n10 = n4 & 4;
        String string12 = n10 != 0 ? channelInfo2.deviceId : string4;
        int n14 = n4 & 8;
        String string13 = n14 != 0 ? channelInfo2.nthOrderOnChannel : string5;
        int n15 = n4 & 0x10;
        String string14 = n15 != 0 ? channelInfo2.appVersion : string6;
        int n16 = n4 & 0x20;
        String string15 = n16 != 0 ? channelInfo2.osVersion : string7;
        int n17 = n4 & 0x40;
        String string16 = n17 != 0 ? channelInfo2.osType : string8;
        String string17 = (n4 &= 0x80) != 0 ? channelInfo2.sessionId : string9;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        string7 = string15;
        string8 = string16;
        string9 = string17;
        return channelInfo.copy(string10, string11, string12, string13, string14, string15, string16, string17);
    }

    public final String component1() {
        return this.channelType;
    }

    public final String component2() {
        return this.appType;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.nthOrderOnChannel;
    }

    public final String component5() {
        return this.appVersion;
    }

    public final String component6() {
        return this.osVersion;
    }

    public final String component7() {
        return this.osType;
    }

    public final String component8() {
        return this.sessionId;
    }

    public final ChannelInfo copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        ChannelInfo channelInfo = new ChannelInfo(string2, string3, string4, string5, string6, string7, string8, string9);
        return channelInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ChannelInfo;
        if (!bl3) {
            return false;
        }
        object = (ChannelInfo)object;
        String string2 = this.channelType;
        String string3 = ((ChannelInfo)object).channelType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.appType;
        string3 = ((ChannelInfo)object).appType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.deviceId;
        string3 = ((ChannelInfo)object).deviceId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.nthOrderOnChannel;
        string3 = ((ChannelInfo)object).nthOrderOnChannel;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.appVersion;
        string3 = ((ChannelInfo)object).appVersion;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.osVersion;
        string3 = ((ChannelInfo)object).osVersion;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.osType;
        string3 = ((ChannelInfo)object).osType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.sessionId;
        object = ((ChannelInfo)object).sessionId;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getNthOrderOnChannel() {
        return this.nthOrderOnChannel;
    }

    public final String getOsType() {
        return this.osType;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.channelType;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.appType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.deviceId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.nthOrderOnChannel;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.appVersion;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.osVersion;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.osType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.sessionId;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setAppType(String string2) {
        this.appType = string2;
    }

    public final void setAppVersion(String string2) {
        this.appVersion = string2;
    }

    public final void setChannelType(String string2) {
        this.channelType = string2;
    }

    public final void setDeviceId(String string2) {
        this.deviceId = string2;
    }

    public final void setNthOrderOnChannel(String string2) {
        this.nthOrderOnChannel = string2;
    }

    public final void setOsType(String string2) {
        this.osType = string2;
    }

    public final void setOsVersion(String string2) {
        this.osVersion = string2;
    }

    public final void setSessionId(String string2) {
        this.sessionId = string2;
    }

    public String toString() {
        CharSequence charSequence = this.channelType;
        String string2 = this.appType;
        String string3 = this.deviceId;
        String string4 = this.nthOrderOnChannel;
        String string5 = this.appVersion;
        String string6 = this.osVersion;
        String string7 = this.osType;
        String string8 = this.sessionId;
        charSequence = og_1.a("ChannelInfo(channelType=", charSequence, ", appType=", string2, ", deviceId=");
        X50.a((StringBuilder)charSequence, string3, ", nthOrderOnChannel=", string4, ", appVersion=");
        X50.a((StringBuilder)charSequence, string5, ", osVersion=", string6, ", osType=");
        return ko_0.a((StringBuilder)charSequence, string7, ", sessionId=", string8, ")");
    }
}

