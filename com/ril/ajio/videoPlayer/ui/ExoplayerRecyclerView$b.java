/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
package com.ril.ajio.videoPlayer.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$p;
import com.ril.ajio.videoPlayer.ui.ExoplayerRecyclerView;
import kotlin.jvm.internal.Intrinsics;

public final class ExoplayerRecyclerView$b
implements RecyclerView$p {
    public final /* synthetic */ ExoplayerRecyclerView a;

    public ExoplayerRecyclerView$b(ExoplayerRecyclerView exoplayerRecyclerView) {
        this.a = exoplayerRecyclerView;
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.getClass();
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ExoplayerRecyclerView exoplayerRecyclerView = this.a;
        if0_2 if0_22 = new if0_2(exoplayerRecyclerView);
        view.setOnLongClickListener((View.OnLongClickListener)if0_22);
    }
}

