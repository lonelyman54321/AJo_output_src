/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFg1sSDK$2;
import com.appsflyer.internal.AFg1sSDK$5;
import com.appsflyer.internal.AFg1sSDK$AFa1vSDK;
import com.appsflyer.internal.AFg1vSDK;
import com.appsflyer.internal.AFh1cSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1uSDK;
import com.appsflyer.internal.AFi1vSDK;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1sSDK {
    public static final AFg1sSDK$AFa1vSDK AFa1vSDK;
    private static final long getRevenue;
    private final AFd1qSDK AFAdRevenueData;
    private final AFg1vSDK getCurrencyIso4217Code;
    private final rq1_2 getMediationNetwork;
    private final rq1_2 getMonetizationNetwork;

    static {
        AFg1sSDK$AFa1vSDK aFg1sSDK$AFa1vSDK;
        AFa1vSDK = aFg1sSDK$AFa1vSDK = new AFg1sSDK$AFa1vSDK(null);
        getRevenue = TimeUnit.HOURS.toSeconds(24);
    }

    public AFg1sSDK(AFd1qSDK object, AFg1vSDK aFg1vSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(aFg1vSDK, string2);
        this.AFAdRevenueData = object;
        this.getCurrencyIso4217Code = aFg1vSDK;
        object = new AFg1sSDK$2(this);
        this.getMediationNetwork = object = yr1_2.b((Function0)object);
        object = new AFg1sSDK$5(this);
        this.getMonetizationNetwork = object = yr1_2.b((Function0)object);
    }

    public static final /* synthetic */ AFd1qSDK getMonetizationNetwork(AFg1sSDK aFg1sSDK) {
        return aFg1sSDK.AFAdRevenueData;
    }

    public final long AFAdRevenueData() {
        Object object = this.AFAdRevenueData;
        Object object2 = "com.appsflyer.rc.cache.max-age-fallback";
        if ((object = ((AFd1qSDK)object).getRevenue((String)object2)) != null) {
            object2 = tl2_2.b;
            long l2 = Long.parseLong((String)object);
            try {
                object = l2;
            }
            catch (Throwable throwable) {
                object2 = tl2_2.b;
                object = vl2_2.a(throwable);
            }
            object2 = tl2_2.a(object);
            if (object2 != null) {
                object = ((Throwable)object2).getMessage();
                String string2 = "Can't read maxAgeFallback from Manifest: ";
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append((String)object);
                AFLogger.afErrorLog(stringBuilder.toString(), (Throwable)object2);
                l2 = getRevenue;
                object = l2;
            }
            return ((Number)object).longValue();
        }
        return getRevenue;
    }

    public final boolean getCurrencyIso4217Code() {
        return (Boolean)this.getMediationNetwork.getValue();
    }

    public final boolean getMediationNetwork() {
        return (Boolean)this.getMonetizationNetwork.getValue();
    }

    /*
     * WARNING - void declaration
     */
    public final boolean getRevenue() {
        long l2;
        long l3;
        void var5_8;
        Object object = this.getCurrencyIso4217Code.getRevenue;
        boolean bl2 = true;
        if (object == null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.component1;
            AFh1uSDK.i$default(aFLogger, aFh1vSDK, "active config is missing - fetching from CDN", false, 4, null);
            return bl2;
        }
        object = ((AFi1vSDK)object).getRevenue;
        Object var3_4 = null;
        if (object != null && (object = ((AFh1cSDK)object).getCurrencyIso4217Code) != null) {
            boolean n3 = ((AFi1uSDK)object).getCurrencyIso4217Code();
        } else {
            boolean bl3 = false;
            object = null;
        }
        long l4 = System.currentTimeMillis();
        AFg1vSDK aFg1vSDK = this.getCurrencyIso4217Code;
        long l7 = aFg1vSDK.getCurrencyIso4217Code;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long l8 = aFg1vSDK.getMonetizationNetwork;
        long l12 = timeUnit.toMillis(l8);
        if (var5_8 == false && (l3 = (l2 = (l4 -= l7) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
            return false;
        }
        return bl2;
    }
}

