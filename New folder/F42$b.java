/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$BigPictureStyle
 *  android.graphics.drawable.Icon
 */
import android.app.Notification;
import android.graphics.drawable.Icon;

public final class F42$b {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean bl2) {
        bigPictureStyle.showBigPictureWhenCollapsed(bl2);
    }
}

