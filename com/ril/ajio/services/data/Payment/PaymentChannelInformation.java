/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentChannelInformation
implements Serializable {
    private String appType;
    private String appVersion;
    private String ip;
    private String paymentChannel;
    private String referer;
    private String userAgent;

    public PaymentChannelInformation() {
        this(null, null, null, null, null, null, 63, null);
    }

    public PaymentChannelInformation(String string2, String string3, String string4, String string5, String string6, String string7) {
        this.paymentChannel = string2;
        this.appType = string3;
        this.referer = string4;
        this.userAgent = string5;
        this.ip = string6;
        this.appVersion = string7;
    }

    public /* synthetic */ PaymentChannelInformation(String object, String object2, String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker object3) {
        String string6;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string7 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string8 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        String string9 = n7 != 0 ? null : string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        this((String)object3, (String)object4, string7, string8, string9, string6);
    }

    public static /* synthetic */ PaymentChannelInformation copy$default(PaymentChannelInformation paymentChannelInformation, String string2, String object, String string3, String object2, String string4, String string5, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = paymentChannelInformation.paymentChannel;
        }
        if ((n4 = n3 & 2) != 0) {
            object = paymentChannelInformation.appType;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = paymentChannelInformation.referer;
        }
        String string6 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = paymentChannelInformation.userAgent;
        }
        String string7 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = paymentChannelInformation.ip;
        }
        String string8 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = paymentChannelInformation.appVersion;
        }
        String string9 = string5;
        object = paymentChannelInformation;
        string3 = string2;
        object2 = object3;
        string4 = string6;
        string5 = string7;
        object3 = string9;
        return paymentChannelInformation.copy(string2, (String)object2, string6, string7, string8, string9);
    }

    public final String component1() {
        return this.paymentChannel;
    }

    public final String component2() {
        return this.appType;
    }

    public final String component3() {
        return this.referer;
    }

    public final String component4() {
        return this.userAgent;
    }

    public final String component5() {
        return this.ip;
    }

    public final String component6() {
        return this.appVersion;
    }

    public final PaymentChannelInformation copy(String string2, String string3, String string4, String string5, String string6, String string7) {
        PaymentChannelInformation paymentChannelInformation = new PaymentChannelInformation(string2, string3, string4, string5, string6, string7);
        return paymentChannelInformation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PaymentChannelInformation;
        if (!bl3) {
            return false;
        }
        object = (PaymentChannelInformation)object;
        String string2 = this.paymentChannel;
        String string3 = ((PaymentChannelInformation)object).paymentChannel;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.appType;
        string3 = ((PaymentChannelInformation)object).appType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.referer;
        string3 = ((PaymentChannelInformation)object).referer;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.userAgent;
        string3 = ((PaymentChannelInformation)object).userAgent;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.ip;
        string3 = ((PaymentChannelInformation)object).ip;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.appVersion;
        object = ((PaymentChannelInformation)object).appVersion;
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

    public final String getIp() {
        return this.ip;
    }

    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    public final String getReferer() {
        return this.referer;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.paymentChannel;
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
        string3 = this.referer;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.userAgent;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.ip;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.appVersion;
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

    public final void setIp(String string2) {
        this.ip = string2;
    }

    public final void setPaymentChannel(String string2) {
        this.paymentChannel = string2;
    }

    public final void setReferer(String string2) {
        this.referer = string2;
    }

    public final void setUserAgent(String string2) {
        this.userAgent = string2;
    }

    public String toString() {
        CharSequence charSequence = this.paymentChannel;
        String string2 = this.appType;
        String string3 = this.referer;
        String string4 = this.userAgent;
        String string5 = this.ip;
        String string6 = this.appVersion;
        charSequence = og_1.a("PaymentChannelInformation(paymentChannel=", charSequence, ", appType=", string2, ", referer=");
        X50.a((StringBuilder)charSequence, string3, ", userAgent=", string4, ", ip=");
        return ko_0.a((StringBuilder)charSequence, string5, ", appVersion=", string6, ")");
    }
}

