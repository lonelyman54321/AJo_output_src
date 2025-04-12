/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;

public final class B42 {
    public static int a(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static String b(Notification notification) {
        return notification.getChannelId();
    }

    public static CharSequence c(Notification notification) {
        return notification.getSettingsText();
    }

    public static String d(Notification notification) {
        return notification.getShortcutId();
    }

    public static long e(Notification notification) {
        return notification.getTimeoutAfter();
    }
}

