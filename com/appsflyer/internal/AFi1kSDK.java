/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFi1mSDK;
import com.appsflyer.internal.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AFi1kSDK
implements AFi1mSDK {
    private String getMediationNetwork;

    private static String getRevenue(Activity object) {
        boolean bl2;
        object = object != null ? object.getIntent() : null;
        object = AFc1bSDK.s_((Intent)object);
        if ((object = object != null ? object.toString() : null) == null) {
            object = "";
        }
        if (bl2 = AFi1kSDK.getRevenue((String)object)) {
            return null;
        }
        return object;
    }

    private static boolean getRevenue(String string2) {
        return b.s(string2, "android-app://", false);
    }

    public final void AFAdRevenueData(Activity object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "");
        String string2 = this.getMediationNetwork;
        if (string2 == null || (n3 = string2.length()) == 0) {
            object = AFi1kSDK.getRevenue(object);
            this.getMediationNetwork = object;
        }
    }

    public final String getCurrencyIso4217Code(Activity object) {
        int n3;
        int n4;
        Intent intent;
        String string2 = null;
        object = object != null && (intent = object.getIntent()) != null ? ((n4 = Build.VERSION.SDK_INT) >= (n3 = 22) ? w.a(object) : AFc1bSDK.s_(object.getIntent())) : null;
        if (object != null) {
            string2 = object.toString();
        }
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public final String getMediationNetwork(Activity activity) {
        String string2 = this.getMediationNetwork;
        int n3 = 0;
        this.getMediationNetwork = null;
        if (string2 != null && (n3 = string2.length()) != 0) {
            return string2;
        }
        return AFi1kSDK.getRevenue(activity);
    }
}

