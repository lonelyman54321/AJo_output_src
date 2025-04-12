/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class P83$a
extends Rb3 {
    public ir2 c;
    public int d;
    public int e;

    public P83$a(ir2 ir22) {
        this.c = ir22;
    }

    public final void a(Rb3 object) {
        Object object2 = Q83.a;
        synchronized (object2) {
            int n3;
            int n4;
            Object object3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>";
            Intrinsics.checkNotNull(object, (String)object3);
            object3 = object;
            object3 = (P83$a)object;
            this.c = object3 = ((P83$a)object3).c;
            object3 = object;
            object3 = (P83$a)object;
            this.d = n4 = ((P83$a)object3).d;
            object = (P83$a)object;
            this.e = n3 = ((P83$a)object).e;
            object = Unit.a;
            return;
        }
    }

    public final Rb3 b() {
        ir2 ir22 = this.c;
        P83$a p83$a = new P83$a(ir22);
        return p83$a;
    }
}

