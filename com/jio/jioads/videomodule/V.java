/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.videomodule;

import android.os.CountDownTimer;
import com.jio.jioads.videomodule.U;
import com.jio.jioads.videomodule.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class V
extends Lambda
implements Function0 {
    public final /* synthetic */ s c;
    public final /* synthetic */ int d;

    public V(s s7, int n3) {
        this.c = s7;
        this.d = n3;
        super(0);
    }

    public final Object invoke() {
        s s7 = this.c;
        CountDownTimer countDownTimer = s7.Q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        s7.Q = null;
        int n3 = this.d;
        long l2 = (long)n3 * 1000L;
        U u3 = new U(s7, n3, l2);
        s7.Q = countDownTimer = u3.start();
        return Unit.a;
    }
}

