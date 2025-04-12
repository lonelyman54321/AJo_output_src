/*
 * Decompiled with CFR 0.152.
 */
package com.skydoves.balloon;

import com.skydoves.balloon.AutoDismissRunnable;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Balloon$c
extends Lambda
implements Function0 {
    public final /* synthetic */ Balloon c;

    public Balloon$c(Balloon balloon2) {
        this.c = balloon2;
        super(0);
    }

    public final Object invoke() {
        Balloon balloon2 = this.c;
        AutoDismissRunnable autoDismissRunnable = new AutoDismissRunnable(balloon2);
        return autoDismissRunnable;
    }
}

