/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;

public final class AV0 {
    public final int a;
    public final int b;
    public final Notification c;

    public AV0(int n3, Notification notification, int n4) {
        this.a = n3;
        this.c = notification;
        this.b = n4;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<AV0> clazz2;
        if (this == object) {
            return true;
        }
        Notification notification = null;
        if (object != null && (clazz2 = AV0.class) == (clazz = object.getClass())) {
            object = (AV0)object;
            int n3 = this.a;
            int n4 = ((AV0)object).a;
            if (n3 != n4) {
                return false;
            }
            n3 = this.b;
            n4 = ((AV0)object).b;
            if (n3 != n4) {
                return false;
            }
            notification = this.c;
            object = ((AV0)object).c;
            return notification.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForegroundInfo{mNotificationId=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", mForegroundServiceType=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", mNotification=");
        Notification notification = this.c;
        stringBuilder.append(notification);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

