/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class wm3
extends LP1$c
implements rp1_1,
it0_0,
dy2_0 {
    public String n;
    public xm3 o;
    public RU0$a p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public gy_1 u;
    public Map v;
    public xm2_0 w;
    public wm3$b x;
    public wm3$a y;

    public static final void r1(wm3 wm32) {
        wm32.getClass();
        go0.f(wm32).J();
        go0.f(wm32).I();
        jt0_0.a(wm32);
    }

    public final /* synthetic */ void C0() {
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        Object object;
        wm3$b wm3$b = this.x;
        if (wm3$b == null) {
            this.x = wm3$b = new wm3$b(this);
        }
        Object object2 = this.n;
        int n3 = 6;
        Object object3 = new Sl(n3, (String)object2, null);
        object2 = RY2.a;
        object2 = MY2.v;
        object3 = kotlin.collections.a.b(object3);
        uY2.a((TY2)object2, object3);
        object3 = this.y;
        if (object3 != null) {
            boolean bl2 = ((wm3$a)object3).c;
            TY2 tY2 = MY2.x;
            gn1_2[] gn1_2Array = RY2.a;
            int n4 = 15;
            gn1_2 cfr_ignored_0 = gn1_2Array[n4];
            object2 = bl2;
            tY2.getClass();
            uY2.a(tY2, object2);
            object3 = ((wm3$a)object3).b;
            object2 = new Sl(n3, (String)object3, null);
            object3 = MY2.w;
            n3 = 14;
            object = gn1_2Array[n3];
            object3.getClass();
            uY2.a((TY2)object3, object2);
        }
        object3 = new wm3$c(this);
        object2 = yY2.j;
        object = new H1(null, (fx0_2)object3);
        uY2.a((TY2)object2, object);
        object3 = new wm3$d(this);
        object2 = yY2.k;
        object = new H1(null, (fx0_2)object3);
        uY2.a((TY2)object2, object);
        object3 = new wm3$e(this);
        object2 = yY2.l;
        object = new H1(null, (fx0_2)object3);
        uY2.a((TY2)object2, object);
        RY2.c(uY2, wm3$b);
    }

    public final int maxIntrinsicHeight(Rj1 object, Qj1 object2, int n3) {
        object2 = this.t1((Vo0)object);
        object = object.getLayoutDirection();
        return ((xm2_0)object2).a(n3, (bp1_0)((Object)object));
    }

    public final int maxIntrinsicWidth(Rj1 object, Qj1 object2, int n3) {
        object2 = this.t1((Vo0)object);
        object = object.getLayoutDirection();
        return Nj3.a(((xm2_0)object2).d((bp1_0)((Object)object)).b());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final bl1_0 measure-3p2s80s(dl1_1 var1_1, xk1_0 var2_2, long var3_3) {
        var5_4 = this;
        var6_5 = this.t1(var1_1);
        var7_6 = var1_1.getLayoutDirection();
        var8_7 = var6_5.g;
        var9_8 = 1;
        var10_9 = 1.4E-45f;
        if (var8_7 > var9_8) {
            var11_10 = var6_5.m;
            var12_11 = var6_5.b;
            var13_12 = var6_5.i;
            Intrinsics.checkNotNull(var13_12);
            var14_13 = var6_5.c;
            var6_5.m = var11_10 = jP1$a.a((jp1_1)var11_10, (bp1_0)var7_6, (xm3)var12_11, var13_12, var14_13);
            var15_14 = var6_5.g;
            var16_15 = var11_10.a(var15_14, var3_3);
        } else {
            var16_15 = var3_3;
        }
        var11_10 = var6_5.j;
        var18_16 = 32;
        var19_17 = 0xFFFFFFFFL;
        var21_18 = 3;
        var22_19 = 4.2E-45f;
        var23_20 = false;
        if (var11_10 == null || (var24_21 /* !! */  = var6_5.n) == null || (var25_22 = var24_21 /* !! */ .a()) != 0 || var7_6 != (var24_21 /* !! */  = var6_5.o)) ** GOTO lbl-1000
        var26_23 = var6_5.p;
        var25_22 = (int)c60.c(var16_15, var26_23);
        if (var25_22 != 0) ** GOTO lbl-1000
        var25_22 = c60.i(var16_15);
        if (var25_22 == (var30_25 = c60.i(var28_24 = var6_5.p)) && (var25_22 = (int)((cfr_temp_0 = (var31_26 = (float)c60.h(var16_15)) - (var32_27 = var11_10.getHeight())) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1))) >= 0) {
            var11_10 = var11_10.d;
            var8_7 = (int)var11_10.d;
            ** if (var8_7 != 0) goto lbl-1000
        }
        ** GOTO lbl-1000
lbl-1000:
        // 2 sources

        {
            if ((var35_29 = c60.c(var16_15, var33_28 = var6_5.p)) == 0) {
                var7_6 = var6_5.j;
                Intrinsics.checkNotNull(var7_6);
                var36_30 = var7_6.y();
                var31_26 = var7_6.getWidth();
                var36_30 = Math.min(var36_30, var31_26);
                var8_7 = Nj3.a(var36_30);
                var31_26 = var7_6.getHeight();
                var25_22 = Nj3.a(var31_26);
                var26_23 = dj1.a(var8_7, var25_22);
                var6_5.l = var26_23 = f60.e(var16_15, var26_23);
                var8_7 = (int)km3.b(var6_5.d, var21_18);
                if (var8_7 != 0 || (var8_7 = (int)((cfr_temp_1 = (var36_30 = (float)((int)(var37_31 = var26_23 >> var18_16))) - (var22_19 = var7_6.getWidth())) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1))) >= 0 && (var35_29 = (int)((cfr_temp_2 = (var36_30 = (float)(var8_7 = (int)(var26_23 &= var19_17))) - (var39_32 = var7_6.getHeight())) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1))) >= 0) {
                    var9_8 = 0;
                    var10_9 = 0.0f;
                    var40_33 = null;
                }
                var6_5.k = var9_8;
                var6_5.p = var16_15;
            }
            var9_8 = 0;
            var10_9 = 0.0f;
            var40_33 = null;
            ** GOTO lbl69
        }
