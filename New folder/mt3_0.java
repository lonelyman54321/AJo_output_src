/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/*
 * Renamed from Mt3
 */
public final class mt3_0
implements Comparable {
    public static final Mt3$a b;
    public final long a;

    static {
        Mt3$a mt3$a;
        b = mt3$a = new Mt3$a(null);
    }

    public /* synthetic */ mt3_0(long l2) {
        this.a = l2;
    }

    public static int a(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final int compareTo(Object object) {
        long l2 = ((mt3_0)object).a;
        long l3 = this.a;
        long l4 = Long.MIN_VALUE;
        return Intrinsics.compare(l3 ^= l4, l2 ^= l4);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof mt3_0;
        boolean bl3 = false;
        if (bl2) {
            object = (mt3_0)object;
            long l2 = this.a;
            long l3 = ((mt3_0)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return mt3_0.a(this.a);
    }

    public final String toString() {
        String string2;
        long l2 = this.a;
        int n3 = 10;
        long l3 = 0L;
        String string3 = "toString(...)";
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object >= 0) {
            n3 = CharsKt.checkRadix(n3);
            string2 = Long.toString(l2, n3);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        } else {
            int n4 = 1;
            long l4 = l2 >>> n4;
            long l7 = n3;
            l3 = l4 / l7 << n4;
            long l8 = (l2 -= (l4 = l3 * l7)) - l7;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object >= 0) {
                l2 -= l7;
                l4 = 1L;
                l3 += l4;
            }
            StringBuilder stringBuilder = new StringBuilder();
            int n7 = CharsKt.checkRadix(n3);
            String string4 = Long.toString(l3, n7);
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            stringBuilder.append(string4);
            n3 = CharsKt.checkRadix(n3);
            string2 = Long.toString(l2, n3);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

