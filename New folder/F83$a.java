/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class F83$a
extends Rb3 {
    public long c;

    public F83$a(long l2) {
        this.c = l2;
    }

    public final void a(Rb3 rb3) {
        long l2;
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.c = l2 = ((F83$a)rb3).c;
    }

    public final Rb3 b() {
        long l2 = this.c;
        F83$a f83$a = new F83$a(l2);
        return f83$a;
    }
}

