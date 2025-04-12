/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.telephony.TelephonyManager
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1pSDK;
import com.appsflyer.internal.AFi1rSDK$AFa1vSDK;
import kotlin.jvm.internal.Intrinsics;

public abstract class AFi1rSDK {
    public static final AFi1rSDK$AFa1vSDK AFa1vSDK;
    ConnectivityManager getCurrencyIso4217Code;
    private final TelephonyManager getMediationNetwork;

    static {
        AFi1rSDK$AFa1vSDK aFi1rSDK$AFa1vSDK;
        AFa1vSDK = aFi1rSDK$AFa1vSDK = new AFi1rSDK$AFa1vSDK(null);
    }

    public AFi1rSDK(Context object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = object.getSystemService("connectivity");
        boolean bl3 = object2 instanceof ConnectivityManager;
        Object object3 = null;
        if (bl3) {
            object2 = (ConnectivityManager)object2;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.getCurrencyIso4217Code = object2;
        object2 = "phone";
        object = object.getSystemService((String)object2);
        bl2 = object instanceof TelephonyManager;
        if (bl2) {
            object3 = object;
            object3 = (TelephonyManager)object;
        }
        this.getMediationNetwork = object3;
    }

    public static boolean x_(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    public abstract String getCurrencyIso4217Code();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFi1pSDK getMonetizationNetwork() {
        String string2;
        Object object;
        String string3;
        block7: {
            Object object2;
            block6: {
                block5: {
                    int n3;
                    string3 = null;
                    try {
                        object2 = this.getMediationNetwork;
                        if (object2 == null) break block5;
                        object = object2.getSimOperatorName();
                    }
                    catch (Throwable throwable) {
                        boolean bl2 = false;
                        object2 = null;
                        break block6;
                    }
                    try {
                        string3 = object2.getNetworkOperatorName();
                        if (string3 != null && (n3 = string3.length()) != 0) break block7;
                    }
                    catch (Throwable throwable) {
                        object2 = string3;
                        string3 = object;
                        object = throwable;
                        break block6;
                    }
                    int n4 = object2.getPhoneType();
                    if (n4 == (n3 = 2)) {
                        string3 = "CDMA";
                    }
                    break block7;
                }
                object = null;
                break block7;
            }
            string2 = "Exception while collecting network info. ";
            AFLogger.afErrorLog(string2, (Throwable)object);
            object = string3;
            string3 = object2;
        }
        string2 = this.getCurrencyIso4217Code();
        boolean bl3 = this.getRevenue();
        return new AFi1pSDK(string2, string3, (String)object, bl3);
    }

    public abstract boolean getRevenue();
}

