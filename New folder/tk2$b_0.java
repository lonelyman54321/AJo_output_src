/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tk2$b
 */
public final class tk2$b_0
extends qg3_2
implements gx0_2 {
    public am2_0 a;
    public int b;
    public /* synthetic */ sk2$a c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ sk2 e;

    public tk2$b_0(f80_0 f80_02, sk2 sk22) {
        this.e = sk22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (sk2$a)object;
        boolean bl2 = (Boolean)object2;
        object3 = (f80_0)object3;
        sk2 sk22 = this.e;
        tk2$b_0 tk2$b_0 = new tk2$b_0((f80_0)object3, sk22);
        tk2$b_0.c = object;
        tk2$b_0.d = bl2;
        object = Unit.a;
        return tk2$b_0.invokeSuspend(object);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block22: {
            block19: {
                block20: {
                    block21: {
                        var2_2 = this;
                        var3_3 = j90_0.COROUTINE_SUSPENDED;
                        var4_4 = this.b;
                        var5_5 = null;
                        var6_6 = 2;
                        var7_7 = this.e;
                        var8_8 = 1;
                        if (var4_4 == 0) break block19;
                        if (var4_4 == var8_8) break block20;
                        if (var4_4 != var6_6) break block21;
                        var3_3 = this.a;
                        var9_9 = this.c;
                        vl2_2.b(var1_1);
                        var10_10 = var1_1;
                        ** GOTO lbl47
                    }
                    var3_3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var3_3;
                }
                var9_9 = this.c;
                vl2_2.b(var1_1);
                var11_11 = var1_1;
                break block22;
            }
            vl2_2.b(var1_1);
            var9_9 = this.c;
            if (var9_9 != null && (var11_11 = var9_9.a) != null) {
                var11_11 = var11_11.b;
            } else {
                var12_12 = false;
                var11_11 = null;
            }
            var2_2.c = var9_9;
            var2_2.b = var8_8;
            var11_11 = sk2.a(var7_7, (am2_0)var11_11, this);
            if (var11_11 == var3_3) {
                return var3_3;
            }
        }
        var11_11 = (am2_0)var11_11;
        if (var9_9 != null && (var13_13 = var9_9.a) != null) {
            var2_2.c = var9_9;
            var2_2.a = var11_11;
            var2_2.b = var6_6;
            var10_10 = var13_13.e(this);
            if (var10_10 == var3_3) {
                return var3_3;
            }
            var3_3 = var11_11;
lbl47:
            // 2 sources

            var10_10 = (cm2)var10_10;
        } else {
            var6_6 = 0;
            var10_10 = null;
            var3_3 = var11_11;
        }
        if (var10_10 != null) {
            var11_11 = var10_10.a;
        } else {
            var12_12 = false;
            var11_11 = null;
        }
        var11_11 = (Collection)var11_11;
        if ((var11_11 == null || (var12_12 = var11_11.isEmpty())) && var9_9 != null && (var11_11 = var9_9.b) != null && (var13_13 = var11_11.a) != null && (var14_14 = (var13_13 = (Collection)var13_13).isEmpty() ^ var8_8) == var8_8) {
            var10_10 = var11_11;
        }
        if (var10_10 != null) {
            var15_15 = var10_10.b;
        } else {
            var8_8 = 0;
            var15_15 = null;
        }
        if (var15_15 == null) {
            if (var9_9 != null && (var15_15 = var9_9.b) != null) {
                var15_15 = var15_15.b;
            } else {
                var8_8 = 0;
                var15_15 = null;
            }
            if (var15_15 != null) {
                var10_10 = var9_9.b;
            }
        }
        if (var10_10 == null) {
            var15_15 = var7_7.b;
lbl75:
            // 3 sources

            while (true) {
                continue;
                break;
            }
        }
        var15_15 = var3_3.a((cm2)var10_10);
        var11_11 = Build.ID;
        if (var11_11 == null || !(var12_12 = Log.isLoggable((String)(var11_11 = "Paging"), (int)(var14_14 = 3)))) ** GOTO lbl75
        var11_11 = new StringBuilder("Refresh key ");
        var11_11.append(var15_15);
        var11_11.append(" returned from PagingSource ");
        var11_11.append(var3_3);
        var11_11 = var11_11.toString();
        var13_13 = "message";
        Intrinsics.checkNotNullParameter(var11_11, (String)var13_13);
        ** while (true)
        var16_16 = var15_15;
        if (var9_9 != null && (var15_15 = var9_9.a) != null) {
            var15_15 = var15_15.l;
            var15_15.d(null);
        }
        if (var9_9 != null && (var9_9 = var9_9.c) != null) {
            var9_9.d(null);
        }
        var5_5 = var7_7.c;
        var17_17 = var7_7.e.b;
        var15_15 = var18_18;
        var18_18 = new FunctionReferenceImpl(0, var7_7, sk2.class, "refresh", "refresh()V", 0);
        var13_13 = var15_15;
        var19_19 = var16_16;
        var16_16 = var17_17;
        var17_17 = var10_10;
        var15_15 = new yk2_1(var19_19, (am2_0)var3_3, var5_5, (Y40)var16_16, (cm2)var10_10, var18_18);
        var3_3 = mm0.a();
        var9_9 = new sk2$a((yk2_1)var15_15, (cm2)var10_10, (xl1_2)var3_3);
        return var9_9;
    }
}

