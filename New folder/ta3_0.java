/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from TA3
 */
public final class ta3_0
implements ma3_0 {
    public final int a;

    public ta3_0(int n3) {
        this.a = n3;
    }

    public final int a() {
        return 0;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c() {
        return this.a;
    }

    public final Ol d(Ol ol, Ol ol2, Ol ol4) {
        return ol4;
    }

    public final Ol e(long l2, Ol ol, Ol ol2, Ol ol4) {
        return ol4;
    }

    public final Ol f(long l2, Ol ol, Ol ol2, Ol ol4) {
        long l3 = this.a;
        long l4 = 1000000L;
        long l7 = l2 - (l3 *= l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return ol;
        }
        return ol2;
    }

    public final long g(Ol ol, Ol ol2, Ol ol4) {
        return (long)this.c() * 1000000L;
    }
}

