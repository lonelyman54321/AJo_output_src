/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qb3
 */
public abstract class qb3_0
implements pb3_0 {
    public final Uq a;

    public qb3_0() {
        Uq uq;
        super(0);
        this.a = uq;
    }

    public /* synthetic */ Rb3 i(Rb3 rb3, Rb3 rb32, Rb3 rb33) {
        return null;
    }

    public final boolean t(int n3) {
        Uq uq = this.a;
        int n4 = uq.get();
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final void v(int n3) {
        int n4;
        int n7;
        Uq uq;
        boolean bl2;
        do {
            if ((n4 = (n7 = (uq = this.a).get()) & n3) == 0) continue;
            return;
        } while (!(bl2 = uq.compareAndSet(n7, n4 = n7 | n3)));
    }
}

