/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.app.Person
 */
import android.app.Notification;
import android.app.Person;

public final class V42$d {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(Notification.Action.Builder builder, int n3) {
        builder.setSemanticAction(n3);
    }
}

