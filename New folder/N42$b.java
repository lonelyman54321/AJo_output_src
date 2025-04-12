/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Builder
 *  android.graphics.drawable.Icon
 *  android.os.Parcelable
 */
import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class N42$b {
    public static Parcelable a(Icon icon) {
        return icon;
    }

    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }
}

