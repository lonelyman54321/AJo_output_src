/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal.platform_extension;

import com.appsflyer.internal.platform_extension.Plugin;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PluginInfo {
    private final Map additionalParams;
    private final Plugin plugin;
    private final String version;

    public PluginInfo(Plugin plugin, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)plugin, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        this(plugin, string2, null, 4, null);
    }

    public PluginInfo(Plugin plugin, String string2, Map map2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)plugin, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(map2, string3);
        this.plugin = plugin;
        this.version = string2;
        this.additionalParams = map2;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String string2, Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 4) != 0) {
            map2 = fh1_2.f();
        }
        this(plugin, string2, map2);
    }

    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String string2, Map map2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = pluginInfo.version;
        }
        if ((n3 &= 4) != 0) {
            map2 = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, string2, map2);
    }

    public final Plugin component1() {
        return this.plugin;
    }

    public final String component2() {
        return this.version;
    }

    public final Map component3() {
        return this.additionalParams;
    }

    public final PluginInfo copy(Plugin plugin, String string2, Map map2) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)plugin, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(map2, (String)object);
        object = new PluginInfo(plugin, string2, map2);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PluginInfo;
        if (!bl3) {
            return false;
        }
        object = (PluginInfo)object;
        Object object2 = this.plugin;
        Object object3 = ((PluginInfo)object).plugin;
        if (object2 != object3) {
            return false;
        }
        object2 = this.version;
        object3 = ((PluginInfo)object).version;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.additionalParams;
        object = ((PluginInfo)object).additionalParams;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getAdditionalParams() {
        return this.additionalParams;
    }

    public final Plugin getPlugin() {
        return this.plugin;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.plugin)).hashCode() * 31;
        int n4 = (this.version.hashCode() + n3) * 31;
        return ((Object)this.additionalParams).hashCode() + n4;
    }

    public final String toString() {
        Plugin plugin = this.plugin;
        String string2 = this.version;
        Map map2 = this.additionalParams;
        StringBuilder stringBuilder = new StringBuilder("PluginInfo(plugin=");
        stringBuilder.append((Object)plugin);
        stringBuilder.append(", version=");
        stringBuilder.append(string2);
        stringBuilder.append(", additionalParams=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

