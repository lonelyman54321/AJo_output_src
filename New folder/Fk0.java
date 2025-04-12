/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioManager
 *  android.media.metrics.PlaybackMetrics$Builder
 */
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.metrics.PlaybackMetrics;

public final class Fk0 {
    public static /* bridge */ /* synthetic */ int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.getPlaybackOffloadSupport((AudioFormat)audioFormat, (AudioAttributes)audioAttributes);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder b(PlaybackMetrics.Builder builder) {
        return builder.setPlayerName("AndroidXMedia3");
    }
}

