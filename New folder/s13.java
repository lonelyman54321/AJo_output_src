/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.RectF
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s13
extends kw_1 {
    public final f60_0 D;
    public final g30_0 E;
    public final ew0_1 F;

    public s13(yc1_1 object, pp1 object2, g30_0 list, QB1 qB1) {
        super((yc1_1)((Object)object), (pp1)object2);
        this.E = list;
        String string2 = "__container";
        object2 = ((pp1)object2).a;
        list = new List(string2, (List)object2, false);
        this.D = object2 = new f60_0((yc1_1)((Object)object), this, (p13)((Object)list), qB1);
        object = Collections.emptyList();
        list = Collections.emptyList();
        ((f60_0)object2).b((List)object, list);
        object = this.p.x;
        if (object != null) {
            this.F = object2 = new ew0_1(this, this, (cw0_1)object);
        }
    }

    public final void f(RectF rectF, Matrix matrix, boolean bl2) {
        super.f(rectF, matrix, bl2);
        matrix = this.n;
        this.D.f(rectF, matrix, bl2);
    }

    public final void h(LC1 lC1, Object object) {
        super.h(lC1, object);
        Object object2 = GC1.a;
        int n3 = 5;
        object2 = n3;
        ew0_1 ew0_12 = this.F;
        if (object == object2 && ew0_12 != null) {
            object = ew0_12.c;
            ((iw_0)object).k(lC1);
        } else {
            object2 = GC1.B;
            if (object == object2 && ew0_12 != null) {
                ew0_12.c(lC1);
            } else {
                object2 = GC1.C;
                if (object == object2 && ew0_12 != null) {
                    object = ew0_12.e;
                    ((iw_0)object).k(lC1);
                } else {
                    object2 = GC1.D;
                    if (object == object2 && ew0_12 != null) {
                        object = ew0_12.f;
                        ((iw_0)object).k(lC1);
                    } else {
                        object2 = GC1.E;
                        if (object == object2 && ew0_12 != null) {
                            object = ew0_12.g;
                            ((iw_0)object).k(lC1);
                        }
                    }
                }
            }
        }
    }

    public final void l(Canvas canvas, Matrix matrix, int n3, bw0_0 bw0_02) {
        ew0_1 ew0_12 = this.F;
        if (ew0_12 != null) {
            bw0_02 = ew0_12.b(matrix, n3);
        }
        this.D.i(canvas, matrix, n3, bw0_02);
    }

    public final py_0 m() {
        py_0 py_02 = this.p.w;
        if (py_02 != null) {
            return py_02;
        }
        return this.E.p.w;
    }

    public final void q(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        this.D.c(ko12, n3, arrayList, ko13);
    }
}

