/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class j
extends a
implements i {
    public static final j a;

    static {
        j j3;
        i$a i$a = i$a.a;
        a = j3 = new a(i$a);
    }

    public final ju_2 A(JobSupport jobSupport) {
        return l42_0.a;
    }

    public final fr0_1 G(Function1 function1) {
        return l42_0.a;
    }

    public final Object I0(f80_0 object) {
        object = new UnsupportedOperationException("This job is always active");
        throw object;
    }

    public final Sequence b() {
        return uz0_2.a;
    }

    public final void d(CancellationException cancellationException) {
    }

    public final boolean isActive() {
        return true;
    }

    public final boolean n() {
        return false;
    }

    public final boolean p() {
        return false;
    }

    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public final fr0_1 u(boolean bl2, boolean bl3, Function1 function1) {
        return l42_0.a;
    }

    public final CancellationException w() {
        IllegalStateException illegalStateException = new IllegalStateException("This job is always active");
        throw illegalStateException;
    }
}

