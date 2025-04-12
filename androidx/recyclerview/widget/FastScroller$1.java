/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 */
package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.FastScroller;

class FastScroller$1
implements Runnable {
    public final /* synthetic */ FastScroller a;

    public FastScroller$1(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void run() {
        block2: {
            ValueAnimator valueAnimator;
            int n3;
            FastScroller fastScroller;
            int n4;
            block1: {
                block0: {
                    n4 = 2;
                    int n7 = 1;
                    fastScroller = this.a;
                    n3 = fastScroller.A;
                    valueAnimator = fastScroller.z;
                    if (n3 == n7) break block0;
                    if (n3 == n4) break block1;
                    break block2;
                }
                valueAnimator.cancel();
            }
            fastScroller.A = 3;
            float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
            float[] fArray = new float[n4];
            n3 = 0;
            fArray[0] = f5;
            f5 = 0.0f;
            fastScroller = null;
            fArray[n7] = 0.0f;
            valueAnimator.setFloatValues(fArray);
            n4 = 500;
            long l2 = n4;
            valueAnimator.setDuration(l2);
            valueAnimator.start();
        }
    }
}

