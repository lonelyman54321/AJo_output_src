/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

final class AFf1pSDK$AFa1vSDK {
    private String advertisingId;
    private boolean advertisingIdWithGps;
    private final StringBuilder gaidError;
    private Boolean isLimitAdTrackingEnabled;

    public AFf1pSDK$AFa1vSDK() {
        this(null, null, false, null, 15, null);
    }

    public AFf1pSDK$AFa1vSDK(String string2, Boolean bl2, boolean bl3, StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "gaidError");
        this.advertisingId = string2;
        this.isLimitAdTrackingEnabled = bl2;
        this.advertisingIdWithGps = bl3;
        this.gaidError = stringBuilder;
    }

    public /* synthetic */ AFf1pSDK$AFa1vSDK(String string2, Boolean bl2, boolean bl3, StringBuilder stringBuilder, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            bl3 = false;
        }
        if ((n3 &= 8) != 0) {
            stringBuilder = new StringBuilder();
        }
        this(string2, bl2, bl3, stringBuilder);
    }

    public static /* synthetic */ AFf1pSDK$AFa1vSDK copy$default(AFf1pSDK$AFa1vSDK aFf1pSDK$AFa1vSDK, String string2, Boolean bl2, boolean bl3, StringBuilder stringBuilder, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = aFf1pSDK$AFa1vSDK.advertisingId;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = aFf1pSDK$AFa1vSDK.isLimitAdTrackingEnabled;
        }
        if ((n4 = n3 & 4) != 0) {
            bl3 = aFf1pSDK$AFa1vSDK.advertisingIdWithGps;
        }
        if ((n3 &= 8) != 0) {
            stringBuilder = aFf1pSDK$AFa1vSDK.gaidError;
        }
        return aFf1pSDK$AFa1vSDK.copy(string2, bl2, bl3, stringBuilder);
    }

    public final String component1() {
        return this.advertisingId;
    }

    public final Boolean component2() {
        return this.isLimitAdTrackingEnabled;
    }

    public final boolean component3() {
        return this.advertisingIdWithGps;
    }

    public final StringBuilder component4() {
        return this.gaidError;
    }

    public final AFf1pSDK$AFa1vSDK copy(String string2, Boolean bl2, boolean bl3, StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "gaidError");
        AFf1pSDK$AFa1vSDK aFf1pSDK$AFa1vSDK = new AFf1pSDK$AFa1vSDK(string2, bl2, bl3, stringBuilder);
        return aFf1pSDK$AFa1vSDK;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFf1pSDK$AFa1vSDK;
        if (!bl3) {
            return false;
        }
        object = (AFf1pSDK$AFa1vSDK)object;
        Object object2 = this.advertisingId;
        Object object3 = ((AFf1pSDK$AFa1vSDK)object).advertisingId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isLimitAdTrackingEnabled;
        object3 = ((AFf1pSDK$AFa1vSDK)object).isLimitAdTrackingEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.advertisingIdWithGps;
        boolean bl4 = ((AFf1pSDK$AFa1vSDK)object).advertisingIdWithGps;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.gaidError;
        object = ((AFf1pSDK$AFa1vSDK)object).gaidError;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final boolean getAdvertisingIdWithGps() {
        return this.advertisingIdWithGps;
    }

    public final StringBuilder getGaidError() {
        return this.gaidError;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.advertisingId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        Boolean bl2 = this.isLimitAdTrackingEnabled;
        if (bl2 != null) {
            n4 = ((Object)bl2).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.advertisingIdWithGps ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
        }
        n3 = (n3 + n4) * 31;
        return this.gaidError.hashCode() + n3;
    }

    public final Boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public final void setAdvertisingId(String string2) {
        this.advertisingId = string2;
    }

    public final void setAdvertisingIdWithGps(boolean bl2) {
        this.advertisingIdWithGps = bl2;
    }

    public final void setLimitAdTrackingEnabled(Boolean bl2) {
        this.isLimitAdTrackingEnabled = bl2;
    }

    public final String toString() {
        String string2 = this.advertisingId;
        Boolean bl2 = this.isLimitAdTrackingEnabled;
        boolean bl3 = this.advertisingIdWithGps;
        StringBuilder stringBuilder = this.gaidError;
        StringBuilder stringBuilder2 = new StringBuilder("FetchGaidData(advertisingId=");
        stringBuilder2.append(string2);
        stringBuilder2.append(", isLimitAdTrackingEnabled=");
        stringBuilder2.append(bl2);
        stringBuilder2.append(", advertisingIdWithGps=");
        stringBuilder2.append(bl3);
        stringBuilder2.append(", gaidError=");
        stringBuilder2.append((Object)stringBuilder);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }
}

