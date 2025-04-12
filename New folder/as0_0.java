/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from As0
 */
public final class as0_0 {
    public final long a;

    public /* synthetic */ as0_0(long l2) {
        this.a = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof as0_0;
        boolean bl3 = false;
        if (bl2) {
            object = (as0_0)object;
            long l2 = this.a;
            long l3 = ((as0_0)object).a;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        CharSequence charSequence;
        long l2 = this.a;
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            charSequence = new StringBuilder("(");
            String string2 = xs0_0.b(Float.intBitsToFloat((int)(l2 >> 32)));
            ((StringBuilder)charSequence).append((Object)string2);
            ((StringBuilder)charSequence).append(", ");
            long l8 = 0xFFFFFFFFL;
            long l12 = l2 & l8;
            int n3 = (int)l12;
            string2 = xs0_0.b(Float.intBitsToFloat(n3));
            ((StringBuilder)charSequence).append((Object)string2);
            char c2 = ')';
            ((StringBuilder)charSequence).append(c2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "DpOffset.Unspecified";
        }
        return charSequence;
    }
}

