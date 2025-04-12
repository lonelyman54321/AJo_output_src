/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.PlaybackParams
 */
import android.content.Context;
import android.media.PlaybackParams;

public final class Pk0 {
    public static /* bridge */ /* synthetic */ int a(Context context) {
        return context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
    }

    public static /* bridge */ /* synthetic */ PlaybackParams b(PlaybackParams playbackParams) {
        return playbackParams.setAudioFallbackMode(2);
    }
}

