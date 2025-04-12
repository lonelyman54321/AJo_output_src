/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 */
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class W01 {
    public final a a;
    public Vo0 b;
    public bp1_0 c;
    public Function1 d;
    public final U01 e;
    public Outline f;
    public boolean g;
    public long h;
    public long i;
    public float j;
    public Cg2 k;
    public gn2 l;
    public ki m;
    public boolean n;
    public ei o;
    public int p;
    public final nu_0 q;
    public boolean r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public RectF w;

    static {
        int n3;
        int n4 = qp1_1.a;
        n4 = qp1_1.a;
        if (n4 == 0 && (n4 = Build.VERSION.SDK_INT) < (n3 = 28) && n4 >= (n3 = 22)) {
            kg3_0 kg3_02 = kg3_0.a;
            kg3_02.a();
        }
    }

    public W01(a a2) {
        nu_0 nu_02;
        long l2;
        long l3;
        this.a = a2;
        Object object = ft0.a;
        this.b = object;
        object = bp1_0.Ltr;
        this.c = object;
        object = V01.c;
        this.d = object;
        super(this);
        this.e = object;
        this.g = true;
        this.h = l3 = 0L;
        this.i = l2 = 9205357640488583168L;
        super();
        this.q = nu_02;
        a2.r(false);
        this.s = l3;
        this.t = l3;
        this.u = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a() {
        block9: {
            block12: {
                block11: {
                    block10: {
                        var1_1 /* !! */  = this.g;
                        if (var1_1 /* !! */  == 0) break block9;
                        var1_1 /* !! */  = this.v;
                        var2_2 /* !! */  = 0;
                        var3_3 = 0.0f;
                        var4_4 = null;
                        var5_5 = this.a;
                        if (var1_1 /* !! */  != 0) break block10;
                        var6_6 = var5_5.I();
                        var7_7 = 0;
                        var8_8 = 0.0f;
                        var9_9 /* !! */  = null;
                        cfr_temp_0 = var6_6 - 0.0f;
                        var1_1 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                        if (var1_1 /* !! */  > 0) break block10;
                        var5_5.r(false);
                        var10_10 = 0L;
                        var5_5.A(null, var10_10);
                        break block9;
                    }
                    if ((var12_13 = this.l) == null) ** GOTO lbl79
                    var9_9 /* !! */  = this.w;
                    if (var9_9 /* !! */  == null) {
                        this.w = var9_9 /* !! */  = new RectF();
                    }
                    var13_14 = var12_13 instanceof ki;
                    var14_16 = "Unable to obtain android.graphics.Path";
                    if (!var13_14) ** GOTO lbl77
                    var15_17 = var12_13;
                    var15_17 = ((ki)var12_13).a;
                    var15_17.computeBounds(var9_9 /* !! */ , false);
                    var16_18 = Build.VERSION.SDK_INT;
                    var17_20 = 28;
                    var18_22 = true;
                    if (var16_18 > var17_20 || (var17_20 = (int)var12_13.e()) != 0) break block11;
                    var19_23 = this.f;
                    if (var19_23 != null) {
                        var19_23.setEmpty();
                    }
                    this.n = var18_22;
                    var5_5.getClass();
                    var17_20 = 0;
                    var20_25 = null;
                    ** GOTO lbl56
                }
                var20_25 = this.f;
                if (var20_25 == null) {
                    this.f = var20_25 = new Outline();
                }
                if (var16_18 < (var21_26 = 30)) break block12;
                var19_24 = Gg2.a;
                var19_24.a(var20_25, (gn2)var12_13);
                ** GOTO lbl55
            }
            if (var13_14) {
                var20_25.setConvexPath((Path)var15_17);
lbl55:
                // 2 sources

                this.n = var13_14 = var20_25.canClip() ^ var18_22;
lbl56:
                // 2 sources

                this.l = var12_13;
                if (var20_25 != null) {
                    var6_6 = var5_5.getAlpha();
                    var20_25.setAlpha(var6_6);
                    var4_4 = var20_25;
                }
                var6_6 = var9_9 /* !! */ .width();
                var1_1 /* !! */  = Math.round(var6_6);
                var8_8 = var9_9 /* !! */ .height();
                var7_7 = Math.round(var8_8);
                var10_11 = dj1.a(var1_1 /* !! */ , var7_7);
                var5_5.A(var4_4, var10_11);
                var1_1 /* !! */  = (int)this.n;
                if (var1_1 /* !! */  != 0 && (var1_1 /* !! */  = (int)this.v) != 0) {
                    var5_5.r(false);
                    var5_5.n();
                } else {
                    var1_1 /* !! */  = (int)this.v;
                    var5_5.r((boolean)var1_1 /* !! */ );
                }
            } else {
                var12_13 = new UnsupportedOperationException(var14_16);
                throw var12_13;
lbl77:
                // 1 sources

                var12_13 = new UnsupportedOperationException(var14_16);
                throw var12_13;
lbl79:
                // 1 sources

                var1_1 /* !! */  = this.v;
                var5_5.r((boolean)var1_1 /* !! */ );
                var12_13 = this.f;
                if (var12_13 == null) {
                    var12_13 = new Outline();
                    this.f = var12_13;
                }
                var10_12 = dj1.b(this.t);
                var22_27 = this.h;
                var24_28 = this.i;
                var26_29 = 9205357640488583168L;
                cfr_temp_1 = var24_28 - var26_29;
                var2_2 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                var26_29 = var2_2 /* !! */  == 0 ? var10_12 : var24_28;
                var13_15 = Math.round(e72.d(var22_27));
                var2_2 /* !! */  = Math.round(e72.e(var22_27));
                var8_8 = e72.d(var22_27);
                var28_30 = C63.d(var26_29) + var8_8;
                var16_19 = Math.round(var28_30);
                var8_8 = e72.e(var22_27);
                var29_31 = C63.b(var26_29) + var8_8;
                var17_21 = Math.round(var29_31);
                var30_32 = this.j;
                var9_9 /* !! */  = var12_13;
                var31_33 = var16_19;
                var16_19 = var17_21;
                var12_13.setRoundRect(var13_15, var2_2 /* !! */ , var31_33, var17_21, var30_32);
                var3_3 = var5_5.getAlpha();
                var12_13.setAlpha(var3_3);
                var2_2 /* !! */  = Math.round(C63.d(var26_29));
                var8_8 = C63.b(var26_29);
                var7_7 = Math.round(var8_8);
                var32_34 = var2_2 /* !! */ ;
                var2_2 /* !! */  = 32;
                var3_3 = 4.5E-44f;
                var34_35 = var7_7;
                var36_36 = 0xFFFFFFFFL;
                var10_12 = (var32_34 <<= var2_2 /* !! */ ) | (var34_35 &= var36_36);
                var5_5.A((Outline)var12_13, var10_12);
            }
        }
        this.g = false;
    }

    public final void b() {
        W01 w01 = this;
        int n3 = this.r;
        if (n3 != 0 && (n3 = this.p) == 0) {
            Object object = this.q;
            Object[] objectArray = ((nu_0)object).a;
            if (objectArray != null) {
                objectArray.d();
                objectArray = null;
                ((nu_0)object).a = null;
            }
            if ((object = ((nu_0)object).c) != null) {
                objectArray = ((ft2_0)object).b;
                long[] lArray = ((ft2_0)object).a;
                int n4 = lArray.length + -2;
                if (n4 >= 0) {
                    int n7 = 0;
                    while (true) {
                        long l2 = lArray[n7];
                        long l3 = l2 ^ (long)-1;
                        int n8 = 7;
                        l3 = l3 << n8 & l2;
                        long l4 = -9187201950435737472L;
                        long l7 = (l3 &= l4) - l4;
                        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object2 != false) {
                            int n10 = ~(n7 - n4) >>> 31;
                            int n14 = 8;
                            n10 = 8 - n10;
                            for (n8 = 0; n8 < n10; ++n8) {
                                long l8 = 0xFFL & l2;
                                long l12 = 128L;
                                long l14 = l8 - l12;
                                Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                if (object3 < 0) {
                                    int n15 = (n7 << 3) + n8;
                                    W01 w012 = (W01)objectArray[n15];
                                    w012.d();
                                }
                                l2 >>= n14;
                            }
                            if (n10 != n14) break;
                        }
                        if (n7 == n4) break;
                        ++n7;
                    }
                }
                ((pr1_1)object).e();
            }
            object = w01.a;
            object.n();
        }
    }

    public final Cg2 c() {
        W01 w01 = this;
        Object object = this.k;
        Object object2 = this.l;
        if (object == null) {
            if (object2 != null) {
                object = new Cg2$a((gn2)object2);
                this.k = object;
            } else {
                long l2 = dj1.b(this.t);
                long l3 = this.h;
                long l4 = this.i;
                long l7 = 9205357640488583168L;
                long l8 = l4 - l7;
                Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object3 != false) {
                    l2 = l4;
                }
                float f5 = e72.d(l3);
                float f6 = e72.e(l3);
                float f7 = C63.d(l2);
                float f8 = f7 + f5;
                float f11 = C63.b(l2) + f6;
                float f12 = w01.j;
                object2 = null;
                float f14 = f12 - 0.0f;
                float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (f15 > 0) {
                    l3 = s90.a(f12, f12);
                    f12 = r90_0.b(l3);
                    f7 = r90_0.c(l3);
                    long l12 = s90.a(f12, f7);
                    object = new NP2(f5, f6, f8, f11, l12, l12, l12, l12);
                    object = object2 = new Cg2$c((NP2)object);
                } else {
                    object2 = new aG2(f5, f6, f8, f11);
                    object = new Cg2$b((aG2)object2);
                }
                w01.k = object;
            }
        }
        return object;
    }

    public final void d() {
        int n3;
        this.p = n3 = this.p + -1;
        this.b();
    }

    public final void e() {
        Object object;
        Object object2;
        boolean bl2;
        W01 w01 = this;
        Object object3 = this.q;
        Object object4 = ((nu_0)object3).a;
        ((nu_0)object3).b = object4;
        object4 = ((nu_0)object3).c;
        if (object4 != null && (bl2 = ((ft2_0)object4).c())) {
            object2 = ((nu_0)object3).d;
            if (object2 == null) {
                object2 = gt2_1.a();
                ((nu_0)object3).d = object2;
            }
            object = "elements";
            Intrinsics.checkNotNullParameter(object4, (String)object);
            ((pr1_1)object2).i((ft2_0)object4);
            ((pr1_1)object4).e();
        }
        ((nu_0)object3).e = true;
        object4 = w01.b;
        object2 = w01.c;
        object = w01.e;
        a a2 = w01.a;
        a2.C((Vo0)object4, (bp1_0)((Object)object2), w01, (Function1)object);
        object4 = null;
        ((nu_0)object3).e = false;
        object2 = ((nu_0)object3).b;
        if (object2 != null) {
            ((W01)object2).d();
        }
        if ((object3 = ((nu_0)object3).d) != null && (bl2 = ((ft2_0)object3).c())) {
            object2 = ((ft2_0)object3).b;
            object = ((ft2_0)object3).a;
            int n3 = ((Object)object).length + -2;
            if (n3 >= 0) {
                int n4 = 0;
                while (true) {
                    reference var10_10 = object[n4];
                    reference var12_11 = var10_10 ^ (long)-1;
                    int n7 = 7;
                    var12_11 = var12_11 << n7 & var10_10;
                    long l2 = -9187201950435737472L;
                    reference cfr_temp_0 = (var12_11 &= l2) - l2;
                    Object object5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (object5 != false) {
                        int n8 = ~(n4 - n3) >>> 31;
                        int n10 = 8;
                        n8 = 8 - n8;
                        for (n7 = 0; n7 < n8; ++n7) {
                            long l3 = 0xFFL & var10_10;
                            long l4 = 128L;
                            long l7 = l3 - l4;
                            Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object6 < 0) {
                                int n14 = (n4 << 3) + n7;
                                W01 w012 = (W01)object2[n14];
                                w012.d();
                            }
                            var10_10 >>= n10;
                        }
                        if (n8 != n10) break;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
            ((pr1_1)object3).e();
        }
    }

    public final void f(float f5) {
        a a2 = this.a;
        float f6 = a2.getAlpha();
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            a2.b(f5);
        }
    }

    public final void g(long l2, long l3, float f5) {
        gn2 gn22;
        float f6;
        float f7;
        long l4 = this.h;
        boolean bl2 = e72.b(l4, l2);
        if (!bl2 || !(bl2 = C63.a(l4 = this.i, l3)) || (bl2 = (f7 = (f6 = this.j) - f5) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) || (gn22 = this.l) != null) {
            this.k = null;
            this.l = null;
            this.g = true;
            bl2 = false;
            f6 = 0.0f;
            gn22 = null;
            this.n = false;
            this.h = l2;
            this.i = l3;
            this.j = f5;
            this.a();
        }
    }
}

