/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.preference.PreferenceManager
 */
package com.appsflyer.internal;

import android.content.Context;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1oSDK;
import com.appsflyer.internal.AFg1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1nSDK
implements AFg1qSDK {
    private final Context getMediationNetwork;
    private final AppsFlyerProperties getRevenue;

    public AFg1nSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(appsFlyerProperties, string2);
        this.getMediationNetwork = context;
        this.getRevenue = appsFlyerProperties;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFg1oSDK getCurrencyIso4217Code() {
        Exception exception2;
        Object object;
        block4: {
            Object object2;
            int n3;
            int n4;
            int n7;
            int n8;
            Object object3;
            block3: {
                object3 = this.getRevenue.getString("enableTCFDataCollection");
                boolean bl2 = Boolean.parseBoolean((String)object3);
                object = null;
                if (!bl2) {
                    return null;
                }
                try {
                    object3 = this.getMediationNetwork;
                    object3 = PreferenceManager.getDefaultSharedPreferences((Context)object3);
                    String string2 = "IABTCF_gdprApplies";
                    int n10 = -1;
                    n8 = object3.getInt(string2, n10);
                    string2 = "IABTCF_CmpSdkID";
                    n7 = object3.getInt(string2, n10);
                    string2 = "IABTCF_PolicyVersion";
                    n4 = object3.getInt(string2, n10);
                    string2 = "IABTCF_CmpSdkVersion";
                    n3 = object3.getInt(string2, n10);
                    int n14 = 1;
                    object2 = "";
                    if (n8 != n14 || (object3 = object3.getString(string2 = "IABTCF_TCString", (String)object2)) == null) break block3;
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    object2 = object3;
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            Object object4 = object3;
            object3 = new AFg1oSDK(n4, n8, n7, n3, (String)object2);
            return object3;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.force;
        int n15 = 120;
        String string3 = "TCF data collection exception";
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, exception2, false, false, false, false, n15, null);
        return object;
    }
}

