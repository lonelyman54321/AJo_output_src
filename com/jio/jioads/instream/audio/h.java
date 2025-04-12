/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.instream.audio;

import android.os.CountDownTimer;
import com.jio.jioads.instream.audio.g;
import com.jio.jioads.instream.audio.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h
extends Lambda
implements Function0 {
    public final /* synthetic */ j c;
    public final /* synthetic */ int d;

    public h(j j3, int n3) {
        this.c = j3;
        this.d = n3;
        super(0);
    }

    public final Object invoke() {
        CountDownTimer countDownTimer;
        long l2 = (long)this.d * 1000L;
        j j3 = this.c;
        g g3 = new g(j3, l2);
        j3.o = countDownTimer = g3.start();
        return Unit.a;
    }
}

