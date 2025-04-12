/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1vSDK;
import java.nio.charset.Charset;

public final class AFg1vSDK {
    public AFi1vSDK AFAdRevenueData = null;
    public long getCurrencyIso4217Code;
    public final AFd1rSDK getMediationNetwork;
    public long getMonetizationNetwork;
    public AFi1vSDK getRevenue;

    public AFg1vSDK(AFd1rSDK aFd1rSDK) {
        long l2;
        long l3;
        AFi1vSDK aFi1vSDK;
        this.getMediationNetwork = aFd1rSDK;
        this.getRevenue = aFi1vSDK = this.getCurrencyIso4217Code();
        long l4 = 0L;
        this.getCurrencyIso4217Code = l3 = aFd1rSDK.getMediationNetwork("af_rc_timestamp", l4);
        this.getMonetizationNetwork = l2 = aFd1rSDK.getMediationNetwork("af_rc_max_age", l4);
    }

    private AFi1vSDK getCurrencyIso4217Code() {
        Object object;
        Object object2 = this.getMediationNetwork;
        Object object3 = "af_remote_config";
        if ((object2 = object2.getMonetizationNetwork((String)object3, null)) == null) {
            object2 = AFLogger.INSTANCE;
            object3 = AFh1vSDK.component1;
            ((AFh1uSDK)object2).d((AFh1vSDK)((Object)object3), "No configuration found in cache");
            return null;
        }
        int n3 = 2;
        try {
            object2 = Base64.decode((String)object2, (int)n3);
        }
        catch (Exception exception) {
            object3 = AFLogger.INSTANCE;
            object = AFh1vSDK.component1;
            ((AFh1uSDK)object3).e((AFh1vSDK)((Object)object), "Error reading malformed configuration from cache, requires fetching from remote again", exception, true);
            return null;
        }
        object = Charset.defaultCharset();
        object3 = new String((byte[])object2, (Charset)object);
        object2 = new AFi1vSDK((String)object3);
        return object2;
    }
}

