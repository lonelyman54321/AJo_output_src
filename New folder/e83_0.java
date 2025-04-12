/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E83
 */
public class e83_0
extends qb3_0
implements vr1_1,
g83_0 {
    public E83$a b;

    public final I83 a() {
        J83.l();
        return qi_2.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void e(int n3) {
        Rb3 rb3 = (E83$a)A83.i(this.b);
        int n4 = rb3.c;
        if (n4 == n3) return;
        E83$a e83$a = this.b;
        Object object = A83.c;
        synchronized (object) {
            v83_0 v83_02 = A83.k();
            rb3 = A83.p(e83$a, this, v83_02, rb3);
            rb3.c = n3;
            Unit unit = Unit.a;
            A83.o(v83_02, this);
            return;
        }
    }

    public final void g(Rb3 rb3) {
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        rb3 = (E83$a)rb3;
        this.b = rb3;
    }

    public final Rb3 h() {
        return this.b;
    }

    public final Rb3 i(Rb3 object, Rb3 rb3, Rb3 rb32) {
        object = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord";
        Intrinsics.checkNotNull(rb3, (String)object);
        Rb3 rb33 = rb3;
        rb33 = (E83$a)rb3;
        Intrinsics.checkNotNull(rb32, (String)object);
        rb32 = (E83$a)rb32;
        int n3 = ((E83$a)rb33).c;
        int n4 = ((E83$a)rb32).c;
        if (n3 != n4) {
            rb3 = null;
        }
        return rb3;
    }

    public final int o() {
        return ((E83$a)A83.u((Rb3)this.b, (pb3_0)this)).c;
    }

    public final String toString() {
        E83$a e83$a = (E83$a)A83.i(this.b);
        StringBuilder stringBuilder = new StringBuilder("MutableIntState(value=");
        int n3 = e83$a.c;
        stringBuilder.append(n3);
        stringBuilder.append(")@");
        n3 = this.hashCode();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final Integer x() {
        return this.o();
    }

    public final void y(int n3) {
        this.e(n3);
    }
}

