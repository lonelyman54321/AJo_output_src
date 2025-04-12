/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/*
 * Renamed from iD
 */
public final class id_0
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ i90_0 f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Component h;
    public final /* synthetic */ yp0_0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ yT1 m;
    public final /* synthetic */ String n;

    public id_0(p83_0 p83_02, dr0_0 dr0_02, p83_0 p83_03, ft1_2 ft1_22, Activity activity, c80 c802, Ref$ObjectRef ref$ObjectRef, Component component, yp0_0 yp0_02, boolean bl2, String string2, String string3, yT1 yT12, String string4) {
        this.a = p83_02;
        this.b = dr0_02;
        this.c = p83_03;
        this.d = ft1_22;
        this.e = activity;
        this.f = c802;
        this.g = ref$ObjectRef;
        this.h = component;
        this.i = yp0_02;
        this.j = bl2;
        this.k = string2;
        this.l = string3;
        this.m = yT12;
        this.n = string4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block48: {
            block47: {
                block53: {
                    block45: {
                        block59: {
                            block55: {
                                block58: {
                                    block57: {
                                        block56: {
                                            block54: {
                                                block50: {
                                                    block51: {
                                                        block52: {
                                                            block49: {
                                                                block46: {
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
                                                                        if (var13_13 != 0) {
                                                                            var13_13 = 32;
                                                                            var14_14 = 4.5E-44f;
                                                                        } else {
                                                                            var13_13 = 16;
                                                                            var14_14 = 2.2E-44f;
                                                                        }
                                                                        var11_11 |= var13_13;
                                                                    }
                                                                    var13_13 = var11_11 & 721;
                                                                    var11_11 = 144;
                                                                    var15_15 = 2.02E-43f;
                                                                    if (var13_13 != var11_11 || (var13_13 = (int)var9_9.h()) == 0) break block46;
                                                                    var9_9.D();
                                                                    break block47;
                                                                }
                                                                var16_16 = var5_5.a;
                                                                var17_17 = var16_16 != null ? (var10_10 = (Subcomponent)var16_16.get(var8_8)) : null;
                                                                var18_18 = LP1$a.b;
                                                                var10_10 = zp.c;
                                                                var12_12 = Nc$a.m;
                                                                var19_19 = 0;
                                                                var20_20 = null;
                                                                var10_10 = oZ.a((zp$l)var10_10, (Gx$a)var12_12, (b30_0)var9_9, 0);
                                                                var21_21 = var9_9.F();
                                                                var22_22 = var9_9.m();
                                                                var23_23 = a30_0.c((b30_0)var9_9, (LP1)var18_18);
                                                                N20.W.getClass();
                                                                var24_24 = N20$a.b;
                                                                var25_25 = var9_9.i();
                                                                var26_26 = var25_25 instanceof mp;
                                                                if (var26_26 == 0) break block48;
                                                                var9_9.A();
                                                                var26_26 = var9_9.e();
                                                                if (var26_26 != 0) {
                                                                    var9_9.C((Function0)var24_24);
                                                                } else {
                                                                    var9_9.n();
                                                                }
                                                                var24_24 = N20$a.e;
                                                                Ow3.a((b30_0)var9_9, var10_10, (Function2)var24_24);
                                                                var10_10 = N20$a.d;
                                                                Ow3.a((b30_0)var9_9, var22_22, (Function2)var10_10);
                                                                var10_10 = N20$a.f;
                                                                var27_27 = var9_9.e();
                                                                if (var27_27 != 0 || (var27_27 = Intrinsics.areEqual(var22_22 = var9_9.v(), var24_24 = Integer.valueOf(var21_21))) == 0) {
                                                                    re0_0.a(var21_21, (b30_0)var9_9, var21_21, (N20$a$a)var10_10);
                                                                }
                                                                var10_10 = N20$a.c;
                                                                Ow3.a((b30_0)var9_9, var23_23, (Function2)var10_10);
                                                                var11_11 = 1956533711;
                                                                var15_15 = 1.0035685E32f;
                                                                var9_9.K(var11_11);
                                                                if (var8_8 == 0) {
                                                                    var28_28 = uq0_0.o;
                                                                    var29_29 = false;
                                                                    var24_24 = null;
                                                                    var26_26 = 10;
                                                                    var27_27 = 0;
                                                                    var22_22 = null;
                                                                    var10_10 = var18_18;
                                                                    var10_10 = androidx.compose.foundation.layout.h.i((LP1)var18_18, var28_28, 0.0f, var28_28, 0.0f, var26_26);
                                                                    var12_12 = h40_0.a;
                                                                    var12_12 = h40_0.x();
                                                                    if (var12_12 == null || (var12_12 = var12_12.getBrandPageRecentPostsTitle()) == null) {
                                                                        var12_12 = "Recent Posts";
                                                                    }
                                                                    var30_30 = oj3_2.i;
                                                                    var32_31 = nz_1.j;
                                                                    var34_32 = y20_0.b;
                                                                    var35_33 = tv0_0.e;
                                                                    var36_34 = 224646 != 0;
                                                                    var37_35 = 128;
                                                                    var38_36 = true;
                                                                    var39_37 = 0;
                                                                    var40_38 = null;
                                                                    var19_19 = 0;
                                                                    var20_20 = null;
                                                                    var1_1 = var18_18;
                                                                    var18_18 = var9_9;
                                                                    var41_39 = var16_16;
                                                                    var42_40 = var36_34;
                                                                    var2_2 = var9_9;
                                                                    ov3.j((LP1)var10_10, (String)var12_12, var30_30, var32_31, (tv0_0)var35_33, (RU0)var34_32, (int)var38_36, null, (b30_0)var9_9, (int)var36_34, var37_35);
                                                                } else {
                                                                    var1_1 = var18_18;
                                                                    var41_39 = var16_16;
                                                                    var2_2 = var9_9;
                                                                }
                                                                var2_2.E();
                                                                if (var17_17 != null) {
                                                                    var10_10 = var17_17.getPostContentType();
                                                                } else {
                                                                    var11_11 = 0;
                                                                    var15_15 = 0.0f;
                                                                    var10_10 = null;
                                                                }
                                                                var9_9 = var5_5.b;
                                                                if (var10_10 == null) break block49;
                                                                var21_21 = var10_10.hashCode();
                                                                var27_27 = -1840606393;
                                                                var23_23 = "POSTS";
                                                                var24_24 = "BRAND_PAGE";
                                                                var20_20 = var5_5.c;
                                                                var43_41 = var5_5.a;
                                                                var34_32 = var5_5.e;
                                                                var35_33 = var5_5.f;
                                                                var25_25 = var5_5.g;
                                                                var18_18 = var5_5.h;
                                                                var16_16 = var5_5.i;
                                                                var6_6 = var5_5.k;
                                                                var44_42 = var25_25;
                                                                var45_43 = var5_5.l;
                                                                var25_25 = var5_5.m;
                                                                if (var21_21 == var27_27) break block50;
                                                                var27_27 = -205609049;
                                                                if (var21_21 == var27_27) break block51;
                                                                var27_27 = -169708227;
                                                                if (var21_21 == var27_27) break block52;
                                                            }
lbl131:
                                                            // 2 sources

                                                            while (true) {
                                                                var4_4 = var2_2;
                                                                var2_2 = var9_9;
                                                                break block45;
                                                                break;
                                                            }
                                                        }
                                                        ** while ((var11_11 = (int)var10_10.equals((Object)(var12_12 = "RESOURCE_ONLY"))) == 0)
lbl137:
                                                        // 1 sources

                                                        var11_11 = 540194507;
                                                        var15_15 = 1.5137668E-19f;
                                                        var22_22 = var2_2;
                                                        var2_2.K(var11_11);
                                                        var9_9.getClass();
                                                        var46_44 = dr0_0.e((Subcomponent)var17_17);
                                                        var47_46 = dr0_0.g((List)var20_20, (dr0_0)var9_9);
                                                        var10_10 = var9_9.u0;
                                                        var12_12 = var17_17.getId();
                                                        if (var12_12 != null) {
                                                            var12_12 = StringsKt.toIntOrNull((String)var12_12);
                                                        } else {
                                                            var21_21 = 0;
                                                            var12_12 = null;
                                                        }
                                                        var11_11 = (int)CollectionsKt.F((Iterable)var10_10, var12_12);
                                                        if (var11_11 == 0) {
                                                            var10_10 = new ArrayList();
                                                            var12_12 = var17_17.getId();
                                                            var10_10.add(var12_12);
                                                            var9_9.f0((String)var24_24, (String)var23_23, (ArrayList)var10_10);
                                                        }
                                                        var28_28 = uq0_0.o;
                                                        var21_21 = 0;
                                                        var10_10 = var1_1;
                                                        var2_2 = var22_22;
                                                        var48_48 = false;
                                                        var49_49 = var25_25;
                                                        var40_38 = var45_43;
                                                        var26_26 = 13;
                                                        var50_51 = androidx.compose.foundation.layout.h.i((LP1)var1_1, 0.0f, var28_28, 0.0f, 0.0f, var26_26);
                                                        var10_10 = var35_33;
                                                        var10_10 = (c80)var35_33;
                                                        var12_12 = var51_53;
                                                        var22_22 = var34_32;
                                                        var23_23 = var10_10;
                                                        var24_24 = var9_9;
                                                        var25_25 = var44_42;
                                                        var35_33 = var18_18;
                                                        var20_20 = var34_32;
                                                        var34_32 = var17_17;
                                                        var52_55 /* !! */  = var43_41;
                                                        var43_41 = var16_16;
                                                        var51_53 = new WC((Activity)var22_22, (c80)var10_10, (dr0_0)var9_9, (Ref$ObjectRef)var44_42, (Component)var18_18, (Subcomponent)var17_17, (yp0_0)var16_16);
                                                        var35_33 = var5_5.n;
                                                        var12_12 = var44_42;
                                                        var22_22 = var46_44;
                                                        var23_23 = var9_9;
                                                        var24_24 = var47_46;
                                                        var25_25 = var45_43;
                                                        var34_32 = var10_10;
                                                        var53_57 /* !! */  = var20_20;
                                                        var20_20 = var6_6;
                                                        var44_42 = new fc_0(var46_44, (dr0_0)var9_9, var47_46, (String)var45_43, (String)var35_33, (c80)var10_10, (yp0_0)var16_16, (String)var6_6);
                                                        var20_20 = var10_10;
                                                        var10_10 = var54_59;
                                                        var12_12 = var53_57 /* !! */ ;
                                                        var22_22 = var9_9;
                                                        var23_23 = var52_55 /* !! */ ;
                                                        var24_24 = var46_44;
                                                        var25_25 = var17_17;
                                                        var35_33 = var45_43;
                                                        var55_60 = var8_8;
                                                        var17_17 = var34_32;
                                                        var20_20 = var6_6;
                                                        var54_59 = new gc_1((Activity)var53_57 /* !! */ , (dr0_0)var9_9, var52_55 /* !! */ , var46_44, (Subcomponent)var25_25, (String)var45_43, var8_8, (yp0_0)var16_16, (String)var6_6);
                                                        var12_12 = var20_20;
                                                        var22_22 = var6_6;
                                                        var23_23 = var9_9;
                                                        var24_24 = var49_49;
                                                        var25_25 = var34_32;
                                                        var35_33 = var16_16;
                                                        var34_32 = var18_18;
                                                        var20_20 = new hc_0((String)var6_6, (dr0_0)var9_9, (yT1)var49_49, (c80)var17_17, (yp0_0)var16_16, (Component)var18_18);
                                                        var35_33 = var17_17;
                                                        var43_41 = var53_57 /* !! */ ;
                                                        var18_18 = new oc_0((Activity)var53_57 /* !! */ , (dr0_0)var9_9, (c80)var17_17, (yp0_0)var16_16);
                                                        var49_49 = new Object();
                                                        var17_17 = var10_10;
                                                        var10_10 = new qc_0((dr0_0)var9_9, (String)var6_6);
                                                        var39_37 = 448;
                                                        var56_62 = null;
                                                        var11_11 = 1;
                                                        var15_15 = 1.4E-45f;
                                                        var37_35 = 225846;
                                                        var12_12 = var50_51;
                                                        var22_22 = var46_44;
                                                        var23_23 = var47_46;
                                                        var35_33 = var51_53;
                                                        var34_32 = var44_42;
                                                        var43_41 = var54_59;
                                                        var13_13 = 1065353216;
                                                        var14_14 = 1.0f;
                                                        var16_16 = var9_9;
                                                        var3_3 = var9_9;
                                                        var9_9 = var49_49;
                                                        var44_42 = var2_2;
                                                        ZA2.a((boolean)var11_11, var50_51, var46_44, var47_46, false, true, var51_53, var34_32, var54_59, (Function2)var20_20, (Function2)var18_18, (dr0_0)var16_16, (Function0)var49_49, (Function1)var10_10, (b30_0)var2_2, var37_35, var39_37, 0);
                                                        var57_64 = nz_1.v;
                                                        var28_28 = uq0_0.b;
                                                        var9_9 = var1_1;
                                                        var24_24 = androidx.compose.foundation.layout.j.c((LP1)var1_1, var14_14);
                                                        var59_66 = uq0_0.q;
                                                        var26_26 = 0;
                                                        var19_19 = 13;
                                                        var34_32 = null;
                                                        var38_36 = false;
                                                        var43_41 = null;
                                                        var10_10 = androidx.compose.foundation.layout.h.i((LP1)var24_24, 0.0f, var59_66, 0.0f, 0.0f, var19_19);
                                                        var29_29 = false;
                                                        var24_24 = null;
                                                        var60_68 = 438;
                                                        var59_66 = 6.14E-43f;
                                                        var55_60 = 8;
                                                        var25_25 = var2_2;
                                                        Rr0.a((LP1)var10_10, var57_64, var28_28, 0.0f, (b30_0)var2_2, var60_68, var55_60);
                                                        var2_2.E();
                                                        var6_6 = Unit.a;
                                                        var10_10 = var2_2;
                                                        var2_2 = var16_16;
                                                        break block53;
                                                    }
                                                    var49_50 = var25_25;
                                                    var52_56 /* !! */  = var43_41;
                                                    var3_3 = var9_9;
                                                    var40_38 = var45_43;
                                                    var9_9 = var1_1;
                                                    var43_41 = var34_32;
                                                    var55_61 = 1065353216;
                                                    var12_12 = "MEDIA_WITH_RESOURCES";
                                                    var11_11 = (int)var10_10.equals(var12_12);
                                                    if (var11_11 == 0) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            var4_4 = var2_2;
                                                            var2_2 = var3_3;
                                                            break block45;
                                                            break;
                                                        }
                                                    }
                                                    break block54;
                                                }
                                                var49_50 = var25_25;
                                                var52_56 /* !! */  = var43_41;
                                                var3_3 = var9_9;
                                                var40_38 = var45_43;
                                                var9_9 = var1_1;
                                                var43_41 = var34_32;
                                                var55_61 = 1065353216;
                                                ** while ((var11_11 = (int)var10_10.equals((Object)(var12_12 = "MEDIA_ONLY"))) == 0)
                                            }
                                            var11_11 = 524343277;
                                            var15_15 = 4.083619E-20f;
                                            var25_25 = var2_2;
                                            var2_2.K(var11_11);
                                            var3_3.getClass();
                                            var10_10 = dr0_0.e((Subcomponent)var17_17);
                                            var22_22 = var3_3;
                                            var12_12 = dr0_0.g((List)var20_20, (dr0_0)var3_3);
                                            var1_1 = var9_9;
                                            var61_70 = 131071;
                                            var9_9 = new Component(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, var61_70, null);
                                            var34_32 = new ArrayList<ArrayList<ArrayList<ArrayList<E>>>>();
                                            var34_32.add(var10_10);
                                            var9_9.setSubcomponent((p83_0)var34_32);
                                            var9_9.setSubComponentsOwner((SubcomponentsOwner)var12_12);
                                            var34_32 = var3_3.u0;
                                            var45_43 = var17_17.getId();
                                            if (var45_43 != null) {
                                                var45_43 = StringsKt.toIntOrNull((String)var45_43);
                                                var2_2 = var12_12;
                                                var12_12 = var45_43;
                                            } else {
                                                var2_2 = var12_12;
                                                var21_21 = 0;
                                                var12_12 = null;
                                            }
                                            var21_21 = (int)CollectionsKt.F(var34_32, var12_12);
                                            if (var21_21 == 0) {
                                                var12_12 = new ArrayList();
                                                var34_32 = var17_17.getId();
                                                var12_12.add(var34_32);
                                                var22_22.f0((String)var24_24, (String)var23_23, (ArrayList)var12_12);
                                            }
                                            var12_12 = var52_56 /* !! */ .listIterator();
                                            while (true) {
                                                var23_23 = var12_12;
                                                var23_23 = (ob3_2)var12_12;
                                                var29_29 = var23_23.hasNext();
                                                var34_32 = var22_22.t0;
                                                if (!var29_29) break;
                                                var23_23 = (Subcomponent)var23_23.next();
                                                var24_24 = dr0_0.g((List)var20_20, (dr0_0)var22_22);
                                                var4_4 = var12_12;
                                                var61_70 = 131071;
                                                var12_12 = new Component(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, var61_70, null);
                                                var46_45 = var22_22;
                                                var22_22 = new p83_0();
                                                if (var23_23 != null) {
                                                    var23_23 = dr0_0.e((Subcomponent)var23_23);
                                                } else {
                                                    var48_48 = false;
                                                    var28_28 = 0.0f;
                                                    var23_23 = null;
                                                }
                                                var22_22.add(var23_23);
                                                var12_12.setSubcomponent((p83_0)var22_22);
                                                var12_12.setSubComponentsOwner((SubcomponentsOwner)var24_24);
                                                var22_22 = "component";
                                                Intrinsics.checkNotNullParameter(var12_12, (String)var22_22);
                                                if (var34_32 != null) {
                                                    var27_27 = (int)var34_32.isEmpty();
                                                    if (var27_27 != 0) {
                                                        while (true) {
                                                            var27_27 = 0;
                                                            var22_22 = null;
                                                            break;
                                                        }
                                                    } else {
                                                        var22_22 = var34_32.iterator();
                                                        do {
                                                            if (!(var48_48 = var22_22.hasNext())) ** continue;
                                                            var23_23 = (Component)var22_22.next();
                                                            if (var23_23 != null && (var23_23 = var23_23.getSubcomponent()) != null && (var23_23 = (Subcomponent)CollectionsKt.firstOrNull((List)var23_23)) != null) {
                                                                var23_23 = var23_23.getId();
                                                            } else {
                                                                var48_48 = false;
                                                                var28_28 = 0.0f;
                                                                var23_23 = null;
                                                            }
                                                            var24_24 = var12_12.getSubcomponent();
                                                            if (var24_24 != null && (var24_24 = (Subcomponent)CollectionsKt.firstOrNull(var24_24)) != null) {
                                                                var24_24 = var24_24.getId();
                                                                continue;
                                                            }
                                                            var29_29 = false;
                                                            var24_24 = null;
                                                        } while (!(var48_48 = Intrinsics.areEqual(var23_23, var24_24)));
                                                        var27_27 = 1;
                                                    }
                                                    var22_22 = (boolean)var27_27;
                                                } else {
                                                    var27_27 = 0;
                                                    var22_22 = null;
                                                }
                                                var23_23 = Boolean.FALSE;
                                                var27_27 = (int)Intrinsics.areEqual(var22_22, var23_23);
                                                if (var27_27 != 0 && var34_32 != null) {
                                                    var34_32.add(var12_12);
                                                }
                                                var12_12 = var4_4;
                                                var22_22 = var46_45;
                                            }
                                            var46_45 = var22_22;
                                            var21_21 = 1956660567;
                                            var25_25.K(var21_21);
                                            if (var20_20 == null) break block55;
                                            if (var34_32 != null) {
                                                var12_12 = new p83_0();
                                                CollectionsKt.h0(var34_32, (Collection)var12_12);
                                            } else {
                                                var21_21 = 0;
                                                var12_12 = null;
                                            }
                                            if (var12_12 == null) break block56;
                                            var27_27 = (int)var12_12.isEmpty();
                                            var55_61 = 1;
                                            if ((var27_27 ^= var55_61) != var55_61) break block57;
                                            var12_12 = CollectionsKt.W((Iterable)var12_12, (Collection)var20_20);
                                            var22_22 = new p83_0();
                                            CollectionsKt.h0((Iterable)var12_12, (Collection)var22_22);
                                            var51_54 = var22_22;
                                            break block58;
                                        }
                                        var55_61 = 1;
                                    }
                                    var51_54 = var20_20;
                                }
                                var12_12 = h40_0.a;
                                var45_43 = h40_0.w();
                                var56_63 = var12_12;
                                var62_71 = var35_33;
                                var62_71 = (c80)var35_33;
                                var60_69 = var5_5.j;
                                var63_72 = var2_2;
                                var23_23 = var46_45;
                                var22_22 = var43_41;
                                var2_2 = var46_45;
                                var23_23 = var62_71;
                                var24_24 = var46_45;
                                var4_4 = var25_25;
                                var25_25 = var44_42;
                                var36_34 = var60_69;
                                var35_33 = var18_18;
                                var34_32 = var16_16;
                                var53_58 = var43_41;
                                var38_36 = var60_69;
                                var46_45 = var12_12 = new EC((Activity)var43_41, (c80)var62_71, (dr0_0)var46_45, (Ref$ObjectRef)var44_42, (Component)var18_18, (yp0_0)var16_16, var60_69);
                                var22_22 = var2_2;
                                var23_23 = var63_72;
                                var24_24 = var10_10;
                                var25_25 = var62_71;
                                var35_33 = var16_16;
                                var34_32 = var6_6;
                                var47_47 = var12_12 = new rc_1((dr0_0)var2_2, (SubcomponentsOwner)var63_72, (Subcomponent)var10_10, (c80)var62_71, (yp0_0)var16_16, (String)var6_6);
                                var44_42 = var10_10;
                                var10_10 = var12_12;
                                var12_12 = var43_41;
                                var23_23 = var52_56 /* !! */ ;
                                var25_25 = var17_17;
                                var35_33 = var40_38;
                                var55_61 = var8_8;
                                var43_41 = var16_16;
                                var40_38 = var20_20;
                                var20_20 = var6_6;
                                var47_47((Activity)var53_58, (dr0_0)var2_2, var52_56 /* !! */ , (Subcomponent)var24_24, (Subcomponent)var17_17, (String)var35_33, var8_8, (yp0_0)var16_16, (String)var6_6);
                                var50_52 = var12_12;
                                var23_23 = var49_50;
                                var24_24 = var62_71;
                                var25_25 = var16_16;
                                var35_33 = var6_6;
                                var12_12 = new tc_1((dr0_0)var2_2, (yT1)var49_50, (c80)var62_71, (yp0_0)var16_16, (String)var6_6);
                                var64_73 = var40_38.size() + var8_8;
                                var65_74 = var10_10;
                                var12_12 = var53_58;
                                var23_23 = var9_9;
                                var24_24 = var44_42;
                                var25_25 = var17_17;
                                var35_33 = var52_56 /* !! */ ;
                                var43_41 = var62_71;
                                var53_58 = var10_10 = new uc_0((Activity)var53_58, (dr0_0)var2_2, (Component)var9_9, (Subcomponent)var44_42, (Subcomponent)var17_17, var52_56 /* !! */ , var8_8, (c80)var62_71, (String)var6_6);
                                var12_12 = var62_71;
                                var22_22 = var17_17;
                                var23_23 = var6_6;
                                var24_24 = var52_56 /* !! */ ;
                                var26_26 = var8_8;
                                var35_33 = var2_2;
                                var10_10 = new vc_0((c80)var62_71, (Subcomponent)var17_17, (String)var6_6, var52_56 /* !! */ , var8_8, (dr0_0)var2_2);
                                var66_75 = 1;
                                var13_13 = 0;
                                var14_14 = 0.0f;
                                var11_11 = 1065353216;
                                var15_15 = 1.0f;
                                var18_18 = null;
                                var42_40 = true;
                                var9_9 = null;
                                var6_6 = var1_1;
                                var39_37 = 0;
                                var40_38 = null;
                                var49_50 = var12_12 = var5_5.d;
                                var67_76 = 1872304;
                                var17_17 = var44_42;
                                var44_42 = var63_72;
                                var52_56 /* !! */  = var4_4;
                                bj0_0.a(null, var42_40, false, (Subcomponent)var17_17, (SubcomponentsOwner)var63_72, (BaseValue)var45_43, false, var56_63, (Function0)var46_45, (Function0)var47_47, (gx0_2)var50_52, (ft1_2)var12_12, (p83_0)var51_54, var64_73, (Function1)var65_74, (Function2)var10_10, var4_4, var67_76, 0, var66_75);
                                break block59;
                            }
                            var6_6 = var1_1;
                            var4_4 = var25_25;
                            var2_2 = var22_22;
                            var11_11 = 1065353216;
                            var15_15 = 1.0f;
                        }
                        var4_4.E();
                        var57_65 = nz_1.v;
                        var28_28 = uq0_0.b;
                        var24_24 = androidx.compose.foundation.layout.j.c((LP1)var6_6, var15_15);
                        var59_67 = uq0_0.q;
                        var26_26 = 0;
                        var19_19 = 13;
                        var34_32 = null;
                        var38_36 = false;
                        var43_41 = null;
                        var10_10 = androidx.compose.foundation.layout.h.i((LP1)var24_24, 0.0f, var59_67, 0.0f, 0.0f, var19_19);
                        var29_29 = false;
                        var24_24 = null;
                        var60_69 = 438 != 0;
                        var59_67 = 6.14E-43f;
                        var55_61 = 8;
                        var25_25 = var4_4;
                        Rr0.a((LP1)var10_10, var57_65, var28_28, 0.0f, var4_4, (int)var60_69, var55_61);
                        var4_4.E();
                        var6_6 = Unit.a;
                        var10_10 = var4_4;
                        break block53;
                    }
                    var13_13 = 551581365;
                    var14_14 = 3.802563E-19f;
                    var10_10 = var4_4;
                    var4_4.K(var13_13);
                    var4_4.E();
                    var6_6 = Unit.a;
                }
                var10_10.p();
                if (var41_39 != null) {
                    var19_19 = var41_39.size();
                } else {
                    var19_19 = 0;
                    var20_20 = null;
                }
                var13_13 = 3;
                var14_14 = 4.2E-45f;
                if (var19_19 > var13_13) {
                    var6_6 = var2_2;
                    var21_21 = (int)var2_2.k0;
                    if (var21_21 == 0 && (var21_21 = (int)var2_2.Z) == 0) {
                        if (var41_39 != null) {
                            var21_21 = var41_39.size();
                            var19_19 = var21_21 + -1;
                        } else {
                            var19_19 = 0;
                            var20_20 = null;
                        }
                        if (var8_8 >= var19_19) {
                            var7_7 = UUID.randomUUID().toString();
                            var22_22 = var5_5.l;
                            var48_48 = false;
                            var28_28 = 0.0f;
                            var23_23 = null;
                            var12_12 = new hd_2((dr0_0)var6_6, (String)var22_22, null);
                            ly0_0.d((b30_0)var10_10, var7_7, (Function2)var12_12);
                        }
                    }
                }
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

