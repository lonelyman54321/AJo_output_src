/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageItemInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources$NotFoundException
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFh1pSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class AFd1qSDK {
    private static String getMediationNetwork = "331";
    public final AFd1tSDK AFAdRevenueData;
    private final Executor component2;
    private Bundle component4 = null;
    public String getCurrencyIso4217Code = "";
    public final AFd1nSDK getMonetizationNetwork;
    public final AFd1rSDK getRevenue;

    public AFd1qSDK(AFd1nSDK aFd1nSDK, AFd1rSDK aFd1rSDK, AFd1tSDK aFd1tSDK, Executor executor) {
        this.getMonetizationNetwork = aFd1nSDK;
        this.getRevenue = aFd1rSDK;
        this.AFAdRevenueData = aFd1tSDK;
        this.component2 = executor;
    }

    public static String AFAdRevenueData() {
        return AppsFlyerProperties.getInstance().getString("AppUserId");
    }

    public static String areAllFieldsValid() {
        StringBuilder stringBuilder = new StringBuilder("version: 6.15.2 (build ");
        String string2 = getMediationNetwork;
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return ((Object)stringBuilder).toString();
    }

    public static String getCurrencyIso4217Code() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getMediationNetwork() {
        return ((Object)UUID.randomUUID()).toString();
    }

    public static boolean getMonetizationNetwork(Context object) {
        Object object2 = object.getPackageManager();
        object = object.getPackageName();
        object = object2.getApplicationInfo((String)object, 0);
        try {
            int n3 = object.flags;
            int n4 = 1;
            if ((n3 &= n4) != 0) {
                return n4 != 0;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object2 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.AFLogger;
            String string2 = "Could not check if app is pre installed";
            ((AFh1uSDK)object2).e(aFh1vSDK, string2, nameNotFoundException);
        }
        return false;
    }

    public static String getRevenue() {
        return "6.15.2";
    }

    public final String AFAdRevenueData(Context context) {
        Object object;
        Object object2;
        try {
            object2 = this.component2;
        }
        catch (Throwable throwable) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.AFLogger;
            ((AFh1uSDK)object).e((AFh1vSDK)((Object)object2), "Exception while collecting facebook's attribution ID. ", throwable, true, false, false);
            return null;
        }
        object = new AFb1mSDK(context, (Executor)object2);
        return ((AFb1mSDK)object).getMediationNetwork();
    }

    public final String AFAdRevenueData(String string2) {
        block11: {
            Object object = this.getMonetizationNetwork;
            object = ((AFd1nSDK)object).AFAdRevenueData;
            object = object.getResources();
            String string3 = "string";
            Object object2 = this.getMonetizationNetwork;
            object2 = ((AFd1nSDK)object2).AFAdRevenueData;
            object2 = object2.getPackageName();
            int n3 = object.getIdentifier(string2, string3, (String)object2);
            if (n3 == 0) break block11;
            object = this.getMonetizationNetwork;
            object = ((AFd1nSDK)object).AFAdRevenueData;
            try {
                return object.getString(n3);
            }
            catch (Resources.NotFoundException notFoundException) {
                object = new StringBuilder("Could not load string resource!");
                string3 = notFoundException.getMessage();
                ((StringBuilder)object).append(string3);
                object = object.toString();
                AFLogger.afErrorLog((String)object, notFoundException);
            }
        }
        return null;
    }

    public final boolean AFAdRevenueData(String string2, boolean bl2) {
        if ((string2 = this.getRevenue(string2)) != null) {
            return Boolean.parseBoolean(string2);
        }
        return bl2;
    }

    public final boolean component1() {
        AFd1tSDK aFd1tSDK = this.AFAdRevenueData;
        boolean bl2 = aFd1tSDK.getMonetizationNetwork();
        return !bl2;
    }

    public final String component4() {
        boolean bl2;
        Object object = AppsFlyerProperties.getInstance();
        String string2 = "channel";
        if ((object = ((AppsFlyerProperties)object).getString(string2)) == null) {
            object = this.getRevenue("CHANNEL");
        }
        if (object != null && (bl2 = object.equals(string2 = ""))) {
            object = null;
        }
        return object;
    }

    public final String getMonetizationNetwork() {
        AFb1tSDK aFb1tSDK;
        Object object = this.AFAdRevenueData.component4;
        if (object != null) {
            String string2 = ((AFh1pSDK)object).getMonetizationNetwork;
            object = ((AFh1pSDK)object).AFAdRevenueData;
            aFb1tSDK = new AFb1tSDK(string2, (Boolean)object);
        } else {
            aFb1tSDK = null;
        }
        if (aFb1tSDK != null) {
            return aFb1tSDK.getRevenue;
        }
        return null;
    }

    public final String getRevenue(String object) {
        Object object2;
        Throwable throwable2;
        Object object3;
        block13: {
            block12: {
                try {
                    object3 = this.component4;
                    if (object3 != null) break block12;
                }
                catch (Throwable throwable2) {}
                object3 = this.getMonetizationNetwork;
                object3 = ((AFd1nSDK)object3).AFAdRevenueData;
                object3 = object3.getPackageManager();
                object2 = this.getMonetizationNetwork;
                object2 = ((AFd1nSDK)object2).AFAdRevenueData;
                object2 = object2.getPackageName();
                int n3 = 128;
                object3 = object3.getApplicationInfo((String)object2, n3);
                object3 = ((PackageItemInfo)object3).metaData;
                this.component4 = object3;
                break block13;
            }
            if ((object3 = this.component4) != null && (object = object3.get((String)object)) != null) {
                return object.toString();
            }
            return null;
        }
        object3 = new StringBuilder("Could not load manifest metadata!");
        object2 = throwable2.getMessage();
        ((StringBuilder)object3).append((String)object2);
        AFLogger.afErrorLog(object3.toString(), throwable2);
        return null;
    }
}

