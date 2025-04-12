/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.TrackChangeEvent
 *  android.view.RoundedCorner
 *  android.view.WindowInsets
 */
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/*
 * Renamed from Xz
 */
public final class xz_0 {
    public static /* bridge */ /* synthetic */ RoundedCorner a(WindowInsets windowInsets) {
        return windowInsets.getRoundedCorner(1);
    }

    public static /* bridge */ /* synthetic */ void b(PlaybackSession playbackSession, TrackChangeEvent trackChangeEvent) {
        playbackSession.reportTrackChangeEvent(trackChangeEvent);
    }
}

