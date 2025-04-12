/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.view.animation.Interpolator
 */
import android.graphics.PointF;
import android.view.animation.Interpolator;

public class Bo1 {
    public final QB1 a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public Bo1(B01 object, B01 b01) {
        int n3;
        float f5;
        this.i = f5 = -3987645.8f;
        this.j = f5;
        this.k = n3 = 784923401;
        this.l = n3;
        this.m = f5 = Float.MIN_VALUE;
        this.n = f5;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = object;
        this.c = b01;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = f5;
        this.h = object = Float.valueOf(Float.MAX_VALUE);
    }

    public Bo1(QB1 qB1, Object object, Object object2, Interpolator interpolator2, float f5, Float f6) {
        int n3;
        float f7;
        this.i = f7 = -3987645.8f;
        this.j = f7;
        this.k = n3 = 784923401;
        this.l = n3;
        this.m = f7 = Float.MIN_VALUE;
        this.n = f7;
        this.o = null;
        this.p = null;
        this.a = qB1;
        this.b = object;
        this.c = object2;
        this.d = interpolator2;
        this.e = null;
        this.f = null;
        this.g = f5;
        this.h = f6;
    }

    public Bo1(QB1 qB1, Object object, Object object2, Interpolator interpolator2, Interpolator interpolator3, float f5) {
        int n3;
        float f6;
        this.i = f6 = -3987645.8f;
        this.j = f6;
        this.k = n3 = 784923401;
        this.l = n3;
        this.m = f6 = Float.MIN_VALUE;
        this.n = f6;
        this.o = null;
        this.p = null;
        this.a = qB1;
        this.b = object;
        this.c = object2;
        this.d = null;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f5;
        this.h = null;
    }

    public Bo1(QB1 qB1, Object object, Object object2, Interpolator interpolator2, Interpolator interpolator3, Interpolator interpolator4, float f5, Float f6) {
        int n3;
        float f7;
        this.i = f7 = -3987645.8f;
        this.j = f7;
        this.k = n3 = 784923401;
        this.l = n3;
        this.m = f7 = Float.MIN_VALUE;
        this.n = f7;
        this.o = null;
        this.p = null;
        this.a = qB1;
        this.b = object;
        this.c = object2;
        this.d = interpolator2;
        this.e = interpolator3;
        this.f = interpolator4;
        this.g = f5;
        this.h = f6;
    }

    public Bo1(Object object) {
        int n3;
        float f5;
        this.i = f5 = -3987645.8f;
        this.j = f5;
        this.k = n3 = 784923401;
        this.l = n3;
        this.m = f5 = Float.MIN_VALUE;
        this.n = f5;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = object;
        this.c = object;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = f5;
        this.h = object = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        float f5 = 1.0f;
        QB1 qB1 = this.a;
        if (qB1 == null) {
            return f5;
        }
        float f6 = this.n;
        float f7 = Float.MIN_VALUE;
        float f8 = f6 - f7;
        float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f11 == false) {
            Float f12 = this.h;
            if (f12 == null) {
                this.n = f5;
            } else {
                f5 = this.b();
                f12 = this.h;
                f6 = f12.floatValue();
                f7 = this.g;
                double d2 = f6 -= f7;
                float f14 = qB1.m;
                float f15 = qB1.l;
                double d5 = f14 -= f15;
                double d7 = (double)f5 + (d2 /= d5);
                this.n = f5 = (float)d7;
            }
        }
        return this.n;
    }

    public final float b() {
        QB1 qB1 = this.a;
        if (qB1 == null) {
            return 0.0f;
        }
        float f5 = this.m;
        float f6 = Float.MIN_VALUE;
        float f7 = f5 - f6;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 == false) {
            f5 = qB1.l;
            f6 = this.g - f5;
            float f11 = qB1.m - f5;
            this.m = f6 /= f11;
        }
        return this.m;
    }

    public final boolean c() {
        boolean bl2;
        Interpolator interpolator2 = this.d;
        if (interpolator2 == null && (interpolator2 = this.e) == null && (interpolator2 = this.f) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            interpolator2 = null;
        }
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Keyframe{startValue=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", endValue=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", startFrame=");
        float f5 = this.g;
        stringBuilder.append(f5);
        stringBuilder.append(", endFrame=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", interpolator=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

