/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 */
package in.juspay.hypersdk.core;

import android.media.MediaPlayer;
import in.juspay.hypersdk.core.InflateView$2;

public final class B
implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ MediaPlayer a;

    public /* synthetic */ B(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        InflateView$2.a(this.a, mediaPlayer);
    }
}

