/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;
import android.support.v4.app.INotificationSideChannel;

public final class s52$b
implements s52$e {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public s52$b(String string2, Notification notification) {
        this.a = string2;
        this.b = 101010;
        this.c = null;
        this.d = notification;
    }

    public final void a(INotificationSideChannel iNotificationSideChannel) {
        String string2 = this.c;
        Notification notification = this.d;
        String string3 = this.a;
        int n3 = this.b;
        iNotificationSideChannel.notify(string3, n3, string2, notification);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotifyTask[packageName:");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", id:");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", tag:");
        string2 = this.c;
        return h30_0.a(stringBuilder, string2, "]");
    }
}

