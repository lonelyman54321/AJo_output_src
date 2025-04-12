/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vl3
 */
public final class vl3_0 {
    public static final vl3_0 c;
    public final long a;
    public final long b;

    static {
        vl3_0 vl3_02;
        long l2 = Em3.f(0);
        long l3 = Em3.f(0);
        c = vl3_02 = new vl3_0(l2, l3);
    }

    public vl3_0(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof vl3_0;
        if (!bl3) {
            return false;
        }
        object = (vl3_0)object;
        long l2 = this.a;
        long l3 = ((vl3_0)object).a;
        bl3 = Dm3.a(l2, l3);
        if (!bl3) {
            return false;
        }
        l3 = this.b;
        l2 = ((vl3_0)object).b;
        boolean bl4 = Dm3.a(l3, l2);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Dm3.d(this.a) * 31;
        return Dm3.d(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextIndent(firstLine=");
        String string2 = Dm3.e(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", restLine=");
        string2 = Dm3.e(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

