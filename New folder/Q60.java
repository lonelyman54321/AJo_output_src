/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.view.ContentInfo
 */
import android.media.metrics.TrackChangeEvent;
import android.view.ContentInfo;

public final class Q60 {
    public static /* bridge */ /* synthetic */ int a(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder b(TrackChangeEvent.Builder builder, long l2) {
        return builder.setTimeSinceCreatedMillis(l2);
    }
}

