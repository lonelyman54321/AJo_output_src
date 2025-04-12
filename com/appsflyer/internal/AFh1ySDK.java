/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger$LogLevel;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFh1ySDK$AFa1vSDK;
import com.appsflyer.internal.AFh1ySDK$AFa1ySDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFh1ySDK
extends AFh1uSDK {
    public static final AFh1ySDK$AFa1ySDK AFa1ySDK;

    static {
        AFh1ySDK$AFa1ySDK aFh1ySDK$AFa1ySDK;
        AFa1ySDK = aFh1ySDK$AFa1ySDK = new AFh1ySDK$AFa1ySDK(null);
    }

    private static boolean AFAdRevenueData(AFLogger$LogLevel aFLogger$LogLevel) {
        AppsFlyerProperties appsFlyerProperties;
        int n3;
        int n4 = aFLogger$LogLevel.getLevel();
        return n4 <= (n3 = (appsFlyerProperties = AppsFlyerProperties.getInstance()).getLogLevel());
    }

    private final void getRevenue(AFLogger$LogLevel aFLogger$LogLevel, AFh1vSDK object, String string2, Throwable throwable) {
        boolean bl2 = AFh1ySDK.AFAdRevenueData(aFLogger$LogLevel);
        if (bl2) {
            this.getRevenue(string2, (AFh1vSDK)((Object)object));
            object = AFh1ySDK$AFa1vSDK.getMediationNetwork;
            Object object2 = aFLogger$LogLevel.ordinal();
            object2 = (Object)object[object2];
        }
    }

    public final void d(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, object);
        Intrinsics.checkNotNullParameter(string2, object);
        object = AFLogger$LogLevel.DEBUG;
        this.getRevenue((AFLogger$LogLevel)((Object)object), aFh1vSDK, string2, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String string2, Throwable object, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(object, string3);
        if (bl3) {
            AFLogger$LogLevel aFLogger$LogLevel = AFLogger$LogLevel.ERROR;
            this.getRevenue(aFLogger$LogLevel, aFh1vSDK, string2, (Throwable)object);
            return;
        }
        if (bl2) {
            object = AFLogger$LogLevel.DEBUG;
            bl2 = false;
            Object var9_10 = null;
            this.getRevenue((AFLogger$LogLevel)((Object)object), aFh1vSDK, string2, null);
        }
    }

    public final void force(AFh1vSDK aFh1vSDK, String string2) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = AppsFlyerProperties.getInstance();
        boolean bl2 = ((AppsFlyerProperties)object).isLogsDisabledCompletely();
        if (!bl2) {
            this.withTag$SDK_prodRelease(string2, aFh1vSDK);
        }
    }

    public final boolean getShouldExtendMsg() {
        AppsFlyerProperties appsFlyerProperties;
        int n3;
        AFLogger$LogLevel aFLogger$LogLevel = AFLogger$LogLevel.VERBOSE;
        int n4 = aFLogger$LogLevel.getLevel();
        return n4 <= (n3 = (appsFlyerProperties = AppsFlyerProperties.getInstance()).getLogLevel());
    }

    public final void i(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, object);
        Intrinsics.checkNotNullParameter(string2, object);
        object = AFLogger$LogLevel.INFO;
        this.getRevenue((AFLogger$LogLevel)((Object)object), aFh1vSDK, string2, null);
    }

    public final void v(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, object);
        Intrinsics.checkNotNullParameter(string2, object);
        object = AFLogger$LogLevel.VERBOSE;
        this.getRevenue((AFLogger$LogLevel)((Object)object), aFh1vSDK, string2, null);
    }

    public final void w(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, object);
        Intrinsics.checkNotNullParameter(string2, object);
        object = AFLogger$LogLevel.WARNING;
        this.getRevenue((AFLogger$LogLevel)((Object)object), aFh1vSDK, string2, null);
    }
}

