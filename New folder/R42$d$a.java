/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$MessagingStyle$Message
 *  android.net.Uri
 */
import android.app.Notification;
import android.net.Uri;

public final class R42$d$a {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long l2, CharSequence charSequence2) {
        Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(charSequence, l2, charSequence2);
        return message;
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String string2, Uri uri) {
        return message.setData(string2, uri);
    }
}

