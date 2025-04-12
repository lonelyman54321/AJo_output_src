/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 */
import android.media.MediaCodec;

public final class Fe0 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final Fe0$a j;

    public Fe0() {
        Fe0$a fe0$a;
        MediaCodec.CryptoInfo cryptoInfo;
        this.i = cryptoInfo = new MediaCodec.CryptoInfo();
        int n3 = gz3.a;
        int n4 = 24;
        if (n3 >= n4) {
            fe0$a = new Fe0$a(cryptoInfo);
        } else {
            n3 = 0;
            fe0$a = null;
        }
        this.j = fe0$a;
    }
}

