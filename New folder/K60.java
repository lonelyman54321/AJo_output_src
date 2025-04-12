/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.os.Bundle
 *  android.view.ContentInfo$Builder
 */
import android.media.metrics.PlaybackMetrics;
import android.os.Bundle;
import android.view.ContentInfo;

public final class K60 {
    public static /* bridge */ /* synthetic */ void a(PlaybackMetrics.Builder builder, int n3) {
        builder.setVideoFramesDropped(n3);
    }

    public static /* bridge */ /* synthetic */ void b(ContentInfo.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}

