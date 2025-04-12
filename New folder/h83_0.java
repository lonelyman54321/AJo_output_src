/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H83
 */
public class h83_0
extends qb3_0
implements g83_0 {
    public final I83 b;
    public H83$a c;

    public h83_0(Object object, I83 object2) {
        boolean bl2;
        this.b = object2;
        object2 = new H83$a(object);
        Object object3 = A83.b.a();
        int n3 = 1;
        if (object3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2) {
            object3 = new H83$a(object);
            ((Rb3)object3).a = n3;
            ((Rb3)object2).b = object3;
        }
        this.c = object2;
    }

    public final I83 a() {
        return this.b;
    }

    public final void g(Rb3 rb3) {
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        rb3 = (H83$a)rb3;
        this.c = rb3;
    }

    public final Object getValue() {
        return ((H83$a)A83.u((Rb3)this.c, (pb3_0)this)).c;
    }

    public final Rb3 h() {
        return this.c;
    }

    public final Rb3 i(Rb3 object, Rb3 rb3, Rb3 object2) {
        Object object3 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>";
        Intrinsics.checkNotNull(object, (String)object3);
        object = (H83$a)object;
        Intrinsics.checkNotNull(rb3, (String)object3);
        object = rb3;
        object = (H83$a)rb3;
        Intrinsics.checkNotNull(object2, (String)object3);
        object2 = (H83$a)object2;
        object = ((H83$a)object).c;
        object2 = ((H83$a)object2).c;
        object3 = this.b;
        boolean bl2 = object3.b(object, object2);
        if (!bl2) {
            rb3 = null;
        }
        return rb3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void setValue(Object object) {
        Rb3 rb3 = (H83$a)A83.i(this.c);
        Object object2 = this.b;
        Object object3 = rb3.c;
        boolean bl2 = object2.b(object3, object);
        if (bl2) return;
        object2 = this.c;
        object3 = A83.c;
        synchronized (object3) {
            v83_0 v83_02 = A83.k();
            rb3 = A83.p((Rb3)object2, this, v83_02, rb3);
            rb3.c = object;
            object = Unit.a;
            A83.o(v83_02, this);
            return;
        }
    }

    public final String toString() {
        Object object = (H83$a)A83.i(this.c);
        StringBuilder stringBuilder = new StringBuilder("MutableState(value=");
        object = ((H83$a)object).c;
        stringBuilder.append(object);
        stringBuilder.append(")@");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

