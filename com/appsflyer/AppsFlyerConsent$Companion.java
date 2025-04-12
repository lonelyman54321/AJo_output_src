/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.AppsFlyerConsent;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AppsFlyerConsent$Companion {
    private AppsFlyerConsent$Companion() {
    }

    public /* synthetic */ AppsFlyerConsent$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AppsFlyerConsent forGDPRUser(boolean bl2, boolean bl3) {
        Boolean bl4 = bl2;
        Boolean bl5 = bl3;
        AppsFlyerConsent appsFlyerConsent = new AppsFlyerConsent(true, bl4, bl5, null);
        return appsFlyerConsent;
    }

    public final AppsFlyerConsent forNonGDPRUser() {
        AppsFlyerConsent appsFlyerConsent = new AppsFlyerConsent(false, null, null, null);
        return appsFlyerConsent;
    }
}

