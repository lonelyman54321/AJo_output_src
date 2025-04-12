/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1rSDK;
import java.net.NetworkInterface;
import java.util.Collection;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1nSDK
extends AFi1rSDK {
    public AFi1nSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super(context);
    }

    public final String getCurrencyIso4217Code() {
        ConnectivityManager connectivityManager = this.getCurrencyIso4217Code;
        String string2 = "unknown";
        if (connectivityManager != null) {
            int n3 = 1;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(n3);
            boolean bl2 = AFi1rSDK.x_(networkInfo);
            String string3 = "WIFI";
            if (bl2) {
                return string3;
            }
            networkInfo = connectivityManager.getNetworkInfo(0);
            bl2 = AFi1rSDK.x_(networkInfo);
            String string4 = "MOBILE";
            if (bl2) {
                return string4;
            }
            if ((connectivityManager = connectivityManager.getActiveNetworkInfo()) != null) {
                int n4 = connectivityManager.getType();
                if (n4 != 0) {
                    if (n4 != n3) {
                        return string2;
                    }
                    return string3;
                }
                return string4;
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
        Exception exception2;
        block5: {
            Object object;
            Object object2 = "";
            try {
                object = NetworkInterface.getNetworkInterfaces();
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object = Collections.list(object);
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            }
            catch (Exception exception2) {
                break block5;
            }
            boolean bl2 = object instanceof Collection;
            if (!bl2 || !(bl2 = ((Collection)object).isEmpty())) {
                boolean bl3;
                object2 = ((Iterable)object).iterator();
                while (bl3 = object2.hasNext()) {
                    String string2;
                    object = object2.next();
                    boolean bl4 = ((NetworkInterface)(object = (NetworkInterface)object)).isUp();
                    if (!bl4 || !(bl3 = Intrinsics.areEqual(object = ((NetworkInterface)object).getName(), string2 = "tun0"))) continue;
                    return true;
                }
            }
            return false;
        }
        AFLogger.afErrorLog("Failed collecting ivc data", exception2);
        return false;
    }
}

