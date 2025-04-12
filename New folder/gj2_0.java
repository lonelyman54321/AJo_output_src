/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.os.Build$VERSION
 */
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from gJ2
 */
public final class gj2_0
implements Qg2 {
    public static final gJ2$a n = gJ2$a.c;
    public final AndroidComposeView a;
    public Function2 b;
    public Function0 c;
    public boolean d;
    public final dg2_0 e;
    public boolean f;
    public boolean g;
    public ei h;
    public final rp1 i;
    public final zl_0 j;
    public long k;
    public final Pp0 l;
    public int m;

    public gj2_0(AndroidComposeView object, Function2 object2, Function0 fx0_22) {
        long l2;
        this.a = object;
        this.b = object2;
        this.c = fx0_22;
        this.e = object2 = new dg2_0();
        fx0_22 = n;
        this.i = object2 = new rp1((Function2)fx0_22);
        this.j = object2 = new zl_0();
        this.k = l2 = Oq3.b;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        object = n3 >= n4 ? new eJ2() : (object2 = new VI2((AndroidComposeView)object));
        object.v();
        object.r(false);
        this.l = object;
    }

    public final void a(float[] fArray) {
        Object object = this.i;
        Pp0 pp0 = this.l;
        object = ((rp1)object).b(pp0);
        QK1.g(fArray, (float[])object);
    }

    public final void b(MR1 mR1, boolean bl2) {
        Pp0 pp0 = this.l;
        rp1 rp12 = this.i;
        if (bl2) {
            float[] fArray = rp12.a(pp0);
            if (fArray == null) {
                bl2 = false;
                fArray = null;
                mR1.a = 0.0f;
                mR1.b = 0.0f;
                mR1.c = 0.0f;
                mR1.d = 0.0f;
            } else {
                QK1.c(fArray, mR1);
            }
        } else {
            float[] fArray = rp12.b(pp0);
            QK1.c(fArray, mR1);
        }
    }

    public final void c(uo2_0 uo2_02) {
        int n3;
        Object object;
        Object object2;
        float f5;
        long l2;
        float f6;
        kj3_1 kj3_12;
        gj2_0 gj2_02 = this;
        uo2_0 uo2_03 = uo2_02;
        int n4 = uo2_02.a;
        Object object3 = this.m;
        if ((object3 = (n4 |= object3) & 0x1000) != 0) {
            long l3;
            this.k = l3 = uo2_02.n;
        }
        Pp0 pp0 = gj2_02.l;
        int n7 = pp0.y();
        int n8 = 1;
        dg2_0 dg2_02 = gj2_02.e;
        int n10 = 0;
        if (n7 != 0 && (n7 = dg2_02.g ^ n8) == 0) {
            n7 = 1;
        } else {
            n7 = 0;
            kj3_12 = null;
        }
        int n14 = n4 & 1;
        if (n14 != 0) {
            f6 = uo2_03.b;
            pp0.d(f6);
        }
        if ((n14 = n4 & 2) != 0) {
            f6 = uo2_03.c;
            pp0.k(f6);
        }
        if ((n14 = n4 & 4) != 0) {
            f6 = uo2_03.d;
            pp0.b(f6);
        }
        if ((n14 = n4 & 8) != 0) {
            f6 = uo2_03.e;
            pp0.m(f6);
        }
        if ((n14 = n4 & 0x10) != 0) {
            f6 = uo2_03.f;
            pp0.c(f6);
        }
        if ((n14 = n4 & 0x20) != 0) {
            f6 = uo2_03.g;
            pp0.t(f6);
        }
        if ((n14 = n4 & 0x40) != 0) {
            l2 = uo2_03.h;
            n14 = zx_0.i(l2);
            pp0.E(n14);
        }
        if ((n14 = n4 & 0x80) != 0) {
            l2 = uo2_03.i;
            n14 = zx_0.i(l2);
            pp0.G(n14);
        }
        if ((n14 = n4 & 0x400) != 0) {
            f6 = uo2_03.l;
            pp0.j(f6);
        }
        if ((n14 = n4 & 0x100) != 0) {
            f6 = uo2_03.j;
            pp0.g(f6);
        }
        if ((n14 = n4 & 0x200) != 0) {
            f6 = uo2_03.k;
            pp0.h(f6);
        }
        if ((n14 = n4 & 0x800) != 0) {
            f6 = uo2_03.m;
            pp0.f(f6);
        }
        if (object3 != 0) {
            f5 = Oq3.b(gj2_02.k);
            f6 = pp0.getWidth();
            pp0.B(f5 *= f6);
            l2 = gj2_02.k;
            f5 = Oq3.c(l2);
            n14 = pp0.getHeight();
            f6 = n14;
            pp0.C(f5 *= f6);
        }
        object3 = uo2_03.p;
        fG2$a fG2$a = fg2_1.a;
        if (object3 != 0 && (object2 = uo2_03.o) != fG2$a) {
            object3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            object3 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        int n15 = n4 & 0x6000;
        if (n15 != 0) {
            pp0.F((boolean)object3);
            n15 = (int)(uo2_03.p ? 1 : 0);
            if (n15 != 0 && (object = uo2_03.o) == fG2$a) {
                n14 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n14 = 0;
                f6 = 0.0f;
                fG2$a = null;
            }
            pp0.r(n14 != 0);
        }
        f6 = 1.83671E-40f;
        n14 = 0x20000 & n4;
        if (n14 != 0) {
            pp0.i();
        }
        f6 = 4.5918E-41f;
        n14 = 0x8000 & n4;
        if (n14 != 0) {
            n14 = uo2_03.q;
            pp0.o(n14);
        }
        Cg2 cg2 = uo2_03.u;
        float f7 = uo2_03.d;
        float f8 = uo2_03.g;
        l2 = uo2_03.r;
        dg2_0 dg2_03 = gj2_02.e;
        object = dg2_03;
        n14 = (int)(dg2_03.c(cg2, f7, (boolean)object3, f8, l2) ? 1 : 0);
        n15 = (int)(dg2_02.f ? 1 : 0);
        if (n15 != 0) {
            object = dg2_02.b();
            pp0.D((Outline)object);
        }
        if (object3 != 0 && (object3 = dg2_02.g ^ n8) == 0) {
            n10 = 1;
        }
        object2 = gj2_02.a;
        if (n7 == n10 && (n10 == 0 || n14 == 0)) {
            n7 = Build.VERSION.SDK_INT;
            n8 = 26;
            if (n7 >= n8) {
                kj3_12 = kj3_1.a;
                kj3_12.a((AndroidComposeView)object2);
            } else {
                object2.invalidate();
            }
        } else {
            n7 = gj2_02.d;
            if (n7 == 0 && (n7 = (int)(gj2_02.f ? 1 : 0)) == 0) {
                object2.invalidate();
                gj2_02.l(n8 != 0);
            }
        }
        object3 = gj2_02.g;
        if (object3 == 0) {
            f5 = pp0.H();
            pp0 = null;
            float f11 = f5 - 0.0f;
            object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object3 > 0 && (object2 = gj2_02.c) != null) {
                object2.invoke();
            }
        }
        if ((n4 &= 0x1F1B) != 0) {
            rp1 rp12 = gj2_02.i;
            rp12.c();
        }
        gj2_02.m = n3 = uo2_03.a;
    }

    public final long d(long l2, boolean bl2) {
        Pp0 pp0 = this.l;
        rp1 rp12 = this.i;
        if (bl2) {
            float[] fArray = rp12.a(pp0);
            l2 = fArray != null ? QK1.b(fArray, l2) : 9187343241974906880L;
        } else {
            float[] fArray = rp12.b(pp0);
            l2 = QK1.b(fArray, l2);
        }
        return l2;
    }

    public final void destroy() {
        boolean bl2;
        Pp0 pp0 = this.l;
        boolean bl3 = pp0.p();
        if (bl3) {
            pp0.n();
        }
        this.b = null;
        this.c = null;
        this.f = bl2 = true;
        this.l(false);
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.B = bl2;
        androidComposeView.T(this);
    }

    public final void e(Function2 function2, Function0 function0) {
        long l2;
        this.l(false);
        this.f = false;
        this.g = false;
        this.k = l2 = Oq3.b;
        this.b = function2;
        this.c = function0;
    }

    public final void f(long l2) {
        int n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        int n7 = (int)(l2 &= 0xFFFFFFFFL);
        float f5 = Oq3.b(this.k);
        float f6 = n4;
        Pp0 pp0 = this.l;
        pp0.B(f5 *= f6);
        long l4 = this.k;
        f5 = Oq3.c(l4);
        float f7 = n7;
        pp0.C(f5 *= f7);
        int bl2 = pp0.getLeft();
        int n8 = pp0.getTop();
        int n10 = pp0.getLeft() + n4;
        n4 = pp0.getTop() + n7;
        boolean bl3 = pp0.s(bl2, n8, n10, n4);
        if (bl3) {
            boolean bl4;
            Object object = this.e.b();
            pp0.D((Outline)object);
            boolean bl5 = this.d;
            if (!bl5 && !(bl4 = this.f)) {
                object = this.a;
                object.invalidate();
                boolean bl6 = true;
                f5 = Float.MIN_VALUE;
                this.l(bl6);
            }
            object = this.i;
            ((rp1)object).c();
        }
    }

    public final void g(iL iL2, W01 object) {
        Canvas canvas = Nf.a(iL2);
        int n3 = canvas.isHardwareAccelerated();
        boolean bl2 = false;
        Pp0 pp0 = this.l;
        if (n3 != 0) {
            this.k();
            float f5 = pp0.H();
            boolean bl3 = false;
            float f6 = 0.0f;
            Object var10_13 = null;
            float f7 = f5 - 0.0f;
            n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                bl2 = true;
            }
            this.g = bl2;
            if (bl2) {
                iL2.j();
            }
            pp0.q(canvas);
            n3 = (int)(this.g ? 1 : 0);
            if (n3 != 0) {
                iL2.q();
            }
        } else {
            float f8;
            n3 = pp0.getLeft();
            float f11 = n3;
            float f12 = pp0.getTop();
            float f14 = pp0.getRight();
            float f15 = pp0.getBottom();
            float f16 = pp0.getAlpha();
            float f17 = f16 - (f8 = 1.0f);
            Object object2 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                ei ei2 = this.h;
                if (ei2 == null) {
                    this.h = ei2 = fi.a();
                }
                f8 = pp0.getAlpha();
                ei2.b(f8);
                Paint paint = ei2.a;
                f16 = f11;
                f8 = f12;
                canvas.saveLayer(f11, f12, f14, f15, paint);
            } else {
                iL2.p();
            }
            iL2.g(f11, f12);
            object = this.i.b(pp0);
            iL2.r((float[])object);
            n3 = (int)(pp0.y() ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(pp0.w() ? 1 : 0)) != 0) {
                object = this.e;
                ((dg2_0)object).a(iL2);
            }
            if ((object = this.b) != null) {
                canvas = null;
                object.invoke(iL2, null);
            }
            iL2.h();
            this.l(false);
        }
    }

    public final boolean h(long l2) {
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        Pp0 pp0 = this.l;
        boolean bl2 = pp0.w();
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
            if (object > 0 || (object = (f12 = f5 - (f11 = (float)pp0.getWidth())) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) >= 0 || (n3 = (f8 = 0.0f - f6) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0 || (n3 = (int)((f7 = f6 - (f14 = (float)pp0.getHeight())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) >= 0) {
                bl3 = false;
            }
            return bl3;
        }
        boolean bl4 = pp0.y();
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

    public final void i(float[] fArray) {
        Object object = this.i;
        Pp0 pp0 = this.l;
        if ((object = (Object)((rp1)object).a(pp0)) != null) {
            QK1.g(fArray, (float[])object);
        }
    }

    public final void invalidate() {
        boolean bl2 = this.d;
        if (!bl2 && !(bl2 = this.f)) {
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.invalidate();
            bl2 = true;
            this.l(bl2);
        }
    }

    public final void j(long l2) {
        Object object = this.l;
        int n3 = object.getLeft();
        int n4 = object.getTop();
        int n7 = 32;
        long l3 = l2 >> n7;
        int n8 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n10 = (int)(l2 &= l4);
        if (n3 != n8 || n4 != n10) {
            Object object2;
            if (n3 != n8) {
                object.A(n8 -= n3);
            }
            if (n4 != n10) {
                object.u(n10 -= n4);
            }
            int n14 = Build.VERSION.SDK_INT;
            n10 = 26;
            object = this.a;
            if (n14 >= n10) {
                object2 = kj3_1.a;
                ((kj3_1)object2).a((AndroidComposeView)object);
            } else {
                object.invalidate();
            }
            object2 = this.i;
            ((rp1)object2).c();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void k() {
        block3: {
            var1_1 = this.d;
            var2_2 = this.l;
            if (!var1_1 && (var1_1 = var2_2.p())) break block3;
            var1_1 = var2_2.y();
            if (!var1_1) ** GOTO lbl-1000
            var3_3 = this.e;
            var4_4 = var3_3.g ^ true;
            if (!var4_4) {
                var3_3.d();
                var3_3 = var3_3.e;
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = false;
                var3_3 = null;
            }
            var5_5 = this.b;
            if (var5_5 != null) {
                var6_6 = new gJ2$b((Function2)var5_5);
                var5_5 = this.j;
                var2_2.x((zl_0)var5_5, (gn2)var3_3, var6_6);
            }
            var1_1 = false;
            var3_3 = null;
            this.l(false);
        }
    }

    public final void l(boolean bl2) {
        boolean bl3 = this.d;
        if (bl2 != bl3) {
            this.d = bl2;
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.Q(this, bl2);
        }
    }
}

