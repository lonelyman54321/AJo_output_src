/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.multiad;

import android.content.Context;
import com.jio.jioads.util.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class M
implements c {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;

    public M(Context context, String string2) {
        this.a = string2;
        this.b = context;
    }

    public final void a() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        String string2 = this.a;
        Context context = this.b;
        vy1 vy12 = new vy1(string2, context, 1);
        executorService.submit(vy12);
    }
}

