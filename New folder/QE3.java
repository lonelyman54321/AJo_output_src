/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 */
import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class QE3 {
    public static final /* synthetic */ int a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    public static final PowerManager.WakeLock a(Context object, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(string2, "tag");
        object = object.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.os.PowerManager");
        object = (PowerManager)object;
        string2 = kp1_0.c("WorkManager: ", string2);
        int n3 = 1;
        object = object.newWakeLock(n3, string2);
        RE3 rE3 = RE3.a;
        synchronized (rE3) {
            WeakHashMap weakHashMap = RE3.b;
            string2 = weakHashMap.put(object, string2);
            Intrinsics.checkNotNullExpressionValue(object, "wakeLock");
            return object;
        }
    }
}

