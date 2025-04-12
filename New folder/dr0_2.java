/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.c;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;
import kotlinx.coroutines.internal.DispatchedContinuation;

/*
 * Renamed from dr0
 */
public final class dr0_2 {
    public static final gh3_2 a;
    public static final gh3_2 b;

    static {
        gh3_2 gh3_22;
        a = gh3_22 = new gh3_2("UNDEFINED");
        b = gh3_22 = new gh3_2("REUSABLE_CLAIMED");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(f80_0 var0, Object var1_2) {
        block22: {
            var2_5 = var0 instanceof DispatchedContinuation;
            if (!var2_5) {
                var0.resumeWith(var1_2);
                return;
            }
            var0 = (DispatchedContinuation)var0;
            var3_6 = tl2_2.a(var1_2);
            if (var3_6 == null) {
                var4_7 = var1_2;
            } else {
                var5_8 = false;
                var6_9 = null;
                var4_7 = new m00_0((Throwable)var3_6, false);
            }
            var3_6 = var0.d;
            var6_9 = var0.e;
            var7_10 = var6_9.getContext();
            var2_5 = dr0_2.c((c)var3_6, var7_10);
            var8_11 = true;
            if (var2_5) {
                var0.f = var4_7;
                var0.c = var8_11;
                var1_2 = var6_9.getContext();
                var3_6 = var0.d;
                dr0_2.b((c)var3_6, (CoroutineContext)var1_2, (Runnable)var0);
                return;
            }
            var3_6 = cn3_0.a();
            var9_12 = var3_6.Q0();
            if (var9_12) {
                var0.f = var4_7;
                var0.c = var8_11;
                var3_6.O0((DispatchedTask)var0);
                return;
            }
            var3_6.P0(var8_11);
            var4_7 = var6_9.getContext();
            var10_13 = i$a.a;
            var4_7 = var4_7.get((CoroutineContext$a)var10_13);
            var4_7 = (i)var4_7;
            if (var4_7 == null || (var9_12 = var4_7.isActive())) ** GOTO lbl45
            var1_2 = var4_7.w();
            var1_2 = vl2_2.a((Throwable)var1_2);
            var0.resumeWith(var1_2);
            ** GOTO lbl64
            {
                catch (Throwable var1_3) {
                    break block22;
                }
lbl45:
                // 1 sources

                var4_7 = var0.g;
                var10_13 = var6_9.getContext();
                var4_7 = bn3_0.c((CoroutineContext)var10_13, var4_7);
                var11_14 = var4_7 != (var11_14 = bn3_0.a) ? a90_0.c(var6_9, (CoroutineContext)var10_13, var4_7) : null;
                try {
                    var6_9.resumeWith(var1_2);
                    var1_2 = Unit.a;
                    if (var11_14 != null) {
                    }
                    ** GOTO lbl63
                }
                catch (Throwable var1_4) {}
                if (var11_14 == null) ** GOTO lbl59
                {
                    var5_8 = var11_14.E0();
                    if (var5_8 == false) throw var1_4;
lbl59:
                    // 2 sources

                    bn3_0.a((CoroutineContext)var10_13, var4_7);
                    throw var1_4;
                }
            }
            {
                block23: {
                    var12_15 = var11_14.E0();
                    if (!var12_15) break block23;
lbl63:
                    // 2 sources

                    bn3_0.a((CoroutineContext)var10_13, var4_7);
                }
                while (var12_15 = var3_6.S0()) {
                }
                return;
            }
        }
        try {
            var0.g(var1_3);
            return;
        }
        finally {
            var3_6.N0(var8_11);
        }
    }

    public static final void b(c c2, CoroutineContext coroutineContext, Runnable runnable2) {
        try {
            c2.J0(coroutineContext, runnable2);
            return;
        }
        catch (Throwable throwable) {
            DispatchException dispatchException = new DispatchException(throwable, c2, coroutineContext);
            throw dispatchException;
        }
    }

    public static final boolean c(c c2, CoroutineContext coroutineContext) {
        try {
            return c2.L0(coroutineContext);
        }
        catch (Throwable throwable) {
            DispatchException dispatchException = new DispatchException(throwable, c2, coroutineContext);
            throw dispatchException;
        }
    }
}

