/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.skydoves.balloon;

import android.os.Handler;
import com.skydoves.balloon.AutoDismissRunnable;
import com.skydoves.balloon.Balloon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Balloon$e
extends Lambda
implements Function0 {
    public final /* synthetic */ Balloon c;

    public Balloon$e(Balloon balloon2) {
        this.c = balloon2;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        ((Balloon)object).f = false;
        ((Balloon)object).d.dismiss();
        ((Balloon)object).e.dismiss();
        Handler handler = (Handler)((Balloon)object).h.getValue();
        object = (AutoDismissRunnable)((Balloon)object).i.getValue();
        handler.removeCallbacks((Runnable)object);
        return Unit.a;
    }
}

