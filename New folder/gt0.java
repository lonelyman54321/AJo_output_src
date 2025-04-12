/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.widget.EdgeEffect
 */
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class gt0
extends ni1_0
implements ht0 {
    public final wh_0 c;
    public final lx0 d;
    public final Ng2 e;

    public gt0(wh_0 wh_02, lx0 lx02, Ng2 ng2, Function1 function1) {
        super(function1);
        this.c = wh_02;
        this.d = lx02;
        this.e = ng2;
    }

    public static boolean b(float f5, long l2, EdgeEffect edgeEffect, Canvas canvas) {
        int n3 = canvas.save();
        canvas.rotate(f5);
        f5 = e72.d(l2);
        float f6 = e72.e(l2);
        canvas.translate(f5, f6);
        boolean bl2 = edgeEffect.draw(canvas);
        canvas.restoreToCount(n3);
        return bl2;
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final void n(E60 e60) {
        long l2;
        float f5;
        float f6;
        long l3;
        float f7;
        mk2_0 mk2_02;
        float f8;
        long l4 = e60.l();
        wh_0 wh_02 = this.c;
        wh_02.l(l4);
        l4 = e60.l();
        boolean bl2 = C63.e(l4);
        if (bl2) {
            e60.e1();
            return;
        }
        e60.e1();
        wh_02.c.getValue();
        Canvas canvas = Nf.a(e60.M0().a());
        lx0 lx02 = this.d;
        EdgeEffect edgeEffect = lx02.f;
        boolean bl3 = lx0.f(edgeEffect);
        Object object = this.e;
        boolean bl4 = false;
        if (bl3) {
            edgeEffect = lx02.c();
            f8 = -C63.b(e60.l());
            mk2_02 = ((Ng2)object).b;
            bp1_0 bp1_02 = e60.getLayoutDirection();
            f7 = mk2_02.calculateLeftPadding-u2uoSUM(bp1_02);
            f7 = e60.J0(f7);
            l3 = h72.a(f8, f7);
            f6 = 270.0f;
            bl3 = gt0.b(f6, l3, edgeEffect, canvas);
        } else {
            bl3 = false;
            edgeEffect = null;
        }
        EdgeEffect edgeEffect2 = lx02.d;
        boolean bl5 = lx0.f(edgeEffect2);
        f7 = 0.0f;
        mk2_02 = null;
        f6 = Float.MIN_VALUE;
        if (bl5) {
            edgeEffect2 = lx02.e();
            mk2_0 mk2_03 = ((Ng2)object).b;
            f5 = mk2_03.calculateTopPadding-D9Ej5fM();
            l2 = h72.a(0.0f, f5 = e60.J0(f5));
            bl5 = gt0.b(0.0f, l2, edgeEffect2, canvas);
            if (!bl5 && !bl3) {
                bl3 = false;
                edgeEffect = null;
            } else {
                bl3 = true;
            }
        }
        if (bl5 = lx0.f(edgeEffect2 = lx02.g)) {
            edgeEffect2 = lx02.d();
            int n3 = ok1_1.b(C63.d(e60.l()));
            mk2_0 mk2_04 = ((Ng2)object).b;
            bp1_0 bp1_03 = e60.getLayoutDirection();
            float f11 = mk2_04.calculateRightPadding-u2uoSUM(bp1_03);
            f5 = -((float)n3);
            f7 = 90.0f;
            l2 = h72.a(0.0f, f11 = e60.J0(f11) + f5);
            bl5 = gt0.b(f7, l2, edgeEffect2, canvas);
            if (!bl5 && !bl3) {
                bl3 = false;
                edgeEffect = null;
            } else {
                bl3 = true;
            }
        }
        if (bl5 = lx0.f(edgeEffect2 = lx02.e)) {
            lx02 = lx02.b();
            object = ((Ng2)object).b;
            float f12 = object.calculateBottomPadding-D9Ej5fM();
            f12 = e60.J0(f12);
            f8 = -C63.d(e60.l());
            l2 = e60.l();
            float f14 = -C63.b(l2) + f12;
            f14 = 180.0f;
            l3 = h72.a(f8, f14);
            boolean bl6 = gt0.b(f14, l3, (EdgeEffect)lx02, canvas);
            if (bl6 || bl3) {
                bl4 = true;
            }
            bl3 = bl4;
        }
        if (bl3) {
            wh_02.g();
        }
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

