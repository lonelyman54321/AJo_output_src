/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public class F83
extends qb3_0
implements dr1_1,
g83_0 {
    public F83$a b;

    public final void A(long l2) {
        this.z(l2);
    }

    public final I83 a() {
        J83.l();
        return qi_2.b;
    }

    public final void g(Rb3 rb3) {
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        rb3 = (F83$a)rb3;
        this.b = rb3;
    }

    public final Rb3 h() {
        return this.b;
    }

    public final Rb3 i(Rb3 object, Rb3 rb3, Rb3 rb32) {
        object = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord";
        Intrinsics.checkNotNull(rb3, (String)object);
        Rb3 rb33 = rb3;
        rb33 = (F83$a)rb3;
        Intrinsics.checkNotNull(rb32, (String)object);
        rb32 = (F83$a)rb32;
        long l2 = ((F83$a)rb33).c;
        long l3 = ((F83$a)rb32).c;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            rb3 = null;
        }
        return rb3;
    }

    public final String toString() {
        F83$a f83$a = (F83$a)A83.i(this.b);
        StringBuilder stringBuilder = new StringBuilder("MutableLongState(value=");
        long l2 = f83$a.c;
        stringBuilder.append(l2);
        stringBuilder.append(")@");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final long x() {
        return ((F83$a)A83.u((Rb3)this.b, (pb3_0)this)).c;
    }

    public final Long y() {
        return this.x();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void z(long l2) {
        Rb3 rb3 = (F83$a)A83.i(this.b);
        long l3 = rb3.c;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) return;
        F83$a f83$a = this.b;
        Object object2 = A83.c;
        synchronized (object2) {
            v83_0 v83_02 = A83.k();
            rb3 = A83.p(f83$a, this, v83_02, rb3);
            rb3.c = l2;
            Unit unit = Unit.a;
            A83.o(v83_02, this);
            return;
        }
    }
}

