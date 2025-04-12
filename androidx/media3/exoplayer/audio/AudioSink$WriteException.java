/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.audio;

import androidx.media3.common.d;

public final class AudioSink$WriteException
extends Exception {
    public final int a;
    public final boolean b;
    public final d c;

    public AudioSink$WriteException(int n3, d d2, boolean bl2) {
        String string2 = hj0_0.a(n3, "AudioTrack write failed: ");
        super(string2);
        this.b = bl2;
        this.a = n3;
        this.c = d2;
    }
}

