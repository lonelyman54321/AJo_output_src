/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdsTracker;
import com.jio.jioads.jioreel.ssai.CreativeResponse;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from com.jio.jioads.adinterfaces.g
 */
public final class g_0
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ String b;
    public final /* synthetic */ JioAdsTracker c;
    public final /* synthetic */ CreativeResponse d;

    public /* synthetic */ g_0(Ref$ObjectRef ref$ObjectRef, String string2, JioAdsTracker jioAdsTracker, CreativeResponse creativeResponse) {
        this.a = ref$ObjectRef;
        this.b = string2;
        this.c = jioAdsTracker;
        this.d = creativeResponse;
    }

    public final void run() {
        JioAdsTracker jioAdsTracker = this.c;
        CreativeResponse creativeResponse = this.d;
        Ref$ObjectRef ref$ObjectRef = this.a;
        String string2 = this.b;
        JioAdsTracker.a(ref$ObjectRef, string2, jioAdsTracker, creativeResponse);
    }
}

