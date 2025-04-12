/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener
 *  android.media.MediaCodec
 *  android.os.Bundle
 */
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;

public final class QC1
implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    public final /* synthetic */ RC1 a;

    public QC1(RC1 rC1) {
        this.a = rC1;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((vn0_0)this.a.b).getClass();
        return bundle;
    }
}

