/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.util;

import android.os.CountDownTimer;
import com.jio.jioads.util.c;
import com.jio.jioads.util.d;
import com.jio.jioads.util.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e
extends Lambda
implements Function0 {
    public final /* synthetic */ f c;
    public final /* synthetic */ c d;

    public e(f f5, c c2) {
        this.c = f5;
        this.d = c2;
        super(0);
    }

    public final Object invoke() {
        CountDownTimer countDownTimer;
        f f5 = this.c;
        long l2 = f5.g;
        c c2 = this.d;
        d d2 = new d(f5, c2, l2);
        f5.h = countDownTimer = d2.start();
        return Unit.a;
    }
}

