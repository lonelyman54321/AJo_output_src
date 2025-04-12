/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CouponBonanzaErrorInfo {
    public static final CouponBonanzaErrorInfo$Companion Companion;
    private final String body;
    private final Integer code;
    private final String displayMessage;
    private final String statusCode;
    private final Integer statusCodeValue;
    private final String statusMessage;

    static {
        CouponBonanzaErrorInfo$Companion couponBonanzaErrorInfo$Companion;
        Companion = couponBonanzaErrorInfo$Companion = new CouponBonanzaErrorInfo$Companion(null);
    }

    public CouponBonanzaErrorInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CouponBonanzaErrorInfo(int n3, String string2, Integer n4, String string3, String string4, String string5, Integer n7, a03_0 a03_02) {
        int n8 = n3 & 1;
        this.body = n8 == 0 ? null : string2;
        int n10 = n3 & 2;
        this.code = n10 == 0 ? null : n4;
        n10 = n3 & 4;
        this.statusMessage = n10 == 0 ? null : string3;
        n10 = n3 & 8;
        this.displayMessage = n10 == 0 ? null : string4;
        n10 = n3 & 0x10;
        this.statusCode = n10 == 0 ? null : string5;
        this.statusCodeValue = (n3 &= 0x20) == 0 ? null : n7;
    }

    public CouponBonanzaErrorInfo(String string2, Integer n3, String string3, String string4, String string5, Integer n4) {
        this.body = string2;
        this.code = n3;
        this.statusMessage = string3;
        this.displayMessage = string4;
        this.statusCode = string5;
        this.statusCodeValue = n4;
    }

    public /* synthetic */ CouponBonanzaErrorInfo(String object, Integer object2, String object3, String string2, String string3, Integer object4, int n3, DefaultConstructorMarker object5) {
        Integer n4;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n8 = n3 & 2;
        Object object6 = n8 != 0 ? null : object2;
        n8 = n3 & 4;
        Object object7 = n8 != 0 ? null : object3;
        n8 = n3 & 8;
        String string4 = n8 != 0 ? null : string2;
        n8 = n3 & 0x10;
        String string5 = n8 != 0 ? null : string3;
        n8 = n3 & 0x20;
        if (n8 != 0) {
            n3 = 0;
            n4 = null;
        } else {
            n4 = object4;
        }
        object = this;
        object2 = object5;
        object3 = object6;
        string2 = object7;
        string3 = string4;
        object4 = string5;
        this((String)object5, (Integer)object6, (String)object7, string4, string5, n4);
    }

    public static /* synthetic */ CouponBonanzaErrorInfo copy$default(CouponBonanzaErrorInfo couponBonanzaErrorInfo, String string2, Integer object, String string3, String object2, String string4, Integer object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = couponBonanzaErrorInfo.body;
        }
        if ((n4 = n3 & 2) != 0) {
            object = couponBonanzaErrorInfo.code;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = couponBonanzaErrorInfo.statusMessage;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = couponBonanzaErrorInfo.displayMessage;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = couponBonanzaErrorInfo.statusCode;
        }
        String string7 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object3 = couponBonanzaErrorInfo.statusCodeValue;
        }
        Integer n8 = object3;
        object = couponBonanzaErrorInfo;
        string3 = string2;
        object2 = object4;
        string4 = string5;
        object3 = string6;
        object4 = n8;
        return couponBonanzaErrorInfo.copy(string2, (Integer)object2, string5, string6, string7, n8);
    }

    public static final /* synthetic */ void write$Self$shared_release(CouponBonanzaErrorInfo object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        Object object3;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((CouponBonanzaErrorInfo)object).body) != null) {
            object3 = pe3_2.a;
            object2 = ((CouponBonanzaErrorInfo)object).body;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object3 = ((CouponBonanzaErrorInfo)object).code) != null) {
            object3 = yi1_2.a;
            object2 = ((CouponBonanzaErrorInfo)object).code;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object3 = ((CouponBonanzaErrorInfo)object).statusMessage) != null) {
            object3 = pe3_2.a;
            object2 = ((CouponBonanzaErrorInfo)object).statusMessage;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object3 = ((CouponBonanzaErrorInfo)object).displayMessage) != null) {
            object3 = pe3_2.a;
            object2 = ((CouponBonanzaErrorInfo)object).displayMessage;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 4)) || (object3 = ((CouponBonanzaErrorInfo)object).statusCode) != null) {
            object3 = pe3_2.a;
            object2 = ((CouponBonanzaErrorInfo)object).statusCode;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 5)) || (object3 = ((CouponBonanzaErrorInfo)object).statusCodeValue) != null) {
            object3 = yi1_2.a;
            object = ((CouponBonanzaErrorInfo)object).statusCodeValue;
            u30_02.r(serialDescriptor, n3, (b03_0)object3, object);
        }
    }

    public final String component1() {
        return this.body;
    }

    public final Integer component2() {
        return this.code;
    }

    public final String component3() {
        return this.statusMessage;
    }

    public final String component4() {
        return this.displayMessage;
    }

    public final String component5() {
        return this.statusCode;
    }

    public final Integer component6() {
        return this.statusCodeValue;
    }

    public final CouponBonanzaErrorInfo copy(String string2, Integer n3, String string3, String string4, String string5, Integer n4) {
        CouponBonanzaErrorInfo couponBonanzaErrorInfo = new CouponBonanzaErrorInfo(string2, n3, string3, string4, string5, n4);
        return couponBonanzaErrorInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponBonanzaErrorInfo;
        if (!bl3) {
            return false;
        }
        object = (CouponBonanzaErrorInfo)object;
        Object object2 = this.body;
        Object object3 = ((CouponBonanzaErrorInfo)object).body;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.code;
        object3 = ((CouponBonanzaErrorInfo)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusMessage;
        object3 = ((CouponBonanzaErrorInfo)object).statusMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayMessage;
        object3 = ((CouponBonanzaErrorInfo)object).displayMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object3 = ((CouponBonanzaErrorInfo)object).statusCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCodeValue;
        object = ((CouponBonanzaErrorInfo)object).statusCodeValue;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBody() {
        return this.body;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final Integer getStatusCodeValue() {
        return this.statusCodeValue;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.body;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.code;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusCodeValue;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.body;
        Integer n3 = this.code;
        String string3 = this.statusMessage;
        String string4 = this.displayMessage;
        String string5 = this.statusCode;
        Integer n4 = this.statusCodeValue;
        StringBuilder stringBuilder = new StringBuilder("CouponBonanzaErrorInfo(body=");
        stringBuilder.append(string2);
        stringBuilder.append(", code=");
        stringBuilder.append(n3);
        stringBuilder.append(", statusMessage=");
        X50.a(stringBuilder, string3, ", displayMessage=", string4, ", statusCode=");
        stringBuilder.append(string5);
        stringBuilder.append(", statusCodeValue=");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

