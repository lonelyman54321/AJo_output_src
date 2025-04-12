/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e;
import androidx.media3.exoplayer.mediacodec.e;

public final class Xj0
implements vv1$a,
MediaCodecUtil$e {
    public int a(Object object) {
        int n3;
        boolean bl2;
        object = ((e)object).a;
        String string2 = "OMX.google";
        boolean n4 = ((String)object).startsWith(string2);
        if (!n4 && !(bl2 = ((String)object).startsWith(string2 = "c2.android"))) {
            int n7 = gz3.a;
            int n8 = 26;
            if (n7 < n8 && (n3 = (int)(((String)object).equals(string2 = "OMX.MTK.AUDIO.DECODER.RAW") ? 1 : 0)) != 0) {
                n3 = -1;
            } else {
                n3 = 0;
                object = null;
            }
        } else {
            n3 = 1;
        }
        return n3;
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

