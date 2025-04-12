/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qB
 */
public final class qb_1
implements gx0_2 {
    public final /* synthetic */ Media a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ ResourceOwner d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Component f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;

    public qb_1(Media media, int n3, ft1_2 ft1_22, ResourceOwner resourceOwner, ac_1 ac_12, Component component, rc_2 rc_22, sc_1 sc_12) {
        this.a = media;
        this.b = n3;
        this.c = ft1_22;
        this.d = resourceOwner;
        this.e = ac_12;
        this.f = component;
        this.g = rc_22;
        this.h = sc_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        block21: {
            block17: {
                block20: {
                    block18: {
                        block19: {
                            block16: {
                                var4_4 = this;
                                var5_5 = var1_1;
                                var5_5 = (PA)var1_1;
                                var6_6 = var2_2;
                                var6_6 = (b30_0)var2_2;
                                var7_7 = var3_3;
                                var7_7 = (Number)var3_3;
                                var8_8 = var7_7.intValue();
                                var9_9 = "$this$BoxWithConstraints";
                                Intrinsics.checkNotNullParameter(var5_5, (String)var9_9);
                                var10_10 = var8_8 & 14;
                                if (var10_10 == 0) {
                                    var10_10 = (int)var6_6.J(var5_5);
                                    var10_10 = var10_10 != 0 ? 4 : 2;
                                    var8_8 |= var10_10;
                                }
                                if ((var8_8 &= 91) != (var10_10 = 18) || (var8_8 = (int)var6_6.h()) == 0) break block16;
                                var6_6.D();
                                break block17;
                            }
                            var7_7 = "IMAGE";
                            var9_9 = var4_4.a;
                            if (var9_9 == null || (var11_11 = var9_9.getType()) == null) {
                                var11_11 = var7_7;
                            }
                            var12_12 = var11_11.hashCode();
                            var13_13 = LP1$a.b;
                            var14_14 = 70564;
                            var15_15 = var4_4.b;
                            if (var12_12 == var14_14) break block18;
                            var14_14 = 69775675;
                            if (var12_12 == var14_14) break block19;
                            var8_8 = 81665115;
                            var16_16 = 5.221799E-36f;
                            if (var12_12 != var8_8 || (var8_8 = (int)var11_11.equals(var7_7 = "VIDEO")) == 0) ** GOTO lbl-1000
                            var8_8 = 1692803185;
                            var6_6.K(var8_8);
                            var16_16 = x20_0.e((b30_0)var6_6, var15_15);
                            var11_11 = j.d(var13_13, var16_16);
                            if (var9_9 != null && (var7_7 = var9_9.getUrl()) != null) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var7_7 = "";
                            ** while (true)
                            var17_17 = var7_7;
                            var18_18 = 0;
                            var19_19 = null;
                            var20_20 = 16;
                            var7_7 = var4_4.c;
                            var14_14 = var4_4.b;
                            var21_21 = 0;
                            var9_9 = var11_11;
                            var11_11 = var17_17;
                            var12_12 = var14_14;
                            var14_14 = 0;
                            var22_22 = null;
                            var23_23 = var6_6;
                            cc3_1.b((ft1_2)var7_7, (LP1)var9_9, (String)var17_17, var12_12, false, (b30_0)var6_6, 0, var20_20);
                            var6_6.E();
                            break block20;
                        }
                        var8_8 = (int)var11_11.equals(var7_7);
                        if (var8_8 != 0) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    var7_7 = "GIF";
                    var8_8 = (int)var11_11.equals(var7_7);
                    if (var8_8 == 0) lbl-1000:
                    // 3 sources

                    {
                        var8_8 = 1693019007;
                        var16_16 = 3.4446698E22f;
                        var6_6.K(var8_8);
                        var6_6.E();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_6.K(1692630050);
                        var8_8 = 64;
                        var16_16 = 9.0E-44f;
                        lB.a(var15_15, (Media)var9_9, (b30_0)var6_6, var8_8);
                        var6_6.E();
                    }
                }
                var7_7 = Nc$a.g;
                var7_7 = var5_5.a(var13_13, (Nc)var7_7);
                var24_24 = var4_4.d;
                var9_9 = new pb_1((ResourceOwner)var24_24);
                var17_17 = v10.c(-716645734, (fx0_2)var9_9, (b30_0)var6_6);
                var21_21 = 3072;
                var18_18 = 6;
                var10_10 = 0;
                var9_9 = null;
                var25_25 = 0;
                var26_26 = 0.0f;
                var11_11 = null;
                var22_22 = var6_6;
                OA.a((LP1)var7_7, null, false, (u10)var17_17, (b30_0)var6_6, var21_21, var18_18);
                if (var24_24 != null && (var7_7 = var24_24.isFollowed()) != null) {
                    var8_8 = (int)var7_7.booleanValue();
                } else {
                    var8_8 = 0;
                    var16_16 = 0.0f;
                    var7_7 = null;
                }
                var9_9 = var8_8 != 0 ? "Following" : "+ Follow";
                var11_11 = j.o(var13_13);
                var17_17 = Nc$a.c;
                var27_27 = var5_5.a((LP1)var11_11, (Nc)var17_17);
                var28_28 = uq0_0.s;
                var29_29 = x20_0.e((b30_0)var6_6, var15_15);
                var26_26 = uq0_0.p;
                var30_30 = var29_29 + var26_26;
                var31_31 = 9;
                var22_22 = androidx.compose.foundation.layout.h.i(var27_27, 0.0f, var30_30, var28_28, 0.0f, var31_31);
                var23_23 = tv0_0.o;
                var5_5 = var4_4.f;
                var11_11 = (ac_1)var4_4.e;
                var32_32 = new mb_1((ac_1)var11_11, (Component)var5_5, (boolean)var8_8);
                var33_33 = 196608;
                var8_8 = 0;
                var16_16 = 0.0f;
                var12_12 = 0;
                var18_18 = 0;
                var19_19 = null;
                var20_20 = 0;
                var24_24 = null;
                var34_34 = null;
                var35_35 = var6_6;
                var4_4 = var13_13;
                var36_36 = 717;
                ov3.f(false, (String)var9_9, 0.0f, 0.0f, (LP1)var22_22, (tv0_0)var23_23, 0.0f, null, var32_32, false, (b30_0)var6_6, var33_33, var36_36);
                var37_37 = 1065353216;
                var29_29 = 1.0f;
                var7_7 = j.c(var13_13, var29_29);
                var38_38 = uq0_0.o;
                var26_26 = uq0_0.h;
                var21_21 = 8;
                var5_5 = androidx.compose.foundation.layout.h.i((LP1)var7_7, var38_38, var26_26, var38_38, 0.0f, var21_21);
                var7_7 = zp.f;
                var9_9 = Nc$a.j;
                var25_25 = 6;
                var26_26 = 8.4E-45f;
                var7_7 = iQ2.a((zp$e)var7_7, (Gx$b)var9_9, (b30_0)var6_6, var25_25);
                var10_10 = var6_6.F();
                var11_11 = var6_6.m();
                var5_5 = a30_0.c((b30_0)var6_6, (LP1)var5_5);
                N20.W.getClass();
                var17_17 = N20$a.b;
                var22_22 = var6_6.i();
                var14_14 = var22_22 instanceof mp;
                if (var14_14 == 0) break block21;
                var6_6.A();
                var14_14 = (int)var6_6.e();
                if (var14_14 != 0) {
                    var6_6.C((Function0)var17_17);
                } else {
                    var6_6.n();
                }
                var17_17 = N20$a.e;
                Ow3.a((b30_0)var6_6, var7_7, (Function2)var17_17);
                var7_7 = N20$a.d;
                Ow3.a((b30_0)var6_6, var11_11, (Function2)var7_7);
                var7_7 = N20$a.f;
                var25_25 = (int)var6_6.e();
                if (var25_25 != 0 || (var25_25 = (int)Intrinsics.areEqual(var11_11 = var6_6.v(), var17_17 = Integer.valueOf(var10_10))) == 0) {
                    re0_0.a(var10_10, (b30_0)var6_6, var10_10, (N20$a$a)var7_7);
                }
                var7_7 = N20$a.c;
                Ow3.a((b30_0)var6_6, var5_5, (Function2)var7_7);
                var29_29 = uq0_0.x;
                var7_7 = j.h((LP1)var4_4, var29_29);
                var10_10 = -775917323;
                var6_6.K(var10_10);
                var34_34 = var4_4;
                var4_4 = this;
                var9_9 = this.g;
                var25_25 = (int)var6_6.J(var9_9);
                var17_17 = var6_6.v();
                var35_35 = b30$a.a;
                if (var25_25 != 0 || var17_17 == var35_35) {
                    var9_9 = (rc_2)var9_9;
                    var25_25 = 0;
                    var26_26 = 0.0f;
                    var11_11 = null;
                    var17_17 = new nb_1(var9_9, 0);
                    var6_6.o(var17_17);
                }
                var19_19 = var17_17;
                var19_19 = (Function0)var17_17;
                var6_6.E();
                var9_9 = null;
                var15_15 = 6;
                var39_39 = 0L;
                var41_40 = 0L;
                var24_24 = var6_6;
                ov3.g((LP1)var7_7, 0.0f, var39_39, var41_40, (Function0)var19_19, (b30_0)var6_6, var15_15);
                var7_7 = j.h((LP1)var34_34, var29_29);
                var37_37 = -775913706;
                var29_29 = -1.0334573E11f;
                var6_6.K(var37_37);
                var5_5 = var4_4.h;
                var10_10 = (int)var6_6.J(var5_5);
                var11_11 = var6_6.v();
                if (var10_10 != 0 || var11_11 == var35_35) {
                    var5_5 = (sc_1)var5_5;
                    var11_11 = new ob_1((sc_1)var5_5);
                    var6_6.o(var11_11);
                }
                var19_19 = var11_11;
                var19_19 = (Function0)var11_11;
                var6_6.E();
                var10_10 = 0;
                var9_9 = null;
                var15_15 = 6;
                var39_39 = 0L;
                var41_40 = 0L;
                var24_24 = var6_6;
                ov3.h((LP1)var7_7, 0.0f, var39_39, var41_40, (Function0)var19_19, (b30_0)var6_6, var15_15);
                var6_6.p();
            }
            return Unit.a;
        }
        var4_4 = this;
        s20.a();
        throw null;
    }
}

