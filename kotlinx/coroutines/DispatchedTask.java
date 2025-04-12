/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.scheduling.Task;

public abstract class DispatchedTask
extends Task {
    public int c;

    public DispatchedTask(int n3) {
        this.c = n3;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract f80_0 c();

    public Throwable d(Object object) {
        boolean bl2 = object instanceof m00_0;
        Throwable throwable = null;
        object = bl2 ? (m00_0)object : null;
        if (object != null) {
            throwable = ((m00_0)object).a;
        }
        return throwable;
    }

    public Object f(Object object) {
        return object;
    }

    public final void g(Throwable throwable) {
        CharSequence charSequence = new StringBuilder("Fatal exception in coroutines machinery for ");
        charSequence.append(this);
        charSequence.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        charSequence = charSequence.toString();
        m90_0 m90_02 = new Error((String)charSequence, throwable);
        g90_0.a(this.c().getContext(), m90_02);
    }

    public abstract Object h();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block15: {
            try {
                var1_1 = this.c();
                var2_5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>";
                Intrinsics.checkNotNull(var1_1, (String)var2_5);
                var1_1 = (DispatchedContinuation)var1_1;
                var2_5 = var1_1.e;
                var1_1 = var1_1.g;
                var3_7 = var2_5.getContext();
                var1_1 = bn3_0.c(var3_7, var1_1);
                var4_8 = bn3_0.a;
                var5_9 = null;
                if (var1_1 != var4_8) {
                    var4_8 = a90_0.c((f80_0)var2_5, var3_7, var1_1);
                }
                var6_10 = false;
                var4_8 = null;
            }
            catch (Throwable var1_2) {}
            catch (DispatchException var1_3) {}
            try {
                var7_11 = var2_5.getContext();
                var8_12 = this.h();
                var9_13 = this.d(var8_12);
                if (var9_13 != null) break block15;
                var10_14 = this.c;
                if ((var10_14 = (int)er0_1.a(var10_14)) == 0) break block15;
                var5_9 = i$a.a;
                var5_9 = var7_11.get((CoroutineContext$a)var5_9);
                var5_9 = (i)var5_9;
            }
            catch (Throwable var2_6) {
                ** GOTO lbl55
            }
        }
        if (var5_9 != null && !(var11_15 = var5_9.isActive())) {
            var5_9 = var5_9.w();
            this.b((CancellationException)var5_9);
            var7_11 = tl2_2.b;
            var5_9 = vl2_2.a((Throwable)var5_9);
            var2_5.resumeWith(var5_9);
        } else if (var9_13 != null) {
            var5_9 = tl2_2.b;
            var5_9 = vl2_2.a(var9_13);
            var2_5.resumeWith(var5_9);
        } else {
            var5_9 = tl2_2.b;
            var5_9 = this.f(var8_12);
            var2_5.resumeWith(var5_9);
        }
        var2_5 = Unit.a;
        if (var4_8 == null) ** GOTO lbl53
        {
            var12_16 = var4_8.E0();
            if (var12_16 == false) return;
lbl53:
            // 2 sources

            bn3_0.a(var3_7, var1_1);
            return;
lbl55:
            // 1 sources

            if (var4_8 != null) {
                var6_10 = var4_8.E0();
                if (var6_10 == false) throw var2_6;
            }
            bn3_0.a(var3_7, var1_1);
            throw var2_6;
        }
    }
}

