/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from iw
 */
public abstract class iw_0 {
    public final ArrayList a;
    public boolean b;
    public final iw$c c;
    public float d;
    public LC1 e;
    public Object f;
    public float g;
    public float h;

    /*
     * Enabled aggressive block sorting
     */
    public iw_0(List object) {
        float f5;
        int n3 = 1;
        Object object2 = new ArrayList(n3);
        this.a = object2;
        this.b = false;
        this.d = 0.0f;
        object2 = null;
        this.f = null;
        this.g = f5 = -1.0f;
        this.h = f5;
        int n4 = object.isEmpty();
        if (n4 != 0) {
            object = new Object();
        } else {
            n4 = object.size();
            object2 = n4 == n3 ? new iw$e((List)object) : new iw$d((List)object);
            object = object2;
        }
        this.c = object;
    }

    public final void a(iw$a iw$a) {
        this.a.add(iw$a);
    }

    public final Bo1 b() {
        return this.c.b();
    }

    public float c() {
        float f5 = this.h;
        float f6 = -1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            iw$c iw$c = this.c;
            this.h = f5 = iw$c.e();
        }
        return this.h;
    }

    public final float d() {
        boolean bl2;
        Bo1 bo1 = this.b();
        if (bo1 != null && !(bl2 = bo1.c()) && (bo1 = bo1.d) != null) {
            float f5 = this.e();
            return bo1.getInterpolation(f5);
        }
        return 0.0f;
    }

    public final float e() {
        boolean bl2 = this.b;
        float f5 = 0.0f;
        if (bl2) {
            return 0.0f;
        }
        Bo1 bo1 = this.b();
        boolean bl3 = bo1.c();
        if (bl3) {
            return 0.0f;
        }
        f5 = this.d;
        float f6 = bo1.b();
        f5 -= f6;
        f6 = bo1.a();
        float f7 = bo1.b();
        return f5 / (f6 -= f7);
    }

    public Object f() {
        Object object;
        Interpolator interpolator2;
        boolean bl2;
        float f5 = this.e();
        Object object2 = this.e;
        if (object2 == null && (bl2 = (object2 = this.c).a(f5)) && !(bl2 = this.l())) {
            return this.f;
        }
        object2 = this.b();
        Interpolator interpolator3 = ((Bo1)object2).e;
        if (interpolator3 != null && (interpolator2 = ((Bo1)object2).f) != null) {
            float f6 = interpolator3.getInterpolation(f5);
            float f7 = interpolator2.getInterpolation(f5);
            object = this.h((Bo1)object2, f5, f6, f7);
        } else {
            f5 = this.d();
            object = this.g((Bo1)object2, f5);
        }
        this.f = object;
        return object;
    }

    public abstract Object g(Bo1 var1, float var2);

    public Object h(Bo1 object, float f5, float f6, float f7) {
        object = new UnsupportedOperationException("This animation does not support split dimensions!");
        throw object;
    }

    public void i() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.a)).size()); ++i3) {
            object = (iw$a)((ArrayList)object).get(i3);
            object.a();
        }
    }

    public void j(float f5) {
        Object object;
        float f6;
        float f7;
        Object object2 = Yo1.a;
        object2 = this.c;
        Object object3 = object2.isEmpty();
        if (object3 != 0) {
            return;
        }
        float f8 = this.g;
        float f11 = -1.0f;
        float f12 = f8 - f11;
        object3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object3 == 0) {
            this.g = f8 = object2.d();
        }
        if ((f7 = (f6 = f5 - (f8 = this.g)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0) {
            object = f8 == f11 ? 0 : (f8 > f11 ? 1 : -1);
            if (object == false) {
                this.g = f5 = object2.d();
            }
            f5 = this.g;
        } else {
            f8 = this.c();
            float f14 = f5 - f8;
            object3 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            if (object3 > 0) {
                f5 = this.c();
            }
        }
        f8 = this.d;
        object3 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
        if (object3 == 0) {
            return;
        }
        this.d = f5;
        object = object2.c(f5);
        if (object != false) {
            this.i();
        }
    }

    public final void k(LC1 lC1) {
        LC1 lC12 = this.e;
        if (lC12 != null) {
            lC12.getClass();
        }
        this.e = lC1;
    }

    public boolean l() {
        return false;
    }
}

