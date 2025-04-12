/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class E83$a
extends Rb3 {
    public int c;

    public E83$a(int n3) {
        this.c = n3;
    }

    public final void a(Rb3 rb3) {
        int n3;
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.c = n3 = ((E83$a)rb3).c;
    }

    public final Rb3 b() {
        int n3 = this.c;
        E83$a e83$a = new E83$a(n3);
        return e83$a;
    }
}

