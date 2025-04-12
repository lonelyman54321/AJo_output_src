/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.ui.throwable;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ThrowableActivity$a
extends Lambda
implements Function0 {
    public final /* synthetic */ ComponentActivity c;

    public ThrowableActivity$a(ComponentActivity componentActivity) {
        this.c = componentActivity;
        super(0);
    }

    public final Object invoke() {
        rd3_0 rd3_02 = this.c.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(rd3_02, "viewModelStore");
        return rd3_02;
    }
}

