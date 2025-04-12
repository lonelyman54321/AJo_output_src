/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.service.notification.StatusBarNotification
 */
import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;

/*
 * Renamed from u42
 */
public final class u42_0 {
    public static /* bridge */ /* synthetic */ StatusBarNotification[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}

