/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.LoudnessCodecController
 *  android.media.MediaCodec
 */
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;

public final class RC1 {
    public final HashSet a;
    public final RC1$a b;
    public LoudnessCodecController c;

    public RC1() {
        HashSet hashSet;
        vn0_0 vn0_02 = RC1$a.g0;
        this.a = hashSet = new HashSet();
        this.b = vn0_02;
    }

    public final void a(MediaCodec mediaCodec) {
        HashSet hashSet = this.a;
        boolean bl2 = hashSet.remove(mediaCodec);
        if (bl2 && (hashSet = this.c) != null) {
            NC1.a((LoudnessCodecController)hashSet, mediaCodec);
        }
    }
}

