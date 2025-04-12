/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Te3
 */
public final class te3_1
extends Fw {
    public final kw_1 q;
    public final String r;
    public final boolean s;
    public final WX t;
    public la3_0 u;

    public te3_1(yc1_1 object, kw_1 kw_12, w13 object2) {
        boolean bl2;
        List list;
        Paint.Cap cap = object2.g.toPaintCap();
        Paint.Join join = object2.h.toPaintJoin();
        oj_1 oj_12 = object2.b;
        List list2 = list = object2.c;
        list2 = (ArrayList)list;
        float f5 = object2.i;
        qj_0 qj_02 = object2.e;
        oj_1 oj_13 = object2.f;
        super((yc1_1)((Object)object), kw_12, cap, join, f5, qj_02, oj_13, (ArrayList)list2, oj_12);
        this.q = kw_12;
        object = object2.a;
        this.r = object;
        this.s = bl2 = object2.j;
        object = object2.d.a();
        object2 = object;
        object2 = (WX)object;
        this.t = object2;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
    }

    public final String getName() {
        return this.r;
    }

    public final void h(LC1 lC1, Object object) {
        super.h(lC1, object);
        Object object2 = GC1.a;
        int n3 = 2;
        object2 = n3;
        WX wX = this.t;
        if (object == object2) {
            wX.k(lC1);
        } else {
            object2 = GC1.F;
            if (object == object2) {
                object = this.u;
                object2 = this.q;
                if (object != null) {
                    ((kw_1)object2).p((iw_0)object);
                }
                object = null;
                if (lC1 == null) {
                    this.u = null;
                } else {
                    la3_0 la3_02;
                    this.u = la3_02 = new la3_0(lC1, null);
                    la3_02.a(this);
                    ((kw_1)object2).g(wX);
                }
            }
        }
    }

    public final void i(Canvas canvas, Matrix matrix, int n3, bw0_0 bw0_02) {
        int n4 = this.s;
        if (n4 != 0) {
            return;
        }
        iw_0 iw_02 = this.t;
        Object object = iw_02.b();
        float f5 = iw_02.d();
        n4 = ((WX)iw_02).m((Bo1)object, f5);
        object = this.i;
        object.setColor(n4);
        iw_02 = this.u;
        if (iw_02 != null) {
            iw_02 = (ColorFilter)((la3_0)iw_02).f();
            object.setColorFilter((ColorFilter)iw_02);
        }
        super.i(canvas, matrix, n3, bw0_02);
    }
}

