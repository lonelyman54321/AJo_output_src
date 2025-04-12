/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.PlaybackStateEvent
 */
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;

public final class IM1 {
    public static /* bridge */ /* synthetic */ void a(PlaybackSession playbackSession, PlaybackStateEvent playbackStateEvent) {
        playbackSession.reportPlaybackStateEvent(playbackStateEvent);
    }
}

