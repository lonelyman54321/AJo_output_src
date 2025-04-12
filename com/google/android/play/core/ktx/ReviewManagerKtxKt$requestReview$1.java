/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.play.core.ktx.ReviewManagerKtxKt;

final class ReviewManagerKtxKt$requestReview$1
extends h80_0 {
    int label;
    /* synthetic */ Object result;

    public ReviewManagerKtxKt$requestReview$1(f80_0 f80_02) {
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return ReviewManagerKtxKt.requestReview(null, this);
    }
}

