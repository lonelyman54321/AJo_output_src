/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.widget.RemoteViews
 */
import android.app.Notification;
import android.widget.RemoteViews;

public final class V42$b {
    public static void a(Notification.Action.Builder builder, boolean bl2) {
        builder.setAllowGeneratedReplies(bl2);
    }

    public static void b(Notification.Builder builder, RemoteViews remoteViews) {
        builder.setCustomBigContentView(remoteViews);
    }

    public static void c(Notification.Builder builder, RemoteViews remoteViews) {
        builder.setCustomContentView(remoteViews);
    }

    public static void d(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}

