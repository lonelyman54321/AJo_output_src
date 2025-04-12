/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

/*
 * Renamed from Ia0
 */
public final class ia0_0 {
    /*
     * Unable to fully structure code
     */
    public static final void a(ob0_1 var0, boolean var1_1, b30_0 var2_2, int var3_3, int var4_4) {
        block15: {
            block14: {
                block17: {
                    block16: {
                        block13: {
                            var5_5 = var3_3;
                            var6_6 = var4_4;
                            var7_7 = -1811990916;
                            var8_8 = var2_2;
                            var9_9 = var2_2.g(var7_7);
                            var10_10 = var4_4 & 1;
                            var11_11 = var10_10 != 0 ? var3_3 | 2 : var3_3;
                            var12_12 = var6_6 & 2;
                            if (var12_12 != 0) {
                                var11_11 |= 48;
                                while (true) {
                                    var13_13 = var1_1;
                                    break;
                                }
                            } else {
                                if (var13_13 = var5_5 & 112) ** continue;
                                var13_13 = var1_1;
                                var14_14 = (int)var9_9.a(var1_1);
                                var14_14 = var14_14 != 0 ? 32 : 16;
                                var11_11 |= var14_14;
                            }
                            var14_14 = 1;
                            if (var10_10 != var14_14 || (var11_11 &= 91) != (var15_15 = 18) || (var11_11 = (int)var9_9.h()) == 0) break block13;
                            var9_9.D();
                            var8_8 = var0;
                            break block14;
                        }
                        var11_11 = 0;
                        var16_16 = null;
                        if (var10_10 != 0) {
                            var10_10 = 0;
                            var8_8 = null;
                        } else {
                            var8_8 = var0;
                        }
                        var15_15 = 0;
                        if (var12_12 != 0) {
                            var13_13 = false;
                        }
                        var17_17 = LP1$a.b;
                        var18_18 = 1065353216;
                        var19_19 = 1.0f;
                        var17_17 = j.c((LP1)var17_17, var19_19);
                        var20_20 = OX.f;
                        var22_21 = fg2_1.a;
                        var23_22 = a.b((LP1)var17_17, var20_20, (i13)var22_21);
                        var12_12 = 50;
                        var24_23 = var12_12;
                        var25_24 = 7;
                        var17_17 = h.i((LP1)var23_22, 0.0f, 0.0f, 0.0f, var24_23, var25_24);
                        var26_25 = zp.c;
                        var27_26 = Nc$a.m;
                        var26_25 = oZ.a((zp$l)var26_25, var27_26, (b30_0)var9_9, 0);
                        var28_27 = var9_9.P;
                        var22_21 = var9_9.P();
                        var17_17 = a30_0.c((b30_0)var9_9, (LP1)var17_17);
                        N20.W.getClass();
                        var23_22 = N20$a.b;
                        var29_28 = var9_9.a;
                        var30_29 = var29_28 instanceof mp;
                        if (!var30_29) break block15;
                        var9_9.A();
                        var30_29 = var9_9.O;
                        if (var30_29) {
                            var9_9.C((Function0)var23_22);
                        } else {
                            var9_9.n();
                        }
                        var23_22 = N20$a.e;
                        Ow3.a((b30_0)var9_9, var26_25, (Function2)var23_22);
                        var26_25 = N20$a.d;
                        Ow3.a((b30_0)var9_9, var22_21, (Function2)var26_25);
                        var26_25 = N20$a.f;
                        var31_30 = var9_9.O;
                        if (var31_30 || !(var31_30 = Intrinsics.areEqual(var22_21 = var9_9.v(), var23_22 = Integer.valueOf(var28_27)))) {
                            rk_0.a(var28_27, (j30_0)var9_9, var28_27, (N20$a$a)var26_25);
                        }
                        var26_25 = N20$a.c;
                        Ow3.a((b30_0)var9_9, var17_17, (Function2)var26_25);
                        ia0_0.c((b30_0)var9_9, 0);
                        if (!var13_13) break block16;
                        var12_12 = -1590031053;
                        var24_23 = -6.303672E-19f;
                        var9_9.K(var12_12);
                        if (var8_8 != null && (var17_17 = var8_8.p) != null) {
                            var16_16 = (Integer)var17_17.getValue();
                        }
                        var18_18 = 200;
                        var19_19 = 2.8E-43f;
                        var28_27 = 299;
                        var17_17 = new c(var18_18, var28_27, var14_14);
                        if (var16_16 == null) ** GOTO lbl-1000
                        var11_11 = var16_16.intValue();
                        if ((var11_11 = (int)var17_17.e(var11_11)) != 0) {
                            var9_9.K(-1589946299);
                            ia0_0.b(R$string.coupon_bonanza_not_active, (b30_0)var9_9, 0);
                            var11_11 = R$string.coupon_bonanza_ended_text_2;
                            ia0_0.d(var11_11, (b30_0)var9_9, 0);
                            var9_9.T(false);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_9.K(-1589762717);
                            ia0_0.b(R$string.coupon_bonanza_ended_text_3, (b30_0)var9_9, 0);
                            var11_11 = R$string.coupon_bonanza_ended_text_4;
                            ia0_0.d(var11_11, (b30_0)var9_9, 0);
                            var9_9.T(false);
                        }
                        var9_9.T(false);
                        break block17;
                    }
                    var9_9.K(-1589575043);
                    var11_11 = R$string.coupon_bonanza_ended_text_2;
                    ia0_0.d(var11_11, (b30_0)var9_9, 0);
                    var9_9.T(false);
                }
                var9_9.T((boolean)var14_14);
            }
            var9_9 = var9_9.X();
            if (var9_9 != null) {
                var16_16 = new da0_0((ob0_1)var8_8, var13_13, var5_5, var6_6);
                var9_9.d = var16_16;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(int n3, b30_0 b30_02, int n4) {
        int n7;
        Object object;
        int n8 = n3;
        int n10 = n4;
        int n14 = -866504988;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n14);
        int n15 = n4 & 0xE;
        int n16 = 2;
        if (n15 == 0) {
            n15 = (int)(((j30_0)object3).c(n3) ? 1 : 0);
            n15 = n15 != 0 ? 4 : 2;
            n15 |= n10;
        } else {
            n15 = n4;
        }
        if ((n15 &= 0xB) == n16 && (n15 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            object2 = nk_0.f((b30_0)object3, n8);
            object = new Sl$a();
            int n17 = 20;
            long l2 = Em3.f(n17);
            long l3 = Em3.e(0.5);
            long l4 = 0L;
            long l7 = 0L;
            int n18 = 65405;
            S93 s93 = new S93(l4, l2, null, null, null, null, null, l3, null, null, null, l7, null, null, n18);
            n7 = ((Sl$a)object).g(s93);
            ((Sl$a)object).c((String)object2);
            object2 = Unit.a;
            object2 = ((Sl$a)object).h();
            object = LP1$a.b;
            float f5 = 8;
            object = j.c(h.i((LP1)object, f5, f5, f5, 0.0f, 8), 1.0f);
            n7 = 3;
            Cj3 cj3 = new Cj3(n7);
            n18 = 0;
            long l8 = 0L;
            long l12 = 0L;
            long l14 = 0L;
            long l15 = 0L;
            int n19 = 261628;
            Ll3.c((Sl)object2, (LP1)object, l8, l12, null, null, null, l14, null, cj3, l15, 0, false, 0, 0, null, null, null, (b30_0)object3, 0, 0, n19);
        }
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            ((CF2)object3).d = object2 = new ea0_1(n8, n10);
        }
        return;
        finally {
            ((Sl$a)object).e(n7);
        }
    }

    public static final void c(b30_0 object, int n3) {
        block9: {
            Object object2;
            block8: {
                block7: {
                    boolean bl2;
                    int bl22 = -1632135128;
                    object = object.g(bl22);
                    if (n3 != 0 || !(bl2 = ((j30_0)object).h())) break block7;
                    ((j30_0)object).D();
                    break block8;
                }
                object2 = j.c(LP1$a.b, 1.0f);
                Object object3 = new ga0_1(0);
                object2 = CY2.b((LP1)object2, false, (Function1)object3);
                int n4 = 8;
                float f5 = n4;
                object2 = h.e((LP1)object2, f5);
                object3 = HA.e(Nc$a.e, false);
                int n7 = ((j30_0)object).P;
                Object object4 = ((j30_0)object).P();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl3 = mp2 instanceof mp;
                if (!bl3) break block9;
                ((j30_0)object).A();
                bl3 = ((j30_0)object).O;
                if (bl3) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object3);
                object3 = N20$a.f;
                boolean bl4 = ((j30_0)object).O;
                if (bl4 || !(bl4 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), serializable = Integer.valueOf(n7)))) {
                    rk_0.a(n7, (j30_0)object, n7, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object3 = km2.a(R$drawable.ic_coupon_bonanza_ended, (b30_0)object, 0);
                bl3 = false;
                mp2 = null;
                n7 = 0;
                bl4 = false;
                object4 = null;
                serializable = null;
                int n8 = 56;
                int n10 = 124;
                Pd1.a((im2)object3, null, null, null, null, 0.0f, null, (b30_0)object, n8, n10);
                boolean bl5 = true;
                ((j30_0)object).T(bl5);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new ha0_0(n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void d(int n3, b30_0 b30_02, int n4) {
        Sl$a sl$a;
        int n7 = n3;
        int n8 = n4;
        int n10 = 1111893156;
        Object object = b30_02;
        Object object2 = b30_02.g(n10);
        int n14 = 14;
        int n15 = n4 & 0xE;
        int n16 = 2;
        float f5 = 2.8E-45f;
        if (n15 == 0) {
            n15 = (int)(((j30_0)object2).c(n3) ? 1 : 0);
            n15 = n15 != 0 ? 4 : 2;
            n15 |= n8;
        } else {
            n15 = n4;
        }
        if ((n15 &= 0xB) == n16 && (n15 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
        } else {
            Object object3 = nk_0.f((b30_0)object2, n7);
            sl$a = new Sl$a();
            long l2 = Em3.f(n14);
            long l3 = Em3.e(0.5);
            long l4 = 0L;
            Cj3 cj3 = null;
            long l7 = 0L;
            int n17 = 65405;
            S93 s93 = new S93(l4, l2, null, null, null, null, null, l3, null, null, null, l7, null, null, n17);
            object = s93;
            n14 = sl$a.g(s93);
            sl$a.c((String)object3);
            object3 = Unit.a;
            object = sl$a.h();
            object3 = LP1$a.b;
            f5 = 8;
            int n18 = 12;
            float f6 = n18;
            object3 = j.c(h.h((LP1)object3, f5, f5, f5, f6), 1.0f);
            n16 = 3;
            f5 = 4.2E-45f;
            cj3 = new Cj3(n16);
            long l8 = 0L;
            l4 = 0L;
            long l12 = 0L;
            l3 = 0L;
            int n19 = 261628;
            Ll3.c((Sl)object, (LP1)object3, l8, l4, null, null, null, l12, null, cj3, l3, 0, false, 0, 0, null, null, null, (b30_0)object2, 0, 0, n19);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new fa0_0(n7, n8);
        }
        return;
        finally {
            sl$a.e(n14);
        }
    }
}

