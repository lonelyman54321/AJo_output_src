/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.appevents.h;
import com.facebook.login.i;
import kotlin.jvm.internal.Intrinsics;

public final class mz1
implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ mz1(i i3, Bundle bundle) {
        this.a = i3;
        this.b = bundle;
    }

    public final void run() {
        Object object = this.a;
        Bundle bundle = this.b;
        Class<i> clazz = i.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            String string2 = "this$0";
            Intrinsics.checkNotNullParameter(object, string2);
            string2 = "$bundle";
            Intrinsics.checkNotNullParameter(bundle, string2);
            object = ((i)object).b;
            string2 = "fb_mobile_login_heartbeat";
            try {
                ((h)object).a(bundle, string2);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

