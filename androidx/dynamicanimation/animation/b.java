/*
 * Decompiled with CFR 0.152.
 */
package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.a$b;
import androidx.dynamicanimation.animation.b$c;
import androidx.dynamicanimation.animation.b$f;
import androidx.dynamicanimation.animation.b$j;
import androidx.dynamicanimation.animation.b$k;
import androidx.dynamicanimation.animation.b$l;
import androidx.dynamicanimation.animation.b$m;
import androidx.dynamicanimation.animation.b$n;
import androidx.dynamicanimation.animation.b$p;
import androidx.dynamicanimation.animation.b$q;
import androidx.dynamicanimation.animation.b$r;
import androidx.dynamicanimation.animation.b$s;
import androidx.dynamicanimation.animation.c;
import androidx.dynamicanimation.animation.d;
import java.util.ArrayList;

public abstract class b
implements a$b {
    public static final b$j m;
    public static final b$k n;
    public static final b$l o;
    public static final b$m p;
    public static final b$n q;
    public static final b$c r;
    public float a = 0.0f;
    public float b;
    public boolean c;
    public final Object d;
    public final jS0 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;

    static {
        b$s b$s;
        new jS0("translationX");
        new jS0("translationY");
        new jS0("translationZ");
        m = b$s = new jS0("scaleX");
        b$s = new jS0("scaleY");
        n = b$s;
        b$s = new jS0("rotation");
        o = b$s;
        b$s = new jS0("rotationX");
        p = b$s;
        b$s = new jS0("rotationY");
        q = b$s;
        new jS0("x");
        new jS0("y");
        new jS0("z");
        b$s = new jS0("alpha");
        r = b$s;
        new jS0("scrollX");
        new jS0("scrollY");
    }

    public b(Object object, jS0 jS02) {
        ArrayList arrayList;
        long l2;
        float f5;
        this.b = f5 = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = f5;
        this.h = f5 = -3.4028235E38f;
        this.i = l2 = 0L;
        this.k = arrayList = new ArrayList();
        this.l = arrayList = new ArrayList();
        this.d = object;
        this.e = jS02;
        object = o;
        if (jS02 != object && jS02 != (object = p) && jS02 != (object = q)) {
            float f6;
            object = r;
            f5 = 0.00390625f;
            this.j = jS02 == object ? f5 : (jS02 != (object = m) && jS02 != (object = n) ? (f6 = 1.0f) : f5);
        } else {
            float f7;
            this.j = f7 = 0.1f;
        }
    }

    public b(pS0 pS02) {
        float f5;
        this.b = f5 = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = f5;
        this.h = -3.4028235E38f;
        this.i = 0L;
        Object object = new ArrayList();
        this.k = object;
        object = new ArrayList();
        this.l = object;
        this.d = null;
        this.e = object = new b$f(pS02);
        this.j = 1.0f;
    }

    public final boolean a(long l2) {
        float f5;
        b b2 = this;
        long l3 = this.i;
        long l4 = 0L;
        double d2 = 0.0;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            this.i = l2;
            float f6 = this.b;
            this.c(f6);
            return false;
        }
        long l7 = l2 - l3;
        this.i = l2;
        b b3 = this;
        b3 = (c)this;
        Object object2 = ((c)b3).u;
        boolean bl2 = true;
        int n3 = 0x7F7FFFFF;
        float f7 = Float.MAX_VALUE;
        if (object2 != 0) {
            f5 = ((c)b3).t;
            float f8 = f5 - f7;
            Object object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object3 != false) {
                double d5;
                d d7 = ((c)b3).s;
                d7.i = d5 = (double)f5;
                ((c)b3).t = f7;
            }
            d d9 = ((c)b3).s;
            d2 = d9.i;
            b3.b = f5 = (float)d2;
            b3.a = 0.0f;
            ((c)b3).u = false;
        } else {
            double d12;
            d d13;
            Object object4;
            double d14;
            double d15;
            f5 = ((c)b3).t;
            float f11 = f5 - f7;
            object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object2 != 0) {
                d d16 = ((c)b3).s;
                d15 = b3.b;
                d14 = b3.a;
                long l8 = 2;
                long l12 = l7 / l8;
                object4 = d16.c(d15, d14, l12);
                d13 = ((c)b3).s;
                float f12 = ((c)b3).t;
                d13.i = d15 = (double)f12;
                ((c)b3).t = f7;
                d15 = ((b$p)object4).a;
                d14 = ((b$p)object4).b;
                object4 = d13.c(d15, d14, l12);
                b3.b = f7 = ((b$p)object4).a;
                b3.a = f5 = ((b$p)object4).b;
            } else {
                d d17 = ((c)b3).s;
                double d18 = b3.b;
                double d19 = b3.a;
                object4 = d17.c(d18, d19, l7);
                b3.b = f7 = ((b$p)object4).a;
                b3.a = f5 = ((b$p)object4).b;
            }
            f5 = b3.b;
            f7 = b3.h;
            b3.b = f5 = Math.max(f5, f7);
            f7 = b3.g;
            b3.b = f5 = Math.min(f5, f7);
            f7 = b3.a;
            d13 = ((c)b3).s;
            d13.getClass();
            f7 = Math.abs(f7);
            d15 = f7;
            d14 = d13.e;
            n3 = (int)(d15 == d14 ? 0 : (d15 < d14 ? -1 : 1));
            if (n3 < 0 && (object2 = (d12 = (d15 = (double)(f5 = Math.abs(f5 - (f7 = (float)d13.i)))) - (d2 = d13.d)) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1)) < 0) {
                object4 = ((c)b3).s;
                d2 = ((d)object4).i;
                b3.b = f5 = (float)d2;
                b3.a = 0.0f;
            } else {
                bl2 = false;
            }
        }
        float f14 = b2.b;
        f5 = b2.g;
        b2.b = f14 = Math.min(f14, f5);
        f5 = b2.h;
        b2.b = f14 = Math.max(f14, f5);
        b2.c(f14);
        if (bl2) {
            b2.b(false);
        }
        return bl2;
    }

    public final void b(boolean n3) {
        int n4;
        long l2;
        int n7 = 0;
        Object var3_3 = null;
        this.f = false;
        Object object = androidx.dynamicanimation.animation.a.f;
        Object object2 = ((ThreadLocal)object).get();
        if (object2 == null) {
            object2 = new Object();
            ((ThreadLocal)object).set(object2);
        }
        object = (a)((ThreadLocal)object).get();
        ((a)object).a.remove(this);
        object2 = ((a)object).b;
        int n8 = ((ArrayList)object2).indexOf(this);
        int n10 = 1;
        if (n8 >= 0) {
            ((ArrayList)object2).set(n8, null);
            ((a)object).e = n10;
        }
        this.i = l2 = 0L;
        this.c = false;
        while (n7 < (n4 = ((ArrayList)(object = this.k)).size())) {
            object2 = ((ArrayList)object).get(n7);
            if (object2 != null) {
                object = (b$q)((ArrayList)object).get(n7);
                float f5 = this.b;
                float f6 = this.a;
                object.a(this, n3 != 0, f5, f6);
            }
            ++n7;
        }
        for (n3 = ((ArrayList)object).size() - n10; n3 >= 0; n3 += -1) {
            var3_3 = ((ArrayList)object).get(n3);
            if (var3_3 != null) continue;
            ((ArrayList)object).remove(n3);
        }
    }

    public final void c(float f5) {
        int n3;
        int n4;
        Object object = this.e;
        Object object2 = this.d;
        ((jS0)object).setValue(object2, f5);
        f5 = 0.0f;
        for (n4 = 0; n4 < (n3 = ((ArrayList)(object = this.l)).size()); ++n4) {
            object2 = ((ArrayList)object).get(n4);
            if (object2 == null) continue;
            object = (b$r)((ArrayList)object).get(n4);
            float f6 = this.b;
            object.f(f6);
        }
        for (n4 = ((ArrayList)object).size() + -1; n4 >= 0; n4 += -1) {
            object2 = ((ArrayList)object).get(n4);
            if (object2 != null) continue;
            ((ArrayList)object).remove(n4);
        }
    }
}

