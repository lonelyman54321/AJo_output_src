/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import androidx.lifecycle.r$b;
import kotlin.jvm.internal.Intrinsics;

public final class r
implements mu1_1 {
    public static final r i;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Handler e;
    public final o f;
    public final Ez2 g;
    public final r$b h;

    static {
        r r5;
        i = r5 = new r();
    }

    public r() {
        boolean bl2;
        this.c = bl2 = true;
        this.d = bl2;
        Object object = new o(this);
        this.f = object;
        this.g = object = new Ez2(this);
        this.h = object = new r$b(this);
    }

    public final void a() {
        int n3 = this.b;
        int n4 = 1;
        this.b = n3 += n4;
        if (n3 == n4) {
            n3 = (int)(this.c ? 1 : 0);
            if (n3 != 0) {
                o o3 = this.f;
                i$a i$a = i$a.ON_RESUME;
                o3.f(i$a);
                n3 = 0;
                o3 = null;
                this.c = false;
            } else {
                Handler handler = this.e;
                Intrinsics.checkNotNull(handler);
                Ez2 ez2 = this.g;
                handler.removeCallbacks((Runnable)ez2);
            }
        }
    }

    public final i getLifecycle() {
        return this.f;
    }
}

