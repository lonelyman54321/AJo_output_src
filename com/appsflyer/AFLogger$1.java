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

final class AFLogger$1
extends Lambda
implements Function1 {
    private /* synthetic */ AFh1vSDK $getMediationNetwork;
    private /* synthetic */ String $getRevenue;

    public AFLogger$1(AFh1vSDK aFh1vSDK, String string2) {
        this.$getMediationNetwork = aFh1vSDK;
        this.$getRevenue = string2;
        super(1);
    }

    public final void getMediationNetwork(AFh1uSDK aFh1uSDK) {
        Intrinsics.checkNotNullParameter(aFh1uSDK, "");
        AFh1vSDK aFh1vSDK = this.$getMediationNetwork;
        String string2 = this.$getRevenue;
        aFh1uSDK.force(aFh1vSDK, string2);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (AFh1uSDK)object;
        this.getMediationNetwork((AFh1uSDK)object);
        return Unit.a;
    }
}

