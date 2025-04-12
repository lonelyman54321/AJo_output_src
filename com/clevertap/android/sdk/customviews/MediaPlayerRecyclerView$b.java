/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.clevertap.android.sdk.customviews;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$p;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import kotlin.jvm.internal.Intrinsics;

public final class MediaPlayerRecyclerView$b
implements RecyclerView$p {
    public final /* synthetic */ MediaPlayerRecyclerView a;

    public MediaPlayerRecyclerView$b(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        this.a = mediaPlayerRecyclerView;
    }

    public final void b(View view) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.a;
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = mediaPlayerRecyclerView.e;
        if (cTInboxBaseMessageViewHolder != null && (bl2 = Intrinsics.areEqual(cTInboxBaseMessageViewHolder = cTInboxBaseMessageViewHolder.itemView, view))) {
            mediaPlayerRecyclerView.a.pause();
            bl2 = false;
            view = null;
            mediaPlayerRecyclerView.e = null;
        }
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}

