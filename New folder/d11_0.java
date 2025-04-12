/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.RenderNode
 *  android.os.Build$VERSION
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from D11
 */
public final class d11_0
implements a {
    public final zl_0 b;
    public final xl_0 c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public float h;
    public final int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public long o;
    public long p;
    public float q;
    public float r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;

    public d11_0() {
        long l2;
        float f5;
        zl_0 zl_02 = new zl_0();
        xl_0 xl_02 = new xl_0();
        this.b = zl_02;
        this.c = xl_02;
        zl_02 = v11.a();
        this.d = zl_02;
        this.e = 0L;
        G20.b((RenderNode)zl_02);
        d11_0.L((RenderNode)zl_02, 0);
        this.h = f5 = 1.0f;
        this.i = 3;
        this.j = f5;
        this.k = f5;
        this.o = l2 = OX.b;
        this.p = l2;
        this.t = 8.0f;
        this.x = 0;
    }

    public static void L(RenderNode renderNode, int n3) {
        int n4 = x30_0.a(n3, 1);
        if (n4 != 0) {
            l11.a(renderNode);
            m11_0.a(renderNode);
        } else {
            n4 = 2;
            if ((n3 = (int)(x30_0.a(n3, n4) ? 1 : 0)) != 0) {
                n11.a(renderNode);
                p11.a(renderNode);
            } else {
                n11.a(renderNode);
                m11_0.a(renderNode);
            }
        }
    }

    public final void A(Outline outline, long l2) {
        boolean bl2;
        RenderNode renderNode = this.d;
        i11.a(renderNode, outline);
        if (outline != null) {
            bl2 = true;
        } else {
            bl2 = false;
            outline = null;
        }
        this.g = bl2;
        this.K();
    }

    public final void B(iL iL2) {
        iL2 = Nf.a(iL2);
        RenderNode renderNode = this.d;
        ot0_0.a((Canvas)iL2, renderNode);
    }

    public final void C(Vo0 object, bp1_0 bp1_02, W01 w01, Function1 function1) {
        xl_0 xl_02 = this.c;
        Object object2 = FJ.a(this.d);
        try {
            zl_0 zl_02 = this.b;
            mf_0 mf_02 = zl_02.a;
            Canvas canvas = mf_02.a;
            mf_02.a = object2;
            object2 = xl_02.b;
            ((xL$b)object2).g((Vo0)object);
            ((xL$b)object2).i(bp1_02);
            ((xL$b)object2).b = w01;
            long l2 = this.e;
            ((xL$b)object2).b(l2);
            ((xL$b)object2).f(mf_02);
            function1.invoke(xl_02);
            object = zl_02.a;
            ((mf_0)object).a = canvas;
            return;
        }
        finally {
            Nt0.a(this.d);
        }
    }

    public final void D(long l2) {
        boolean bl2 = h72.d(l2);
        if (bl2) {
            RenderNode renderNode = this.d;
            r11_0.a(renderNode);
        } else {
            RenderNode renderNode = this.d;
            float f5 = e72.d(l2);
            s11_0.a(renderNode, f5);
            renderNode = this.d;
            float f6 = e72.e(l2);
            t11.a(renderNode, f6);
        }
    }

    public final float E() {
        return this.m;
    }

    public final float F() {
        return this.l;
    }

    public final float G() {
        return this.q;
    }

    public final void H(int n3) {
        int n4;
        this.x = n3;
        int n7 = 1;
        if ((n3 = (int)(x30_0.a(n3, n7) ? 1 : 0)) == 0 && (n3 = zy_0.a(n4 = this.i, 3) ^ n7) == 0) {
            RenderNode renderNode = this.d;
            n7 = this.x;
            d11_0.L(renderNode, n7);
        } else {
            RenderNode renderNode = this.d;
            d11_0.L(renderNode, n7);
        }
    }

    public final float I() {
        return this.n;
    }

    public final float J() {
        return this.k;
    }

    public final void K() {
        RenderNode renderNode;
        boolean bl2;
        boolean bl3 = this.u;
        boolean bl4 = false;
        bl2 = bl3 && !(bl2 = this.g);
        if (bl3 && (bl3 = this.g)) {
            bl4 = true;
        }
        if (bl2 != (bl3 = this.v)) {
            this.v = bl2;
            renderNode = this.d;
            C11.a(renderNode, bl2);
        }
        if (bl4 != (bl3 = this.w)) {
            this.w = bl4;
            renderNode = this.d;
            e11.a(renderNode, bl4);
        }
    }

    public final int a() {
        return this.x;
    }

    public final void b(float f5) {
        this.h = f5;
        g11_0.a(this.d, f5);
    }

    public final void c(float f5) {
        this.m = f5;
        Gh.b(this.d, f5);
    }

    public final void d(float f5) {
        this.j = f5;
        j11_0.a(this.d, f5);
    }

    public final void e(int n3, int n4, long l2) {
        long l3;
        RenderNode renderNode = this.d;
        int n7 = (int)(l2 >> 32) + n3;
        int n8 = (int)(0xFFFFFFFFL & l2) + n4;
        A11.a(renderNode, n3, n4, n7, n8);
        this.e = l3 = dj1.b(l2);
    }

    public final void f(float f5) {
        this.t = f5;
        u11.a(this.d, f5);
    }

    public final void g(float f5) {
        this.q = f5;
        q11_0.a(this.d, f5);
    }

    public final float getAlpha() {
        return this.h;
    }

    public final void h(float f5) {
        this.r = f5;
        y11.a(this.d, f5);
    }

    public final void i() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            oj2_0 oj2_02 = oj2_0.a;
            RenderNode renderNode = this.d;
            oj2_02.a(renderNode, null);
        }
    }

    public final void j(float f5) {
        this.s = f5;
        z11.b(this.d, f5);
    }

    public final void k(float f5) {
        this.k = f5;
        d11.a(this.d, f5);
    }

    public final float l() {
        return this.r;
    }

    public final void m(float f5) {
        this.l = f5;
        x11.a(this.d, f5);
    }

    public final void n() {
        k11.a(this.d);
    }

    public final float o() {
        return this.s;
    }

    public final boolean p() {
        return f11_0.a(this.d);
    }

    public final void q(long l2) {
        this.o = l2;
        RenderNode renderNode = this.d;
        int n3 = zx_0.i(l2);
        w11.a(renderNode, n3);
    }

    public final void r(boolean bl2) {
        this.u = bl2;
        this.K();
    }

    public final void s(long l2) {
        this.p = l2;
        RenderNode renderNode = this.d;
        int n3 = zx_0.i(l2);
        B11.a(renderNode, n3);
    }

    public final void t(float f5) {
        this.n = f5;
        o11_0.a(this.d, f5);
    }

    public final long u() {
        return this.o;
    }

    public final long v() {
        return this.p;
    }

    public final float w() {
        return this.t;
    }

    public final Matrix x() {
        Matrix matrix = this.f;
        if (matrix == null) {
            this.f = matrix = new Matrix();
        }
        h11_0.a(this.d, matrix);
        return matrix;
    }

    public final int y() {
        return this.i;
    }

    public final float z() {
        return this.j;
    }
}

