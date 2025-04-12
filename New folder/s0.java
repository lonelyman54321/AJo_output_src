/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 */
import android.app.ActivityManager;
import android.content.Context;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

public final class s0
implements Runnable {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Class<t0> clazz = t0.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        try {
            Context context = FacebookSdk.a();
            String string2 = "activity";
            Object object = context.getSystemService(string2);
            string2 = "null cannot be cast to non-null type android.app.ActivityManager";
            Intrinsics.checkNotNull(object, string2);
            ActivityManager activityManager = (ActivityManager)object;
            t0.a(activityManager);
            return;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

