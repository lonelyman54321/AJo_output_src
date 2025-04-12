/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 */
package coil.memory;

import android.app.ActivityManager;
import android.content.Context;
import coil.memory.a;
import coil.memory.d;
import coil.memory.e;
import coil.memory.f;
import coil.memory.g;
import coil.memory.h;
import kotlin.jvm.internal.Intrinsics;

public final class MemoryCache$a {
    public final Context a;
    public double b;
    public final boolean c;
    public final boolean d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MemoryCache$a(Context object) {
        boolean bl2;
        this.a = object;
        double d2 = 0.2;
        Class<ActivityManager> clazz = ActivityManager.class;
        try {
            Object object2 = t70.getSystemService(object, clazz);
            Intrinsics.checkNotNull(object2);
            ActivityManager activityManager = (ActivityManager)object2;
            bl2 = activityManager.isLowRamDevice();
            if (bl2) {
                d2 = 0.15;
            }
        }
        catch (Exception exception) {}
        this.b = d2;
        this.c = bl2 = true;
        this.d = bl2;
    }

    public final d a() {
        g g3;
        d d2;
        boolean bl2 = this.d;
        h h3 = bl2 ? new f() : new Object();
        int n3 = this.c;
        if (n3 != 0) {
            double d5 = this.b;
            double d7 = 0.0;
            double d9 = d5 - d7;
            Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
            if (object > 0) {
                Context context = this.a;
                ActivityManager activityManager = m.a;
                activityManager = ActivityManager.class;
                activityManager = t70.getSystemService(context, (Class)activityManager);
                Intrinsics.checkNotNull(activityManager);
                activityManager = activityManager;
                context = context.getApplicationInfo();
                int n4 = context.flags;
                object = 0x100000;
                if ((n4 &= object) != 0) {
                    n4 = activityManager.getLargeMemoryClass();
                }
                try {
                    n4 = activityManager.getMemoryClass();
                }
                catch (Exception exception) {
                    n4 = 256;
                }
                d7 = n4;
                d5 *= d7;
                n4 = 1024;
                d7 = n4;
                d5 = d5 * d7 * d7;
                n3 = (int)d5;
            } else {
                n3 = 0;
                d2 = null;
            }
            g3 = n3 > 0 ? new e(n3, h3) : new a(h3);
        } else {
            g3 = new a(h3);
        }
        d2 = new d(g3, h3);
        return d2;
    }
}

