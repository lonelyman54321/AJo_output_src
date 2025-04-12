/*
 * Decompiled with CFR 0.152.
 */
public final class Yv2 {
    public final long a;

    public /* synthetic */ Yv2(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static String b(long l2) {
        StringBuilder stringBuilder = new StringBuilder("PointerId(value=");
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Yv2;
        boolean bl3 = false;
        if (bl2) {
            object = (Yv2)object;
            long l2 = this.a;
            long l3 = ((Yv2)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
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
        return Yv2.b(this.a);
    }
}

