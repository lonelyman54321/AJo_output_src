/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkInfo
 */
package com.appsflyer.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.appsflyer.internal.AFi1sSDK;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFi1sSDK$4
extends Lambda
implements Function1 {
    private /* synthetic */ AFi1sSDK getMediationNetwork;

    public AFi1sSDK$4(AFi1sSDK aFi1sSDK) {
        this.getMediationNetwork = aFi1sSDK;
        super(1);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (Network)object;
        return this.z_((Network)object);
    }

    public final NetworkInfo z_(Network network) {
        ConnectivityManager connectivityManager = this.getMediationNetwork.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(connectivityManager);
        return connectivityManager.getNetworkInfo(network);
    }
}

