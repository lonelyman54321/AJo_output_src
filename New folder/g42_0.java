/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$Builder
 *  android.os.Bundle
 */
import android.app.Notification;
import android.os.Bundle;

/*
 * Renamed from G42
 */
public final class g42_0
extends U42 {
    public CharSequence e;

    public final void b(V42 object) {
        object = ((V42)object).b;
        Object object2 = new Notification.BigTextStyle((Notification.Builder)object);
        object = this.b;
        object = object2.setBigContentTitle((CharSequence)object);
        object2 = this.e;
        object = object.bigText((CharSequence)object2);
        boolean bl2 = this.d;
        if (bl2) {
            object2 = this.c;
            object.setSummaryText((CharSequence)object2);
        }
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.bigText");
    }

    public final String f() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final void j(Bundle object) {
        super.j((Bundle)object);
        object = object.getCharSequence("android.bigText");
        this.e = object;
    }
}

