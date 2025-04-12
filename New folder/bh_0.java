/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.util.TypedValue
 */
import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Bh
 */
public final class bh_0
implements ct2_1 {
    public final Context a;

    public bh_0(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final Typeface a(LU0 object) {
        block12: {
            Object object2;
            block13: {
                int n3 = object instanceof ah_0;
                object2 = null;
                if (n3 != 0) break block12;
                n3 = object instanceof jk2_1;
                if (n3 == 0) break block13;
                Object object3 = object;
                object3 = (jk2_1)object;
                n3 = ((jk2_1)object3).e;
                boolean bl2 = dV0.d(n3, 0);
                Context context = this.a;
                if (bl2) {
                    object3 = object;
                    n3 = ((jk2_1)object).a;
                    object3 = WK2.c(n3, context);
                    Intrinsics.checkNotNull(object3);
                } else {
                    bl2 = dV0.d(n3, 1);
                    if (!bl2) {
                        boolean bl3 = dV0.d(n3, 2);
                        if (bl3) {
                            object = new UnsupportedOperationException("Unsupported Async font load path");
                            throw object;
                        }
                        object2 = new StringBuilder("Unknown loading type ");
                        object3 = dV0.e(n3);
                        ((StringBuilder)object2).append(object3);
                        object3 = ((StringBuilder)object2).toString();
                        object = new IllegalArgumentException((String)object3);
                        throw object;
                    }
                    object3 = tl2_2.b;
                    object3 = object;
                    object3 = (jk2_1)object;
                    n3 = ((jk2_1)object3).a;
                    object3 = WK2.c(n3, context);
                    try {
                        Intrinsics.checkNotNull(object3);
                    }
                    catch (Throwable throwable) {
                        object3 = vl2_2.a(throwable);
                    }
                    bl2 = object3 instanceof tL2$b;
                    if (!bl2) {
                        object2 = object3;
                    }
                    object3 = object2;
                    object3 = (Typeface)object2;
                }
                object = ((jk2_1)object).d;
                object2 = It2.a((Typeface)object3, (sv0_1)object, context);
            }
            return object2;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(LU0 var1_1, f80_0 var2_2) {
        block13: {
            block14: {
                block12: {
                    block9: {
                        block10: {
                            block11: {
                                var3_3 = var2_2 instanceof Bh$a;
                                if (!var3_3) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (Bh$a)var2_2;
                                var5_5 = var4_4.e;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7 != 0) {
                                    var4_4.e = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new Bh$a(this, (f80_0)var2_2);
                                }
                                var2_2 = var4_4.c;
                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.e;
                                var7_7 = 2;
                                var9_9 = 1;
                                if (var6_6 == 0) break block9;
                                if (var6_6 == var9_9) break block10;
                                if (var6_6 != var7_7) break block11;
                                var1_1 = var4_4.b;
                                var4_4 = var4_4.a;
                                vl2_2.b(var2_2);
                                break block12;
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        vl2_2.b(var2_2);
                        return var2_2;
                    }
                    vl2_2.b(var2_2);
                    var10_10 = var1_1 instanceof ah_0;
                    var6_6 = 0;
                    var11_11 = null;
                    if (var10_10 != 0) break block13;
                    var10_10 = var1_1 instanceof jk2_1;
                    if (var10_10 == 0) break block14;
                    var2_2 = var1_1;
                    var2_2 = (jk2_1)var1_1;
                    var4_4.a = this;
                    var12_12 = var1_1;
                    var4_4.b = var12_12 = (jk2_1)var1_1;
                    var4_4.e = var7_7;
                    var12_12 = zj1_2.b((f80_0)var4_4);
                    var13_13 = new CancellableContinuationImpl(var9_9, (f80_0)var12_12);
                    var13_13.r();
                    var14_14 = var2_2.a;
                    var15_15 = new ch_0(var13_13, (jk2_1)var2_2);
                    var2_2 = WK2.a;
                    var16_16 = this.a;
                    var10_10 = var16_16.isRestricted();
                    if (var10_10 != 0) {
                        var10_10 = -4;
                        var15_15.callbackFailAsync(var10_10, null);
                    } else {
                        var17_17 = new TypedValue();
                        WK2.d(var16_16, var14_14, var17_17, 0, var15_15, false, false);
                    }
                    var2_2 = var13_13.q();
                    if (var2_2 == var8_8) {
                        var11_11 = "frame";
                        Intrinsics.checkNotNullParameter(var4_4, var11_11);
                    }
                    if (var2_2 == var8_8) {
                        return var8_8;
                    }
                    var4_4 = this;
                }
                var2_2 = (Typeface)var2_2;
                var1_1 = ((jk2_1)var1_1).d;
                var4_4 = var4_4.a;
                return It2.a((Typeface)var2_2, (sv0_1)var1_1, (Context)var4_4);
            }
            var4_4 = new StringBuilder("Unknown font type: ");
            var4_4.append(var1_1);
            var1_1 = var4_4.toString();
            var2_2 = new IllegalArgumentException((String)var1_1);
            throw var2_2;
        }
        ((ah_0)var1_1).getClass();
        var4_4.e = var9_9;
        throw null;
    }
}

