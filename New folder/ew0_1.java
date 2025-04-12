/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Matrix
 */
import android.graphics.Color;
import android.graphics.Matrix;

/*
 * Renamed from ew0
 */
public final class ew0_1
implements iw$a {
    public final kw_1 a;
    public final iw$a b;
    public final WX c;
    public final es0_0 d;
    public final es0_0 e;
    public final es0_0 f;
    public final es0_0 g;
    public Matrix h;

    public ew0_1(iw$a object, kw_1 kw_12, cw0_1 cw0_12) {
        this.b = object;
        this.a = kw_12;
        Object object2 = object = cw0_12.a.a();
        this.c = object2 = (WX)object;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        this.d = object = cw0_12.b.d();
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        this.e = object = cw0_12.c.d();
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        this.f = object = cw0_12.d.d();
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        this.g = object = cw0_12.e.d();
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
    }

    public final void a() {
        this.b.a();
    }

    public final bw0_0 b(Matrix matrix, int n3) {
        es0_0 es0_02 = this.e;
        float f5 = es0_02.m() * ((float)Math.PI / 180);
        float f6 = ((Float)this.f.f()).floatValue();
        double d2 = f5;
        f5 = (float)Math.sin(d2) * f6;
        double d5 = Math.PI;
        d2 = Math.cos(d2 + d5);
        float f7 = (float)d2 * f6;
        Float f8 = (Float)this.g.f();
        f6 = f8.floatValue();
        int n4 = (Integer)this.c.f();
        Float f11 = (Float)this.d.f();
        float f12 = f11.floatValue();
        float f14 = n3;
        n3 = Math.round(f12 * f14 / 255.0f);
        int n7 = Color.red((int)n4);
        int n8 = Color.green((int)n4);
        n4 = Color.blue((int)n4);
        n3 = Color.argb((int)n3, (int)n7, (int)n8, (int)n4);
        n7 = 1051260355;
        f12 = 0.33f;
        bw0_0 bw0_02 = new Object();
        bw0_02.a = f6 *= f12;
        bw0_02.b = f5;
        bw0_02.c = f7;
        bw0_02.d = n3;
        n3 = 0;
        f14 = 0.0f;
        Matrix matrix2 = null;
        bw0_02.e = null;
        bw0_02.c(matrix);
        matrix = this.h;
        if (matrix == null) {
            this.h = matrix = new Matrix();
        }
        matrix = this.a.w.e();
        matrix2 = this.h;
        matrix.invert(matrix2);
        matrix = this.h;
        bw0_02.c(matrix);
        return bw0_02;
    }

    public final void c(LC1 lC1) {
        es0_0 es0_02 = this.d;
        if (lC1 == null) {
            es0_02.k(null);
            return;
        }
        ew0$a_0 ew0$a_0 = new ew0$a_0(lC1);
        es0_02.k(ew0$a_0);
    }
}

