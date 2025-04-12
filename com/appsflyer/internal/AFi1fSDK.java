/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFi1oSDK;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1fSDK
implements AFi1oSDK {
    private PluginInfo getMonetizationNetwork;

    public AFi1fSDK() {
        PluginInfo pluginInfo;
        Plugin plugin = Plugin.NATIVE;
        this.getMonetizationNetwork = pluginInfo = new PluginInfo(plugin, "6.15.2", null, 4, null);
    }

    public final Map getMediationNetwork() {
        int n3 = 1;
        Object object = this.getMonetizationNetwork.getPlugin().getPluginName();
        Object object2 = new Pair("platform", object);
        object = this.getMonetizationNetwork.getVersion();
        Pair pair = new Pair("version", object);
        int n4 = 2;
        object = new Pair[n4];
        object[0] = object2;
        object[n3] = pair;
        object = fh1_2.j((Pair[])object);
        object2 = this.getMonetizationNetwork.getAdditionalParams();
        int n7 = (int)(object2.isEmpty() ? 1 : 0);
        if ((n3 ^= n7) != 0) {
            Map map2 = this.getMonetizationNetwork.getAdditionalParams();
            object2 = "extras";
            object.put(object2, map2);
        }
        return object;
    }

    public final void getRevenue(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMonetizationNetwork = pluginInfo;
    }
}

