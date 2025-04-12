/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  android.view.View
 */
package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler$a;

public final class AndroidPrefetchScheduler
implements yy2_0,
ti2_0,
Runnable,
Choreographer.FrameCallback {
    public static long g;
    public final View a;
    public final WR1 b;
    public boolean c;
    public final Choreographer d;
    public boolean e;
    public long f;

    public AndroidPrefetchScheduler(View view) {
        WR1 wR1;
        this.a = view;
        int n3 = 16;
        Object[] objectArray = new xy2[n3];
        this.b = wR1 = new WR1(objectArray);
        wR1 = Choreographer.getInstance();
        this.d = wR1;
        long l2 = g;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            float f5;
            float f6;
            float f7;
            int n4;
            wR1 = view.getDisplay();
            int n7 = view.isInEditMode();
            if (n7 != 0 || wR1 == null || (n4 = (int)((f7 = (f6 = wR1.getRefreshRate()) - (f5 = 30.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) < 0) {
                n7 = 1114636288;
                f6 = 60.0f;
            }
            n4 = 1000000000;
            f5 = (float)n4 / f6;
            g = l2 = (long)f5;
        }
    }

    public final void a(vy2$a_0 vy2$a_0) {
        WR1 wR1 = this.b;
        wR1.b(vy2$a_0);
        boolean bl2 = this.c;
        if (!bl2) {
            this.c = bl2 = true;
            vy2$a_0 = this.a;
            vy2$a_0.post(this);
        }
    }

    public final void doFrame(long l2) {
        boolean bl2 = this.e;
        if (bl2) {
            this.f = l2;
            View view = this.a;
            view.post((Runnable)this);
        }
    }

    public final void onAbandoned() {
    }

    public final void onForgotten() {
        this.e = false;
        this.a.removeCallbacks((Runnable)this);
        this.d.removeFrameCallback((Choreographer.FrameCallback)this);
    }

    public final void onRemembered() {
        this.e = true;
    }

    public final void run() {
        Object object;
        WR1 wR1 = this.b;
        int n3 = wR1.k();
        if (n3 == 0 && (n3 = this.c) != 0 && (n3 = this.e) != 0 && (n3 = (object = this.a).getWindowVisibility()) == 0) {
            boolean bl2;
            long l2 = this.f;
            long l3 = g;
            object = new AndroidPrefetchScheduler$a(l2 += l3);
            boolean bl3 = false;
            while ((bl2 = wR1.l()) && !bl3) {
                xy2 xy22;
                long l4;
                long l7 = ((AndroidPrefetchScheduler$a)object).a();
                long l8 = l7 - (l4 = 0L);
                Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 <= 0 || (bl2 = (xy22 = (xy2)wR1.a[0]).a((AndroidPrefetchScheduler$a)object))) {
                    bl3 = true;
                    continue;
                }
                wR1.n(0);
            }
            if (bl3) {
                wR1 = this.d;
                wR1.postFrameCallback(this);
            } else {
                this.c = false;
            }
            return;
        }
        this.c = false;
    }
}

