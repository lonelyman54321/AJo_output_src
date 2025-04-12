/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from Va3
 */
public final class va3_1
extends iw_0 {
    public final PointF i;
    public final PointF j;
    public final iw_0 k;
    public final iw_0 l;
    public LC1 m;
    public LC1 n;

    public va3_1(es0_0 es0_02, es0_0 es0_03) {
        PointF pointF = Collections.emptyList();
        super((List)pointF);
        this.i = pointF = new PointF();
        this.j = pointF = new PointF();
        this.k = es0_02;
        this.l = es0_03;
        float f5 = this.d;
        this.j(f5);
    }

    public final Object f() {
        return this.m();
    }

    public final void j(float f5) {
        int n3;
        Object object = this.k;
        ((iw_0)object).j(f5);
        iw_0 iw_02 = this.l;
        iw_02.j(f5);
        f5 = ((Float)((iw_0)object).f()).floatValue();
        object = (Float)iw_02.f();
        float f6 = ((Float)object).floatValue();
        iw_02 = this.i;
        iw_02.set(f5, f6);
        f5 = 0.0f;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.a)).size()); ++i3) {
            object = (iw$a)((ArrayList)object).get(i3);
            object.a();
        }
    }

    public final PointF m() {
        float f5;
        float f6;
        float f7;
        float f8;
        Object object;
        Object object2;
        float f11;
        float f12;
        LC1 lC1;
        Object object3;
        Object object4;
        Object object5 = this.m;
        float f14 = 0.0f;
        Object object6 = null;
        if (object5 != null && (object4 = ((iw_0)(object5 = this.k)).b()) != null) {
            float f15;
            object3 = ((Bo1)object4).h;
            lC1 = this.m;
            f12 = ((Bo1)object4).g;
            f11 = object3 == null ? f12 : (f15 = ((Float)object3).floatValue());
            object2 = object3 = ((Bo1)object4).b;
            object2 = (Float)object3;
            object = object4 = ((Bo1)object4).c;
            object = (Float)object4;
            f8 = ((iw_0)object5).d();
            f7 = ((iw_0)object5).e();
            f6 = ((iw_0)object5).d;
            object5 = (Float)lC1.b(f12, f11, object2, object, f8, f7, f6);
        } else {
            object5 = null;
            f5 = 0.0f;
        }
        object4 = this.n;
        if (object4 != null && (object3 = ((iw_0)(object4 = this.l)).b()) != null) {
            object6 = ((Bo1)object3).h;
            lC1 = this.n;
            f12 = ((Bo1)object3).g;
            f11 = object6 == null ? f12 : (f14 = ((Float)object6).floatValue());
            object2 = object6 = ((Bo1)object3).b;
            object2 = (Float)object6;
            object = object6 = ((Bo1)object3).c;
            object = (Float)object6;
            f8 = ((iw_0)object4).d();
            f7 = ((iw_0)object4).e();
            f6 = ((iw_0)object4).d;
            object6 = (Float)lC1.b(f12, f11, object2, object, f8, f7, f6);
        }
        object4 = this.i;
        object3 = this.j;
        lC1 = null;
        if (object5 == null) {
            f5 = ((PointF)object4).x;
            object3.set(f5, 0.0f);
        } else {
            f5 = ((Float)object5).floatValue();
            object3.set(f5, 0.0f);
        }
        if (object6 == null) {
            f5 = ((PointF)object3).x;
            f14 = ((PointF)object4).y;
            object3.set(f5, f14);
        } else {
            f5 = ((PointF)object3).x;
            f14 = ((Float)object6).floatValue();
            object3.set(f5, f14);
        }
        return object3;
    }
}

