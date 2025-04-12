/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.PlaybackStateEvent
 *  android.media.metrics.PlaybackStateEvent$Builder
 */
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.media.metrics.PlaybackStateEvent;

public final class Xk0 {
    public static /* bridge */ /* synthetic */ PlaybackStateEvent a(PlaybackStateEvent.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ void b(AudioTrack audioTrack, LogSessionId logSessionId) {
        audioTrack.setLogSessionId(logSessionId);
    }
}

