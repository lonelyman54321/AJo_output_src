/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class hI3$a {
    public final long a;
    public final long b;

    public hI3$a(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<hI3$a> clazz2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null && (bl2 = Intrinsics.areEqual(clazz2 = hI3$a.class, clazz = object.getClass()))) {
            long l2;
            long l3;
            object = (hI3$a)object;
            long l4 = ((hI3$a)object).a;
            long l7 = this.a;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false || (l3 = (l2 = (l4 = ((hI3$a)object).b) - (l7 = this.b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", flexIntervalMillis=");
        l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

