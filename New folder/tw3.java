/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;

public final class tw3 {
    public static final kl_1 f;
    public final JA3 a;
    public long b;
    public kl_1 c;
    public boolean d;
    public float e;

    static {
        kl_1 kl_12;
        f = kl_12 = new kl_1(0.0f);
    }

    public tw3(Gl object) {
        Object object2 = FloatCompanionObject.INSTANCE;
        object2 = ya3_0.a;
        this.a = object = object.b((Vs3)object2);
        this.b = Long.MIN_VALUE;
        this.c = object = f;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(G60$c$a$a var1_1, G60$c$a$b var2_2, f80_0 var3_3) {
        block20: {
            block22: {
                block23: {
                    var4_4 = this;
                    var5_5 = var3_3;
                    var6_10 = var3_3 instanceof qw3;
                    if (!var6_10) ** GOTO lbl-1000
                    var7_11 = var3_3;
                    var7_11 = (qw3)var3_3;
                    var8_12 = var7_11.g;
                    var9_13 = -1 << -1;
                    var10_14 = -0.0f;
                    var11_15 = var8_12 & var9_13;
                    if (var11_15 != 0) {
                        var7_11.g = var8_12 -= var9_13;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_11 = new qw3(var4_4, (f80_0)var5_5);
                    }
                    var5_5 = var7_11.e;
                    var12_16 = j90_0.COROUTINE_SUSPENDED;
                    var9_13 = var7_11.g;
                    var13_17 = tw3.f;
                    var14_18 = -9223372036854775808L;
                    var16_19 = false;
                    var17_20 = null;
                    var18_21 = 2;
                    var19_22 = 1;
                    var20_23 = 1.4E-45f;
                    if (var9_13 == 0) break block22;
                    if (var9_13 == var19_22) break block23;
                    if (var9_13 != var18_21) {
                        var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var5_5;
                    }
                    var12_16 = (Function0)var7_11.b;
                    var7_11 = var7_11.a;
                    try {
                        vl2_2.b(var5_5);
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var5_6) {
                        break block20;
                    }
                }
                var10_14 = var7_11.d;
                var21_24 = var7_11.c;
                var22_25 = (Function1)var7_11.b;
                var23_26 = var7_11.a;
                try {
                    vl2_2.b(var5_5);
                    var5_5 = var22_25;
                    var24_27 = var10_14;
                    var25_28 = var23_26;
                    var26_29 = var21_24;
                    var21_24 = var7_11;
                    var7_11 = var26_29;
                    ** GOTO lbl93
                }
                catch (Throwable var5_7) {
                    var7_11 = var23_26;
                    break block20;
                }
            }
            vl2_2.b(var5_5);
            var27_30 = var4_4.d ^ var19_22;
            if (var27_30 == 0) {
                var7_11 = "animateToZero called while previous animation is running".toString();
                var5_5 = new IllegalStateException((String)var7_11);
                throw var5_5;
            }
            var5_5 = var7_11.getContext();
            var25_28 = gq1$a_0.a;
            if ((var5_5 = (gq1_0)var5_5.get((CoroutineContext$a)var25_28)) != null) {
                var28_31 = var5_5.C();
            } else {
                var27_30 = 1065353216;
                var28_31 = 1.0f;
            }
            var4_4.d = var19_22;
            var24_27 = var28_31;
            var25_28 = var4_4;
            var21_24 = var7_11;
            var5_5 = var1_1;
            var7_11 = var2_2;
            do {
                var29_32 = var25_28.e;
                cfr_temp_0 = (var29_32 = Math.abs(var29_32)) - (var30_33 = 0.01f);
                var31_34 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                if (var31_34 /* !! */  < 0) break;
                var23_26 = new rw3((tw3)var25_28, var24_27, (Function1)var5_5);
                var21_24.a = var25_28;
                var32_35 = var5_5;
                var21_24.b = var32_35 = (fx0_2)var5_5;
                var21_24.c = var7_11;
                var21_24.d = var24_27;
                var21_24.g = var19_22;
                var32_35 = var21_24.getContext();
                var23_26 = (var32_35 = aQ1.a((CoroutineContext)var32_35)).R((Function1)var23_26, (f80_0)var21_24);
                if (var23_26 == var12_16) {
                    return var12_16;
                }
lbl93:
                // 3 sources

                var7_11.invoke();
            } while ((var31_34 /* !! */  = (cfr_temp_1 = var24_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) != false);
lbl-1000:
            // 1 sources

            {
                var12_16.invoke();
            }
            var7_11.b = var14_18;
            var7_11.c = var13_17;
            var7_11.d = false;
            return Unit.a;
            finally {
                var26_29 = var25_28;
            }
        }
        var7_11.b = var14_18;
        var7_11.c = var13_17;
        var7_11.d = false;
        throw var5_9;
    }
}

