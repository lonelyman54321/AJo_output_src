/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.os.Build$VERSION
 */
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Z01
implements Qg2 {
    public W01 a;
    public final T01 b;
    public final AndroidComposeView c;
    public Function2 d;
    public Function0 e;
    public long f;
    public boolean g;
    public final float[] h;
    public float[] i;
    public boolean j;
    public Vo0 k;
    public bp1_0 l;
    public final xl_0 m;
    public int n;
    public long o;
    public Cg2 p;
    public ki q;
    public ei r;
    public boolean s;
    public final Z01$a t;

    public Z01(W01 object, T01 t01, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        long l2;
        this.a = object;
        this.b = t01;
        this.c = androidComposeView;
        this.d = function2;
        this.e = function0;
        int n3 = -1 >>> 1;
        this.f = l2 = dj1.a(n3, n3);
        object = QK1.a();
        this.h = (float[])object;
        this.k = object = km3.a();
        object = bp1_0.Ltr;
        this.l = object;
        object = new xl_0();
        this.m = object;
        this.o = l2 = Oq3.b;
        object = new Z01$a(this);
        this.t = object;
    }

    public final void a(float[] fArray) {
        float[] fArray2 = this.m();
        QK1.g(fArray, fArray2);
    }

    public final void b(MR1 mR1, boolean bl2) {
        if (bl2) {
            float[] fArray = this.l();
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
            float[] fArray = this.m();
            QK1.c(fArray, mR1);
        }
    }

    public final void c(uo2_0 object) {
        int n3;
        Object object2;
        Object object3;
        int n4;
        long l2;
        long l3;
        int n7;
        Object object4;
        float f5;
        long l4;
        long l7;
        float f6;
        Object object5;
        float f7;
        float f8;
        Object object6;
        float f11;
        float f12;
        Object object7;
        int n8;
        long l8;
        int n10 = ((uo2_0)object).a;
        int n14 = this.n;
        n10 |= n14;
        Object object8 = ((uo2_0)object).t;
        this.l = object8;
        object8 = ((uo2_0)object).s;
        this.k = object8;
        n14 = n10 & 0x1000;
        if (n14 != 0) {
            this.o = l8 = ((uo2_0)object).n;
        }
        if ((n8 = n10 & 1) != 0) {
            object7 = this.a;
            f12 = ((uo2_0)object).b;
            object7 = ((W01)object7).a;
            f11 = object7.z();
            float f14 = f11 - f12;
            object6 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (object6 != false) {
                object7.d(f12);
            }
        }
        if ((n8 = n10 & 2) != 0) {
            object7 = this.a;
            f12 = ((uo2_0)object).c;
            object7 = ((W01)object7).a;
            f11 = object7.J();
            float f15 = f11 - f12;
            object6 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (object6 != false) {
                object7.k(f12);
            }
        }
        if ((n8 = n10 & 4) != 0) {
            object7 = this.a;
            f12 = ((uo2_0)object).d;
            ((W01)object7).f(f12);
        }
        if ((n8 = n10 & 8) != 0) {
            object7 = this.a;
            f12 = ((uo2_0)object).e;
            object7 = ((W01)object7).a;
            f11 = object7.F();
            float f16 = f11 - f12;
            object6 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            if (object6 != false) {
                object7.m(f12);
            }
        }
        if ((n8 = n10 & 0x10) != 0) {
            object7 = this.a;
            f12 = ((uo2_0)object).f;
            object7 = ((W01)object7).a;
            f11 = object7.E();
            float f17 = f11 - f12;
            object6 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            if (object6 != false) {
                object7.c(f12);
            }
        }
        n8 = n10 & 0x20;
        f12 = 0.0f;
        object6 = true;
        f11 = Float.MIN_VALUE;
        if (n8 != 0) {
            object7 = this.a;
            f8 = ((uo2_0)object).g;
            a a2 = ((W01)object7).a;
            f7 = a2.I();
            float f18 = f7 - f8;
            object5 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
            if (object5 != false) {
                a2.t(f8);
                ((W01)object7).g = object6;
                ((W01)object7).a();
            }
            f6 = ((uo2_0)object).g;
            float f19 = f6 - 0.0f;
            n8 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
            if (n8 > 0 && (n8 = (int)(this.s ? 1 : 0)) == 0 && (object7 = this.e) != null) {
                object7.invoke();
            }
        }
        if ((n8 = n10 & 0x40) != 0) {
            object7 = this.a;
            l7 = ((uo2_0)object).h;
            object7 = ((W01)object7).a;
            l4 = object7.u();
            object5 = OX.c(l7, l4);
            if (object5 == false) {
                object7.q(l7);
            }
        }
        if ((n8 = n10 & 0x80) != 0) {
            object7 = this.a;
            l7 = ((uo2_0)object).i;
            object7 = ((W01)object7).a;
            l4 = object7.v();
            object5 = OX.c(l7, l4);
            if (object5 == false) {
                object7.s(l7);
            }
        }
        if ((n8 = n10 & 0x400) != 0) {
            object7 = this.a;
            f8 = ((uo2_0)object).l;
            object7 = ((W01)object7).a;
            f5 = object7.o();
            float f20 = f5 - f8;
            object4 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
            if (object4 != false) {
                object7.j(f8);
            }
        }
        if ((n8 = n10 & 0x100) != 0) {
            object7 = this.a;
            f8 = ((uo2_0)object).j;
            object7 = ((W01)object7).a;
            f5 = object7.G();
            float f22 = f5 - f8;
            object4 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
            if (object4 != false) {
                object7.g(f8);
            }
        }
        if ((n8 = n10 & 0x200) != 0) {
            object7 = this.a;
            f8 = ((uo2_0)object).k;
            object7 = ((W01)object7).a;
            f5 = object7.l();
            float f23 = f5 - f8;
            object4 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
            if (object4 != false) {
                object7.h(f8);
            }
        }
        if ((n8 = n10 & 0x800) != 0) {
            object7 = this.a;
            f8 = ((uo2_0)object).m;
            object7 = ((W01)object7).a;
            f5 = object7.w();
            float f24 = f5 - f8;
            object4 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
            if (object4 != false) {
                object7.f(f8);
            }
        }
        l7 = 9205357640488583168L;
        if (n14 != 0) {
            long l12 = this.o;
            l4 = Oq3.b;
            n14 = (int)(Oq3.a(l12, l4) ? 1 : 0);
            if (n14 != 0) {
                object8 = this.a;
                l4 = ((W01)object8).u;
                n8 = (int)(e72.b(l4, l7) ? 1 : 0);
                if (n8 == 0) {
                    ((W01)object8).u = l7;
                    object8 = ((W01)object8).a;
                    object8.D(l7);
                }
            } else {
                object8 = this.a;
                f6 = Oq3.b(this.o);
                n7 = (int)(this.f >> 32);
                f7 = n7;
                f6 *= f7;
                f7 = Oq3.c(this.o);
                long l14 = this.f;
                l3 = ((W01)object8).u;
                l2 = 0xFFFFFFFFL;
                n4 = (int)(l14 &= l2);
                float f25 = n4;
                l4 = h72.a(f6, f7 *= f25);
                n8 = (int)(e72.b(l3, l4) ? 1 : 0);
                if (n8 == 0) {
                    ((W01)object8).u = l4;
                    object8 = ((W01)object8).a;
                    object8.D(l4);
                }
            }
        }
        if ((n14 = n10 & 0x4000) != 0) {
            object8 = this.a;
            object5 = ((W01)object8).v;
            n8 = (int)(((uo2_0)object).p ? 1 : 0);
            if (object5 != n8) {
                ((W01)object8).v = n8;
                ((W01)object8).g = object6;
                ((W01)object8).a();
            }
        }
        n14 = 0x20000 & n10;
        n8 = 0;
        f6 = 0.0f;
        object7 = null;
        if (n14 != 0) {
            object8 = this.a.a;
            object8.getClass();
            object5 = Intrinsics.areEqual(null, null);
            if (object5 == false) {
                object8.i();
            }
        }
        n14 = 0x8000 & n10;
        object5 = false;
        f7 = 0.0f;
        if (n14 != 0) {
            object8 = this.a;
            n7 = ((uo2_0)object).q;
            n4 = y30_0.a(n7, 0);
            if (n4 != 0) {
                n4 = 0;
                object3 = null;
            } else {
                n4 = y30_0.a(n7, (int)object6);
                if (n4 != 0) {
                    n4 = 1;
                } else {
                    n4 = 2;
                    if ((n7 = (int)(y30_0.a(n7, n4) ? 1 : 0)) == 0) {
                        object = new IllegalStateException("Not supported composition strategy");
                        throw object;
                    }
                }
            }
            object8 = ((W01)object8).a;
            n7 = (int)(x30_0.a(object8.a(), n4) ? 1 : 0);
            if (n7 == 0) {
                object8.H(n4);
            }
        }
        if ((n14 = (int)(Intrinsics.areEqual(object8 = this.p, object2 = ((uo2_0)object).u) ? 1 : 0)) == 0) {
            this.p = object8 = ((uo2_0)object).u;
            if (object8 != null) {
                object2 = this.a;
                n4 = object8 instanceof Cg2$b;
                if (n4 != 0) {
                    object7 = object8;
                    object7 = ((Cg2$b)object8).a;
                    f12 = ((aG2)object7).a;
                    f8 = ((aG2)object7).b;
                    l3 = h72.a(f12, f8);
                    f12 = ((aG2)object7).d();
                    f6 = ((aG2)object7).c();
                    long l15 = bo1_1.a(f12, f6);
                    float f26 = 0.0f;
                    ((W01)object2).g(l3, l15, 0.0f);
                } else {
                    n4 = object8 instanceof Cg2$a;
                    l2 = 0L;
                    if (n4 != 0) {
                        object3 = object8;
                        object3 = (Cg2$a)object8;
                        ((W01)object2).k = null;
                        ((W01)object2).i = l7;
                        ((W01)object2).h = l2;
                        ((W01)object2).j = 0.0f;
                        ((W01)object2).g = object6;
                        ((W01)object2).n = false;
                        ((W01)object2).l = object7 = ((Cg2$a)object3).a;
                        ((W01)object2).a();
                    } else {
                        n4 = object8 instanceof Cg2$c;
                        if (n4 != 0) {
                            object3 = object8;
                            object3 = (Cg2$c)object8;
                            ki ki2 = ((Cg2$c)object3).b;
                            if (ki2 != null) {
                                ((W01)object2).k = null;
                                ((W01)object2).i = l7;
                                ((W01)object2).h = l2;
                                ((W01)object2).j = 0.0f;
                                ((W01)object2).g = object6;
                                ((W01)object2).n = false;
                                ((W01)object2).l = ki2;
                                ((W01)object2).a();
                            } else {
                                object7 = ((Cg2$c)object3).a;
                                f12 = ((NP2)object7).a;
                                f8 = ((NP2)object7).b;
                                l3 = h72.a(f12, f8);
                                f12 = ((NP2)object7).b();
                                f8 = ((NP2)object7).a();
                                long l16 = bo1_1.a(f12, f8);
                                l8 = ((NP2)object7).h;
                                float f27 = r90_0.b(l8);
                                ((W01)object2).g(l3, l16, f27);
                            }
                        }
                    }
                }
                n14 = object8 instanceof Cg2$a;
                if (n14 != 0) {
                    n14 = Build.VERSION.SDK_INT;
                    n8 = 33;
                    f6 = 4.6E-44f;
                    if (n14 < n8 && (object8 = this.e) != null) {
                        object8.invoke();
                    }
                }
            }
        } else {
            object6 = false;
            f11 = 0.0f;
        }
        this.n = n3 = ((uo2_0)object).a;
        if (n10 != 0 || object6 != false) {
            n3 = Build.VERSION.SDK_INT;
            n10 = 26;
            object8 = this.c;
            if (n3 >= n10) {
                object = kj3_1.a;
                ((kj3_1)object).a((AndroidComposeView)object8);
            } else {
                object8.invalidate();
            }
        }
    }

    public final long d(long l2, boolean bl2) {
        if (bl2) {
            float[] fArray = this.l();
            l2 = fArray != null ? QK1.b(fArray, l2) : 9187343241974906880L;
        } else {
            float[] fArray = this.m();
            l2 = QK1.b(fArray, l2);
        }
        return l2;
    }

    public final void destroy() {
        T01 t01 = null;
        this.d = null;
        this.e = null;
        this.g = true;
        boolean bl2 = this.j;
        AndroidComposeView androidComposeView = this.c;
        if (bl2) {
            bl2 = false;
            t01 = null;
            this.j = false;
            androidComposeView.Q(this, false);
        }
        if ((t01 = this.b) != null) {
            W01 w01 = this.a;
            t01.a(w01);
            androidComposeView.T(this);
        }
    }

    public final void e(Function2 object, Function0 object2) {
        Object object3 = this.b;
        if (object3 != null) {
            W01 w01 = this.a;
            boolean bl2 = w01.r;
            if (bl2) {
                long l2;
                this.a = object3 = object3.b();
                this.g = false;
                this.d = object;
                this.e = object2;
                int n3 = Oq3.c;
                this.o = l2 = Oq3.b;
                this.s = false;
                n3 = -1 >>> 1;
                this.f = l2 = dj1.a(n3, n3);
                this.p = null;
                this.n = 0;
                return;
            }
            object2 = "layer should have been released before reuse".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "currently reuse is only supported when we manage the layer lifecycle".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void f(long l2) {
        long l3 = this.f;
        boolean bl2 = bj1.b(l2, l3);
        if (!bl2) {
            this.f = l2;
            boolean bl3 = this.j;
            if (!bl3 && !(bl3 = this.g)) {
                AndroidComposeView androidComposeView = this.c;
                androidComposeView.invalidate();
                boolean bl4 = this.j;
                bl2 = true;
                if (bl2 != bl4) {
                    this.j = bl2;
                    androidComposeView.Q(this, bl2);
                }
            }
        }
    }

    public final void g(iL object, W01 object2) {
        Object object3 = Nf.a((iL)object);
        int n3 = object3.isHardwareAccelerated();
        int n4 = 1;
        if (n3 != 0) {
            this.k();
            object3 = this.a.a;
            float f5 = object3.I();
            n3 = 0;
            float f6 = 0.0f;
            xL$b xL$b = null;
            float f7 = f5 - 0.0f;
            float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (f8 <= 0) {
                n4 = 0;
            }
            this.s = n4;
            object3 = this.m;
            xL$b = ((xl_0)object3).b;
            xL$b.f((iL)object);
            xL$b.b = object2;
            object = this.a;
            Y01.a((Kt0)object3, (W01)object);
        } else {
            object2 = this.a;
            long l2 = ((W01)object2).s;
            int n7 = 32;
            int n8 = (int)(l2 >> n7);
            float f11 = n8;
            long l3 = 0xFFFFFFFFL;
            float f12 = (int)(l2 & l3);
            l2 = this.f;
            long l4 = l2 >> n7;
            n7 = (int)l4;
            float f14 = (float)n7 + f11;
            int n10 = (int)(l2 &= l3);
            float f15 = n10;
            float f16 = f12 + f15;
            object2 = ((W01)object2).a;
            float f17 = object2.getAlpha();
            n3 = 1065353216;
            f15 = 1.0f;
            float f18 = f17 - f15;
            Object object4 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
            if (object4 < 0) {
                object2 = this.r;
                if (object2 == null) {
                    this.r = object2 = fi.a();
                }
                a a2 = this.a.a;
                f15 = a2.getAlpha();
                ((ei)object2).b(f15);
                Paint paint = ((ei)object2).a;
                f15 = f11;
                object3.saveLayer(f11, f12, f14, f16, paint);
            } else {
                object.p();
            }
            object.g(f11, f12);
            object2 = this.m();
            object.r((float[])object2);
            object2 = this.a;
            boolean bl2 = ((W01)object2).v;
            if (bl2 && bl2) {
                bl2 = (object2 = ((W01)object2).c()) instanceof Cg2$b;
                if (bl2) {
                    object2 = ((Cg2$b)object2).a;
                    object.d((aG2)object2, n4);
                } else {
                    bl2 = object2 instanceof Cg2$c;
                    if (bl2) {
                        object3 = this.q;
                        if (object3 == null) {
                            this.q = object3 = ni.a();
                        }
                        ((ki)object3).reset();
                        object2 = ((Cg2$c)object2).a;
                        fn2.a((gn2)object3, (NP2)object2);
                        object.o((gn2)object3, n4);
                    } else {
                        bl2 = object2 instanceof Cg2$a;
                        if (bl2) {
                            object2 = ((Cg2$a)object2).a;
                            object.o((gn2)object2, n4);
                        }
                    }
                }
            }
            if ((object2 = this.d) != null) {
                bl2 = false;
                float f19 = 0.0f;
                object3 = null;
                object2.invoke(object, null);
            }
            object.h();
        }
    }

    public final boolean h(long l2) {
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        W01 w01 = this.a;
        boolean bl2 = w01.v;
        if (bl2) {
            return j13.a(w01.c(), f5, f6, null, null);
        }
        return true;
    }

    public final void i(float[] fArray) {
        float[] fArray2 = this.l();
        if (fArray2 != null) {
            QK1.g(fArray, fArray2);
        }
    }

    public final void invalidate() {
        boolean bl2 = this.j;
        if (!bl2 && !(bl2 = this.g)) {
            AndroidComposeView androidComposeView = this.c;
            androidComposeView.invalidate();
            boolean bl3 = this.j;
            boolean bl4 = true;
            if (bl4 != bl3) {
                this.j = bl4;
                androidComposeView.Q(this, bl4);
            }
        }
    }

    public final void j(long l2) {
        Object object;
        int n3;
        Object object2 = this.a;
        long l3 = ((W01)object2).s;
        boolean bl2 = Si1.b(l3, l2);
        if (!bl2) {
            ((W01)object2).s = l2;
            l3 = ((W01)object2).t;
            int n4 = 32;
            long l4 = l2 >> n4;
            int n7 = (int)l4;
            long l7 = 0xFFFFFFFFL;
            n3 = (int)(l2 &= l7);
            object = ((W01)object2).a;
            object.e(n7, n3, l3);
        }
        int n8 = Build.VERSION.SDK_INT;
        n3 = 26;
        object2 = this.c;
        if (n8 >= n3) {
            object = kj3_1.a;
            ((kj3_1)object).a((AndroidComposeView)object2);
        } else {
            object2.invalidate();
        }
    }

    public final void k() {
        boolean bl2 = this.j;
        if (bl2) {
            long l2;
            Object object;
            long l3 = this.o;
            long l4 = Oq3.b;
            bl2 = Oq3.a(l3, l4);
            long l7 = 0xFFFFFFFFL;
            int n3 = 32;
            if (!bl2) {
                object = this.a;
                long l8 = ((W01)object).t;
                l2 = this.f;
                bl2 = bj1.b(l8, l2);
                if (!bl2) {
                    object = this.a;
                    float f5 = Oq3.b(this.o);
                    float f6 = (int)(this.f >> n3);
                    f5 *= f6;
                    long l12 = this.o;
                    f6 = Oq3.c(l12);
                    l2 = ((W01)object).u;
                    int n4 = (int)(this.f & l7);
                    float f7 = n4;
                    l8 = h72.a(f5, f6 *= f7);
                    boolean bl3 = e72.b(l2, l8);
                    if (!bl3) {
                        ((W01)object).u = l8;
                        object = ((W01)object).a;
                        object.D(l8);
                    }
                }
            }
            object = this.a;
            Vo0 vo0 = this.k;
            bp1_0 bp1_02 = this.l;
            l2 = this.f;
            long l14 = ((W01)object).t;
            boolean bl4 = bj1.b(l14, l2);
            a a2 = ((W01)object).a;
            if (!bl4) {
                ((W01)object).t = l2;
                long l15 = ((W01)object).s;
                long l16 = l15 >> n3;
                n3 = (int)l16;
                int n7 = (int)(l7 & l15);
                a2.e(n3, n7, l2);
                l7 = ((W01)object).i;
                l2 = 9205357640488583168L;
                n3 = (int)(l7 == l2 ? 0 : (l7 < l2 ? -1 : 1));
                if (n3 == 0) {
                    boolean bl5;
                    ((W01)object).g = bl5 = true;
                    ((W01)object).a();
                }
            }
            ((W01)object).b = vo0;
            ((W01)object).c = bp1_02;
            Object object2 = this.t;
            ((W01)object).d = object2;
            a2.getClass();
            ((W01)object).e();
            bl2 = this.j;
            if (bl2) {
                bl2 = false;
                object = null;
                this.j = false;
                object2 = this.c;
                ((AndroidComposeView)object2).Q(this, false);
            }
        }
    }

    public final float[] l() {
        boolean bl2;
        float[] fArray = this.m();
        float[] fArray2 = this.i;
        if (fArray2 == null) {
            this.i = fArray2 = QK1.a();
        }
        if (!(bl2 = lk1_0.a(fArray, fArray2))) {
            fArray2 = null;
        }
        return fArray2;
    }

    public final float[] m() {
        Z01 z01 = this;
        Object object = this.a;
        long l2 = ((W01)object).u;
        boolean bl2 = h72.d(l2);
        l2 = bl2 ? bo1_1.b(dj1.b(this.f)) : ((W01)object).u;
        float[] fArray = z01.h;
        QK1.d(fArray);
        float[] fArray2 = QK1.a();
        float f5 = -e72.d(l2);
        float f6 = -e72.e(l2);
        QK1.h(f5, f6, 0.0f, fArray2);
        QK1.g(fArray, fArray2);
        fArray2 = QK1.a();
        object = ((W01)object).a;
        f5 = object.F();
        f6 = object.E();
        QK1.h(f5, f6, 0.0f, fArray2);
        double d2 = object.G();
        double d5 = Math.PI;
        d2 *= d5;
        double d7 = 180.0;
        float f7 = (float)Math.cos(d2 /= d7);
        f5 = (float)Math.sin(d2);
        int n3 = 1;
        float f8 = fArray2[n3];
        int n4 = 2;
        float f11 = fArray2[n4];
        float f12 = f8 * f7;
        float f14 = f11 * f5;
        f12 -= f14;
        f11 = f11 * f7 + (f8 *= f5);
        int n7 = 5;
        f14 = fArray2[n7];
        int n8 = 6;
        float f15 = fArray2[n8];
        float f16 = f14 * f7;
        float f17 = f15 * f5;
        f16 -= f17;
        f15 = f15 * f7 + (f14 *= f5);
        int n10 = 9;
        f17 = fArray2[n10];
        int n14 = 10;
        float f18 = fArray2[n14];
        float f19 = f17 * f7;
        float f20 = f18 * f5;
        f19 -= f20;
        f18 = f18 * f7 + (f17 *= f5);
        int n15 = 13;
        f20 = fArray2[n15];
        int n16 = 14;
        float f22 = fArray2[n16];
        float f23 = f20 * f7;
        float f24 = f22 * f5;
        f23 -= f24;
        f22 = f22 * f7 + (f20 *= f5);
        fArray2[n3] = f12;
        fArray2[n4] = f11;
        fArray2[n7] = f16;
        fArray2[n8] = f15;
        fArray2[n10] = f19;
        fArray2[n14] = f18;
        fArray2[n15] = f23;
        fArray2[n16] = f22;
        d2 = (double)object.l() * d5 / d7;
        float f25 = (float)Math.cos(d2);
        f5 = (float)Math.sin(d2);
        float f26 = fArray2[0];
        float f27 = fArray2[n4];
        float f28 = f26 * f25;
        f7 = f27 * f5 + f28;
        f26 = -f26 * f5;
        f27 = f27 * f25 + f26;
        int n17 = 4;
        f28 = fArray2[n17];
        f8 = fArray2[n8];
        f11 = f28 * f25;
        f12 = f8 * f5 + f11;
        f28 = -f28 * f5;
        f8 = f8 * f25 + f28;
        float f29 = fArray2[8];
        f14 = fArray2[n14];
        f15 = f29 * f25;
        f16 = f14 * f5 + f15;
        f29 = -f29 * f5;
        f14 = f14 * f25 + f29;
        int n18 = 12;
        f28 = fArray2[n18];
        f17 = fArray2[n16];
        f18 = f28 * f25;
        f19 = f17 * f5 + f18;
        f28 = -f28 * f5;
        f17 = f17 * f25 + f28;
        fArray2[0] = f7;
        fArray2[n4] = f27;
        fArray2[n17] = f12;
        fArray2[n8] = f8;
        fArray2[8] = f16;
        fArray2[n14] = f14;
        fArray2[n18] = f19;
        fArray2[n16] = f17;
        QK1.e(object.o(), fArray2);
        f5 = object.z();
        float f30 = object.J();
        QK1.f(f5, f30, 1.0f, fArray2);
        QK1.g(fArray, fArray2);
        object = QK1.a();
        float f31 = e72.d(l2);
        float f34 = e72.e(l2);
        QK1.h(f31, f34, 0.0f, (float[])object);
        QK1.g(fArray, (float[])object);
        return fArray;
    }
}

