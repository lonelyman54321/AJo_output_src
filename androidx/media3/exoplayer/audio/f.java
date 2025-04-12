/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.AudioFormat
 *  android.media.AudioTrack
 *  android.media.AudioTrack$Builder
 */
package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.DefaultAudioSink$c;

public final class f
implements DefaultAudioSink$c {
    public static AudioAttributes b(dr_1 dr_12, boolean bl2) {
        if (bl2) {
            dr_12 = new AudioAttributes.Builder();
            return dr_12.setContentType(3).setFlags(16).setUsage(1).build();
        }
        return dr_12.a().a;
    }

    public final AudioTrack a(AudioSink$a audioSink$a, dr_1 dr_12, int n3) {
        int n4 = gz3.a;
        int n7 = 23;
        boolean bl2 = audioSink$a.d;
        int n8 = audioSink$a.a;
        int n10 = audioSink$a.c;
        int n14 = audioSink$a.b;
        if (n4 >= n7) {
            AudioFormat audioFormat = gz3.n(n14, n10, n8);
            dr_12 = f.b(dr_12, bl2);
            AudioTrack.Builder builder = el0_1.a();
            dr_12 = hl0_0.a(gl0.a(fl0.a(builder, (AudioAttributes)dr_12), audioFormat));
            n7 = audioSink$a.f;
            dr_12 = jl0.a(il0.a((AudioTrack.Builder)dr_12, n7), n3);
            n3 = 29;
            if (n4 >= n3) {
                boolean bl3 = audioSink$a.e;
                ll0.a((AudioTrack.Builder)dr_12, bl3);
            }
            return kl0.a((AudioTrack.Builder)dr_12);
        }
        AudioAttributes audioAttributes = f.b(dr_12, bl2);
        AudioFormat audioFormat = gz3.n(n14, n10, n8);
        n8 = audioSink$a.f;
        n14 = n3;
        AudioTrack audioTrack = new AudioTrack(audioAttributes, audioFormat, n8, 1, n3);
        return audioTrack;
    }
}

