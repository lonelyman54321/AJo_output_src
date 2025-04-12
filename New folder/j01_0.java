/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.PointF
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 */
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from J01
 */
public final class j01_0
extends Fw {
    public la3_0 A;
    public final String q;
    public final boolean r;
    public final pb1_0 s;
    public final pb1_0 t;
    public final RectF u;
    public final L01 v;
    public final int w;
    public final D01 x;
    public final lv2_1 y;
    public final lv2_1 z;

    public j01_0(yc1_1 object, kw_1 kw_12, i01_0 object2) {
        int n3;
        boolean bl2;
        Paint.Cap cap = ((i01_0)object2).h.toPaintCap();
        Paint.Join join = ((i01_0)object2).i.toPaintJoin();
        oj_1 oj_12 = ((i01_0)object2).l;
        Object object3 = ((i01_0)object2).k;
        List list = object3;
        list = (ArrayList)object3;
        float f5 = ((i01_0)object2).j;
        qj_0 qj_02 = ((i01_0)object2).d;
        oj_1 oj_13 = ((i01_0)object2).g;
        super((yc1_1)((Object)object), kw_12, cap, join, f5, qj_02, oj_13, (ArrayList)list, oj_12);
        this.s = object3 = new pb1_0();
        this.t = object3 = new pb1_0();
        object3 = new RectF();
        this.u = object3;
        this.q = object3 = ((i01_0)object2).a;
        object3 = ((i01_0)object2).b;
        this.v = object3;
        this.r = bl2 = ((i01_0)object2).m;
        this.w = n3 = (int)(((yc1_1)((Object)object)).a.b() / 32.0f);
        object3 = object = ((i01_0)object2).c.a();
        object3 = (D01)object;
        this.x = object3;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        object3 = object = ((i01_0)object2).e.a();
        object3 = (lv2_1)object;
        this.y = object3;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        object2 = object = ((i01_0)object2).f.a();
        this.z = object2 = (lv2_1)object;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
    }

    public final int[] g(int[] nArray) {
        block4: {
            int n3;
            Integer[] integerArray = this.A;
            if (integerArray == null) break block4;
            integerArray = (Integer[])integerArray.f();
            int n4 = nArray.length;
            int n7 = integerArray.length;
            if (n4 == n7) {
                for (n3 = 0; n3 < (n4 = nArray.length); ++n3) {
                    Integer n8 = integerArray[n3];
                    nArray[n3] = n4 = n8.intValue();
                }
            } else {
                int n10 = integerArray.length;
                nArray = new int[n10];
                while (n3 < (n4 = integerArray.length)) {
                    Integer n14 = integerArray[n3];
                    nArray[n3] = n4 = n14.intValue();
                    ++n3;
                }
            }
        }
        return nArray;
    }

    public final String getName() {
        return this.q;
    }

    public final void h(LC1 object, Object object2) {
        super.h((LC1)object, object2);
        Object object3 = GC1.G;
        if (object2 == object3) {
            object2 = this.A;
            object3 = this.f;
            if (object2 != null) {
                ((kw_1)object3).p((iw_0)object2);
            }
            object2 = null;
            if (object == null) {
                this.A = null;
            } else {
                la3_0 la3_02;
                this.A = la3_02 = new la3_0((LC1)object, null);
                la3_02.a(this);
                object = this.A;
                ((kw_1)object3).g((iw_0)object);
            }
        }
    }

    public final void i(Canvas canvas, Matrix matrix, int n3, bw0_0 bw0_02) {
        Object object;
        j01_0 j01_02 = this;
        int n4 = this.r;
        if (n4 != 0) {
            return;
        }
        Object object2 = this.u;
        this.f((RectF)object2, matrix, false);
        object2 = L01.LINEAR;
        L01 l01 = this.v;
        Object object3 = this.x;
        lv2_1 lv2_12 = this.z;
        lv2_1 lv2_13 = this.y;
        if (l01 == object2) {
            pb1_0 pb1_02 = this.s;
            n4 = this.j();
            long l2 = n4;
            object = (LinearGradient)pb1_02.f(l2);
            if (object == null) {
                lv2_13 = (PointF)lv2_13.f();
                lv2_12 = (PointF)lv2_12.f();
                object3 = (B01)((iw_0)object3).f();
                object = ((B01)object3).b;
                int[] nArray = this.g((int[])object);
                float f5 = ((PointF)lv2_13).x;
                float f6 = ((PointF)lv2_13).y;
                float f7 = ((PointF)lv2_12).x;
                float f8 = ((PointF)lv2_12).y;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                float[] fArray = ((B01)object3).a;
                object = new LinearGradient(f5, f6, f7, f8, nArray, fArray, tileMode);
                pb1_02.l(l2, object);
            }
        } else {
            pb1_0 pb1_03 = this.t;
            n4 = this.j();
            long l3 = n4;
            object = (RadialGradient)pb1_03.f(l3);
            if (object == null) {
                lv2_13 = (PointF)lv2_13.f();
                lv2_12 = (PointF)lv2_12.f();
                object3 = (B01)((iw_0)object3).f();
                object = ((B01)object3).b;
                int[] nArray = this.g((int[])object);
                float f11 = ((PointF)lv2_13).x;
                float f12 = ((PointF)lv2_13).y;
                float f14 = ((PointF)lv2_12).x;
                float f15 = ((PointF)lv2_12).y;
                double d2 = f14 -= f11;
                double d5 = f15 -= f12;
                d5 = Math.hypot(d2, d5);
                float f16 = (float)d5;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                float[] fArray = ((B01)object3).a;
                lv2_12 = new RadialGradient(f11, f12, f16, nArray, fArray, tileMode);
                pb1_03.l(l3, lv2_12);
                object = lv2_12;
            }
        }
        j01_02.i.setShader((Shader)object);
        super.i(canvas, matrix, n3, bw0_02);
    }

    public final int j() {
        int n3;
        lv2_1 lv2_12 = this.y;
        float f5 = lv2_12.d;
        float f6 = this.w;
        int n4 = Math.round(f5 *= f6);
        lv2_1 lv2_13 = this.z;
        float f7 = lv2_13.d * f6;
        int n7 = Math.round(f7);
        D01 d01 = this.x;
        float f8 = d01.d * f6;
        int n8 = Math.round(f8);
        if (n4 != 0) {
            f8 = 7.38E-43f;
            n3 = 527 * n4;
        } else {
            n3 = 17;
            f8 = 2.4E-44f;
        }
        if (n7 != 0) {
            n3 = n3 * 31 * n7;
        }
        if (n8 != 0) {
            n3 = n3 * 31 * n8;
        }
        return n3;
    }
}

