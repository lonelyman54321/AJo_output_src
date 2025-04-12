/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.media.AudioAttributes
 *  android.net.Uri
 */
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/*
 * Renamed from oz3
 */
public final class oz3_0 {
    public static /* bridge */ /* synthetic */ void a(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }
}

