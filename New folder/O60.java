/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.view.ContentInfo
 */
import android.media.metrics.PlaybackMetrics;
import android.view.ContentInfo;

public final class O60 {
    public static /* bridge */ /* synthetic */ int a(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static /* bridge */ /* synthetic */ void b(PlaybackMetrics.Builder builder, long l2) {
        builder.setNetworkBytesRead(l2);
    }
}

