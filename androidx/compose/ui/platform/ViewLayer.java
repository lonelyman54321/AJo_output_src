/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.DrawChildContainer;
import androidx.compose.ui.platform.ViewLayer$a;
import androidx.compose.ui.platform.ViewLayer$b;
import androidx.compose.ui.platform.ViewLayer$c;
import androidx.compose.ui.platform.ViewLayer$d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ViewLayer
extends View
implements Qg2 {
    public static final ViewLayer$b p;
    public static final ViewLayer$a q;
    public static Method r;
    public static Field s;
    public static boolean t;
    public static boolean u;
    public final AndroidComposeView a;
    public final DrawChildContainer b;
    public Function2 c;
    public Function0 d;
    public final dg2_0 e;
    public boolean f;
    public Rect g;
    public boolean h;
    public boolean i;
    public final zl_0 j;
    public final rp1 k;
    public long l;
    public boolean m;
    public final long n;
    public int o;

    static {
        ViewLayer$a viewLayer$a;
        p = ViewLayer$b.c;
        q = viewLayer$a = new ViewOutlineProvider();
    }

    public ViewLayer(AndroidComposeView object, DrawChildContainer drawChildContainer, Function2 function2, Function0 function0) {
        long l2;
        long l3;
        Context context = object.getContext();
        super(context);
        this.a = object;
        this.b = drawChildContainer;
        this.c = function2;
        this.d = function0;
        this.e = object = new dg2_0();
        this.j = object = new zl_0();
        function2 = p;
        this.k = object = new rp1(function2);
        this.l = l3 = Oq3.b;
        this.m = true;
        this.setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.n = l2 = (long)View.generateViewId();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final gn2 getManualClipPath() {
        boolean bl2 = this.getClipToOutline();
        if (!bl2) return null;
        dg2_0 dg2_02 = this.e;
        boolean bl3 = dg2_02.g ^ true;
        if (bl3) return null;
        dg2_02.d();
        return dg2_02.e;
    }

    private final void setInvalidated(boolean bl2) {
        boolean bl3 = this.h;
        if (bl2 != bl3) {
            this.h = bl2;
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.Q(this, bl2);
        }
    }

    public final void a(float[] fArray) {
        float[] fArray2 = this.k.b(this);
        QK1.g(fArray, fArray2);
    }

    public final void b(MR1 mR1, boolean bl2) {
        rp1 rp12 = this.k;
        if (bl2) {
            float[] fArray = rp12.a(this);
            if (fArray != null) {
                QK1.c(fArray, mR1);
            } else {
                bl2 = false;
                fArray = null;
                mR1.a = 0.0f;
                mR1.b = 0.0f;
                mR1.c = 0.0f;
                mR1.d = 0.0f;
            }
        } else {
            float[] fArray = rp12.b(this);
            QK1.c(fArray, mR1);
        }
    }

    public final void c(uo2_0 uo2_02) {
        int n3;
        int n4;
        i13 i132;
        i13 i133;
        int n7;
        float f5;
        float f6;
        int n8 = uo2_02.a;
        int n10 = this.o;
        if ((n10 = (n8 |= n10) & 0x1000) != 0) {
            long l2;
            this.l = l2 = uo2_02.n;
            f6 = Oq3.b(l2);
            f5 = this.getWidth();
            this.setPivotX(f6 *= f5);
            l2 = this.l;
            f6 = Oq3.c(l2);
            n7 = this.getHeight();
            f5 = n7;
            this.setPivotY(f6 *= f5);
        }
        if ((n10 = n8 & 1) != 0) {
            f6 = uo2_02.b;
            this.setScaleX(f6);
        }
        if ((n10 = n8 & 2) != 0) {
            f6 = uo2_02.c;
            this.setScaleY(f6);
        }
        if ((n10 = n8 & 4) != 0) {
            f6 = uo2_02.d;
            this.setAlpha(f6);
        }
        if ((n10 = n8 & 8) != 0) {
            f6 = uo2_02.e;
            this.setTranslationX(f6);
        }
        if ((n10 = n8 & 0x10) != 0) {
            f6 = uo2_02.f;
            this.setTranslationY(f6);
        }
        if ((n10 = n8 & 0x20) != 0) {
            f6 = uo2_02.g;
            this.setElevation(f6);
        }
        if ((n10 = n8 & 0x400) != 0) {
            f6 = uo2_02.l;
            this.setRotation(f6);
        }
        if ((n10 = n8 & 0x100) != 0) {
            f6 = uo2_02.j;
            this.setRotationX(f6);
        }
        if ((n10 = n8 & 0x200) != 0) {
            f6 = uo2_02.k;
            this.setRotationY(f6);
        }
        if ((n10 = n8 & 0x800) != 0) {
            f6 = uo2_02.m;
            this.setCameraDistancePx(f6);
        }
        Object object = this.getManualClipPath();
        n7 = 1;
        f5 = Float.MIN_VALUE;
        if (object != null) {
            n10 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n10 = 0;
            f6 = 0.0f;
            object = null;
        }
        int n14 = uo2_02.p;
        Object object2 = fg2_1.a;
        boolean bl2 = n14 != 0 && (i133 = uo2_02.o) != object2;
        int n15 = n8 & 0x6000;
        if (n15 != 0) {
            if (n14 != 0 && (i132 = uo2_02.o) == object2) {
                n14 = 1;
            } else {
                n14 = 0;
                i132 = null;
            }
            this.f = n14;
            this.l();
            this.setClipToOutline(bl2);
        }
        Cg2 cg2 = uo2_02.u;
        float f7 = uo2_02.d;
        float f8 = uo2_02.g;
        long l3 = uo2_02.r;
        n14 = this.e.c(cg2, f7, bl2, f8, l3);
        object2 = this.e;
        n15 = (int)(((dg2_0)object2).f ? 1 : 0);
        if (n15 != 0) {
            if ((object2 = ((dg2_0)object2).b()) != null) {
                object2 = q;
            } else {
                n4 = 0;
                object2 = null;
            }
            this.setOutlineProvider((ViewOutlineProvider)object2);
        }
        if ((object2 = this.getManualClipPath()) != null) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        if (n10 != n4 || n4 != 0 && n14 != 0) {
            this.invalidate();
        }
        if ((n10 = (int)(this.i ? 1 : 0)) == 0) {
            f6 = this.getElevation();
            n14 = 0;
            i132 = null;
            float f11 = f6 - 0.0f;
            n10 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
            if (n10 > 0 && (object = this.d) != null) {
                object.invoke();
            }
        }
        if ((n10 = n8 & 0x1F1B) != 0) {
            object = this.k;
            ((rp1)object).c();
        }
        if ((n10 = Build.VERSION.SDK_INT) >= (n14 = 28)) {
            long l4;
            n14 = n8 & 0x40;
            object2 = gD3.a;
            if (n14 != 0) {
                l4 = uo2_02.h;
                n14 = zx_0.i(l4);
                ((gD3)object2).a(this, n14);
            }
            if ((n14 = n8 & 0x80) != 0) {
                l4 = uo2_02.i;
                n14 = zx_0.i(l4);
                ((gD3)object2).b(this, n14);
            }
        }
        if (n10 >= (n14 = 31)) {
            f6 = 1.83671E-40f;
            n10 = 0x20000 & n8;
            if (n10 != 0) {
                object = iD3.a;
                ((iD3)object).a(this, null);
            }
        }
        n10 = 32768;
        f6 = 4.5918E-41f;
        if ((n8 &= n10) != 0) {
            n8 = uo2_02.q;
            n10 = (int)(y30_0.a(n8, n7) ? 1 : 0);
            n14 = 2;
            if (n10 != 0) {
                this.setLayerType(n14, null);
            } else if ((n8 = (int)(y30_0.a(n8, n14) ? 1 : 0)) != 0) {
                this.setLayerType(0, null);
                n7 = 0;
                f5 = 0.0f;
            } else {
                this.setLayerType(0, null);
            }
            this.m = n7;
        }
        this.o = n3 = uo2_02.a;
    }

    public final long d(long l2, boolean bl2) {
        rp1 rp12 = this.k;
        if (bl2) {
            float[] fArray = rp12.a(this);
            l2 = fArray != null ? QK1.b(fArray, l2) : 9187343241974906880L;
        } else {
            float[] fArray = rp12.b(this);
            l2 = QK1.b(fArray, l2);
        }
        return l2;
    }

    public final void destroy() {
        this.setInvalidated(false);
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.B = true;
        DrawChildContainer drawChildContainer = null;
        this.c = null;
        this.d = null;
        int n3 = androidComposeView.T(this);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 < n7 && (n4 = (int)(u ? 1 : 0)) == 0 && n3 != 0) {
            n3 = 8;
            this.setVisibility(n3);
        } else {
            drawChildContainer = this.b;
            drawChildContainer.removeViewInLayout(this);
        }
    }

    public final void dispatchDraw(Canvas object) {
        boolean bl2;
        zl_0 zl_02 = this.j;
        mf_0 mf_02 = zl_02.a;
        Canvas canvas = mf_02.a;
        mf_02.a = object;
        Object object2 = this.getManualClipPath();
        if (object2 == null && (bl2 = object.isHardwareAccelerated())) {
            bl2 = false;
            object = null;
        } else {
            mf_02.p();
            object = this.e;
            ((dg2_0)object).a(mf_02);
            bl2 = true;
        }
        object2 = this.c;
        if (object2 != null) {
            object2.invoke(mf_02, null);
        }
        if (bl2) {
            mf_02.h();
        }
        zl_02.a.a = canvas;
        this.setInvalidated(false);
    }

    public final void e(Function2 function2, Function0 function0) {
        long l2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 < n4 && (n3 = (int)(u ? 1 : 0)) == 0) {
            this.setVisibility(0);
        } else {
            DrawChildContainer drawChildContainer = this.b;
            drawChildContainer.addView(this);
        }
        this.f = false;
        this.i = false;
        n3 = Oq3.c;
        this.l = l2 = Oq3.b;
        this.c = function2;
        this.d = function0;
    }

    public final void f(long l2) {
        int n3 = 32;
        float f5 = 4.5E-44f;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        int n8 = this.getWidth();
        if (n4 != n8 || n7 != (n8 = this.getHeight())) {
            float f6 = Oq3.b(this.l);
            f5 = n4;
            this.setPivotX(f6 *= f5);
            l4 = this.l;
            f6 = Oq3.c(l4);
            f5 = n7;
            this.setPivotY(f6 *= f5);
            Object object = this.e.b();
            if (object != null) {
                object = q;
            } else {
                n8 = 0;
                f6 = 0.0f;
                object = null;
            }
            this.setOutlineProvider((ViewOutlineProvider)object);
            n8 = this.getLeft();
            n3 = this.getTop();
            int n10 = this.getLeft() + n4;
            n4 = this.getTop() + n7;
            this.layout(n8, n3, n10, n4);
            this.l();
            object = this.k;
            ((rp1)object).c();
        }
    }

    public final void forceLayout() {
    }

    public final void g(iL iL2, W01 object) {
        float f5 = this.getElevation();
        float f6 = f5 - 0.0f;
        Object object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            object2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            object2 = false;
            f5 = 0.0f;
            object = null;
        }
        this.i = object2;
        if (object2 != false) {
            iL2.j();
        }
        object = this.b;
        long l2 = this.getDrawingTime();
        ((DrawChildContainer)((Object)object)).a(iL2, this, l2);
        object2 = this.i;
        if (object2 != false) {
            iL2.q();
        }
    }

    public final float getCameraDistancePx() {
        float f5 = this.getCameraDistance();
        float f6 = this.getResources().getDisplayMetrics().densityDpi;
        return f5 / f6;
    }

    public final DrawChildContainer getContainer() {
        return this.b;
    }

    public long getLayerId() {
        return this.n;
    }

    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    public long getOwnerViewId() {
        long l2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            AndroidComposeView androidComposeView = this.a;
            l2 = ViewLayer$d.a((View)androidComposeView);
        } else {
            l2 = -1;
        }
        return l2;
    }

    public final boolean h(long l2) {
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        boolean bl2 = this.f;
        boolean bl3 = true;
        if (bl2) {
            float f7;
            float f8;
            float f11;
            float f12;
            int n3 = 0;
            float f14 = 0.0f;
            float f15 = 0.0f - f5;
            Object object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (object > 0 || (object = (f12 = f5 - (f11 = (float)this.getWidth())) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) >= 0 || (n3 = (f8 = 0.0f - f6) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0 || (n3 = (int)((f7 = f6 - (f14 = (float)this.getHeight())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) >= 0) {
                bl3 = false;
            }
            return bl3;
        }
        boolean bl4 = this.getClipToOutline();
        if (bl4) {
            Object object = this.e;
            boolean bl5 = ((dg2_0)object).m;
            if (bl5 && (object = ((dg2_0)object).c) != null) {
                f6 = e72.d(l2);
                float f16 = e72.e(l2);
                boolean bl6 = false;
                float f17 = 0.0f;
                bl3 = j13.a((Cg2)object, f6, f16, null, null);
            }
        }
        return bl3;
    }

    public final boolean hasOverlappingRendering() {
        return this.m;
    }

    public final void i(float[] fArray) {
        float[] fArray2 = this.k.a(this);
        if (fArray2 != null) {
            QK1.g(fArray, fArray2);
        }
    }

    public final void invalidate() {
        boolean bl2 = this.h;
        if (!bl2) {
            bl2 = true;
            this.setInvalidated(bl2);
            super.invalidate();
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.invalidate();
        }
    }

    public final void j(long l2) {
        int n3;
        int n4;
        long l3 = l2 >> 32;
        int n7 = (int)l3;
        int n8 = this.getLeft();
        rp1 rp12 = this.k;
        if (n7 != n8) {
            n8 = this.getLeft();
            this.offsetLeftAndRight(n7 -= n8);
            rp12.c();
        }
        if ((n4 = (int)(l2 &= (l3 = 0xFFFFFFFFL))) != (n3 = this.getTop())) {
            n3 = this.getTop();
            this.offsetTopAndBottom(n4 -= n3);
            rp12.c();
        }
    }

    public final void k() {
        boolean bl2 = this.h;
        if (bl2 && !(bl2 = u)) {
            ViewLayer$c.a(this);
            bl2 = false;
            this.setInvalidated(false);
        }
    }

    public final void l() {
        Rect rect;
        boolean bl2 = this.f;
        if (bl2) {
            rect = this.g;
            if (rect == null) {
                int n3 = this.getWidth();
                int n4 = this.getHeight();
                this.g = rect = new Rect(0, 0, n3, n4);
            } else {
                Intrinsics.checkNotNull(rect);
                int n7 = this.getWidth();
                int n8 = this.getHeight();
                rect.set(0, 0, n7, n8);
            }
            rect = this.g;
        } else {
            bl2 = false;
            rect = null;
        }
        this.setClipBounds(rect);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void setCameraDistancePx(float f5) {
        float f6 = this.getResources().getDisplayMetrics().densityDpi;
        this.setCameraDistance(f5 *= f6);
    }
}

