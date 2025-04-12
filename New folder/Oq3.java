/*
 * Decompiled with CFR 0.152.
 */
public final class Oq3 {
    public static final long b;
    public static final /* synthetic */ int c;
    public final long a;

    static {
        float f5 = 0.5f;
        b = Pq3.a(f5, f5);
    }

    public /* synthetic */ Oq3(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    public static final float b(long l2) {
        return Float.intBitsToFloat((int)(l2 >> 32));
    }

    public static final float c(long l2) {
        return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
    }

    public static String d(long l2) {
        StringBuilder stringBuilder = new StringBuilder("TransformOrigin(packedValue=");
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Oq3;
        boolean bl3 = false;
        if (bl2) {
            object = (Oq3)object;
            long l2 = this.a;
            long l3 = ((Oq3)object).a;
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
        return Oq3.d(this.a);
    }
}

