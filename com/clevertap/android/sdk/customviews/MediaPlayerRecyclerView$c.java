/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.customviews;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import kotlin.jvm.internal.Intrinsics;

public final class MediaPlayerRecyclerView$c
extends RecyclerView$s {
    public final /* synthetic */ MediaPlayerRecyclerView a;

    public MediaPlayerRecyclerView$c(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        this.a = mediaPlayerRecyclerView;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(recyclerView, string2);
        super.onScrollStateChanged(recyclerView, n3);
        if (n3 == 0) {
            recyclerView = this.a;
            ((MediaPlayerRecyclerView)recyclerView).b();
        }
    }
}

