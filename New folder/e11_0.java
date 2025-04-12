/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.Picture
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.layer.ViewLayer;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from E11
 */
public final class e11_0
implements a {
    public static final boolean D;
    public static final Canvas E;
    public float A;
    public float B;
    public float C;
    public final DrawChildContainer b;
    public final zl_0 c;
    public final ViewLayer d;
    public final Resources e;
    public final Rect f;
    public final Picture g;
    public final xl_0 h;
    public final zl_0 i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final int p;
    public int q;
    public float r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    static {
        Object object = kg3_0.a;
        D = object.a() ^ true;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            object = new Canvas();
        } else {
            object = new Ss2();
            object = (Canvas)object;
        }
        E = object;
    }

    public e11_0(DrawChildContainer drawChildContainer) {
        long l2;
        float f5;
        ViewLayer viewLayer;
        zl_0 zl_02 = new zl_0();
        Object object = new xl_0();
        this.b = drawChildContainer;
        this.c = zl_02;
        this.d = viewLayer = new ViewLayer((View)drawChildContainer, zl_02, (xl_0)object);
        zl_02 = drawChildContainer.getResources();
        this.e = zl_02;
        this.f = zl_02;
        zl_02 = null;
        boolean bl2 = D;
        Object object2 = bl2 ? new Picture() : null;
        this.g = object2;
        if (bl2) {
            super();
        } else {
            object2 = null;
        }
        this.h = object2;
        if (bl2) {
            object = new zl_0();
        } else {
            bl2 = false;
            object = null;
        }
        this.i = object;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.l = 0L;
        View.generateViewId();
        this.p = 3;
        this.q = 0;
        this.r = f5 = 1.0f;
        this.t = f5;
        this.u = f5;
        this.y = l2 = OX.b;
        this.z = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void A(Outline object, long l2) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object2;
        block18: {
            ViewLayer viewLayer;
            block17: {
                Throwable throwable2;
                block16: {
                    viewLayer = this.d;
                    viewLayer.e = object;
                    object2 = eg2_0.a;
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 22;
                    bl4 = false;
                    bl3 = true;
                    if (n3 >= n4) {
                        viewLayer.invalidateOutline();
                    } else {
                        Object object3;
                        block15: {
                            block14: {
                                try {
                                    n3 = (int)(eg2_0.c ? 1 : 0);
                                    n4 = 0;
                                    if (n3 != 0) break block14;
                                    eg2_0.c = bl3;
                                    object3 = View.class;
                                    Object object4 = "rebuildOutline";
                                    if ((object3 = ((Class)object3).getDeclaredMethod((String)object4, null)) != null) {
                                        ((AccessibleObject)object3).setAccessible(bl3);
                                        eg2_0.b = object3;
                                        object4 = Unit.a;
                                    }
                                    break block15;
                                }
                                catch (Throwable throwable2) {
                                    break block16;
                                }
                            }
                            object3 = eg2_0.b;
                            Unit unit = Unit.a;
                        }
                        // MONITOREXIT : object2
                        if (object3 != null) {
                            ((Method)object3).invoke((Object)viewLayer, null);
                        }
                        if (object3 == null) break block17;
                    }
                    bl2 = true;
                    break block18;
                }
                try {
                    // MONITOREXIT : object2
                    throw throwable2;
                }
                catch (Throwable throwable3) {}
            }
            bl2 = false;
            viewLayer = null;
        }
        bl2 ^= bl3;
        boolean bl5 = this.L();
        if (bl5 && object != null) {
            object2 = this.d;
            object2.setClipToOutline(bl3);
            bl5 = this.o;
            if (bl5) {
                this.o = false;
                this.m = bl3;
            }
        }
        if (object != null) {
            bl4 = true;
        }
        this.n = bl4;
        if (!bl2) return;
        object = this.d;
        ((ViewLayer)((Object)object)).invalidate();
        this.M();
    }

    public final void B(iL iL2) {
        int n3;
        Object object;
        boolean bl2 = this.m;
        ViewLayer viewLayer = this.d;
        if (bl2) {
            bl2 = this.L();
            if (bl2 && !(bl2 = this.n)) {
                object = this.f;
                ((Rect)object).left = 0;
                ((Rect)object).top = 0;
                ((Rect)object).right = n3 = viewLayer.getWidth();
                ((Rect)object).bottom = n3 = viewLayer.getHeight();
            } else {
                bl2 = false;
                object = null;
            }
            viewLayer.setClipBounds((Rect)object);
        }
        if ((n3 = (object = Nf.a(iL2)).isHardwareAccelerated()) != 0) {
            object = this.b;
            long l2 = viewLayer.getDrawingTime();
            ((DrawChildContainer)((Object)object)).a(iL2, viewLayer, l2);
        } else {
            iL2 = this.g;
            if (iL2 != null) {
                object.drawPicture((Picture)iL2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void C(Vo0 object, bp1_0 bp1_02, W01 w01, Function1 function1) {
        Throwable throwable2;
        block6: {
            block5: {
                Object object2 = this.d;
                Object object3 = object2.getParent();
                if (object3 == null) {
                    object3 = this.b;
                    object3.addView((View)object2);
                }
                object2.setDrawParams((Vo0)object, bp1_02, w01, function1);
                boolean bl2 = object2.isAttachedToWindow();
                if (!bl2) return;
                object2.setVisibility(4);
                bl2 = false;
                object2.setVisibility(0);
                this.M();
                w01 = this.g;
                if (w01 == null) return;
                long l2 = this.l;
                int n3 = 32;
                long l3 = l2 >> n3;
                int n4 = (int)l3;
                long l4 = 0xFFFFFFFFL;
                int n7 = (int)(l2 &= l4);
                object2 = w01.beginRecording(n4, n7);
                try {
                    object3 = this.i;
                    if (object3 == null) break block5;
                    object3 = ((zl_0)object3).a;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                Canvas canvas = ((mf_0)object3).a;
                ((mf_0)object3).a = object2;
                object2 = this.h;
                if (object2 != null) {
                    xL$a xL$a = ((xl_0)object2).a;
                    l4 = this.l;
                    l4 = dj1.b(l4);
                    Vo0 vo0 = xL$a.a;
                    bp1_0 bp1_03 = xL$a.b;
                    iL iL2 = xL$a.c;
                    long l7 = xL$a.d;
                    xL$a.a = object;
                    xL$a.b = bp1_02;
                    xL$a.c = object3;
                    xL$a.d = l4;
                    ((mf_0)object3).p();
                    function1.invoke(object2);
                    ((mf_0)object3).h();
                    xL$a.a = vo0;
                    xL$a.b = bp1_03;
                    xL$a.c = iL2;
                    xL$a.d = l7;
                }
                ((mf_0)object3).a = canvas;
                object = Unit.a;
            }
            w01.endRecording();
            return;
        }
        w01.endRecording();
        throw throwable2;
    }

    public final void D(long l2) {
        int n3 = h72.d(l2);
        ViewLayer viewLayer = this.d;
        if (n3 != 0) {
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 28;
            float f5 = 3.9E-44f;
            if (n4 >= n7) {
                Dm0.b(viewLayer);
            } else {
                this.s = true;
                l2 = this.l;
                n3 = 32;
                float f6 = 4.5E-44f;
                float f7 = (int)(l2 >>= n3);
                n7 = 0x40000000;
                f5 = 2.0f;
                viewLayer.setPivotX(f7 /= f5);
                long l3 = this.l;
                long l4 = 0xFFFFFFFFL;
                n4 = (int)(l3 &= l4);
                f7 = (float)n4 / f5;
                viewLayer.setPivotY(f7);
            }
        } else {
            n3 = 0;
            this.s = false;
            float f8 = e72.d(l2);
            viewLayer.setPivotX(f8);
            float f11 = e72.e(l2);
            viewLayer.setPivotY(f11);
        }
    }

    public final float E() {
        return this.w;
    }

    public final float F() {
        return this.v;
    }

    public final float G() {
        return this.A;
    }

    public final void H(int n3) {
        int n4;
        this.q = n3;
        int n7 = 1;
        if ((n3 = (int)(x30_0.a(n3, n7) ? 1 : 0)) == 0 && (n3 = zy_0.a(n4 = this.p, 3) ^ n7) == 0) {
            n3 = this.q;
            this.K(n3);
        } else {
            this.K(n7);
        }
    }

    public final float I() {
        return this.x;
    }

    public final float J() {
        return this.u;
    }

    public final void K(int n3) {
        boolean bl2 = true;
        boolean bl3 = x30_0.a(n3, (int)(bl2 ? 1 : 0));
        int n4 = 2;
        ViewLayer viewLayer = this.d;
        if (bl3) {
            viewLayer.setLayerType(n4, null);
        } else {
            n3 = (int)(x30_0.a(n3, n4) ? 1 : 0);
            bl3 = false;
            if (n3 != 0) {
                viewLayer.setLayerType(0, null);
                bl2 = false;
            } else {
                viewLayer.setLayerType(0, null);
            }
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(bl2);
    }

    public final boolean L() {
        ViewLayer viewLayer;
        boolean bl2 = this.o;
        if (!bl2 && !(bl2 = (viewLayer = this.d).getClipToOutline())) {
            bl2 = false;
            viewLayer = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void M() {
        Object object;
        try {
            object = this.c;
        }
        catch (Throwable throwable) {
            return;
        }
        Object object2 = E;
        mf_0 mf_02 = ((zl_0)object).a;
        Canvas canvas = mf_02.a;
        mf_02.a = object2;
        object2 = this.b;
        ViewLayer viewLayer = this.d;
        long l2 = viewLayer.getDrawingTime();
        ((DrawChildContainer)((Object)object2)).a(mf_02, viewLayer, l2);
        object = ((zl_0)object).a;
        ((mf_0)object).a = canvas;
    }

    public final int a() {
        return this.q;
    }

    public final void b(float f5) {
        this.r = f5;
        this.d.setAlpha(f5);
    }

    public final void c(float f5) {
        this.w = f5;
        this.d.setTranslationY(f5);
    }

    public final void d(float f5) {
        this.t = f5;
        this.d.setScaleX(f5);
    }

    public final void e(int n3, int n4, long l2) {
        long l3 = this.l;
        int n7 = bj1.b(l3, l2);
        ViewLayer viewLayer = this.d;
        if (n7 == 0) {
            n7 = this.L();
            if (n7 != 0) {
                this.m = n7 = 1;
            }
            long l4 = l2 >> 32;
            n7 = (int)l4;
            int n8 = n3 + n7;
            long l7 = 0xFFFFFFFFL & l2;
            int n10 = (int)l7;
            int n14 = n4 + n10;
            viewLayer.layout(n3, n4, n8, n14);
            this.l = l2;
            boolean bl2 = this.s;
            if (bl2) {
                float f5 = n7;
                float f6 = 2.0f;
                viewLayer.setPivotX(f5 /= f6);
                f5 = (float)n10 / f6;
                viewLayer.setPivotY(f5);
            }
        } else {
            int n15 = this.j;
            if (n15 != n3) {
                n15 = n3 - n15;
                viewLayer.offsetLeftAndRight(n15);
            }
            if ((n15 = this.k) != n4) {
                n15 = n4 - n15;
                viewLayer.offsetTopAndBottom(n15);
            }
        }
        this.j = n3;
        this.k = n4;
    }

    public final void f(float f5) {
        float f6 = this.e.getDisplayMetrics().densityDpi;
        this.d.setCameraDistance(f5 *= f6);
    }

    public final void g(float f5) {
        this.A = f5;
        this.d.setRotationX(f5);
    }

    public final float getAlpha() {
        return this.r;
    }

    public final void h(float f5) {
        this.B = f5;
        this.d.setRotationY(f5);
    }

    public final void i() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            ViewLayer viewLayer = this.d;
            hd3_0.a(viewLayer);
        }
    }

    public final void j(float f5) {
        this.C = f5;
        this.d.setRotation(f5);
    }

    public final void k(float f5) {
        this.u = f5;
        this.d.setScaleY(f5);
    }

    public final float l() {
        return this.B;
    }

    public final void m(float f5) {
        this.v = f5;
        this.d.setTranslationX(f5);
    }

    public final void n() {
        DrawChildContainer drawChildContainer = this.b;
        ViewLayer viewLayer = this.d;
        drawChildContainer.removeViewInLayout(viewLayer);
    }

    public final float o() {
        return this.C;
    }

    public final /* synthetic */ boolean p() {
        return true;
    }

    public final void q(long l2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            this.y = l2;
            int n7 = zx_0.i(l2);
            ViewLayer viewLayer = this.d;
            fD3.a(n7, viewLayer);
        }
    }

    public final void r(boolean bl2) {
        boolean bl3;
        boolean bl4 = false;
        boolean bl5 = true;
        bl3 = bl2 && !(bl3 = this.n);
        this.o = bl3;
        this.m = bl5;
        if (bl2 && (bl2 = this.n)) {
            bl4 = true;
        }
        this.d.setClipToOutline(bl4);
    }

    public final void s(long l2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            this.z = l2;
            int n7 = zx_0.i(l2);
            ViewLayer viewLayer = this.d;
            Cm0.a(n7, viewLayer);
        }
    }

    public final void t(float f5) {
        this.x = f5;
        this.d.setElevation(f5);
    }

    public final long u() {
        return this.y;
    }

    public final long v() {
        return this.z;
    }

    public final float w() {
        float f5 = this.d.getCameraDistance();
        float f6 = this.e.getDisplayMetrics().densityDpi;
        return f5 / f6;
    }

    public final Matrix x() {
        return this.d.getMatrix();
    }

    public final int y() {
        return this.p;
    }

    public final float z() {
        return this.t;
    }
}

