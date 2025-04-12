/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackErrorEvent
 *  android.media.metrics.PlaybackSession
 *  android.view.ContentInfo$Builder
 */
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackSession;
import android.view.ContentInfo;

public final class I60 {
    public static /* bridge */ /* synthetic */ void a(PlaybackSession playbackSession, PlaybackErrorEvent playbackErrorEvent) {
        playbackSession.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public static /* bridge */ /* synthetic */ void b(ContentInfo.Builder builder, int n3) {
        builder.setFlags(n3);
    }
}

