/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.customviews;

import android.content.Context;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class MediaPlayerRecyclerView$e
extends Lambda
implements gx0_2 {
    public final /* synthetic */ MediaPlayerRecyclerView c;

    public MediaPlayerRecyclerView$e(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        this.c = mediaPlayerRecyclerView;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (String)object;
        boolean bl2 = (Boolean)object2;
        boolean bl3 = (Boolean)object3;
        Intrinsics.checkNotNullParameter(object, "uri");
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.c;
        yg1_1 yg1_12 = mediaPlayerRecyclerView.a;
        mediaPlayerRecyclerView = mediaPlayerRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(mediaPlayerRecyclerView, "context");
        yg1_12.f((Context)mediaPlayerRecyclerView, (String)object, bl2, bl3);
        return null;
    }
}

