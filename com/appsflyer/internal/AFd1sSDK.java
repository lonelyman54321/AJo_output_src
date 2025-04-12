/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1sSDK$5;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1sSDK
implements AFd1rSDK {
    private final rq1_2 AFAdRevenueData;
    private final AFd1mSDK getMonetizationNetwork;

    public AFd1sSDK(AFd1mSDK object) {
        Intrinsics.checkNotNullParameter(object, "");
        this.getMonetizationNetwork = object;
        object = new AFd1sSDK$5(this);
        this.AFAdRevenueData = object = yr1_2.b((Function0)object);
    }

    public static final /* synthetic */ AFd1mSDK getMonetizationNetwork(AFd1sSDK aFd1sSDK) {
        return aFd1sSDK.getMonetizationNetwork;
    }

    public final void AFAdRevenueData(String string2) {
        ((SharedPreferences)this.AFAdRevenueData.getValue()).edit().remove(string2).apply();
    }

    public final void AFAdRevenueData(String string2, int n3) {
        ((SharedPreferences)this.AFAdRevenueData.getValue()).edit().putInt(string2, n3).apply();
    }

    public final void AFAdRevenueData(String string2, String string3) {
        ((SharedPreferences)this.AFAdRevenueData.getValue()).edit().putString(string2, string3).apply();
    }

    public final int getMediationNetwork(String string2, int n3) {
        Object object;
        try {
            object = this.AFAdRevenueData;
        }
        catch (ClassCastException classCastException) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.areAllFieldsValid;
            String string3 = kp1_0.c("Unexpected data type found for key ", string2);
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, classCastException, false, false, false, false, 120, null);
            return n3;
        }
        object = object.getValue();
        object = (SharedPreferences)object;
        return object.getInt(string2, n3);
    }

    public final long getMediationNetwork(String string2, long l2) {
        Object object;
        try {
            object = this.AFAdRevenueData;
        }
        catch (ClassCastException classCastException) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.areAllFieldsValid;
            String string3 = kp1_0.c("Unexpected data type found for key ", string2);
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, classCastException, false, false, false, false, 120, null);
            return l2;
        }
        object = object.getValue();
        object = (SharedPreferences)object;
        return object.getLong(string2, l2);
    }

    public final boolean getMediationNetwork(String string2) {
        Object object;
        try {
            object = this.AFAdRevenueData;
        }
        catch (ClassCastException classCastException) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.areAllFieldsValid;
            String string3 = kp1_0.c("Unexpected data type found for key ", string2);
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, classCastException, false, false, false, false, 120, null);
            return false;
        }
        object = object.getValue();
        object = (SharedPreferences)object;
        return object.getBoolean(string2, false);
    }

    public final String getMonetizationNetwork(String string2, String string3) {
        Object object;
        try {
            object = this.AFAdRevenueData;
        }
        catch (ClassCastException classCastException) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.areAllFieldsValid;
            String string4 = kp1_0.c("Unexpected data type found for key ", string2);
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, string4, classCastException, false, false, false, false, 120, null);
            return string3;
        }
        object = object.getValue();
        object = (SharedPreferences)object;
        return object.getString(string2, string3);
    }

    public final void getMonetizationNetwork(String string2, long l2) {
        ((SharedPreferences)this.AFAdRevenueData.getValue()).edit().putLong(string2, l2).apply();
    }

    public final boolean getMonetizationNetwork(String string2) {
        return ((SharedPreferences)this.AFAdRevenueData.getValue()).contains(string2);
    }

    public final void getRevenue(String string2, boolean bl2) {
        ((SharedPreferences)this.AFAdRevenueData.getValue()).edit().putBoolean(string2, bl2).apply();
    }
}

