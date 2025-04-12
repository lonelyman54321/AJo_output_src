/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 */
import android.media.AudioTrack;

/*
 * Renamed from cL3
 */
public final class cl3_1 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioTrack.StreamEventCallback streamEventCallback) {
        audioTrack.unregisterStreamEventCallback(streamEventCallback);
    }
}

