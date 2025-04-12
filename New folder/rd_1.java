/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from rD
 */
public final class rd_1
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ BaseValue b;
    public final /* synthetic */ ScreenInfo c;
    public final /* synthetic */ int d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ft1_2 g;
    public final /* synthetic */ ft1_2 h;
    public final /* synthetic */ Function2 i;

    public rd_1(p83_0 p83_02, BaseValue baseValue, ScreenInfo screenInfo, int n3, p83_0 p83_03, int n4, ft1_2 ft1_22, ft1_2 ft1_23, qc_1 qc_12) {
        this.a = p83_02;
        this.b = baseValue;
        this.c = screenInfo;
        this.d = n3;
        this.e = p83_03;
        this.f = n4;
        this.g = ft1_22;
        this.h = ft1_23;
        this.i = qc_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block26: {
            block24: {
                block25: {
                    block34: {
                        block35: {
                            block28: {
                                block33: {
                                    block30: {
                                        block31: {
                                            block32: {
                                                block29: {
                                                    block27: {
                                                        block23: {
                                                            var5_5 = this;
                                                            var6_6 = var1_1;
                                                            var6_6 = (wr1_2)var1_1;
                                                            var7_7 = var2_2;
                                                            var7_7 = (Number)var2_2;
                                                            var8_8 = var7_7.intValue();
                                                            var9_9 = var3_3;
                                                            var9_9 = (b30_0)var3_3;
                                                            var10_10 = var4_4;
                                                            var10_10 = (Number)var4_4;
                                                            var11_11 = var10_10.intValue();
                                                            var12_12 = "$this$items";
                                                            Intrinsics.checkNotNullParameter(var6_6, (String)var12_12);
                                                            var13_13 = var11_11 & 112;
                                                            if (var13_13 == 0) {
                                                                var13_13 = (int)var9_9.c(var8_8);
                                                                var13_13 = var13_13 != 0 ? 32 : 16;
                                                                var11_11 |= var13_13;
                                                            }
                                                            if ((var13_13 = var11_11 & 721) != (var11_11 = 144) || (var13_13 = (int)var9_9.h()) == 0) break block23;
                                                            var9_9.D();
                                                            break block24;
                                                        }
                                                        var6_6 = (Subcomponent)var5_5.a.get(var8_8);
                                                        if (var6_6 == null) break block24;
                                                        var14_14 = var6_6.getMedia();
                                                        var11_11 = -2106629518;
                                                        var9_9.K(var11_11);
                                                        if (var14_14 == null) break block25;
                                                        var10_10 = az3_0.a;
                                                        var10_10 = var14_14.getMetadata();
                                                        var15_15 = null;
                                                        if (var10_10 != null) {
                                                            var10_10 = var10_10.getWidth();
                                                        } else {
                                                            var11_11 = 0;
                                                            var10_10 = null;
                                                        }
                                                        var12_12 = var14_14.getMetadata();
                                                        if (var12_12 != null) {
                                                            var12_12 = var12_12.getHeight();
                                                        } else {
                                                            var16_16 = 0;
                                                            var12_12 = null;
                                                            var17_17 = 0.0f;
                                                        }
                                                        var18_18 = var5_5.c;
                                                        var19_19 = var5_5.b;
                                                        var10_10 = az3_0.c("PIXEL", (Double)var10_10, (Double)var12_12, (BaseValue)var19_19, (ScreenInfo)var18_18);
                                                        var16_16 = var10_10.getWidth();
                                                        var17_17 = var16_16;
                                                        var20_20 = var10_10.getHeight();
                                                        var17_17 /= var20_20;
                                                        var21_21 = var5_5.d;
                                                        var20_20 = x20_0.e((b30_0)var9_9, var21_21);
                                                        var22_22 = LP1$a.b;
                                                        var19_19 = j.d(j.k(var22_22, var20_20), var20_20);
                                                        var23_23 = uq0_0.o;
                                                        var24_24 = uq0_0.m;
                                                        var25_25 = 5;
                                                        var26_26 = 0;
                                                        var18_18 = androidx.compose.foundation.layout.h.i((LP1)var19_19, 0.0f, var23_23, 0.0f, var24_24, var25_25);
                                                        var27_27 = Nc$a.e;
                                                        var28_28 = 0;
                                                        var29_29 = null;
                                                        var27_27 = HA.e((Nc)var27_27, false);
                                                        var30_30 = var9_9.F();
                                                        var31_31 = var9_9.m();
                                                        var18_18 = a30_0.c((b30_0)var9_9, (LP1)var18_18);
                                                        N20.W.getClass();
                                                        var32_32 = N20$a.b;
                                                        var33_33 = var9_9.i();
                                                        var34_34 = var33_33 instanceof mp;
                                                        if (var34_34 == 0) break block26;
                                                        var9_9.A();
                                                        var34_34 = var9_9.e();
                                                        if (var34_34 != 0) {
                                                            var9_9.C((Function0)var32_32);
                                                        } else {
                                                            var9_9.n();
                                                        }
                                                        var32_32 = N20$a.e;
                                                        Ow3.a((b30_0)var9_9, var27_27, (Function2)var32_32);
                                                        var27_27 = N20$a.d;
                                                        Ow3.a((b30_0)var9_9, var31_31, (Function2)var27_27);
                                                        var27_27 = N20$a.f;
                                                        var26_26 = var9_9.e();
                                                        if (var26_26 != 0 || (var26_26 = Intrinsics.areEqual(var31_31 = var9_9.v(), var32_32 = Integer.valueOf(var30_30))) == 0) {
                                                            re0_0.a(var30_30, (b30_0)var9_9, var30_30, (N20$a$a)var27_27);
                                                        }
                                                        var27_27 = N20$a.c;
                                                        Ow3.a((b30_0)var9_9, var18_18, (Function2)var27_27);
                                                        var35_35 = androidx.compose.foundation.layout.d.a;
                                                        var18_18 = var14_14.getRedirectionUrl();
                                                        var36_36 = -1123985278;
                                                        var37_37 = -0.03157855f;
                                                        var9_9.K(var36_36);
                                                        var38_38 = var5_5.e;
                                                        var34_34 = var5_5.f;
                                                        if (var18_18 != null) break block27;
                                                        var39_39 = var34_34;
                                                        var40_40 = var38_38;
                                                        break block28;
                                                    }
                                                    var27_27 = var14_14.getType();
                                                    var32_32 = "VIDEO";
                                                    if (var27_27 == null) break block29;
                                                    var30_30 = var27_27.hashCode();
                                                    if (var30_30 == (var26_26 = 70564)) break block30;
                                                    var26_26 = 69775675;
                                                    if (var30_30 == var26_26) break block31;
                                                    var21_21 = 81665115;
                                                    var20_20 = 5.221799E-36f;
                                                    if (var30_30 == var21_21) break block32;
                                                }
lbl112:
                                                // 2 sources

                                                while (true) {
                                                    var41_41 = var8_8;
                                                    var42_42 = var32_32;
                                                    var39_39 = var34_34;
                                                    var40_40 = var38_38;
                                                    var43_43 = var35_35;
                                                    var7_7 = var22_22;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                            }
                                            ** while ((var21_21 = (int)var27_27.equals((Object)var32_32)) == 0)
lbl122:
                                            // 1 sources

                                            var21_21 = 1676883985;
                                            var20_20 = 8.9731976E21f;
                                            var9_9.K(var21_21);
                                            var18_18 = (Component)CollectionsKt.N(var34_34, (List)var38_38);
                                            if (var18_18 != null) {
                                                var18_18 = var18_18.getUuid();
                                            } else {
                                                var21_21 = 0;
                                                var18_18 = null;
                                                var20_20 = 0.0f;
                                            }
                                            var27_27 = androidx.compose.foundation.layout.c.a(var22_22, var17_17);
                                            var44_44 = nz_1.l;
                                            var29_29 = fg2_1.a;
                                            var19_19 = androidx.compose.foundation.a.b((LP1)var27_27, var44_44, (i13)var29_29);
                                            var26_26 = var10_10.getHeight();
                                            var28_28 = var10_10.getWidth();
                                            var46_45 = var6_6.getUuid();
                                            var10_10 = var14_14.getThumbnailUrl();
                                            if (var10_10 == null) {
                                                var10_10 = "";
                                            }
                                            var47_46 = var10_10;
                                            var10_10 = Boolean.TRUE;
                                            var12_12 = Float.valueOf(var17_17);
                                            var27_27 = new Pair(var10_10, var12_12);
                                            var12_12 = var5_5.h;
                                            var48_47 = var5_5.g;
                                            var10_10 = var38_38;
                                            var49_48 = var12_12;
                                            var12_12 = var48_47;
                                            var48_47 = var27_27;
                                            var27_27 = var49_48;
                                            var42_42 = var32_32;
                                            var50_49 = var28_28;
                                            var28_28 = var34_34;
                                            var33_33 = var46_45;
                                            var40_40 = var38_38;
                                            var38_38 = var47_46;
                                            var43_43 = var35_35;
                                            var35_35 = var48_47;
                                            var41_41 = var8_8;
                                            var39_39 = var34_34;
                                            var8_8 = 0;
                                            var51_51 = 0.0f;
                                            var29_29 = var9_9;
                                            var7_7 = var22_22;
                                            var22_22 = null;
                                            rs_2.a((p83_0)var10_10, (ft1_2)var12_12, (String)var18_18, (ft1_2)var49_48, (LP1)var19_19, var26_26, var50_49, var46_45, (String)var47_46, (Pair)var48_47, (b30_0)var9_9, 0);
                                            var9_9.E();
                                            break block33;
                                        }
                                        var41_41 = var8_8;
                                        var42_42 = var32_32;
                                        var39_39 = var34_34;
                                        var40_40 = var38_38;
                                        var43_43 = var35_35;
                                        var7_7 = var22_22;
                                        var10_10 = "IMAGE";
                                        var11_11 = (int)var27_27.equals(var10_10);
                                        if (var11_11 != 0) ** GOTO lbl-1000
                                        ** GOTO lbl-1000
                                    }
                                    var41_41 = var8_8;
                                    var42_42 = var32_32;
                                    var39_39 = var34_34;
                                    var40_40 = var38_38;
                                    var43_43 = var35_35;
                                    var7_7 = var22_22;
                                    var10_10 = "GIF";
                                    var11_11 = (int)var27_27.equals(var10_10);
                                    if (var11_11 != 0) lbl-1000:
                                    // 2 sources

                                    {
                                        var11_11 = 1676224088;
                                        var9_9.K(var11_11);
                                        var10_10 = androidx.compose.foundation.layout.c.a((LP1)var7_7, var17_17);
                                        var27_27 = i70$a.a;
                                        var17_17 = uq0_0.h;
                                        var19_19 = SP2.a(var17_17);
                                        var50_50 = 3456;
                                        var23_23 = 4.843E-42f;
                                        var34_34 = 32;
                                        var26_26 = 0;
                                        var12_12 = var18_18;
                                        var18_18 = var27_27;
                                        var27_27 = var19_19;
                                        var30_30 = 0;
                                        var19_19 = null;
                                        var31_31 = var9_9;
                                        AF2.a((LP1)var10_10, var12_12, (i70_0)var18_18, (rp2_0)var27_27, false, (b30_0)var9_9, var50_50, var34_34);
                                        var9_9.E();
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        var11_11 = 1677913309;
                                        var9_9.K(var11_11);
                                        var9_9.E();
                                    }
                                }
                                var11_11 = -1123922285;
                                var9_9.K(var11_11);
                                var10_10 = var6_6.getProductResources();
                                if (var10_10 != null) {
                                    var11_11 = (int)var10_10.isEmpty();
                                    var16_16 = 1;
                                    var17_17 = 1.4E-45f;
                                    if ((var11_11 ^= var16_16) == var16_16) {
                                        var10_10 = Nc$a.g;
                                        var12_12 = var43_43;
                                        var18_18 = var43_43.a((LP1)var7_7, (Nc)var10_10);
                                        var37_37 = uq0_0.k;
                                        var7_7 = var14_14.getType();
                                        var12_12 = var42_42;
                                        var11_11 = 0;
                                        var10_10 = null;
                                        var8_8 = (int)kotlin.text.b.i((String)var7_7, (String)var42_42, false);
                                        if (var8_8 != 0) {
                                            var51_51 = uq0_0.v;
lbl234:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var51_51 = uq0_0.h;
                                        ** continue;
                                        var23_23 = var51_51;
                                        var26_26 = 0;
                                        var31_31 = null;
                                        var34_34 = 6;
                                        var30_30 = 0;
                                        var19_19 = null;
                                        var7_7 = androidx.compose.foundation.layout.h.i((LP1)var18_18, var37_37, 0.0f, 0.0f, var51_51, var34_34);
                                        var10_10 = var6_6.getProductResources();
                                        if (var10_10 != null) {
                                            var28_28 = var10_10.size();
                                        } else {
                                            var28_28 = 0;
                                            var29_29 = null;
                                        }
                                        var12_12 = var5_5.i;
                                        var21_21 = var41_41;
                                        var10_10 = new qd_2((Function2)var12_12, var41_41, (Subcomponent)var6_6);
                                        var13_13 = 0;
                                        var6_6 = null;
                                        xA2.c((LP1)var7_7, (Function0)var10_10, var28_28, (b30_0)var9_9, 0);
                                    }
                                }
                                var9_9.E();
                            }
                            var9_9.E();
                            var9_9.p();
                            var6_6 = var40_40;
                            var8_8 = var39_39;
                            var6_6 = (Component)var40_40.get(var39_39);
                            if (var6_6 != null) {
                                var15_15 = var6_6.getContentType();
                            }
                            var6_6 = var15_15;
                            if (var15_15 == null) break block25;
                            var8_8 = var15_15.hashCode();
                            if (var8_8 == (var11_11 = -1840606393)) break block34;
                            var11_11 = -205609049;
                            if (var8_8 == var11_11) break block35;
                            var11_11 = -169708227;
                            if (var8_8 == var11_11) {
                                var7_7 = "RESOURCE_ONLY";
lbl275:
                                // 3 sources

                                while (true) {
                                    var6_6.equals(var7_7);
                                    ** GOTO lbl286
                                    break;
                                }
                            }
                            break block25;
                        }
                        var7_7 = "MEDIA_WITH_RESOURCES";
                        ** GOTO lbl275
                    }
                    var7_7 = "MEDIA_ONLY";
                    ** while (true)
                }
                var9_9.E();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

