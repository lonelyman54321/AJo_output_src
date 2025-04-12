/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ComponentInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;

public final class af {
    public static void a(PackageManager packageManager, ComponentName componentName, int n3) {
        block18: {
            int n4;
            block17: {
                ComponentInfo componentInfo;
                block16: {
                    n3 = packageManager.getComponentEnabledSetting(componentName);
                    if (n3 == (n4 = 1)) break block18;
                    int n7 = 2;
                    if (n3 == n7) break block17;
                    ProviderInfo[] providerInfoArray = componentName.getPackageName();
                    String string2 = componentName.getClassName();
                    int n8 = 516;
                    providerInfoArray = packageManager.getPackageInfo((String)providerInfoArray, n8);
                    n8 = 3;
                    ComponentInfo[][] componentInfoArrayArray = new ComponentInfo[n8][];
                    ActivityInfo[] activityInfoArray = providerInfoArray.activities;
                    componentInfoArrayArray[0] = activityInfoArray;
                    activityInfoArray = providerInfoArray.services;
                    componentInfoArrayArray[n4] = activityInfoArray;
                    providerInfoArray = providerInfoArray.providers;
                    componentInfoArrayArray[n7] = providerInfoArray;
                    providerInfoArray = null;
                    for (n3 = 0; n3 < n8; ++n3) {
                        ComponentInfo[] componentInfoArray = componentInfoArrayArray[n3];
                        if (componentInfoArray == null) continue;
                        int n10 = componentInfoArray.length;
                        for (int i3 = 0; i3 < n10; ++i3) {
                            componentInfo = componentInfoArray[i3];
                            String string3 = componentInfo.name;
                            boolean bl2 = string3.equals(string2);
                            if (!bl2) {
                                continue;
                            }
                            break block16;
                        }
                    }
                    componentInfo = null;
                }
                if (componentInfo == null) break block17;
                try {
                    n3 = (int)(componentInfo.isEnabled() ? 1 : 0);
                    if (n3 == 0) break block17;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
            packageManager.setComponentEnabledSetting(componentName, n4, n4);
        }
    }
}

