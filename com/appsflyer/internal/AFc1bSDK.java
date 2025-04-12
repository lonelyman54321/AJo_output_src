/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import com.appsflyer.internal.AFj1iSDK;

public final class AFc1bSDK {
    public static Uri s_(Intent object) {
        if (object == null) {
            return null;
        }
        AFj1iSDK aFj1iSDK = new AFj1iSDK((Intent)object);
        if ((object = (Uri)aFj1iSDK.J_("android.intent.extra.REFERRER")) != null) {
            return object;
        }
        object = aFj1iSDK.AFAdRevenueData("android.intent.extra.REFERRER_NAME");
        if (object != null) {
            return Uri.parse((String)object);
        }
        return null;
    }
}

