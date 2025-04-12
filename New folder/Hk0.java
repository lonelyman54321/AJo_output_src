/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.PlaybackParams
 */
import android.media.PlaybackParams;
import androidx.appcompat.app.AppCompatActivity;

public final class Hk0 {
    public static /* bridge */ /* synthetic */ float a(PlaybackParams playbackParams) {
        return playbackParams.getSpeed();
    }

    public static /* bridge */ /* synthetic */ boolean b(AppCompatActivity appCompatActivity) {
        return appCompatActivity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO");
    }
}

