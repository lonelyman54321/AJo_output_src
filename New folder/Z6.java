/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$font;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class Z6 {
    public static j7_0 a;
    public static final ParcelableSnapshotMutableState b;
    public static final ParcelableSnapshotMutableState c;
    public static final ParcelableSnapshotMutableState d;
    public static final ParcelableSnapshotMutableState e;
    public static boolean f;
    public static boolean g;

    static {
        b = J83.g(mz0_2.a);
        c = J83.g(null);
        d = J83.g(null);
        e = J83.g(2);
    }

    public static final void a(j7_0 j7_02, yT1 yT12, oa1_1 oa1_12, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Object object2 = "loginViewModel";
        Intrinsics.checkNotNullParameter(oa1_12, (String)object2);
        object = object.g(-208720601);
        a = j7_02;
        Object object3 = j7_02.e;
        Object object4 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        object4 = (mu1_1)((j30_0)object).j((H30)object4);
        Object object5 = new z6$a_0(j7_02);
        ((LiveData)object3).e((mu1_1)object4, (F62)object5);
        object3 = oa1_12.r;
        object4 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        object4 = (mu1_1)((j30_0)object).j((H30)object4);
        object5 = new g6_0(oa1_12, 0);
        Object object6 = new Z6$b((g6_0)object5);
        ((LiveData)object3).e((mu1_1)object4, (F62)object6);
        boolean bl2 = g;
        object4 = e;
        int n7 = 2;
        if (!bl2) {
            object3 = n7;
            ((h83_0)object4).setValue(object3);
            object3 = mz0_2.a;
            Intrinsics.checkNotNullParameter(object3, "<set-?>");
            b.setValue(object3);
            object3 = od3_2.a();
            object6 = ld3_2.STORE_AJIOGRAM;
            String string2 = ((ld3_2)((Object)object6)).getStoreId();
            bl2 = Intrinsics.areEqual(object3, string2);
            object3 = bl2 ? ((ld3_2)((Object)object6)).getStoreId() : ld3_2.STORE_AJIO.getStoreId();
            j7_02.b((String)object3);
        }
        if (!(bl2 = f)) {
            Intrinsics.checkNotNullParameter(oa1_12, (String)object2);
            object2 = (UserInformation)j7_02.c.getValue();
            n4 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0);
            if (n4 == 0) {
                z40_0.Companion.getClass();
                object2 = z40$a.a((Context)j7_02.a).a;
                object3 = "enable_Signup_popup";
                n4 = (int)(((ao0_0)object2).a((String)object3) ? 1 : 0);
                if (n4 != 0) {
                    n4 = (int)(vl0_0.a ? 1 : 0);
                    if (n4 != 0) {
                        object2 = vl0_0.b;
                        if (object2 != null) {
                            object3 = oa1_12.r;
                            ((LiveData)object3).k(object2);
                        }
                    } else {
                        oa1_12.e();
                    }
                }
            }
        }
        object2 = (Number)((h83_0)object4).getValue();
        n4 = ((Number)object2).intValue();
        bl2 = false;
        object3 = null;
        if (n4 != 0) {
            int n8 = 1;
            if (n4 != n8) {
                if (n4 != n7) {
                    n4 = 1684238831;
                    ((j30_0)object).K(n4);
                    ((j30_0)object).T(false);
                } else {
                    n4 = 1683993094;
                    ((j30_0)object).K(n4);
                    Z6.h((b30_0)object, 0);
                    ((j30_0)object).T(false);
                }
            } else {
                ((j30_0)object).K(1684180985);
                n4 = 8;
                s6.a(j7_02, (b30_0)object, n4);
                ((j30_0)object).T(false);
            }
        } else {
            ((j30_0)object).K(1684076143);
            n4 = 72;
            Z6.g(yT12, j7_02, (b30_0)object, n4);
            ((j30_0)object).T(false);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new Q6(j7_02, yT12, oa1_12, n3);
        }
    }

    public static final void b(ArrayList arrayList, t6_0 t6_02, j7_0 j7_02, b30_0 b30_02, int n3) {
        int n4;
        int n7;
        h6_0 h6_02;
        zp$h zp$h;
        float f5;
        FillElement fillElement;
        Object object;
        ArrayList arrayList2 = arrayList;
        t6_0 t6_03 = t6_02;
        j7_0 j7_03 = j7_02;
        Intrinsics.checkNotNullParameter(arrayList, "categories");
        Intrinsics.checkNotNullParameter(t6_02, "onItemClick");
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        int n8 = 849827759;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n8);
        object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (!bl2) {
            object = object2;
            fillElement = null;
            f5 = 0.0f;
            zp$h = null;
            h6_02 = null;
            n7 = 0;
            n4 = 0;
            int n10 = 262143;
            object2 = new CMSNavigation(null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, n10, null);
            arrayList.add(object2);
            int n14 = 262143;
            object2 = new CMSNavigation(null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, n14, null);
            arrayList.add(object2);
        }
        object2 = new G11$a(2);
        fillElement = j.c;
        int n15 = 8;
        f5 = n15;
        object = h.i(fillElement, 0.0f, f5, 0.0f, 0.0f, 13);
        zp$h = zp.e;
        h6_02 = new h6_0(arrayList2, t6_03, j7_03);
        fillElement = null;
        f5 = 0.0f;
        n7 = 196656;
        n4 = 476;
        Cq1.a((G11$a)object2, (LP1)object, null, null, false, zp$h, null, null, false, h6_02, (b30_0)object3, n7, n4);
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            n15 = n3;
            ((CF2)object3).d = object2 = new i6_0(arrayList2, t6_03, j7_03, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void c(CMSNavigation var0, t6_0 var1_1, int var2_2, j7_0 var3_3, b30_0 var4_4, int var5_5) {
        var6_6 = var0;
        var7_7 = var1_1;
        var8_8 = var3_3;
        var9_9 = 1;
        var10_10 = 1.4E-45f;
        var11_11 = null;
        Intrinsics.checkNotNullParameter(var0, "category");
        Intrinsics.checkNotNullParameter(var1_1, "onItemClick");
        Intrinsics.checkNotNullParameter(var3_3, "viewModel");
        var12_12 = -970107386;
        var13_13 /* !! */  = var4_4;
        var14_14 = var4_4.g(var12_12);
        var15_15 = 16;
        var16_16 = 7;
        var17_17 = var16_16;
        var18_18 = 6 != 0;
        var19_19 = 8.4E-45f;
        var20_20 = (float)var18_18;
        var21_21 = var2_2 % 2;
        if (var21_21 != 0) {
            var22_22 = var15_15;
        } else {
            var22_22 = var20_20;
            var20_20 = var15_15;
        }
        var23_23 = od3_2.a();
        var24_24 = ld3_2.STORE_AJIOGRAM.getStoreId();
        var25_25 = Intrinsics.areEqual(var23_23, var24_24);
        var26_26 = var25_25 != 0 ? nz_1.a : OX.f;
        var28_27 = LP1$a.b;
        var29_28 = 1.0f;
        var13_13 /* !! */  = h.h(j.c((LP1)var28_27, var29_28), var20_20, var17_17, var22_22, var17_17);
        var30_29 /* !! */  = fg2_1.a;
        var13_13 /* !! */  = androidx.compose.foundation.a.b((LP1)var13_13 /* !! */ , var26_26, (i13)var30_29 /* !! */ );
        var31_30 = 8;
        var20_20 = 1.1E-44f;
        var22_22 = var31_30;
        var32_31 = SP2.a(var22_22);
        var13_13 /* !! */  = QV.a((LP1)var13_13 /* !! */ , (i13)var32_31);
        var32_31 = HA.e(Nc$a.a, false);
        var25_25 = var14_14.P;
        var24_24 = var14_14.P();
        var13_13 /* !! */  = a30_0.c(var14_14, (LP1)var13_13 /* !! */ );
        N20.W.getClass();
        var33_32 = N20$a.b;
        var34_33 = var15_15;
        var35_34 = var14_14.a;
        var36_35 = var35_34 instanceof mp;
        var37_36 = var35_34;
        if (var36_35) {
            var14_14.A();
            var36_35 = var14_14.O;
            if (var36_35) {
                var14_14.C((Function0)var33_32);
            } else {
                var14_14.n();
            }
            var38_37 = N20$a.e;
            Ow3.a(var14_14, var32_31, (Function2)var38_37);
            var32_31 = N20$a.d;
            Ow3.a(var14_14, var24_24, (Function2)var32_31);
            var24_24 = N20$a.f;
            var39_38 = var14_14.O;
            if (var39_38 != 0 || (var31_30 = (int)Intrinsics.areEqual(var35_34 = var14_14.v(), var30_29 /* !! */  = Integer.valueOf(var25_25))) == 0) {
                rk_0.a(var25_25, var14_14, var25_25, (N20$a$a)var24_24);
            }
            var35_34 = N20$a.c;
            Ow3.a(var14_14, var13_13 /* !! */ , (Function2)var35_34);
            var13_13 /* !! */  = var0.getAspectRatio();
            if (var13_13 /* !! */  != null && (var31_30 = var13_13 /* !! */ .length()) > 0) {
                var30_29 /* !! */  = new String[]{":"};
                var13_13 /* !! */  = StringsKt.a0((CharSequence)var13_13 /* !! */ , var30_29 /* !! */ , false, 0, (int)var18_18);
                var40_39 /* !! */  = (String)var13_13 /* !! */ .get(0);
                var19_19 = Float.parseFloat((String)var40_39 /* !! */ );
                var17_17 = Float.parseFloat((String)var13_13 /* !! */ .get(var9_9));
                var13_13 /* !! */  = Float.valueOf(var19_19 /= var17_17);
            } else {
                var16_16 = 0;
                var17_17 = 0.0f;
                var13_13 /* !! */  = null;
            }
            if (var13_13 /* !! */  == null) {
                var13_13 /* !! */  = p50_0.c;
            }
            var40_39 /* !! */  = var0.getActiveImageUrl();
            var14_14.u(1998134191);
            var31_30 = 8;
            var20_20 = 1.1E-44f;
            var40_39 /* !! */  = u63.a(var40_39 /* !! */ , var14_14, var31_30);
            var14_14.T(false);
            var30_29 /* !! */  = var0.getInactiveAltText();
            if (var30_29 /* !! */  == null) {
                var30_29 /* !! */  = var0.getName();
            }
            var23_23 = i70$a.g;
            var9_9 = 1065353216;
            var10_10 = 1.0f;
            var41_40 /* !! */  = j.c((LP1)var28_27, var10_10);
            Intrinsics.checkNotNull(var13_13 /* !! */ );
            var17_17 = var13_13 /* !! */ .floatValue();
            var41_40 /* !! */  = androidx.compose.foundation.layout.c.a((LP1)var41_40 /* !! */ , var17_17);
            var13_13 /* !! */  = var0.getName();
            var42_41 = "";
            if (var13_13 /* !! */  == null) {
                var13_13 /* !! */  = var42_41;
            }
            var11_11 = hv3_0.K(R$string.category);
            var11_11 = Ft2.a((String)var13_13 /* !! */ , (String)var11_11);
            var13_13 /* !! */  = new l6_0((j7_0)var8_8, (CMSNavigation)var6_6, (t6_0)var7_7);
            var4_4 = var35_34;
            var41_40 /* !! */  = androidx.compose.foundation.d.b((LP1)var41_40 /* !! */ , false, (String)var11_11, (Function0)var13_13 /* !! */ , 5);
            var11_11 = new m6_0((CMSNavigation)var6_6);
            var41_40 /* !! */  = CY2.b((LP1)var41_40 /* !! */ , false, (Function1)var11_11);
            var43_42 = 24576;
            var44_43 = 104;
            var45_44 = 1.46E-43f;
            var13_13 /* !! */  = var40_39 /* !! */ ;
            var40_39 /* !! */  = var30_29 /* !! */ ;
            var30_29 /* !! */  = var41_40 /* !! */ ;
            var41_40 /* !! */  = var32_31;
            var22_22 = 0.0f;
            var46_45 = var24_24;
            var24_24 = null;
            var7_7 = var38_37;
            var36_35 = false;
            var38_37 = null;
            var29_28 = 0.0f;
            var11_11 = var33_32;
            var33_32 = var14_14;
            var47_46 = var35_34;
            var4_4 = var32_31;
            var8_8 = var37_36;
            var9_9 = 0;
            var10_10 = 0.0f;
            var41_40 /* !! */  = null;
            var39_38 = var44_43;
            var15_15 = var45_44;
            Pd1.a((im2)var13_13 /* !! */ , (String)var40_39 /* !! */ , (LP1)var30_29 /* !! */ , null, (i70_0)var23_23, 0.0f, null, var14_14, var43_42, var44_43);
            var16_16 = 3;
            var17_17 = 4.2E-45f;
            var40_39 /* !! */  = var28_27;
            var6_6 = h.e(j.n((LP1)var28_27, null, var16_16), var34_33);
            var30_29 /* !! */  = zp.a;
            var32_31 = Nc$a.j;
            var25_25 = 0;
            var30_29 /* !! */  = iQ2.a((zp$e)var30_29 /* !! */ , (Gx$b)var32_31, var14_14, 0);
            var21_21 = var14_14.P;
            var23_23 = var14_14.P();
            var6_6 = a30_0.c(var14_14, (LP1)var6_6);
            var48_47 = var37_36 instanceof mp;
            if (var48_47) {
                var14_14.A();
                var48_47 = var14_14.O;
                if (var48_47) {
                    var14_14.C((Function0)var11_11);
                } else {
                    var14_14.n();
                }
                Ow3.a(var14_14, var30_29 /* !! */ , (Function2)var7_7);
                var35_34 = var4_4;
                Ow3.a(var14_14, var23_23, (Function2)var4_4);
                var31_30 = (int)var14_14.O;
                if (var31_30 == 0 && (var31_30 = (int)Intrinsics.areEqual(var30_29 /* !! */  = var14_14.v(), var23_23 = Integer.valueOf(var21_21))) != 0) {
                    var28_27 = var46_45;
lbl158:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var28_27 = var46_45;
                rk_0.a(var21_21, var14_14, var21_21, (N20$a$a)var46_45);
                ** continue;
                var33_32 = var47_46;
                Ow3.a(var14_14, var6_6, (Function2)var47_46);
                var6_6 = mq2_0.a;
                var31_30 = 1058642330;
                var20_20 = 0.6f;
                var30_29 /* !! */  = var6_6.a((LP1)var40_39 /* !! */ , var20_20, true);
                var38_37 = zp.c;
                var23_23 = Nc$a.m;
                var22_22 = 0.0f;
                var32_31 = null;
                var24_24 = oZ.a((zp$l)var38_37, (Gx$a)var23_23, var14_14, 0);
                var21_21 = var14_14.P;
                var13_13 /* !! */  = var14_14.P();
                var30_29 /* !! */  = a30_0.c(var14_14, (LP1)var30_29 /* !! */ );
                var9_9 = var8_8 instanceof mp;
                if (var9_9) {
                    var14_14.A();
                    var9_9 = (int)var14_14.O;
                    if (var9_9) {
                        var14_14.C((Function0)var11_11);
                    } else {
                        var14_14.n();
                    }
                    Ow3.a(var14_14, var24_24, (Function2)var7_7);
                    Ow3.a(var14_14, var13_13 /* !! */ , (Function2)var35_34);
                    var9_9 = (int)var14_14.O;
                    if (var9_9 || !(var9_9 = (int)Intrinsics.areEqual(var41_40 /* !! */  = var14_14.v(), var13_13 /* !! */  = Integer.valueOf(var21_21)))) {
                        rk_0.a(var21_21, var14_14, var21_21, (N20$a$a)var28_27);
                    }
                    Ow3.a(var14_14, var30_29 /* !! */ , (Function2)var33_32);
                    var41_40 /* !! */  = var0.getName();
                    var16_16 = 14;
                    var17_17 = 2.0E-44f;
                    var49_48 = 13;
                    var34_33 = 1.8E-44f;
                    if (var41_40 /* !! */  != null) {
                        var30_29 /* !! */  = " ";
                        var21_21 = 0;
                        var22_22 = 0.0f;
                        var32_31 = null;
                        var9_9 = (int)StringsKt.F((CharSequence)var41_40 /* !! */ , (CharSequence)var30_29 /* !! */ , false);
                        var31_30 = 1;
                        var20_20 = 1.4E-45f;
                        if (var9_9 == var31_30) {
                            var9_9 = -803683698;
                            var10_10 = -1.0251549E10f;
                            var14_14.K(var9_9);
                            var41_40 /* !! */  = var0.getName();
                            if (var41_40 /* !! */  == null) {
                                var41_40 /* !! */  = var42_41;
                            }
                            var50_49 = Em3.f(var49_48);
                            var52_50 = Em3.f(var49_48);
                            var21_21 = R$font.muli_regular;
                            var54_51 = var23_23;
                            var25_25 = 0;
                            var23_23 = null;
                            var48_47 = false;
                            var24_24 = null;
                            var13_13 /* !! */  = ZU0.a(var21_21, null, 0, var16_16);
                            var32_31 = new LU0[var31_30];
                            var32_31[0] = var13_13 /* !! */ ;
                            var55_52 = SU0.a(var32_31);
                            var13_13 /* !! */  = new tv0_0(700);
                            var56_54 = zx_0.d(0xFF000000L);
                            var59_57 = false;
                            var60_59 = 0L;
                            var62_60 = 0xFDFFD8;
                            var58_55 = new xm3(var56_54, var50_49, (tv0_0)var13_13 /* !! */ , var55_52, var60_59, null, 0, var52_50, var62_60);
                            var13_13 /* !! */  = new n6_0(0);
                            var13_13 /* !! */  = CY2.a((LP1)var40_39 /* !! */ , (Function1)var13_13 /* !! */ );
                            var30_29 /* !! */  = null;
                            var21_21 = 3;
                            var22_22 = 4.2E-45f;
                            var63_61 /* !! */  = j.n((LP1)var13_13 /* !! */ , null, var21_21);
                            var31_30 = 5;
                            var20_20 = 7.0E-45f;
                            var13_13 /* !! */  = new Cj3(var31_30);
                            var64_63 = 0L;
                            var26_26 = 0L;
                            var66_65 = var54_51;
                            var49_48 = 0;
                            var34_33 = 0.0f;
                            var67_66 = var38_37;
                            var36_35 = false;
                            var38_37 = null;
                            var29_28 = 0.0f;
                            var68_67 = var33_32;
                            var33_32 = null;
                            var69_68 = var28_27;
                            var28_27 = null;
                            var70_69 = 0L;
                            var72_70 = var35_34;
                            var73_71 = var70_69;
                            var37_36 = null;
                            var75_73 = 0L;
                            var43_42 = 2;
                            var44_43 = 0;
                            var45_44 = 0.0f;
                            var77_75 = 3;
                            var78_77 = 3120;
                            var79_79 = 54780;
                            var80_81 /* !! */  = var13_13 /* !! */ ;
                            var13_13 /* !! */  = var41_40 /* !! */ ;
                            var41_40 /* !! */  = var40_39 /* !! */ ;
                            var40_39 /* !! */  = var63_61 /* !! */ ;
                            var63_61 /* !! */  = var80_81 /* !! */ ;
                            var80_81 /* !! */  = var14_14;
                            Ll3.b((String)var13_13 /* !! */ , (LP1)var40_39 /* !! */ , var64_63, var26_26, null, null, null, var70_69, null, (Cj3)var63_61 /* !! */ , var75_73, var43_42, false, var77_75, 0, null, var58_55, var14_14, 0, var78_77, var79_79);
                            var14_14.T(false);
                            var16_16 = 0;
                            var17_17 = 0.0f;
                            var13_13 /* !! */  = null;
lbl273:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                    }
                    var41_40 /* !! */  = var40_39 /* !! */ ;
                    var66_65 = var23_23;
                    var67_66 = var38_37;
                    var68_67 = var33_32;
                    var69_68 = var28_27;
                    var72_70 = var35_34;
                    var31_30 = 5;
                    var20_20 = 7.0E-45f;
                    var18_18 = -802866290 != 0;
                    var19_19 = -1.1088574E10f;
                    var14_14.K((int)var18_18);
                    var40_39 /* !! */  = var0.getName();
                    if (var40_39 /* !! */  == null) {
                        var40_39 /* !! */  = var42_41;
                    }
                    var81_83 = Em3.f(var49_48);
                    var83_84 = Em3.f(var49_48);
                    var21_21 = R$font.muli_regular;
                    var48_47 = false;
                    var24_24 = null;
                    var13_13 /* !! */  = ZU0.a(var21_21, null, 0, var16_16);
                    var23_23 = new LU0[]{var13_13 /* !! */ };
                    var85_85 = SU0.a(var23_23);
                    var13_13 /* !! */  = new tv0_0(700);
                    var86_86 = 0xFF000000L;
                    var88_87 = zx_0.d(var86_86);
                    var55_53 = null;
                    var90_88 = 0L;
                    var59_58 = 0xFDFFD8;
                    var58_56 = new xm3(var88_87, var81_83, (tv0_0)var13_13 /* !! */ , var85_85, var90_88, null, 0, var83_84, var59_58);
                    var13_13 /* !! */  = new Object();
                    var13_13 /* !! */  = CY2.a((LP1)var41_40 /* !! */ , (Function1)var13_13 /* !! */ );
                    var21_21 = 0;
                    var22_22 = 0.0f;
                    var32_31 = null;
                    var25_25 = 3;
                    var63_62 = j.n((LP1)var13_13 /* !! */ , null, var25_25);
                    var13_13 /* !! */  = new Cj3(var31_30);
                    var64_64 = 0L;
                    var26_26 = 0L;
                    var36_35 = false;
                    var29_28 = 0.0f;
                    var38_37 = null;
                    var33_32 = null;
                    var28_27 = null;
                    var73_72 = 0L;
                    var37_36 = null;
                    var75_74 = 0L;
                    var43_42 = 2;
                    var44_43 = 0;
                    var45_44 = 0.0f;
                    var77_76 = 1;
                    var78_78 = 3120;
                    var79_80 = 54780;
                    var80_82 /* !! */  = var13_13 /* !! */ ;
                    var13_13 /* !! */  = var40_39 /* !! */ ;
                    var40_39 /* !! */  = var63_62;
                    var63_62 = var80_82 /* !! */ ;
                    var80_82 /* !! */  = var14_14;
                    Ll3.b((String)var13_13 /* !! */ , (LP1)var40_39 /* !! */ , var64_64, var26_26, null, null, null, var73_72, null, (Cj3)var63_62, var75_74, var43_42, false, var77_76, 0, null, var58_56, var14_14, 0, var78_78, var79_80);
                    var16_16 = 0;
                    var17_17 = 0.0f;
                    var13_13 /* !! */  = null;
                    var14_14.T(false);
                    ** continue;
                    var18_18 = true;
                    var19_19 = 1.4E-45f;
                    var14_14.T(var18_18);
                    var31_30 = 1053609165;
                    var20_20 = 0.4f;
                    var41_40 /* !! */  = var6_6.a((LP1)var41_40 /* !! */ , var20_20, var18_18);
                    var40_39 /* !! */  = var66_65;
                    var6_6 = var67_66;
                    var6_6 = oZ.a((zp$l)var67_66, (Gx$a)var66_65, var14_14, 0);
                    var16_16 = var14_14.P;
                    var40_39 /* !! */  = var14_14.P();
                    var41_40 /* !! */  = a30_0.c(var14_14, (LP1)var41_40 /* !! */ );
                    var92_89 = var8_8 instanceof mp;
                    if (var92_89) {
                        var14_14.A();
                        var92_89 = var14_14.O;
                        if (var92_89) {
                            var14_14.C((Function0)var11_11);
                        } else {
                            var14_14.n();
                        }
                        Ow3.a(var14_14, var6_6, (Function2)var7_7);
                        var6_6 = var72_70;
                        Ow3.a(var14_14, var40_39 /* !! */ , (Function2)var72_70);
                        var93_90 = var14_14.O;
                        if (!var93_90 && (var93_90 = Intrinsics.areEqual(var6_6 = var14_14.v(), var7_7 = Integer.valueOf(var16_16)))) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var6_6 = var69_68;
                        rk_0.a(var16_16, var14_14, var16_16, (N20$a$a)var69_68);
                        ** continue;
                        var6_6 = var68_67;
                        Ow3.a(var14_14, var41_40 /* !! */ , (Function2)var68_67);
                        var9_9 = 1;
                        var10_10 = 1.4E-45f;
                        var14_14.T((boolean)var9_9);
                        var14_14.T((boolean)var9_9);
                        var14_14.T((boolean)var9_9);
                        var13_13 /* !! */  = var14_14.X();
                        if (var13_13 /* !! */  != null) {
                            var41_40 /* !! */  = var40_39 /* !! */ ;
                            var6_6 = var0;
                            var7_7 = var1_1;
                            var8_8 = var3_3;
                            var12_12 = var5_5;
                            var13_13 /* !! */ .d = var40_39 /* !! */  = new p6_0(var0, var1_1, var2_2, var3_3, var5_5);
                        }
                        return;
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
        s20.a();
        throw null;
    }

    public static final void d(String string2, b30_0 object, int n3) {
        y6_0 y6_02;
        object = object.g(-1472915287);
        int n4 = n3 & 0xE;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 0xB) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            ((j30_0)object).u(1998134191);
            pq_0 pq_02 = u63.a(string2, (b30_0)object, 8);
            n4 = 0;
            y6_02 = null;
            ((j30_0)object).T(false);
            i70$a$b i70$a$b = i70$a.g;
            Object object2 = j.c(LP1$a.b, 1.0f);
            int n8 = 90;
            float f5 = n8;
            object2 = j.d((LP1)object2, f5);
            Object object3 = new x6_0(0);
            object3 = androidx.compose.foundation.d.b((LP1)object2, false, null, (Function0)object3, 7);
            object2 = "";
            int n10 = 24624;
            int n14 = 104;
            Pd1.a(pq_02, (String)object2, (LP1)object3, null, i70$a$b, 0.0f, null, (b30_0)object, n10, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            y6_02 = new y6_0(string2, n3);
            ((CF2)object).d = y6_02;
        }
    }

    public static final void e(String string2, j7_0 j7_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        object = object.g(-897490969);
        ((j30_0)object).u(1998134191);
        pq_0 pq_02 = u63.a(string2, (b30_0)object, 8);
        w6_0 w6_02 = null;
        ((j30_0)object).T(false);
        Object object2 = re1_1.h();
        if (object2 == null || (object2 = ((NavigationParent)object2).getAltText()) == null) {
            int n4 = R$string.switch_store_banner;
            object2 = hv3_0.K(n4);
        }
        i70$a$b i70$a$b = i70$a.g;
        LP1 lP1 = androidx.compose.foundation.layout.c.a(j.c(LP1$a.b, 1.0f), 4.1666665f);
        v6_0 v6_02 = new v6_0(j7_02);
        lP1 = androidx.compose.foundation.d.b(lP1, false, null, v6_02, 7);
        v6_02 = null;
        int n7 = 24576;
        int n8 = 104;
        Pd1.a(pq_02, (String)object2, lP1, null, i70$a$b, 0.0f, null, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            w6_02 = new w6_0(string2, j7_02, n3);
            ((CF2)object).d = w6_02;
        }
    }

    public static final void f(b30_0 object, int n3) {
        Object object2;
        int n4 = 691594430;
        float f5 = 4.105461E-14f;
        object = object.g(n4);
        if (n3 == 0 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            float f6 = 0.0f;
            n4 = 8;
            f5 = n4;
            rp2_0 rp2_02 = SP2.a(f5);
            object2 = LP1$a.b;
            float f7 = 4;
            object2 = h.e((LP1)object2, f7);
            int n7 = 3;
            f7 = 4.2E-45f;
            LP1 lP1 = j.n((LP1)object2, null, n7);
            u10 u102 = w10_0.b;
            long l2 = 0L;
            int n8 = 1769478;
            int n10 = 28;
            JL.a(lP1, rp2_02, l2, null, f6, u102, (b30_0)object, n8, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new k6_0(n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void g(yT1 yT12, j7_0 j7_02, b30_0 b30_02, int n3) {
        void var34_38;
        Object object;
        Integer n4;
        Object object2;
        Object object3 = yT12;
        Object object4 = j7_02;
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        int n7 = -838544466;
        Object object5 = b30_02;
        j30_0 j30_02 = b30_02.g(n7);
        object5 = LP1$a.b;
        int n8 = 1065353216;
        float f5 = 1.0f;
        Object object6 = j.c((LP1)object5, f5);
        Object object7 = zp.c;
        Gx$a gx$a = Nc$a.m;
        boolean bl2 = false;
        Object var15_15 = null;
        Object object8 = oZ.a((zp$l)object7, gx$a, j30_02, 0);
        int n10 = j30_02.P;
        Object object9 = j30_02.P();
        object6 = a30_0.c(j30_02, (LP1)object6);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = j30_02.a;
        boolean bl3 = mp2 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl3 = j30_02.O;
        if (bl3) {
            j30_02.C(xp1$a);
        } else {
            j30_02.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a(j30_02, object8, n20$a$b);
        object8 = N20$a.d;
        Ow3.a(j30_02, object9, (Function2)object8);
        object9 = N20$a.f;
        int n14 = j30_02.O;
        if (n14 != 0 || !(bl2 = Intrinsics.areEqual(object2 = j30_02.v(), n4 = Integer.valueOf(n10)))) {
            rk_0.a(n10, j30_02, n10, (N20$a$a)object9);
        }
        N20$a$c n20$a$c = N20$a.c;
        Ow3.a(j30_02, object6, n20$a$c);
        double d2 = f5;
        double d5 = 0.0;
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (d7 <= 0) {
            object3 = g9_0.a(1.0f, "invalid weight ", "; must be greater than zero");
            object3 = object3.toString();
            object4 = new IllegalArgumentException((String)object3);
            throw object4;
        }
        float f6 = kotlin.ranges.f.c(f5, Float.MAX_VALUE);
        d7 = 1.0;
        object3 = new LayoutWeightElement(f6, (boolean)d7);
        f6 = 0.0f;
        object4 = null;
        Object object10 = oZ.a((zp$l)object7, gx$a, j30_02, 0);
        int n15 = j30_02.P;
        object2 = j30_02.P();
        object3 = a30_0.c(j30_02, (LP1)object3);
        n8 = mp2 instanceof mp;
        if (n8 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n8 = (int)(j30_02.O ? 1 : 0);
        if (n8 != 0) {
            j30_02.C(xp1$a);
        } else {
            j30_02.n();
        }
        Ow3.a(j30_02, object10, n20$a$b);
        Ow3.a(j30_02, object2, (Function2)object8);
        n8 = (int)(j30_02.O ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object = j30_02.v(), object10 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
            rk_0.a(n15, j30_02, n15, (N20$a$a)object9);
        }
        Ow3.a(j30_02, object3, n20$a$c);
        int n16 = 410533455;
        j30_02.K(n16);
        object3 = d;
        object4 = (String)((h83_0)object3).getValue();
        if (object4 == null || (n15 = ((String)object4).length()) == 0) {
            n15 = 0;
            f6 = 0.0f;
            object4 = null;
        } else {
            object3 = (String)((h83_0)object3).getValue();
            n15 = 0;
            f6 = 0.0f;
            object4 = null;
            Z6.d((String)object3, j30_02, 0);
        }
        j30_02.T(false);
        object3 = CollectionsKt.m0((List)b.getValue());
        object = yT12;
        object10 = j7_02;
        object4 = new t6_0(yT12, j7_02);
        n14 = 520;
        Z6.b((ArrayList)object3, (t6_0)object4, j7_02, j30_02, n14);
        j30_02.T((boolean)d7);
        int n17 = -1361726689;
        j30_02.K(n17);
        object3 = c;
        object4 = (NavigationParent)((h83_0)object3).getValue();
        if (object4 != null) {
            object4 = ((NavigationParent)object4).getSwitchtoStoreIcon();
        } else {
            n15 = 0;
            f6 = 0.0f;
            object4 = null;
        }
        object2 = h40_0.a;
        object2 = z40_0.Companion;
        object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        object2 = "hambuger_store_switch_enable";
        d7 = (double)((ao0_0)object6).a((String)object2);
        if (d7 != false && object4 != null && (n15 = (int)(kotlin.text.b.k((CharSequence)object4) ? 1 : 0)) == 0) {
            n15 = 1065353216;
            f6 = 1.0f;
            object4 = j.c((LP1)object5, f6);
            object5 = null;
            object6 = oZ.a((zp$l)object7, gx$a, j30_02, 0);
            int n18 = j30_02.P;
            object7 = j30_02.P();
            object4 = a30_0.c(j30_02, (LP1)object4);
            boolean bl4 = mp2 instanceof mp;
            if (!bl4) {
                s20.a();
                throw null;
            }
            j30_02.A();
            bl4 = j30_02.O;
            if (bl4) {
                j30_02.C(xp1$a);
            } else {
                j30_02.n();
            }
            Ow3.a(j30_02, object6, n20$a$b);
            Ow3.a(j30_02, object7, (Function2)object8);
            d7 = (double)j30_02.O;
            if (d7 != false || (d7 = (double)Intrinsics.areEqual(object6 = j30_02.v(), object7 = Integer.valueOf(n18))) == false) {
                rk_0.a(n18, j30_02, n18, (N20$a$a)object9);
            }
            Ow3.a(j30_02, object4, n20$a$c);
            object3 = (NavigationParent)((h83_0)object3).getValue();
            if (object3 != null) {
                object2 = ((NavigationParent)object3).getSwitchtoStoreIcon();
            } else {
                n14 = 0;
                object2 = null;
            }
            Z6.e((String)object2, (j7_0)object10, j30_02, 64);
            boolean bl5 = true;
            j30_02.T(bl5);
        } else {
            boolean bl6 = true;
        }
        n15 = 0;
        f6 = 0.0f;
        object4 = null;
        object3 = fn0_2.a(j30_02, false, (boolean)var34_38);
        if (object3 != null) {
            n7 = n3;
            ((CF2)object3).d = object4 = new u6_0((yT1)object, (j7_0)object10, n3);
        }
    }

    public static final void h(b30_0 object, int n3) {
        block9: {
            Object object2;
            block8: {
                block7: {
                    boolean bl2;
                    int bl22 = 2032993960;
                    object = object.g(bl22);
                    if (n3 != 0 || !(bl2 = ((j30_0)object).h())) break block7;
                    ((j30_0)object).D();
                    break block8;
                }
                object2 = LP1$a.b;
                float f5 = 1.0f;
                LP1 lP1 = j.c((LP1)object2, f5);
                Object object3 = zp.c;
                Object object4 = Nc$a.m;
                boolean bl3 = false;
                object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object, 0);
                int n4 = ((j30_0)object).P;
                Object object5 = ((j30_0)object).P();
                lP1 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl4 = mp2 instanceof mp;
                if (!bl4) break block9;
                ((j30_0)object).A();
                bl4 = ((j30_0)object).O;
                if (bl4) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object3);
                object3 = N20$a.f;
                bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = ((j30_0)object).v(), serializable = Integer.valueOf(n4)))) {
                    rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, lP1, (Function2)object3);
                Object object6 = j.c((LP1)object2, f5);
                float f6 = 80;
                object6 = j.d((LP1)object6, f6);
                long l2 = xx_1.m;
                object4 = fg2_1.a;
                object6 = androidx.compose.foundation.a.b((LP1)object6, l2, (i13)object4);
                Q93.b((b30_0)object, (LP1)object6);
                object6 = new G11$a(2);
                int n7 = 8;
                f6 = n7;
                lP1 = h.e((LP1)object2, f6);
                R6 r6 = new Object();
                object3 = null;
                n4 = 0;
                object4 = null;
                bl3 = false;
                object5 = null;
                serializable = null;
                bl4 = false;
                mp2 = null;
                int n8 = 0x30000030;
                int n10 = 508;
                Cq1.a((G11$a)object6, lP1, null, null, false, null, null, null, false, r6, (b30_0)object, n8, n10);
                boolean bl5 = true;
                ((j30_0)object).T(bl5);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new s6_0(n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

