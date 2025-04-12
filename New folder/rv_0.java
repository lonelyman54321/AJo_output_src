/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.Context
 */
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.ril.ajio.AJIOApplication;
import java.util.concurrent.Callable;

/*
 * Renamed from rV
 */
public final class rv_0
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ a c;

    public rv_0(AJIOApplication aJIOApplication, a a2) {
        this.a = aJIOApplication;
        this.b = "Ajio";
        this.c = a2;
    }

    public final Object call() {
        Object object = this.a;
        Object object2 = "notification";
        if ((object = (NotificationManager)object.getSystemService((String)object2)) != null) {
            k52.a();
            object2 = qv_0.a();
            oV.a((NotificationChannel)object2);
            pV.a((NotificationChannel)object2);
            x31.a((NotificationManager)object, (NotificationChannel)object2);
            object = this.c;
            object2 = ((a)object).f();
            ((a)object).b();
            object = this.b;
            object.toString();
            object2.getClass();
            com.clevertap.android.sdk.b.i();
        }
        return null;
    }
}

