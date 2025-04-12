/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.util.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Renamed from com.jio.jioads.adinterfaces.i
 */
public final class i_0
implements c {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ String b;

    public i_0(JioAdView jioAdView, String string2) {
        this.a = jioAdView;
        this.b = string2;
    }

    public final void a() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        JioAdView jioAdView = this.a;
        String string2 = this.b;
        vu2_1 vu2_12 = new vu2_1(1, jioAdView, string2);
        executorService.submit(vu2_12);
    }
}

