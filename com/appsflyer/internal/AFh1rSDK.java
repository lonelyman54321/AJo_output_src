/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFh1rSDK
extends AFh1uSDK {
    private final boolean getCurrencyIso4217Code;
    private final AFd1kSDK getMonetizationNetwork;

    public AFh1rSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getMonetizationNetwork = aFd1kSDK;
        this.getCurrencyIso4217Code = true;
    }

    public final void d(AFh1vSDK object, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        if (bl2) {
            AFb1cSDK aFb1cSDK = this.getMonetizationNetwork.copydefault();
            object = this.getRevenue(string2, (AFh1vSDK)((Object)object));
            string2 = "D";
            aFb1cSDK.getCurrencyIso4217Code(string2, (String)object);
        }
    }

    public final void e(AFh1vSDK object, String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        Intrinsics.checkNotNullParameter(throwable, (String)object2);
        if (bl5) {
            object2 = this.getMonetizationNetwork.copydefault();
            object = this.getRevenue(string2, (AFh1vSDK)((Object)object));
            string2 = "E";
            object2.getCurrencyIso4217Code(string2, (String)object);
        }
        if (bl5) {
            object = this.getMonetizationNetwork.copydefault();
            object.getRevenue(throwable);
        }
    }

    public final void force(AFh1vSDK object, String string2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = this.getMonetizationNetwork.copydefault();
        object = this.getRevenue(string2, (AFh1vSDK)((Object)object));
        object2.getCurrencyIso4217Code("F", (String)object);
    }

    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    public final void i(AFh1vSDK object, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        if (bl2) {
            AFb1cSDK aFb1cSDK = this.getMonetizationNetwork.copydefault();
            object = this.getRevenue(string2, (AFh1vSDK)((Object)object));
            string2 = "I";
            aFb1cSDK.getCurrencyIso4217Code(string2, (String)object);
        }
    }

    public final void v(AFh1vSDK object, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        if (bl2) {
            AFb1cSDK aFb1cSDK = this.getMonetizationNetwork.copydefault();
            object = this.getRevenue(string2, (AFh1vSDK)((Object)object));
            string2 = "V";
            aFb1cSDK.getCurrencyIso4217Code(string2, (String)object);
        }
    }

    public final void w(AFh1vSDK object, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        if (bl2) {
            AFb1cSDK aFb1cSDK = this.getMonetizationNetwork.copydefault();
            object = this.getRevenue(string2, (AFh1vSDK)((Object)object));
            string2 = "W";
            aFb1cSDK.getCurrencyIso4217Code(string2, (String)object);
        }
    }
}

