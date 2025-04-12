/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e;
import java.util.Comparator;

public final class UL1
implements Comparator {
    public final /* synthetic */ MediaCodecUtil$e a;

    public /* synthetic */ UL1(MediaCodecUtil$e e2) {
        this.a = e2;
    }

    public final int compare(Object object, Object object2) {
        MediaCodecUtil$e mediaCodecUtil$e = this.a;
        int n3 = mediaCodecUtil$e.a(object2);
        int n4 = mediaCodecUtil$e.a(object);
        return n3 - n4;
    }
}

