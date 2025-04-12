/*
 * Decompiled with CFR 0.152.
 */
public final class E70 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public E70(long l2, long l3, long l4, long l7, long l8) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l7;
        this.e = l8;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null && (bl2 = object instanceof E70)) {
            object = (E70)object;
            long l2 = this.a;
            long l3 = ((E70)object).a;
            bl2 = OX.c(l2, l3);
            if (!bl2) {
                return false;
            }
            l3 = this.b;
            l2 = ((E70)object).b;
            bl2 = OX.c(l3, l2);
            if (!bl2) {
                return false;
            }
            l3 = this.c;
            l2 = ((E70)object).c;
            bl2 = OX.c(l3, l2);
            if (!bl2) {
                return false;
            }
            l3 = this.d;
            l2 = ((E70)object).d;
            bl2 = OX.c(l3, l2);
            if (!bl2) {
                return false;
            }
            l3 = this.e;
            l2 = ((E70)object).e;
            boolean bl4 = OX.c(l3, l2);
            if (!bl4) {
                return false;
            }
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = OX.m;
        n3 = mt3_0.a(this.a);
        int n4 = 31;
        n3 *= 31;
        long l2 = this.b;
        n3 = D70.a(n3, n4, l2);
        l2 = this.c;
        n3 = D70.a(n3, n4, l2);
        l2 = this.d;
        n3 = D70.a(n3, n4, l2);
        return mt3_0.a(this.e) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContextMenuColors(backgroundColor=");
        String string2 = OX.i(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", textColor=");
        string2 = OX.i(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", iconColor=");
        string2 = OX.i(this.c);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", disabledTextColor=");
        string2 = OX.i(this.d);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", disabledIconColor=");
        string2 = OX.i(this.e);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

