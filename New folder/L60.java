/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.view.ContentInfo$Builder
 */
import android.content.ClipData;
import android.media.metrics.PlaybackMetrics;
import android.view.ContentInfo;

public final class L60 {
    public static /* synthetic */ ContentInfo.Builder a(ClipData clipData, int n3) {
        ContentInfo.Builder builder = new ContentInfo.Builder(clipData, n3);
        return builder;
    }

    public static /* bridge */ /* synthetic */ void b(PlaybackMetrics.Builder builder, int n3) {
        builder.setVideoFramesPlayed(n3);
    }
}

