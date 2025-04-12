/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class D83$a
extends Rb3 {
    public float c;

    public D83$a(float f5) {
        this.c = f5;
    }

    public final void a(Rb3 rb3) {
        float f5;
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.c = f5 = ((D83$a)rb3).c;
    }

    public final Rb3 b() {
        float f5 = this.c;
        D83$a d83$a = new D83$a(f5);
        return d83$a;
    }
}

