/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package androidx.window.layout;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$b
implements JH0$a {
    public final JH0$a a;
    public final ReentrantLock b;
    public final WeakHashMap c;

    public SidecarCompat$b(B43$a weakHashMap) {
        Intrinsics.checkNotNullParameter(weakHashMap, "callbackInterface");
        this.a = weakHashMap;
        weakHashMap = new WeakHashMap();
        this.b = weakHashMap;
        this.c = weakHashMap = new WeakHashMap();
    }

    public final void a(Activity activity, gH3 gH32) {
        Object object;
        ReentrantLock reentrantLock;
        block7: {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(gH32, "newLayout");
            reentrantLock = this.b;
            reentrantLock.lock();
            object = this.c;
            Object object2 = ((WeakHashMap)object).get(activity);
            object2 = (gH3)object2;
            boolean bl2 = Intrinsics.areEqual(gH32, object2);
            if (!bl2) break block7;
            reentrantLock.unlock();
            return;
        }
        try {
            object = ((WeakHashMap)object).put(activity, gH32);
            object = (gH3)object;
            this.a.a(activity, gH32);
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }
}

