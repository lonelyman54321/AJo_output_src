/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.ril.ajio.videoPlayer.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.e;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.videoPlayer.ui.ExoplayerRecyclerView$a;
import com.ril.ajio.videoPlayer.ui.ExoplayerRecyclerView$b;
import com.ril.ajio.videoPlayer.ui.ExoplayerRecyclerView$c;
import kotlin.jvm.internal.Intrinsics;

public final class ExoplayerRecyclerView
extends RecyclerView {
    public static final /* synthetic */ int c;
    public PlayerView a;
    public e b;

    public ExoplayerRecyclerView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.a(context);
    }

    public ExoplayerRecyclerView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.a(context);
    }

    public final void a(Context object) {
        int n3;
        Object object2 = new PlayerView((Context)object);
        this.a = object2;
        ((PlayerView)((Object)object2)).getVideoSurfaceView();
        object2 = this.a;
        Object object3 = null;
        String string2 = "videoSurfaceView";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        int n4 = 4;
        ((PlayerView)((Object)object2)).setResizeMode(n4);
        object2 = new ExoPlayer$c((Context)object);
        object = ((ExoPlayer$c)object2).a();
        this.b = object;
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        n3 = 0;
        object2 = null;
        ((PlayerView)((Object)object)).setUseController(false);
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object;
        }
        object = this.b;
        ((PlayerView)((Object)object3)).setPlayer((f)object);
        object = this.b;
        if (object != null) {
            n3 = 0;
            object2 = null;
            ((e)object).setVolume(0.0f);
        }
        if ((object = this.b) != null) {
            n3 = 1;
            ((e)object).setRepeatMode(n3);
        }
        object = new ExoplayerRecyclerView$a(this);
        this.addOnScrollListener((RecyclerView$s)object);
        object = new ExoplayerRecyclerView$b(this);
        this.addOnChildAttachStateChangeListener((RecyclerView$p)object);
        object = this.b;
        if (object != null) {
            object2 = new ExoplayerRecyclerView$c(this);
            object = ((e)object).l;
            ((vv1_0)object).a(object2);
        }
    }
}

