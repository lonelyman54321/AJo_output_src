/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.app.PendingIntent
 *  android.graphics.drawable.Icon
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

public final class V42$a {
    public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, charSequence, pendingIntent);
        return builder;
    }

    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static void c(Notification.Builder builder, Object object) {
        object = (Icon)object;
        builder.setSmallIcon((Icon)object);
    }
}

