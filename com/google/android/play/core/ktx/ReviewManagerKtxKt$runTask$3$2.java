/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class ReviewManagerKtxKt$runTask$3$2
extends Lambda
implements Function1 {
    final /* synthetic */ bl_2 $continuation;

    public ReviewManagerKtxKt$runTask$3$2(bl_2 bl_22) {
        this.$continuation = bl_22;
        super(1);
    }

    public final void invoke(Object object) {
        bl_2 bl_22 = this.$continuation;
        bl_22.resumeWith(object);
    }
}

