/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$MessagingStyle
 *  android.app.Person
 */
import android.app.Notification;
import android.app.Person;

public final class R42$c {
    public static Notification.MessagingStyle a(Person person) {
        Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(person);
        return messagingStyle;
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean bl2) {
        return messagingStyle.setGroupConversation(bl2);
    }
}

