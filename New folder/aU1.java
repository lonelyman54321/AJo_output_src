/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.i$b;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.e$a;
import androidx.navigation.g;
import androidx.navigation.h;
import androidx.navigation.h$b;
import androidx.navigation.i;
import androidx.navigation.i$a;
import androidx.navigation.j;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class aU1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(yT1 var0, j var1_1, LP1 var2_2, Nc var3_3, Function1 var4_4, Function1 var5_5, Function1 var6_6, Function1 var7_7, Function1 var8_8, b30_0 var9_9, int var10_10) {
        block129: {
            block131: {
                block128: {
                    block138: {
                        block141: {
                            block140: {
                                block139: {
                                    block137: {
                                        block132: {
                                            block133: {
                                                block135: {
                                                    block134: {
                                                        block136: {
                                                            block126: {
                                                                block125: {
                                                                    block124: {
                                                                        block130: {
                                                                            block127: {
                                                                                var11_11 = var0;
                                                                                var12_12 = var1_1;
                                                                                var13_13 = var4_4;
                                                                                var14_14 = var5_5;
                                                                                var15_15 /* !! */  = var6_6;
                                                                                var16_16 = var7_7;
                                                                                var17_17 = var8_8;
                                                                                var18_18 = var10_10;
                                                                                var19_19 = 1;
                                                                                var20_20 = var9_9;
                                                                                var21_21 /* !! */  = var9_9.g(-1964664536);
                                                                                var22_22 = var10_10 & 6;
                                                                                if (var22_22 == 0) {
                                                                                    var22_22 = (int)var21_21 /* !! */ .x(var0);
                                                                                    var22_22 = var22_22 != 0 ? 4 : 2;
                                                                                    var22_22 |= var18_18;
                                                                                } else {
                                                                                    var22_22 = var10_10;
                                                                                }
                                                                                var23_23 /* !! */  = var18_18 & 48;
                                                                                if (var23_23 /* !! */  == 0) {
                                                                                    var23_23 /* !! */  = (int)var21_21 /* !! */ .x(var12_12);
                                                                                    var23_23 /* !! */  = var23_23 /* !! */  != 0 ? 32 : 16;
                                                                                    var22_22 |= var23_23 /* !! */ ;
                                                                                }
                                                                                var23_23 /* !! */  = var18_18 & 384;
                                                                                var24_24 /* !! */  = var2_2;
                                                                                if (var23_23 /* !! */  == 0) {
                                                                                    var23_23 /* !! */  = (int)var21_21 /* !! */ .J(var2_2);
                                                                                    var23_23 /* !! */  = var23_23 /* !! */  != 0 ? 256 : 128;
                                                                                    var22_22 |= var23_23 /* !! */ ;
                                                                                }
                                                                                var23_23 /* !! */  = var18_18 & 3072;
                                                                                var25_25 = var3_3;
                                                                                if (var23_23 /* !! */  == 0) {
                                                                                    var23_23 /* !! */  = (int)var21_21 /* !! */ .J(var3_3);
                                                                                    var23_23 /* !! */  = var23_23 /* !! */  != 0 ? 2048 : 1024;
                                                                                    var22_22 |= var23_23 /* !! */ ;
                                                                                }
                                                                                if ((var23_23 /* !! */  = var18_18 & 24576) == 0) {
                                                                                    var23_23 /* !! */  = (int)var21_21 /* !! */ .x(var13_13);
                                                                                    var23_23 /* !! */  = var23_23 /* !! */  != 0 ? 16384 : 8192;
                                                                                    var22_22 |= var23_23 /* !! */ ;
                                                                                }
                                                                                if ((var23_23 /* !! */  = 196608 & var18_18) == 0) {
                                                                                    var23_23 /* !! */  = (int)var21_21 /* !! */ .x(var14_14);
                                                                                    var23_23 /* !! */  = var23_23 /* !! */  != 0 ? 131072 : 65536;
                                                                                    var22_22 |= var23_23 /* !! */ ;
                                                                                }
                                                                                if ((var26_26 = var18_18 & (var23_23 /* !! */  = 0x180000)) == 0) {
                                                                                    var26_26 = (int)var21_21 /* !! */ .x(var15_15 /* !! */ );
                                                                                    var26_26 = var26_26 != 0 ? 0x100000 : 524288;
                                                                                    var22_22 |= var26_26;
                                                                                }
                                                                                if ((var27_27 = var18_18 & (var26_26 = 0xC00000)) == 0) {
                                                                                    var27_27 = (int)var21_21 /* !! */ .x(var16_16);
                                                                                    var27_27 = var27_27 != 0 ? 0x800000 : 0x400000;
                                                                                    var22_22 |= var27_27;
                                                                                }
                                                                                if ((var27_27 = var18_18 & 0x6000000) == 0) {
                                                                                    var27_27 = (int)var21_21 /* !! */ .x(var17_17);
                                                                                    var27_27 = var27_27 != 0 ? 0x4000000 : 0x2000000;
                                                                                    var22_22 |= var27_27;
                                                                                }
                                                                                if ((var28_28 = var22_22 & (var27_27 = 38347923)) != (var29_29 = 0x2492492) || (var28_28 = (int)var21_21 /* !! */ .h()) == 0) break block127;
                                                                                var21_21 /* !! */ .D();
                                                                                var13_13 = var21_21 /* !! */ ;
                                                                                var30_30 = var11_11;
                                                                                break block128;
                                                                            }
                                                                            var21_21 /* !! */ .r0();
                                                                            var28_28 = var18_18 & 1;
                                                                            if (var28_28 != 0 && (var28_28 = (int)var21_21 /* !! */ .c0()) == 0) {
                                                                                var21_21 /* !! */ .D();
                                                                            }
                                                                            var21_21 /* !! */ .U();
                                                                            var31_32 /* !! */  = dw1.a;
                                                                            var31_32 /* !! */  = (mu1_1)var21_21 /* !! */ .j((H30)var31_32 /* !! */ );
                                                                            var32_33 = gw1.a((b30_0)var21_21 /* !! */ );
                                                                            if (var32_33 == null) break block129;
                                                                            var32_33 = var32_33.getViewModelStore();
                                                                            var0.getClass();
                                                                            var20_20 = "viewModelStore";
                                                                            Intrinsics.checkNotNullParameter(var32_33, (String)var20_20);
                                                                            Intrinsics.checkNotNullParameter(var32_33, (String)var20_20);
                                                                            var20_20 = var11_11.p;
                                                                            var33_34 = h$b.a((rd3_0)var32_33);
                                                                            var19_19 = Intrinsics.areEqual(var20_20, var33_34);
                                                                            var20_20 = var11_11.g;
                                                                            if (var19_19 != 0) break block130;
                                                                            var19_19 = var20_20.isEmpty();
                                                                            if (var19_19 == 0) break block131;
                                                                            var11_11.p = var33_34 = h$b.a((rd3_0)var32_33);
                                                                        }
                                                                        var33_34 = "graph";
                                                                        Intrinsics.checkNotNullParameter(var12_12, (String)var33_34);
                                                                        Intrinsics.checkNotNullParameter(var12_12, (String)var33_34);
                                                                        var19_19 = var20_20.isEmpty();
                                                                        if (var19_19 == 0 && (var33_34 = var0.j()) == (var32_33 = i$b.DESTROYED)) {
                                                                            var34_36 = "You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.".toString();
                                                                            var33_34 = new IllegalStateException(var34_36);
                                                                            throw var33_34;
                                                                        }
                                                                        var33_34 = var11_11.c;
                                                                        var19_19 = Intrinsics.areEqual(var33_34, var12_12);
                                                                        var32_33 = var11_11.v;
                                                                        if (var19_19 != 0) break block132;
                                                                        var33_34 = var11_11.c;
                                                                        var30_31 /* !! */  = var11_11.w;
                                                                        if (var33_34 != null) {
                                                                            var24_24 /* !! */  = var11_11.m.keySet();
                                                                            var25_25 = new ArrayList(var24_24 /* !! */ );
                                                                            var25_25 = var25_25.iterator();
                                                                            while ((var35_41 = var25_25.hasNext()) != 0) {
                                                                                var24_24 /* !! */  = (Integer)var25_25.next();
                                                                                var36_42 /* !! */  = var25_25;
                                                                                var25_25 = "id";
                                                                                Intrinsics.checkNotNullExpressionValue(var24_24 /* !! */ , (String)var25_25);
                                                                                var37_43 /* !! */  = var24_24 /* !! */ .intValue();
                                                                                var24_24 /* !! */  = ((Iterable)var30_31 /* !! */ .values()).iterator();
                                                                                while (var38_45 = var24_24 /* !! */ .hasNext()) {
                                                                                    var39_46 = var24_24 /* !! */ .next();
                                                                                    var40_47 /* !! */  = var24_24 /* !! */ ;
                                                                                    var24_24 /* !! */  = var39_46;
                                                                                    var24_24 /* !! */  = (e$a)var39_46;
                                                                                    var41_48 = 1;
                                                                                    var24_24 /* !! */ .d = var41_48;
                                                                                    var17_17 = var8_8;
                                                                                    var24_24 /* !! */  = var40_47 /* !! */ ;
                                                                                }
                                                                                var24_24 /* !! */  = QV.c(ws1_1.c);
                                                                                var41_48 = 0;
                                                                                var35_41 = var11_11.w(var37_43 /* !! */ , null, (n)var24_24 /* !! */ , null);
                                                                                var17_17 = ((Iterable)var30_31 /* !! */ .values()).iterator();
                                                                                while (var38_45 = var17_17.hasNext()) {
                                                                                    var39_46 = var17_17.next();
                                                                                    var40_47 /* !! */  = var17_17;
                                                                                    var17_17 = var39_46;
                                                                                    var17_17 = (e$a)var39_46;
                                                                                    var42_49 = 0;
                                                                                    var17_17.d = false;
                                                                                    var14_14 = var5_5;
                                                                                    var17_17 = var40_47 /* !! */ ;
                                                                                }
                                                                                var42_49 = 0;
                                                                                var14_14 = null;
                                                                                if (var35_41 != 0) {
                                                                                    var35_41 = 1;
                                                                                    var37_43 /* !! */  = (int)var11_11.r(var37_43 /* !! */ , (boolean)var35_41, false);
                                                                                }
                                                                                var14_14 = var5_5;
                                                                                var17_17 = var8_8;
                                                                                var25_25 = var36_42 /* !! */ ;
                                                                            }
                                                                            var19_19 = var33_34.g;
                                                                            var37_43 /* !! */  = 0;
                                                                            var25_25 = null;
                                                                            var35_41 = 1;
                                                                            var11_11.r(var19_19, (boolean)var35_41, false);
                                                                        }
                                                                        var11_11.c = var12_12;
                                                                        var33_34 = var11_11.d;
                                                                        if (var33_34 != null && (var25_25 = var33_34.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                                                                            var25_25 = var25_25.iterator();
                                                                            while ((var35_41 = var25_25.hasNext()) != 0) {
                                                                                var24_24 /* !! */  = (String)var25_25.next();
                                                                                var14_14 = "name";
                                                                                Intrinsics.checkNotNullExpressionValue(var24_24 /* !! */ , (String)var14_14);
                                                                                var32_33.b((String)var24_24 /* !! */ );
                                                                                if ((var24_24 /* !! */  = var33_34.getBundle(var24_24 /* !! */ )) == null) continue;
                                                                                var14_14 = "savedState";
                                                                                Intrinsics.checkNotNullParameter(var24_24 /* !! */ , (String)var14_14);
                                                                            }
                                                                        }
                                                                        var33_34 = var11_11.e;
                                                                        var25_25 = " cannot be found from the current destination ";
                                                                        var24_24 /* !! */  = var11_11.a;
                                                                        if (var33_34 != null) {
                                                                            var42_49 = ((Object)var33_34).length;
                                                                            var17_17 = null;
                                                                            for (var41_48 = 0; var41_48 < var42_49; var41_48 += var19_19) {
                                                                                var43_50 = var42_49;
                                                                                var14_14 = var33_34[var41_48];
                                                                                var39_46 = var33_34;
                                                                                Intrinsics.checkNotNull(var14_14, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                                                                var14_14 = (NavBackStackEntryState)var14_14;
                                                                                var19_19 = var14_14.b;
                                                                                var44_51 = false;
                                                                                var16_16 = null;
                                                                                var33_34 = var11_11.d(var19_19, null);
                                                                                if (var33_34 != null) {
                                                                                    var16_16 = var0.j();
                                                                                    var13_13 = var11_11.p;
                                                                                    var13_13 = var14_14.a((Context)var24_24 /* !! */ , (i)var33_34, (i$b)var16_16, (h)var13_13);
                                                                                    var33_34 = var33_34.a;
                                                                                    var14_14 = var30_31 /* !! */ .get(var33_34 = var32_33.b((String)var33_34));
                                                                                    if (var14_14 == null) {
                                                                                        var14_14 = new e$a((e)var11_11, (p)var33_34);
                                                                                        var30_31 /* !! */ .put(var33_34, var14_14);
                                                                                    }
                                                                                    var14_14 = (e$a)var14_14;
                                                                                    var20_20.addLast(var13_13);
                                                                                    var14_14.h((d)var13_13);
                                                                                    var33_34 = var13_13.b.b;
                                                                                    if (var33_34 != null) {
                                                                                        var19_19 = var33_34.g;
                                                                                        var33_34 = var11_11.f(var19_19);
                                                                                        var11_11.m((d)var13_13, (d)var33_34);
                                                                                    }
                                                                                    var19_19 = 1;
                                                                                    var13_13 = var4_4;
                                                                                    var16_16 = var7_7;
                                                                                    var42_49 = var43_50;
                                                                                    var33_34 = var39_46;
                                                                                    continue;
                                                                                }
                                                                                var19_19 = i.j;
                                                                                var33_34 = i$a.a(var14_14.b, (Context)var24_24 /* !! */ );
                                                                                var33_34 = Gn.a("Restoring the Navigation back stack failed: destination ", (String)var33_34, (String)var25_25);
                                                                                var20_20 = var0.h();
                                                                                var33_34.append(var20_20);
                                                                                var33_34 = var33_34.toString();
                                                                                var34_37 = new IllegalStateException((String)var33_34);
                                                                                throw var34_37;
                                                                            }
                                                                            var0.z();
                                                                            var19_19 = 0;
                                                                            var33_34 = null;
                                                                            var11_11.e = null;
                                                                        }
                                                                        var33_34 = fh1_2.o(var32_33.a).values();
                                                                        var13_13 = new ArrayList();
                                                                        var33_34 = var33_34.iterator();
                                                                        while ((var42_49 = (int)var33_34.hasNext()) != 0) {
                                                                            var16_16 = var14_14 = var33_34.next();
                                                                            var16_16 = (p)var14_14;
                                                                            var44_51 = var16_16.b;
                                                                            if (var44_51) continue;
                                                                            var13_13.add(var14_14);
                                                                        }
                                                                        var33_34 = var13_13.iterator();
                                                                        while ((var45_52 = var33_34.hasNext()) != 0) {
                                                                            var13_13 = (p)var33_34.next();
                                                                            var14_14 = var30_31 /* !! */ .get(var13_13);
                                                                            if (var14_14 == null) {
                                                                                var14_14 = new e$a((e)var11_11, (p)var13_13);
                                                                                var30_31 /* !! */ .put(var13_13, var14_14);
                                                                            }
                                                                            var14_14 = (e$a)var14_14;
                                                                            var13_13.getClass();
                                                                            var16_16 = "state";
                                                                            Intrinsics.checkNotNullParameter(var14_14, (String)var16_16);
                                                                            var13_13.a = var14_14;
                                                                            var42_49 = 1;
                                                                            var13_13.b = var42_49;
                                                                        }
                                                                        var33_34 = var11_11.c;
                                                                        if (var33_34 == null || (var19_19 = (int)var20_20.isEmpty()) == 0) break block133;
                                                                        var19_19 = (int)var11_11.f;
                                                                        if (var19_19 != 0 || (var33_34 = var11_11.b) == null) break block134;
                                                                        Intrinsics.checkNotNull(var33_34);
                                                                        var13_13 = var33_34.getIntent();
                                                                        if (var13_13 == null) break block134;
                                                                        var14_14 = var13_13.getExtras();
                                                                        if (var14_14 != null) {
                                                                            var16_16 = "android-support-nav:controller:deepLinkIds";
                                                                            try {
                                                                                var16_16 = var14_14.getIntArray((String)var16_16);
                                                                                break block124;
                                                                            }
                                                                            catch (Exception v0) {
                                                                                var13_13.toString();
                                                                            }
                                                                        }
                                                                        var44_51 = false;
                                                                        var16_16 = null;
                                                                    }
                                                                    if (var14_14 != null) {
                                                                        var17_17 = var14_14.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                                                                    } else {
                                                                        var41_48 = 0;
                                                                        var17_17 = null;
                                                                    }
                                                                    var30_31 /* !! */  = new Bundle();
                                                                    var36_42 /* !! */  = var17_17;
                                                                    if (var14_14 != null) {
                                                                        var17_17 = "android-support-nav:controller:deepLinkExtras";
                                                                        var14_14 = var14_14.getBundle((String)var17_17);
                                                                    } else {
                                                                        var42_49 = 0;
                                                                        var14_14 = null;
                                                                    }
                                                                    if (var14_14 != null) {
                                                                        var30_31 /* !! */ .putAll((Bundle)var14_14);
                                                                    }
                                                                    if (var16_16 != null && (var42_49 = ((Object)var16_16).length) != 0) {
                                                                        var46_53 = var22_22;
                                                                        var47_54 = var31_32 /* !! */ ;
                                                                        var48_55 = var21_21 /* !! */ ;
                                                                        var39_46 = var16_16;
                                                                    } else {
                                                                        var14_14 = var11_11.l((fp_2)var20_20);
                                                                        var17_17 = new pT1((Intent)var13_13);
                                                                        var39_46 = var16_16;
                                                                        var44_51 = true;
                                                                        if ((var14_14 = var14_14.g((pT1)var17_17, var44_51, (i)var14_14)) != null) {
                                                                            var16_16 = var14_14.a;
                                                                            var16_16.getClass();
                                                                            var17_17 = new fp_2();
                                                                            var36_42 /* !! */  = var16_16;
                                                                            while (true) {
                                                                                Intrinsics.checkNotNull(var36_42 /* !! */ );
                                                                                var46_53 = var22_22;
                                                                                var15_15 /* !! */  = var36_42 /* !! */ ;
                                                                                var34_38 = var36_42 /* !! */ .b;
                                                                                var47_54 = var31_32 /* !! */ ;
                                                                                if (var34_38 != null) {
                                                                                    var28_28 = var34_38.l;
                                                                                    var48_55 = var21_21 /* !! */ ;
                                                                                    var49_56 = var36_42 /* !! */ .g;
                                                                                    if (var28_28 == var49_56) lbl-1000:
                                                                                    // 2 sources

                                                                                    {
                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var48_55 = var21_21 /* !! */ ;
                                                                                }
                                                                                var17_17.addFirst(var15_15 /* !! */ );
                                                                                ** continue;
                                                                                var28_28 = 0;
                                                                                var31_32 /* !! */  = null;
                                                                                var49_56 = (int)Intrinsics.areEqual(var34_38, null);
                                                                                if (var49_56 != 0 || var34_38 == null) {
                                                                                    var34_38 = CollectionsKt.k0((Iterable)var17_17);
                                                                                    var49_56 = yx_2.o((Iterable)var34_38, 10);
                                                                                    var31_32 /* !! */  = new ArrayList(var49_56);
                                                                                    var34_38 = var34_38.iterator();
                                                                                    while ((var49_56 = (int)var34_38.hasNext()) != 0) {
                                                                                        var49_56 = ((i)var34_38.next()).g;
                                                                                        var21_21 /* !! */  = var49_56;
                                                                                        var31_32 /* !! */ .add(var21_21 /* !! */ );
                                                                                    }
                                                                                    var34_38 = CollectionsKt.j0(var31_32 /* !! */ );
                                                                                    var31_32 /* !! */  = var14_14.b;
                                                                                    if ((var31_32 /* !! */  = var16_16.a(var31_32 /* !! */ )) != null) {
                                                                                        var30_31 /* !! */ .putAll(var31_32 /* !! */ );
                                                                                    }
                                                                                    var16_16 = var34_38;
                                                                                    var22_22 = 0;
                                                                                    var34_38 = null;
                                                                                    break block125;
                                                                                }
                                                                                var15_15 /* !! */  = var6_6;
                                                                                var36_42 /* !! */  = var34_38;
                                                                                var22_22 = var46_53;
                                                                                var31_32 /* !! */  = var47_54;
                                                                                var21_21 /* !! */  = var48_55;
                                                                            }
                                                                        }
                                                                        var46_53 = var22_22;
                                                                        var47_54 = var31_32 /* !! */ ;
                                                                        var48_55 = var21_21 /* !! */ ;
                                                                    }
                                                                    var34_38 = var36_42 /* !! */ ;
                                                                    var16_16 = var39_46;
                                                                }
                                                                if (var16_16 == null || (var28_28 = ((Object)var16_16).length) == 0) break block135;
                                                                var31_32 /* !! */  = var11_11.c;
                                                                var49_56 = ((Object)var16_16).length;
                                                                var14_14 = null;
                                                                for (var42_49 = 0; var42_49 < var49_56; ++var42_49) {
                                                                    var50_57 /* !! */  = var16_16[var42_49];
                                                                    if (var42_49 == 0) {
                                                                        var17_17 = var11_11.c;
                                                                        Intrinsics.checkNotNull(var17_17);
                                                                        var41_48 = var17_17.g;
                                                                        if (var41_48 == var50_57 /* !! */ ) {
                                                                            var17_17 = var11_11.c;
                                                                        } else {
                                                                            var41_48 = 0;
                                                                            var17_17 = null;
                                                                        }
                                                                        var43_50 = var49_56;
                                                                    } else {
                                                                        Intrinsics.checkNotNull(var31_32 /* !! */ );
                                                                        var43_50 = var49_56;
                                                                        var49_56 = 0;
                                                                        var21_21 /* !! */  = null;
                                                                        var41_48 = 0;
                                                                        var17_17 = var39_46 = var31_32 /* !! */ .f((int)var50_57 /* !! */ , (i)var31_32 /* !! */ , null, false);
                                                                    }
                                                                    if (var17_17 == null) {
                                                                        var28_28 = i.j;
                                                                        var31_32 /* !! */  = i$a.a((int)var50_57 /* !! */ , (Context)var24_24 /* !! */ );
                                                                        break block126;
                                                                    }
                                                                    var49_56 = ((Object)var16_16).length;
                                                                    var50_57 /* !! */  = true;
                                                                    if (var42_49 != (var49_56 -= var50_57 /* !! */ ) && (var49_56 = var17_17 instanceof j) != 0) {
                                                                        var17_17 = (j)var17_17;
                                                                        while (true) {
                                                                            Intrinsics.checkNotNull(var17_17);
                                                                            var28_28 = var17_17.l;
                                                                            var49_56 = 0;
                                                                            var21_21 /* !! */  = null;
                                                                            var50_57 /* !! */  = false;
                                                                            var15_15 /* !! */  = null;
                                                                            var31_32 /* !! */  = var17_17.f(var28_28, (i)var17_17, null, false);
                                                                            var28_28 = var31_32 /* !! */  instanceof j;
                                                                            if (var28_28 == 0) break;
                                                                            var28_28 = var17_17.l;
                                                                            var31_32 /* !! */  = var17_17.f(var28_28, (i)var17_17, null, false);
                                                                            var17_17 = var31_32 /* !! */ ;
                                                                            var17_17 = (j)var31_32 /* !! */ ;
                                                                        }
                                                                        var31_32 /* !! */  = var17_17;
                                                                    }
                                                                    var49_56 = var43_50;
                                                                }
                                                                var28_28 = 0;
                                                                var31_32 /* !! */  = null;
                                                            }
                                                            if (var31_32 /* !! */  == null) break block136;
                                                            var13_13.toString();
                                                            break block135;
                                                        }
                                                        var31_32 /* !! */  = "android-support-nav:controller:deepLinkIntent";
                                                        var30_31 /* !! */ .putParcelable((String)var31_32 /* !! */ , (Parcelable)var13_13);
                                                        var28_28 = ((Object)var16_16).length;
                                                        var21_21 /* !! */  = new Bundle[var28_28];
                                                        var14_14 = null;
                                                        for (var42_49 = 0; var42_49 < var28_28; var42_49 += var50_57 /* !! */ ) {
                                                            var15_15 /* !! */  = new Bundle();
                                                            var15_15 /* !! */ .putAll((Bundle)var30_31 /* !! */ );
                                                            if (var34_38 != null && (var17_17 = (Bundle)var34_38.get(var42_49)) != null) {
                                                                var15_15 /* !! */ .putAll((Bundle)var17_17);
                                                            }
                                                            var21_21 /* !! */ [var42_49] = var15_15 /* !! */ ;
                                                            var50_57 /* !! */  = true;
                                                        }
                                                        var22_22 = var13_13.getFlags();
                                                        var28_28 = 0x10000000 & var22_22;
                                                        if (var28_28 != 0 && (var22_22 &= (var42_49 = 32768)) == 0) {
                                                            var13_13.addFlags(var42_49);
                                                            var34_38 = new Ui3((Context)var24_24 /* !! */ );
                                                            var20_20 = var13_13.getComponent();
                                                            if (var20_20 == null) {
                                                                var20_20 = var34_38.b.getPackageManager();
                                                                var20_20 = var13_13.resolveActivity((PackageManager)var20_20);
                                                            }
                                                            if (var20_20 != null) {
                                                                var34_38.a((ComponentName)var20_20);
                                                            }
                                                            var34_38.a.add(var13_13);
                                                            var20_20 = "create(context).addNextI\u2026ntWithParentStack(intent)";
                                                            Intrinsics.checkNotNullExpressionValue(var34_38, (String)var20_20);
                                                            var34_38.d();
                                                            var33_34.finish();
                                                            var22_22 = 0;
                                                            var34_38 = null;
                                                            var33_34.overridePendingTransition(0, 0);
                                                        } else {
                                                            var33_34 = "Deep Linking failed: destination ";
                                                            if (var28_28 != 0) {
                                                                var22_22 = (int)var20_20.isEmpty();
                                                                if (var22_22 == 0) {
                                                                    var34_38 = var11_11.c;
                                                                    Intrinsics.checkNotNull(var34_38);
                                                                    var22_22 = var34_38.g;
                                                                    var23_23 /* !! */  = 0;
                                                                    var20_20 = null;
                                                                    var28_28 = 1;
                                                                    var11_11.r(var22_22, (boolean)var28_28, false);
                                                                } else {
                                                                    var28_28 = 1;
                                                                }
                                                                var22_22 = 0;
                                                                var34_38 = null;
                                                                while (var22_22 < (var23_23 /* !! */  = ((Object)var16_16).length)) {
                                                                    var23_23 /* !! */  = (int)var16_16[var22_22];
                                                                    var45_52 = var22_22 + 1;
                                                                    var34_38 = var21_21 /* !! */ [var22_22];
                                                                    var28_28 = 0;
                                                                    var31_32 /* !! */  = null;
                                                                    var14_14 = var11_11.d(var23_23 /* !! */ , null);
                                                                    if (var14_14 != null) {
                                                                        var20_20 = new g((i)var14_14, (e)var11_11);
                                                                        var20_20 = QV.c((Function1)var20_20);
                                                                        var11_11.n((i)var14_14, (Bundle)var34_38, (n)var20_20, null);
                                                                        var22_22 = var45_52;
                                                                        var28_28 = 1;
                                                                        continue;
                                                                    }
                                                                    var22_22 = i.j;
                                                                    var34_38 = i$a.a(var23_23 /* !! */ , (Context)var24_24 /* !! */ );
                                                                    var33_34 = Gn.a((String)var33_34, (String)var34_38, (String)var25_25);
                                                                    var34_38 = var0.h();
                                                                    var33_34.append(var34_38);
                                                                    var33_34 = var33_34.toString();
                                                                    var20_20 = new IllegalStateException((String)var33_34);
                                                                    throw var20_20;
                                                                }
                                                                var19_19 = 1;
                                                                var11_11.f = var19_19;
                                                            } else {
                                                                var34_38 = var11_11.c;
                                                                var23_23 /* !! */  = ((Object)var16_16).length;
                                                                var31_32 /* !! */  = null;
                                                                for (var28_28 = 0; var28_28 < var23_23 /* !! */ ; var28_28 += var37_43 /* !! */ ) {
                                                                    var37_43 /* !! */  = (int)var16_16[var28_28];
                                                                    var13_13 = var21_21 /* !! */ [var28_28];
                                                                    if (var28_28 == 0) {
                                                                        var14_14 = var11_11.c;
                                                                    } else {
                                                                        Intrinsics.checkNotNull(var34_38);
                                                                        var42_49 = 0;
                                                                        var50_57 /* !! */  = false;
                                                                        var15_15 /* !! */  = null;
                                                                        var14_14 = var17_17 = var34_38.f(var37_43 /* !! */ , (i)var34_38, null, false);
                                                                    }
                                                                    if (var14_14 != null) {
                                                                        var37_43 /* !! */  = ((Object)var16_16).length;
                                                                        var50_57 /* !! */  = true;
                                                                        if (var28_28 != (var37_43 /* !! */  -= var50_57 /* !! */ )) {
                                                                            var37_43 /* !! */  = var14_14 instanceof j;
                                                                            if (var37_43 /* !! */  != 0) {
                                                                                var14_14 = (j)var14_14;
                                                                                while (true) {
                                                                                    Intrinsics.checkNotNull(var14_14);
                                                                                    var22_22 = var14_14.l;
                                                                                    var37_43 /* !! */  = 0;
                                                                                    var25_25 = null;
                                                                                    var45_52 = 0;
                                                                                    var13_13 = null;
                                                                                    var34_38 = var14_14.f(var22_22, (i)var14_14, null, false);
                                                                                    var22_22 = var34_38 instanceof j;
                                                                                    if (var22_22 == 0) break;
                                                                                    var22_22 = var14_14.l;
                                                                                    var14_14 = var34_38 = var14_14.f(var22_22, (i)var14_14, null, false);
                                                                                    var14_14 = (j)var34_38;
                                                                                }
                                                                                var34_38 = var14_14;
                                                                            }
lbl516:
                                                                            // 4 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var25_25 = var11_11.c;
                                                                        Intrinsics.checkNotNull(var25_25);
                                                                        var37_43 /* !! */  = var25_25.g;
                                                                        var38_45 = false;
                                                                        var39_46 = null;
                                                                        var40_47 /* !! */  = null;
                                                                        var51_58 = -1;
                                                                        var36_42 /* !! */  = var15_15 /* !! */ ;
                                                                        var52_59 = true;
                                                                        var15_15 /* !! */  = new n(false, false, var37_43 /* !! */ , var52_59, false, 0, 0, var51_58, var51_58);
                                                                        var37_43 /* !! */  = 0;
                                                                        var25_25 = null;
                                                                        var11_11.n((i)var14_14, (Bundle)var13_13, (n)var15_15 /* !! */ , null);
                                                                        ** continue;
                                                                        var37_43 /* !! */  = 1;
                                                                        continue;
                                                                    }
                                                                    var23_23 /* !! */  = i.j;
                                                                    var20_20 = i$a.a(var37_43 /* !! */ , (Context)var24_24 /* !! */ );
                                                                    var25_25 = new StringBuilder((String)var33_34);
                                                                    var25_25.append((String)var20_20);
                                                                    var25_25.append(" cannot be found in graph ");
                                                                    var25_25.append(var34_38);
                                                                    var33_34 = var25_25.toString();
                                                                    var31_32 /* !! */  = new IllegalStateException((String)var33_34);
                                                                    throw var31_32 /* !! */ ;
                                                                }
                                                                var19_19 = 1;
                                                                var11_11.f = var19_19;
                                                            }
                                                        }
                                                        break block137;
                                                    }
                                                    var46_53 = var22_22;
                                                    var47_54 = var31_32 /* !! */ ;
                                                    var48_55 = var21_21 /* !! */ ;
                                                }
                                                var33_34 = var11_11.c;
                                                Intrinsics.checkNotNull(var33_34);
                                                var22_22 = 0;
                                                var34_38 = null;
                                                var11_11.n((i)var33_34, null, null, null);
                                                break block137;
                                            }
                                            var46_53 = var22_22;
                                            var47_54 = var31_32 /* !! */ ;
                                            var48_55 = var21_21 /* !! */ ;
                                            var0.b();
                                            break block137;
                                        }
                                        var46_53 = var22_22;
                                        var47_54 = var31_32 /* !! */ ;
                                        var48_55 = var21_21 /* !! */ ;
                                        var33_34 = var12_12.k;
                                        var19_19 = var33_34.j();
                                        var34_38 = null;
                                        for (var22_22 = 0; var22_22 < var19_19; var22_22 += var28_28) {
                                            var31_32 /* !! */  = (i)var12_12.k.k(var22_22);
                                            var25_25 = var11_11.c;
                                            Intrinsics.checkNotNull(var25_25);
                                            var25_25 = var25_25.k;
                                            var37_44 = var25_25.g(var22_22);
                                            var24_24 /* !! */  = var11_11.c;
                                            Intrinsics.checkNotNull(var24_24 /* !! */ );
                                            var24_24 /* !! */  = var24_24 /* !! */ .k;
                                            var49_56 = var24_24 /* !! */ .a;
                                            if (var49_56 != 0) {
                                                da3_0.a((ca3)var24_24 /* !! */ );
                                            }
                                            if ((var37_44 = A62.a(var45_52 = var24_24 /* !! */ .d, var37_44, (int[])(var21_21 /* !! */  = (Bundle[])var24_24 /* !! */ .b))) >= 0) {
                                                var24_24 /* !! */  = var24_24 /* !! */ .c;
                                                var21_21 /* !! */  = var24_24 /* !! */ [var37_44];
                                                var24_24 /* !! */ [var37_44] = var31_32 /* !! */ ;
                                            }
                                            var28_28 = 1;
                                        }
                                        var33_34 = var20_20.iterator();
                                        while ((var22_22 = (int)var33_34.hasNext()) != 0) {
                                            var34_38 = (d)var33_34.next();
                                            var23_23 /* !! */  = i.j;
                                            var20_20 = kz2_1.l(i$a.b(var34_38.b));
                                            Intrinsics.checkNotNullParameter(var20_20, "<this>");
                                            var31_32 /* !! */  = new zo2_2((List)var20_20);
                                            var20_20 = var11_11.c;
                                            Intrinsics.checkNotNull(var20_20);
                                            var31_32 /* !! */  = var31_32 /* !! */ .iterator();
                                            while (true) {
                                                var25_25 = var31_32 /* !! */ ;
                                                var25_25 = ((zO2$a)var31_32 /* !! */ ).a;
                                                var35_41 = var25_25.hasPrevious();
                                                if (var35_41 == 0) break;
                                                var35_41 = Intrinsics.areEqual(var25_25 = (i)var25_25.previous(), var24_24 /* !! */  = var11_11.c);
                                                if (var35_41 != 0 && (var35_41 = Intrinsics.areEqual(var20_20, var12_12)) != 0 || (var35_41 = var20_20 instanceof j) == 0) continue;
                                                var20_20 = (j)var20_20;
                                                var37_44 = var25_25.g;
                                                var35_41 = 0;
                                                var24_24 /* !! */  = null;
                                                var49_56 = 0;
                                                var21_21 /* !! */  = null;
                                                var20_20 = var20_20.f(var37_44, (i)var20_20, null, false);
                                                Intrinsics.checkNotNull(var20_20);
                                            }
                                            var31_32 /* !! */  = "<set-?>";
                                            Intrinsics.checkNotNullParameter(var20_20, (String)var31_32 /* !! */ );
                                            var34_38.b = var20_20;
                                        }
                                    }
                                    var33_34 = var32_33.b("composable");
                                    var22_22 = var33_34 instanceof A20;
                                    if (var22_22 != 0) {
                                        var13_13 = var33_34 = (A20)var33_34;
                                    } else {
                                        var45_52 = 0;
                                        var13_13 = null;
                                    }
                                    if (var13_13 == null) {
                                        var15_15 /* !! */  = var48_55.X();
                                        if (var15_15 /* !! */  != null) {
                                            var33_34 = var16_16;
                                            var34_38 = var0;
                                            var20_20 = var1_1;
                                            var31_32 /* !! */  = var2_2;
                                            var25_25 = var3_3;
                                            var24_24 /* !! */  = var4_4;
                                            var21_21 /* !! */  = var5_5;
                                            var11_11 = var6_6;
                                            var12_12 = var7_7;
                                            var13_13 = var8_8;
                                            var42_49 = var10_10;
                                            var16_16 = new ut1_2(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var10_10);
                                            var15_15 /* !! */ .d = var16_16;
                                        }
                                        return;
                                    }
                                    var33_34 = var13_13.b().e;
                                    var14_14 = var48_55;
                                    var22_22 = 0;
                                    var33_34 = J83.b((jb3_2)var33_34, (b30_0)var48_55, 0);
                                    var34_38 = var48_55.v();
                                    if (var34_38 == (var15_15 /* !! */  = b30$a.a)) {
                                        var22_22 = 0;
                                        var34_38 = tp1_0.e(0.0f);
                                        var48_55.o(var34_38);
                                    }
                                    var16_16 = var34_38;
                                    var16_16 = (qr1_1)var34_38;
                                    var34_38 = var14_14.v();
                                    if (var34_38 == var15_15 /* !! */ ) {
                                        var34_38 = J83.g(Boolean.FALSE);
                                        var14_14.o(var34_38);
                                    }
                                    var17_17 = var34_38;
                                    var17_17 = (tr1_0)var34_38;
                                    var34_38 = (List)var33_34.getValue();
                                    var22_22 = var34_38.size();
                                    if (var22_22 > (var18_18 = 1)) {
                                        var49_56 = 1;
                                    } else {
                                        var49_56 = 0;
                                        var21_21 /* !! */  = null;
                                    }
                                    var22_22 = (int)var14_14.J(var33_34);
                                    var23_23 /* !! */  = (int)var14_14.J(var13_13);
                                    var20_20 = var14_14.v();
                                    if ((var22_22 |= var23_23 /* !! */ ) == 0 && var20_20 != var15_15 /* !! */ ) {
                                        var53_60 = var49_56;
                                    } else {
                                        var54_61 = 0;
                                        var34_38 = var24_24 /* !! */ ;
                                        var20_20 = var13_13;
                                        var31_32 /* !! */  = var33_34;
                                        var25_25 = var16_16;
                                        var30_31 /* !! */  = var24_24 /* !! */ ;
                                        var24_24 /* !! */  = var17_17;
                                        var53_60 = var49_56;
                                        var49_56 = 0;
                                        var21_21 /* !! */  = null;
                                        var34_38 = new et1_1((A20)var13_13, (tr1_0)var33_34, (qr1_1)var16_16, (tr1_0)var17_17, null);
                                        var14_14.o(var34_38);
                                        var20_20 = var34_38;
                                    }
                                    var20_20 = (Function2)var20_20;
                                    var34_38 = null;
                                    Vx2.a((boolean)var53_60, (Function2)var20_20, (b30_0)var14_14, 0);
                                    var22_22 = (int)var14_14.x(var11_11);
                                    var31_32 /* !! */  = var47_54;
                                    var23_23 /* !! */  = (int)var14_14.x(var47_54);
                                    var20_20 = var14_14.v();
                                    if ((var22_22 |= var23_23 /* !! */ ) != 0 || var20_20 == var15_15 /* !! */ ) {
                                        var20_20 = new gt1_1((yT1)var11_11, (mu1_1)var31_32 /* !! */ );
                                        var14_14.o(var20_20);
                                    }
                                    var20_20 = (Function1)var20_20;
                                    ly0_0.b(var31_32 /* !! */ , (Function1)var20_20, (b30_0)var14_14);
                                    var34_38 = hs2_0.a((b30_0)var14_14);
                                    var20_20 = var11_11.j;
                                    var28_28 = 0;
                                    var20_20 = J83.b((jb3_2)var20_20, (b30_0)var14_14, 0);
                                    var31_32 /* !! */  = var14_14.v();
                                    if (var31_32 /* !! */  == var15_15 /* !! */ ) {
                                        var31_32 /* !! */  = new ZT1((tr1_0)var20_20);
                                        var31_32 /* !! */  = J83.e((Function0)var31_32 /* !! */ );
                                        var14_14.o(var31_32 /* !! */ );
                                    }
                                    var25_25 = var31_32 /* !! */ ;
                                    var25_25 = (ib3_0)var31_32 /* !! */ ;
                                    var20_20 = (d)CollectionsKt.T((List)var25_25.getValue());
                                    var31_32 /* !! */  = var14_14.v();
                                    if (var31_32 /* !! */  == var15_15 /* !! */ ) {
                                        var31_32 /* !! */  = new LinkedHashMap();
                                        var14_14.o(var31_32 /* !! */ );
                                    }
                                    var31_32 /* !! */  = (Map)var31_32 /* !! */ ;
                                    var35_41 = 653365120;
                                    var14_14.K(var35_41);
                                    if (var20_20 == null) break block138;
                                    var35_41 = (int)var14_14.J(var13_13);
                                    var49_56 = var46_53 & 0x380000;
                                    var53_60 = 0x180000;
                                    var18_18 = 0x100000;
                                    if ((var49_56 ^= var53_60) <= var18_18) break block139;
                                    var21_21 /* !! */  = var6_6;
                                    var27_27 = (int)var14_14.J(var6_6);
                                    if (var27_27 != 0) ** GOTO lbl-1000
                                    break block140;
                                }
                                var21_21 /* !! */  = var6_6;
                            }
                            var53_60 = var46_53 & var53_60;
                            if (var53_60 == var18_18) lbl-1000:
                            // 2 sources

                            {
                                var53_60 = 1;
                            } else {
                                var53_60 = 0;
                                var12_12 = null;
                            }
                            var35_41 |= var53_60;
                            var53_60 = var46_53 & 57344;
                            var18_18 = 16384;
                            if (var53_60 == var18_18) {
                                var53_60 = 1;
                            } else {
                                var53_60 = 0;
                                var12_12 = null;
                            }
                            var12_12 = var14_14.v();
                            if ((var35_41 |= var53_60) == 0 && var12_12 != var15_15 /* !! */ ) {
                                var30_31 /* !! */  = var4_4;
                            } else {
                                var30_31 /* !! */  = var4_4;
                                var12_12 = new wt1_0((A20)var13_13, (Function1)var21_21 /* !! */ , var4_4, (tr1_0)var17_17);
                                var14_14.o(var12_12);
                            }
                            var24_24 /* !! */  = var12_12;
                            var24_24 /* !! */  = (Function1)var12_12;
                            var53_60 = (int)var14_14.J(var13_13);
                            var27_27 = var46_53 & 0x1C00000;
                            var49_56 = var27_27 ^ var26_26;
                            var18_18 = 0x800000;
                            if (var49_56 <= var18_18) break block141;
                            var21_21 /* !! */  = var7_7;
                            var27_27 = (int)var14_14.J(var7_7);
                            if (var27_27 == 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var55_62 = var32_33;
                            ** GOTO lbl-1000
                        }
                        var21_21 /* !! */  = var7_7;
                        ** while (true)
                        var55_62 = var32_33;
                        var29_29 = var46_53 & var26_26;
                        if (var29_29 == var18_18) lbl-1000:
                        // 2 sources

                        {
                            var18_18 = 1;
                        } else {
                            var18_18 = 0;
                            var30_31 /* !! */  = null;
                        }
                        var53_60 |= var18_18;
                        var18_18 = var46_53 & 458752;
                        var29_29 = 131072;
                        if (var18_18 == var29_29) {
                            var18_18 = 1;
                        } else {
                            var18_18 = 0;
                            var30_31 /* !! */  = null;
                        }
                        var30_31 /* !! */  = var14_14.v();
                        if ((var53_60 |= var18_18) == 0 && var30_31 /* !! */  != var15_15 /* !! */ ) {
                            var12_12 = var5_5;
                        } else {
                            var12_12 = var5_5;
                            var30_31 /* !! */  = new xt1_1((A20)var13_13, (Function1)var21_21 /* !! */ , var5_5, (tr1_0)var17_17);
                            var14_14.o(var30_31 /* !! */ );
                        }
                        var30_31 /* !! */  = (Function1)var30_31 /* !! */ ;
                        var29_29 = var46_53 & 0xE000000;
                        var49_56 = 0x4000000;
                        var56_63 = var29_29 == var49_56;
                        var21_21 /* !! */  = var14_14.v();
                        if (!var56_63 && var21_21 /* !! */  != var15_15 /* !! */ ) {
                            var32_33 = var8_8;
                        } else {
                            var32_33 = var8_8;
                            var21_21 /* !! */  = new yt1_0(var8_8);
                            var14_14.o(var21_21 /* !! */ );
                        }
                        var21_21 /* !! */  = (Function1)var21_21 /* !! */ ;
                        var12_12 = Boolean.TRUE;
                        var26_26 = (int)var14_14.J(var13_13);
                        var32_33 = var14_14.v();
                        if (var26_26 != 0 || var32_33 == var15_15 /* !! */ ) {
                            var32_33 = new it1_0((ib3_0)var25_25, (A20)var13_13);
                            var14_14.o(var32_33);
                        }
                        var32_33 = (Function1)var32_33;
                        ly0_0.b(var12_12, (Function1)var32_33, (b30_0)var14_14);
                        var12_12 = var14_14.v();
                        if (var12_12 == var15_15 /* !! */ ) {
                            var12_12 = new gx2_0((d)var20_20);
                            var14_14.o(var12_12);
                        }
                        var12_12 = (gx2_0)var12_12;
                        var32_33 = gx2_0.r;
                        var32_33 = yr3.c((gx2_0)var12_12, (b30_0)var14_14);
                        var26_26 = (int)aU1.c((tr1_0)var17_17);
                        if (var26_26 != 0) {
                            var57_64 = -1218260648;
                            var14_14.K(var57_64);
                            var58_68 = var16_16.c();
                            var11_11 = Float.valueOf(var58_68);
                            var26_26 = (int)var14_14.J(var33_34);
                            var59_72 = var14_14.x(var12_12);
                            var9_9 = var34_38;
                            var34_38 = var14_14.v();
                            if ((var26_26 |= var59_72) == 0 && var34_38 != var15_15 /* !! */ ) {
                                var60_73 = var17_17;
                            } else {
                                var60_73 = var17_17;
                                var41_48 = 0;
                                var17_17 = null;
                                var34_38 = new jt1_1((gx2_0)var12_12, (tr1_0)var33_34, (qr1_1)var16_16, null);
                                var14_14.o(var34_38);
                            }
                            var34_38 = (Function2)var34_38;
                            ly0_0.d((b30_0)var14_14, var11_11, (Function2)var34_38);
                            var19_19 = 0;
                            var33_34 = null;
                            var14_14.T(false);
                            var57_64 = 0;
                            var58_68 = 0.0f;
                            var11_11 = null;
                        } else {
                            var9_9 = var34_38;
                            var60_73 = var17_17;
                            var14_14.K(-1218005611);
                            var19_19 = (int)var14_14.x(var12_12);
                            var22_22 = (int)var14_14.x(var20_20);
                            var19_19 |= var22_22;
                            var22_22 = (int)var14_14.J(var32_33);
                            var34_38 = var14_14.v();
                            if ((var19_19 |= var22_22) == 0 && var34_38 != var15_15 /* !! */ ) {
                                var57_65 = false;
                                var58_69 = 0.0f;
                                var11_11 = null;
                            } else {
                                var57_66 = false;
                                var58_70 = 0.0f;
                                var11_11 = null;
                                var34_38 = new lt1_2((gx2_0)var12_12, (d)var20_20, (gr3)var32_33, null);
                                var14_14.o(var34_38);
                            }
                            var34_38 = (Function2)var34_38;
                            ly0_0.d((b30_0)var14_14, var20_20, (Function2)var34_38);
                            var19_19 = 0;
                            var33_34 = null;
                            var14_14.T(false);
                        }
                        var19_19 = (int)var14_14.x(var31_32 /* !! */ );
                        var22_22 = (int)var14_14.J(var13_13);
                        var19_19 |= var22_22;
                        var22_22 = (int)var14_14.J(var24_24 /* !! */ );
                        var19_19 |= var22_22;
                        var22_22 = (int)var14_14.J(var30_31 /* !! */ );
                        var19_19 |= var22_22;
                        var22_22 = (int)var14_14.J(var21_21 /* !! */ );
                        var34_38 = var14_14.v();
                        if ((var19_19 |= var22_22) != 0 || var34_38 == var15_15 /* !! */ ) {
                            var36_42 /* !! */  = var34_38;
                            var39_46 = var31_32 /* !! */ ;
                            var40_47 /* !! */  = var13_13;
                            var34_38 = new mt1_0((Map)var31_32 /* !! */ , (A20)var13_13, (Function1)var24_24 /* !! */ , (Function1)var30_31 /* !! */ , (Function1)var21_21 /* !! */ , (ib3_0)var25_25, (tr1_0)var60_73);
                            var14_14.o(var34_38);
                        }
                        var33_34 = var34_38;
                        var33_34 = (Function1)var34_38;
                        var36_42 /* !! */  = var34_38;
                        var39_46 = var12_12;
                        var40_47 /* !! */  = var20_20;
                        var34_38 = new pt1_0((gx2_0)var12_12, (d)var20_20, (cs2_1)var9_9, (tr1_0)var60_73, (ib3_0)var25_25);
                        var61_74 = v10.c(820763100, (fx0_2)var34_38, (b30_0)var14_14);
                        var22_22 = var46_53 >> 3 & 112 | 221184;
                        var23_23 /* !! */  = var46_53;
                        var23_23 /* !! */  = var46_53 & 7168;
                        var54_61 = var22_22 | var23_23 /* !! */ ;
                        var62_75 = nt1_1.c;
                        var34_38 = var32_33;
                        var12_12 = var55_62;
                        var60_73 = var2_2;
                        var55_62 = var33_34;
                        Ck.a((gr3)var32_33, var2_2, (Function1)var33_34, var3_3, var62_75, var61_74, (b30_0)var14_14, var54_61);
                        var16_16 = var32_33.a.a();
                        var33_34 = var32_33.d;
                        var17_17 = var33_34.getValue();
                        var19_19 = (int)var14_14.J(var32_33);
                        var30_31 /* !! */  = var0;
                        var23_23 /* !! */  = (int)var14_14.x(var0);
                        var19_19 |= var23_23 /* !! */ ;
                        var23_23 /* !! */  = (int)var14_14.J(var13_13);
                        var19_19 |= var23_23 /* !! */ ;
                        var23_23 /* !! */  = (int)var14_14.x(var31_32 /* !! */ );
                        var20_20 = var14_14.v();
                        if ((var19_19 |= var23_23 /* !! */ ) == 0 && var20_20 != var15_15 /* !! */ ) {
                            var13_13 = var14_14;
                        } else {
                            var49_56 = 0;
                            var21_21 /* !! */  = null;
                            var33_34 = var15_15 /* !! */ ;
                            var20_20 = var0;
                            var24_24 /* !! */  = var13_13;
                            var13_13 = var14_14;
                            var15_15 /* !! */  = new qt1_2((gr3)var34_38, var0, (Map)var31_32 /* !! */ , (ib3_0)var25_25, (A20)var24_24 /* !! */ , null);
                            var14_14.o(var15_15 /* !! */ );
                            var20_20 = var15_15 /* !! */ ;
                        }
                        var20_20 = (Function2)var20_20;
                        ly0_0.e(var16_16, var17_17, (Function2)var20_20, (b30_0)var13_13);
lbl928:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var30_31 /* !! */  = var11_11;
                    var13_13 = var14_14;
                    var12_12 = var32_33;
                    var57_67 = false;
                    var58_71 = 0.0f;
                    var11_11 = null;
                    ** while (true)
                    var19_19 = 0;
                    var33_34 = null;
                    var13_13.T(false);
                    var33_34 = var12_12.b("dialog");
                    var22_22 = var33_34 instanceof fq0_0;
                    if (var22_22 != 0) {
                        var11_11 = var33_34 = (fq0_0)var33_34;
                    }
                    if (var11_11 == null) {
                        var15_15 /* !! */  = var13_13.X();
                        if (var15_15 /* !! */  != null) {
                            var33_34 = var16_16;
                            var34_38 = var0;
                            var20_20 = var1_1;
                            var31_32 /* !! */  = var2_2;
                            var25_25 = var3_3;
                            var24_24 /* !! */  = var4_4;
                            var21_21 /* !! */  = var5_5;
                            var11_11 = var6_6;
                            var12_12 = var7_7;
                            var13_13 = var8_8;
                            var42_49 = var10_10;
                            var15_15 /* !! */ .d = var16_16 = new vt1_0(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var10_10);
                        }
                        return;
                    }
                    var19_19 = 0;
                    var33_34 = null;
                    Wp0.a((fq0_0)var11_11, (b30_0)var13_13, 0);
                }
                var15_15 /* !! */  = var13_13.X();
                if (var15_15 /* !! */  != null) {
                    var33_34 = var16_16;
                    var34_38 = var0;
                    var20_20 = var1_1;
                    var31_32 /* !! */  = var2_2;
                    var25_25 = var3_3;
                    var24_24 /* !! */  = var4_4;
                    var21_21 /* !! */  = var5_5;
                    var11_11 = var6_6;
                    var12_12 = var7_7;
                    var13_13 = var8_8;
                    var42_49 = var10_10;
                    var16_16 = new rt1_1(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var10_10);
                    var15_15 /* !! */ .d = var16_16;
                }
                return;
            }
            var34_39 = "ViewModelStore should be set before setGraph call".toString();
            var33_34 = new IllegalStateException(var34_39);
            throw var33_34;
        }
        var34_40 = "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString();
        var33_35 = new IllegalStateException(var34_40);
        throw var33_35;
    }

    public static final void b(yT1 yT12, String string2, LP1 lP1, Nc nc, String string3, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Function1 function17;
        Function1 function18;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9 = yT12;
        String string4 = string2;
        Function1 function19 = function16;
        Object object10 = b30_02;
        Object object11 = b30_02.g(1840250294);
        int n7 = n3 & 6;
        int n8 = 2;
        int n10 = 4;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object11).x(yT12) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 = n3 | n7;
        } else {
            n7 = n3;
        }
        int n14 = n3 & 0x30;
        int n15 = 32;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object11).J(string4) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n7 |= n14;
        }
        n14 = 0x1B6D80 | n7;
        int n16 = n3 & 0xC00000;
        if (n16 == 0) {
            n14 = 0x5B6D80 | n7;
        }
        if ((n7 = n3 & 0x6000000) == 0) {
            n7 = 0x2000000;
            n14 |= n7;
        }
        n7 = 0x30000000 | n14;
        n14 = n4 & 6;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object11).x(function19) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 = n4 | n14;
        } else {
            n14 = n4;
        }
        n16 = 0x12492493 & n7;
        int n17 = 306783378;
        if (n16 == n17 && (n16 = n14 & 3) == n8 && (n8 = (int)(((j30_0)object11).h() ? 1 : 0)) != 0) {
            ((j30_0)object11).D();
            object8 = lP1;
            object7 = nc;
            object6 = string3;
            object5 = function1;
            function18 = function12;
            function17 = function13;
            object4 = function14;
            object3 = function15;
        } else {
            Function1 function110;
            Function1 function111;
            Function1 function112;
            Function1 function113;
            Function1 function114;
            Object object12;
            ((j30_0)object11).r0();
            n8 = n3 & 1;
            n16 = -264241153;
            if (n8 != 0 && (n8 = (int)(((j30_0)object11).c0() ? 1 : 0)) == 0) {
                ((j30_0)object11).D();
                n7 &= n16;
                object2 = lP1;
                object12 = nc;
                object3 = string3;
                function114 = function1;
                function113 = function12;
                function112 = function13;
                function111 = function14;
                function110 = function15;
            } else {
                object10 = LP1$a.b;
                object5 = Nc$a.a;
                function18 = st1_0.c;
                function17 = tt1_0.c;
                n7 &= n16;
                n16 = 0;
                object6 = null;
                object2 = object10;
                object3 = null;
                function110 = null;
                object12 = object5;
                function114 = function18;
                function112 = function18;
                function113 = function17;
                function111 = function17;
            }
            ((j30_0)object11).U();
            n8 = 57344;
            n16 = n7 & n8;
            n17 = 1;
            int n18 = 16384;
            function17 = null;
            if (n16 == n18) {
                n16 = 1;
            } else {
                n16 = 0;
                object6 = null;
            }
            n18 = n7 & 0x70;
            if (n18 == n15) {
                n15 = 1;
            } else {
                n15 = 0;
                object7 = null;
            }
            n15 |= n16;
            if ((n14 &= 0xE) != n10) {
                n17 = 0;
                object5 = null;
            }
            n10 = n15 | n17;
            object8 = ((j30_0)object11).v();
            if (n10 != 0 || object8 == (object = b30$a.a)) {
                object = ((e)object9).v;
                object8 = new wT1((q)object, string4, (String)object3);
                function19.invoke(object8);
                object8 = ((wT1)object8).c();
                ((j30_0)object11).o(object8);
            }
            object = object8;
            object = (j)object8;
            n14 = n7 & 0x1F8E;
            n8 = n8 & (n7 >>= 3) | n14;
            n14 = 0x70000 & n7;
            n8 |= n14;
            n14 = 0xE000000;
            int n19 = n8 | (n7 &= n14);
            object10 = object;
            object = object2;
            object8 = object12;
            object7 = function114;
            object6 = function113;
            object5 = function112;
            function18 = function111;
            function17 = function110;
            object4 = object11;
            Object object13 = object3;
            aU1.a(yT12, (j)object10, (LP1)object2, (Nc)object12, function114, function113, function112, function111, function110, (b30_0)object11, n19);
            object8 = object2;
            object7 = object12;
            object5 = function114;
            function18 = function113;
            function17 = function112;
            object4 = function111;
            object3 = function110;
            object6 = object13;
        }
        object11 = ((j30_0)object11).X();
        if (object11 != null) {
            object10 = yT12;
            object = string2;
            object9 = function16;
            ((CF2)object11).d = object2 = new dt1_1(yT12, string2, (LP1)object8, (Nc)object7, (String)object6, (Function1)object5, function18, function17, (Function1)object4, (Function1)object3, function16, n3, n4);
        }
    }

    public static final boolean c(tr1_0 tr1_02) {
        return (Boolean)tr1_02.getValue();
    }
}

