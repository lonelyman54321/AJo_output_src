/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Tv1
 */
public final class tv1_0
implements n60_0,
PX2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public MX2 a(p63 var1_1) {
        block25: {
            block23: {
                block27: {
                    block26: {
                        block24: {
                            var2_2 /* !! */  = var1_1.d;
                            if (var2_2 /* !! */  != null) break block24;
                            var2_2 /* !! */  = PX2$a$b.a;
                            var1_1 = SX2.a((p63)var1_1, (DA)var2_2 /* !! */ );
                            break block25;
                        }
                        var3_3 /* !! */  = var1_1.e;
                        var4_4 = var1_1.a;
                        var5_5 = var2_2 /* !! */ .b;
                        var6_6 = var2_2 /* !! */ .a;
                        if (var4_4 != 0) {
                            var3_3 /* !! */  = SX2.b((p63)var1_1, (KX2)var3_3 /* !! */ , (MX2$a)var6_6);
                            var7_7 = var5_5;
                            var5_5 = var6_6;
                            var6_6 = var3_3 /* !! */ ;
                        } else {
                            var7_7 = var3_3 /* !! */  = SX2.b((p63)var1_1, (KX2)var3_3 /* !! */ , (MX2$a)var5_5);
                        }
                        var8_8 = Intrinsics.areEqual(var3_3 /* !! */ , var5_5);
                        if (var8_8 != 0) break block23;
                        var2_2 /* !! */  = var1_1.b();
                        if (var2_2 /* !! */  != (var3_3 /* !! */  = le0_0.CROSSED) && ((var2_2 /* !! */  = var1_1.b()) != (var3_3 /* !! */  = le0_0.COLLAPSED) || (var9_9 = var6_6.b) <= (var8_8 = var7_7.b))) {
                            var9_9 = 0;
                            var2_2 /* !! */  = null;
                        } else {
                            var9_9 = 1;
                        }
                        var3_3 /* !! */  = new MX2((MX2$a)var6_6, (MX2$a)var7_7, (boolean)var9_9);
                        var9_9 = 0;
                        var2_2 /* !! */  = null;
                        var4_4 = 1;
                        var5_5 = var1_1.e;
                        var6_6 = var3_3 /* !! */ .a;
                        var10_10 = var6_6.c;
                        var12_11 = var3_3 /* !! */ .b;
                        var13_12 = var12_11.c;
                        var15_13 = var10_10 == var13_12 ? 0 : (var10_10 < var13_12 ? -1 : 1);
                        if (var15_13 != false) break block26;
                        var16_14 = var6_6.b;
                        var17_15 = var12_11.b;
                        if (var16_14 != var17_15) ** GOTO lbl-1000
                        var16_14 = 1;
                        break block27;
                    }
                    var17_15 = var3_3 /* !! */ .c;
                    var18_16 = var17_15 != 0 ? var6_6 : var12_11;
                    var19_17 = var18_16.b;
                    if (var19_17 != 0) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var16_14 = 0;
                            var6_6 = null;
                            break;
                        }
                    } else {
                        if (var17_15 != 0) {
                            var6_6 = var12_11;
                        }
                        if ((var17_15 = (var20_18 = var5_5.f.a.a.a).length()) != (var16_14 = var6_6.b)) ** continue;
                        var6_6 = new Ref$BooleanRef();
                        var6_6.element = var4_4;
                        var20_18 = new jy2_2((Ref$BooleanRef)var6_6);
                        var16_14 = (int)var6_6.element;
                    }
                }
                if (var16_14 == 0) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var2_2 /* !! */  = var3_3 /* !! */ ;
                        break block23;
                        break;
                    }
                }
                var6_6 = var5_5.f.a.a.a;
                var20_18 = var1_1.d;
                if (var20_18 == null) ** GOTO lbl-1000
                var16_14 = var6_6.length();
                if (var16_14 == 0) {
                    var16_14 = 1;
                } else {
                    var16_14 = 0;
                    var6_6 = null;
                }
                if (var16_14 == 0) ** break;
                ** while (true)
                var6_6 = var5_5.f.a.a.a;
                var19_17 = var6_6.length();
                var21_19 = 2;
                var22_20 = var1_1.a;
                var23_21 = var5_5.c;
                if (var23_21 == 0) {
                    var16_14 = ie3_1.b(0, (String)var6_6);
                    if (var22_20 != 0) {
                        var1_1 = SX2.d(var3_3 /* !! */ .a, (KX2)var5_5, var16_14);
                        var1_1 = MX2.a((MX2)var3_3 /* !! */ , (MX2$a)var1_1, null, (boolean)var4_4, var21_19);
                    } else {
                        var1_1 = SX2.d(var3_3 /* !! */ .b, (KX2)var5_5, var16_14);
                        var1_1 = MX2.a((MX2)var3_3 /* !! */ , null, (MX2$a)var1_1, false, var4_4);
                    }
                } else if (var23_21 == var19_17) {
                    var16_14 = ie3_1.c(var19_17, (String)var6_6);
                    if (var22_20 != 0) {
                        var1_1 = SX2.d(var3_3 /* !! */ .a, (KX2)var5_5, var16_14);
                        var1_1 = MX2.a((MX2)var3_3 /* !! */ , (MX2$a)var1_1, null, false, var21_19);
                    } else {
                        var1_1 = SX2.d(var3_3 /* !! */ .b, (KX2)var5_5, var16_14);
                        var1_1 = MX2.a((MX2)var3_3 /* !! */ , null, (MX2$a)var1_1, (boolean)var4_4, var4_4);
                    }
                } else {
                    if (var20_18 != null && (var17_15 = (int)var20_18.c) == var4_4) {
                        var9_9 = 1;
                    }
                    var16_14 = (var17_15 = var22_20 ^ var9_9) != 0 ? ie3_1.c(var23_21, (String)var6_6) : ie3_1.b(var23_21, (String)var6_6);
                    if (var22_20 != 0) {
                        var1_1 = SX2.d(var3_3 /* !! */ .a, (KX2)var5_5, var16_14);
                        var1_1 = MX2.a((MX2)var3_3 /* !! */ , (MX2$a)var1_1, null, (boolean)var9_9, var21_19);
                    } else {
                        var1_1 = SX2.d(var3_3 /* !! */ .b, (KX2)var5_5, var16_14);
                        var1_1 = MX2.a((MX2)var3_3 /* !! */ , null, (MX2$a)var1_1, (boolean)var9_9, var4_4);
                    }
                }
                var2_2 /* !! */  = var1_1;
            }
            var1_1 = var2_2 /* !! */ ;
        }
        return var1_1;
    }

    public void accept(Object object) {
        ((ExecutorService)object).shutdown();
    }
}

