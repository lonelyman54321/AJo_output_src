/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.clevertap.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inbox.CTInboxActivity$b;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements CTInboxActivity$b {
    public static int c;
    public static CleverTapInstanceConfig d;
    public static HashMap e;
    public static n2_0 f;
    public static final HashMap g;
    public final Context a;
    public final H80 b;

    static {
        HashMap hashMap;
        c = a$a.INFO.intValue();
        g = hashMap = new HashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(Context var1_1, CleverTapInstanceConfig var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 /* !! */  = var2_2;
        var6_6 = 2;
        var7_7 = 3 != 0;
        super();
        this.a = var1_1;
        super();
        var9_9 = xj3_0.d;
        Intrinsics.checkNotNullParameter(var2_2, "ctInstanceConfig");
        super();
        var10_19 = xj3_0.d.iterator();
        block41: while (true) {
            var11_20 /* !! */  = var10_19.hasNext();
            var12_21 = null;
            if (var11_20 /* !! */  == 0) break;
            var13_22 = ((sj3_0)var10_19.next()).a().iterator();
            while (true) {
                if ((var14_23 = var13_22.hasNext()) == 0) continue block41;
                var15_24 = (eg0)var13_22.next();
                var16_25 = var9_9.contains(var15_24);
                if (var16_25 != 0) {
                    var15_24.getClass();
                    var13_22 = "CustomTemplate with a name \"null\" is already registered";
                    Intrinsics.checkNotNullParameter(var13_22, "message");
                    var9_9 = new RuntimeException((String)var13_22, null);
                    throw var9_9;
                }
                var9_9.add(var15_24);
            }
            break;
        }
        var10_19 = var2_2.b();
        Intrinsics.checkNotNullExpressionValue(var10_19, "ctInstanceConfig.logger");
        var17_26 /* !! */  = new xj3_0((LinkedHashSet)var9_9, (b)var10_19);
        var9_9 = jd3_1.a.a();
        var10_19 = "context";
        Intrinsics.checkNotNullParameter(var4_4, (String)var10_19);
        var13_22 = var5_5 /* !! */ .a;
        var15_24 = "accountId";
        Intrinsics.checkNotNullParameter(var13_22, (String)var15_24);
        var19_28 = jd3_1.b((int)var7_7, 6, null);
        var19_28 = jd3_1.c((Context)var4_4, (String)var19_28);
        var12_21 = new pt1_2((vi_2)var19_28, (String)var13_22);
        Intrinsics.checkNotNullParameter(var4_4, (String)var10_19);
        Intrinsics.checkNotNullParameter(var13_22, (String)var15_24);
        var19_28 = jd3_1.b(4, var6_6, (String)var13_22);
        var19_28 = jd3_1.c((Context)var4_4, (String)var19_28);
        var20_29 /* !! */  = new yf1_2((vi_2)var19_28);
        Intrinsics.checkNotNullParameter(var4_4, (String)var10_19);
        Intrinsics.checkNotNullParameter(var13_22, (String)var15_24);
        var16_25 = 5;
        var10_19 = jd3_1.b(var16_25, var6_6, (String)var13_22);
        var10_19 = jd3_1.c((Context)var4_4, (String)var10_19);
        var13_22 = new fm0_0((vi_2)var10_19);
        var18_27 = new kd3_0((pt1_2)var12_21, (yf1_2)var20_29 /* !! */ , (fm0_0)var13_22);
        var8_8 /* !! */ .r = var18_27;
        var20_29 /* !! */  = new E80();
        var8_8 /* !! */ .b = var20_29 /* !! */ ;
        var12_21 = new Object();
        var15_24 = new Object();
        var10_19 = new ArrayList();
        var15_24.a = var10_19;
        var8_8 /* !! */ .h = var13_22 = new ti_0();
        var21_30 = new cg1_0();
        var10_19 = new Object();
        var10_19.g = var19_28 = zb2_0.b();
        var19_28 = q50_0.g;
        var10_19.t = var19_28;
        var19_28 = var5_5 /* !! */ .a;
        var10_19.a = var19_28;
        var22_31 /* !! */  = var5_5 /* !! */ .c;
        var10_19.c = var22_31 /* !! */ ;
        var22_31 /* !! */  = var5_5 /* !! */ .b;
        var10_19.b = var22_31 /* !! */ ;
        var22_31 /* !! */  = var5_5 /* !! */ .d;
        var10_19.d = var22_31 /* !! */ ;
        var22_31 /* !! */  = var5_5 /* !! */ .e;
        var10_19.e = var22_31 /* !! */ ;
        var22_31 /* !! */  = var5_5 /* !! */ .f;
        var10_19.f = var22_31 /* !! */ ;
        var6_6 = (int)var5_5 /* !! */ .p;
        var10_19.p = var6_6;
        var6_6 = (int)var5_5 /* !! */ .h;
        var10_19.h = var6_6;
        var6_6 = (int)var5_5 /* !! */ .s;
        var10_19.s = var6_6;
        var10_19.l = var6_6 = var5_5 /* !! */ .l;
        var22_31 /* !! */  = var5_5 /* !! */ .q;
        var10_19.q = var22_31 /* !! */ ;
        var6_6 = (int)var5_5 /* !! */ .v;
        var10_19.v = var6_6;
        var6_6 = (int)var5_5 /* !! */ .m;
        var10_19.m = var6_6;
        var6_6 = (int)var5_5 /* !! */ .k;
        var10_19.k = var6_6;
        var6_6 = (int)var5_5 /* !! */ .u;
        var10_19.u = var6_6;
        var6_6 = (int)var5_5 /* !! */ .i;
        var10_19.i = var6_6;
        var6_6 = (int)var5_5 /* !! */ .n;
        var10_19.n = var6_6;
        var22_31 /* !! */  = var5_5 /* !! */ .o;
        var10_19.o = var22_31 /* !! */ ;
        var22_31 /* !! */  = var5_5 /* !! */ .r;
        var10_19.r = var22_31 /* !! */ ;
        var6_6 = (int)var5_5 /* !! */ .j;
        var10_19.j = var6_6;
        var10_19.t = var22_31 /* !! */  = var5_5 /* !! */ .t;
        var10_19.w = var6_6 = var5_5 /* !! */ .w;
        var8_8 /* !! */ .a = var10_19;
        var23_32 /* !! */  = new Nh0((CleverTapInstanceConfig)var10_19, (ti_0)var13_22);
        var25_34 /* !! */  = var13_22;
        var13_22 = Ae0$a.AES;
        var26_35 /* !! */  = var15_24;
        Intrinsics.checkNotNullParameter(var13_22, "encryptionType");
        Intrinsics.checkNotNullParameter(var19_28, "accountID");
        super();
        var15_24 = Ae0$b.values()[var6_6];
        var24_33 /* !! */ .a = var15_24;
        var24_33 /* !! */ .c = var19_28;
        var6_6 = 0;
        var22_31 /* !! */  = null;
        var24_33 /* !! */ .d = 0;
        Intrinsics.checkNotNullParameter(var13_22, "type");
        var15_24 = ze0_1.$EnumSwitchMapping$0;
        var11_20 /* !! */  = var13_22.ordinal();
        var11_20 /* !! */  = (int)var15_24[var11_20 /* !! */ ];
        var14_23 = 1;
        if (var11_20 /* !! */  != var14_23) {
            var10_19 = var3_3;
            var9_9 = new NoWhenBranchMatchedException();
            throw var9_9;
        }
        var24_33 /* !! */ .b = var13_22 = new k0_0();
        var8_8 /* !! */ .q = var24_33 /* !! */ ;
        var13_22 = jh_1.a((CleverTapInstanceConfig)var10_19).b();
        var15_24 = new sv_0((Context)var4_4, (CleverTapInstanceConfig)var10_19, (ae0_1)var24_33 /* !! */ , (Nh0)var23_32 /* !! */ );
        var13_22.c("migratingEncryptionLevel", (Callable)var15_24);
        super((Context)var4_4, (CleverTapInstanceConfig)var10_19, (E80)var20_29 /* !! */ );
        var8_8 /* !! */ .c = var22_31 /* !! */ ;
        var13_22 = var22_31 /* !! */ .d;
        var15_24 = var13_22.b();
        var27_36 /* !! */  = var10_19;
        var10_19 = new StringBuilder();
        var28_37 = var19_28;
        var19_28 = var13_22.a;
        var10_19.append((String)var19_28);
        var19_28 = ":async_deviceID";
        var10_19.append((String)var19_28);
        var10_19 = var10_19.toString();
        var29_38 /* !! */  = var19_28;
        var15_24.b((String)var10_19, "DeviceInfo() called");
        var10_19 = jh_1.a((CleverTapInstanceConfig)var13_22).a();
        var15_24 = new Fp0((mp0_0)var22_31 /* !! */ );
        var10_19.c("getDeviceCachedInfo", (Callable)var15_24);
        var10_19 = jh_1.a((CleverTapInstanceConfig)var13_22).a();
        var13_22 = new gp0_0((mp0_0)var22_31 /* !! */ );
        var10_19.b((e92)var13_22);
        var13_22 = new hp0_0((mp0_0)var22_31 /* !! */ );
        var10_19.c("initDeviceID", (Callable)var13_22);
        var13_22 = var27_36 /* !! */ ;
        var10_19 = var19_28;
        var30_39 /* !! */  = var27_36 /* !! */ ;
        var31_40 = var25_34 /* !! */ ;
        var13_22 = var1_1;
        var3_3 = var26_35 /* !! */ ;
        var15_24 = var27_36 /* !! */ ;
        var5_5 /* !! */  = var19_28;
        var32_41 /* !! */  = var28_37;
        var33_42 /* !! */  = var29_38 /* !! */ ;
        var19_28 = var24_33 /* !! */ ;
        var29_38 /* !! */  = var24_33 /* !! */ ;
        var24_33 /* !! */  = var18_27;
        var18_27 = var22_31 /* !! */ ;
        var34_43 = var17_26 /* !! */ ;
        var17_26 /* !! */  = var23_32 /* !! */ ;
        super((Context)var1_1, (CleverTapInstanceConfig)var27_36 /* !! */ , (ae0_1)var19_28, (mp0_0)var22_31 /* !! */ , (Nh0)var23_32 /* !! */ );
        var8_8 /* !! */ .d = var10_19;
        var17_26 /* !! */  = new lb2_0((ha3_1)var12_21, (ea3_1)var26_35 /* !! */ );
        var10_19 = var35_44;
        var19_28 = var20_29 /* !! */ ;
        var18_27 = var5_5 /* !! */ ;
        var35_44 = new KB0((Context)var1_1, (CleverTapInstanceConfig)var27_36 /* !! */ , (E80)var20_29 /* !! */ , (LocalDataStore)var5_5 /* !! */ , (lb2_0)var17_26 /* !! */ );
        var17_26 /* !! */  = var27_36 /* !! */ ;
        yi_1.a((Context)var4_4, (CleverTapInstanceConfig)var27_36 /* !! */ );
        super((CleverTapInstanceConfig)var27_36 /* !! */ , (mp0_0)var22_31 /* !! */ );
        var8_8 /* !! */ .i = var18_27;
        super((CleverTapInstanceConfig)var27_36 /* !! */ , (E80)var20_29 /* !! */ , (ha3_1)var12_21, (LocalDataStore)var5_5 /* !! */ );
        var8_8 /* !! */ .o = var19_28;
        var10_19 = var15_24;
        var30_39 /* !! */  = var26_35 /* !! */ ;
        var3_3 = var15_24;
        var15_24 = var27_36 /* !! */ ;
        var36_45 /* !! */  = var19_28;
        var19_28 = var25_34 /* !! */ ;
        var37_46 /* !! */  = var18_27;
        var38_47 = var20_29 /* !! */ ;
        var20_29 /* !! */  = var27_36 /* !! */ ;
        var17_26 /* !! */  = var22_31 /* !! */ ;
        var39_48 = var12_21;
        var12_21 = var23_32 /* !! */ ;
        super((Context)var1_1, (CleverTapInstanceConfig)var27_36 /* !! */ , (ti_0)var25_34 /* !! */ , (ck_1)var18_27, (mp0_0)var22_31 /* !! */ , (Nh0)var23_32 /* !! */ );
        var8_8 /* !! */ .j = var10_19;
        super((LocalDataStore)var5_5 /* !! */ );
        var13_22 = var27_36 /* !! */ .a;
        var12_21 = new rs3_0((Context)var4_4, (String)var13_22, (mp0_0)var22_31 /* !! */ );
        super((kd3_0)var24_33 /* !! */ );
        var13_22 = new vu1_1((df1_1)var17_26 /* !! */ , (rs3_0)var12_21);
        var8_8 /* !! */ .m = var17_26 /* !! */ ;
        var40_49 /* !! */  = var18_27;
        var41_50 /* !! */  = var10_19;
        var25_34 /* !! */  = var12_21;
        var26_35 /* !! */  = var13_22;
        var27_36 /* !! */  = var24_33 /* !! */ ;
        var28_37 = var34_43;
        super((us3_0)var10_19, (rs3_0)var12_21, (vu1_1)var13_22, (kd3_0)var24_33 /* !! */ , (xj3_0)var34_43);
        var8_8 /* !! */ .l = var18_27;
        var19_28 = jh_1.a((CleverTapInstanceConfig)var15_24).a();
        var10_19 = var15_24;
        var13_22 = var8_8 /* !! */ ;
        var42_51 = var5_5 /* !! */ ;
        var5_5 /* !! */  = var15_24;
        var15_24 = var24_33 /* !! */ ;
        var4_4 = var19_28;
        var19_28 = var9_9;
        var9_9 = var18_27;
        var18_27 = var1_1;
        var40_49 /* !! */  = var17_26 /* !! */ ;
        var17_26 /* !! */  = var29_38 /* !! */ ;
        var43_52 = var12_21;
        var12_21 = var22_31 /* !! */ ;
        var44_53 = var8_8 /* !! */ ;
        var8_8 /* !! */  = var20_29 /* !! */ ;
        var45_54 = var23_32 /* !! */ ;
        var23_32 /* !! */  = var9_9;
        var46_55 /* !! */  = var29_38 /* !! */ ;
        var29_38 /* !! */  = var24_33 /* !! */ ;
        var24_33 /* !! */  = var37_46 /* !! */ ;
        super((H80)var13_22, (kd3_0)var27_36 /* !! */ , (jd3_1)var19_28, (Context)var1_1, (ae0_1)var17_26 /* !! */ , (mp0_0)var22_31 /* !! */ , (CleverTapInstanceConfig)var20_29 /* !! */ , (yB0)var9_9, (ck_1)var37_46 /* !! */ );
        var4_4.c("initStores", (Callable)var10_19);
        var8_8 /* !! */  = jh_1.a((CleverTapInstanceConfig)var20_29 /* !! */ ).a();
        var10_19 = var23_32 /* !! */ ;
        var15_24 = var3_3;
        var19_28 = var20_29 /* !! */ ;
        var17_26 /* !! */  = var27_36 /* !! */ ;
        var12_21 = var40_49 /* !! */ ;
        super((H80)var13_22, (l80_0)var3_3, (CleverTapInstanceConfig)var20_29 /* !! */ , (Context)var1_1, (kd3_0)var27_36 /* !! */ , (df1_1)var40_49 /* !! */ );
        var8_8 /* !! */ .c("initFCManager", (Callable)var23_32 /* !! */ );
        var10_19 = var20_29 /* !! */ .b();
        var4_4 = var1_1;
        var5_5 /* !! */  = var27_36 /* !! */ ;
        var10_19 = vl0_0.b((Context)var1_1, (b)var10_19, (kd3_0)var27_36 /* !! */ );
        var13_22 = var20_29 /* !! */ .b();
        super((Context)var1_1, (yc1_2)var13_22);
        var13_22 = new ta3_1((CleverTapInstanceConfig)var20_29 /* !! */ , (Context)var1_1, (wl0_1)var10_19, (ol0_1)var24_33 /* !! */ );
        super((ta3_1)var13_22);
        var23_32 /* !! */  = var44_53;
        var44_53.j.n = var10_19;
        var13_22 = jh_1.a((CleverTapInstanceConfig)var20_29 /* !! */ ).a();
        var15_24 = new uv_1((ki_1)var10_19);
        var13_22.c("initCTVariables", (Callable)var15_24);
        var40_49 /* !! */  = var29_38 /* !! */ ;
        var41_50 /* !! */  = var20_29 /* !! */ ;
        var25_34 /* !! */  = var3_3;
        var28_37 = var43_52;
        var47_56 /* !! */  = var34_43;
        super((CleverTapInstanceConfig)var20_29 /* !! */ , (l80_0)var3_3, false, (kd3_0)var27_36 /* !! */ , (rs3_0)var43_52, (xj3_0)var34_43, (E80)var38_47);
        var8_8 /* !! */  = new He0((Context)var1_1, (CleverTapInstanceConfig)var20_29 /* !! */ , (mp0_0)var22_31 /* !! */ );
        var10_19 = var12_21;
        var13_22 = var1_1;
        var15_24 = var20_29 /* !! */ ;
        var19_28 = var22_31 /* !! */ ;
        var18_27 = var38_47;
        var17_26 /* !! */  = var30_39 /* !! */ ;
        var25_34 /* !! */  = var12_21;
        var12_21 = var3_3;
        var40_49 /* !! */  = var8_8 /* !! */ ;
        var8_8 /* !! */  = var45_54;
        var23_32 /* !! */  = var37_46 /* !! */ ;
        var26_35 /* !! */  = var24_33 /* !! */ ;
        var24_33 /* !! */  = var31_40;
        var28_37 = var20_29 /* !! */ ;
        var27_36 /* !! */  = var38_47;
        var20_29 /* !! */  = var39_48;
        var47_56 /* !! */  = var22_31 /* !! */ ;
        var48_57 = 2;
        var22_31 /* !! */  = var29_38 /* !! */ ;
        var29_38 /* !! */  = var5_5 /* !! */ ;
        var49_58 = var42_51;
        var5_5 /* !! */  = var40_49 /* !! */ ;
        super((Context)var1_1, (CleverTapInstanceConfig)var41_50 /* !! */ , (mp0_0)var19_28, (E80)var38_47, (ea3_1)var30_39 /* !! */ , (l80_0)var3_3, (Nh0)var45_54, (ck_1)var37_46 /* !! */ , (ti_0)var31_40, (ha3_1)var39_48, (qg1_1)var22_31 /* !! */ , (He0)var40_49 /* !! */ );
        var10_19 = var5_5 /* !! */ ;
        var13_22 = var45_54;
        var15_24 = var1_1;
        var19_28 = var41_50 /* !! */ ;
        var18_27 = var35_44;
        var17_26 /* !! */  = var36_45 /* !! */ ;
        var12_21 = var37_46 /* !! */ ;
        var8_8 /* !! */  = var21_30;
        var23_32 /* !! */  = var47_56 /* !! */ ;
        var24_33 /* !! */  = var30_39 /* !! */ ;
        var20_29 /* !! */  = var25_34 /* !! */ ;
        var22_31 /* !! */  = var38_47;
        var50_59 /* !! */  = var5_5 /* !! */ ;
        var5_5 /* !! */  = var31_40;
        var4_4 = var42_51;
        var40_49 /* !! */  = var3_3;
        var41_50 /* !! */  = var46_55 /* !! */ ;
        super((Nh0)var45_54, (Context)var1_1, (CleverTapInstanceConfig)var28_37, var35_44, (x03)var36_45 /* !! */ , (ck_1)var37_46 /* !! */ , var21_30, (mp0_0)var47_56 /* !! */ , (ea3_1)var30_39 /* !! */ , (tu1_1)var25_34 /* !! */ , (E80)var38_47, (ti_0)var31_40, (LocalDataStore)var42_51, (l80_0)var3_3, (ae0_1)var46_55 /* !! */ );
        var12_21 = var44_53;
        var17_26 /* !! */  = var10_19;
        var44_53.g = var10_19;
        var7_7 = true;
        var8_8 /* !! */  = var41_50 /* !! */ ;
        var23_32 /* !! */  = var28_37;
        var24_33 /* !! */  = var3_3;
        var22_31 /* !! */  = var29_38 /* !! */ ;
        var5_5 /* !! */  = var43_52;
        var4_4 = var34_43;
        var40_49 /* !! */  = var38_47;
        super((CleverTapInstanceConfig)var28_37, (l80_0)var3_3, var7_7, (kd3_0)var29_38 /* !! */ , (rs3_0)var43_52, (xj3_0)var34_43, (E80)var38_47);
        var10_19 = var4_4;
        var13_22 = var1_1;
        var15_24 = var28_37;
        var19_28 = var50_59 /* !! */ ;
        var18_27 = var39_48;
        var40_49 /* !! */  = var50_59 /* !! */ ;
        var17_26 /* !! */  = var30_39 /* !! */ ;
        var5_5 /* !! */  = var44_53;
        var12_21 = var38_47;
        var8_8 /* !! */  = var47_56 /* !! */ ;
        var23_32 /* !! */  = var37_46 /* !! */ ;
        var20_29 /* !! */  = var31_40;
        var22_31 /* !! */  = var41_50 /* !! */ ;
        var44_53.f = var4_4 = new we((Context)var1_1, (CleverTapInstanceConfig)var28_37, (EventQueueManager)var50_59 /* !! */ , (ha3_1)var39_48, (ea3_1)var30_39 /* !! */ , (E80)var38_47, (mp0_0)var47_56 /* !! */ , (ck_1)var37_46 /* !! */ , (l80_0)var3_3, (ti_0)var31_40, (qg1_1)var41_50 /* !! */ );
        var10_19 = var25_34 /* !! */ ;
        var25_34 /* !! */ .p.add(var9_9);
        var23_32 /* !! */  = var28_37;
        var20_29 /* !! */  = var29_38 /* !! */ ;
        super((CleverTapInstanceConfig)var28_37, (kd3_0)var29_38 /* !! */ );
        var10_19 = var22_31 /* !! */ ;
        var19_28 = var21_30;
        var18_27 = var3_3;
        var17_26 /* !! */  = var37_46 /* !! */ ;
        var12_21 = var4_4;
        var8_8 /* !! */  = var38_47;
        var23_32 /* !! */  = var47_56 /* !! */ ;
        var41_50 /* !! */  = var29_38 /* !! */ ;
        var20_29 /* !! */  = var9_9;
        var25_34 /* !! */  = var3_3;
        var3_3 = var22_31 /* !! */ ;
        var22_31 /* !! */  = var26_35 /* !! */ ;
        var5_5 /* !! */  = var34_43;
        var26_35 /* !! */  = var4_4;
        var4_4 = var29_38 /* !! */ ;
        super((Context)var1_1, (CleverTapInstanceConfig)var28_37, var21_30, (l80_0)var25_34 /* !! */ , (ck_1)var37_46 /* !! */ , (we)var12_21, (E80)var38_47, (mp0_0)var47_56 /* !! */ , (og1_0)var24_33 /* !! */ , (yB0)var9_9, (ol0_1)var22_31 /* !! */ , (xj3_0)var34_43, (kd3_0)var29_38 /* !! */ );
        var4_4 = var44_53;
        var44_53.k = var10_19;
        var44_53.j.l = var10_19;
        super();
        var10_19 = var10_19.p;
        var13_22 = "listener";
        Intrinsics.checkNotNullParameter(var10_19, (String)var13_22);
        var9_9.a.add(var10_19);
        super();
        Intrinsics.checkNotNullParameter(var9_9, (String)var13_22);
        var15_24 = var10_19.a;
        var15_24.add(var9_9);
        var22_31 /* !! */  = var37_46 /* !! */ ;
        super((ck_1)var37_46 /* !! */ );
        Intrinsics.checkNotNullParameter(var9_9, (String)var13_22);
        var15_24.add(var9_9);
        var37_46 /* !! */ .h = var10_19;
        var9_9 = jh_1.a((CleverTapInstanceConfig)var28_37).a();
        var10_19 = var8_8 /* !! */ ;
        var13_22 = var1_1;
        var15_24 = var25_34 /* !! */ ;
        var19_28 = var28_37;
        var18_27 = var47_56 /* !! */ ;
        super((Context)var1_1, (l80_0)var25_34 /* !! */ , (CleverTapInstanceConfig)var28_37, (mp0_0)var47_56 /* !! */ , (ck_1)var37_46 /* !! */ , (we)var12_21);
        var9_9.c("initFeatureFlags", (Callable)var8_8 /* !! */ );
        var28_37.b();
        var5_5 /* !! */  = var1_1;
        var20_29 /* !! */  = var28_37;
        super((Context)var1_1, (CleverTapInstanceConfig)var28_37);
        var10_19 = var8_8 /* !! */ ;
        var15_24 = var28_37;
        var19_28 = var45_54;
        var18_27 = var30_39 /* !! */ ;
        var17_26 /* !! */  = var26_35 /* !! */ ;
        super((Context)var1_1, (CleverTapInstanceConfig)var28_37, (Nh0)var45_54, (ea3_1)var30_39 /* !! */ , (we)var26_35 /* !! */ , (mi_1)var12_21);
        var10_19 = var8_8 /* !! */ .f;
        var9_9 = var10_19.g;
        var24_33 /* !! */  = null;
        var13_22 = new XB2$a[]{};
        if (var9_9 != null && (var14_23 = (int)var9_9.isEmpty()) == 0) {
            var11_20 /* !! */  = var9_9.size();
            var13_22 = new XB2$a[var11_20 /* !! */ ];
            var15_24 = null;
            for (var14_23 = 0; var14_23 < (var16_25 = var9_9.size()); var14_23 += var51_60) {
                var19_28 = XB2$a.valueOf((String)var9_9.get(var14_23));
                var13_22[var14_23] = var19_28;
                var51_60 = 1;
            }
        }
        var51_60 = 1;
        var14_23 = ((Object)var13_22).length;
        var16_25 = 0;
        var19_28 = null;
        while (true) {
            var9_9 = var8_8 /* !! */ .a;
            var18_27 = " Exception:";
            var17_26 /* !! */  = "PushProvider";
            if (var16_25 >= var14_23) break;
            var12_21 = var13_22[var16_25];
            var24_33 /* !! */  = var12_21.getMessagingSDKClassName();
            try {
                Class.forName((String)var24_33 /* !! */ );
                var9_9.add(var12_21);
                super();
                var12_21 = "SDK Class Available :";
                var9_9.append((String)var12_21);
                var9_9.append((String)var24_33 /* !! */ );
                var9_9 = var9_9.toString();
                var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
            }
            catch (Exception var9_10) {
                var12_21 = "SDK class Not available ";
                var18_27 = Gn.a((String)var12_21, (String)var24_33 /* !! */ , (String)var18_27);
                var9_9 = var9_10.getClass().getName();
                var18_27.append((String)var9_9);
                var9_9 = var18_27.toString();
                var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
            }
            var16_25 += var51_60;
            var24_33 /* !! */  = null;
        }
        var13_22 = new ArrayList();
        var15_24 = var9_9.iterator();
        while (true) {
            block51: {
                block60: {
                    block56: {
                        block59: {
                            block55: {
                                block58: {
                                    block54: {
                                        block57: {
                                            block52: {
                                                block53: {
                                                    if ((var52_61 = var15_24.hasNext()) == 0) break block57;
                                                    var9_9 = (XB2$a)var15_24.next();
                                                    var19_28 = "Found provider:";
                                                    var12_21 = var9_9.getCtProviderClassName();
                                                    var9_9 = Class.forName((String)var12_21);
                                                    var24_33 /* !! */  = var8_8 /* !! */ .g;
                                                    var41_50 /* !! */  = var15_24;
                                                    var51_60 = 3;
                                                    var15_24 = new Class[var51_60];
                                                    var28_37 = di_1.class;
                                                    var53_62 = 0;
                                                    var21_30 = null;
                                                    var15_24[0] = var28_37;
                                                    var28_37 = Context.class;
                                                    var53_62 = 1;
                                                    var15_24[var53_62] = var28_37;
                                                    var28_37 = CleverTapInstanceConfig.class;
                                                    try {
                                                        var15_24[var48_57] = var28_37;
                                                        try {
                                                            var9_9 = var9_9.getConstructor((Class<?>)var15_24);
                                                        }
                                                        catch (Exception var9_15) {}
                                                        var15_24 = new Object[var51_60];
                                                        var28_37 = null;
                                                        var15_24[0] = var8_8 /* !! */ ;
                                                        var53_62 = 1;
                                                        var15_24[var53_62] = var24_33 /* !! */ ;
                                                        var15_24[var48_57] = var10_19;
                                                        var15_24 = var9_9 = var9_9.newInstance((Object[])var15_24);
                                                        var15_24 = (ci_0)var9_9;
                                                        try {
                                                            super((String)var19_28);
                                                            var9_9.append((String)var12_21);
                                                            var9_9 = var9_9.toString();
                                                            var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
                                                            break block51;
                                                        }
                                                        catch (Exception var9_11) {
                                                            break block52;
                                                        }
                                                        catch (Exception var9_12) {}
                                                        ** GOTO lbl-1000
                                                        catch (ClassNotFoundException v0) {}
                                                        ** GOTO lbl-1000
                                                        catch (IllegalAccessException v1) {}
                                                        ** GOTO lbl-1000
                                                        catch (InstantiationException v2) {}
                                                        ** GOTO lbl-1000
                                                        catch (Exception var9_13) {
                                                            break block53;
                                                        }
                                                        catch (Exception var9_14) {
                                                            var28_37 = null;
                                                            break block53;
                                                        }
                                                        catch (ClassNotFoundException v3) {
                                                            var28_37 = null;
                                                            break block54;
                                                        }
                                                        catch (IllegalAccessException v4) {
                                                            var28_37 = null;
                                                            break block55;
                                                        }
                                                        catch (InstantiationException v5) {
                                                            var28_37 = null;
                                                            break block56;
                                                        }
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (ClassNotFoundException v6) {}
                                                    ** GOTO lbl-1000
                                                    catch (IllegalAccessException v7) {}
                                                    ** GOTO lbl-1000
                                                    catch (InstantiationException v8) {}
                                                    ** GOTO lbl-1000
                                                    catch (Exception var9_16) {
                                                        var28_37 = null;
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (ClassNotFoundException v9) {
                                                        var28_37 = null;
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (IllegalAccessException v10) {
                                                        var28_37 = null;
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (InstantiationException v11) {
                                                        var28_37 = null;
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (Exception var9_17) {
                                                        ** GOTO lbl-1000
                                                    }
                                                    catch (Exception var9_18) {
                                                        var41_50 /* !! */  = var15_24;
                                                        var51_60 = 3;
                                                    }
lbl-1000:
                                                    // 3 sources

                                                    {
                                                        var28_37 = null;
                                                    }
                                                }
                                                var53_62 = 1;
lbl-1000:
                                                // 3 sources

                                                {
                                                    var14_23 = 0;
                                                    var15_24 = null;
                                                }
                                            }
                                            var19_28 = Gn.a("Unable to create provider ", (String)var12_21, (String)var18_27);
                                            var9_9 = var9_9.getClass().getName();
                                            var19_28.append((String)var9_9);
                                            var9_9 = var19_28.toString();
                                            var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
                                            break block51;
                                            catch (ClassNotFoundException v12) {
                                                var41_50 /* !! */  = var15_24;
                                                var51_60 = 3;
                                            }
lbl-1000:
                                            // 2 sources

                                            {
                                                var28_37 = null;
                                                break block54;
                                            }
                                            catch (ClassNotFoundException v13) {}
                                            break block58;
                                            catch (IllegalAccessException v14) {
                                                var41_50 /* !! */  = var15_24;
                                                var51_60 = 3;
                                            }
lbl-1000:
                                            // 2 sources

                                            {
                                                var28_37 = null;
                                                break block55;
                                            }
                                            catch (IllegalAccessException v15) {}
                                            break block59;
                                            catch (InstantiationException v16) {
                                                var41_50 /* !! */  = var15_24;
                                                var51_60 = 3;
                                            }
lbl-1000:
                                            // 2 sources

                                            {
                                                var28_37 = null;
                                                break block56;
                                            }
                                            catch (InstantiationException v17) {}
                                            break block60;
                                        }
                                        var28_37 = null;
                                        var53_62 = 1;
                                        var9_9 = jh_1.a((CleverTapInstanceConfig)var10_19).b();
                                        super(var8_8 /* !! */ );
                                        var9_9.b((e92)var10_19);
                                        super((hC2)var8_8 /* !! */ , (ArrayList)var13_22);
                                        var9_9.c("asyncFindCTPushProviders", (Callable)var10_19);
                                        var24_33 /* !! */  = var25_34 /* !! */ ;
                                        var25_34 /* !! */ .m = var8_8 /* !! */ ;
                                        var4_4.p = var8_8 /* !! */ ;
                                        var10_19 = var9_9;
                                        var13_22 = var1_1;
                                        var15_24 = var20_29 /* !! */ ;
                                        var19_28 = var26_35 /* !! */ ;
                                        var18_27 = var27_36 /* !! */ ;
                                        var17_26 /* !! */  = var36_45 /* !! */ ;
                                        var12_21 = var8_8 /* !! */ ;
                                        var8_8 /* !! */  = var22_31 /* !! */ ;
                                        var23_32 /* !! */  = var3_3;
                                        var3_3 = var25_34 /* !! */ ;
                                        var24_33 /* !! */  = var40_49 /* !! */ ;
                                        var4_4.e = var9_9 = new k3_0((Context)var1_1, (CleverTapInstanceConfig)var20_29 /* !! */ , (we)var26_35 /* !! */ , (E80)var27_36 /* !! */ , (x03)var36_45 /* !! */ , (hC2)var12_21, (ck_1)var22_31 /* !! */ , (InAppController)var23_32 /* !! */ , (EventQueueManager)var40_49 /* !! */ );
                                        var10_19 = var9_9;
                                        var19_28 = var47_56 /* !! */ ;
                                        var18_27 = var30_39 /* !! */ ;
                                        var17_26 /* !! */  = var40_49 /* !! */ ;
                                        var12_21 = var26_35 /* !! */ ;
                                        var8_8 /* !! */  = var27_36 /* !! */ ;
                                        var23_32 /* !! */  = var25_34 /* !! */ ;
                                        var24_33 /* !! */  = var36_45 /* !! */ ;
                                        var20_29 /* !! */  = var49_58;
                                        var3_3 = var5_5 /* !! */ ;
                                        var5_5 /* !! */  = var45_54;
                                        var3_3 = var4_4;
                                        var4_4 = var31_40;
                                        var40_49 /* !! */  = var46_55 /* !! */ ;
                                        var3_3.n = var9_9 = new By1((Context)var1_1, (CleverTapInstanceConfig)var15_24, (mp0_0)var47_56 /* !! */ , (ea3_1)var30_39 /* !! */ , (EventQueueManager)var17_26 /* !! */ , (we)var26_35 /* !! */ , (E80)var27_36 /* !! */ , (l80_0)var25_34 /* !! */ , (x03)var36_45 /* !! */ , (LocalDataStore)var49_58, (ck_1)var22_31 /* !! */ , (Nh0)var45_54, (ti_0)var31_40, (ae0_1)var46_55 /* !! */ );
                                        var10_19 = this;
                                        this.b = var3_3;
                                        var9_9 = this.f();
                                        super();
                                        var13_22 = var32_41 /* !! */ ;
                                        var3_3.append((String)var32_41 /* !! */ );
                                        var13_22 = var33_42 /* !! */ ;
                                        var3_3.append((String)var33_42 /* !! */ );
                                        var3_3 = var3_3.toString();
                                        var9_9.b((String)var3_3, "CoreState is set");
                                        var9_9 = jh_1.a((CleverTapInstanceConfig)var2_2).b();
                                        var13_22 = var2_2;
                                        var3_3 = new iv_1(this, (CleverTapInstanceConfig)var2_2);
                                        var15_24 = "CleverTapAPI#initializeDeviceInfo";
                                        var9_9.c((String)var15_24, (Callable)var3_3);
                                        var9_9 = yz3_0.a;
                                        var54_63 = System.currentTimeMillis();
                                        var56_64 = 1000L;
                                        var58_65 = (int)(var54_63 /= var56_64);
                                        var52_61 = E80.x;
                                        var14_23 = 5;
                                        if ((var58_65 -= var52_61) > var14_23) {
                                            var9_9 = this.b.a;
                                            var58_65 = 1;
                                            var9_9.k = var58_65;
                                        }
                                        var9_9 = jh_1.a((CleverTapInstanceConfig)var2_2).b();
                                        var3_3 = new jv_0(var10_19, 0);
                                        var9_9.c("setStatesAsync", (Callable)var3_3);
                                        var9_9 = jh_1.a((CleverTapInstanceConfig)var2_2).b();
                                        var15_24 = var1_1;
                                        var3_3 = new kv_0((Context)var1_1, (CleverTapInstanceConfig)var13_22);
                                        var9_9.c("saveConfigtoSharedPrefs", (Callable)var3_3);
                                        com.clevertap.android.sdk.b.h();
                                        return;
                                        catch (ClassNotFoundException v18) {}
                                    }
                                    var53_62 = 1;
lbl-1000:
                                    // 3 sources

                                    {
                                        var14_23 = 0;
                                        var15_24 = null;
                                    }
                                }
                                var19_28 = "Unable to create provider ClassNotFoundException";
                                var9_9 = new StringBuilder((String)var19_28);
                                var9_9.append((String)var12_21);
                                var9_9 = var9_9.toString();
                                var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
                                break block51;
                                catch (IllegalAccessException v19) {}
                            }
                            var53_62 = 1;
lbl-1000:
                            // 3 sources

                            {
                                var14_23 = 0;
                                var15_24 = null;
                            }
                        }
                        var19_28 = "Unable to create provider IllegalAccessException";
                        var9_9 = new StringBuilder((String)var19_28);
                        var9_9.append((String)var12_21);
                        var9_9 = var9_9.toString();
                        var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
                        break block51;
                        catch (InstantiationException v20) {}
                    }
                    var53_62 = 1;
lbl-1000:
                    // 3 sources

                    {
                        var14_23 = 0;
                        var15_24 = null;
                    }
                }
                var19_28 = "Unable to create provider InstantiationException";
                var9_9 = new StringBuilder((String)var19_28);
                var9_9.append((String)var12_21);
                var9_9 = var9_9.toString();
                var10_19.e((String)var17_26 /* !! */ , (String)var9_9);
            }
            if (var15_24 != null) {
                var13_22.add(var15_24);
            }
            var15_24 = var41_50 /* !! */ ;
            var51_60 = 1;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context object, String object2) {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        Object object3 = "Inflated Instance Config: ";
        String string2 = "instance:";
        a a2 = null;
        if (cleverTapInstanceConfig == null) {
            try {
                return com.clevertap.android.sdk.a.g((Context)object);
            }
            catch (Throwable throwable) {
                try {
                    throwable.getCause();
                    com.clevertap.android.sdk.b.l();
                    return null;
                }
                catch (Throwable throwable2) {
                    return null;
                }
            }
        }
        string2 = string2.concat((String)((Object)cleverTapInstanceConfig));
        String string3 = "";
        boolean bl2 = (string2 = gc3_0.g((Context)object, string2, string3)).isEmpty();
        if (!bl2) {
            try {
                cleverTapInstanceConfig = new CleverTapInstanceConfig(string2);
            }
            catch (Throwable throwable) {
                boolean bl3 = false;
                cleverTapInstanceConfig = null;
            }
            {
                ((String)object3).concat(string2);
                com.clevertap.android.sdk.b.j();
                if (cleverTapInstanceConfig == null) return a2;
                return com.clevertap.android.sdk.a.k((Context)object, cleverTapInstanceConfig);
            }
        }
        try {
            a a22 = com.clevertap.android.sdk.a.g((Context)object);
            if (a22 == null) return a2;
            object3 = a22.b;
            object3 = ((H80)object3).a;
            object3 = ((CleverTapInstanceConfig)object3).a;
            boolean bl3 = ((String)object3).equals(cleverTapInstanceConfig);
            if (!bl3) return a2;
            return a22;
        }
        catch (Throwable throwable) {}
        {
            throwable.getCause();
            com.clevertap.android.sdk.b.l();
            return null;
        }
    }

    public static ArrayList c(Context object) {
        boolean bl2;
        ArrayList<Context> arrayList = new ArrayList<Context>();
        HashMap hashMap = e;
        if (hashMap != null && !(bl2 = hashMap.isEmpty())) {
            object = e.values();
            arrayList.addAll((Collection<Context>)object);
        } else if ((object = com.clevertap.android.sdk.a.g(object)) != null) {
            arrayList.add((Context)object);
        }
        return arrayList;
    }

    public static a g(Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        Object object = d;
        if (object != null) {
            return com.clevertap.android.sdk.a.k(context, (CleverTapInstanceConfig)object);
        }
        hg1_1.b(context).getClass();
        object = hg1_1.p;
        CharSequence charSequence = hg1_1.q;
        com.clevertap.android.sdk.b.j();
        String string2 = hg1_1.r;
        com.clevertap.android.sdk.b.j();
        String string3 = hg1_1.s;
        com.clevertap.android.sdk.b.j();
        String string4 = hg1_1.t;
        com.clevertap.android.sdk.b.j();
        String string5 = hg1_1.u;
        if (object != null && charSequence != null) {
            int n3;
            if (string2 == null) {
                com.clevertap.android.sdk.b.h();
            }
            hg1_1 hg1_12 = hg1_1.b(context);
            cleverTapInstanceConfig = new Object();
            String[] stringArray = zb2_0.b();
            cleverTapInstanceConfig.g = stringArray;
            stringArray = q50_0.g;
            cleverTapInstanceConfig.t = stringArray;
            cleverTapInstanceConfig.a = object;
            cleverTapInstanceConfig.c = charSequence;
            cleverTapInstanceConfig.b = string2;
            cleverTapInstanceConfig.p = n3 = 1;
            cleverTapInstanceConfig.h = false;
            cleverTapInstanceConfig.s = n3;
            cleverTapInstanceConfig.l = n3 = a$a.INFO.intValue();
            cleverTapInstanceConfig.q = object = new Object();
            cleverTapInstanceConfig.k = false;
            n3 = (int)(hg1_12.a ? 1 : 0);
            cleverTapInstanceConfig.v = n3;
            n3 = (int)(hg1_12.b ? 1 : 0);
            cleverTapInstanceConfig.m = n3;
            n3 = (int)(hg1_12.e ? 1 : 0);
            cleverTapInstanceConfig.u = n3;
            n3 = (int)(hg1_12.f ? 1 : 0);
            cleverTapInstanceConfig.i = n3;
            cleverTapInstanceConfig.o = object = hg1_12.h;
            cleverTapInstanceConfig.r = object = hg1_12.i;
            n3 = (int)(hg1_12.g ? 1 : 0);
            cleverTapInstanceConfig.n = n3;
            n3 = (int)(hg1_12.j ? 1 : 0);
            cleverTapInstanceConfig.j = n3;
            cleverTapInstanceConfig.w = n3 = hg1_12.n;
            object = hg1_12.m;
            cleverTapInstanceConfig.t = object;
            string2 = "Setting Profile Keys from Manifest: ";
            charSequence = new StringBuilder(string2);
            object = Arrays.toString((Object[])object);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            charSequence = "ON_USER_LOGIN";
            cleverTapInstanceConfig.e((String)charSequence, (String)object);
            if (string3 != null && (n3 = (int)(((String)(object = string3.trim())).isEmpty() ? 1 : 0)) == 0) {
                cleverTapInstanceConfig.d = string3;
            }
            if (string4 != null && (n3 = (int)(((String)(object = string4.trim())).isEmpty() ? 1 : 0)) == 0) {
                cleverTapInstanceConfig.e = string4;
            }
            if (string5 != null && (n3 = (int)(((String)(object = string5.trim())).isEmpty() ? 1 : 0)) == 0) {
                cleverTapInstanceConfig.f = string5;
            }
        } else {
            com.clevertap.android.sdk.b.h();
            cleverTapInstanceConfig = null;
        }
        d = cleverTapInstanceConfig;
        if (cleverTapInstanceConfig != null) {
            return com.clevertap.android.sdk.a.k(context, cleverTapInstanceConfig);
        }
        return null;
    }

    public static a h(Context object, String string2) {
        block3: {
            boolean bl2;
            Object object2;
            block4: {
                object2 = e;
                if (object2 != null) break block4;
                object = com.clevertap.android.sdk.a.a((Context)object, string2);
                break block3;
            }
            object = ((HashMap)object2).keySet().iterator();
            while (bl2 = object.hasNext()) {
                block6: {
                    boolean bl3;
                    Object object3;
                    block5: {
                        object2 = (String)object.next();
                        object3 = e;
                        if ((object2 = (a)((HashMap)object3).get(object2)) == null) continue;
                        if (string2 != null) break block5;
                        object3 = ((a)object2).b.a;
                        bl3 = ((CleverTapInstanceConfig)object3).p;
                        if (bl3) break block6;
                    }
                    if (!(bl3 = ((String)(object3 = ((a)object2).b())).equals(string2))) continue;
                }
                object = object2;
                break block3;
            }
            object = null;
        }
        return object;
    }

    public static m52_0 i(Bundle bundle) {
        Object object;
        boolean bl2;
        String string2 = "wzrk_pn";
        boolean bl3 = bundle.containsKey(string2);
        if (bl3 && (bl2 = bundle.containsKey((String)(object = "nm")))) {
            bl2 = true;
        } else {
            bl2 = false;
            bundle = null;
        }
        object = new m52_0(bl3, bl2);
        return object;
    }

    public static void j(Context object, Bundle bundle) {
        boolean bl2;
        String string2 = "wzrk_acct_id";
        try {
            string2 = bundle.getString(string2);
        }
        catch (Throwable throwable) {
            string2 = null;
        }
        Object object2 = e;
        if (object2 == null) {
            if ((object = com.clevertap.android.sdk.a.a((Context)object, string2)) != null) {
                object = ((a)object).b.f;
                ((we)object).b0(bundle);
            }
            return;
        }
        object = ((HashMap)object2).keySet().iterator();
        while (bl2 = object.hasNext()) {
            block9: {
                boolean bl3;
                Object object3;
                block8: {
                    object2 = (String)object.next();
                    object3 = e;
                    if ((object2 = (a)((HashMap)object3).get(object2)) == null) continue;
                    if (string2 != null) break block8;
                    object3 = ((a)object2).b.a;
                    bl3 = ((CleverTapInstanceConfig)object3).p;
                    if (bl3) break block9;
                }
                if (!(bl3 = ((String)(object3 = ((a)object2).b())).equals(string2))) continue;
            }
            object = ((a)object2).b.f;
            ((we)object).b0(bundle);
            break;
        }
    }

    public static a k(Context object, CleverTapInstanceConfig object2) {
        if (object2 == null) {
            com.clevertap.android.sdk.b.j();
            return null;
        }
        HashMap hashMap = e;
        if (hashMap == null) {
            hashMap = new HashMap();
            e = hashMap;
        }
        hashMap = e;
        String string2 = ((CleverTapInstanceConfig)object2).a;
        if ((hashMap = (a)hashMap.get(string2)) == null) {
            hashMap = new a((Context)object, (CleverTapInstanceConfig)object2);
            e.put(string2, hashMap);
            object = jh_1.a(((a)((Object)hashMap)).b.a).b();
            object2 = new gv_0((a)((Object)hashMap));
            string2 = "recordDeviceIDErrors";
            ((com.clevertap.android.sdk.task.a)object).c(string2, (Callable)object2);
        } else {
            object = ((a)((Object)hashMap)).b.c;
            boolean bl2 = ((mp0_0)object).j();
            if (bl2) {
                object = ((a)((Object)hashMap)).b.a;
                bl2 = ((CleverTapInstanceConfig)object).n;
                if (bl2) {
                    object = yz3_0.a;
                    com.clevertap.android.sdk.b.h();
                }
            }
        }
        com.clevertap.android.sdk.b.k();
        return hashMap;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l(Activity var0) {
        block17: {
            block19: {
                block18: {
                    block16: {
                        var1_2 = "wzrk_from";
                        var2_3 = "wzrk_acct_id";
                        var3_4 = com.clevertap.android.sdk.a.e;
                        var4_5 = null;
                        if (var3_4 == null) {
                            var3_4 = var0.getApplicationContext();
                            com.clevertap.android.sdk.a.a((Context)var3_4, null);
                        }
                        if ((var3_4 = com.clevertap.android.sdk.a.e) == null) {
                            com.clevertap.android.sdk.b.j();
                            return;
                        }
                        var5_6 = true;
                        var6_7 = var0.getIntent();
                        var6_7 = var6_7.getData();
                        if (var6_7 == null) ** GOTO lbl26
                        try {
                            var7_8 = var6_7.toString();
                            var7_8 = Yw3.a((String)var7_8, var5_6);
                            var7_8 = var7_8.getString((String)var2_3);
                            break block16;
                        }
                        catch (Throwable v0) {}
                        catch (Throwable v1) {
                            var6_7 = null;
                        }
lbl26:
                        // 3 sources

                        var7_8 = null;
                    }
                    var8_9 = false;
                    try {
                        var0 = var0.getIntent();
                        var4_5 = var0.getExtras();
                        if (var4_5 == null || (var9_10 = var4_5.isEmpty())) break block17;
                        var9_10 = var4_5.containsKey((String)var1_2);
                        if (!var9_10 || !(var9_10 = (var0 = "CTPushNotificationReceiver").equals(var1_2 = var4_5.get((String)var1_2)))) break block18;
                        break block19;
                    }
                    catch (Throwable v2) {
                        break block17;
                    }
                }
                var5_6 = false;
                var3_4 = null;
            }
            if (!var5_6) ** GOTO lbl47
            try {
                var4_5.toString();
                com.clevertap.android.sdk.b.j();
lbl47:
                // 2 sources

                if (var9_10 = var4_5.containsKey((String)var2_3)) {
                    var0 = var4_5.get((String)var2_3);
                    var7_8 = var0 = (String)var0;
                }
            }
            catch (Throwable v3) {}
            var8_9 = var5_6;
        }
        if (var8_9 && var6_7 == null) {
            return;
        }
        try {
            var0 = com.clevertap.android.sdk.a.e;
            var0 = var0.keySet();
            var0 = var0.iterator();
            while (var10_11 = var0.hasNext()) {
                var1_2 = var0.next();
                var2_3 = com.clevertap.android.sdk.a.e;
                var1_2 = var2_3.get(var1_2);
                if ((var1_2 = (a)var1_2) == null) continue;
                var1_2 = var1_2.b;
                var1_2 = var1_2.e;
                var1_2.d((Uri)var6_7, var4_5, (String)var7_8);
            }
            return;
        }
        catch (Throwable var0_1) {
            var0_1.getLocalizedMessage();
            com.clevertap.android.sdk.b.j();
        }
    }

    public static void m(Activity activity) {
        Object object = e;
        int n3 = 0;
        Object object2 = null;
        if (object == null) {
            object = activity.getApplicationContext();
            com.clevertap.android.sdk.a.a((Context)object, null);
        }
        int n4 = 1;
        E80.u = n4;
        Object object3 = e;
        if (object3 == null) {
            com.clevertap.android.sdk.b.j();
            return;
        }
        object3 = E80.e();
        object3 = object3 != null ? object3.getLocalClassName() : null;
        if (activity == null) {
            E80.v = null;
        } else {
            String string2;
            object2 = activity.getLocalClassName();
            n3 = (int)(((String)object2).contains(string2 = "InAppNotificationActivity") ? 1 : 0);
            if (n3 == 0) {
                object2 = new WeakReference(activity);
                E80.v = object2;
            }
        }
        if (object3 == null || (n3 = (int)(((String)object3).equals(object2 = activity.getLocalClassName()) ? 1 : 0)) == 0) {
            E80.w = n3 = E80.w + n4;
        }
        if ((n4 = E80.x) <= 0) {
            object = yz3_0.a;
            long l2 = System.currentTimeMillis();
            long l3 = 1000L;
            E80.x = n3 = (int)(l2 /= l3);
        }
        object = e.keySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (String)object.next();
            object3 = e;
            if ((object2 = (a)((HashMap)object3).get(object2)) == null) continue;
            object2 = ((a)object2).b;
            object2 = ((H80)object2).e;
            try {
                ((k3_0)object2).c(activity);
            }
            catch (Throwable throwable) {
                throwable.getLocalizedMessage();
                com.clevertap.android.sdk.b.j();
            }
        }
    }

    public final String b() {
        return this.b.a.a;
    }

    public final void d(CTInboxMessage cTInboxMessage) {
        com.clevertap.android.sdk.task.a a2 = jh_1.a(this.b.a).b();
        hv_1 hv_12 = new hv_1(this, cTInboxMessage);
        a2.c("handleMessageDidShow", hv_12);
    }

    public final void e(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap hashMap) {
        boolean bl2;
        we we2 = this.b.f;
        boolean bl3 = true;
        we2.Z(bl3, cTInboxMessage, bundle);
        com.clevertap.android.sdk.b.j();
        if (hashMap != null && !(bl2 = hashMap.isEmpty())) {
            com.clevertap.android.sdk.b.j();
        }
    }

    public final b f() {
        return this.b.a.b();
    }

    public final void n(HashMap hashMap) {
        By1 by1 = this.b.n;
        Object object = by1.f;
        boolean bl2 = ((CleverTapInstanceConfig)object).n;
        if (bl2) {
            com.clevertap.android.sdk.b.h();
        }
        object = jh_1.a((CleverTapInstanceConfig)object).b();
        Ay1 ay1 = new Ay1(by1, hashMap);
        ((com.clevertap.android.sdk.task.a)object).c("_onUserLogin", ay1);
    }

    /*
     * Exception decompiling
     */
    public final void o(HashMap var1_1, ArrayList var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public final void p(String var1_1, Map var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void q(HashMap hashMap) {
        this.b.f.d0(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void r(ec1_1 object, Context context, Bundle bundle) {
        Throwable throwable3;
        CleverTapInstanceConfig cleverTapInstanceConfig;
        block7: {
            Object object2 = "rendering push on caller thread with id = ";
            Object object3 = this.b;
            cleverTapInstanceConfig = ((H80)object3).a;
            try {
                object3 = ((H80)object3).p;
                object3 = ((hC2)object3).l;
                // MONITORENTER : object3
            }
            catch (Throwable throwable2) {}
            try {
                b b2 = cleverTapInstanceConfig.b();
                String string2 = cleverTapInstanceConfig.a;
                StringBuilder stringBuilder = new StringBuilder((String)object2);
                object2 = Thread.currentThread();
                long l2 = ((Thread)object2).getId();
                stringBuilder.append(l2);
                object2 = stringBuilder.toString();
                b2.b(string2, (String)object2);
                object2 = this.b;
                object2 = ((H80)object2).p;
                ((hC2)object2).i = object;
                object = "notificationId";
                boolean bl2 = bundle.containsKey((String)object);
                if (bl2) {
                    object = this.b;
                    object = ((H80)object).p;
                    object2 = "notificationId";
                    int n3 = bundle.getInt((String)object2);
                    ((hC2)object).b(context, bundle, n3);
                    return;
                }
            }
            catch (Throwable throwable3) {
                break block7;
            }
            object = this.b;
            object = ((H80)object).p;
            int n4 = -1000;
            ((hC2)object).b(context, bundle, n4);
            // MONITOREXIT : object3
            return;
        }
        // MONITOREXIT : object3
        throw throwable3;
        object = cleverTapInstanceConfig.b();
        object.getClass();
        com.clevertap.android.sdk.b.g();
    }
}

