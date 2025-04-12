/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.animation.AnimationUtils
 */
package androidx.core.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AutoScrollHelper;
import androidx.core.widget.AutoScrollHelper$a;

class AutoScrollHelper$ScrollAnimationRunnable
implements Runnable {
    public final /* synthetic */ AutoScrollHelper a;

    public AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper autoScrollHelper) {
        this.a = autoScrollHelper;
    }

    public final void run() {
        long l2;
        long l3;
        long l4;
        float f5;
        long l7;
        float f6;
        AutoScrollHelper$a autoScrollHelper$a;
        int n3;
        Object object;
        AutoScrollHelper$ScrollAnimationRunnable autoScrollHelper$ScrollAnimationRunnable;
        block9: {
            block8: {
                block7: {
                    long l8;
                    long l12;
                    autoScrollHelper$ScrollAnimationRunnable = this;
                    object = this.a;
                    n3 = ((AutoScrollHelper)object).o;
                    if (n3 == 0) {
                        return;
                    }
                    n3 = ((AutoScrollHelper)object).m;
                    autoScrollHelper$a = ((AutoScrollHelper)object).a;
                    f6 = 0.0f;
                    if (n3 != 0) {
                        ((AutoScrollHelper)object).m = false;
                        autoScrollHelper$a.getClass();
                        autoScrollHelper$a.e = l12 = AnimationUtils.currentAnimationTimeMillis();
                        autoScrollHelper$a.g = l7 = (long)-1;
                        autoScrollHelper$a.f = l12;
                        n3 = 0x3F000000;
                        autoScrollHelper$a.h = f5 = 0.5f;
                    }
                    if ((n3 = (l8 = (l12 = autoScrollHelper$a.g) - (l7 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) <= 0) break block7;
                    l12 = AnimationUtils.currentAnimationTimeMillis();
                    l4 = autoScrollHelper$a.g;
                    l3 = autoScrollHelper$a.i;
                    long l14 = l12 - (l4 += l3);
                    n3 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                    if (n3 > 0) break block8;
                }
                if ((n3 = (int)(((AutoScrollHelper)object).e() ? 1 : 0)) != 0) break block9;
            }
            ((AutoScrollHelper)object).o = false;
            return;
        }
        n3 = (int)(((AutoScrollHelper)object).n ? 1 : 0);
        View view = ((AutoScrollHelper)object).c;
        if (n3 != 0) {
            ((AutoScrollHelper)object).n = false;
            l3 = SystemClock.uptimeMillis();
            int n4 = 3;
            l4 = l3;
            MotionEvent motionEvent = MotionEvent.obtain((long)l3, (long)l3, (int)n4, (float)0.0f, (float)0.0f, (int)0);
            view.onTouchEvent(motionEvent);
            motionEvent.recycle();
        }
        if ((n3 = (int)((l2 = (l4 = autoScrollHelper$a.f) - l7) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0) {
            long l15 = AnimationUtils.currentAnimationTimeMillis();
            f5 = autoScrollHelper$a.a(l15);
            f6 = -4.0f * f5 * f5;
            f5 = f5 * 4.0f + f6;
            long l16 = autoScrollHelper$a.f;
            l16 = l15 - l16;
            autoScrollHelper$a.f = l15;
            f6 = (float)l16 * f5;
            f5 = autoScrollHelper$a.d;
            n3 = (int)(f6 * f5);
            ((kv1)object).r.scrollListBy(n3);
            object = ViewCompat.a;
            view.postOnAnimation((Runnable)autoScrollHelper$ScrollAnimationRunnable);
            return;
        }
        object = new RuntimeException("Cannot compute scroll delta before calling start()");
        throw object;
    }
}

