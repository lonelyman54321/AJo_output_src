/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Jv3 {
    public final hx0_2 a;
    public final x00_0 b;
    public final ks1_1 c;
    public final w00_0[] d;
    public final Object[] e;

    public Jv3(xk2$b$a object) {
        Intrinsics.checkNotNullParameter(object, "send");
        this.a = object;
        this.b = object = y00_0.b();
        this.c = object = ls1_2.a();
        int n3 = 2;
        Object[] objectArray = new w00_0[n3];
        int n4 = 0;
        Object object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            x00_0 x00_02 = y00_0.b();
            objectArray[i3] = x00_02;
        }
        this.d = objectArray;
        objectArray = new Object[n3];
        while (n4 < n3) {
            objectArray[n4] = object2 = LS0.a;
            ++n4;
        }
        this.e = objectArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(int var1_1, Object var2_2, f80_0 var3_3) {
        block21: {
            block20: {
                block25: {
                    block22: {
                        block23: {
                            block24: {
                                var4_4 = this;
                                var5_5 = var1_1;
                                var6_6 /* !! */  = var3_3;
                                var7_7 = 1;
                                var8_8 = var3_3 instanceof Jv3$a;
                                if (!var8_8) ** GOTO lbl-1000
                                var9_9 = var3_3;
                                var9_9 = (Jv3$a)var3_3;
                                var10_10 = var9_9.g;
                                var11_11 = -1 << -1;
                                var12_12 = var10_10 & var11_11;
                                if (var12_12 != 0) {
                                    var9_9.g = var10_10 -= var11_11;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var9_9 = new Jv3$a(var4_4, (f80_0)var6_6 /* !! */ );
                                }
                                var6_6 /* !! */  = var9_9.e;
                                var13_13 = j90_0.COROUTINE_SUSPENDED;
                                var11_11 = var9_9.g;
                                var12_12 = 3;
                                var14_14 = 2;
                                if (var11_11 == 0) break block22;
                                if (var11_11 == var7_7) break block23;
                                if (var11_11 == var14_14) break block24;
                                if (var11_11 != var12_12) {
                                    var15_17 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var15_17;
                                }
                                var16_20 = var15_15 = var9_9.b;
                                var16_20 = (hs1_2)var15_15;
                                var15_15 = var9_9.a;
                                try {
                                    vl2_2.b(var6_6 /* !! */ );
lbl32:
                                    // 2 sources

                                    while (true) {
                                        var15_15 = var15_15.b;
                                        var6_6 /* !! */  = Unit.a;
                                        var15_15.l0(var6_6 /* !! */ );
lbl37:
                                        // 2 sources

                                        while (true) {
                                            var15_15 = Unit.a;
                                            var16_20.b(null);
                                            return Unit.a;
                                        }
                                        break;
                                    }
                                }
                                catch (Throwable var15_16) {}
                                break block21;
                            }
                            var5_5 = var9_9.d;
                            var17_21 = var9_9.c;
                            var18_22 = var9_9.b;
                            var19_23 = var9_9.a;
                            vl2_2.b(var6_6 /* !! */ );
lbl49:
                            // 2 sources

                            while (true) {
                                var20_24 = var5_5;
                                var15_15 = var19_23;
                                ** try [egrp 1[TRYBLOCK] [1 : 454->486)] { 
lbl53:
                                // 1 sources

                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        var5_5 = var9_9.d;
                        var17_21 = var9_9.b;
                        var19_23 = var9_9.a;
                        vl2_2.b(var6_6 /* !! */ );
                        break block25;
                    }
                    vl2_2.b(var6_6 /* !! */ );
                    var6_6 /* !! */  = var4_4.d;
                    var17_21 = var6_6 /* !! */ [var5_5];
                    var11_11 = (int)var17_21.n();
                    if (var11_11 != 0) {
                        var9_9.a = var4_4;
                        var17_21 = var2_2;
                        var9_9.b = var2_2;
                        var9_9.d = var5_5;
                        var9_9.g = var7_7;
                        var6_6 /* !! */  = var4_4.b.D(var9_9);
                        if (var6_6 /* !! */  == var13_13) {
                            return var13_13;
                        }
                    } else {
                        var17_21 = var2_2;
                        var6_6 /* !! */  = var6_6 /* !! */ [var5_5];
                        var19_23 = Unit.a;
                        var6_6 /* !! */ .M(var19_23);
                    }
                    var19_23 = var4_4;
                }
                var6_6 /* !! */  = var19_23.c;
                var9_9.a = var19_23;
                var9_9.b = var17_21;
                var9_9.c = var6_6 /* !! */ ;
                var9_9.d = var5_5;
                var9_9.g = var14_14;
                var18_22 = var6_6 /* !! */ .d(var9_9, null);
                if (var18_22 == var13_13) {
                    return var13_13;
                }
                var18_22 = var17_21;
                var17_21 = var6_6 /* !! */ ;
                ** while (true)
lbl-1000:
                // 1 sources

                {
                    var19_23 = var19_23.e;
                    var21_25 = var19_23.length;
                    var22_26 = 0;
                    while (true) {
                        block26: {
                            var23_27 = LS0.a;
                            if (var22_26 >= var21_25) break block20;
                            var24_28 = var19_23[var22_26];
                            if (var24_28 != var23_27) break block26;
                            var21_25 = 1;
                            ** GOTO lbl-1000
                        }
                        var22_26 += var7_7;
                    }
                }
lbl107:
                // 1 sources

                catch (Throwable var15_18) {
                    var16_20 = var17_21;
                    break block21;
                }
            }
            var21_25 = 0;
            var25_29 = null;
lbl-1000:
            // 2 sources

            {
                var19_23[var20_24] = var18_22;
                var14_14 = var19_23.length;
                for (var22_26 = 0; var22_26 < var14_14; var22_26 += var7_7) {
                    var24_28 = var19_23[var22_26];
                    if (var24_28 != var23_27) continue;
                    var16_20 = var17_21;
                    ** continue;
                }
                var6_6 /* !! */  = var21_25 != 0 ? uZ.INITIAL : (var20_24 == 0 ? uZ.RECEIVER : uZ.OTHER);
            }
            {
                var18_22 = var15_15.a;
                var25_29 = var19_23[0];
                var16_20 = var19_23[var7_7];
                var9_9.a = var15_15;
                var9_9.b = var17_21;
                var9_9.c = null;
                var9_9.g = var12_12;
                if ((var6_6 /* !! */  = var18_22.invoke(var25_29, var16_20, var6_6 /* !! */ , var9_9)) == var13_13) {
                    return var13_13;
                }
                var16_20 = var17_21;
                ** continue;
            }
        }
        var16_20.b(null);
        throw var15_19;
    }
}

