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

final class AFLogger$5
extends Lambda
implements Function1 {
    private /* synthetic */ String $AFAdRevenueData;
    private /* synthetic */ boolean $getMediationNetwork;
    private /* synthetic */ AFh1vSDK $getRevenue;

    public AFLogger$5(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        this.$getRevenue = aFh1vSDK;
        this.$AFAdRevenueData = string2;
        this.$getMediationNetwork = bl2;
        super(1);
    }

    public final void getMonetizationNetwork(AFh1uSDK aFh1uSDK) {
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        AFh1vSDK aFh1vSDK = this.$getRevenue;
        String string2 = this.$AFAdRevenueData;
        boolean bl2 = this.$getMediationNetwork;
        aFh1uSDK.d(aFh1vSDK, string2, bl2);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (AFh1uSDK)object;
        this.getMonetizationNetwork((AFh1uSDK)object);
        return Unit.a;
    }
}

