/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.view.Surface
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.d;
import androidx.media3.exoplayer.mediacodec.e;

public final class d$a {
    public final e a;
    public final MediaFormat b;
    public final d c;
    public final Surface d;
    public final MediaCrypto e;
    public final RC1 f;

    public d$a(e e2, MediaFormat mediaFormat, d d2, Surface surface, MediaCrypto mediaCrypto, RC1 rC1) {
        this.a = e2;
        this.b = mediaFormat;
        this.c = d2;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = rC1;
    }
}