lbl-1000:
        // 3 sources

        {
            var7_6 = var6_5.b(var16_15, (bp1_0)var7_6);
            var6_5.p = var16_15;
            var36_30 = var7_6.getWidth();
            var8_7 = Nj3.a(var36_30);
            var31_26 = var7_6.getHeight();
            var25_22 = Nj3.a(var31_26);
            var26_23 = dj1.a(var8_7, var25_22);
            var6_5.l = var16_15 = f60.e(var16_15, var26_23);
            var8_7 = (int)km3.b(var6_5.d, var21_18);
            if (var8_7 == 0 && ((var8_7 = (int)((cfr_temp_3 = (var36_30 = (float)((int)(var26_23 = var16_15 >> var18_16))) - (var22_19 = var7_6.getWidth())) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1))) < 0 || (var8_7 = (int)((cfr_temp_4 = (var36_30 = (float)((int)(var16_15 &= var19_17))) - (var41_34 = var7_6.getHeight())) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1))) < 0)) {
                var23_20 = true;
            }
            var6_5.k = var23_20;
            var6_5.j = var7_6;
        }
lbl69:
        // 2 sources

        var7_6 = var6_5.n;
        if (var7_6 != null) {
            var7_6.a();
        }
        var7_6 = Unit.a;
        var7_6 = var6_5.j;
        Intrinsics.checkNotNull(var7_6);
        var16_15 = var6_5.l;
        if (var9_8 != 0) {
            var42_35 = 2;
            go0.d(var5_4, var42_35).p1();
            var11_10 = var5_4.v;
            if (var11_10 == null) {
                var11_10 = new LinkedHashMap(var42_35);
            }
            var6_5 = Pc.a;
            var10_9 = var7_6.e();
            var9_8 = Math.round(var10_9);
            var40_33 = var9_8;
            var11_10.put(var6_5, var40_33);
            var6_5 = Pc.b;
            var39_32 = var7_6.q();
            var35_29 = Math.round(var39_32);
            var7_6 = var35_29;
            var11_10.put(var6_5, var7_6);
            var5_4.v = var11_10;
        }
        var43_36 = var16_15 >> var18_16;
        var35_29 = (int)var43_36;
        var45_37 = var16_15 & var19_17;
        var42_35 = (int)var45_37;
        var8_7 = 262142;
        var36_30 = 3.67339E-40f;
        var9_8 = Math.min(var35_29, var8_7);
        var15_14 = -1 >>> 1;
        var41_34 = 0.0f / 0.0f;
        if (var35_29 == var15_14) {
            var8_7 = -1 >>> 1;
            var36_30 = 0.0f / 0.0f;
        } else {
            var8_7 = Math.min(var35_29, var8_7);
        }
        var47_38 = var8_7 == var15_14 ? var9_8 : var8_7;
        var47_38 = f60.c(var47_38);
        if (var42_35 != var15_14) {
            var15_14 = Math.min(var47_38, var42_35);
        }
        var47_38 = Math.min(var47_38, var42_35);
        var45_37 = f60.a(var9_8, var8_7, var47_38, var15_14);
        var12_11 = var2_2;
        var11_10 = var2_2.Q(var45_37);
        var40_33 = var5_4.v;
        Intrinsics.checkNotNull(var40_33);
        var12_11 = new wm3$f((Ns2)var11_10);
        var11_10 = var1_1;
        return var1_1.V0(var35_29, var42_35, (Map)var40_33, (Function1)var12_11);
    }

    public final int minIntrinsicHeight(Rj1 object, Qj1 object2, int n3) {
        object2 = this.t1((Vo0)object);
        object = object.getLayoutDirection();
        return ((xm2_0)object2).a(n3, (bp1_0)((Object)object));
    }

    public final int minIntrinsicWidth(Rj1 object, Qj1 object2, int n3) {
        object2 = this.t1((Vo0)object);
        object = object.getLayoutDirection();
        return Nj3.a(((xm2_0)object2).d((bp1_0)((Object)object)).c());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(E60 object) {
        Throwable throwable2;
        boolean bl2;
        block14: {
            block15: {
                long l2;
                Object object2;
                Object object3;
                Jj3 jj3;
                Object object4;
                long l3;
                gi_0 gi_02;
                Object object5;
                int n3;
                block13: {
                    float f5;
                    ZD zD;
                    n3 = this.m;
                    if (n3 == 0) {
                        return;
                    }
                    object5 = this.t1((Vo0)object);
                    gi_02 = ((xm2_0)object5).j;
                    if (gi_02 == null) {
                        object = new StringBuilder("no paragraph (layoutCache=");
                        object5 = this.w;
                        ((StringBuilder)object).append(object5);
                        ((StringBuilder)object).append(", textSubstitution=");
                        object5 = this.y;
                        ((StringBuilder)object).append(object5);
                        ((StringBuilder)object).append(')');
                        object = ((StringBuilder)object).toString();
                        object = object.toString();
                        object5 = new IllegalArgumentException((String)object);
                        throw object5;
                    }
                    object = object.M0().a();
                    bl2 = ((xm2_0)object5).k;
                    if (bl2) {
                        l3 = ((xm2_0)object5).l;
                        long l4 = l3 >> 32;
                        float f6 = (int)l4;
                        long l7 = 0xFFFFFFFFL;
                        n3 = (int)(l3 &= l7);
                        float f7 = n3;
                        object.p();
                        int n4 = 1;
                        zD = null;
                        f5 = 0.0f;
                        object4 = object;
                        object.f(0.0f, 0.0f, f6, f7, n4);
                    }
                    try {
                        object5 = this.o;
                        object5 = ((xm3)object5).a;
                        object4 = ((S93)object5).m;
                        if (object4 == null) {
                            object4 = Jj3.b;
                        }
                        jj3 = object4;
                        object4 = ((S93)object5).n;
                        if (object4 == null) {
                            object4 = b13_0.d;
                        }
                        object3 = object4;
                        object4 = ((S93)object5).p;
                        if (object4 == null) {
                            object4 = rM0.a;
                        }
                        object2 = object4;
                        object5 = ((S93)object5).a;
                        zD = object5.d();
                        if (zD == null) break block13;
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                    object5 = this.o;
                    object5 = ((xm3)object5).a;
                    object5 = ((S93)object5).a;
                    f5 = object5.getAlpha();
                    int n7 = 3;
                    object4 = object;
                    gi_02.m((iL)object, zD, f5, (b13_0)object3, jj3, (Qt0)object2, n7);
                    break block15;
                }
                object5 = this.u;
                l3 = object5 != null ? object5.a() : OX.l;
                long l8 = l3 - (l2 = (long)16);
                n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                if (n3 == 0) {
                    object5 = this.o;
                    l3 = ((xm3)object5).b();
                    long l12 = l3 - l2;
                    n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
                    if (n3 != 0) {
                        object5 = this.o;
                        l3 = ((xm3)object5).b();
                    } else {
                        l3 = OX.b;
                    }
                }
                int n8 = 3;
                object4 = object;
                gi_02.r((iL)object, l3, (b13_0)object3, jj3, (Qt0)object2, n8);
            }
            if (bl2) {
                object.h();
            }
            return;
        }
        if (bl2) {
            object.h();
        }
        throw throwable2;
    }

    public final xm2_0 s1() {
        xm2_0 xm2_02 = this.w;
        if (xm2_02 == null) {
            String string2 = this.n;
            xm3 xm32 = this.o;
            RU0$a rU0$a = this.p;
            int n3 = this.q;
            boolean bl2 = this.r;
            int n4 = this.s;
            int n7 = this.t;
            this.w = xm2_02 = new xm2_0(string2, xm32, rU0$a, n3, bl2, n4, n7);
        }
        xm2_02 = this.w;
        Intrinsics.checkNotNull(xm2_02);
        return xm2_02;
    }

    public final xm2_0 t1(Vo0 vo0) {
        boolean bl2;
        Object object = this.y;
        if (object != null && (bl2 = ((wm3$a)object).c) && (object = ((wm3$a)object).d) != null) {
            ((xm2_0)object).c(vo0);
            return object;
        }
        object = this.s1();
        ((xm2_0)object).c(vo0);
        return object;
    }
}

