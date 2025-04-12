/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.InstallSourceInfo
 *  android.content.pm.PackageManager
 *  android.os.Build$VERSION
 */
package com.appsflyer.internal;

import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.s;
import com.appsflyer.internal.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1rSDK {
    private final PackageManager AFAdRevenueData;
    private final Map getMonetizationNetwork;
    private final String getRevenue;

    public AFg1rSDK(AFd1nSDK object, AFd1qSDK aFd1qSDK) {
        LinkedHashMap linkedHashMap;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        this.getMonetizationNetwork = linkedHashMap = new LinkedHashMap();
        object = ((AFd1nSDK)object).AFAdRevenueData;
        object = object != null ? object.getPackageManager() : null;
        this.AFAdRevenueData = object;
        object = aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.getRevenue = object;
    }

    public final Map getRevenue() {
        Object object = this.getMonetizationNetwork;
        int n3 = object.isEmpty();
        if (n3 != 0) {
            int n4;
            String string2;
            Map<String, PackageManager> map2;
            block12: {
                object = this.AFAdRevenueData;
                if (object == null) break block12;
                map2 = this.getRevenue;
                object = object.getInstallerPackageName((String)((Object)map2));
                if (object == null) break block12;
                map2 = this.getMonetizationNetwork;
                string2 = "installer_package";
                try {
                    map2.put(string2, (PackageManager)object);
                }
                catch (Exception exception) {
                    map2 = "Exception while getting the app's installer package. ";
                    AFLogger.afErrorLog((String)((Object)map2), exception);
                }
            }
            if ((n3 = Build.VERSION.SDK_INT) >= (n4 = 30)) {
                object = this.getMonetizationNetwork;
                map2 = new Map<String, PackageManager>();
                string2 = this.getRevenue;
                Object object2 = this.AFAdRevenueData;
                if (object2 != null && (string2 = md3.a(object2, string2)) != null) {
                    String string3;
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    map2 = new Map<String, PackageManager>();
                    object2 = nd3.a((InstallSourceInfo)string2);
                    if (object2 != null) {
                        string3 = "initiating_package";
                        map2.put(string3, (PackageManager)object2);
                    }
                    if ((object2 = s.a((InstallSourceInfo)string2)) != null) {
                        string3 = "installing_package";
                        map2.put(string3, (PackageManager)object2);
                    }
                    if ((string2 = t.a((InstallSourceInfo)string2)) != null) {
                        object2 = "originating_package";
                        map2.put((String)object2, (PackageManager)string2);
                    }
                }
                string2 = "install_source_info";
                object.put(string2, map2);
            }
        }
        return this.getMonetizationNetwork;
    }
}

