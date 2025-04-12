/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class ReviewManagerKtxKt$runTask$3$1
extends Lambda
implements Function1 {
    final /* synthetic */ Function0 $onCanceled;

    public ReviewManagerKtxKt$runTask$3$1(Function0 function0) {
        this.$onCanceled = function0;
        super(1);
    }

    public final void invoke(Throwable throwable) {
        this.$onCanceled.invoke();
    }
}

