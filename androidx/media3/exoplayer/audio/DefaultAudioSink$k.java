/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.media3.exoplayer.audio;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink$k$a;

public final class DefaultAudioSink$k {
    public final Handler a;
    public final DefaultAudioSink$k$a b;
    public final /* synthetic */ DefaultAudioSink c;

    public DefaultAudioSink$k(DefaultAudioSink object) {
        this.c = object;
        Looper looper = Looper.myLooper();
        super(looper);
        this.a = object;
        super(this);
        this.b = object;
    }
}

