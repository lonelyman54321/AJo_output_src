/*
 * Decompiled with CFR 0.152.
 */
public final class KX2 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Tl3 f;

    public KX2(int n3, int n4, int n7, Tl3 tl3) {
        this.a = 1L;
        this.b = 1;
        this.c = n3;
        this.d = n4;
        this.e = n7;
        this.f = tl3;
    }

    public final MX2$a a(int n3) {
        uk2_0 uk2_02 = ky2_0.a(this.f, n3);
        long l2 = this.a;
        MX2$a mX2$a = new MX2$a(uk2_02, n3, l2);
        return mX2$a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectionInfo(id=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", range=(");
        int n3 = this.c;
        stringBuilder.append(n3);
        char c2 = '-';
        stringBuilder.append(c2);
        Tl3 tl3 = this.f;
        uk2_0 uk2_02 = ky2_0.a(tl3, n3);
        stringBuilder.append((Object)uk2_02);
        stringBuilder.append(',');
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(c2);
        uk2_02 = ky2_0.a(tl3, n3);
        stringBuilder.append((Object)uk2_02);
        stringBuilder.append("), prevOffset=");
        n3 = this.e;
        return tu.a(stringBuilder, n3, ')');
    }
}

