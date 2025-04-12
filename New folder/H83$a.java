/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class H83$a
extends Rb3 {
    public Object c;

    public H83$a(Object object) {
        this.c = object;
    }

    public final void a(Rb3 object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.c = object = ((H83$a)object).c;
    }

    public final Rb3 b() {
        Object object = this.c;
        H83$a h83$a = new H83$a(object);
        return h83$a;
    }
}

