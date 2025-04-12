/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 */
import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzrv;
import java.util.concurrent.Executor;

/*
 * Renamed from dL3
 */
public final class dl3_1 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, zzrv zzrv2, AudioTrack.StreamEventCallback streamEventCallback) {
        audioTrack.registerStreamEventCallback((Executor)zzrv2, streamEventCallback);
    }
}

