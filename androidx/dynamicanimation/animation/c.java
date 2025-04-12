/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.AndroidRuntimeException
 *  android.view.Choreographer$FrameCallback
 */
package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.a$a;
import androidx.dynamicanimation.animation.a$d;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.d;

public final class c
extends b {
    public d s = null;
    public float t = Float.MAX_VALUE;
    public boolean u = false;

    public c(pS0 pS02) {
        super(pS02);
    }

    public final void d(float f5) {
        boolean bl2 = this.f;
        if (bl2) {
            this.t = f5;
        } else {
            double d2;
            d d5 = this.s;
            if (d5 == null) {
                this.s = d5 = new d(f5);
            }
            d5 = this.s;
            d5.i = d2 = (double)f5;
            this.g();
        }
    }

    public final void e() {
        Looper looper;
        Looper looper2 = Looper.myLooper();
        if (looper2 == (looper = Looper.getMainLooper())) {
            float f5;
            float f6;
            float f7;
            float f8;
            boolean bl2 = this.f;
            if (bl2) {
                bl2 = true;
                f8 = Float.MIN_VALUE;
                this.b(bl2);
            }
            if ((f7 = (f6 = (f8 = this.t) - (f5 = Float.MAX_VALUE)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
                d d2 = this.s;
                if (d2 == null) {
                    this.s = d2 = new d(f8);
                } else {
                    double d5;
                    d2.i = d5 = (double)f8;
                }
                this.t = f5;
            }
            return;
        }
        looper2 = new AndroidRuntimeException("Animations may only be canceled on the main thread");
        throw looper2;
    }

    public final void f() {
        Object object = this.s;
        double d2 = ((d)object).b;
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object2 > 0) {
            Looper looper;
            object = Looper.myLooper();
            if (object == (looper = Looper.getMainLooper())) {
                boolean bl2 = this.f;
                if (bl2) {
                    this.u = bl2 = true;
                }
                return;
            }
            object = new AndroidRuntimeException("Animations may only be started on the main thread");
            throw object;
        }
        object = new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        throw object;
    }

    public final void g() {
        Object object = this.s;
        if (object != null) {
            float f5 = (float)((d)object).i;
            double d2 = f5;
            float f6 = this.g;
            double d5 = f6;
            double d7 = d2 - d5;
            Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object2 <= 0) {
                f6 = this.h;
                d5 = f6;
                double d9 = d2 - d5;
                object2 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                if (object2 >= 0) {
                    Object object3;
                    f5 = this.j;
                    int n3 = 1061158912;
                    float f7 = 0.75f;
                    ((d)object).d = d2 = Math.abs((double)(f5 *= f7));
                    d5 = 62.5;
                    ((d)object).e = d2 *= d5;
                    object = Looper.myLooper();
                    if (object == (object3 = Looper.getMainLooper())) {
                        int n4 = this.f;
                        if (n4 == 0 && n4 == 0) {
                            float f8;
                            float f11;
                            float f12;
                            float f14 = Float.MIN_VALUE;
                            this.f = true;
                            n4 = this.c;
                            if (n4 == 0) {
                                object = this.e;
                                object3 = this.d;
                                this.b = f14 = ((jS0)object).getValue(object3);
                            }
                            if ((f12 = (f11 = (f14 = this.b) - (f5 = this.g)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) <= 0 && (n4 = (f8 = f14 - (f5 = this.h)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) >= 0) {
                                object = androidx.dynamicanimation.animation.a.f;
                                object3 = ((ThreadLocal)object).get();
                                if (object3 == null) {
                                    object3 = new a();
                                    ((ThreadLocal)object).set(object3);
                                }
                                object = (a)((ThreadLocal)object).get();
                                object3 = ((a)object).b;
                                n3 = object3.size();
                                if (n3 == 0) {
                                    Object object4 = ((a)object).d;
                                    if (object4 == null) {
                                        a$a a$a = ((a)object).c;
                                        ((a)object).d = object4 = new a$d(a$a);
                                    }
                                    object = ((a)object).d;
                                    object4 = ((a$d)object).c;
                                    object = ((a$d)object).b;
                                    object.postFrameCallback((Choreographer.FrameCallback)object4);
                                }
                                if ((n4 = (int)(object3.contains(this) ? 1 : 0)) == 0) {
                                    object3.add(this);
                                }
                            } else {
                                object = new IllegalArgumentException("Starting value need to be in between min value and max value");
                                throw object;
                            }
                        }
                        return;
                    }
                    object = new AndroidRuntimeException("Animations may only be started on the main thread");
                    throw object;
                }
                object = new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                throw object;
            }
            object = new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            throw object;
        }
        object = new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        throw object;
    }
}

