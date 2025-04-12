/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
import android.app.Application;
import com.clevertap.android.sdk.b;

/*
 * Renamed from o3
 */
public final class o3_0 {
    public static boolean a = false;
    public static String b;
    public static final o3$a c;

    static {
        o3$a o3$a;
        c = o3$a = new Object();
    }

    public static void a(Application application) {
        if (application == null) {
            com.clevertap.android.sdk.b.h();
        } else {
            boolean bl2 = a;
            if (bl2) {
                com.clevertap.android.sdk.b.j();
            } else {
                b = null;
                a = bl2 = true;
                o3$a o3$a = c;
                application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)o3$a);
                application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)o3$a);
                com.clevertap.android.sdk.b.h();
            }
        }
    }
}

