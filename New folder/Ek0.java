/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioManager
 */
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

public final class Ek0 {
    public static /* bridge */ /* synthetic */ void a(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate(null);
    }

    public static /* bridge */ /* synthetic */ boolean b(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.isOffloadedPlaybackSupported((AudioFormat)audioFormat, (AudioAttributes)audioAttributes);
    }
}

