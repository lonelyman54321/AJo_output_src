/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.a;
import androidx.media3.common.d;
import androidx.media3.exoplayer.audio.AudioSink$a;

public final class DefaultAudioSink$e {
    public final d a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final a i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public DefaultAudioSink$e(d d2, int n3, int n4, int n7, int n8, int n10, int n14, int n15, a a2, boolean bl2, boolean bl3, boolean bl4) {
        this.a = d2;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = n8;
        this.f = n10;
        this.g = n14;
        this.h = n15;
        this.i = a2;
        this.j = bl2;
        this.k = bl3;
        this.l = bl4;
    }

    public final AudioSink$a a() {
        boolean bl2;
        int n3 = this.c;
        int n4 = 1;
        if (n3 == n4) {
            bl2 = true;
        } else {
            n3 = 0;
            bl2 = false;
        }
        int n7 = this.h;
        n4 = this.g;
        int n8 = this.e;
        int n10 = this.f;
        boolean bl3 = this.l;
        AudioSink$a audioSink$a = new AudioSink$a(n4, n8, n10, bl3, bl2, n7);
        return audioSink$a;
    }
}

