/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import com.ril.ajio.services.data.reviewRatings.Thumbnail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class bP2$d
extends Lambda
implements Function2 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ C50 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ ProductReview f;
    public final /* synthetic */ yi2_1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ b30_0 i;
    public final /* synthetic */ gx0_2 j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ tr1_0 l;
    public final /* synthetic */ Function1 m;

    public bP2$d(tr1_0 tr1_02, C50 c50, Function0 function0, ProductReview productReview, yi2_1 yi2_12, int n3, b30_0 b30_02, gx0_2 gx0_22, Context context, tr1_0 tr1_03, Function1 function1) {
        this.c = tr1_02;
        this.d = c50;
        this.e = function0;
        this.f = productReview;
        this.g = yi2_12;
        this.h = n3;
        this.i = b30_02;
        this.j = gx0_22;
        this.k = context;
        this.l = tr1_03;
        this.m = function1;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block86: {
            block87: {
                block85: {
                    block84: {
                        var3_3 = this;
                        var4_4 = "";
                        var5_5 = 2;
                        var6_6 = 2.8E-45f;
                        var7_7 = var1_1;
                        var7_7 = (b30_0)var1_1;
                        var8_8 = var2_2;
                        var8_8 = (Number)var2_2;
                        var9_9 = var8_8.intValue();
                        var10_10 = 3;
                        var11_11 = 4.2E-45f;
                        if ((var9_9 &= var10_10) != var5_5 || (var9_9 = (int)var7_7.h()) == 0) break block84;
                        var7_7.D();
                        var12_12 = this;
                        ** GOTO lbl1022
                    }
                    var8_8 = var3_3.c;
                    var13_14 = Unit.a;
                    var8_8.setValue(var13_14);
                    var8_8 = var3_3.d;
                    var8_8.getClass();
                    var8_8.f();
                    var14_15 = 1802765007;
                    var15_16 = 2.9499116E26f;
                    var7_7.K(var14_15);
                    var8_8 = var8_8.e().a;
                    var16_17 = var8_8.d();
                    var17_18 = var8_8.d();
                    var18_19 = var8_8.d();
                    var13_14 = var8_8.d();
                    var8_8 = var8_8.d();
                    var12_13 = var3_3.f;
                    if (var12_13 != null) {
                        var19_20 = var12_13.getRating();
                    } else {
                        var20_21 = 0;
                        var21_22 = 0.0f;
                        var19_20 = null;
                    }
                    var10_10 = -1881510561;
                    var11_11 = -2.1538588E-29f;
                    var7_7.K(var10_10);
                    var22_23 = Nc$a.k;
                    var23_24 = LP1$a.b;
                    var24_25 = 4;
                    var25_26 = 5.6E-45f;
                    var2_2 = var8_8;
                    if (var19_20 != null) break block85;
                    var26_27 = var8_8;
                    var27_28 = var13_14;
                    var28_29 = var17_18;
                    var29_30 = var18_19;
                    var30_31 = var16_17;
                    var19_20 = var7_7;
                    var31_32 = var22_23;
                    ** GOTO lbl333
                }
                var32_33 = var13_14;
                var33_34 = var19_20.doubleValue();
                var19_20 = h40_0.a;
                var20_21 = h40_0.W1();
                var35_35 = h40_0.V1();
                var36_36 = fg2_1.a;
                var37_37 = 30;
                var38_38 = 4.2E-44f;
                if (var35_35 == 0 || var20_21 >= var24_25) break block86;
                var20_21 = 2131770482;
                var7_7.K(var20_21);
                var21_22 = var5_5;
                var19_20 = SP2.a(var21_22);
                var19_20 = QV.a((LP1)var23_24, (i13)var19_20);
                var38_38 = var37_37;
                var19_20 = androidx.compose.foundation.layout.j.k((LP1)var19_20, var38_38);
                var37_37 = 17;
                var38_38 = var37_37;
                var19_20 = androidx.compose.foundation.layout.j.d((LP1)var19_20, var38_38);
                var39_39 = var23_24;
                var40_40 = OX.f;
                var19_20 = a.b((LP1)var19_20, var40_40, (i13)var36_36);
                var42_41 = 4602678819172646912L;
                var44_42 = 0.5;
                var38_38 = (float)var44_42;
                var46_43 = 8;
                var36_36 = new eq2_1(var46_43);
                var47_44 = new q90_0((t90_0)var36_36, (t90_0)var36_36, (t90_0)var36_36, (t90_0)var36_36);
                var48_45 = OX.b;
                var19_20 = gz.a((LP1)var19_20, var38_38, var48_45, (i13)var47_44);
                var31_32 = bP2$f.a;
                var19_20 = C50.c((LP1)var19_20, (t50)var16_17, (Function1)var31_32);
                var31_32 = zp.d;
                var6_6 = 7.6E-44f;
                var31_32 = iQ2.a((zp$e)var31_32, (Gx$b)var22_23, (b30_0)var7_7, 54);
                var5_5 = var7_7.F();
                var23_24 = var7_7.m();
                var19_20 = a30_0.c((b30_0)var7_7, (LP1)var19_20);
                N20.W.getClass();
                var50_46 = var17_18;
                var17_18 = N20$a.b;
                var51_47 = var18_19;
                var18_19 = var7_7.i();
                var52_48 = var18_19 instanceof mp;
                if (var52_48 == 0) break block87;
                var7_7.A();
                var52_48 = var7_7.e();
                if (var52_48 != 0) {
                    var7_7.C((Function0)var17_18);
                } else {
                    var7_7.n();
                }
                var17_18 = N20$a.e;
                Ow3.a((b30_0)var7_7, var31_32, (Function2)var17_18);
                var31_32 = N20$a.d;
                Ow3.a((b30_0)var7_7, var23_24, (Function2)var31_32);
                var31_32 = N20$a.f;
                var53_49 = var7_7.e();
                if (var53_49 != 0 || (var53_49 = Intrinsics.areEqual(var23_24 = var7_7.v(), var17_18 = Integer.valueOf(var5_5))) == 0) {
                    re0_0.a(var5_5, (b30_0)var7_7, var5_5, (N20$a$a)var31_32);
                }
                var31_32 = N20$a.c;
                Ow3.a((b30_0)var7_7, var19_20, (Function2)var31_32);
                var13_14 = String.valueOf((int)var33_34);
                var54_50 = 384;
                var55_51 = 121;
                var9_9 = 0;
                var56_52 = 0.0f;
                var20_21 = 0;
                var21_22 = 0.0f;
                var40_40 = 0L;
                var57_53 = 0.0;
                var59_54 = 0L;
                var17_18 = var2_2;
                var52_48 = 12;
                var27_28 = var32_33;
                var26_27 = var2_2;
                var28_29 = var50_46;
                var29_30 = var51_47;
                var61_55 = var48_45;
                var30_31 = var16_17;
                var19_20 = var7_7;
                var63_56 = var22_23;
                var64_57 = var40_40;
                var32_33 = null;
                var66_58 = var59_54;
                var51_47 = var7_7;
                mm3_0.a(null, (String)var13_14, var48_45, null, var40_40, null, var59_54, (b30_0)var7_7, var54_50, var55_51);
                var37_37 = R$drawable.ic_rating_star_black_small;
                var47_44 = null;
                var8_8 = km2.a(var37_37, (b30_0)var7_7, 0);
                var5_5 = 12;
                var6_6 = 1.7E-44f;
                var38_38 = var5_5;
                var23_24 = var39_39;
                var13_14 = androidx.compose.foundation.layout.j.k((LP1)var39_39, var38_38);
                var17_18 = androidx.compose.foundation.layout.j.d((LP1)var13_14, var38_38);
                var68_59 = 3;
                var69_60 = (double)false;
                var70_61 = 0.0f;
                var16_17 = null;
                var71_62 = 14;
                var72_63 = 0;
                var73_64 = 0.0f;
                var7_7 = null;
                var10_10 = 0;
                var11_11 = 0.0f;
                var17_18 = androidx.compose.foundation.layout.h.i((LP1)var17_18, var68_59, 0.0f, 0.0f, 0.0f, var71_62);
                var31_32 = h40_0.U1();
                var74_65 = zx_0.c(Color.parseColor((String)var31_32));
                var37_37 = Build.VERSION.SDK_INT;
                var76_66 = 29;
                var77_67 = 4.1E-44f;
                var14_15 = 5;
                var15_16 = 7.0E-45f;
                if (var37_37 >= var76_66) {
                    var31_32 = gy_0.a.a(var74_65, var14_15);
                } else {
                    var76_66 = zx_0.i(var74_65);
                    var7_7 = Lf.b(var14_15);
                    var31_32 = new PorterDuffColorFilter(var76_66, (PorterDuff.Mode)var7_7);
                }
                var22_23 = new ay_1(var74_65, var14_15, (ColorFilter)var31_32);
                var78_68 = 440;
                var35_35 = 56;
                var13_14 = "Reviews Star";
                var52_48 = 0;
                var68_59 = 0.0f;
                var18_19 = null;
                var69_60 = (double)false;
                var70_61 = 0.0f;
                var16_17 = null;
                var72_63 = 0;
                var73_64 = 0.0f;
                var7_7 = null;
                var32_33 = var19_20;
                Pd1.a((im2)var8_8, (String)var13_14, var17_18, null, null, 0.0f, (TX)var22_23, (b30_0)var19_20, var78_68, var35_35);
                var19_20.p();
                var19_20.E();
                var31_32 = var63_56;
                ** GOTO lbl333
            }
            s20.a();
            throw null;
        }
        var26_27 = var2_2;
        var28_29 = var17_18;
        var29_30 = var18_19;
        var30_31 = var16_17;
        var19_20 = var7_7;
        var63_56 = var22_23;
        var27_28 = var32_33;
        var5_5 = 12;
        var6_6 = 1.7E-44f;
        var7_7.K(2133266108);
        var73_64 = 2;
        var17_18 = SP2.a(var73_64);
        var17_18 = QV.a((LP1)var23_24, (i13)var17_18);
        var38_38 = var37_37;
        var31_32 = androidx.compose.foundation.layout.j.k((LP1)var17_18, var38_38);
        var79_69 = 17;
        var80_70 = var79_69;
        var31_32 = androidx.compose.foundation.layout.j.d((LP1)var31_32, var80_70);
        rz3_0.Companion.getClass();
        var17_18 = z40_0.Companion;
        var17_18 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var17_18).a;
        var18_19 = "RatingThreshold";
        var81_71 = var17_18.f((String)var18_19);
        var69_60 = var33_34 == var81_71 ? 0 : (var33_34 > var81_71 ? 1 : -1);
        if (var69_60 >= 0) {
            var17_18 = h40_0.m0();
            var79_69 = (int)var17_18.has((String)(var18_19 = "ratingAboveThresholdColor"));
            if (var79_69 != 0) {
                var17_18 = h40_0.m0().getString((String)var18_19);
                Intrinsics.checkNotNull(var17_18);
            } else {
                var17_18 = var4_4;
            }
            var17_18 = StringsKt.m0((CharSequence)var17_18).toString();
            var74_65 = xx_1.Q;
            var79_69 = Color.parseColor((String)var17_18);
            var74_65 = zx_0.c(var79_69);
        } else {
            var17_18 = h40_0.m0();
            var79_69 = (int)var17_18.has((String)(var18_19 = "ratingBelowThresholdColor"));
            if (var79_69 != 0) {
                var17_18 = h40_0.m0().getString((String)var18_19);
                Intrinsics.checkNotNull(var17_18);
            } else {
                var17_18 = var4_4;
            }
            var17_18 = StringsKt.m0((CharSequence)var17_18).toString();
            var74_65 = xx_1.R;
            var79_69 = Color.parseColor((String)var17_18);
            var74_65 = var61_55 = zx_0.c(var79_69);
        }
