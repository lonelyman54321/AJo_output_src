/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.RecordingCanvas
 *  android.graphics.RenderNode
 *  android.os.Build$VERSION
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

public final class eJ2
implements Pp0 {
    public final RenderNode a;

    public eJ2() {
        RenderNode renderNode;
        this.a = renderNode = pu0_2.a();
    }

    public final void A(int n3) {
        qu0_0.b(this.a, n3);
    }

    public final void B(float f5) {
        s11_0.a(this.a, f5);
    }

    public final void C(float f5) {
        t11.a(this.a, f5);
    }

    public final void D(Outline outline) {
        i11.a(this.a, outline);
    }

    public final void E(int n3) {
        w11.a(this.a, n3);
    }

    public final void F(boolean bl2) {
        e11.a(this.a, bl2);
    }

    public final void G(int n3) {
        B11.a(this.a, n3);
    }

    public final float H() {
        return dJ2.a(this.a);
    }

    public final void b(float f5) {
        g11_0.a(this.a, f5);
    }

    public final void c(float f5) {
        Gh.b(this.a, f5);
    }

    public final void d(float f5) {
        j11_0.a(this.a, f5);
    }

    public final void f(float f5) {
        u11.a(this.a, f5);
    }

    public final void g(float f5) {
        q11_0.a(this.a, f5);
    }

    public final float getAlpha() {
        return XI2.a(this.a);
    }

    public final int getBottom() {
        return su0_0.b(this.a);
    }

    public final int getHeight() {
        return aJ2.a(this.a);
    }

    public final int getLeft() {
        return bj2_0.a(this.a);
    }

    public final int getRight() {
        return ou0_1.b(this.a);
    }

    public final int getTop() {
        return mu0_0.b(this.a);
    }

    public final int getWidth() {
        return tu0_2.a(this.a);
    }

    public final void h(float f5) {
        y11.a(this.a, f5);
    }

    public final void i() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            fJ2 fJ22 = fJ2.a;
            RenderNode renderNode = this.a;
            fJ22.a(renderNode, null);
        }
    }

    public final void j(float f5) {
        z11.b(this.a, f5);
    }

    public final void k(float f5) {
        d11.a(this.a, f5);
    }

    public final void m(float f5) {
        x11.a(this.a, f5);
    }

    public final void n() {
        k11.a(this.a);
    }

    public final void o(int n3) {
        RenderNode renderNode = this.a;
        int n4 = y30_0.a(n3, 1);
        if (n4 != 0) {
            l11.a(renderNode);
            m11_0.a(renderNode);
        } else {
            n4 = 2;
            if ((n3 = (int)(y30_0.a(n3, n4) ? 1 : 0)) != 0) {
                n11.a(renderNode);
                p11.a(renderNode);
            } else {
                n11.a(renderNode);
                m11_0.a(renderNode);
            }
        }
    }

    public final boolean p() {
        return f11_0.a(this.a);
    }

    public final void q(Canvas canvas) {
        RenderNode renderNode = this.a;
        ot0_0.a(canvas, renderNode);
    }

    public final void r(boolean bl2) {
        C11.a(this.a, bl2);
    }

    public final boolean s(int n3, int n4, int n7, int n8) {
        return WI2.a(this.a, n3, n4, n7, n8);
    }

    public final void t(float f5) {
        o11_0.a(this.a, f5);
    }

    public final void u(int n3) {
        YI2.a(this.a, n3);
    }

    public final boolean v() {
        return ru0_2.b(this.a);
    }

    public final boolean w() {
        return ZI2.a(this.a);
    }

    public final void x(zl_0 zl_02, gn2 gn22, gJ2$b gJ2$b) {
        RecordingCanvas recordingCanvas = FJ.a(this.a);
        mf_0 mf_02 = zl_02.a;
        Canvas canvas = mf_02.a;
        mf_02.a = recordingCanvas;
        if (gn22 != null) {
            mf_02.p();
            int n3 = 1;
            mf_02.o(gn22, n3);
        }
        gJ2$b.invoke(mf_02);
        if (gn22 != null) {
            mf_02.h();
        }
        zl_02.a.a = canvas;
        Nt0.a(this.a);
    }

    public final boolean y() {
        return cJ2.a(this.a);
    }

    public final void z(Matrix matrix) {
        h11_0.a(this.a, matrix);
    }
}

