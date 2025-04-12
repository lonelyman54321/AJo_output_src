/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFh1pSDK {
    public Boolean AFAdRevenueData;
    public Boolean areAllFieldsValid;
    public Map component2;
    public String component3;
    public Boolean getCurrencyIso4217Code;
    public Boolean getMediationNetwork;
    public String getMonetizationNetwork;
    public Boolean getRevenue;

    public AFh1pSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private AFh1pSDK(String string2, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, String string3, Boolean bl6, Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        this.getMonetizationNetwork = string2;
        this.AFAdRevenueData = bl2;
        this.getCurrencyIso4217Code = bl3;
        this.getRevenue = bl4;
        this.getMediationNetwork = bl5;
        this.component3 = string3;
        this.areAllFieldsValid = bl6;
        this.component2 = map2;
    }

    public /* synthetic */ AFh1pSDK(String object, Boolean object2, Boolean bl2, Boolean bl3, Boolean bl4, String object3, Boolean object4, Map object5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string2;
        Boolean bl5;
        Boolean bl6;
        Boolean bl7;
        Boolean bl8;
        String string3;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl9 = null;
        if (n7 != 0) {
            n7 = 0;
            string3 = null;
        } else {
            string3 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            bl8 = null;
        } else {
            bl8 = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            bl7 = null;
        } else {
            bl7 = bl2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            bl6 = null;
        } else {
            bl6 = bl3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            bl5 = null;
        } else {
            bl5 = bl4;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string2 = null;
        } else {
            string2 = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 == 0) {
            bl9 = object4;
        }
        Object object6 = (n4 &= 0x80) != 0 ? new HashMap() : object5;
        object = this;
        object2 = string3;
        bl2 = bl8;
        bl3 = bl7;
        bl4 = bl6;
        object3 = bl5;
        object4 = string2;
        object5 = bl9;
        this(string3, bl8, bl7, bl6, bl5, string2, bl9, (Map)object6);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFh1pSDK;
        if (!bl3) {
            return false;
        }
        object = (AFh1pSDK)object;
        Object object2 = this.getMonetizationNetwork;
        Object object3 = ((AFh1pSDK)object).getMonetizationNetwork;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.AFAdRevenueData;
        object3 = ((AFh1pSDK)object).AFAdRevenueData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.getCurrencyIso4217Code;
        object3 = ((AFh1pSDK)object).getCurrencyIso4217Code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.getRevenue;
        object3 = ((AFh1pSDK)object).getRevenue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.getMediationNetwork;
        object3 = ((AFh1pSDK)object).getMediationNetwork;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.component3;
        object3 = ((AFh1pSDK)object).component3;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.areAllFieldsValid;
        object3 = ((AFh1pSDK)object).areAllFieldsValid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.component2;
        object = ((AFh1pSDK)object).component2;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.getMonetizationNetwork;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.AFAdRevenueData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.getCurrencyIso4217Code;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.getRevenue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.getMediationNetwork;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.component3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.areAllFieldsValid;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        return ((Object)this.component2).hashCode() + n4;
    }

    public final String toString() {
        String string2 = this.getMonetizationNetwork;
        Boolean bl2 = this.AFAdRevenueData;
        Boolean bl3 = this.getCurrencyIso4217Code;
        Boolean bl4 = this.getRevenue;
        Boolean bl5 = this.getMediationNetwork;
        String string3 = this.component3;
        Boolean bl6 = this.areAllFieldsValid;
        Map map2 = this.component2;
        StringBuilder stringBuilder = new StringBuilder("AdvertisingIdData(advertisingId=");
        stringBuilder.append(string2);
        stringBuilder.append(", isLimited=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isEnabled=");
        stringBuilder.append(bl3);
        stringBuilder.append(", isGaidWithGps=");
        stringBuilder.append(bl4);
        stringBuilder.append(", isGaidWithSamsungCloudDev=");
        xi0_2.a(bl5, ", gaidError=", string3, ", retry=", stringBuilder);
        stringBuilder.append(bl6);
        stringBuilder.append(", metadata=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