lbl254:
        // 3 sources

        while (true) {
            block88: {
                block89: {
                    block93: {
                        block101: {
                            block99: {
                                block100: {
                                    block98: {
                                        block83: {
                                            block96: {
                                                block97: {
                                                    block95: {
                                                        block94: {
                                                            block91: {
                                                                block92: {
                                                                    block90: {
                                                                        var31_32 = a.b((LP1)var31_32, var74_65, (i13)var36_36);
                                                                        var36_36 = bP2$g.a;
                                                                        var31_32 = C50.c((LP1)var31_32, (t50)var30_31, (Function1)var36_36);
                                                                        var36_36 = zp.d;
                                                                        var22_23 = var63_56;
                                                                        var80_70 = 7.6E-44f;
                                                                        var36_36 = iQ2.a((zp$e)var36_36, (Gx$b)var63_56, (b30_0)var19_20, 54);
                                                                        var79_69 = var19_20.F();
                                                                        var18_19 = var19_20.m();
                                                                        var31_32 = a30_0.c((b30_0)var19_20, (LP1)var31_32);
                                                                        N20.W.getClass();
                                                                        var16_17 = N20$a.b;
                                                                        var47_44 = var19_20.i();
                                                                        var5_5 = var47_44 instanceof mp;
                                                                        if (var5_5 == 0) break block88;
                                                                        var19_20.A();
                                                                        var5_5 = (int)var19_20.e();
                                                                        if (var5_5 != 0) {
                                                                            var19_20.C((Function0)var16_17);
                                                                        } else {
                                                                            var19_20.n();
                                                                        }
                                                                        var47_44 = N20$a.e;
                                                                        Ow3.a((b30_0)var19_20, var36_36, (Function2)var47_44);
                                                                        var36_36 = N20$a.d;
                                                                        Ow3.a((b30_0)var19_20, var18_19, (Function2)var36_36);
                                                                        var36_36 = N20$a.f;
                                                                        var5_5 = (int)var19_20.e();
                                                                        if (var5_5 != 0 || (var5_5 = (int)Intrinsics.areEqual(var47_44 = var19_20.v(), var18_19 = Integer.valueOf(var79_69))) == 0) {
                                                                            re0_0.a(var79_69, (b30_0)var19_20, var79_69, (N20$a$a)var36_36);
                                                                        }
                                                                        var36_36 = N20$a.c;
                                                                        Ow3.a((b30_0)var19_20, var31_32, (Function2)var36_36);
                                                                        var37_37 = (int)var33_34;
                                                                        var13_14 = String.valueOf(var37_37);
                                                                        var61_55 = OX.f;
                                                                        var54_50 = 384;
                                                                        var55_51 = 121;
                                                                        var9_9 = 0;
                                                                        var56_52 = 0.0f;
                                                                        var42_41 = 0L;
                                                                        var44_42 = 0.0;
                                                                        var66_58 = 0L;
                                                                        var83_72 = var73_64;
                                                                        var31_32 = var22_23;
                                                                        var64_57 = var42_41;
                                                                        var51_47 = var19_20;
                                                                        mm3_0.a(null, (String)var13_14, var61_55, null, var42_41, null, var66_58, (b30_0)var19_20, var54_50, var55_51);
                                                                        var76_66 = R$drawable.ic_star_white_8;
                                                                        var5_5 = 0;
                                                                        var47_44 = null;
                                                                        var8_8 = km2.a(var76_66, (b30_0)var19_20, 0);
                                                                        var76_66 = 12;
                                                                        var77_67 = 1.7E-44f;
                                                                        var6_6 = var76_66;
                                                                        var36_36 = androidx.compose.foundation.layout.j.k((LP1)var23_24, var6_6);
                                                                        var18_19 = androidx.compose.foundation.layout.j.d((LP1)var36_36, var6_6);
                                                                        var72_63 = 0;
                                                                        var73_64 = 0.0f;
                                                                        var7_7 = null;
                                                                        var71_62 = 0;
                                                                        var70_61 = var83_72;
                                                                        var17_18 = androidx.compose.foundation.layout.h.i((LP1)var18_19, var83_72, 0.0f, 0.0f, 0.0f, 14);
                                                                        var78_68 = 440;
                                                                        var35_35 = 120;
                                                                        var13_14 = "Reviews Star";
                                                                        var52_48 = 0;
                                                                        var68_59 = 0.0f;
                                                                        var18_19 = null;
                                                                        var69_60 = (double)false;
                                                                        var70_61 = 0.0f;
                                                                        var16_17 = null;
                                                                        var10_10 = 0;
                                                                        var11_11 = 0.0f;
                                                                        var22_23 = null;
                                                                        var32_33 = var19_20;
                                                                        Pd1.a((im2)var8_8, var13_14, var17_18, null, null, 0.0f, null, (b30_0)var19_20, var78_68, var35_35);
                                                                        var19_20.p();
                                                                        var19_20.E();
lbl333:
                                                                        // 3 sources

                                                                        var19_20.E();
                                                                        var61_55 = xx_1.P;
                                                                        var13_14 = var12_13 != null && (var36_36 = var12_13.getReviewText()) != null ? var36_36 : var4_4;
                                                                        var77_67 = -2.1684928E-29f;
                                                                        var19_20.K(-1881413301);
                                                                        var76_66 = var19_20.J(var30_31);
                                                                        var47_44 = var19_20.v();
                                                                        var7_7 = b30$a.a;
                                                                        if (var76_66 != 0 || var47_44 == var7_7) {
                                                                            var47_44 = new bP2$h((t50)var30_31);
                                                                            var19_20.o(var47_44);
                                                                        }
                                                                        var47_44 = (Function1)var47_44;
                                                                        var19_20.E();
                                                                        var30_31 = var28_29;
                                                                        var22_23 = C50.c((LP1)var23_24, (t50)var28_29, (Function1)var47_44);
                                                                        var76_66 = 16;
                                                                        var77_67 = var76_66;
                                                                        var6_6 = 24;
                                                                        var8_8 = androidx.compose.foundation.layout.h.i((LP1)var22_23, 0.0f, 0.0f, var6_6, var77_67, 3);
                                                                        var5_5 = 12;
                                                                        var6_6 = 1.7E-44f;
                                                                        var84_73 = Em3.f(var5_5);
                                                                        var47_44 = tv0_0.m;
                                                                        var54_50 = 28032;
                                                                        var55_51 = 96;
                                                                        var78_68 = 0;
                                                                        var86_74 = null;
                                                                        var87_75 = 0L;
                                                                        var16_17 = var47_44;
                                                                        var39_39 = var4_4;
                                                                        var4_4 = var7_7;
                                                                        var64_57 = var84_73;
                                                                        var71_62 = 0;
                                                                        var32_33 = null;
                                                                        var66_58 = var87_75;
                                                                        var51_47 = var19_20;
                                                                        mm3_0.a((LP1)var8_8, (String)var13_14, var61_55, (tv0_0)var47_44, var84_73, null, var87_75, (b30_0)var19_20, var54_50, var55_51);
                                                                        var56_52 = -2.1715561E-29f;
                                                                        var19_20.K(-1881392942);
                                                                        var9_9 = (int)var19_20.J(var28_29);
                                                                        var13_14 = var19_20.v();
                                                                        if (var9_9 != 0 || var13_14 == var7_7) {
                                                                            var13_14 = new bP2$i((t50)var30_31);
                                                                            var19_20.o(var13_14);
                                                                        }
                                                                        var13_14 = (Function1)var13_14;
                                                                        var19_20.E();
                                                                        var30_31 = var29_30;
                                                                        var8_8 = C50.c((LP1)var23_24, (t50)var29_30, (Function1)var13_14);
                                                                        var10_10 = 1065353216;
                                                                        var11_11 = 1.0f;
                                                                        var8_8 = androidx.compose.foundation.layout.j.c((LP1)var8_8, var11_11);
                                                                        var13_14 = zp.c;
                                                                        var17_18 = Nc$a.m;
                                                                        var52_48 = 0;
                                                                        var68_59 = 0.0f;
                                                                        var13_14 = oZ.a((zp$l)var13_14, (Gx$a)var17_18, (b30_0)var19_20, 0);
                                                                        var79_69 = var19_20.F();
                                                                        var18_19 = var19_20.m();
                                                                        var8_8 = a30_0.c((b30_0)var19_20, (LP1)var8_8);
                                                                        N20.W.getClass();
                                                                        var7_7 = N20$a.b;
                                                                        var16_17 = var19_20.i();
                                                                        var69_60 = (double)(var16_17 instanceof mp);
                                                                        if (var69_60 == false) break block89;
                                                                        var19_20.A();
                                                                        var69_60 = (double)var19_20.e();
                                                                        if (var69_60 != false) {
                                                                            var19_20.C((Function0)var7_7);
                                                                        } else {
                                                                            var19_20.n();
                                                                        }
                                                                        var16_17 = N20$a.e;
                                                                        Ow3.a((b30_0)var19_20, var13_14, (Function2)var16_17);
                                                                        var13_14 = N20$a.d;
                                                                        Ow3.a((b30_0)var19_20, var18_19, (Function2)var13_14);
                                                                        var18_19 = N20$a.f;
                                                                        var71_62 = var19_20.e();
                                                                        if (var71_62 != 0) break block90;
                                                                        var22_23 = var19_20.v();
                                                                        var2_2 = var13_14;
                                                                        var13_14 = var79_69;
                                                                        var14_15 = (int)Intrinsics.areEqual(var22_23, var13_14);
                                                                        if (var14_15 != 0) break block91;
                                                                        break block92;
                                                                    }
                                                                    var2_2 = var13_14;
                                                                }
                                                                re0_0.a(var79_69, (b30_0)var19_20, var79_69, (N20$a$a)var18_19);
                                                            }
                                                            var22_23 = N20$a.c;
                                                            Ow3.a((b30_0)var19_20, var8_8, (Function2)var22_23);
                                                            var9_9 = -1732225061;
                                                            var56_52 = -4.971955E-24f;
                                                            var19_20.K(var9_9);
                                                            if (var12_13 != null && (var8_8 = var12_13.getImageMap()) != null && (var8_8 = var8_8.getThumbnail()) != null) {
                                                                var9_9 = var8_8.size();
                                                            } else {
                                                                var9_9 = 0;
                                                                var56_52 = 0.0f;
                                                                var8_8 = null;
                                                            }
                                                            var17_18 = var3_3.g;
                                                            if (var9_9 > 0) {
                                                                if (var17_18 != null && (var8_8 = var17_18.R6()) != null && (var8_8 = var8_8.getImageReview()) != null && (var8_8 = var8_8.getTotalReviews()) != null) {
                                                                    var9_9 = var8_8.intValue();
lbl437:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var9_9 = 0;
                                                                var56_52 = 0.0f;
                                                                var8_8 = null;
                                                                ** continue;
                                                                var14_15 = 1065353216;
                                                                var15_16 = 1.0f;
                                                                var32_33 = androidx.compose.foundation.layout.j.c((LP1)var23_24, var15_16);
                                                                var86_74 = rz3_0.Companion;
                                                                if (var12_13 != null && (var50_46 = var12_13.getImageMap()) != null) {
                                                                    var50_46 = var50_46.getThumbnail();
                                                                    var13_14 = var50_46;
                                                                } else {
                                                                    var14_15 = 0;
                                                                    var15_16 = 0.0f;
                                                                    var13_14 = null;
                                                                }
                                                                var86_74.getClass();
                                                                var86_74 = var18_19;
                                                                var18_19 = new ArrayList();
                                                                var50_46 = var17_18;
                                                                if (var13_14 != null) {
                                                                    var51_47 = var16_17;
                                                                    var89_76 = var7_7;
                                                                    var69_60 = 10;
                                                                    var70_61 = 1.4E-44f;
                                                                    var72_63 = yx_2.o((Iterable)var13_14, (int)var69_60);
                                                                    var17_18 = new ArrayList(var72_63);
                                                                    var13_14 = var13_14.iterator();
                                                                    while ((var69_60 = (double)var13_14.hasNext()) != false) {
                                                                        var16_17 = ((Thumbnail)var13_14.next()).getImageUrl();
                                                                        if (var16_17 != null) {
                                                                            var18_19.add(var16_17);
                                                                        } else {
                                                                            var69_60 = (double)false;
                                                                            var70_61 = 0.0f;
                                                                            var16_17 = null;
                                                                        }
                                                                        var17_18.add(var16_17);
                                                                    }
                                                                } else {
                                                                    var51_47 = var16_17;
                                                                    var89_76 = var7_7;
                                                                }
                                                                var17_18 = Boolean.FALSE;
                                                                var15_16 = -4.976559E-24f;
                                                                var19_20.K(-1732213388);
                                                                var14_15 = var3_3.h;
                                                                var69_60 = var14_15 & 7168 ^ 3072;
                                                                var7_7 = var3_3.j;
                                                                var90_77 = var22_23;
                                                                var10_10 = 2048;
                                                                var11_11 = 2.87E-42f;
                                                                if (var69_60 > var10_10 && (var69_60 = (double)(var16_17 = var3_3.i).J(var7_7)) != false || (var14_15 &= 3072) == var10_10) {
                                                                    var14_15 = 1;
                                                                    var15_16 = 1.4E-45f;
                                                                } else {
                                                                    var14_15 = 0;
                                                                    var15_16 = 0.0f;
                                                                    var13_14 = null;
                                                                }
                                                                var16_17 = var19_20.v();
                                                                if (var14_15 != 0 || var16_17 == var4_4) {
                                                                    var16_17 = new bP2$j((gx0_2)var7_7);
                                                                    var19_20.o(var16_17);
                                                                }
                                                                var22_23 = var16_17;
                                                                var22_23 = (gx0_2)var16_17;
                                                                var19_20.E();
                                                                var91_78 = 29120;
                                                                var83_72 = 4.0806E-41f;
                                                                var92_79 = 32;
                                                                var13_14 = var3_3.f;
                                                                var72_63 = 0;
                                                                var73_64 = 0.0f;
                                                                var7_7 = null;
                                                                var16_17 = var2_2;
                                                                var93_80 = var50_46;
                                                                var94_81 = var86_74;
                                                                var28_29 = var4_4;
                                                                var29_30 = var30_31;
                                                                var30_31 = var2_2;
                                                                var4_4 = var51_47;
                                                                var16_17 = var32_33;
                                                                var1_1 = var47_44;
                                                                var47_44 = var89_76;
                                                                var95_82 = var90_77;
                                                                var32_33 = var19_20;
                                                                var78_68 = var91_78;
                                                                var35_35 = var92_79;
                                                                sh0_0.a(var9_9, (ProductReview)var13_14, var17_18, (List)var18_19, (LP1)var16_17, null, (gx0_2)var22_23, (b30_0)var19_20, var91_78, var92_79);
                                                            } else {
                                                                var28_29 = var4_4;
                                                                var29_30 = var30_31;
                                                                var1_1 = var47_44;
                                                                var93_80 = var17_18;
                                                                var94_81 = var18_19;
                                                                var4_4 = var16_17;
                                                                var47_44 = var7_7;
                                                                var95_82 = var22_23;
                                                                var30_31 = var2_2;
                                                            }
                                                            var19_20.E();
                                                            var69_60 = 1065353216;
                                                            var70_61 = 1.0f;
                                                            var32_33 = androidx.compose.foundation.layout.j.c((LP1)var23_24, var70_61);
                                                            var78_68 = 0;
                                                            var86_74 = null;
                                                            var55_51 = 13;
                                                            var51_47 = null;
                                                            var54_50 = 0;
                                                            var89_76 = null;
                                                            var36_36 = androidx.compose.foundation.layout.h.i((LP1)var32_33, 0.0f, var77_67, 0.0f, 0.0f, var55_51);
                                                            var9_9 = 8;
                                                            var56_52 = 1.1E-44f;
                                                            var73_64 = var9_9;
                                                            var8_8 = zp.g(var73_64);
                                                            var15_16 = 7.6E-44f;
                                                            var8_8 = iQ2.a((zp$e)var8_8, (Gx$b)var31_32, (b30_0)var19_20, 54);
                                                            var14_15 = var19_20.F();
                                                            var17_18 = var19_20.m();
                                                            var36_36 = a30_0.c((b30_0)var19_20, (LP1)var36_36);
                                                            var18_19 = var19_20.i();
                                                            var52_48 = var18_19 instanceof mp;
                                                            if (var52_48 == 0) break block93;
                                                            var19_20.A();
                                                            var52_48 = (int)var19_20.e();
                                                            if (var52_48 != 0) {
                                                                var19_20.C((Function0)var47_44);
                                                            } else {
                                                                var19_20.n();
                                                            }
                                                            Ow3.a((b30_0)var19_20, var8_8, (Function2)var4_4);
                                                            Ow3.a((b30_0)var19_20, var17_18, (Function2)var30_31);
                                                            var9_9 = (int)var19_20.e();
                                                            if (var9_9 == 0 && (var9_9 = (int)Intrinsics.areEqual(var8_8 = var19_20.v(), var17_18 = Integer.valueOf(var14_15))) != 0) {
                                                                var17_18 = var94_81;
lbl571:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var17_18 = var94_81;
                                                            re0_0.a(var14_15, (b30_0)var19_20, var14_15, var94_81);
                                                            ** continue;
                                                            var18_19 = var95_82;
                                                            Ow3.a((b30_0)var19_20, var36_36, (Function2)var95_82);
                                                            var8_8 = var12_13 != null && (var36_36 = var12_13.getReviewerName()) != null ? var36_36 : var39_39;
                                                            var96_83 = xx_1.H;
                                                            var15_16 = (float)false;
                                                            var77_67 = 100;
                                                            var13_14 = androidx.compose.foundation.layout.j.l(var15_16, var77_67);
                                                            var98_84 = Em3.f(10);
                                                            var36_36 = tv0_0.o;
                                                            var63_56 = y20_0.a;
                                                            var100_85 = 3120;
                                                            var101_86 = 120720;
                                                            var10_10 = 0;
                                                            var11_11 = 0.0f;
                                                            var22_23 = null;
                                                            var87_75 = 0L;
                                                            var54_50 = 0;
                                                            var89_76 = null;
                                                            var55_51 = 0;
                                                            var90_77 = null;
                                                            var102_87 = 0L;
                                                            var92_79 = 2;
                                                            var104_88 = null;
                                                            var105_89 = 1;
                                                            var106_90 = 1772976;
                                                            var107_91 /* !! */  = var17_18;
                                                            var108_92 = var18_19;
                                                            var61_55 = var96_83;
                                                            var109_93 = var73_64;
                                                            var110_94 = var98_84;
                                                            var32_33 = var36_36;
                                                            var86_74 = var63_56;
                                                            Ll3.b((String)var8_8, (LP1)var13_14, var96_83, var98_84, null, (tv0_0)var36_36, (RU0)var63_56, var87_75, null, null, var102_87, var92_79, false, var105_89, 0, null, null, (b30_0)var19_20, var106_90, var100_85, var101_86);
                                                            var76_66 = 695707024;
                                                            var77_67 = 5.498862E-14f;
                                                            var19_20.K(var76_66);
                                                            if (var12_13 != null) {
                                                                var36_36 = var12_13.isVerified();
                                                                var8_8 = Boolean.TRUE;
                                                                var76_66 = (int)Intrinsics.areEqual(var36_36, var8_8);
                                                            } else {
                                                                var76_66 = 0;
                                                                var77_67 = 0.0f;
                                                                var36_36 = null;
                                                            }
                                                            var22_23 = "getString(...)";
                                                            var7_7 = var3_3.k;
                                                            if (var76_66 != 0) {
                                                                var56_52 = (float)true;
                                                                var36_36 = androidx.compose.foundation.layout.j.k((LP1)var23_24, var56_52);
                                                                var15_16 = 10;
                                                                var8_8 = androidx.compose.foundation.layout.j.d((LP1)var36_36, var15_16);
                                                                var77_67 = 7.6E-44f;
                                                                var112_95 = var96_83;
                                                                var114_96 = var7_7;
                                                                var7_7 = var19_20;
                                                                var115_97 = var22_23;
                                                                var10_10 = 54;
                                                                var11_11 = var77_67;
                                                                Rr0.a((LP1)var8_8, var96_83, 0.0f, 0.0f, (b30_0)var19_20, var10_10, 12);
                                                                var76_66 = R$drawable.rating_confirm;
                                                                var36_36 = km2.a(var76_66, (b30_0)var19_20, 0);
                                                                var15_16 = 12;
                                                                var17_18 = androidx.compose.foundation.layout.j.d(androidx.compose.foundation.layout.j.k((LP1)var23_24, var15_16), var15_16);
                                                                var78_68 = 440;
                                                                var35_35 = 120;
                                                                var52_48 = 0;
                                                                var68_59 = 0.0f;
                                                                var18_19 = null;
                                                                var69_60 = (double)false;
                                                                var70_61 = 0.0f;
                                                                var72_63 = 0;
                                                                var73_64 = 0.0f;
                                                                var7_7 = null;
                                                                var10_10 = 0;
                                                                var11_11 = 0.0f;
                                                                var22_23 = null;
                                                                var8_8 = var36_36;
                                                                var32_33 = var19_20;
                                                                Pd1.a((im2)var36_36, "verified", (LP1)var17_18, null, null, 0.0f, null, (b30_0)var19_20, var78_68, var35_35);
                                                                var36_36 = var114_96.getResources();
                                                                var9_9 = R$string.verified_purchase;
                                                                var13_14 = var36_36.getString(var9_9);
                                                                var36_36 = var115_97;
                                                                Intrinsics.checkNotNullExpressionValue(var13_14, (String)var115_97);
                                                                var54_50 = 3072;
                                                                var55_51 = 117;
                                                                var9_9 = 0;
                                                                var56_52 = 0.0f;
                                                                var8_8 = null;
                                                                var61_55 = 0L;
                                                                var81_71 = 0.0;
                                                                var64_57 = 0L;
                                                                var71_62 = 0;
                                                                var32_33 = null;
                                                                var66_58 = 0L;
                                                                var16_17 = var1_1;
                                                                var51_47 = var19_20;
                                                                mm3_0.a(null, (String)var13_14, var61_55, (tv0_0)var1_1, var64_57, null, var66_58, (b30_0)var19_20, var54_50, var55_51);
                                                            } else {
                                                                var114_96 = var7_7;
                                                                var36_36 = var22_23;
                                                            }
                                                            var19_20.E();
                                                            var19_20.p();
                                                            var19_20.p();
                                                            var8_8 = rz3_0.Companion;
                                                            if (var12_13 != null && (var13_14 = var12_13.getCreatedDate()) != null && (var13_14 = StringsKt.l0((String)var13_14)) != null) {
                                                                var112_95 = var13_14.longValue();
                                                            } else {
                                                                var112_95 = 0L;
                                                                var116_98 = 0.0;
                                                            }
                                                            var8_8.getClass();
                                                            var74_65 = System.currentTimeMillis() - var112_95;
                                                            var8_8 = Bn3.DECADES;
                                                            var118_99 = var8_8.toMillis();
                                                            var118_99 = var74_65 / var118_99;
                                                            var64_57 = Bn3.YEARS.toMillis();
                                                            var64_57 = var74_65 / var64_57;
                                                            var98_84 = Bn3.MONTHS.toMillis();
                                                            var95_82 = var12_13;
                                                            var120_100 = var74_65 / var98_84;
                                                            var98_84 = Bn3.WEEKS.toMillis();
                                                            var2_2 = var30_31;
                                                            var115_97 = var36_36;
                                                            var48_45 = var74_65 / var98_84;
                                                            var98_84 = Bn3.DAYS.toMillis();
                                                            var122_101 = var31_32;
                                                            var123_102 = var4_4;
                                                            var124_103 = var74_65 / var98_84;
                                                            var98_84 = Bn3.HOURS.toMillis();
                                                            var104_88 = var47_44;
                                                            var126_104 = var23_24;
                                                            var40_40 = var74_65 / var98_84;
                                                            var98_84 = Bn3.MINUTES.toMillis();
                                                            var87_75 = var40_40;
                                                            var40_40 = var74_65 / var98_84;
                                                            var17_18 = Bn3.SECONDS;
                                                            var98_84 = var17_18.toMillis();
                                                            var74_65 /= var98_84;
                                                            var98_84 = 0L;
                                                            var79_69 = (int)(var118_99 == var98_84 ? 0 : (var118_99 < var98_84 ? -1 : 1));
                                                            if (var79_69 <= 0) break block94;
                                                            var3_3 = "Long time ago";
                                                            break block83;
                                                        }
                                                        var118_99 = 1L;
                                                        var33_34 = 4.9E-324;
                                                        var79_69 = (int)(var64_57 == var98_84 ? 0 : (var64_57 < var98_84 ? -1 : 1));
                                                        if (var79_69 > 0) {
                                                            var127_105 /* !! */  = (long)(var64_57 == var118_99 ? 0 : (var64_57 < var118_99 ? -1 : 1));
                                                            if (var127_105 /* !! */  == false) {
                                                                var3_3 = " year ago";
lbl728:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_3 = UX.b(var64_57, (String)var3_3);
                                                                    break block83;
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = " years ago";
                                                            ** continue;
                                                        }
                                                        var79_69 = (int)(var120_100 == var98_84 ? 0 : (var120_100 < var98_84 ? -1 : 1));
                                                        if (var79_69 > 0) {
                                                            var37_37 = (int)(var120_100 == var118_99 ? 0 : (var120_100 < var118_99 ? -1 : 1));
                                                            if (var37_37 == 0) {
                                                                var31_32 = " month ago";
lbl738:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_3 = UX.b(var120_100, (String)var31_32);
                                                                    break block83;
                                                                    break;
                                                                }
                                                            }
                                                            var31_32 = " months ago";
                                                            ** continue;
                                                        }
                                                        var127_106 /* !! */  = (long)(var48_45 == var98_84 ? 0 : (var48_45 < var98_84 ? -1 : 1));
                                                        if (var127_106 /* !! */  > 0) {
                                                            var127_106 /* !! */  = (long)(var48_45 == var118_99 ? 0 : (var48_45 < var118_99 ? -1 : 1));
                                                            if (var127_106 /* !! */  == false) {
                                                                var3_3 = " week ago";
lbl748:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_3 = UX.b(var48_45, (String)var3_3);
                                                                    break block83;
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = " weeks ago";
                                                            ** continue;
                                                        }
                                                        var127_106 /* !! */  = (long)(var124_103 == var98_84 ? 0 : (var124_103 < var98_84 ? -1 : 1));
                                                        if (var127_106 /* !! */  > 0) {
                                                            var127_106 /* !! */  = (long)(var124_103 == var118_99 ? 0 : (var124_103 < var118_99 ? -1 : 1));
                                                            if (var127_106 /* !! */  == false) {
                                                                var3_3 = " day ago";
lbl758:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_3 = UX.b(var124_103, (String)var3_3);
                                                                    break block83;
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = " days ago";
                                                            ** continue;
                                                        }
                                                        var127_106 /* !! */  = (long)(var87_75 == var98_84 ? 0 : (var87_75 < var98_84 ? -1 : 1));
                                                        if (var127_106 /* !! */  <= 0) break block95;
                                                        var127_106 /* !! */  = (long)(var87_75 == var118_99 ? 0 : (var87_75 < var118_99 ? -1 : 1));
                                                        if (var127_106 /* !! */  == false) {
                                                            var3_3 = " hour ago";
                                                            var74_65 = var87_75;
lbl769:
                                                            // 4 sources

                                                            while (true) {
                                                                var3_3 = UX.b(var74_65, (String)var3_3);
                                                                break block83;
                                                                break;
                                                            }
                                                        }
                                                        var74_65 = var87_75;
                                                        var3_3 = " hours ago";
                                                        ** GOTO lbl769
                                                    }
                                                    var127_106 /* !! */  = (long)(var40_40 == var98_84 ? 0 : (var40_40 < var98_84 ? -1 : 1));
                                                    if (var127_106 /* !! */  > 0) {
                                                        var127_106 /* !! */  = (long)(var40_40 == var118_99 ? 0 : (var40_40 < var118_99 ? -1 : 1));
                                                        if (var127_106 /* !! */  == false) {
                                                            var3_3 = " minute ago";
lbl781:
                                                            // 2 sources

                                                            while (true) {
                                                                var3_3 = UX.b(var40_40, (String)var3_3);
                                                                break block83;
                                                                break;
                                                            }
                                                        }
                                                        var3_3 = " minutes ago";
                                                        ** continue;
                                                    }
                                                    var127_106 /* !! */  = (long)(var74_65 == var98_84 ? 0 : (var74_65 < var98_84 ? -1 : 1));
                                                    if (var127_106 /* !! */  <= 0) break block96;
                                                    var127_106 /* !! */  = (long)(var74_65 == var118_99 ? 0 : (var74_65 < var118_99 ? -1 : 1));
                                                    if (var127_106 /* !! */  != false) break block97;
                                                    var3_3 = " second ago";
                                                    ** GOTO lbl769
                                                }
                                                var3_3 = " seconds ago";
                                                ** continue;
                                            }
                                            var3_3 = "Moments ago";
                                        }
                                        var12_13 = new StringBuilder("Posted ");
                                        var12_13.append(var3_3);
                                        var13_14 = var12_13.toString();
                                        var3_3 = var126_104;
                                        var128_107 = 1.0f;
                                        var31_32 = androidx.compose.foundation.layout.j.c((LP1)var126_104, var128_107);
                                        var25_26 = 4;
                                        var53_49 = 13;
                                        var46_43 = 1.8E-44f;
                                        var76_66 = 0;
                                        var77_67 = 0.0f;
                                        var5_5 = 0;
                                        var6_6 = 0.0f;
                                        var47_44 = null;
                                        var31_32 = androidx.compose.foundation.layout.h.i((LP1)var31_32, 0.0f, var25_26, 0.0f, 0.0f, var53_49);
                                        var129_108 = -1881306801;
                                        var130_109 = -2.1845172E-29f;
                                        var19_20.K(var129_108);
                                        var4_4 = var29_30;
                                        var24_25 = (int)var19_20.J(var29_30);
                                        var36_36 = var19_20.v();
                                        if (var24_25 != 0) break block98;
                                        var30_31 = var28_29;
                                        if (var36_36 != var28_29) break block99;
                                        break block100;
                                    }
                                    var30_31 = var28_29;
                                }
                                var36_36 = new bP2$k((t50)var4_4);
                                var19_20.o(var36_36);
                            }
                            var36_36 = (Function1)var36_36;
                            var19_20.E();
                            var47_44 = var27_28;
                            var8_8 = C50.c((LP1)var31_32, var27_28, (Function1)var36_36);
                            var54_50 = 3456;
                            var55_51 = 112;
                            var64_57 = 0L;
                            var71_62 = 0;
                            var32_33 = null;
                            var66_58 = 0L;
                            var61_55 = var96_83;
                            var16_17 = var1_1;
                            var51_47 = var19_20;
                            mm3_0.a((LP1)var8_8, (String)var13_14, var96_83, (tv0_0)var1_1, var64_57, null, var66_58, (b30_0)var19_20, var54_50, var55_51);
                            var38_38 = -2.185565E-29f;
                            var19_20.K(-1881299837);
                            var37_37 = (int)var19_20.J(var4_4);
                            var36_36 = var19_20.v();
                            if (var37_37 != 0 || var36_36 == var30_31) {
                                var36_36 = new bP2$l((t50)var4_4);
                                var19_20.o(var36_36);
                            }
                            var36_36 = (Function1)var36_36;
                            var19_20.E();
                            var31_32 = var26_27;
                            var12_13 = androidx.compose.foundation.layout.j.c(C50.c((LP1)var3_3, (t50)var26_27, (Function1)var36_36), var128_107);
                            var37_37 = 18;
                            var38_38 = var37_37;
                            var130_109 = 26;
                            var25_26 = var109_93;
                            var12_13 = androidx.compose.foundation.layout.h.h((LP1)var12_13, var38_38, var130_109, var38_38, var109_93);
                            var31_32 = zp.f;
                            var4_4 = var122_101;
                            var24_25 = 54;
                            var25_26 = 7.6E-44f;
                            var31_32 = iQ2.a((zp$e)var31_32, (Gx$b)var122_101, (b30_0)var19_20, var24_25);
                            var129_108 = var19_20.F();
                            var30_31 = var19_20.m();
                            var12_13 = a30_0.c((b30_0)var19_20, (LP1)var12_13);
                            var36_36 = var19_20.i();
                            var76_66 = var36_36 instanceof mp;
                            if (var76_66 == 0) break block101;
                            var19_20.A();
                            var76_66 = (int)var19_20.e();
                            if (var76_66 != 0) {
                                var36_36 = var104_88;
                                var19_20.C((Function0)var104_88);
lbl876:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var19_20.n();
                            ** continue;
                            var36_36 = var123_102;
                            Ow3.a((b30_0)var19_20, var31_32, (Function2)var123_102);
                            var31_32 = var2_2;
                            Ow3.a((b30_0)var19_20, var30_31, (Function2)var2_2);
                            var37_37 = (int)var19_20.e();
                            if (var37_37 == 0 && (var37_37 = (int)Intrinsics.areEqual(var31_32 = var19_20.v(), var30_31 = Integer.valueOf(var129_108))) != 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var31_32 = var107_91 /* !! */ ;
                            re0_0.a(var129_108, (b30_0)var19_20, var129_108, var107_91 /* !! */ );
                            ** continue;
                            var31_32 = var108_92;
                            Ow3.a((b30_0)var19_20, var12_13, (Function2)var108_92);
                            if (var95_82 != null && (var12_13 = var95_82.getHelpfulContent()) != null && (var12_13 = StringsKt.toIntOrNull((String)var12_13)) != null) {
                                var5_5 = var12_13.intValue();
lbl895:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var5_5 = 0;
                            var6_6 = 0.0f;
                            var47_44 = null;
                            ** continue;
                            var12_13 = this;
                            var31_32 = this.l;
                            var4_4 = (Boolean)var31_32.getValue();
                            var30_31 = Boolean.TRUE;
                            var129_108 = (int)Intrinsics.areEqual(var4_4, var30_31);
                            if (var129_108 != 0) {
                                var129_108 = 1;
                                var130_109 = 1.4E-45f;
                                var5_5 += var129_108;
                            }
                            var4_4 = new Sl$a();
                            var131_110 = xx_1.e;
                            var133_111 = (char)-2;
                            var134_112 = 0L;
                            var136_113 = 0L;
                            var138_114 = 0L;
                            var126_104 = var30_31;
                            var30_31 = new S93(var131_110, var134_112, null, null, null, null, null, var136_113, null, null, null, var138_114, null, null, var133_111);
                            var4_4.g((S93)var30_31);
                            var30_31 = var5_5;
                            var76_66 = var30_31.intValue();
                            var5_5 = 1000;
                            var6_6 = 1.401E-42f;
                            if (var76_66 < var5_5) {
                                var30_31 = var30_31.toString();
                            } else {
                                var44_42 = Math.log(var30_31.intValue());
                                var140_115 = 1000.0;
                                var116_98 = Math.log(var140_115);
                                var76_66 = (int)(var44_42 /= var116_98);
                                var47_44 = StringCompanionObject.INSTANCE;
                                var24_25 = var30_31.intValue();
                                var116_98 = var24_25;
                                var142_116 = var76_66;
                                var57_53 = Math.pow(var140_115, var142_116);
                                var30_31 = var116_98 /= var57_53;
                                var5_5 = 1;
                                var6_6 = 1.4E-45f;
                                var76_66 -= var5_5;
                                var23_24 = "kMBTPE";
                                var76_66 = var23_24.charAt(var76_66);
                                var36_36 = Character.valueOf((char)var76_66);
                                var53_49 = 2;
                                var46_43 = 2.8E-45f;
                                var8_8 = new Object[var53_49];
                                var14_15 = 0;
                                var15_16 = 0.0f;
                                var13_14 = null;
                                var8_8[0] = var30_31;
                                var8_8[var5_5] = var36_36;
                                var30_31 = xh2_0.a((Object[])var8_8, var53_49, "%.1f%c", "format(...)");
                                var36_36 = ".0";
                                var47_44 = var39_39;
                                var30_31 = b.n((String)var30_31, (String)var36_36, (String)var39_39, false);
                            }
                            var36_36 = new StringBuilder();
                            var36_36.append((String)var30_31);
                            var36_36.append(" ");
                            var30_31 = var36_36.toString();
                            var4_4.c((String)var30_31);
                            var4_4.d();
                            var131_110 = xx_1.g;
                            var133_111 = (char)-2;
                            var134_112 = 0L;
                            var136_113 = 0L;
                            var138_114 = 0L;
                            var126_104 = var30_31;
                            var30_31 = new S93(var131_110, var134_112, null, null, null, null, null, var136_113, null, null, null, var138_114, null, null, var133_111);
                            var4_4.g((S93)var30_31);
                            var30_31 = var114_96.getResources();
                            var76_66 = R$string.people_found_helpful;
                            var30_31 = var30_31.getString(var76_66);
                            var36_36 = var115_97;
                            Intrinsics.checkNotNullExpressionValue(var30_31, (String)var115_97);
                            var4_4.c((String)var30_31);
                            var8_8 = var4_4.h();
                            var110_94 = Em3.f(10);
                            var101_86 = 0;
                            var144_117 = 262038;
                            var14_15 = 0;
                            var15_16 = 0.0f;
                            var13_14 = null;
                            var61_55 = 0L;
                            var81_71 = 0.0;
                            var10_10 = 0;
                            var11_11 = 0.0f;
                            var22_23 = null;
                            var87_75 = 0L;
                            var90_77 = null;
                            var102_87 = 0L;
                            var92_79 = 0;
                            var123_102 = null;
                            var104_88 = null;
                            var105_89 = 0;
                            var100_85 = 1772544;
                            var32_33 = var1_1;
                            var86_74 = var63_56;
                            Ll3.c((Sl)var8_8, null, var61_55, var110_94, null, (tv0_0)var1_1, (RU0)var63_56, var87_75, null, null, var102_87, 0, false, 0, 0, null, null, null, (b30_0)var19_20, var100_85, 0, var144_117);
                            var129_108 = 12;
                            var130_109 = var129_108;
                            var78_68 = 0;
                            var86_74 = null;
                            var55_51 = 11;
                            var35_35 = 0;
                            var50_46 = null;
                            var54_50 = 0;
                            var89_76 = null;
                            var32_33 = var3_3;
                            var3_3 = androidx.compose.foundation.layout.h.i((LP1)var3_3, 0.0f, 0.0f, var130_109, 0.0f, var55_51);
                            var4_4 = (Boolean)var31_32.getValue();
                            var36_36 = var12_13.m;
                            var23_24 = var93_80;
                            var47_44 = var95_82;
                            var30_31 = new bP2$m((yi2_1)var93_80, (ProductReview)var95_82, (Function1)var36_36, (tr1_0)var31_32);
                            var37_37 = 6;
                            var38_38 = 8.4E-45f;
                            bp2_0.a((LP1)var3_3, (Boolean)var4_4, (bP2$m)var30_31, (b30_0)var19_20, var37_37);
                            var19_20.p();
                            var19_20.E();
lbl1022:
                            // 2 sources

                            return Unit.a;
                        }
                        var12_13 = this;
                        s20.a();
                        throw null;
                    }
                    var12_13 = var3_3;
                    s20.a();
                    throw null;
                }
                var12_13 = var3_3;
                s20.a();
                throw null;
            }
            var12_13 = var3_3;
            s20.a();
            throw null;
        }
        catch (Exception v0) {
            ** continue;
        }
    }
}

