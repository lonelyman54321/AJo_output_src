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

final class AFLogger$4
extends Lambda
implements Function1 {
    private /* synthetic */ boolean $AFAdRevenueData;
    private /* synthetic */ String $getMonetizationNetwork;
    private /* synthetic */ AFh1vSDK $getRevenue;

    public AFLogger$4(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        this.$getRevenue = aFh1vSDK;
        this.$getMonetizationNetwork = string2;
        this.$AFAdRevenueData = bl2;
        super(1);
    }

    public final void getCurrencyIso4217Code(AFh1uSDK aFh1uSDK) {
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        AFh1vSDK aFh1vSDK = this.$getRevenue;
        String string2 = this.$getMonetizationNetwork;
        boolean bl2 = this.$AFAdRevenueData;
        aFh1uSDK.i(aFh1vSDK, string2, bl2);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (AFh1uSDK)object;
        this.getCurrencyIso4217Code((AFh1uSDK)object);
        return Unit.a;
    }
}

