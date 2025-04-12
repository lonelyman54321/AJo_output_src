/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.d;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.mediacodec.e;

public class MediaCodecRenderer$DecoderInitializationException
extends Exception {
    public final String a;
    public final boolean b;
    public final e c;
    public final String d;

    public MediaCodecRenderer$DecoderInitializationException(d object, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean bl2, int n3) {
        StringBuilder stringBuilder = new StringBuilder("Decoder init failed: [");
        stringBuilder.append(n3);
        String string2 = "], ";
        stringBuilder.append(string2);
        stringBuilder.append(object);
        String string3 = stringBuilder.toString();
        String string4 = ((d)object).o;
        object = n3 < 0 ? "neg_" : "";
        stringBuilder = new StringBuilder("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_");
        stringBuilder.append((String)object);
        int n4 = Math.abs(n3);
        stringBuilder.append(n4);
        String string5 = stringBuilder.toString();
        this(string3, mediaCodecUtil$DecoderQueryException, string4, bl2, null, string5);
    }

    public MediaCodecRenderer$DecoderInitializationException(String string2, Throwable throwable, String string3, boolean bl2, e e2, String string4) {
        super(string2, throwable);
        this.a = string3;
        this.b = bl2;
        this.c = e2;
        this.d = string4;
    }
}

