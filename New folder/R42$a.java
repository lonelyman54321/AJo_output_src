/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$MessagingStyle
 *  android.app.Notification$MessagingStyle$Message
 */
import android.app.Notification;

public final class R42$a {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static Notification.MessagingStyle b(CharSequence charSequence) {
        Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(charSequence);
        return messagingStyle;
    }

    public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}

