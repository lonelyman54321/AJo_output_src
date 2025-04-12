/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.bonanza.activity;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class CouponBonanzaActivity$a
extends Lambda
implements Function0 {
    public final /* synthetic */ ComponentActivity c;

    public CouponBonanzaActivity$a(ComponentActivity componentActivity) {
        this.c = componentActivity;
        super(0);
    }

    public final Object invoke() {
        return this.c.getDefaultViewModelProviderFactory();
    }
}

