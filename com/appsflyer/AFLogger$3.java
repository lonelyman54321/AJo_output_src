/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFLogger$3
extends Lambda
implements Function1 {
    private /* synthetic */ boolean $AFAdRevenueData;
    private /* synthetic */ boolean $component3;
    private /* synthetic */ boolean $component4;
    private /* synthetic */ Throwable $getCurrencyIso4217Code;
    private /* synthetic */ AFh1vSDK $getMediationNetwork;
    private /* synthetic */ boolean $getMonetizationNetwork;
    private /* synthetic */ String $getRevenue;

    public AFLogger$3(AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.$getMediationNetwork = aFh1vSDK;
        this.$getRevenue = string2;
        this.$getCurrencyIso4217Code = throwable;
        this.$getMonetizationNetwork = bl2;
        this.$AFAdRevenueData = bl3;
        this.$component4 = bl4;
        this.$component3 = bl5;
        super(1);
    }

    public final void AFAdRevenueData(AFh1uSDK aFh1uSDK) {
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        AFh1vSDK aFh1vSDK = this.$getMediationNetwork;
        String string2 = this.$getRevenue;
        Throwable throwable = this.$getCurrencyIso4217Code;
        boolean bl2 = this.$getMonetizationNetwork;
        boolean bl3 = this.$AFAdRevenueData;
        boolean bl4 = this.$component4;
        boolean bl5 = this.$component3;
        aFh1uSDK.e(aFh1vSDK, string2, throwable, bl2, bl3, bl4, bl5);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (AFh1uSDK)object;
        this.AFAdRevenueData((AFh1uSDK)object);
        return Unit.a;
    }
}

