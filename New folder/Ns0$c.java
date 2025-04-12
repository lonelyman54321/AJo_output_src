/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Ns0$c
extends rl2_2
implements Function2 {
    public mv2_0 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ Ref$ObjectRef g;

    public Ns0$c(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, f80_0 f80_02) {
        this.f = ref$ObjectRef;
        this.g = ref$ObjectRef2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.f;
        Ref$ObjectRef ref$ObjectRef2 = this.g;
        Ns0$c ns0$c = new Ns0$c(ref$ObjectRef, ref$ObjectRef2, f80_02);
        ns0$c.e = object;
        return ns0$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (Ns0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ns0$c)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block18: {
            block19: {
                block20: {
                    var2_2 = this;
                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var4_4 = this.d;
                    var5_5 = 1;
                    var6_6 = 2;
                    var7_7 = false;
                    var8_8 /* !! */  = null;
                    if (var4_4 == 0) break block18;
                    if (var4_4 == var5_5) break block19;
                    if (var4_4 != var6_6) break block20;
                    var4_4 = this.c;
                    var9_9 /* !! */  = this.b;
                    var10_10 /* !! */  = (ru_0)this.e;
                    vl2_2.b(var1_1);
                    var8_8 /* !! */  = var1_1;
                    ** GOTO lbl72
                }
                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var3_3 /* !! */ ;
            }
            var4_4 = this.c;
            var9_9 /* !! */  = (ru_0)this.e;
            vl2_2.b(var1_1);
            var10_10 /* !! */  = var1_1;
            ** GOTO lbl38
        }
        vl2_2.b(var1_1);
        var9_9 /* !! */  = (ru_0)this.e;
        var4_4 = 0;
        block0: while (var4_4 == 0) {
            block16: {
                block15: {
                    var10_10 /* !! */  = Nv2.Main;
                    var2_2.e = var9_9 /* !! */ ;
                    var2_2.b = null;
                    var2_2.c = var4_4;
                    var2_2.d = var5_5;
                    if ((var10_10 /* !! */  = var9_9 /* !! */ .x0(var10_10 /* !! */ , var2_2)) == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
lbl38:
                    // 3 sources

                    var10_10 /* !! */  = (mv2_0)var10_10 /* !! */ ;
                    var11_11 = var10_10 /* !! */ .a;
                    var12_12 = var11_11.size();
                    var14_14 = null;
                    for (var13_13 = 0; var13_13 < var12_12; ++var13_13) {
                        var15_15 = (aw2_0)var11_11.get(var13_13);
                        var16_16 = si0_2.c(var15_15);
                        if (var16_16) {
                            continue;
                        }
                        break block15;
                    }
                    var4_4 = 1;
                }
                var11_11 = var10_10 /* !! */ .a;
                var12_12 = var11_11.size();
                var14_14 = null;
                for (var13_13 = 0; var13_13 < var12_12; ++var13_13) {
                    var15_15 = (aw2_0)var11_11.get(var13_13);
                    var17_17 = var15_15.b();
                    if (!var17_17 && !(var7_7 = si0_2.f(var15_15, var18_18 = var9_9 /* !! */ .a(), var20_19 = var9_9 /* !! */ .Z()))) {
                        var7_7 = false;
                        var8_8 /* !! */  = null;
                        continue;
                    }
                    var4_4 = 1;
                    break;
                }
                var8_8 /* !! */  = Nv2.Final;
                var2_2.e = var9_9 /* !! */ ;
                var2_2.b = var10_10 /* !! */ ;
                var2_2.c = var4_4;
                var2_2.d = var6_6;
                if ((var8_8 /* !! */  = var9_9 /* !! */ .x0((Nv2)var8_8 /* !! */ , var2_2)) == var3_3 /* !! */ ) {
                    return var3_3 /* !! */ ;
                }
                var22_20 /* !! */  = var10_10 /* !! */ ;
                var10_10 /* !! */  = var9_9 /* !! */ ;
                var9_9 /* !! */  = var22_20 /* !! */ ;
lbl72:
                // 2 sources

                var8_8 /* !! */  = ((mv2_0)var8_8 /* !! */ ).a;
                var23_21 = var8_8 /* !! */ .size();
                var11_11 = null;
                for (var24_22 = 0; var24_22 < var23_21; ++var24_22) {
                    var25_23 = (aw2_0)var8_8 /* !! */ .get(var24_22);
                    var12_12 = (int)var25_23.b();
                    if (var12_12 == 0) continue;
                    var4_4 = 1;
                    break;
                }
                var8_8 /* !! */  = var2_2.f;
                var26_24 = (aw2_0)var8_8 /* !! */ .element;
                var27_25 = var26_24.a;
                var23_21 = (int)Ns0.d((mv2_0)var9_9 /* !! */ , var27_25);
                var11_11 = var2_2.g;
                var9_9 /* !! */  = var9_9 /* !! */ .a;
                if (var23_21 == 0) ** GOTO lbl111
                var23_21 = var9_9 /* !! */ .size();
                var25_23 = null;
                for (var12_12 = 0; var12_12 < var23_21; ++var12_12) {
                    var15_15 = var14_14 = (aw2_0)var9_9 /* !! */ .get(var12_12);
                    var15_15 = var14_14;
                    var16_16 = var15_15.d;
                    if (!var16_16) {
                        continue;
                    }
                    break block16;
                }
                var13_13 = 0;
                var14_14 = null;
            }
            var14_14 = var14_14;
            if (var14_14 != null) {
                var8_8 /* !! */ .element = var14_14;
                var11_11.element = var14_14;
            } else {
                block17: {
                    var9_9 /* !! */  = var10_10 /* !! */ ;
                    var4_4 = 1;
lbl107:
                    // 2 sources

                    while (true) {
                        var7_7 = false;
                        var8_8 /* !! */  = null;
                        continue block0;
                        break;
                    }
lbl111:
                    // 1 sources

                    var23_21 = var9_9 /* !! */ .size();
                    var25_23 = null;
                    for (var12_12 = 0; var12_12 < var23_21; ++var12_12) {
                        var15_15 = var14_14 = (aw2_0)var9_9 /* !! */ .get(var12_12);
                        var15_15 = var14_14;
                        var29_26 = var15_15.a;
                        var31_27 = (aw2_0)var8_8 /* !! */ .element;
                        var32_28 = var31_27.a;
                        var5_5 = (int)Yv2.a(var29_26, var32_28);
                        if (var5_5 == 0) {
                            var5_5 = 1;
                            var6_6 = 2;
                            continue;
                        }
                        break block17;
                    }
                    var13_13 = 0;
                    var14_14 = null;
                }
                var11_11.element = var14_14;
            }
            var9_9 /* !! */  = var10_10 /* !! */ ;
            var5_5 = 1;
            var6_6 = 2;
            ** continue;
        }
        return Unit.a;
    }
}

