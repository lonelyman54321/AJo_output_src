/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Bs0
 */
public final class bs0_0 {
    public final long a;

    public /* synthetic */ bs0_0(long l2) {
        this.a = l2;
    }

    public static final float a(long l2) {
        return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
    }

    public static final float b(long l2) {
        return Float.intBitsToFloat((int)(l2 >> 32));
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bs0_0;
        boolean bl3 = false;
        if (bl2) {
            object = (bs0_0)object;
            long l2 = this.a;
            long l3 = ((bs0_0)object).a;
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
            charSequence = new StringBuilder();
            String string2 = xs0_0.b(bs0_0.b(l2));
            ((StringBuilder)charSequence).append((Object)string2);
            ((StringBuilder)charSequence).append(" x ");
            float f5 = bs0_0.a(l2);
            string2 = xs0_0.b(f5);
            ((StringBuilder)charSequence).append((Object)string2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "DpSize.Unspecified";
        }
        return charSequence;
    }
}

