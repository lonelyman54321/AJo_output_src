/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
import android.animation.Animator;
import android.view.Choreographer;
import java.util.Iterator;

public final class KC1
extends nw
implements Choreographer.FrameCallback {
    public float d;
    public boolean e;
    public long f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public QB1 l;
    public boolean m;
    public boolean n;

    public final void cancel() {
        boolean bl2;
        Iterator iterator = this.b.iterator();
        while (bl2 = iterator.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener)iterator.next();
            animatorListener.onAnimationCancel((Animator)this);
        }
        boolean bl3 = this.i();
        this.b(bl3);
        this.j(true);
    }

    public final void doFrame(long l2) {
        int n3;
        Object object;
        int n4 = 2;
        int n7 = 1;
        Object object2 = this.m;
        if (object2 != 0) {
            this.j(false);
            object = Choreographer.getInstance();
            object.postFrameCallback((Choreographer.FrameCallback)this);
        }
        if ((object = this.l) != null && (n3 = this.m) != 0) {
            float f5;
            float f6;
            Object object3;
            int n8;
            Object object4;
            float f7;
            float f8;
            float f11;
            Object object5 = Yo1.a;
            long l3 = this.f;
            long l4 = 0L;
            double d2 = 0.0;
            Object object6 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object6 != false) {
                l4 = l2 - l3;
            }
            float f12 = ((QB1)object).n;
            n3 = 1315859240;
            float f14 = 1.0E9f / f12;
            f12 = Math.abs(this.d);
            f14 /= f12;
            f12 = (float)l4 / f14;
            f14 = this.g;
            boolean bl2 = this.i();
            if (bl2) {
                f12 = -f12;
            }
            f14 += f12;
            f12 = this.g();
            float f15 = this.f();
            object2 = f14 == f12 ? 0 : (f14 > f12 ? 1 : -1);
            if (object2 >= 0 && (object2 = (Object)(f14 == f15 ? 0 : (f14 < f15 ? -1 : 1))) <= 0) {
                object2 = 1;
                f12 = Float.MIN_VALUE;
            } else {
                object2 = 0;
                f12 = 0.0f;
                object = null;
            }
            object2 ^= n7;
            f15 = this.g;
            float f16 = this.g();
            float f17 = this.f();
            this.g = f14 = mp1_0.b(f14, f16, f17);
            boolean bl3 = this.n;
            if (bl3) {
                d2 = Math.floor(f14);
                f14 = (float)d2;
            }
            this.h = f14;
            this.f = l2;
            if (object2 != 0) {
                object2 = this.getRepeatCount();
                n3 = -1;
                f14 = 0.0f / 0.0f;
                if (object2 != n3 && (object2 = this.i) >= (n3 = this.getRepeatCount())) {
                    float f18;
                    f11 = this.d;
                    f8 = 0.0f;
                    f7 = 0.0f;
                    object4 = null;
                    float f19 = f11 - 0.0f;
                    n8 = (int)(f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1));
                    f11 = n8 < 0 ? this.g() : this.f();
                    this.g = f11;
                    this.h = f11;
                    this.j(n7 != 0);
                    n8 = (int)(this.n ? 1 : 0);
                    if (!n8 || (n8 = (int)((f18 = (f11 = this.g) - f15) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1)))) {
                        this.d();
                    }
                    n8 = (int)(this.i() ? 1 : 0);
                    this.b(n8 != 0);
                } else {
                    float f20;
                    object2 = this.getRepeatMode();
                    if (object2 == n4) {
                        object2 = this.e ^ n7;
                        this.e = object2;
                        this.d = f12 = -this.d;
                    } else {
                        object2 = this.i();
                        f12 = object2 != 0 ? this.f() : this.g();
                        this.g = f12;
                        this.h = f12;
                    }
                    this.f = l2;
                    n8 = (int)(this.n ? 1 : 0);
                    if (!n8 || (n8 = (int)((f20 = (f11 = this.g) - f15) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1)))) {
                        this.d();
                    }
                    object3 = this.b.iterator();
                    while ((f8 = (float)object3.hasNext()) != false) {
                        object4 = (Animator.AnimatorListener)object3.next();
                        object4.onAnimationRepeat((Animator)this);
                    }
                    n8 = this.i + n7;
                    this.i = n8;
                }
            } else {
                float f22;
                n8 = this.n;
                if (!n8 || (n8 = (f22 = (f11 = this.g) - f15) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1))) {
                    this.d();
                }
            }
            object3 = this.l;
            if (object3 == null || (f8 = (f6 = (f11 = this.h) - (f7 = this.j)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) >= 0 && (n8 = (f5 = f11 - (f7 = this.k)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) <= 0) {
                object3 = Yo1.a;
                return;
            }
            object4 = Float.valueOf(this.j);
            object = Float.valueOf(this.k);
            object5 = Float.valueOf(this.h);
            Object[] objectArray = new Object[3];
            objectArray[0] = object4;
            objectArray[n7] = object;
            objectArray[n4] = object5;
            object4 = String.format("Frame must be [%f,%f]. It is %f", objectArray);
            object3 = new IllegalStateException((String)object4);
            throw object3;
        }
    }

    public final float e() {
        QB1 qB1 = this.l;
        if (qB1 == null) {
            return 0.0f;
        }
        float f5 = this.h;
        float f6 = qB1.l;
        float f7 = qB1.m - f6;
        return (f5 -= f6) / f7;
    }

    public final float f() {
        QB1 qB1 = this.l;
        if (qB1 == null) {
            return 0.0f;
        }
        float f5 = this.k;
        float f6 = 2.1474836E9f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            f5 = qB1.m;
        }
        return f5;
    }

    public final float g() {
        QB1 qB1 = this.l;
        if (qB1 == null) {
            return 0.0f;
        }
        float f5 = this.j;
        float f6 = -2.1474836E9f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            f5 = qB1.l;
        }
        return f5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float getAnimatedFraction() {
        float f5;
        float f6;
        float f7;
        QB1 qB1 = this.l;
        if (qB1 == null) {
            return 0.0f;
        }
        boolean bl2 = this.i();
        if (bl2) {
            f7 = this.f();
            f6 = this.h;
            f7 -= f6;
            f6 = this.f();
            f5 = this.g();
            return f7 / (f6 -= f5);
        }
        f7 = this.h;
        f6 = this.g();
        f7 -= f6;
        f6 = this.f();
        f5 = this.g();
        return f7 / (f6 -= f5);
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(this.e());
    }

    public final long getDuration() {
        long l2;
        QB1 qB1 = this.l;
        if (qB1 == null) {
            l2 = 0L;
        } else {
            float f5 = qB1.b();
            l2 = (long)f5;
        }
        return l2;
    }

    public final boolean i() {
        float f5 = this.d;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object < 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public final boolean isRunning() {
        return this.m;
    }

    public final void j(boolean bl2) {
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.removeFrameCallback((Choreographer.FrameCallback)this);
        if (bl2) {
            bl2 = false;
            this.m = false;
        }
    }

    public final void k(float f5) {
        float f6 = this.g;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        f6 = this.g();
        float f8 = this.f();
        this.g = f5 = mp1_0.b(f5, f6, f8);
        object = this.n;
        if (object != false) {
            double d2 = Math.floor(f5);
            f5 = (float)d2;
        }
        this.h = f5;
        this.f = 0L;
        this.d();
    }

    public final void l(float f5, float f6) {
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object <= 0) {
            float f7;
            float f8;
            QB1 qB1 = this.l;
            float f11 = qB1 == null ? -3.4028235E38f : qB1.l;
            if (qB1 == null) {
                object = 0x7F7FFFFF;
                f8 = Float.MAX_VALUE;
            } else {
                f8 = qB1.m;
            }
            f5 = mp1_0.b(f5, f11, f8);
            f6 = mp1_0.b(f6, f11, f8);
            f8 = this.j;
            object = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
            if (object != false || (object = (f7 = f6 - (f8 = this.k)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != false) {
                this.j = f5;
                this.k = f6;
                f8 = this.h;
                int n3 = (int)mp1_0.b(f8, f5, f6);
                f5 = n3;
                this.k(f5);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("minFrame (");
        stringBuilder.append(f5);
        stringBuilder.append(") must be <= maxFrame (");
        stringBuilder.append(f6);
        stringBuilder.append(")");
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void setRepeatMode(int n3) {
        super.setRepeatMode(n3);
        int n4 = 2;
        if (n3 != n4 && (n3 = (int)(this.e ? 1 : 0)) != 0) {
            float f5;
            n3 = 0;
            this.e = false;
            this.d = f5 = -this.d;
        }
    }
}

