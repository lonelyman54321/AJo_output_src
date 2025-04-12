/*
 * Decompiled with CFR 0.152.
 */
public final class sm3 {
    public final long a;
    public final long b;

    public sm3(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof sm3;
        if (!bl3) {
            return false;
        }
        object = (sm3)object;
        long l2 = this.a;
        long l3 = ((sm3)object).a;
        bl3 = OX.c(l2, l3);
        if (!bl3) {
            return false;
        }
        l3 = this.b;
        l2 = ((sm3)object).b;
        boolean bl4 = OX.c(l3, l2);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = OX.m;
        n3 = mt3_0.a(this.a) * 31;
        return mt3_0.a(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectionColors(selectionHandleColor=");
        String string2 = OX.i(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", selectionBackgroundColor=");
        string2 = OX.i(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

