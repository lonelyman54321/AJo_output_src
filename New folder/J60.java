/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.net.Uri
 *  android.view.ContentInfo$Builder
 */
import android.media.metrics.PlaybackMetrics;
import android.net.Uri;
import android.view.ContentInfo;

public final class J60 {
    public static /* bridge */ /* synthetic */ void a(PlaybackMetrics.Builder builder, int n3) {
        builder.setAudioUnderrunCount(n3);
    }

    public static /* bridge */ /* synthetic */ void b(ContentInfo.Builder builder, Uri uri) {
        builder.setLinkUri(uri);
    }
}

