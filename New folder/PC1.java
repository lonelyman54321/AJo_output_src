/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.LoudnessCodecController
 *  android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener
 */
import android.media.LoudnessCodecController;
import java.util.concurrent.Executor;

public final class PC1 {
    public static /* bridge */ /* synthetic */ LoudnessCodecController a(int n3, Executor executor, QC1 qC1) {
        return LoudnessCodecController.create((int)n3, (Executor)executor, (LoudnessCodecController.OnLoudnessCodecUpdateListener)qC1);
    }
}

