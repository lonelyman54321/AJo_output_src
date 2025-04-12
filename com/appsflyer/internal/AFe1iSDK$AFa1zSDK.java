/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1hSDK;
import com.appsflyer.internal.AFe1iSDK;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AFe1iSDK$AFa1zSDK {
    private AFe1iSDK$AFa1zSDK() {
    }

    public /* synthetic */ AFe1iSDK$AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static List getCurrencyIso4217Code() {
        return AFe1iSDK.getMonetizationNetwork();
    }

    public static void getMonetizationNetwork(AFe1hSDK aFe1hSDK) {
        AFe1iSDK.getCurrencyIso4217Code(aFe1hSDK);
    }
}

