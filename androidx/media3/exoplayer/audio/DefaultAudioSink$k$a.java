/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 */
package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink$k;
import androidx.media3.exoplayer.audio.g$a;

public final class DefaultAudioSink$k$a
extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ DefaultAudioSink$k a;

    public DefaultAudioSink$k$a(DefaultAudioSink$k k2) {
        this.a = k2;
    }

    public final void onDataRequest(AudioTrack object, int n3) {
        Object object2 = this.a.c.w;
        boolean bl2 = object.equals(object2);
        if (!bl2) {
            return;
        }
        object = this.a.c;
        object2 = ((DefaultAudioSink)object).s;
        if (object2 != null && (bl2 = ((DefaultAudioSink)object).W)) {
            object2 = (g$a)object2;
            object = object2.a.G;
            if (object != null) {
                object.b();
            }
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2 = this.a.c.w;
        boolean bl2 = audioTrack.equals(audioTrack2);
        if (!bl2) {
            return;
        }
        this.a.c.V = true;
    }

    public final void onTearDown(AudioTrack object) {
        Object object2 = this.a.c.w;
        boolean bl2 = object.equals(object2);
        if (!bl2) {
            return;
        }
        object = this.a.c;
        object2 = ((DefaultAudioSink)object).s;
        if (object2 != null && (bl2 = ((DefaultAudioSink)object).W)) {
            object2 = (g$a)object2;
            object = object2.a.G;
            if (object != null) {
                object.b();
            }
        }
    }
}

