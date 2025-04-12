/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.appsflyer.lvl.AppsFlyerLVL
 *  com.appsflyer.lvl.AppsFlyerLVL$resultListener
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFg1uSDK$4;
import com.appsflyer.internal.AFg1uSDK$AFa1vSDK;
import com.appsflyer.lvl.AppsFlyerLVL;

public final class AFg1uSDK {
    public final boolean getMediationNetwork(long l2, Context context, AFg1uSDK$AFa1vSDK aFg1uSDK$AFa1vSDK) {
        AFg1uSDK$4 aFg1uSDK$4;
        try {
            aFg1uSDK$4 = new AFg1uSDK$4(this, aFg1uSDK$AFa1vSDK);
        }
        catch (Throwable throwable) {
            return false;
        }
        AppsFlyerLVL.checkLicense((long)l2, (Context)context, (AppsFlyerLVL.resultListener)aFg1uSDK$4);
        return true;
    }
}

