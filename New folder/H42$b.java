/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$BubbleMetadata$Builder
 *  android.app.PendingIntent
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Icon
 *  android.text.TextUtils
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$a;

public final class H42$b {
    /*
     * Enabled aggressive block sorting
     */
    public static H42 a(Notification.BubbleMetadata object) {
        boolean bl2;
        String string2;
        if (object == null) {
            return null;
        }
        Object object2 = object.getShortcutId();
        if (object2 != null) {
            string2 = object.getShortcutId();
            object2 = new Object();
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) {
                NullPointerException nullPointerException = new NullPointerException("Bubble requires a non-null shortcut id");
                throw nullPointerException;
            }
            ((H42$c)object2).g = string2;
        } else {
            string2 = object.getIntent();
            Icon icon = object.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            IconCompat iconCompat = IconCompat$a.a(icon);
            object2 = new H42$c((PendingIntent)string2, iconCompat);
        }
        int n3 = object.getAutoExpandBubble();
        ((H42$c)object2).a(1, n3 != 0);
        string2 = object.getDeleteIntent();
        ((H42$c)object2).f = string2;
        n3 = object.isNotificationSuppressed();
        ((H42$c)object2).a(2, n3 != 0);
        n3 = object.getDesiredHeight();
        bl2 = false;
        Object var4_10 = null;
        if (n3 != 0) {
            ((H42$c)object2).c = n3 = Math.max(object.getDesiredHeight(), 0);
            ((H42$c)object2).d = 0;
        }
        if ((n3 = object.getDesiredHeightResId()) != 0) {
            int n4;
            ((H42$c)object2).d = n4 = object.getDesiredHeightResId();
            ((H42$c)object2).c = 0;
        }
        PendingIntent pendingIntent = ((H42$c)object2).a;
        string2 = ((H42$c)object2).g;
        if (string2 == null && pendingIntent == null) {
            NullPointerException nullPointerException = new NullPointerException("Must supply pending intent or shortcut to bubble");
            throw nullPointerException;
        }
        IconCompat iconCompat = ((H42$c)object2).b;
        if (string2 == null && iconCompat == null) {
            NullPointerException nullPointerException = new NullPointerException("Must supply an icon or shortcut for the bubble");
            throw nullPointerException;
        }
        PendingIntent pendingIntent2 = ((H42$c)object2).f;
        int n7 = ((H42$c)object2).c;
        int n8 = ((H42$c)object2).d;
        int n10 = ((H42$c)object2).e;
        H42 h42 = new Object();
        h42.a = pendingIntent;
        h42.c = iconCompat;
        h42.d = n7;
        h42.e = n8;
        h42.b = pendingIntent2;
        h42.g = string2;
        h42.f = n10;
        return h42;
    }

    public static Notification.BubbleMetadata b(H42 h42) {
        int n3;
        PendingIntent pendingIntent;
        Object object = null;
        if (h42 == null) {
            return null;
        }
        String string2 = h42.g;
        if (string2 != null) {
            object = new Notification.BubbleMetadata.Builder(string2);
        } else {
            object = h42.c.m(null);
            pendingIntent = h42.a;
            string2 = new Notification.BubbleMetadata.Builder(pendingIntent, (Icon)object);
            object = string2;
        }
        string2 = h42.b;
        string2 = object.setDeleteIntent((PendingIntent)string2);
        int n4 = h42.f;
        int n7 = 1;
        if ((n4 &= n7) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            pendingIntent = null;
        }
        string2 = string2.setAutoExpandBubble(n4 != 0);
        n4 = h42.f & 2;
        if (n4 == 0) {
            n7 = 0;
        }
        string2.setSuppressNotification(n7 != 0);
        int n8 = h42.d;
        if (n8 != 0) {
            object.setDesiredHeight(n8);
        }
        if ((n3 = h42.e) != 0) {
            object.setDesiredHeightResId(n3);
        }
        return object.build();
    }
}

