/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.utils;

import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.utils.GAUtils$Companion;

public final class GAUtils {
    public static final int $stable;
    public static final GAUtils$Companion Companion;

    static {
        GAUtils$Companion gAUtils$Companion;
        Companion = gAUtils$Companion = new GAUtils$Companion(null);
    }

    public final boolean isGaRevampCustomEventsEnabled() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_ga_revamp_custom_events");
    }

    public final boolean isGaRevampEcommerceEventsEnabled() {
        return true;
    }

    public final boolean isGaRevampScreenViewEventsEnabled() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_ga_revamp_screen_view_events");
    }
}

