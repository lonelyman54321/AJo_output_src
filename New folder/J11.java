/*
 * Decompiled with CFR 0.152.
 */
public final class J11 {
    public final long a;

    public /* synthetic */ J11(long l2) {
        this.a = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof J11;
        boolean bl3 = false;
        if (bl2) {
            object = (J11)object;
            long l2 = this.a;
            long l3 = ((J11)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("GridItemSpan(packedValue=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

