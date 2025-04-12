/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 */
package com.appsflyer.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import com.appsflyer.internal.AFi1lSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1lSDK$AFa1vSDK
extends ConnectivityManager.NetworkCallback {
    private /* synthetic */ AFi1lSDK getCurrencyIso4217Code;

    public AFi1lSDK$AFa1vSDK(AFi1lSDK aFi1lSDK) {
        this.getCurrencyIso4217Code = aFi1lSDK;
    }

    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "");
        AFi1lSDK.B_(this.getCurrencyIso4217Code, network);
    }

    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "");
        AFi1lSDK.B_(this.getCurrencyIso4217Code, network);
        AFi1lSDK.AFAdRevenueData(this.getCurrencyIso4217Code, "NetworkLost");
    }
}

