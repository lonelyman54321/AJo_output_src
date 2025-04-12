/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.AccessToken;
import com.facebook.b;
import com.facebook.b$d;
import com.facebook.e;
import com.facebook.e$a;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class D1
implements e$a {
    public final /* synthetic */ b$d a;
    public final /* synthetic */ AccessToken b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ b g;

    public /* synthetic */ D1(b$d b$d, AccessToken accessToken, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, b b2) {
        this.a = b$d;
        this.b = accessToken;
        this.c = atomicBoolean;
        this.d = hashSet;
        this.e = hashSet2;
        this.f = hashSet3;
        this.g = b2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(e var1_1) {
        block17: {
            block16: {
                block18: {
                    var2_2 = this.b;
                    var3_4 = this.a;
                    Intrinsics.checkNotNullParameter(var3_4, "$refreshResult");
                    var4_5 /* !! */  = this.c;
                    Intrinsics.checkNotNullParameter(var4_5 /* !! */ , "$permissionsCallSucceeded");
                    var5_6 = this.d;
                    Intrinsics.checkNotNullParameter(var5_6, "$permissions");
                    var6_7 = this.e;
                    Intrinsics.checkNotNullParameter(var6_7, "$declinedPermissions");
                    var7_8 = this.f;
                    Intrinsics.checkNotNullParameter(var7_8, "$expiredPermissions");
                    var8_9 = this.g;
                    Intrinsics.checkNotNullParameter(var8_9, "this$0");
                    var9_10 = var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "it");
                    var10_11 = var3_4.a;
                    var11_12 = var3_4.b;
                    var12_13 = var3_4.d;
                    var13_14 = var3_4.e;
                    var14_15 = 0;
                    try {
                        var15_16 = com.facebook.b.f;
                        var16_17 = var15_16.a();
                        var16_17 = var16_17.c;
                        if (var16_17 == null) break block16;
                        var16_17 = var15_16.a();
                        var16_17 = var16_17.c;
                        if (var16_17 != null) {
                            var16_17 = var16_17.i;
                        } else {
                            var17_18 = 0;
                            var16_17 = null;
                        }
                        var18_19 = var2_2.i;
                        if (var16_17 != var18_19) {
                            break block16;
                        }
                    }
                    catch (Throwable var2_3) {
                        break block17;
                    }
                    {
                        var17_18 = var4_5 /* !! */ .get();
                        if (var17_18 != 0 || var10_11 != null || var11_12 != 0) ** GOTO lbl-1000
                        var2_2 = var8_9.d;
                        var2_2.set(false);
                        return;
                    }
lbl-1000:
                    // 1 sources

                    {
                        var9_10 = var2_2.a;
                        var17_18 = var3_4.b;
                        var19_20 = 1000L;
                        if (var17_18 == 0) break block18;
                        var21_21 = var3_4.b;
                        var16_17 = var15_16;
                    }
                    var22_23 = (long)var21_21 * var19_20;
                    var9_10 = new Date(var22_23);
lbl52:
                    // 2 sources

                    while (true) {
                        var24_25 = var5_6;
                        var25_26 = var6_7;
lbl55:
                        // 2 sources

                        while (true) {
                            var26_27 = var9_10;
                            ** GOTO lbl69
                            break;
                        }
                        break;
                    }
                }
                var16_17 = var15_16;
                ** while ((var14_15 = var3_4.c) == 0)
lbl61:
                // 1 sources

                var9_10 = new Date();
                var22_24 = var9_10.getTime();
                var21_22 = var3_4.c;
                var24_25 = var5_6;
                var25_26 = var6_7;
                var27_28 = (long)var21_22 * var19_20 + var22_24;
                {
                    var9_10 = new Date(var27_28);
                    ** continue;
lbl69:
                    // 1 sources

                    if (var10_11 == null) {
                        var10_11 = var2_2.e;
                    }
                    var29_29 = var10_11;
                    var10_11 = var2_2.h;
                    var5_6 = var2_2.i;
                    var30_30 = var4_5 /* !! */ .get();
                    if (!var30_30) {
                        var6_7 = var2_2.b;
                        var24_25 = var6_7;
                    }
                    var31_31 /* !! */  = var24_25;
                    var31_31 /* !! */  = var24_25;
                    var30_30 = var4_5 /* !! */ .get();
                    var6_7 = var30_30 != false ? var25_26 : var2_2.c;
                    var32_32 /* !! */  = var6_7;
                    var32_32 /* !! */  = (Collection)var6_7;
                    var33_33 = var4_5 /* !! */ .get();
                    if (!var33_33) {
                        var7_8 = var2_2.d;
                    }
                    var34_34 /* !! */  = var7_8;
                    var34_34 /* !! */  = var7_8;
                    var4_5 /* !! */  = var2_2.f;
                    var35_35 = new Date();
                    if (var12_13 == null) ** GOTO lbl98
                    var36_36 = var12_13 * var19_20;
                }
                {
                    block19: {
                        block20: {
                            var6_7 = new Date(var36_36);
lbl94:
                            // 2 sources

                            while (true) {
                                var38_37 = var6_7;
                                if (var13_14 != null) break block19;
                                break block20;
                                break;
                            }
lbl98:
                            // 1 sources

                            var6_7 = var2_2.j;
                            ** continue;
                        }
                        var13_14 = var2_2.k;
                    }
                    var3_4 = new AccessToken(var29_29, var10_11, (String)var5_6, var31_31 /* !! */ , var32_32 /* !! */ , var34_34 /* !! */ , (F1)var4_5 /* !! */ , (Date)var26_27, var35_35, (Date)var38_37, var13_14);
                    var2_2 = var16_17.a();
                    var39_38 = true;
                    var2_2.c((AccessToken)var3_4, var39_38);
                }
            }
            var2_2 = var8_9.d;
            var39_38 = false;
            var10_11 = null;
            var2_2.set(false);
            return;
        }
        var8_9.d.set(false);
        throw var2_3;
    }
}

