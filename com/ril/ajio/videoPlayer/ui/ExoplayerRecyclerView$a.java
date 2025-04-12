/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.videoPlayer.ui;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.videoPlayer.ui.ExoplayerRecyclerView;
import kotlin.jvm.internal.Intrinsics;

public final class ExoplayerRecyclerView$a
extends RecyclerView$s {
    public final /* synthetic */ ExoplayerRecyclerView a;

    public ExoplayerRecyclerView$a(ExoplayerRecyclerView exoplayerRecyclerView) {
        this.a = exoplayerRecyclerView;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(recyclerView, string2);
        super.onScrollStateChanged(recyclerView, n3);
        if (n3 == 0) {
            recyclerView = this.a;
            recyclerView.getClass();
        }
    }
}

