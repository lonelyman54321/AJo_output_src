/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class qZ2 {
    public final zj3_0 a;
    public final gx0_2 b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public final AR1 f;
    public Qv1 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;

    public qZ2(zj3_0 object, tZ2 tZ22) {
        Intrinsics.checkNotNullParameter(object, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(tZ22, "generator");
        this.a = object;
        this.b = tZ22;
        this.c = object;
        super();
        this.f = object;
    }

    public static Wq3 d(Wq3 wq3) {
        int n3;
        int n4;
        int n7 = 1;
        int n8 = 2;
        int[] nArray = wq3.a;
        Object object = wq3.b;
        Object object2 = CollectionsKt.L((List)object);
        Object object3 = CollectionsKt.S((List)object);
        Object object4 = new Object[n8];
        object4[0] = object2;
        object4[n7] = object3;
        object2 = xx_2.i((Object[])object4);
        object3 = wq3.d;
        if (object3 != null) {
            object4 = (Number)CollectionsKt.L((List)object3);
            n4 = ((Number)object4).intValue();
        } else {
            n4 = 0;
            object4 = null;
        }
        object4 = n4;
        if (object3 != null) {
            object = (Number)CollectionsKt.S((List)object3);
            n3 = ((Number)object).intValue();
        } else {
            n3 = xx_2.h((List)object);
        }
        object = n3;
        Object[] objectArray = new Integer[n8];
        objectArray[0] = object4;
        objectArray[n7] = object;
        List list = xx_2.i(objectArray);
        int n10 = wq3.c;
        Wq3 wq32 = new Wq3(nArray, (List)object2, n10, list);
        return wq32;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(rk2_0 var1_1, f80_0 var2_2) {
        block34: {
            block29: {
                block25: {
                    block31: {
                        block26: {
                            block33: {
                                block32: {
                                    block30: {
                                        block28: {
                                            block27: {
                                                block21: {
                                                    block22: {
                                                        block23: {
                                                            block24: {
                                                                var3_3 = var2_2 instanceof qZ2$b;
                                                                if (var3_3 == 0) ** GOTO lbl-1000
                                                                var4_4 = var2_2;
                                                                var4_4 = (qZ2$b)var2_2;
                                                                var5_5 = var4_4.d;
                                                                var6_6 = -1 << -1;
                                                                var7_7 = var5_5 & var6_6;
                                                                if (var7_7 != 0) {
                                                                    var4_4.d = var5_5 -= var6_6;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var4_4 = new qZ2$b(this, (f80_0)var2_2);
                                                                }
                                                                var2_2 = var4_4.b;
                                                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                                                var6_6 = var4_4.d;
                                                                var7_7 = 3;
                                                                var9_9 = 2;
                                                                var10_10 = 1;
                                                                if (var6_6 == 0) break block21;
                                                                if (var6_6 == var10_10) break block22;
                                                                if (var6_6 == var9_9) break block23;
                                                                if (var6_6 != var7_7) break block24;
                                                                var1_1 /* !! */  = var4_4.a;
                                                                vl2_2.b(var2_2);
                                                                break block25;
                                                            }
                                                            var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            throw var1_1 /* !! */ ;
                                                        }
                                                        var1_1 /* !! */  = var4_4.a;
                                                        vl2_2.b(var2_2);
                                                        break block26;
                                                    }
                                                    var1_1 /* !! */  = var4_4.a;
                                                    vl2_2.b(var2_2);
                                                    break block27;
                                                }
                                                vl2_2.b(var2_2);
                                                var11_11 = var1_1 /* !! */  instanceof rk2$b;
                                                if (!var11_11) break block28;
                                                var1_1 /* !! */  = (rk2$b)var1_1 /* !! */ ;
                                                var4_4.a = this;
                                                var4_4.d = var10_10;
                                                var2_2 = this.b((rk2$b)var1_1 /* !! */ , (f80_0)var4_4);
                                                if (var2_2 == var8_8) {
                                                    return var8_8;
                                                }
                                                var1_1 /* !! */  = this;
                                            }
                                            var2_2 = (rk2_0)var2_2;
                                            break block29;
                                        }
                                        var11_11 = var1_1 /* !! */  instanceof rk2$a;
                                        var12_12 = this.f;
                                        if (!var11_11) break block30;
                                        var2_2 = var1_1 /* !! */ ;
                                        var2_2 = (rk2$a)var1_1 /* !! */ ;
                                        Intrinsics.checkNotNullParameter(var2_2, "event");
                                        var1_1 /* !! */  = var2_2.a;
                                        var4_4 = Ov1$c.c;
                                        var12_12.c((Rv1)var1_1 /* !! */ , (Ov1)var4_4);
                                        var1_1 /* !! */  = Rv1.PREPEND;
                                        var3_3 = 0;
                                        var4_4 = null;
                                        var5_5 = var2_2.d;
                                        var12_12 = var2_2.a;
                                        if (var12_12 == var1_1 /* !! */ ) {
                                            this.h = var5_5;
                                            this.k = false;
                                        } else {
                                            var13_13 = Rv1.APPEND;
                                            if (var12_12 == var13_13) {
                                                this.i = var5_5;
                                                this.j = false;
                                            }
                                        }
                                        var8_8 = this.c;
                                        var7_7 = (int)var8_8.isEmpty();
                                        if (var7_7 != 0) {
                                            if (var12_12 == var1_1 /* !! */ ) {
                                                this.e = false;
                                            } else {
                                                this.d = false;
                                            }
                                        }
                                        var3_3 = var2_2.b;
                                        var6_6 = var2_2.c;
                                        var1_1 /* !! */  = new c(var3_3, var6_6, var10_10);
                                        var4_4 = new rZ2((IntRange)var1_1 /* !! */ );
                                        cx_2.w((List)var8_8, (Function1)var4_4);
                                        var1_1 /* !! */  = this;
                                        break block29;
                                    }
                                    var11_11 = var1_1 /* !! */  instanceof rk2$c;
                                    if (!var11_11) break block31;
                                    var1_1 /* !! */  = (rk2$c)var1_1 /* !! */ ;
                                    var4_4.a = this;
                                    var4_4.d = var9_9;
                                    var2_2 = this.g;
                                    var13_14 = var12_12.d();
                                    var14_15 = var1_1 /* !! */ .a;
                                    var7_7 = (int)Intrinsics.areEqual(var13_14, var14_15);
                                    var14_15 = "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>";
                                    var15_16 = var1_1 /* !! */ .b;
                                    if (var7_7 != 0 && (var7_7 = (int)Intrinsics.areEqual(var2_2, var15_16)) != 0) {
                                        Intrinsics.checkNotNull(var1_1 /* !! */ , (String)var14_15);
lbl101:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var16_17 = var1_1 /* !! */ .a;
                                    var12_12.b(var16_17);
                                    this.g = var15_16;
                                    var12_12 = "sourceLoadStates";
                                    var13_14 = "pages";
                                    var10_10 = 0;
                                    var17_18 /* !! */  = null;
                                    if (var15_16 == null) break block32;
                                    var18_19 /* !! */  = var15_16.b;
                                    var19_20 = var18_19 /* !! */ .a;
                                    if (!var19_20) break block32;
                                    if (var2_2 != null) {
                                        var20_21 = var2_2.b;
                                    } else {
                                        var19_20 = false;
                                        var20_21 = null;
                                    }
                                    var21_22 = Intrinsics.areEqual(var20_21, var18_19 /* !! */ );
                                    if (var21_22) break block32;
                                    var1_1 /* !! */  = rk2$b.g;
                                    var20_21 = mz0_2.a;
                                    var22_23 = this.h;
                                    Intrinsics.checkNotNullParameter(var20_21, (String)var13_14);
                                    Intrinsics.checkNotNullParameter(var16_17, (String)var12_12);
                                    var18_19 /* !! */  = Rv1.PREPEND;
                                    var23_25 = -1;
                                    var17_18 /* !! */  = var1_1 /* !! */ ;
                                    var1_1 /* !! */  = new rk2$b((Rv1)var18_19 /* !! */ , (List)var20_21, var22_23, var23_25, var16_17, var15_16);
                                    var1_1 /* !! */  = this.b((rk2$b)var1_1 /* !! */ , (f80_0)var4_4);
                                    ** GOTO lbl101
                                }
                                if (var15_16 == null) break block33;
                                var18_19 /* !! */  = var15_16.c;
                                var19_20 = var18_19 /* !! */ .a;
                                if (!var19_20) break block33;
                                if (var2_2 != null) {
                                    var17_18 /* !! */  = var2_2.c;
                                }
                                if (var11_11 = Intrinsics.areEqual(var17_18 /* !! */ , var18_19 /* !! */ )) break block33;
                                var1_1 /* !! */  = rk2$b.g;
                                var20_21 = mz0_2.a;
                                var23_26 = this.i;
                                Intrinsics.checkNotNullParameter(var20_21, (String)var13_14);
                                Intrinsics.checkNotNullParameter(var16_17, (String)var12_12);
                                var18_19 /* !! */  = Rv1.APPEND;
                                var22_24 = -1;
                                var17_18 /* !! */  = var1_1 /* !! */ ;
                                var1_1 /* !! */  = new rk2$b((Rv1)var18_19 /* !! */ , (List)var20_21, var22_24, var23_26, var16_17, var15_16);
                                var1_1 /* !! */  = this.b((rk2$b)var1_1 /* !! */ , (f80_0)var4_4);
                                ** GOTO lbl101
                            }
                            Intrinsics.checkNotNull(var1_1 /* !! */ , (String)var14_15);
                            ** while (true)
                            var2_2 = var1_1 /* !! */ ;
                            if (var1_1 /* !! */  == var8_8) {
                                return var8_8;
                            }
                            var1_1 /* !! */  = this;
                        }
                        var2_2 = (rk2_0)var2_2;
                        break block29;
                    }
                    var11_11 = var1_1 /* !! */  instanceof rk2$d;
                    if (!var11_11) break block34;
                    var1_1 /* !! */  = (rk2$d)var1_1 /* !! */ ;
                    var4_4.a = this;
                    var4_4.d = var7_7;
                    var2_2 = this.c((rk2$d)var1_1 /* !! */ , (f80_0)var4_4);
                    if (var2_2 == var8_8) {
                        return var8_8;
                    }
                    var1_1 /* !! */  = this;
                }
                var2_2 = (rk2_0)var2_2;
            }
            var3_3 = var1_1 /* !! */ .d;
            var8_8 = var1_1 /* !! */ .c;
            if (var3_3 != 0 && (var3_3 = var8_8.isEmpty()) == 0) {
                var2_2 = "deferred endTerm, page stash should be empty".toString();
                var1_1 /* !! */  = new IllegalStateException((String)var2_2);
                throw var1_1 /* !! */ ;
            }
            var24_27 = var1_1 /* !! */ .e;
            if (var24_27 && !(var24_27 = var8_8.isEmpty())) {
                var2_2 = "deferred startTerm, page stash should be empty".toString();
                var1_1 /* !! */  = new IllegalStateException((String)var2_2);
                throw var1_1 /* !! */ ;
            }
            return var2_2;
        }
        var1_1 /* !! */  = new NoWhenBranchMatchedException();
        throw var1_1 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(rk2$b var1_1, f80_0 var2_2) {
        block105: {
            block93: {
                block104: {
                    block98: {
                        block99: {
                            block103: {
                                block89: {
                                    block100: {
                                        block94: {
                                            block102: {
                                                block91: {
                                                    block92: {
                                                        block101: {
                                                            block90: {
                                                                block95: {
                                                                    block96: {
                                                                        block97: {
                                                                            var3_3 /* !! */  = this;
                                                                            var4_4 /* !! */  = var1_1;
                                                                            var5_5 /* !! */  = var2_2;
                                                                            var6_6 = var2_2 instanceof qZ2$c;
                                                                            if (!var6_6) ** GOTO lbl-1000
                                                                            var7_7 /* !! */  = var2_2;
                                                                            var7_7 /* !! */  = (qZ2$c)var2_2;
                                                                            var8_8 = var7_7 /* !! */ .q;
                                                                            var9_9 = -1 << -1;
                                                                            var10_10 /* !! */  = var8_8 & var9_9;
                                                                            if (var10_10 /* !! */  != 0) {
                                                                                var7_7 /* !! */ .q = var8_8 -= var9_9;
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                var7_7 /* !! */  = new qZ2$c((qZ2)var3_3 /* !! */ , (f80_0)var5_5 /* !! */ );
                                                                            }
                                                                            var5_5 /* !! */  = var7_7 /* !! */ .o;
                                                                            var11_11 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                                            var9_9 = var7_7 /* !! */ .q;
                                                                            var12_12 = "<this>";
                                                                            switch (var9_9) {
                                                                                default: {
                                                                                    var4_4 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    throw var4_4 /* !! */ ;
                                                                                }
                                                                                case 10: {
                                                                                    var4_4 /* !! */  = (List)var7_7 /* !! */ .f;
                                                                                    var11_11 /* !! */  = (Wq3)var7_7 /* !! */ .e;
                                                                                    var13_13 = var7_7 /* !! */ .d;
                                                                                    var14_15 = var7_7 /* !! */ .c;
                                                                                    var12_12 = var7_7 /* !! */ .b;
                                                                                    var7_7 /* !! */  = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var15_16 = var4_4 /* !! */ ;
                                                                                    var16_17 = var5_5 /* !! */ ;
                                                                                    var17_18 = var11_11 /* !! */ ;
                                                                                    break block93;
                                                                                }
                                                                                case 9: {
                                                                                    var18_20 = var7_7 /* !! */ .n;
                                                                                    var9_9 = var7_7 /* !! */ .m;
                                                                                    var19_21 = var7_7 /* !! */ .l;
                                                                                    var20_22 = var7_7 /* !! */ .k;
                                                                                    var21_23 = (ArrayList)var7_7 /* !! */ .f;
                                                                                    var15_16 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var16_17 = var7_7 /* !! */ .d;
                                                                                    var17_18 = var7_7 /* !! */ .c;
                                                                                    var22_24 = var7_7 /* !! */ .b;
                                                                                    var23_25 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    ** GOTO lbl854
                                                                                }
                                                                                case 8: {
                                                                                    var18_20 = var7_7 /* !! */ .l;
                                                                                    var9_9 = (int)var7_7 /* !! */ .k;
                                                                                    var12_12 = (Wq3)var7_7 /* !! */ .g;
                                                                                    var23_25 = (Integer)var7_7 /* !! */ .f;
                                                                                    var24_26 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var21_23 = var7_7 /* !! */ .d;
                                                                                    var15_16 = var7_7 /* !! */ .c;
                                                                                    var16_17 = var7_7 /* !! */ .b;
                                                                                    var17_18 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var14_15 = var5_5 /* !! */ ;
                                                                                    var25_27 = var9_9;
                                                                                    var5_5 /* !! */  = var23_25;
                                                                                    var22_24 = var17_18;
                                                                                    var23_25 = var12_12;
lbl64:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var17_18 = var16_17;
                                                                                        var16_17 = var15_16;
                                                                                        var15_16 = var21_23;
                                                                                        var21_23 = var24_26;
                                                                                        break block89;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                case 7: {
                                                                                    var18_20 = var7_7 /* !! */ .l;
                                                                                    var9_9 = (int)var7_7 /* !! */ .k;
                                                                                    var12_12 = var7_7 /* !! */ .j;
                                                                                    var23_25 = (Wq3)var7_7 /* !! */ .i;
                                                                                    var24_26 = (Wq3)var7_7 /* !! */ .h;
                                                                                    var21_23 = (Iterator)var7_7 /* !! */ .g;
                                                                                    var15_16 = (Integer)var7_7 /* !! */ .f;
                                                                                    var16_17 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var17_18 = var7_7 /* !! */ .d;
                                                                                    var22_24 = var7_7 /* !! */ .c;
                                                                                    var26_28 = var7_7 /* !! */ .b;
                                                                                    var14_15 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    break block94;
                                                                                }
                                                                                case 6: {
                                                                                    var18_20 = var7_7 /* !! */ .l;
                                                                                    var9_9 = (int)var7_7 /* !! */ .k;
                                                                                    var14_15 = (Wq3)var7_7 /* !! */ .i;
                                                                                    var12_12 = (Wq3)var7_7 /* !! */ .h;
                                                                                    var23_25 = (Iterator)var7_7 /* !! */ .g;
                                                                                    var26_28 = (Integer)var7_7 /* !! */ .f;
                                                                                    var24_26 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var21_23 = var7_7 /* !! */ .d;
                                                                                    var15_16 = var7_7 /* !! */ .c;
                                                                                    var16_17 = var7_7 /* !! */ .b;
                                                                                    var17_18 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var25_27 = var9_9;
                                                                                    var22_24 = var21_23;
                                                                                    var27_30 = var15_16;
                                                                                    var28_31 /* !! */  = var17_18;
                                                                                    var21_23 = var12_12;
                                                                                    var15_16 = var23_25;
                                                                                    var17_18 = var24_26;
                                                                                    var24_26 = var16_17;
                                                                                    var16_17 = var26_28;
lbl107:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var29_32 = var14_15;
                                                                                        var14_15 = var5_5 /* !! */ ;
                                                                                        var5_5 /* !! */  = var29_32;
                                                                                        break block90;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                case 5: {
                                                                                    var18_20 = var7_7 /* !! */ .l;
                                                                                    var9_9 = (int)var7_7 /* !! */ .k;
                                                                                    var14_15 = (ArrayList)var7_7 /* !! */ .h;
                                                                                    var12_12 = (Integer)var7_7 /* !! */ .g;
                                                                                    var23_25 = (Wq3)var7_7 /* !! */ .f;
                                                                                    var26_28 = (Integer)var7_7 /* !! */ .e;
                                                                                    var24_26 = var7_7 /* !! */ .d;
                                                                                    var21_23 = var7_7 /* !! */ .c;
                                                                                    var15_16 = var7_7 /* !! */ .b;
                                                                                    var16_17 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    break block95;
                                                                                }
                                                                                case 4: {
                                                                                    var18_20 = var7_7 /* !! */ .l;
                                                                                    var9_9 = (int)var7_7 /* !! */ .k;
                                                                                    var14_15 = (Wq3)var7_7 /* !! */ .i;
                                                                                    var12_12 = (Integer)var7_7 /* !! */ .h;
                                                                                    var23_25 = (Wq3)var7_7 /* !! */ .g;
                                                                                    var26_28 = (Integer)var7_7 /* !! */ .f;
                                                                                    var24_26 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var21_23 = var7_7 /* !! */ .d;
                                                                                    var15_16 = var7_7 /* !! */ .c;
                                                                                    var16_17 = var7_7 /* !! */ .b;
                                                                                    var17_18 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var3_3 /* !! */  = var12_12;
                                                                                    var22_24 = var15_16;
                                                                                    var27_30 = var16_17;
                                                                                    var28_31 /* !! */  = var17_18;
                                                                                    var12_12 = var14_15;
                                                                                    var15_16 = var26_28;
                                                                                    var16_17 = var24_26;
                                                                                    var17_18 = var21_23;
                                                                                    var14_15 = var5_5 /* !! */ ;
                                                                                    var30_33 /* !! */  = var9_9;
                                                                                    var21_23 = var23_25;
                                                                                    ** GOTO lbl542
                                                                                }
                                                                                case 3: {
                                                                                    var18_20 = var7_7 /* !! */ .n;
                                                                                    var9_9 = var7_7 /* !! */ .m;
                                                                                    var10_10 /* !! */  = var7_7 /* !! */ .l;
                                                                                    var19_21 = (int)var7_7 /* !! */ .k;
                                                                                    var23_25 = (ArrayList)var7_7 /* !! */ .i;
                                                                                    var26_28 = (Integer)var7_7 /* !! */ .h;
                                                                                    var24_26 = (Wq3)var7_7 /* !! */ .g;
                                                                                    var21_23 = (Integer)var7_7 /* !! */ .f;
                                                                                    var15_16 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var16_17 = var7_7 /* !! */ .d;
                                                                                    var17_18 = var7_7 /* !! */ .c;
                                                                                    var22_24 = var7_7 /* !! */ .b;
                                                                                    var4_4 /* !! */  = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var25_27 = var10_10 /* !! */ ;
                                                                                    var27_30 = var26_28;
                                                                                    var26_28 = var21_23;
                                                                                    var21_23 = var16_17;
                                                                                    var14_15 = var17_18;
                                                                                    var16_17 = var22_24;
                                                                                    var17_18 = var4_4 /* !! */ ;
                                                                                    ** GOTO lbl494
                                                                                }
                                                                                case 2: {
                                                                                    var18_20 = var7_7 /* !! */ .l;
                                                                                    var9_9 = (int)var7_7 /* !! */ .k;
                                                                                    var14_15 = var7_7 /* !! */ .j;
                                                                                    var12_12 = (Wq3)var7_7 /* !! */ .i;
                                                                                    var23_25 = (Integer)var7_7 /* !! */ .h;
                                                                                    var26_28 = (Wq3)var7_7 /* !! */ .g;
                                                                                    var24_26 = (Integer)var7_7 /* !! */ .f;
                                                                                    var21_23 = (Wq3)var7_7 /* !! */ .e;
                                                                                    var15_16 = var7_7 /* !! */ .d;
                                                                                    var16_17 = var7_7 /* !! */ .c;
                                                                                    var17_18 = var7_7 /* !! */ .b;
                                                                                    var22_24 = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var27_30 = var15_16;
                                                                                    var28_31 /* !! */  = var16_17;
                                                                                    var31_34 = var22_24;
                                                                                    var15_16 = var26_28;
                                                                                    var16_17 = var24_26;
                                                                                    var22_24 = var21_23;
                                                                                    var21_23 = var23_25;
                                                                                    var23_25 = var12_12;
                                                                                    var29_32 = var14_15;
                                                                                    var14_15 = var5_5 /* !! */ ;
                                                                                    var30_33 /* !! */  = var9_9;
                                                                                    var13_13 = var29_32;
                                                                                    ** GOTO lbl428
                                                                                }
                                                                                case 1: {
                                                                                    var4_4 /* !! */  = var7_7 /* !! */ .b;
                                                                                    var7_7 /* !! */  = var7_7 /* !! */ .a;
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    var11_11 /* !! */  = var7_7 /* !! */ ;
                                                                                    var9_9 = 0;
                                                                                    var13_14 = null;
                                                                                    var7_7 /* !! */  = var5_5 /* !! */ ;
                                                                                    var30_33 /* !! */  = 1;
                                                                                    break;
                                                                                }
                                                                                case 0: {
                                                                                    vl2_2.b(var5_5 /* !! */ );
                                                                                    Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var12_12);
                                                                                    var5_5 /* !! */  = var3_3 /* !! */ .a;
                                                                                    var13_13 = "terminalSeparatorType";
                                                                                    Intrinsics.checkNotNullParameter(var5_5 /* !! */ , (String)var13_13);
                                                                                    var14_15 = var4_4 /* !! */ .a;
                                                                                    var23_25 = Rv1.APPEND;
                                                                                    var32_35 = 2;
                                                                                    var24_26 = var4_4 /* !! */ .f;
                                                                                    var21_23 = var4_4 /* !! */ .e;
                                                                                    if (var14_15 != var23_25) ** GOTO lbl224
                                                                                    var10_10 /* !! */  = (int)var3_3 /* !! */ .e;
                                                                                    ** GOTO lbl241
lbl224:
                                                                                    // 1 sources

                                                                                    var14_15 = qZ2$a.$EnumSwitchMapping$0;
                                                                                    var33_36 = var5_5 /* !! */ .ordinal();
                                                                                    var10_10 /* !! */  = (int)var14_15[var33_36];
                                                                                    if (var10_10 /* !! */  == (var33_36 = 1)) ** GOTO lbl234
                                                                                    if (var10_10 /* !! */  == var32_35) {
                                                                                        var14_15 = var21_23.b;
                                                                                        var10_10 /* !! */  = (int)var14_15.a;
                                                                                    } else {
                                                                                        var4_4 /* !! */  = new NoWhenBranchMatchedException();
                                                                                        throw var4_4 /* !! */ ;
lbl234:
                                                                                        // 1 sources

                                                                                        var14_15 = var21_23.b;
                                                                                        var10_10 /* !! */  = (int)var14_15.a;
                                                                                        if (var10_10 /* !! */  != 0 && (var24_26 == null || (var14_15 = var24_26.b) == null || (var10_10 /* !! */  = (int)var14_15.a) != 0)) {
                                                                                            var10_10 /* !! */  = 1;
                                                                                        } else {
                                                                                            var10_10 /* !! */  = 0;
                                                                                            var14_15 = null;
                                                                                        }
                                                                                    }
lbl241:
                                                                                    // 4 sources

                                                                                    Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var12_12);
                                                                                    Intrinsics.checkNotNullParameter(var5_5 /* !! */ , (String)var13_13);
                                                                                    var13_13 = Rv1.PREPEND;
                                                                                    var23_25 = var4_4 /* !! */ .a;
                                                                                    if (var23_25 == var13_13) {
                                                                                        var30_33 /* !! */  = (int)var3_3 /* !! */ .d;
lbl247:
                                                                                        // 4 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var13_13 = qZ2$a.$EnumSwitchMapping$0;
                                                                                    var30_33 /* !! */  = var5_5 /* !! */ .ordinal();
                                                                                    var9_9 = 1;
                                                                                    if ((var30_33 /* !! */  = (int)var13_13[var30_33 /* !! */ ]) == var9_9) ** GOTO lbl259
                                                                                    if (var30_33 /* !! */  != var32_35) ** GOTO lbl257
                                                                                    var5_5 /* !! */  = var21_23.c;
                                                                                    var30_33 /* !! */  = (int)var5_5 /* !! */ .a;
                                                                                    ** GOTO lbl247
lbl257:
                                                                                    // 1 sources

                                                                                    var4_4 /* !! */  = new NoWhenBranchMatchedException();
                                                                                    throw var4_4 /* !! */ ;
lbl259:
                                                                                    // 1 sources

                                                                                    var5_5 /* !! */  = var21_23.c;
                                                                                    var30_33 /* !! */  = (int)var5_5 /* !! */ .a;
                                                                                    if (var30_33 /* !! */  == 0 || var24_26 != null && (var5_5 /* !! */  = var24_26.c) != null && (var30_33 /* !! */  = (int)var5_5 /* !! */ .a) == 0) ** GOTO lbl264
                                                                                    var30_33 /* !! */  = 1;
                                                                                    ** GOTO lbl247
lbl264:
                                                                                    // 1 sources

                                                                                    var30_33 /* !! */  = 0;
                                                                                    var5_5 /* !! */  = null;
                                                                                    ** continue;
                                                                                    var9_9 = var30_33 /* !! */ ;
                                                                                    var15_16 = var5_5 /* !! */  = var4_4 /* !! */ .b;
                                                                                    var15_16 = (Iterable)var5_5 /* !! */ ;
                                                                                    var34_37 = var15_16 instanceof Collection;
                                                                                    if (var34_37 == 0) ** GOTO lbl-1000
                                                                                    var16_17 = var15_16;
                                                                                    var16_17 = (Collection)var15_16;
                                                                                    var34_37 = var16_17.isEmpty();
                                                                                    if (var34_37 != 0) {
                                                                                        while (true) {
                                                                                            var35_38 = 1;
                                                                                            break;
                                                                                        }
                                                                                    } else lbl-1000:
                                                                                    // 2 sources

                                                                                    {
                                                                                        var15_16 = ((Iterable)var15_16).iterator();
                                                                                        do {
                                                                                            if ((var34_37 = var15_16.hasNext()) == 0) ** continue;
                                                                                        } while ((var34_37 = (var16_17 = ((Wq3)var15_16.next()).b).isEmpty()) != 0);
                                                                                        var35_38 = 0;
                                                                                        var15_16 = null;
                                                                                    }
                                                                                    var34_37 = var3_3 /* !! */ .k;
                                                                                    if (var34_37 != 0 && var23_25 == (var16_17 = Rv1.PREPEND) && var35_38 == 0) {
                                                                                        var5_5 /* !! */  = "Additional prepend event after prepend state is done".toString();
                                                                                        var4_4 /* !! */  = new IllegalArgumentException((String)var5_5 /* !! */ );
                                                                                        throw var4_4 /* !! */ ;
                                                                                    }
                                                                                    var34_37 = var3_3 /* !! */ .j;
                                                                                    if (var34_37 != 0 && var23_25 == (var16_17 = Rv1.APPEND) && var35_38 == 0) {
                                                                                        var5_5 /* !! */  = "Additional append event after append state is done".toString();
                                                                                        var4_4 /* !! */  = new IllegalArgumentException((String)var5_5 /* !! */ );
                                                                                        throw var4_4 /* !! */ ;
                                                                                    }
                                                                                    var16_17 = var3_3 /* !! */ .f;
                                                                                    var16_17.b((Qv1)var21_23);
                                                                                    var3_3 /* !! */ .g = var24_26;
                                                                                    var24_26 = Rv1.APPEND;
                                                                                    if (var23_25 != var24_26) {
                                                                                        var3_3 /* !! */ .h = var20_22 = var4_4 /* !! */ .c;
                                                                                    }
                                                                                    if (var23_25 != (var24_26 = Rv1.PREPEND)) {
                                                                                        var3_3 /* !! */ .i = var33_36 = var4_4 /* !! */ .d;
                                                                                    }
                                                                                    var23_25 = var3_3 /* !! */ .c;
                                                                                    var24_26 = var3_3 /* !! */ .b;
                                                                                    if (var35_38 == 0) break block96;
                                                                                    if (var10_10 /* !! */  == 0 && var9_9 == 0) {
                                                                                        Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var12_12);
                                                                                        return var4_4 /* !! */ ;
                                                                                    }
                                                                                    var36_39 = (int)var3_3 /* !! */ .k;
                                                                                    if (var36_39 != 0 && (var36_39 = (int)var3_3 /* !! */ .j) != 0) {
                                                                                        Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var12_12);
                                                                                        return var4_4 /* !! */ ;
                                                                                    }
                                                                                    var36_39 = (int)var23_25.isEmpty();
                                                                                    if (var36_39 == 0) break block96;
                                                                                    if (var10_10 /* !! */  == 0 || var9_9 == 0 || (var30_33 /* !! */  = (int)var3_3 /* !! */ .k) != 0 || (var30_33 /* !! */  = (int)var3_3 /* !! */ .j) != 0) break block97;
                                                                                    var7_7 /* !! */ .a = var3_3 /* !! */ ;
                                                                                    var7_7 /* !! */ .b = var4_4 /* !! */ ;
                                                                                    var7_7 /* !! */ .q = var30_33 /* !! */  = 1;
                                                                                    var9_9 = 0;
                                                                                    var13_13 = null;
                                                                                    if ((var7_7 /* !! */  = var24_26.invoke(null, null, var7_7 /* !! */ )) == var11_11 /* !! */ ) {
                                                                                        return var11_11 /* !! */ ;
                                                                                    }
                                                                                    var11_11 /* !! */  = var3_3 /* !! */ ;
                                                                                    var9_9 = 0;
                                                                                    var13_13 = null;
                                                                                }
                                                                            }
                                                                            var11_11 /* !! */ .d = false;
                                                                            var11_11 /* !! */ .e = false;
                                                                            var11_11 /* !! */ .k = var30_33 /* !! */ ;
                                                                            var11_11 /* !! */ .j = var30_33 /* !! */ ;
                                                                            if (var7_7 /* !! */  == null) {
                                                                                Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var12_12);
                                                                            } else {
                                                                                var26_29 = var4_4 /* !! */ .a;
                                                                                var5_5 /* !! */  = new int[]{0};
                                                                                Intrinsics.checkNotNullParameter(var7_7 /* !! */ , "separator");
                                                                                Intrinsics.checkNotNullParameter(var5_5 /* !! */ , "originalPageOffsets");
                                                                                var7_7 /* !! */  = kotlin.collections.a.b(var7_7 /* !! */ );
                                                                                var14_15 = kotlin.collections.a.b(0);
                                                                                var11_11 /* !! */  = new Wq3((int[])var5_5 /* !! */ , (List)var7_7 /* !! */ , 0, (List)var14_15);
                                                                                var24_26 = kotlin.collections.a.b((Object)var11_11 /* !! */ );
                                                                                var16_17 = var4_4 /* !! */ .e;
                                                                                var17_19 = var4_4 /* !! */ .f;
                                                                                var36_39 = var4_4 /* !! */ .c;
                                                                                var35_38 = var4_4 /* !! */ .d;
                                                                                var23_25 = var5_5 /* !! */ ;
                                                                                var4_4 /* !! */  = var5_5 /* !! */  = new rk2$b(var26_29, (List)var24_26, var36_39, var35_38, (Qv1)var16_17, var17_19);
                                                                            }
                                                                            return var4_4 /* !! */ ;
                                                                        }
                                                                        if (var9_9 != 0 && (var30_33 /* !! */  = (int)var3_3 /* !! */ .j) == 0) {
                                                                            var30_33 /* !! */  = 1;
                                                                            var3_3 /* !! */ .d = var30_33 /* !! */ ;
                                                                        } else {
                                                                            var30_33 /* !! */  = 1;
                                                                        }
                                                                        if (var10_10 /* !! */  != 0 && !(var6_6 = var3_3 /* !! */ .k)) {
                                                                            var3_3 /* !! */ .e = var30_33 /* !! */ ;
                                                                        }
                                                                        Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var12_12);
                                                                        return var4_4 /* !! */ ;
                                                                    }
                                                                    var36_39 = var5_5 /* !! */ .size();
                                                                    var12_12 = new ArrayList(var36_39);
                                                                    var34_37 = var5_5 /* !! */ .size();
                                                                    var21_23 = new ArrayList(var34_37);
                                                                    if (var35_38 == 0) {
                                                                        var16_17 = null;
                                                                        for (var34_37 = 0; var34_37 < (var37_40 = xx_2.h((List)var5_5 /* !! */ )) && (var37_40 = (int)(var17_18 = ((Wq3)var5_5 /* !! */ .get((int)var34_37)).b).isEmpty()) != 0; ++var34_37) {
                                                                        }
                                                                        var17_18 = new Integer(var34_37);
                                                                        var16_17 = (Wq3)var5_5 /* !! */ .get(var34_37);
                                                                        for (var38_41 = xx_2.h((List)var5_5 /* !! */ ); var38_41 > 0; var38_41 += -1) {
                                                                            var26_28 = var27_30 = var5_5 /* !! */ .get(var38_41);
                                                                            var26_28 = ((Wq3)var27_30).b;
                                                                            var32_35 = (int)var26_28.isEmpty();
                                                                            if (var32_35 == 0) break;
                                                                            var32_35 = 2;
                                                                        }
                                                                        var26_28 = new Integer(var38_41);
                                                                        var5_5 /* !! */  = (Wq3)var5_5 /* !! */ .get(var38_41);
                                                                    } else {
                                                                        var30_33 /* !! */  = 0;
                                                                        var5_5 /* !! */  = null;
                                                                        var32_35 = 0;
                                                                        var26_28 = null;
                                                                        var34_37 = 0;
                                                                        var16_17 = null;
                                                                        var37_40 = 0;
                                                                        var17_18 = null;
                                                                    }
                                                                    if (var10_10 /* !! */  != 0 && (var10_10 /* !! */  = (int)var3_3 /* !! */ .k) == 0) {
                                                                        var10_10 /* !! */  = 1;
                                                                        var3_3 /* !! */ .k = var10_10 /* !! */ ;
                                                                        if (var35_38 != 0) {
                                                                            var14_15 = (Wq3)CollectionsKt.L((List)var23_25);
                                                                        } else {
                                                                            Intrinsics.checkNotNull(var16_17);
                                                                            var14_15 = var16_17;
                                                                        }
                                                                        var23_25 = CollectionsKt.L(var14_15.b);
                                                                        var7_7 /* !! */ .a = var3_3 /* !! */ ;
                                                                        var7_7 /* !! */ .b = var4_4 /* !! */ ;
                                                                        var7_7 /* !! */ .c = var12_12;
                                                                        var7_7 /* !! */ .d = var21_23;
                                                                        var7_7 /* !! */ .e = var16_17;
                                                                        var7_7 /* !! */ .f = var17_18;
                                                                        var7_7 /* !! */ .g = var5_5 /* !! */ ;
                                                                        var7_7 /* !! */ .h = var26_28;
                                                                        var7_7 /* !! */ .i = var14_15;
                                                                        var7_7 /* !! */ .j = var12_12;
                                                                        var7_7 /* !! */ .k = var9_9;
                                                                        var7_7 /* !! */ .l = var35_38;
                                                                        var7_7 /* !! */ .q = 2;
                                                                        var38_41 = 0;
                                                                        var22_24 = null;
                                                                        var23_25 = var24_26.invoke(null, var23_25, var7_7 /* !! */ );
                                                                        if (var23_25 == var11_11 /* !! */ ) {
                                                                            return var11_11 /* !! */ ;
                                                                        }
                                                                        var31_34 = var3_3 /* !! */ ;
                                                                        var28_31 /* !! */  = var12_12;
                                                                        var27_30 = var21_23;
                                                                        var22_24 = var16_17;
                                                                        var16_17 = var17_18;
                                                                        var17_18 = var4_4 /* !! */ ;
                                                                        var21_23 = var26_28;
                                                                        var18_20 = var35_38;
                                                                        var15_16 = var5_5 /* !! */ ;
                                                                        var30_33 /* !! */  = var9_9;
                                                                        var13_13 = var12_12;
                                                                        var29_32 = var23_25;
                                                                        var23_25 = var14_15;
                                                                        var14_15 = var29_32;
lbl428:
                                                                        // 2 sources

                                                                        var32_35 = var23_25.c;
                                                                        var12_12 = var23_25.d;
                                                                        if (var12_12 != null) {
                                                                            var12_12 = (Number)CollectionsKt.L((List)var12_12);
                                                                            var20_22 = var19_21 = var12_12.intValue();
                                                                        } else {
                                                                            var20_22 = 0;
                                                                            var24_26 = null;
                                                                        }
                                                                        var19_21 = 0;
                                                                        vz2_0.a((List)var13_13, var14_15, null, (Wq3)var23_25, var32_35, var20_22);
                                                                        var9_9 = var30_33 /* !! */ ;
                                                                        var26_28 = var21_23;
                                                                        var5_5 /* !! */  = var15_16;
                                                                        var21_23 = var27_30;
                                                                        var12_12 = var28_31 /* !! */ ;
                                                                        var35_38 = var18_20;
                                                                        var4_4 /* !! */  = var16_17;
                                                                        var16_17 = var22_24;
                                                                    } else {
                                                                        var31_34 = var3_3 /* !! */ ;
                                                                        var29_32 = var17_18;
                                                                        var17_18 = var4_4 /* !! */ ;
                                                                        var4_4 /* !! */  = var29_32;
                                                                    }
                                                                    if (var35_38 != 0) break block98;
                                                                    Intrinsics.checkNotNull(var4_4 /* !! */ );
                                                                    var10_10 /* !! */  = var4_4 /* !! */ .intValue();
                                                                    var23_25 = var5_5 /* !! */ ;
                                                                    var30_33 /* !! */  = var9_9;
                                                                    var24_26 = var16_17;
                                                                    var16_17 = var17_18;
                                                                    var17_18 = var31_34;
                                                                    var13_13 = null;
                                                                    var29_32 = var26_28;
                                                                    var26_28 = var4_4 /* !! */ ;
                                                                    var18_20 = var10_10 /* !! */ ;
                                                                    var14_15 = var12_12;
                                                                    var12_12 = var29_32;
                                                                    for (var9_9 = 0; var9_9 < var18_20; var9_9 += var38_41) {
                                                                        var22_24 = (Wq3)var16_17.b.get(var9_9);
                                                                        var3_3 /* !! */  = var17_18.b;
                                                                        var7_7 /* !! */ .a = var17_18;
                                                                        var7_7 /* !! */ .b = var16_17;
                                                                        var7_7 /* !! */ .c = var14_15;
                                                                        var7_7 /* !! */ .d = var21_23;
                                                                        var7_7 /* !! */ .e = var24_26;
                                                                        var7_7 /* !! */ .f = var26_28;
                                                                        var7_7 /* !! */ .g = var23_25;
                                                                        var7_7 /* !! */ .h = var12_12;
                                                                        var7_7 /* !! */ .i = var14_15;
                                                                        var27_30 = var12_12;
                                                                        var12_12 = null;
                                                                        var7_7 /* !! */ .j = null;
                                                                        var7_7 /* !! */ .k = var30_33 /* !! */ ;
                                                                        var7_7 /* !! */ .l = var35_38;
                                                                        var7_7 /* !! */ .m = var9_9;
                                                                        var7_7 /* !! */ .n = var18_20;
                                                                        var7_7 /* !! */ .q = var19_21 = 3;
                                                                        var3_3 /* !! */  = (tZ2)var3_3 /* !! */ ;
                                                                        if ((var3_3 /* !! */  = vz2_0.b((Wq3)var22_24, (tZ2)var3_3 /* !! */ , (f80_0)var7_7 /* !! */ )) == var11_11 /* !! */ ) {
                                                                            return var11_11 /* !! */ ;
                                                                        }
                                                                        var19_21 = var30_33 /* !! */ ;
                                                                        var5_5 /* !! */  = var3_3 /* !! */ ;
                                                                        var25_27 = var35_38;
                                                                        var15_16 = var24_26;
                                                                        var24_26 = var23_25;
                                                                        var23_25 = var14_15;
lbl494:
                                                                        // 2 sources

                                                                        var23_25.add(var5_5 /* !! */ );
                                                                        var38_41 = 1;
                                                                        var30_33 /* !! */  = var19_21;
                                                                        var23_25 = var24_26;
                                                                        var24_26 = var15_16;
                                                                        var12_12 = var27_30;
                                                                        var35_38 = var25_27;
                                                                        var3_3 /* !! */  = this;
                                                                    }
                                                                    var27_30 = var12_12;
                                                                    var38_41 = 1;
                                                                    var3_3 /* !! */  = var16_17.a;
                                                                    var4_4 /* !! */  = Rv1.APPEND;
                                                                    if (var3_3 /* !! */  == var4_4 /* !! */  && (var25_27 = (var3_3 /* !! */  = var17_18.c).isEmpty() ^ var38_41) != 0) {
                                                                        var3_3 /* !! */  = (Wq3)CollectionsKt.S(var17_18.c);
                                                                        var4_4 /* !! */  = CollectionsKt.S(var3_3 /* !! */ .b);
                                                                        Intrinsics.checkNotNull(var24_26);
                                                                        var13_13 = CollectionsKt.L(var24_26.b);
                                                                        var7_7 /* !! */ .a = var17_18;
                                                                        var7_7 /* !! */ .b = var16_17;
                                                                        var7_7 /* !! */ .c = var14_15;
                                                                        var7_7 /* !! */ .d = var21_23;
                                                                        var7_7 /* !! */ .e = var24_26;
                                                                        var7_7 /* !! */ .f = var26_28;
                                                                        var7_7 /* !! */ .g = var23_25;
                                                                        var7_7 /* !! */ .h = var12_12;
                                                                        var7_7 /* !! */ .i = var3_3 /* !! */ ;
                                                                        var7_7 /* !! */ .j = null;
                                                                        var7_7 /* !! */ .k = var30_33 /* !! */ ;
                                                                        var7_7 /* !! */ .l = var35_38;
                                                                        var7_7 /* !! */ .q = var38_41 = 4;
                                                                        var22_24 = var17_18.b;
                                                                        var4_4 /* !! */  = var22_24.invoke(var4_4 /* !! */ , var13_13, var7_7 /* !! */ );
                                                                        if (var4_4 /* !! */  == var11_11 /* !! */ ) {
                                                                            return var11_11 /* !! */ ;
                                                                        }
                                                                        var22_24 = var14_15;
                                                                        var27_30 = var16_17;
                                                                        var28_31 /* !! */  = var17_18;
                                                                        var14_15 = var4_4 /* !! */ ;
                                                                        var16_17 = var24_26;
                                                                        var17_18 = var21_23;
                                                                        var18_20 = var35_38;
                                                                        var21_23 = var23_25;
                                                                        var15_16 = var26_28;
                                                                        var29_32 = var12_12;
                                                                        var12_12 = var3_3 /* !! */ ;
                                                                        var3_3 /* !! */  = var29_32;
lbl542:
                                                                        // 2 sources

                                                                        var32_35 = var16_17.c;
                                                                        var13_13 = var16_17.d;
                                                                        if (var13_13 != null) {
                                                                            var13_13 = (Number)CollectionsKt.L((List)var13_13);
                                                                            var20_22 = var9_9 = var13_13.intValue();
                                                                        } else {
                                                                            var20_22 = 0;
                                                                            var24_26 = null;
                                                                        }
                                                                        var13_13 = var22_24;
                                                                        var23_25 = var16_17;
                                                                        vz2_0.a((List)var22_24, var14_15, (Wq3)var12_12, (Wq3)var16_17, var32_35, var20_22);
                                                                        var12_12 = var3_3 /* !! */ ;
                                                                        var9_9 = var30_33 /* !! */ ;
                                                                        var23_25 = var21_23;
                                                                        var26_28 = var15_16;
                                                                        var24_26 = var17_18;
                                                                        var14_15 = var22_24;
                                                                        var15_16 = var27_30;
                                                                        var17_18 = var28_31 /* !! */ ;
                                                                    } else {
                                                                        var12_12 = var27_30;
                                                                        var9_9 = var30_33 /* !! */ ;
                                                                        var18_20 = var35_38;
                                                                        var15_16 = var16_17;
                                                                        var16_17 = var24_26;
                                                                        var24_26 = var21_23;
                                                                    }
                                                                    Intrinsics.checkNotNull(var16_17);
                                                                    var17_18.getClass();
                                                                    var3_3 /* !! */  = qZ2.d((Wq3)var16_17);
                                                                    var24_26.add(var3_3 /* !! */ );
                                                                    var7_7 /* !! */ .a = var17_18;
                                                                    var7_7 /* !! */ .b = var15_16;
                                                                    var7_7 /* !! */ .c = var14_15;
                                                                    var7_7 /* !! */ .d = var24_26;
                                                                    var7_7 /* !! */ .e = var26_28;
                                                                    var7_7 /* !! */ .f = var23_25;
                                                                    var7_7 /* !! */ .g = var12_12;
                                                                    var7_7 /* !! */ .h = var14_15;
                                                                    var7_7 /* !! */ .i = null;
                                                                    var7_7 /* !! */ .j = null;
                                                                    var7_7 /* !! */ .k = var9_9;
                                                                    var7_7 /* !! */ .l = var18_20;
                                                                    var7_7 /* !! */ .q = var25_27 = 5;
                                                                    var3_3 /* !! */  = (tZ2)var17_18.b;
                                                                    var5_5 /* !! */  = vz2_0.b((Wq3)var16_17, (tZ2)var3_3 /* !! */ , (f80_0)var7_7 /* !! */ );
                                                                    if (var5_5 /* !! */  == var11_11 /* !! */ ) {
                                                                        return var11_11 /* !! */ ;
                                                                    }
                                                                    var21_23 = var14_15;
                                                                    var16_17 = var17_18;
                                                                }
                                                                var14_15.add(var5_5 /* !! */ );
                                                                var3_3 /* !! */  = var15_16.b;
                                                                var30_33 /* !! */  = var26_28.intValue();
                                                                Intrinsics.checkNotNull(var12_12);
                                                                var10_10 /* !! */  = var12_12.intValue();
                                                                var32_35 = 1;
                                                                var3_3 /* !! */  = ((Iterable)var3_3 /* !! */ .subList(var30_33 /* !! */ , var10_10 /* !! */  += var32_35)).iterator();
                                                                var30_33 /* !! */  = (int)var3_3 /* !! */ .hasNext();
                                                                if (var30_33 /* !! */  == 0) break block99;
                                                                var5_5 /* !! */  = var3_3 /* !! */ .next();
                                                                var17_18 = var16_17;
                                                                var16_17 = var15_16;
                                                                var15_16 = var21_23;
                                                                var21_23 = var24_26;
                                                                var24_26 = var23_25;
                                                                var23_25 = var3_3 /* !! */ ;
lbl611:
                                                                // 2 sources

                                                                while ((var25_27 = (int)var23_25.hasNext()) != 0) {
                                                                    var3_3 /* !! */  = (Wq3)var23_25.next();
                                                                    var14_15 = var5_5 /* !! */ ;
                                                                    var14_15 = (Wq3)var5_5 /* !! */ ;
                                                                    var5_5 /* !! */  = var3_3 /* !! */ .b;
                                                                    var30_33 /* !! */  = (int)var5_5 /* !! */ .isEmpty();
                                                                    var32_35 = 1;
                                                                    if ((var30_33 /* !! */  ^= var32_35) == 0) break block91;
                                                                    var5_5 /* !! */  = var17_18.b;
                                                                    var26_28 = CollectionsKt.S(var14_15.b);
                                                                    var22_24 = CollectionsKt.L(var3_3 /* !! */ .b);
                                                                    var7_7 /* !! */ .a = var17_18;
                                                                    var7_7 /* !! */ .b = var16_17;
                                                                    var7_7 /* !! */ .c = var15_16;
                                                                    var7_7 /* !! */ .d = var21_23;
                                                                    var7_7 /* !! */ .e = var24_26;
                                                                    var7_7 /* !! */ .f = var12_12;
                                                                    var7_7 /* !! */ .g = var23_25;
                                                                    var7_7 /* !! */ .h = var3_3 /* !! */ ;
                                                                    var7_7 /* !! */ .i = var14_15;
                                                                    var1_1 = var3_3 /* !! */ ;
                                                                    var3_3 /* !! */  = null;
                                                                    var7_7 /* !! */ .j = null;
                                                                    var7_7 /* !! */ .k = var9_9;
                                                                    var7_7 /* !! */ .l = var18_20;
                                                                    var7_7 /* !! */ .q = var25_27 = 6;
                                                                    if ((var5_5 /* !! */  = var5_5 /* !! */ .invoke(var26_28, var22_24, var7_7 /* !! */ )) == var11_11 /* !! */ ) {
                                                                        return var11_11 /* !! */ ;
                                                                    }
                                                                    var25_27 = var9_9;
                                                                    var22_24 = var21_23;
                                                                    var27_30 = var15_16;
                                                                    var28_31 /* !! */  = var17_18;
                                                                    var21_23 = var1_1;
                                                                    var15_16 = var23_25;
                                                                    var17_18 = var24_26;
                                                                    var24_26 = var16_17;
                                                                    var16_17 = var12_12;
                                                                    ** continue;
lbl649:
                                                                    // 1 sources

                                                                    ** GOTO lbl107
                                                                }
                                                                break block100;
                                                            }
                                                            var13_13 = var24_26.a;
                                                            var12_12 = Rv1.PREPEND;
                                                            if (var13_13 == var12_12) {
                                                                var33_36 = var29_32.c;
lbl656:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var33_36 = var21_23.c;
                                                            ** while (true)
                                                            var32_35 = var33_36;
                                                            if (var13_13 != var12_12) break block101;
                                                            var13_13 = var5_5 /* !! */ .d;
                                                            if (var13_13 != null) {
                                                                var13_13 = (Number)CollectionsKt.S((List)var13_13);
                                                                var9_9 = var13_13.intValue();
lbl666:
                                                                // 3 sources

                                                                while (true) {
                                                                    var39_42 = var9_9;
                                                                    break block92;
                                                                    break;
                                                                }
                                                            }
                                                            var13_13 = var5_5 /* !! */ .b;
                                                            var9_9 = xx_2.h((List)var13_13);
                                                            ** GOTO lbl666
                                                        }
                                                        var13_13 = var21_23.d;
                                                        if (var13_13 != null) {
                                                            var13_13 = (Number)CollectionsKt.L((List)var13_13);
                                                            var9_9 = var13_13.intValue();
                                                            ** continue;
                                                        }
                                                        var39_42 = 0;
                                                        var31_34 = null;
                                                    }
                                                    var13_13 = var27_30;
                                                    var12_12 = var5_5 /* !! */ ;
                                                    var23_25 = var21_23;
                                                    var40_43 = var24_26;
                                                    var20_22 = var39_42;
                                                    vz2_0.a((List)var27_30, var14_15, (Wq3)var5_5 /* !! */ , (Wq3)var21_23, var32_35, var39_42);
                                                    var9_9 = var25_27;
                                                    var23_25 = var5_5 /* !! */ ;
                                                    var24_26 = var21_23;
                                                    var21_23 = var15_16;
                                                    var15_16 = var16_17;
                                                    var16_17 = var17_18;
                                                    var17_18 = var22_24;
                                                    var12_12 = var27_30;
                                                    var14_15 = var28_31 /* !! */ ;
                                                    var26_28 = var40_43;
                                                    break block102;
                                                }
                                                var1_1 = var3_3 /* !! */ ;
                                                var26_28 = var16_17;
                                                var16_17 = var24_26;
                                                var24_26 = var3_3 /* !! */ ;
                                                var29_32 = var23_25;
                                                var23_25 = var14_15;
                                                var14_15 = var17_18;
                                                var17_18 = var21_23;
                                                var21_23 = var29_32;
                                                var41_44 = var15_16;
                                                var15_16 = var12_12;
                                                var12_12 = var41_44;
                                            }
                                            var3_3 /* !! */  = var24_26.b;
                                            var25_27 = (int)var3_3 /* !! */ .isEmpty();
                                            var30_33 /* !! */  = 1;
                                            if ((var25_27 ^= var30_33 /* !! */ ) != 0) {
                                                var14_15.getClass();
                                                var3_3 /* !! */  = qZ2.d((Wq3)var24_26);
                                                var17_18.add(var3_3 /* !! */ );
                                            }
                                            var3_3 /* !! */  = var14_15.b;
                                            var7_7 /* !! */ .a = var14_15;
                                            var7_7 /* !! */ .b = var26_28;
                                            var7_7 /* !! */ .c = var12_12;
                                            var7_7 /* !! */ .d = var17_18;
                                            var7_7 /* !! */ .e = var16_17;
                                            var7_7 /* !! */ .f = var15_16;
                                            var7_7 /* !! */ .g = var21_23;
                                            var7_7 /* !! */ .h = var24_26;
                                            var7_7 /* !! */ .i = var23_25;
                                            var7_7 /* !! */ .j = var12_12;
                                            var7_7 /* !! */ .k = var9_9;
                                            var7_7 /* !! */ .l = var18_20;
                                            var7_7 /* !! */ .q = var30_33 /* !! */  = 7;
                                            var5_5 /* !! */  = vz2_0.b((Wq3)var24_26, (tZ2)(var3_3 /* !! */  = (tZ2)var3_3 /* !! */ ), (f80_0)var7_7 /* !! */ );
                                            if (var5_5 /* !! */  == var11_11 /* !! */ ) {
                                                return var11_11 /* !! */ ;
                                            }
                                            var22_24 = var12_12;
                                        }
                                        var12_12.add(var5_5 /* !! */ );
                                        var3_3 /* !! */  = var24_26.b;
                                        var25_27 = (int)var3_3 /* !! */ .isEmpty();
                                        var30_33 /* !! */  = 1;
                                        var5_5 /* !! */  = (var25_27 ^= var30_33 /* !! */ ) != 0 ? var24_26 : var23_25;
                                        var23_25 = var21_23;
                                        var12_12 = var15_16;
                                        var24_26 = var16_17;
                                        var21_23 = var17_18;
                                        var15_16 = var22_24;
                                        var17_18 = var14_15;
                                        var16_17 = var26_28;
                                        ** GOTO lbl611
                                    }
                                    var3_3 /* !! */  = var16_17.a;
                                    var5_5 /* !! */  = Rv1.PREPEND;
                                    if (var3_3 /* !! */  != var5_5 /* !! */ ) break block103;
                                    var3_3 /* !! */  = var17_18.c;
                                    var25_27 = (int)var3_3 /* !! */ .isEmpty();
                                    var30_33 /* !! */  = 1;
                                    if ((var25_27 ^= var30_33 /* !! */ ) != 0) {
                                        var3_3 /* !! */  = (Wq3)CollectionsKt.L(var17_18.c);
                                        Intrinsics.checkNotNull(var24_26);
                                        var5_5 /* !! */  = CollectionsKt.S(var24_26.b);
                                        var14_15 = CollectionsKt.L(var3_3 /* !! */ .b);
                                        var7_7 /* !! */ .a = var17_18;
                                        var7_7 /* !! */ .b = var16_17;
                                        var7_7 /* !! */ .c = var15_16;
                                        var7_7 /* !! */ .d = var21_23;
                                        var7_7 /* !! */ .e = var24_26;
                                        var7_7 /* !! */ .f = var12_12;
                                        var7_7 /* !! */ .g = var3_3 /* !! */ ;
                                        var7_7 /* !! */ .h = null;
                                        var7_7 /* !! */ .i = null;
                                        var7_7 /* !! */ .j = null;
                                        var7_7 /* !! */ .k = var9_9;
                                        var7_7 /* !! */ .l = var18_20;
                                        var7_7 /* !! */ .q = var33_36 = 8;
                                        var23_25 = var17_18.b;
                                        var5_5 /* !! */  = var23_25.invoke(var5_5 /* !! */ , var14_15, var7_7 /* !! */ );
                                        if (var5_5 /* !! */  == var11_11 /* !! */ ) {
                                            return var11_11 /* !! */ ;
                                        }
                                        var23_25 = var3_3 /* !! */ ;
                                        var14_15 = var5_5 /* !! */ ;
                                        var25_27 = var9_9;
                                        var5_5 /* !! */  = var12_12;
                                        var22_24 = var17_18;
                                        ** continue;
                                    }
                                    break block103;
                                }
                                var32_35 = var24_26.c;
                                var13_13 = var24_26.d;
                                if (var13_13 != null) {
                                    var13_13 = (Number)CollectionsKt.S((List)var13_13);
                                    var9_9 = var13_13.intValue();
lbl796:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var13_13 = var24_26.b;
                                var9_9 = xx_2.h((List)var13_13);
                                ** while (true)
                                var20_22 = var9_9;
                                var13_13 = var16_17;
                                var12_12 = var21_23;
                                vz2_0.a((List)var16_17, var14_15, (Wq3)var21_23, (Wq3)var23_25, var32_35, var9_9);
                                var9_9 = var25_27;
                                var12_12 = var5_5 /* !! */ ;
                                var5_5 /* !! */  = var21_23;
                                var21_23 = var15_16;
lbl809:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var5_5 /* !! */  = var24_26;
                            var22_24 = var17_18;
                            var17_18 = var16_17;
                            var16_17 = var15_16;
                            ** while (true)
                            var35_38 = var18_20;
                            var25_27 = var12_12.intValue() + 1;
                            var4_4 /* !! */  = var17_18.b;
                            var18_20 = xx_2.h((List)var4_4 /* !! */ );
                            if (var25_27 <= var18_20) {
                                var20_22 = var9_9;
                                var19_21 = var35_38;
                                var23_25 = var22_24;
                                var9_9 = var25_27;
                                var15_16 = var5_5 /* !! */ ;
                                var22_24 = var17_18;
                                var29_32 = var16_17;
                                var16_17 = var21_23;
                                var21_23 = var29_32;
                                while (true) {
                                    var3_3 /* !! */  = (Wq3)var22_24.b.get(var9_9);
                                    var5_5 /* !! */  = var23_25.b;
                                    var7_7 /* !! */ .a = var23_25;
                                    var7_7 /* !! */ .b = var22_24;
                                    var7_7 /* !! */ .c = var21_23;
                                    var7_7 /* !! */ .d = var16_17;
                                    var7_7 /* !! */ .e = var15_16;
                                    var7_7 /* !! */ .f = var21_23;
                                    var14_15 = null;
                                    var7_7 /* !! */ .g = null;
                                    var7_7 /* !! */ .h = null;
                                    var7_7 /* !! */ .i = null;
                                    var7_7 /* !! */ .j = null;
                                    var7_7 /* !! */ .k = var20_22;
                                    var7_7 /* !! */ .l = var19_21;
                                    var7_7 /* !! */ .m = var9_9;
                                    var7_7 /* !! */ .n = var18_20;
                                    var7_7 /* !! */ .q = var10_10 /* !! */  = 9;
                                    var5_5 /* !! */  = (tZ2)var5_5 /* !! */ ;
                                    if ((var5_5 /* !! */  = vz2_0.b((Wq3)var3_3 /* !! */ , (tZ2)var5_5 /* !! */ , (f80_0)var7_7 /* !! */ )) == var11_11 /* !! */ ) {
                                        return var11_11 /* !! */ ;
                                    }
                                    var17_18 = var21_23;
lbl854:
                                    // 2 sources

                                    var21_23.add(var5_5 /* !! */ );
                                    if (var9_9 == var18_20) break;
                                    ++var9_9;
                                    var21_23 = var17_18;
                                }
                                var3_3 /* !! */  = var7_7 /* !! */ ;
                                var7_7 /* !! */  = var23_25;
                                var9_9 = var20_22;
                                var5_5 /* !! */  = var15_16;
                                var21_23 = var16_17;
                                var4_4 /* !! */  = var17_18;
                                var35_38 = var19_21;
                                var12_12 = var22_24;
                            } else {
                                var3_3 /* !! */  = var7_7 /* !! */ ;
                                var4_4 /* !! */  = var16_17;
                                var12_12 = var17_18;
                                var7_7 /* !! */  = var22_24;
                            }
                            break block104;
                        }
                        var3_3 /* !! */  = new UnsupportedOperationException("Empty collection can't be reduced.");
                        throw var3_3 /* !! */ ;
                    }
                    var3_3 /* !! */  = var7_7 /* !! */ ;
                    var4_4 /* !! */  = var12_12;
                    var12_12 = var17_18;
                    var7_7 /* !! */  = var31_34;
                }
                if (var9_9 == 0 || (var9_9 = (int)var7_7 /* !! */ .j) != 0) break block105;
                var9_9 = 1;
                var7_7 /* !! */ .j = var9_9;
                if (var35_38 != 0) {
                    var5_5 /* !! */  = (Wq3)CollectionsKt.S(var7_7 /* !! */ .c);
                } else {
                    Intrinsics.checkNotNull(var5_5 /* !! */ );
                }
                var13_13 = CollectionsKt.S(var5_5 /* !! */ .b);
                var3_3 /* !! */ .a = var7_7 /* !! */ ;
                var3_3 /* !! */ .b = var12_12;
                var3_3 /* !! */ .c = var4_4 /* !! */ ;
                var3_3 /* !! */ .d = var21_23;
                var3_3 /* !! */ .e = var5_5 /* !! */ ;
                var3_3 /* !! */ .f = var4_4 /* !! */ ;
                var10_10 /* !! */  = 0;
                var14_15 = null;
                var3_3 /* !! */ .g = null;
                var3_3 /* !! */ .h = null;
                var3_3 /* !! */ .i = null;
                var3_3 /* !! */ .j = null;
                var3_3 /* !! */ .q = var33_36 = 10;
                var23_25 = var7_7 /* !! */ .b;
                var3_3 /* !! */  = var23_25.invoke(var13_13, null, var3_3 /* !! */ );
                if (var3_3 /* !! */  == var11_11 /* !! */ ) {
                    return var11_11 /* !! */ ;
                }
                var16_17 = var3_3 /* !! */ ;
                var14_15 = var4_4 /* !! */ ;
                var15_16 = var4_4 /* !! */ ;
                var17_18 = var5_5 /* !! */ ;
                var13_13 = var21_23;
            }
            var25_27 = var17_18.c;
            var4_4 /* !! */  = var17_18.d;
            if (var4_4 /* !! */  != null) {
                var4_4 /* !! */  = (Number)CollectionsKt.S((List)var4_4 /* !! */ );
                var18_20 = var4_4 /* !! */ .intValue();
            } else {
                var4_4 /* !! */  = var17_18.b;
                var18_20 = xx_2.h((List)var4_4 /* !! */ );
            }
            var38_41 = 0;
            var22_24 = null;
            vz2_0.a((List)var15_16, var16_17, (Wq3)var17_18, null, var25_27, var18_20);
            var21_23 = var13_13;
            var31_34 = var14_15;
lbl927:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var31_34 = var4_4 /* !! */ ;
        ** while (true)
        var25_27 = 0;
        var3_3 /* !! */  = null;
        var7_7 /* !! */ .d = false;
        var7_7 /* !! */ .e = false;
        var4_4 /* !! */  = var12_12.a;
        var5_5 /* !! */  = Rv1.APPEND;
        var7_7 /* !! */  = var7_7 /* !! */ .c;
        if (var4_4 /* !! */  == var5_5 /* !! */ ) {
            var7_7 /* !! */ .addAll(var21_23);
        } else {
            var7_7 /* !! */ .addAll(0, var21_23);
        }
        var4_4 /* !! */  = var12_12.e;
        var5_5 /* !! */  = var12_12.f;
        var7_7 /* !! */  = var12_12.a;
        var8_8 = var12_12.c;
        var9_9 = var12_12.d;
        var27_30 = var3_3 /* !! */ ;
        var28_31 /* !! */  = var7_7 /* !! */ ;
        var3_3 /* !! */  = new rk2$b((Rv1)var7_7 /* !! */ , (List)var31_34, var8_8, var9_9, (Qv1)var4_4 /* !! */ , (Qv1)var5_5 /* !! */ );
        return var3_3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object c(rk2$d var1_1, f80_0 var2_2) {
        block11: {
            block9: {
                block10: {
                    var3_3 = var2_2 instanceof qZ2$d;
                    if (!var3_3) ** GOTO lbl-1000
                    var4_4 = var2_2;
                    var4_4 = (qZ2$d)var2_2;
                    var5_5 = var4_4.i;
                    var6_6 = -1 << -1;
                    var7_7 = var5_5 & var6_6;
                    if (var7_7 != 0) {
                        var4_4.i = var5_5 -= var6_6;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 = new qZ2$d(this, (f80_0)var2_2);
                    }
                    var2_2 = var4_4.g;
                    var8_8 = j90_0.COROUTINE_SUSPENDED;
                    var6_6 = var4_4.i;
                    var7_7 = 1;
                    if (var6_6 == 0) break block9;
                    if (var6_6 != var7_7) break block10;
                    var9_9 = var4_4.f;
                    var6_6 = var4_4.e;
                    var10_10 = var4_4.d;
                    var11_11 = var4_4.c;
                    var12_12 = var4_4.b;
                    var13_13 = var4_4.a;
                    vl2_2.b(var2_2);
                    var14_14 = var9_9;
                    var1_1 = var12_12;
                    var12_12 = var10_10;
                    ** GOTO lbl62
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var2_2);
            var2_2 = new ArrayList();
            var15_15 = var1_1.a;
            var6_6 = var15_15.size();
            if (var6_6 < 0) break block11;
            var14_14 = 0;
            var10_10 = null;
            var13_13 = this;
            var11_11 = var2_2;
            while (true) {
                var2_2 = var1_1.a;
                var16_16 = var14_14 + -1;
                var2_2 = CollectionsKt.N(var16_16, var2_2);
                var12_12 = var1_1.a;
                var12_12 = CollectionsKt.N(var14_14, (List)var12_12);
                var17_17 = var13_13.b;
                var4_4.a = var13_13;
                var4_4.b = var1_1;
                var18_18 /* !! */  = var11_11;
                var4_4.c = var18_18 /* !! */  = (List)var11_11;
                var4_4.d = var12_12;
                var4_4.e = var14_14;
                var4_4.f = var6_6;
                var4_4.i = var7_7;
                if ((var2_2 = var17_17.invoke(var2_2, var12_12, var4_4)) == var8_8) {
                    return var8_8;
                }
                var19_19 = var14_14;
                var14_14 = var6_6;
                var6_6 = var19_19;
lbl62:
                // 2 sources

                if (var2_2 != null) {
                    var11_11.add(var2_2);
                }
                if (var12_12 != null) {
                    var11_11.add(var12_12);
                }
                if (var6_6 == var14_14) break;
                var20_20 = var6_6 + 1;
                var6_6 = var14_14;
                var14_14 = var20_20;
            }
            var2_2 = var11_11;
        }
        var1_1 = var1_1.b;
        var4_4 = new rk2$d((List)var2_2);
        return var4_4;
    }
}

