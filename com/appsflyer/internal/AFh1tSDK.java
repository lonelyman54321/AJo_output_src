/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AFh1tSDK
extends AFh1uSDK {
    private final AFd1kSDK getRevenue;

    public AFh1tSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getRevenue = aFd1kSDK;
    }

    public final void e(AFh1vSDK object, String object2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(throwable, string2);
        if (bl4) {
            bl2 = b.k((CharSequence)object2);
            if (bl2) {
                object2 = "missing label";
            }
            object = this.withTag$SDK_prodRelease((String)object2, (AFh1vSDK)((Object)object));
            object2 = this.getRevenue.afErrorLog();
            object2.getRevenue(throwable, (String)object);
        }
    }
}

