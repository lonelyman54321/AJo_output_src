/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackStateEvent$Builder
 *  android.view.RoundedCorner
 *  android.view.WindowInsets
 */
import android.media.metrics.PlaybackStateEvent;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/*
 * Renamed from Wz
 */
public final class wz_0 {
    public static /* synthetic */ PlaybackStateEvent.Builder a() {
        PlaybackStateEvent.Builder builder = new PlaybackStateEvent.Builder();
        return builder;
    }

    public static /* bridge */ /* synthetic */ RoundedCorner b(WindowInsets windowInsets) {
        return windowInsets.getRoundedCorner(0);
    }
}

