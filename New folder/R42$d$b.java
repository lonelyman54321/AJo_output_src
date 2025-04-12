/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$MessagingStyle$Message
 *  android.app.Person
 *  android.os.Parcelable
 */
import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

public final class R42$d$b {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long l2, Person person) {
        Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(charSequence, l2, person);
        return message;
    }
}

