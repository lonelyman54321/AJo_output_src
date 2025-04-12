/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.view.ContentInfo
 */
import android.content.ClipData;
import android.media.metrics.PlaybackMetrics;
import android.view.ContentInfo;

public final class N60 {
    public static /* bridge */ /* synthetic */ ClipData a(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static /* bridge */ /* synthetic */ void b(PlaybackMetrics.Builder builder, long l2) {
        builder.setNetworkTransferDurationMillis(l2);
    }
}

