/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Builder
 *  android.content.Context
 */
import android.app.Notification;
import android.content.Context;

public final class V42$c {
    public static Notification.Builder a(Context context, String string2) {
        Notification.Builder builder = new Notification.Builder(context, string2);
        return builder;
    }

    public static void b(Notification.Builder builder, int n3) {
        builder.setBadgeIconType(n3);
    }

    public static void c(Notification.Builder builder, boolean bl2) {
        builder.setColorized(bl2);
    }

    public static void d(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void e(Notification.Builder builder, CharSequence charSequence) {
        builder.setSettingsText(charSequence);
    }

    public static void f(Notification.Builder builder, String string2) {
        builder.setShortcutId(string2);
    }

    public static void g(Notification.Builder builder, long l2) {
        builder.setTimeoutAfter(l2);
    }
}

