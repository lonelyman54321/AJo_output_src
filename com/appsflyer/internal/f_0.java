/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFi1dSDK;
import com.appsflyer.internal.AFi1jSDK;

/*
 * Renamed from com.appsflyer.internal.f
 */
public final class f_0
implements AFi1dSDK {
    public final /* synthetic */ AFb1rSDK a;
    public final /* synthetic */ AFi1jSDK b;

    public /* synthetic */ f_0(AFb1rSDK aFb1rSDK, AFi1jSDK aFi1jSDK) {
        this.a = aFb1rSDK;
        this.b = aFi1jSDK;
    }

    public final void onRequestFinished() {
        AFb1rSDK aFb1rSDK = this.a;
        AFi1jSDK aFi1jSDK = this.b;
        AFb1rSDK.d(aFb1rSDK, aFi1jSDK);
    }
}

