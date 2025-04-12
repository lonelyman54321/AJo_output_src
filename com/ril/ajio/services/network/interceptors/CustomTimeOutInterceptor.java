/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.network.interceptors;

import android.content.Context;
import com.ril.ajio.services.network.NetworkUtil;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class CustomTimeOutInterceptor
implements nj1_2 {
    private final Context context;

    public CustomTimeOutInterceptor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public cl2_2 intercept(nj1$a nj1$a) {
        String string2;
        int n3;
        Intrinsics.checkNotNullParameter(nj1$a, "chain");
        kj2_2 kj2_22 = nj1$a.request();
        Object object = kj2_22.b("RequestId");
        int n4 = 1;
        if (object != null && (n3 = (int)(((String)object).equals(string2 = "BackGround_RTB_Request") ? 1 : 0)) == n4) {
            object = z40_0.Companion;
            Object object2 = this.context;
            object.getClass();
            object = z40$a.a((Context)object2).a;
            int n7 = ((ao0_0)object).g("rtb_house_timeout");
            object2 = TimeUnit.SECONDS;
            nj1$a = nj1$a.b(n7, (TimeUnit)((Object)object2)).e(n7, (TimeUnit)((Object)object2)).d(n7, (TimeUnit)((Object)object2));
        } else {
            int n8;
            String string3;
            int n10;
            n3 = 1000;
            if (object != null && (n10 = ((String)object).equals(string3 = "User_Type")) == n4 || object != null && (n10 = ((String)object).equals(string3 = "User_Type_v3")) == n4) {
                object = z40_0.Companion;
                Object object3 = this.context;
                object.getClass();
                object = z40$a.a((Context)object3).a;
                double d2 = ((ao0_0)object).f("user_type_timeout");
                double d5 = n3;
                int n14 = (int)(d2 *= d5);
                object3 = TimeUnit.MILLISECONDS;
                nj1$a = nj1$a.b(n14, (TimeUnit)((Object)object3)).e(n14, (TimeUnit)((Object)object3)).d(n14, (TimeUnit)((Object)object3));
            } else if (object != null && (n10 = (int)(((String)object).equals(string3 = "newDynamicWidgetCallHome") ? 1 : 0)) == n4) {
                object = z40_0.Companion;
                Object object4 = this.context;
                object.getClass();
                object = z40$a.a((Context)object4).a;
                double d7 = ((ao0_0)object).f("timeoutForDynamicWidget");
                double d9 = n3;
                int n15 = (int)(d7 *= d9);
                object4 = TimeUnit.MILLISECONDS;
                nj1$a = nj1$a.b(n15, (TimeUnit)((Object)object4)).e(n15, (TimeUnit)((Object)object4)).d(n15, (TimeUnit)((Object)object4));
            } else if (object != null && (n10 = (int)(((String)object).equals(string3 = "jioBannerAdsHome") ? 1 : 0)) == n4) {
                object = NetworkUtil.INSTANCE;
                Object object5 = this.context;
                double d12 = ((NetworkUtil)object).getJioBannerAdsHomePageApiTimeoutInterval((Context)object5);
                double d13 = n3;
                int n16 = (int)(d12 *= d13);
                object5 = TimeUnit.MILLISECONDS;
                nj1$a = nj1$a.b(n16, (TimeUnit)((Object)object5)).e(n16, (TimeUnit)((Object)object5)).d(n16, (TimeUnit)((Object)object5));
            } else if (object != null && (n10 = (int)(((String)object).equals(string3 = "jioBannerAdsMisc") ? 1 : 0)) == n4) {
                object = NetworkUtil.INSTANCE;
                Object object6 = this.context;
                double d14 = ((NetworkUtil)object).getJioBannerAdsMiscPageApiTimeoutInterval((Context)object6);
                double d15 = n3;
                int n17 = (int)(d14 *= d15);
                object6 = TimeUnit.MILLISECONDS;
                nj1$a = nj1$a.b(n17, (TimeUnit)((Object)object6)).e(n17, (TimeUnit)((Object)object6)).d(n17, (TimeUnit)((Object)object6));
            } else if (object != null && (n8 = ((String)object).equals(string3 = "externalBannerAdsHome")) == n4) {
                object = NetworkUtil.INSTANCE;
                Object object7 = this.context;
                double d16 = ((NetworkUtil)object).getExternalBannerAdsHomePageApiTimeoutInterval((Context)object7);
                double d17 = n3;
                n8 = (int)(d16 *= d17);
                object7 = TimeUnit.MILLISECONDS;
                nj1$a = nj1$a.b(n8, (TimeUnit)((Object)object7)).e(n8, (TimeUnit)((Object)object7)).d(n8, (TimeUnit)((Object)object7));
            }
        }
        return nj1$a.a(kj2_22);
    }
}

