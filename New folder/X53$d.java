/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class X53$d
implements xh1 {
    public final /* synthetic */ hs1_2 a;
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ X53 d;

    public X53$d(hs1_2 hs1_22, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, X53 x53) {
        this.a = hs1_22;
        this.b = ref$BooleanRef;
        this.c = ref$ObjectRef;
        this.d = x53;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(ji0_0 var1_1, f80_0 var2_6) {
        block21: {
            block18: {
                block19: {
                    block17: {
                        block20: {
                            var3_7 = var2_6 instanceof f63;
                            if (!var3_7) ** GOTO lbl-1000
                            var4_8 = var2_6;
                            var4_8 = (f63)var2_6;
                            var5_9 = var4_8.h;
                            var6_10 = -1 << -1;
                            var7_11 = var5_9 & var6_10;
                            if (var7_11 != 0) {
                                var4_8.h = var5_9 -= var6_10;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_8 = new f63(this, (f80_0)var2_6);
                            }
                            var2_6 = var4_8.f;
                            var8_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var6_10 = var4_8.h;
                            var7_11 = 3;
                            var9_13 = 2;
                            var10_14 = 1;
                            if (var6_10 == 0) break block18;
                            if (var6_10 == var10_14) break block19;
                            if (var6_10 == var9_13) break block20;
                            if (var6_10 != var7_11) {
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var1_1 = var4_8.c;
                            var8_12 /* !! */  = (Ref$ObjectRef)var4_8.b;
                            var4_8 = (hs1_2)var4_8.a;
                            try {
                                vl2_2.b(var2_6);
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                break block17;
                            }
                        }
                        var1_1 = (X53)var4_8.c;
                        var11_15 /* !! */  = (Ref$ObjectRef)var4_8.b;
                        var12_16 = (hs1_2)var4_8.a;
                        try {
                            vl2_2.b(var2_6);
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var1_3) {
                            var4_8 = var12_16;
                            ** GOTO lbl40
                        }
                    }
lbl40:
                    // 3 sources

                    while (true) {
                        var4_8.b(null);
                        throw var1_5;
                    }
                }
                var1_1 = var4_8.e;
                var11_15 /* !! */  = var4_8.d;
                var13_17 = (Ref$BooleanRef)var4_8.c;
                var14_18 = (hs1_2)var4_8.b;
                var15_20 = (Function2)var4_8.a;
                vl2_2.b(var2_6);
                var2_6 = var14_18;
                var16_21 = var15_20;
                var15_20 = var1_1;
                var1_1 = var16_21;
                break block21;
            }
            vl2_2.b(var2_6);
            var4_8.a = var1_1;
            var4_8.b = var2_6 = this.a;
            var11_15 /* !! */  = this.b;
            var4_8.c = var11_15 /* !! */ ;
            var4_8.d = var14_19 = this.c;
            var4_8.e = var15_20 = this.d;
            var4_8.h = var10_14;
            var13_17 = var2_6.d((f80_0)var4_8, null);
            if (var13_17 == var8_12 /* !! */ ) {
                return var8_12 /* !! */ ;
            }
            var13_17 = var11_15 /* !! */ ;
            var11_15 /* !! */  = var14_19;
        }
        try {
            var10_14 = (int)var13_17.element;
            if (var10_14 == 0) {
                var13_17 = var11_15 /* !! */ .element;
                var4_8.a = var2_6;
                var4_8.b = var11_15 /* !! */ ;
                var4_8.c = var15_20;
                var4_8.d = null;
                var4_8.e = null;
                var4_8.h = var9_13;
                if ((var1_1 = var1_1.invoke(var13_17, var4_8)) == var8_12 /* !! */ ) {
                    return var8_12 /* !! */ ;
                }
                var12_16 = var2_6;
                var2_6 = var1_1;
                var1_1 = var15_20;
            }
            ** GOTO lbl-1000
        }
        catch (Throwable var1_4) {
            var4_8 = var2_6;
            ** continue;
        }
lbl-1000:
        // 2 sources

        {
            var13_17 = var11_15 /* !! */ .element;
            var10_14 = (int)Intrinsics.areEqual(var2_6, var13_17);
            if (var10_14 != 0) ** GOTO lbl108
            var4_8.a = var12_16;
            var4_8.b = var11_15 /* !! */ ;
            var4_8.c = var2_6;
            var4_8.h = var7_11;
            if ((var1_1 = var1_1.j((f80_0)var4_8, var2_6)) == var8_12 /* !! */ ) {
                return var8_12 /* !! */ ;
            }
            var1_1 = var2_6;
            var8_12 /* !! */  = var11_15 /* !! */ ;
            var4_8 = var12_16;
        }
lbl-1000:
        // 2 sources

        {
            block22: {
                var8_12 /* !! */ .element = var1_1;
                var11_15 /* !! */  = var8_12 /* !! */ ;
                break block22;
lbl108:
                // 1 sources

                var4_8 = var12_16;
            }
            var1_1 = var11_15 /* !! */ .element;
            var4_8.b(null);
            return var1_1;
        }
lbl-1000:
        // 1 sources

        {
            var4_8 = "InitializerApi.updateData should not be called after initialization is complete.";
            var1_1 = new IllegalStateException((String)var4_8);
            throw var1_1;
        }
    }
}

