/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.os.Build$VERSION
 */
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dg2
 */
public final class dg2_0 {
    public boolean a = true;
    public final Outline b;
    public Cg2 c;
    public ki d;
    public gn2 e;
    public boolean f;
    public boolean g;
    public gn2 h;
    public NP2 i;
    public float j;
    public long k;
    public long l;
    public boolean m;

    public dg2_0() {
        long l2;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.b = outline;
        this.k = l2 = 0L;
        this.l = l2;
    }

    public final void a(iL iL2) {
        block6: {
            float f5;
            float f6;
            float f7;
            block7: {
                gn2 gn22;
                int n3;
                iL iL3;
                block9: {
                    long l2;
                    float f8;
                    float f11;
                    float f12;
                    Object object;
                    dg2_0 dg2_02;
                    block8: {
                        float f14;
                        float f15;
                        float f16;
                        float f17;
                        int n4;
                        block5: {
                            dg2_02 = this;
                            iL3 = iL2;
                            this.d();
                            object = this.e;
                            n3 = 1;
                            f7 = Float.MIN_VALUE;
                            if (object == null) break block5;
                            iL2.o((gn2)object, n3);
                            break block6;
                        }
                        f6 = this.j;
                        f5 = 0.0f;
                        gn22 = null;
                        float f18 = f6 - 0.0f;
                        float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                        if (f19 <= 0) break block7;
                        gn22 = this.h;
                        NP2 nP2 = this.i;
                        if (gn22 == null) break block8;
                        long l3 = this.k;
                        long l4 = this.l;
                        if (nP2 == null || !(n4 = QP2.a(nP2)) || (n4 = (f17 = (f12 = nP2.a) - (f11 = e72.d(l3))) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1)) || (n4 = (f16 = (f12 = nP2.b) - (f11 = e72.e(l3))) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1))) break block8;
                        f11 = e72.d(l3);
                        f11 = nP2.c;
                        f12 = C63.d(l4) + f11;
                        float f20 = f11 - f12;
                        n4 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                        if (n4) break block8;
                        float f22 = e72.e(l3);
                        f22 = nP2.d;
                        float f23 = C63.b(l4) + f22;
                        float f24 = f22 - f23;
                        float f25 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                        if (f25 == false && (f15 = (f14 = (f8 = r90_0.b(l2 = nP2.e)) - f6) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) == false) break block9;
                    }
                    float f26 = e72.d(dg2_02.k);
                    float f27 = e72.e(dg2_02.k);
                    f6 = e72.d(dg2_02.k);
                    f11 = C63.d(dg2_02.l) + f6;
                    f6 = e72.e(dg2_02.k);
                    f12 = C63.b(dg2_02.l) + f6;
                    f6 = dg2_02.j;
                    l2 = s90.a(f6, f6);
                    f6 = r90_0.b(l2);
                    f8 = r90_0.c(l2);
                    long l7 = s90.a(f6, f8);
                    object = new NP2(f26, f27, f11, f12, l7, l7, l7, l7);
                    if (gn22 == null) {
                        gn22 = ni.a();
                    } else {
                        gn22.reset();
                    }
                    fn2.a(gn22, (NP2)object);
                    dg2_02.i = object;
                    dg2_02.h = gn22;
                }
                iL3.o(gn22, n3);
                break block6;
            }
            long l8 = this.k;
            f6 = e72.d(l8);
            long l12 = this.k;
            f7 = e72.e(l12);
            long l14 = this.k;
            f5 = e72.d(l14);
            float f28 = C63.d(this.l);
            f5 += f28;
            long l15 = this.k;
            f28 = e72.e(l15);
            long l16 = this.l;
            float f29 = C63.b(l16);
            f28 += f29;
            int n7 = 1;
            f29 = Float.MIN_VALUE;
            iL2.f(f6, f7, f5, f28, n7);
        }
    }

    public final Outline b() {
        Outline outline;
        this.d();
        boolean bl2 = this.m;
        if (bl2 && (bl2 = this.a)) {
            outline = this.b;
        } else {
            bl2 = false;
            outline = null;
        }
        return outline;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean c(Cg2 var1_1, float var2_2, boolean var3_3, float var4_4, long var5_5) {
        var7_6 = this.b;
        var7_6.setAlpha(var2_2);
        var8_7 = this.c;
        var9_8 = Intrinsics.areEqual(var8_7, var1_1);
        var10_9 = true;
        if (var9_8 ^= var10_9) {
            this.c = var1_1;
            this.f = var10_9;
        }
        this.l = var5_5;
        if (var1_1 == null) ** GOTO lbl-1000
        if (var3_3 != 0) ** GOTO lbl-1000
        var1_1 = null;
        cfr_temp_0 = var4_4 - 0.0f;
        var11_10 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var11_10 > 0) lbl-1000:
        // 2 sources

        {
            var11_10 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var11_10 = 0;
            var1_1 = null;
        }
        var3_3 = this.m;
        if (var3_3 != var11_10) {
            this.m = var11_10;
            this.f = var10_9;
        }
        return var9_8;
    }

    public final void d() {
        int n3 = this.f;
        if (n3 != 0) {
            float f5;
            long l2;
            float f6;
            float f7;
            int n4;
            long l3;
            this.k = l3 = 0L;
            n3 = 0;
            float f8 = 0.0f;
            Object object = null;
            this.j = 0.0f;
            this.e = null;
            int n7 = 0;
            float f11 = 0.0f;
            this.f = false;
            this.g = false;
            Object object2 = this.c;
            Outline outline = this.b;
            if (object2 != null && (n4 = this.m) != 0 && (n4 = (f7 = (f6 = C63.d(l2 = this.l)) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0 && (n3 = (f5 = (f6 = C63.b(l2 = this.l)) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
                f8 = Float.MIN_VALUE;
                this.a = true;
                n3 = object2 instanceof Cg2$b;
                if (n3 != 0) {
                    long l4;
                    object2 = (Cg2$b)object2;
                    object = ((Cg2$b)object2).a;
                    f11 = ((aG2)object).a;
                    f6 = ((aG2)object).b;
                    this.k = l4 = h72.a(f11, f6);
                    f11 = ((aG2)object).d();
                    float f12 = ((aG2)object).c();
                    this.l = l4 = bo1_1.a(f11, f12);
                    f11 = ((aG2)object).a;
                    n7 = Math.round(f11);
                    n4 = Math.round(f6);
                    f12 = ((aG2)object).c;
                    int n8 = Math.round(f12);
                    f8 = ((aG2)object).d;
                    n3 = Math.round(f8);
                    outline.setRect(n7, n4, n8, n3);
                } else {
                    n3 = object2 instanceof Cg2$c;
                    if (n3 != 0) {
                        long l7;
                        object2 = (Cg2$c)object2;
                        object = ((Cg2$c)object2).a;
                        long l8 = ((NP2)object).e;
                        f11 = r90_0.b(l8);
                        float f14 = ((NP2)object).a;
                        f6 = ((NP2)object).b;
                        this.k = l7 = h72.a(f14, f6);
                        float f15 = ((NP2)object).b();
                        float f16 = ((NP2)object).a();
                        this.l = l7 = bo1_1.a(f15, f16);
                        int n10 = QP2.a((NP2)object);
                        if (n10 != 0) {
                            n10 = Math.round(f14);
                            int n14 = Math.round(f6);
                            f14 = ((NP2)object).c;
                            int n15 = Math.round(f14);
                            f8 = ((NP2)object).d;
                            int n16 = Math.round(f8);
                            Outline outline2 = this.b;
                            outline2.setRoundRect(n10, n14, n15, n16, f11);
                            this.j = f11;
                        } else {
                            object2 = this.d;
                            if (object2 == null) {
                                this.d = object2 = ni.a();
                            }
                            ((ki)object2).reset();
                            fn2.a((gn2)object2, (NP2)object);
                            this.e((gn2)object2);
                        }
                    } else {
                        n3 = object2 instanceof Cg2$a;
                        if (n3 != 0) {
                            object2 = (Cg2$a)object2;
                            object = ((Cg2$a)object2).a;
                            this.e((gn2)object);
                        }
                    }
                }
            } else {
                outline.setEmpty();
            }
        }
    }

    public final void e(gn2 object) {
        block4: {
            block3: {
                Outline outline;
                int n3;
                int n4;
                block2: {
                    n4 = Build.VERSION.SDK_INT;
                    int n7 = 28;
                    n3 = 1;
                    outline = this.b;
                    if (n4 > n7 || (n4 = (int)(object.e() ? 1 : 0)) != 0) break block2;
                    n4 = 0;
                    Object var6_6 = null;
                    this.a = false;
                    outline.setEmpty();
                    this.g = n3;
                    break block3;
                }
                n4 = object instanceof ki;
                if (n4 == 0) break block4;
                gn2 gn22 = object;
                gn22 = ((ki)object).a;
                outline.setConvexPath((Path)gn22);
                n4 = outline.canClip() ^ n3;
                this.g = n4;
            }
            this.e = (gn2)object;
            return;
        }
        object = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        throw object;
    }
}

