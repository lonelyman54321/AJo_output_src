/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.os.Build$VERSION
 *  android.view.DisplayListCanvas
 *  android.view.RenderNode
 *  android.view.View
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.layer.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c11
 */
public final class c11_0
implements a {
    public static final AtomicBoolean A;
    public final zl_0 b;
    public final xl_0 c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public long h;
    public int i;
    public final int j;
    public float k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        AtomicBoolean atomicBoolean;
        A = atomicBoolean = new AtomicBoolean(true);
    }

    public c11_0(View view, zl_0 object, xl_0 xl_02) {
        long l2;
        float f5;
        long l3;
        this.b = object;
        this.c = xl_02;
        view = RenderNode.create((String)"Compose", (View)view);
        this.d = view;
        this.e = l3 = 0L;
        this.h = l3;
        object = A;
        xl_02 = null;
        boolean bl2 = ((AtomicBoolean)object).getAndSet(false);
        if (bl2) {
            int n3;
            float f6 = view.getScaleX();
            view.setScaleX(f6);
            f6 = view.getScaleY();
            view.setScaleY(f6);
            f6 = view.getTranslationX();
            view.setTranslationX(f6);
            f6 = view.getTranslationY();
            view.setTranslationY(f6);
            f6 = view.getElevation();
            view.setElevation(f6);
            f6 = view.getRotation();
            view.setRotation(f6);
            f6 = view.getRotationX();
            view.setRotationX(f6);
            f6 = view.getRotationY();
            view.setRotationY(f6);
            f6 = view.getCameraDistance();
            view.setCameraDistance(f6);
            f6 = view.getPivotX();
            view.setPivotX(f6);
            f6 = view.getPivotY();
            view.setPivotY(f6);
            boolean bl3 = view.getClipToOutline();
            view.setClipToOutline(bl3);
            view.setClipToBounds(false);
            f6 = view.getAlpha();
            view.setAlpha(f6);
            view.isValid();
            view.setLeftTopRightBottom(0, 0, 0, 0);
            view.offsetLeftAndRight(0);
            view.offsetTopAndBottom(0);
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 28;
            if (n4 >= n7) {
                nJ2 nJ22 = nJ2.a;
                int n8 = nJ22.a((RenderNode)view);
                nJ22.c((RenderNode)view, n8);
                n8 = nJ22.b((RenderNode)view);
                nJ22.d((RenderNode)view, n8);
            }
            if (n4 >= (n3 = 24)) {
                object = lj2_0.a;
                ((lj2_0)object).a((RenderNode)view);
            } else {
                object = jJ2.a;
                ((jJ2)object).a((RenderNode)view);
            }
            view.setLayerType(0);
            boolean bl4 = view.hasOverlappingRendering();
            view.setHasOverlappingRendering(bl4);
        }
        view.setClipToBounds(false);
        this.L(0);
        this.i = 0;
        this.j = 3;
        this.k = f5 = 1.0f;
        this.m = f5;
        this.n = f5;
        this.r = l2 = OX$a.a();
        this.s = l2 = OX$a.a();
        this.w = 8.0f;
    }

    public final void A(Outline outline, long l2) {
        boolean bl2;
        this.h = l2;
        RenderNode renderNode = this.d;
        renderNode.setOutline(outline);
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
        Intrinsics.checkNotNull(iL2, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        iL2 = (DisplayListCanvas)iL2;
        RenderNode renderNode = this.d;
        iL2.drawRenderNode(renderNode);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void C(Vo0 vo0, bp1_0 bp1_02, W01 w01, Function1 function1) {
        Throwable throwable2222222;
        DisplayListCanvas displayListCanvas;
        c11_0 c11_02;
        block6: {
            c11_02 = this;
            Object object = this.d;
            long l2 = this.e;
            int n3 = bj1.d(l2);
            int n4 = bj1.d(this.h);
            n3 = Math.max(n3, n4);
            long l3 = this.e;
            n4 = bj1.c(l3);
            long l4 = this.h;
            int n7 = bj1.c(l4);
            n4 = Math.max(n4, n7);
            displayListCanvas = object.start(n3, n4);
            object = this.b;
            Object object2 = ((zl_0)object).a();
            object2 = ((mf_0)object2).v();
            Object object3 = ((zl_0)object).a();
            Object object4 = displayListCanvas;
            object4 = (Canvas)displayListCanvas;
            ((mf_0)object3).w((Canvas)object4);
            object3 = ((zl_0)object).a();
            object4 = this.c;
            long l7 = this.e;
            l7 = dj1.b(l7);
            Object object5 = ((xl_0)object4).M0();
            object5 = ((xL$b)object5).c();
            Object object6 = ((xl_0)object4).M0();
            object6 = object6.e();
            Object object7 = ((xl_0)object4).M0();
            object7 = ((xL$b)object7).a();
            xL$b xL$b = ((xl_0)object4).M0();
            long l8 = xL$b.l();
            Object object8 = ((xl_0)object4).M0();
            object8 = ((xL$b)object8).d();
            xL$b xL$b2 = ((xl_0)object4).M0();
            xL$b2.g(vo0);
            xL$b2.i(bp1_02);
            xL$b2.f((iL)object3);
            xL$b2.b(l7);
            xL$b2.h(w01);
            ((mf_0)object3).p();
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                try {
                    function1.invoke(object4);
                    {
                        ((mf_0)object3).h();
                        object3 = ((xl_0)object4).M0();
                        ((xL$b)object3).g((Vo0)object5);
                        ((xL$b)object3).i((bp1_0)((Object)object6));
                        ((xL$b)object3).f((iL)object7);
                        ((xL$b)object3).b(l8);
                        ((xL$b)object3).h((W01)object8);
                        object = ((zl_0)object).a();
                        ((mf_0)object).w((Canvas)object2);
                    }
                }
                catch (Throwable throwable3) {}
                this.d.end(displayListCanvas);
                return;
                object2 = throwable3;
                {
                    ((mf_0)object3).h();
                    xL$b xL$b3 = ((xl_0)object4).M0();
                    xL$b3.g((Vo0)object5);
                    xL$b3.i((bp1_0)((Object)object6));
                    xL$b3.f((iL)object7);
                    xL$b3.b(l8);
                    xL$b3.h((W01)object8);
                    throw object2;
                }
            }
        }
        c11_02.d.end(displayListCanvas);
        throw throwable2222222;
    }

    public final void D(long l2) {
        int n3 = h72.d(l2);
        if (n3 != 0) {
            boolean bl2 = true;
            float f5 = Float.MIN_VALUE;
            this.l = bl2;
            RenderNode renderNode = this.d;
            long l3 = this.e;
            float f6 = bj1.d(l3);
            n3 = 0x40000000;
            float f7 = 2.0f;
            renderNode.setPivotX(f6 /= f7);
            renderNode = this.d;
            long l4 = this.e;
            int n4 = bj1.c(l4);
            f6 = (float)n4 / f7;
            renderNode.setPivotY(f6);
        } else {
            n3 = 0;
            float f8 = 0.0f;
            this.l = false;
            RenderNode renderNode = this.d;
            float f11 = e72.d(l2);
            renderNode.setPivotX(f11);
            renderNode = this.d;
            float f12 = e72.e(l2);
            renderNode.setPivotY(f12);
        }
    }

    public final float E() {
        return this.p;
    }

    public final float F() {
        return this.o;
    }

    public final float G() {
        return this.t;
    }

    public final void H(int n3) {
        int n4;
        this.i = n3;
        int n7 = 1;
        if ((n3 = (int)(x30_0.a(n3, n7) ? 1 : 0)) == 0 && (n3 = (int)(zy_0.a(n4 = this.j, 3) ? 1 : 0)) != 0) {
            n3 = this.i;
            this.L(n3);
        } else {
            this.L(n7);
        }
    }

    public final float I() {
        return this.q;
    }

    public final float J() {
        return this.n;
    }

    public final void K() {
        RenderNode renderNode;
        boolean bl2;
        boolean bl3 = this.x;
        boolean bl4 = false;
        bl2 = bl3 && !(bl2 = this.g);
        if (bl3 && (bl3 = this.g)) {
            bl4 = true;
        }
        if (bl2 != (bl3 = this.y)) {
            this.y = bl2;
            renderNode = this.d;
            renderNode.setClipToBounds(bl2);
        }
        if (bl4 != (bl3 = this.z)) {
            this.z = bl4;
            renderNode = this.d;
            renderNode.setClipToOutline(bl4);
        }
    }

    public final void L(int n3) {
        RenderNode renderNode = this.d;
        boolean bl2 = true;
        boolean bl3 = x30_0.a(n3, (int)(bl2 ? 1 : 0));
        int n4 = 2;
        if (bl3) {
            renderNode.setLayerType(n4);
            renderNode.setLayerPaint(null);
            renderNode.setHasOverlappingRendering(bl2);
        } else {
            n3 = (int)(x30_0.a(n3, n4) ? 1 : 0);
            bl3 = false;
            if (n3 != 0) {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint(null);
                renderNode.setHasOverlappingRendering(false);
            } else {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint(null);
                renderNode.setHasOverlappingRendering(bl2);
            }
        }
    }

    public final int a() {
        return this.i;
    }

    public final void b(float f5) {
        this.k = f5;
        this.d.setAlpha(f5);
    }

    public final void c(float f5) {
        this.p = f5;
        this.d.setTranslationY(f5);
    }

    public final void d(float f5) {
        this.m = f5;
        this.d.setScaleX(f5);
    }

    public final void e(int n3, int n4, long l2) {
        RenderNode renderNode = this.d;
        int n7 = bj1.d(l2) + n3;
        int n8 = bj1.c(l2) + n4;
        renderNode.setLeftTopRightBottom(n3, n4, n7, n8);
        long l3 = this.e;
        n3 = (int)(bj1.b(l3, l2) ? 1 : 0);
        if (n3 == 0) {
            n3 = (int)(this.l ? 1 : 0);
            if (n3 != 0) {
                RenderNode renderNode2 = this.d;
                float f5 = bj1.d(l2);
                float f6 = 2.0f;
                renderNode2.setPivotX(f5 /= f6);
                renderNode2 = this.d;
                n4 = bj1.c(l2);
                f5 = (float)n4 / f6;
                renderNode2.setPivotY(f5);
            }
            this.e = l2;
        }
    }

    public final void f(float f5) {
        this.w = f5;
        RenderNode renderNode = this.d;
        f5 = -f5;
        renderNode.setCameraDistance(f5);
    }

    public final void g(float f5) {
        this.t = f5;
        this.d.setRotationX(f5);
    }

    public final float getAlpha() {
        return this.k;
    }

    public final void h(float f5) {
        this.u = f5;
        this.d.setRotationY(f5);
    }

    public final void i() {
    }

    public final void j(float f5) {
        this.v = f5;
        this.d.setRotation(f5);
    }

    public final void k(float f5) {
        this.n = f5;
        this.d.setScaleY(f5);
    }

    public final float l() {
        return this.u;
    }

    public final void m(float f5) {
        this.o = f5;
        this.d.setTranslationX(f5);
    }

    public final void n() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            lj2_0 lj2_02 = lj2_0.a;
            RenderNode renderNode = this.d;
            lj2_02.a(renderNode);
        } else {
            jJ2 jJ22 = jJ2.a;
            RenderNode renderNode = this.d;
            jJ22.a(renderNode);
        }
    }

    public final float o() {
        return this.v;
    }

    public final boolean p() {
        return this.d.isValid();
    }

    public final void q(long l2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            this.r = l2;
            nJ2 nJ22 = nJ2.a;
            RenderNode renderNode = this.d;
            int n7 = zx_0.i(l2);
            nJ22.c(renderNode, n7);
        }
    }

    public final void r(boolean bl2) {
        this.x = bl2;
        this.K();
    }

    public final void s(long l2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            this.s = l2;
            nJ2 nJ22 = nJ2.a;
            RenderNode renderNode = this.d;
            int n7 = zx_0.i(l2);
            nJ22.d(renderNode, n7);
        }
    }

    public final void t(float f5) {
        this.q = f5;
        this.d.setElevation(f5);
    }

    public final long u() {
        return this.r;
    }

    public final long v() {
        return this.s;
    }

    public final float w() {
        return this.w;
    }

    public final Matrix x() {
        Matrix matrix = this.f;
        if (matrix == null) {
            this.f = matrix = new Matrix();
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    public final int y() {
        return this.j;
    }

    public final float z() {
        return this.m;
    }
}

