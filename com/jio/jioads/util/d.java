/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.util;

import android.os.CountDownTimer;
import com.jio.jioads.util.c;
import com.jio.jioads.util.f;

public final class d
extends CountDownTimer {
    public final /* synthetic */ f a;
    public final /* synthetic */ c b;

    public d(f f5, c c2, long l2) {
        this.a = f5;
        this.b = c2;
        super(l2, 1000L);
    }

    public final void onFinish() {
        f f5 = this.a;
        f5.getClass();
        f5.h = null;
        f5.i = false;
        this.b.a();
    }

    public final void onTick(long l2) {
        this.a.a = l2;
    }
}

