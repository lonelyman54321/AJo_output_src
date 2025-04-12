/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.AppsFlyerConsent$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AppsFlyerConsent {
    public static final AppsFlyerConsent$Companion Companion;
    private final Boolean hasConsentForAdsPersonalization;
    private final Boolean hasConsentForDataUsage;
    private final boolean isUserSubjectToGDPR;

    static {
        AppsFlyerConsent$Companion appsFlyerConsent$Companion;
        Companion = appsFlyerConsent$Companion = new AppsFlyerConsent$Companion(null);
    }

    private AppsFlyerConsent(boolean bl2, Boolean bl3, Boolean bl4) {
        this.isUserSubjectToGDPR = bl2;
        this.hasConsentForDataUsage = bl3;
        this.hasConsentForAdsPersonalization = bl4;
    }

    public /* synthetic */ AppsFlyerConsent(boolean bl2, Boolean bl3, Boolean bl4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bl2, bl3, bl4);
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean bl2, Boolean bl3, Boolean bl4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((n3 &= 4) != 0) {
            bl4 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        return appsFlyerConsent.copy(bl2, bl3, bl4);
    }

    public static final AppsFlyerConsent forGDPRUser(boolean bl2, boolean bl3) {
        return Companion.forGDPRUser(bl2, bl3);
    }

    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    public final boolean component1() {
        return this.isUserSubjectToGDPR;
    }

    public final Boolean component2() {
        return this.hasConsentForDataUsage;
    }

    public final Boolean component3() {
        return this.hasConsentForAdsPersonalization;
    }

    public final AppsFlyerConsent copy(boolean bl2, Boolean bl3, Boolean bl4) {
        AppsFlyerConsent appsFlyerConsent = new AppsFlyerConsent(bl2, bl3, bl4);
        return appsFlyerConsent;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AppsFlyerConsent;
        if (!bl3) {
            return false;
        }
        object = (AppsFlyerConsent)object;
        bl3 = this.isUserSubjectToGDPR;
        boolean bl4 = ((AppsFlyerConsent)object).isUserSubjectToGDPR;
        if (bl3 != bl4) {
            return false;
        }
        Boolean bl5 = this.hasConsentForDataUsage;
        Boolean bl6 = ((AppsFlyerConsent)object).hasConsentForDataUsage;
        bl3 = Intrinsics.areEqual(bl5, bl6);
        if (!bl3) {
            return false;
        }
        bl5 = this.hasConsentForAdsPersonalization;
        object = ((AppsFlyerConsent)object).hasConsentForAdsPersonalization;
        boolean bl7 = Intrinsics.areEqual(bl5, object);
        if (!bl7) {
            return false;
        }
        return bl2;
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final int hashCode() {
        int n3;
        int n4 = (int)(this.isUserSubjectToGDPR ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
        }
        n4 *= 31;
        Boolean bl2 = this.hasConsentForDataUsage;
        int n7 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        bl2 = this.hasConsentForAdsPersonalization;
        if (bl2 != null) {
            n7 = ((Object)bl2).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    public final String toString() {
        boolean bl2 = this.isUserSubjectToGDPR;
        Boolean bl3 = this.hasConsentForDataUsage;
        Boolean bl4 = this.hasConsentForAdsPersonalization;
        StringBuilder stringBuilder = new StringBuilder("AppsFlyerConsent(isUserSubjectToGDPR=");
        stringBuilder.append(bl2);
        stringBuilder.append(", hasConsentForDataUsage=");
        stringBuilder.append(bl3);
        stringBuilder.append(", hasConsentForAdsPersonalization=");
        return nx3_0.a(stringBuilder, bl4, ")");
    }
}

