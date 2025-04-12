/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  android.media.AudioTrack
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.media3.exoplayer.audio;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.a;

public final class DefaultAudioSink$h {
    public final AudioTrack a;
    public final a b;
    public bl0 c;

    public DefaultAudioSink$h(AudioTrack audioTrack, a object) {
        this.a = audioTrack;
        this.b = object;
        this.c = object = new bl0(this);
        Object object2 = Looper.myLooper();
        object = new Handler(object2);
        object2 = this.c;
        Yk0.a(audioTrack, (AudioRouting.OnRoutingChangedListener)object2, (Handler)object);
    }
}

