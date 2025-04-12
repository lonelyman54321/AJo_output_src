/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.NetworkRequest
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1rSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1lSDK
extends AFi1rSDK {
    private Network getMediationNetwork;
    private String getMonetizationNetwork;

    public AFi1lSDK(Context object) {
        AFh1vSDK aFh1vSDK;
        Throwable throwable2;
        Object object2;
        block6: {
            block5: {
                object2 = "";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                super((Context)object);
                this.getMonetizationNetwork = "unknown";
                super(this);
                try {
                    object2 = this.getCurrencyIso4217Code;
                    if (object2 == null) break block5;
                }
                catch (Throwable throwable2) {}
                super();
                aFh1vSDK = aFh1vSDK.build();
                object2.registerNetworkCallback((NetworkRequest)aFh1vSDK, (ConnectivityManager.NetworkCallback)object);
                return;
                break block6;
            }
            return;
        }
        object2 = AFLogger.INSTANCE;
        aFh1vSDK = AFh1vSDK.d;
        AFh1uSDK.e$default((AFh1uSDK)object2, aFh1vSDK, "Error at attempt to register network callback with ConnectivityManager", throwable2, true, false, false, false, 96, null);
    }

    public static final /* synthetic */ void AFAdRevenueData(AFi1lSDK aFi1lSDK, String string2) {
        aFi1lSDK.getMonetizationNetwork = string2;
    }

    private static boolean A_(NetworkCapabilities networkCapabilities) {
        boolean bl2;
        int n3;
        return networkCapabilities != null && (n3 = networkCapabilities.hasTransport(4)) != 0 && !(bl2 = networkCapabilities.hasCapability(n3 = 15));
    }

    public static final /* synthetic */ void B_(AFi1lSDK aFi1lSDK, Network network) {
        aFi1lSDK.getMediationNetwork = network;
    }

    public final String getCurrencyIso4217Code() {
        Network network = this.getMediationNetwork;
        String string2 = "unknown";
        if (network != null) {
            boolean bl2;
            ConnectivityManager connectivityManager = this.getCurrencyIso4217Code;
            if (connectivityManager != null) {
                network = connectivityManager.getNetworkCapabilities(network);
            } else {
                bl2 = false;
                network = null;
            }
            if (network != null) {
                boolean bl3 = network.hasTransport(1);
                if (bl3) {
                    return "WIFI";
                }
                bl3 = false;
                connectivityManager = null;
                bl2 = network.hasTransport(0);
                if (bl2) {
                    return "MOBILE";
                }
            }
        }
        return string2;
    }

    public final boolean getRevenue() {
        Network network = this.getMediationNetwork;
        if (network != null) {
            String string2 = this.getMonetizationNetwork;
            boolean bl2 = Intrinsics.areEqual(string2, "NetworkLost") ^ true;
            NetworkCapabilities networkCapabilities = null;
            if (!bl2) {
                network = null;
            }
            if (network != null) {
                string2 = this.getCurrencyIso4217Code;
                if (string2 != null) {
                    networkCapabilities = string2.getNetworkCapabilities(network);
                }
                if (networkCapabilities != null) {
                    return AFi1lSDK.A_(networkCapabilities);
                }
            }
        }
        return false;
    }
}

