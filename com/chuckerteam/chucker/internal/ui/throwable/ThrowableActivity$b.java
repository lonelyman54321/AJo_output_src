/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.ui.throwable;

import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ThrowableActivity$b
extends Lambda
implements Function0 {
    public final /* synthetic */ ThrowableActivity c;

    public ThrowableActivity$b(ThrowableActivity throwableActivity) {
        this.c = throwableActivity;
        super(0);
    }

    public final Object invoke() {
        long l2 = this.c.getIntent().getLongExtra("transaction_id", 0L);
        pn3_0 pn3_02 = new pn3_0(l2);
        return pn3_02;
    }
}

