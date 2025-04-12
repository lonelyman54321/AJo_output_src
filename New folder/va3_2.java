/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from VA3
 */
public final class va3_2
implements ma3_0 {
    public final int a;
    public final int b;
    public final OA3 c;

    public va3_2(int n3, int n4, cx0_0 cx0_02) {
        OA3 oA3;
        this.a = n3;
        this.b = n4;
        oS0 oS02 = new oS0(n3, n4, cx0_02);
        this.c = oA3 = new OA3(oS02);
    }

    public final int a() {
        return this.a;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c() {
        return this.b;
    }

    public final Ol d(Ol ol, Ol ol2, Ol ol4) {
        long l2 = this.g(ol, ol2, ol4);
        return this.c.e(l2, ol, ol2, ol4);
    }

    public final Ol e(long l2, Ol ol, Ol ol2, Ol ol4) {
        return this.c.e(l2, ol, ol2, ol4);
    }

    public final Ol f(long l2, Ol ol, Ol ol2, Ol ol4) {
        return this.c.f(l2, ol, ol2, ol4);
    }

    public final long g(Ol ol, Ol ol2, Ol ol4) {
        int n3 = this.c();
        return (long)(this.a() + n3) * 1000000L;
    }
}

