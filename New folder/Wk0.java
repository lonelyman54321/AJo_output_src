/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.PlaybackStateEvent$Builder
 */
import android.media.metrics.LogSessionId;
import android.media.metrics.PlaybackStateEvent;

public final class Wk0 {
    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder a(PlaybackStateEvent.Builder builder, long l2) {
        return builder.setTimeSinceCreatedMillis(l2);
    }

    public static /* bridge */ /* synthetic */ boolean b(LogSessionId logSessionId, Object object) {
        return logSessionId.equals(object);
    }
}

