/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1aSDK$AFa1tSDK;

final class AFb1aSDK$2
implements AFb1aSDK$AFa1tSDK {
    private /* synthetic */ AFb1aSDK getMonetizationNetwork;

    public AFb1aSDK$2(AFb1aSDK aFb1aSDK) {
        this.getMonetizationNetwork = aFb1aSDK;
    }

    public final Class getCurrencyIso4217Code(String string2) {
        return Class.forName(string2);
    }
}

