/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 */
import android.app.NotificationChannel;
import android.app.NotificationManager;

/*
 * Renamed from OI
 */
public final class oi_0 {
    public static /* bridge */ /* synthetic */ NotificationChannel a(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
    }
}

