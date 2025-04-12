/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 */
import android.media.MediaCodec;
import android.os.Bundle;

/*
 * Renamed from mh3
 */
public final class mh3_1
implements FL1 {
    public final MediaCodec a;

    public mh3_1(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    public final void a(int n3, Fe0 fe0, long l2, int n4) {
        MediaCodec.CryptoInfo cryptoInfo = fe0.i;
        this.a.queueSecureInputBuffer(n3, 0, cryptoInfo, l2, n4);
    }

    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    public final void c(int n3, int n4, int n7, long l2) {
        this.a.queueInputBuffer(n3, 0, n4, l2, n7);
    }

    public final void d() {
    }

    public final void flush() {
    }

    public final void shutdown() {
    }

    public final void start() {
    }
}

