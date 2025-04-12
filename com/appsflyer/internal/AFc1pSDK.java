/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1pSDK {
    public final DeepLink getCurrencyIso4217Code;
    private final boolean getMonetizationNetwork;

    public AFc1pSDK() {
        this(false, null, 3, null);
    }

    public AFc1pSDK(boolean bl2, DeepLink deepLink) {
        this.getMonetizationNetwork = bl2;
        this.getCurrencyIso4217Code = deepLink;
    }

    public /* synthetic */ AFc1pSDK(boolean bl2, DeepLink deepLink, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 2) != 0) {
            deepLink = null;
        }
        this(bl2, deepLink);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AFc1pSDK;
        if (!bl3) {
            return false;
        }
        object = (AFc1pSDK)object;
        bl3 = this.getMonetizationNetwork;
        boolean bl4 = ((AFc1pSDK)object).getMonetizationNetwork;
        if (bl3 != bl4) {
            return false;
        }
        DeepLink deepLink = this.getCurrencyIso4217Code;
        object = ((AFc1pSDK)object).getCurrencyIso4217Code;
        boolean bl5 = Intrinsics.areEqual(deepLink, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork;
    }

    public final int hashCode() {
        int n3;
        int n4 = (int)(this.getMonetizationNetwork ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
        }
        n4 *= 31;
        DeepLink deepLink = this.getCurrencyIso4217Code;
        if (deepLink == null) {
            n3 = 0;
            deepLink = null;
        } else {
            n3 = deepLink.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        boolean bl2 = this.getMonetizationNetwork;
        DeepLink deepLink = this.getCurrencyIso4217Code;
        StringBuilder stringBuilder = new StringBuilder("DdlResponse(secondPing=");
        stringBuilder.append(bl2);
        stringBuilder.append(", deepLink=");
        stringBuilder.append(deepLink);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

