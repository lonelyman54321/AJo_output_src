/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;

/*
 * Renamed from com.jio.jioads.adinterfaces.e
 */
public final class e_0
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ JioAds b;

    public /* synthetic */ e_0(Context context, JioAds jioAds) {
        this.a = context;
        this.b = jioAds;
    }

    public final void run() {
        Context context = this.a;
        JioAds jioAds = this.b;
        JioAds.a(context, jioAds);
    }
}

