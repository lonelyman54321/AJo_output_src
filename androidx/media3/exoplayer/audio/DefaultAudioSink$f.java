/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.c;
import java.nio.ShortBuffer;

public final class DefaultAudioSink$f
implements Er {
    public final AudioProcessor[] a;
    public final D43 b;
    public final c c;

    public DefaultAudioSink$f(AudioProcessor ... audioProcessorArray) {
        ShortBuffer shortBuffer;
        float f5;
        c c2;
        D43 d43 = new D43();
        c2.c = f5 = 1.0f;
        c2.d = f5;
        AudioProcessor[] audioProcessorArray2 = AudioProcessor$a.e;
        c2.e = audioProcessorArray2;
        c2.f = audioProcessorArray2;
        c2.g = audioProcessorArray2;
        c2.h = audioProcessorArray2;
        audioProcessorArray2 = AudioProcessor.a;
        c2.k = audioProcessorArray2;
        c2.l = shortBuffer = audioProcessorArray2.asShortBuffer();
        c2.m = audioProcessorArray2;
        c2.b = -1;
        audioProcessorArray2 = new AudioProcessor[audioProcessorArray.length + 2];
        this.a = audioProcessorArray2;
        int n3 = audioProcessorArray.length;
        System.arraycopy(audioProcessorArray, 0, audioProcessorArray2, 0, n3);
        this.b = d43;
        this.c = c2;
        int n4 = audioProcessorArray.length;
        audioProcessorArray2[n4] = d43;
        int n7 = audioProcessorArray.length + 1;
        audioProcessorArray2[n7] = c2;
    }
}

