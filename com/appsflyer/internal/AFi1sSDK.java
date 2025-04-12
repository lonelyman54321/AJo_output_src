/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.NetworkInfo
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1rSDK;
import com.appsflyer.internal.AFi1sSDK$4;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class AFi1sSDK
extends AFi1rSDK {
    public AFi1sSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super(context);
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        boolean bl2;
        int n3;
        return networkCapabilities != null && (n3 = networkCapabilities.hasTransport(4)) != 0 && !(bl2 = networkCapabilities.hasCapability(n3 = 15));
    }

    public final String getCurrencyIso4217Code() {
        NetworkInfo networkInfo = this.getCurrencyIso4217Code;
        String string2 = "unknown";
        if (networkInfo != null && (networkInfo = networkInfo.getAllNetworks()) != null && (networkInfo = tp_2.s((Object[])networkInfo)) != null) {
            int n3;
            block5: {
                Object object = new AFi1sSDK$4(this);
                networkInfo = kz2_1.j((Sequence)networkInfo, (Function1)object);
                object = new UM0$a((um0_2)networkInfo);
                while ((n3 = ((UM0$a)object).hasNext()) != 0) {
                    NetworkInfo networkInfo2 = networkInfo = ((UM0$a)object).next();
                    networkInfo2 = networkInfo;
                    boolean bl2 = AFi1rSDK.x_(networkInfo2);
                    if (!bl2) continue;
                    break block5;
                }
                n3 = 0;
                networkInfo = null;
            }
            networkInfo = networkInfo;
            if (networkInfo != null) {
                n3 = networkInfo.getType();
                if (n3 != 0) {
                    int n4 = 1;
                    if (n3 != n4) {
                        return string2;
                    }
                    return "WIFI";
                }
                return "MOBILE";
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean getRevenue() {
        boolean bl2;
        int n3;
        NetworkCapabilities networkCapabilities;
        Object object;
        boolean bl3;
        block4: {
            bl3 = false;
            try {
                object = this.getCurrencyIso4217Code;
                if (object == null) return bl3;
                if ((object = object.getAllNetworks()) == null) return bl3;
                networkCapabilities = new ArrayList();
                n3 = ((Network[])object).length;
                break block4;
            }
            catch (Exception exception) {}
            String string2 = "Failed collecting ivc data";
            AFLogger.afErrorLog(string2, exception);
            return bl3;
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            Network network = object[i3];
            ConnectivityManager connectivityManager = this.getCurrencyIso4217Code;
            Intrinsics.checkNotNull(connectivityManager);
            network = connectivityManager.getNetworkCapabilities(network);
            if (network == null) continue;
            networkCapabilities.add(network);
        }
        boolean bl4 = networkCapabilities.isEmpty();
        if (bl4) return bl3;
        object = networkCapabilities.iterator();
        do {
            if (!(bl2 = object.hasNext())) return bl3;
            networkCapabilities = object.next();
        } while (!(bl2 = AFi1sSDK.y_(networkCapabilities = (NetworkCapabilities)networkCapabilities)));
        return true;
    }
}

