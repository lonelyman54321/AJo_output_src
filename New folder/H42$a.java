/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$BubbleMetadata$Builder
 *  android.app.PendingIntent
 *  android.graphics.drawable.Icon
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat$a;

public final class H42$a {
    public static H42 a(Notification.BubbleMetadata object) {
        if (object == null) {
            return null;
        }
        PendingIntent pendingIntent = object.getIntent();
        if (pendingIntent == null) {
            return null;
        }
        pendingIntent = object.getIntent();
        Object object2 = object.getIcon();
        object2 = IconCompat$a.a(object2);
        if (pendingIntent != null) {
            int n3;
            H42 h42;
            int n4 = object.getAutoExpandBubble();
            int n7 = 0;
            int n8 = 1;
            n4 = n4 != 0 ? 0 | 1 : ~n8 & 0;
            PendingIntent pendingIntent2 = object.getDeleteIntent();
            int n10 = object.isNotificationSuppressed();
            int n14 = 2;
            if (n10 != 0) {
                n4 |= n14;
            } else {
                n10 = ~n14;
                n4 &= n10;
            }
            n10 = object.getDesiredHeight();
            if (n10 != 0) {
                n10 = Math.max(object.getDesiredHeight(), 0);
            } else {
                n10 = 0;
                h42 = null;
            }
            n14 = object.getDesiredHeightResId();
            if (n14 != 0) {
                n3 = object.getDesiredHeightResId();
            } else {
                n7 = n10;
                n3 = 0;
                object = null;
            }
            h42 = new Object();
            h42.a = pendingIntent;
            h42.c = object2;
            h42.d = n7;
            h42.e = n3;
            h42.b = pendingIntent2;
            h42.g = null;
            h42.f = n4;
            return h42;
        }
        object = new NullPointerException("Bubble requires non-null pending intent");
        throw object;
    }

    public static Notification.BubbleMetadata b(H42 h42) {
        int n3;
        Icon icon = null;
        if (h42 == null) {
            return null;
        }
        PendingIntent pendingIntent = h42.a;
        if (pendingIntent == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        icon = h42.c.m(null);
        icon = builder.setIcon(icon).setIntent(pendingIntent);
        pendingIntent = h42.b;
        icon = icon.setDeleteIntent(pendingIntent);
        int n4 = h42.f;
        int n7 = 1;
        if ((n4 &= n7) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            pendingIntent = null;
        }
        icon = icon.setAutoExpandBubble(n4 != 0);
        n4 = h42.f & 2;
        if (n4 == 0) {
            n7 = 0;
            builder = null;
        }
        icon = icon.setSuppressNotification(n7 != 0);
        n4 = h42.d;
        if (n4 != 0) {
            icon.setDesiredHeight(n4);
        }
        if ((n3 = h42.e) != 0) {
            icon.setDesiredHeightResId(n3);
        }
        return icon.build();
    }
}

