/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Builder
 *  android.app.Person
 *  android.os.Parcelable
 */
import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

public final class N42$c {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Parcelable b(Person person) {
        return person;
    }
}

