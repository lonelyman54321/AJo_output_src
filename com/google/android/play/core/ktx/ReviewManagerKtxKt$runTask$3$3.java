/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;

final class ReviewManagerKtxKt$runTask$3$3
implements OnFailureListener {
    final /* synthetic */ bl_2 $continuation;

    public ReviewManagerKtxKt$runTask$3$3(bl_2 bl_22) {
        this.$continuation = bl_22;
    }

    public final void onFailure(Exception serializable) {
        Intrinsics.checkNotNullParameter(serializable, "exception");
        bl_2 bl_22 = this.$continuation;
        serializable = vl2_2.a(serializable);
        bl_22.resumeWith(serializable);
    }
}

