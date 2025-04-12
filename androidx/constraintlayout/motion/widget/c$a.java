/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.animation.Interpolator
 */
package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.d;
import java.util.ArrayList;

public final class c$a {
    public final int a;
    public final int b;
    public final fQ1 c;
    public final int d;
    public final Tn1 e;
    public final d f;
    public final Interpolator g;
    public boolean h;
    public float i;
    public float j;
    public long k;
    public final Rect l;
    public final boolean m;

    public c$a(d object, fQ1 arrayList, int n3, int n4, int n7, Interpolator interpolator2, int n8, int n10) {
        long l2;
        Rect rect;
        Tn1 tn1;
        this.e = tn1 = new Tn1();
        tn1 = null;
        this.h = false;
        this.l = rect = new Rect();
        this.m = false;
        this.f = object;
        this.c = arrayList;
        this.d = n4;
        this.k = l2 = System.nanoTime();
        arrayList = ((d)object).d;
        if (arrayList == null) {
            ((d)object).d = arrayList = new ArrayList();
        }
        object = ((d)object).d;
        ((ArrayList)object).add(this);
        this.g = interpolator2;
        this.a = n8;
        this.b = n10;
        int n14 = 3;
        float f5 = 4.2E-45f;
        if (n7 == n14) {
            n14 = 1;
            f5 = Float.MIN_VALUE;
            this.m = n14;
        }
        if (n3 == 0) {
            n14 = 0x7F7FFFFF;
            f5 = Float.MAX_VALUE;
        } else {
            n14 = 1065353216;
            float f6 = n3;
            f5 = 1.0f / f6;
        }
        this.j = f5;
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a() {
        float f5;
        float f6;
        int n3 = this.h;
        d d2 = this.f;
        Object object = this.g;
        fQ1 fQ12 = this.c;
        int n4 = this.b;
        int n7 = this.a;
        int n8 = -1;
        long l2 = 4517329193108106637L;
        double d5 = 1.0E-6;
        if (n3 != 0) {
            float f7;
            long l3 = System.nanoTime();
            long l4 = this.k;
            l4 = l3 - l4;
            this.k = l3;
            float f8 = this.i;
            double d7 = (double)l4 * d5;
            float f11 = (float)d7;
            float f12 = this.j;
            this.i = f8 -= (f11 *= f12);
            float f14 = f8 - 0.0f;
            n3 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
            if (n3 < 0) {
                this.i = 0.0f;
            }
            if (object == null) {
                f8 = this.i;
            } else {
                f8 = this.i;
                f8 = object.getInterpolation(f8);
            }
            f12 = f8;
            View view = fQ12.b;
            Tn1 tn1 = this.e;
            Object object2 = fQ12;
            n3 = (int)(fQ12.f(f8, l3, tn1, view) ? 1 : 0);
            float f15 = this.i;
            float f16 = f15 - 0.0f;
            float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            if (f17 <= 0) {
                if (n7 != n8) {
                    object = fQ12.b;
                    l2 = System.nanoTime();
                    object2 = l2;
                    object.setTag(n7, object2);
                }
                if (n4 != n8) {
                    object = fQ12.b;
                    object.setTag(n4, null);
                }
                object = d2.e;
                ((ArrayList)object).add(this);
            }
            if ((f17 = (f7 = (f15 = this.i) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) <= 0) {
                if (n3 == 0) return;
            }
            MotionLayout motionLayout = d2.a;
            motionLayout.invalidate();
            return;
        }
        long l7 = System.nanoTime();
        long l8 = this.k;
        l8 = l7 - l8;
        this.k = l7;
        float f18 = this.i;
        double d9 = (double)l8 * d5;
        float f19 = (float)d9;
        float f20 = this.j;
        this.i = f19 = f19 * f20 + f18;
        n3 = 1065353216;
        f18 = 1.0f;
        float f22 = f19 - f18;
        Object object3 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
        if (object3 >= 0) {
            this.i = f18;
        }
        if (object == null) {
            f6 = this.i;
        } else {
            f19 = this.i;
            f6 = object.getInterpolation(f19);
        }
        f20 = f6;
        View view = fQ12.b;
        Tn1 tn1 = this.e;
        Object object4 = fQ12;
        boolean bl2 = fQ12.f(f6, l7, tn1, view);
        f19 = this.i;
        float f23 = f19 == f18 ? 0 : (f19 > f18 ? 1 : -1);
        if (f23 >= 0) {
            boolean bl3;
            if (n7 != n8) {
                object4 = fQ12.b;
                long l12 = System.nanoTime();
                Long l14 = l12;
                object4.setTag(n7, (Object)l14);
            }
            if (n4 != n8) {
                object4 = fQ12.b;
                object4.setTag(n4, null);
            }
            if (!(bl3 = this.m)) {
                object4 = d2.e;
                ((ArrayList)object4).add(this);
            }
        }
        if ((n3 = (int)((f5 = (f19 = this.i) - f18) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) >= 0) {
            if (!bl2) return;
        }
        MotionLayout motionLayout = d2.a;
        motionLayout.invalidate();
    }

    public final void b() {
        long l2;
        float f5 = Float.MIN_VALUE;
        this.h = true;
        int n3 = this.d;
        int n4 = -1;
        float f6 = 0.0f / 0.0f;
        if (n3 != n4) {
            if (n3 == 0) {
                n3 = 0x7F7FFFFF;
                f5 = Float.MAX_VALUE;
            } else {
                n4 = 1065353216;
                f6 = 1.0f;
                f5 = n3;
                f5 = f6 / f5;
            }
            this.j = f5;
        }
        this.f.a.invalidate();
        this.k = l2 = System.nanoTime();
    }
}

