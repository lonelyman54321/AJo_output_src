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

final class AFLogger$6
extends Lambda
implements Function1 {
    private /* synthetic */ boolean $AFAdRevenueData;
    private /* synthetic */ AFh1vSDK $getCurrencyIso4217Code;
    private /* synthetic */ String $getMediationNetwork;

    public AFLogger$6(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        this.$getCurrencyIso4217Code = aFh1vSDK;
        this.$getMediationNetwork = string2;
        this.$AFAdRevenueData = bl2;
        super(1);
    }

    public final void getRevenue(AFh1uSDK aFh1uSDK) {
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        AFh1vSDK aFh1vSDK = this.$getCurrencyIso4217Code;
        String string2 = this.$getMediationNetwork;
        boolean bl2 = this.$AFAdRevenueData;
        aFh1uSDK.v(aFh1vSDK, string2, bl2);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (AFh1uSDK)object;
        this.getRevenue((AFh1uSDK)object);
        return Unit.a;
    }
}

