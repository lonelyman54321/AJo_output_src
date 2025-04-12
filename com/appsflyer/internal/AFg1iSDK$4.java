/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFg1iSDK$4
extends Lambda
implements Function0 {
    public static final AFg1iSDK$4 AFAdRevenueData;

    static {
        AFg1iSDK$4 aFg1iSDK$4;
        AFAdRevenueData = aFg1iSDK$4 = new AFg1iSDK$4();
    }

    public AFg1iSDK$4() {
        super(0);
    }

    public final SimpleDateFormat getMediationNetwork() {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale);
        return simpleDateFormat;
    }

    public final /* synthetic */ Object invoke() {
        return this.getMediationNetwork();
    }
}

