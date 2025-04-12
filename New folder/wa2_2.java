/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wA2
 */
public final class wa2_2
implements hx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Configuration f;
    public final /* synthetic */ dr0_0 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function2 j;

    public wa2_2(ArrayList arrayList, boolean bl2, float f5, Function2 function2, String string2, Configuration configuration, dr0_0 dr0_02, Function1 function1, Function1 function12, Function2 function22) {
        this.a = arrayList;
        this.b = bl2;
        this.c = f5;
        this.d = function2;
        this.e = string2;
        this.f = configuration;
        this.g = dr0_02;
        this.h = function1;
        this.i = function12;
        this.j = function22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block47: {
            block48: {
                block49: {
                    block46: {
                        block44: {
                            block45: {
                                var5_5 = this;
                                var6_6 = var1_1;
                                var6_6 = (wl2_0)var1_1;
                                var7_7 = var2_2;
                                var7_7 = (Number)var2_2;
                                var8_8 = var7_7.intValue();
                                var9_9 = var3_3;
                                var9_9 = (b30_0)var3_3;
                                var10_10 = var4_4;
                                ((Number)var4_4).intValue();
                                Intrinsics.checkNotNullParameter(var6_6, "$this$HorizontalPager");
                                var11_11 = 0;
                                var6_6 = null;
                                var10_10 = this.a;
                                if (var10_10 != null) {
                                    var12_12 = var10_10.size();
                                } else {
                                    var12_12 = 0;
                                    var13_13 = 0.0f;
                                    var14_14 = null;
                                }
                                var15_15 = LP1$a.b;
                                var16_16 = 1065353216;
                                var17_17 = 1.0f;
                                var18_18 = null;
                                var19_19 = var5_5.c;
                                if (var8_8 != var12_12) break block45;
                                var13_13 = 1.7671303E-37f;
                                var9_9.K(40929153);
                                var12_12 = (int)var5_5.b;
                                if (var12_12 == 0) {
                                    if (var10_10 != null) {
                                        var7_7 = (Resource)CollectionsKt.N(var8_8 += -1, (List)var10_10);
                                    } else {
                                        var8_8 = 0;
                                        var7_7 = null;
                                    }
                                    var10_10 = androidx.compose.foundation.layout.j.d(androidx.compose.foundation.layout.j.c(var15_15, var17_17), var19_19);
                                    var20_20 = var5_5.d;
                                    var14_14 = new sa2_0((Function2)var20_20, (Resource)var7_7);
                                    var7_7 = x20_0.d((LP1)var10_10, (Function0)var14_14);
                                    var10_10 = zp.d;
                                    var14_14 = Nc$a.n;
                                    var16_16 = 54;
                                    var17_17 = 7.6E-44f;
                                    var10_10 = oZ.a((zp$l)var10_10, (Gx$a)var14_14, (b30_0)var9_9, var16_16);
                                    var12_12 = var9_9.F();
                                    var20_20 = var9_9.m();
                                    var7_7 = a30_0.c((b30_0)var9_9, (LP1)var7_7);
                                    N20.W.getClass();
                                    var21_22 /* !! */  = N20$a.b;
                                    var22_24 = var9_9.i();
                                    var23_26 = var22_24 instanceof mp;
                                    if (var23_26) {
                                        var9_9.A();
                                        var23_26 = var9_9.e();
                                        if (var23_26) {
                                            var9_9.C(var21_22 /* !! */ );
                                        } else {
                                            var9_9.n();
                                        }
                                        var21_22 /* !! */  = N20$a.e;
                                        Ow3.a((b30_0)var9_9, var10_10, (Function2)var21_22 /* !! */ );
                                        var10_10 = N20$a.d;
                                        Ow3.a((b30_0)var9_9, var20_20, (Function2)var10_10);
                                        var10_10 = N20$a.f;
                                        var16_16 = (int)var9_9.e();
                                        if (var16_16 != 0 || (var16_16 = (int)Intrinsics.areEqual(var20_20 = var9_9.v(), var21_22 /* !! */  = Integer.valueOf(var12_12))) == 0) {
                                            re0_0.a(var12_12, (b30_0)var9_9, var12_12, (N20$a$a)var10_10);
                                        }
                                        var10_10 = N20$a.c;
                                        Ow3.a((b30_0)var9_9, var7_7, (Function2)var10_10);
                                        var7_7 = var5_5.e;
                                        if (var7_7 == null) {
                                            var7_7 = "View All Products";
                                        }
                                        var14_14 = var7_7;
                                        var24_28 = nz_1.c;
                                        var26_29 = oj3_2.d;
                                        var28_30 = false;
                                        var29_32 = var9_9;
                                        eg0_0.a(null, (String)var7_7, var26_29, var24_28, null, (b30_0)var9_9, 384, 17);
                                        var8_8 = R$drawable.fleek_arrow;
                                        var10_10 = km2.a(var8_8, (b30_0)var9_9, 0);
                                        var11_11 = R$string.acc_right_arrow_icon;
                                        var14_14 = hv3_0.K(var11_11);
                                        var30_34 = uq0_0.e;
                                        var31_36 = 13;
                                        var32_38 = false;
                                        var33_40 = null;
                                        var20_20 = var15_15;
                                        var20_20 = androidx.compose.foundation.layout.h.i(var15_15, 0.0f, var30_34, 0.0f, 0.0f, var31_36);
                                        var34_42 = 392;
                                        var35_44 = 120;
                                        var19_19 = 0.0f;
                                        var21_22 /* !! */  = null;
                                        var23_26 = false;
                                        var30_34 = 0.0f;
                                        var22_24 = null;
                                        var36_46 = false;
                                        var37_48 = 0.0f;
                                        var38_50 = null;
                                        Pd1.a((im2)var10_10, (String)var14_14, (LP1)var20_20, null, null, 0.0f, null, (b30_0)var9_9, var34_42, var35_44);
                                        var9_9.p();
                                    } else {
                                        s20.a();
                                        throw null;
                                    }
                                }
                                var9_9.E();
                                break block46;
                            }
                            var12_12 = 42147794;
                            var13_13 = 1.9266984E-37f;
                            var9_9.K(var12_12);
                            if (var10_10 != null) {
                                var7_7 = (Resource)CollectionsKt.N(var8_8, (List)var10_10);
                            } else {
                                var8_8 = 0;
                                var7_7 = null;
                            }
                            var10_10 = androidx.compose.foundation.layout.j.c(var15_15, var17_17);
                            var13_13 = uq0_0.h;
                            var22_25 = SP2.a(var13_13);
                            var10_10 = QV.a((LP1)var10_10, (i13)var22_25);
                            var33_41 /* !! */  = var5_5.f;
                            var36_47 = var5_5.b;
                            var40_53 = var5_5.g;
                            var41_54 = var5_5.h;
                            var22_25 = var39_52;
                            var29_33 = var7_7;
                            var39_52 = new ta2_1(var33_41 /* !! */ , (boolean)var36_47, (Resource)var7_7, (dr0_0)var40_53, (Function1)var41_54);
                            var10_10 = androidx.compose.ui.layout.c.a((LP1)var10_10, (Function1)var39_52);
                            var33_41 /* !! */  = var5_5.i;
                            var22_25 = new ua2_1((Function1)var33_41 /* !! */ , (Resource)var7_7);
                            var10_10 = x20_0.d((LP1)var10_10, (Function0)var22_25);
                            var22_25 = zp.c;
                            var33_41 /* !! */  = Nc$a.m;
                            var22_25 = oZ.a((zp$l)var22_25, (Gx$a)var33_41 /* !! */ , (b30_0)var9_9, 0);
                            var32_39 = var9_9.F();
                            var38_51 = var9_9.m();
                            var10_10 = a30_0.c((b30_0)var9_9, (LP1)var10_10);
                            N20.W.getClass();
                            var29_33 = N20$a.b;
                            var40_53 = var9_9.i();
                            var34_43 = var40_53 instanceof mp;
                            if (!var34_43) break block47;
                            var9_9.A();
                            var34_43 = var9_9.e();
                            if (var34_43) {
                                var9_9.C((Function0)var29_33);
                            } else {
                                var9_9.n();
                            }
                            var40_53 = N20$a.e;
                            Ow3.a((b30_0)var9_9, var22_25, (Function2)var40_53);
                            var22_25 = N20$a.d;
                            Ow3.a((b30_0)var9_9, var38_51, (Function2)var22_25);
                            var38_51 = N20$a.f;
                            var35_45 = var9_9.e();
                            if (var35_45 || !(var35_45 = Intrinsics.areEqual(var41_54 = var9_9.v(), var39_52 = Integer.valueOf(var32_39)))) {
                                re0_0.a(var32_39, (b30_0)var9_9, var32_39, (N20$a$a)var38_51);
                            }
                            var33_41 /* !! */  = N20$a.c;
                            Ow3.a((b30_0)var9_9, var10_10, (Function2)var33_41 /* !! */ );
                            var10_10 = androidx.compose.foundation.layout.j.d(androidx.compose.foundation.layout.j.c(var15_15, var17_17), var19_19);
                            var14_14 = SP2.a(var13_13);
                            var10_10 = QV.a((LP1)var10_10, (i13)var14_14);
                            var14_14 = HA.e(Nc$a.e, false);
                            var16_16 = var9_9.F();
                            var21_23 = var9_9.m();
                            var10_10 = a30_0.c((b30_0)var9_9, (LP1)var10_10);
                            var41_54 = var9_9.i();
                            var35_45 = var41_54 instanceof mp;
                            if (!var35_45) break block48;
                            var9_9.A();
                            var35_45 = var9_9.e();
                            if (var35_45) {
                                var9_9.C((Function0)var29_33);
                            } else {
                                var9_9.n();
                            }
                            Ow3.a((b30_0)var9_9, var14_14, (Function2)var40_53);
                            Ow3.a((b30_0)var9_9, var21_23, (Function2)var22_25);
                            var12_12 = (int)var9_9.e();
                            if (var12_12 != 0 || (var12_12 = (int)Intrinsics.areEqual(var14_14 = var9_9.v(), var21_23 = Integer.valueOf(var16_16))) == 0) {
                                re0_0.a(var16_16, (b30_0)var9_9, var16_16, (N20$a$a)var38_51);
                            }
                            Ow3.a((b30_0)var9_9, var10_10, (Function2)var33_41 /* !! */ );
                            var40_53 = androidx.compose.foundation.layout.d.a;
                            var42_55 = "";
                            if (var7_7 == null || (var10_10 = var7_7.getImages()) == null) ** GOTO lbl-1000
                            var10_10 = ((Iterable)var10_10).iterator();
                            while ((var12_12 = (int)var10_10.hasNext()) != 0) {
                                var20_21 = var14_14 = var10_10.next();
                                var20_21 = (ProductImage)var14_14;
                                if (var20_21 != null) {
                                    var20_21 = var20_21.getFormat();
                                } else {
                                    var16_16 = 0;
                                    var20_21 = null;
                                    var17_17 = 0.0f;
                                }
                                if ((var16_16 = (int)Intrinsics.areEqual(var20_21, var21_23 = "mobileProductListingImage")) == 0) continue;
                                break block44;
                            }
                            var12_12 = 0;
                            var14_14 = null;
                            var13_13 = 0.0f;
                        }
                        var14_14 = (ProductImage)var14_14;
                        if (var14_14 != null && (var10_10 = var14_14.getUrl()) != null) {
                            var14_14 = var10_10;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var14_14 = var42_55;
                        }
                        var20_21 = i70$a.a;
                        var43_56 = uq0_0.h;
                        var21_23 = SP2.a(var43_56);
                        var36_47 = 3462;
                        var37_49 = 4.851E-42f;
                        var31_37 = 32;
                        var23_27 = false;
                        var30_35 = 0.0f;
                        var22_25 = null;
                        var10_10 = var15_15;
                        var33_41 /* !! */  = var9_9;
                        AF2.a(var15_15, var14_14, (i70_0)var20_21, (rp2_0)var21_23, false, (b30_0)var9_9, var36_47, var31_37);
                        var10_10 = ih3_1.b;
                        if (var7_7 != null && (var14_14 = var7_7.getFnlColorVariantData()) != null) {
                            var14_14 = var14_14.getColorGroup();
                        } else {
                            var12_12 = 0;
                            var14_14 = null;
                            var13_13 = 0.0f;
                        }
                        var28_31 = CollectionsKt.F((Iterable)var10_10, var14_14);
                        var14_14 = Nc$a.i;
                        var20_21 = var40_53.a(var15_15, (Nc)var14_14);
                        var37_49 = uq0_0.k;
                        var23_27 = false;
                        var30_35 = 0.0f;
                        var22_25 = null;
                        var31_37 = 3;
                        var19_19 = 0.0f;
                        var14_14 = androidx.compose.foundation.layout.h.i((LP1)var20_21, 0.0f, 0.0f, var37_49, var37_49, var31_37);
                        var21_23 = var5_5.j;
                        var20_21 = new va2_2((Function2)var21_23, (Resource)var7_7, (boolean)var28_31);
                        var14_14 = x20_0.d((LP1)var14_14, (Function0)var20_21);
                        var28_31 = var28_31 != 0 ? R$drawable.ic_wishlist_added : R$drawable.ic_like_icon_footer;
                        xA2.a(var28_31, 0, (b30_0)var9_9, (LP1)var14_14);
                        var9_9.p();
                        var40_53 = var7_7 != null && (var10_10 = var7_7.getFnlColorVariantData()) != null && (var10_10 = var10_10.getBrandName()) != null ? var10_10 : var42_55;
                        var30_35 = uq0_0.q;
                        var44_57 = uq0_0.c;
                        var36_47 = 0;
                        var37_49 = 0.0f;
                        var38_51 = null;
                        var32_39 = 0;
                        var33_41 /* !! */  = null;
                        var20_21 = var15_15;
                        var19_19 = var44_57;
                        var10_10 = androidx.compose.foundation.layout.h.i(var15_15, var44_57, var30_35, 0.0f, 0.0f, 12);
                        var45_58 = nz_1.h;
                        var47_59 = tv0_0.o;
                        var48_60 = oj3_2.d;
                        var50_61 = 27696;
                        var51_62 = 96;
                        var31_37 = 0;
                        var29_33 = null;
                        var35_45 = false;
                        var14_14 = var47_59;
                        var20_21 = var40_53;
                        var52_63 = var45_58;
                        var34_43 = false;
                        var40_53 = null;
                        var41_54 = var9_9;
                        var54_64 = var15_15;
                        var55_65 = var51_62;
                        ov3.c((LP1)var10_10, var47_59, (String)var20_21, var48_60, var45_58, 0, null, (b30_0)var9_9, var50_61, var51_62);
                        var40_53 = var7_7 != null && (var10_10 = var7_7.getName()) != null ? var10_10 : var42_55;
                        var30_35 = uq0_0.e;
                        var20_21 = var54_64;
                        var19_19 = var44_57;
                        var10_10 = androidx.compose.foundation.layout.h.i(var54_64, var44_57, var30_35, 0.0f, 0.0f, 12);
                        var56_66 = nz_1.b;
                        var50_61 = 3072;
                        var55_65 = 98;
                        var13_13 = 0.0f;
                        var29_33 = null;
                        var35_45 = false;
                        var20_21 = var40_53;
                        var52_63 = var56_66;
                        var34_43 = false;
                        var40_53 = null;
                        var41_54 = var9_9;
                        ov3.c((LP1)var10_10, null, (String)var20_21, var48_60, var56_66, 0, null, (b30_0)var9_9, var50_61, var55_65);
                        var19_19 = 0.0f;
                        var31_37 = 13;
                        var32_39 = 0;
                        var33_41 /* !! */  = null;
                        var36_47 = 0;
                        var37_49 = 0.0f;
                        var38_51 = null;
                        var20_21 = var54_64;
                        var30_35 = var43_56;
                        var10_10 = androidx.compose.foundation.layout.h.i(var54_64, 0.0f, var43_56, 0.0f, 0.0f, var31_37);
                        var14_14 = zp.a;
                        var20_21 = Nc$a.j;
                        var6_6 = iQ2.a((zp$e)var14_14, (Gx$b)var20_21, (b30_0)var9_9, 0);
                        var12_12 = var9_9.F();
                        var20_21 = var9_9.m();
                        var10_10 = a30_0.c((b30_0)var9_9, (LP1)var10_10);
                        N20.W.getClass();
                        var21_23 = N20$a.b;
                        var22_25 = var9_9.i();
                        var23_27 = var22_25 instanceof mp;
                        if (!var23_27) break block49;
                        var9_9.A();
                        var23_27 = var9_9.e();
                        if (var23_27) {
                            var9_9.C((Function0)var21_23);
                        } else {
                            var9_9.n();
                        }
                        var21_23 = N20$a.e;
                        Ow3.a((b30_0)var9_9, var6_6, (Function2)var21_23);
                        var6_6 = N20$a.d;
                        Ow3.a((b30_0)var9_9, var20_21, (Function2)var6_6);
                        var6_6 = N20$a.f;
                        var16_16 = (int)var9_9.e();
                        if (var16_16 != 0 || (var16_16 = (int)Intrinsics.areEqual(var20_21 = var9_9.v(), var21_23 = Integer.valueOf(var12_12))) == 0) {
                            re0_0.a(var12_12, (b30_0)var9_9, var12_12, (N20$a$a)var6_6);
                        }
                        var6_6 = N20$a.c;
                        Ow3.a((b30_0)var9_9, var10_10, (Function2)var6_6);
                        if (var7_7 != null && (var6_6 = var7_7.getPrice()) != null) {
                            var6_6 = var6_6.getFormattedValue();
                        } else {
                            var11_11 = 0;
                            var6_6 = null;
                        }
                        var6_6 = qz2_0.n((String)var6_6);
                        if (var6_6 == null) {
                            var6_6 = var42_55;
                        }
                        var23_27 = false;
                        var30_35 = 0.0f;
                        var22_25 = null;
                        var32_39 = 0;
                        var33_41 /* !! */  = null;
                        var36_47 = 0;
                        var37_49 = 0.0f;
                        var38_51 = null;
                        var20_21 = var54_64;
                        var19_19 = var44_57;
                        var10_10 = androidx.compose.foundation.layout.h.i(var54_64, var44_57, 0.0f, 0.0f, 0.0f, 14);
                        var50_61 = 27702;
                        var55_65 = 96;
                        var31_37 = 0;
                        var29_33 = null;
                        var34_43 = false;
                        var40_53 = null;
                        var14_14 = var47_59;
                        var20_21 = var6_6;
                        var52_63 = var45_58;
                        var41_54 = var9_9;
                        ov3.c((LP1)var10_10, var47_59, (String)var6_6, var48_60, var45_58, 0, null, (b30_0)var9_9, var50_61, var55_65);
                        if (var7_7 != null && (var6_6 = var7_7.getWasPriceData()) != null) {
                            var6_6 = var6_6.getFormattedValue();
                        } else {
                            var11_11 = 0;
                            var6_6 = null;
                        }
                        var28_31 = -2128035812;
                        var9_9.K(var28_31);
                        if (var6_6 != null) {
                            var28_31 = -2128034904;
                            var9_9.K(var28_31);
                            if (var7_7 == null || (var10_10 = var7_7.getWasPriceData()) == null || (var10_10 = var10_10.getValue()) == null) {
                                var10_10 = var42_55;
                            }
                            if (var7_7 != null && (var14_14 = var7_7.getPrice()) != null) {
                                var18_18 = var14_14.getValue();
                            }
                            var14_14 = var18_18;
                            var28_31 = (int)Intrinsics.areEqual(var10_10, var18_18);
                            if (var28_31 == 0) {
                                if ((var6_6 = qz2_0.n((String)var6_6)) == null) {
                                    var6_6 = var42_55;
                                }
                                var23_27 = false;
                                var30_35 = 0.0f;
                                var22_25 = null;
                                var32_39 = 0;
                                var33_41 /* !! */  = null;
                                var36_47 = 0;
                                var37_49 = 0.0f;
                                var38_51 = null;
                                var20_21 = var54_64;
                                var19_19 = var43_56;
                                var10_10 = androidx.compose.foundation.layout.h.i(var54_64, var43_56, 0.0f, 0.0f, 0.0f, 14);
                                var58_67 = Jj3.d;
                                var59_68 = 0L;
                                var61_69 = 0xFFEFFF;
                                var62_70 = 0L;
                                var64_71 = 0L;
                                var66_72 = 0L;
                                var40_53 = new xm3(var62_70, var64_71, null, null, var66_72, var58_67, 0, var59_68, var61_69);
                                var50_61 = 1575942;
                                var55_65 = 34;
                                var12_12 = 0;
                                var13_13 = 0.0f;
                                var14_14 = null;
                                var31_37 = 0;
                                var29_33 = null;
                                var20_21 = var6_6;
                                var52_63 = var56_66;
                                var41_54 = var9_9;
                                ov3.c((LP1)var10_10, null, (String)var6_6, var48_60, var56_66, 0, (xm3)var40_53, (b30_0)var9_9, var50_61, var55_65);
                            }
                            var9_9.E();
                            var6_6 = Unit.a;
                        }
                        var9_9.E();
                        var11_11 = -2128014548;
                        var9_9.K(var11_11);
                        if (var7_7 != null && (var6_6 = var7_7.getDiscountPercent()) != null && (var11_11 = var6_6.length()) > 0) {
                            var6_6 = var7_7.getDiscountPercent();
                            if (var6_6 != null) {
                                var42_55 = var6_6;
                            }
                            var23_27 = false;
                            var30_35 = 0.0f;
                            var22_25 = null;
                            var32_39 = 0;
                            var33_41 /* !! */  = null;
                            var36_47 = 0;
                            var37_49 = 0.0f;
                            var38_51 = null;
                            var20_21 = var54_64;
                            var19_19 = var43_56;
                            var10_10 = androidx.compose.foundation.layout.h.i(var54_64, var43_56, 0.0f, 0.0f, 0.0f, 14);
                            var52_63 = nz_1.q;
                            var50_61 = 27702;
                            var55_65 = 96;
                            var31_37 = 0;
                            var29_33 = null;
                            var34_43 = false;
                            var40_53 = null;
                            var14_14 = var47_59;
                            var20_21 = var42_55;
                            var41_54 = var9_9;
                            ov3.c((LP1)var10_10, var47_59, (String)var42_55, var48_60, var52_63, 0, null, (b30_0)var9_9, var50_61, var55_65);
                        }
                        var9_9.E();
                        var9_9.p();
                        var9_9.p();
                        var9_9.E();
                    }
                    return Unit.a;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

