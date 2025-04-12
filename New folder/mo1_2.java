/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

/*
 * Renamed from Mo1
 */
public final class mo1_2
implements Comparable {
    public static final Mo1$a e;
    public static final mo1_2 f;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        Object object = new Mo1$a(null);
        e = object;
        f = object = new mo1_2();
    }

    public mo1_2() {
        Object object;
        IntRange intRange;
        int n3;
        int n4;
        int n7;
        this.a = n7 = 1;
        this.b = n4 = 9;
        this.c = n3 = 21;
        int n8 = 255;
        super(0, n8, n7);
        boolean bl2 = intRange.e(n7);
        if (bl2) {
            super(0, n8, n7);
            n4 = (int)(intRange.e(n4) ? 1 : 0);
            if (n4 != 0 && (n7 = (int)(((IntRange)(object = new c(0, n8, n7))).e(n3) ? 1 : 0)) != 0) {
                this.d = 67861;
                return;
            }
        }
        object = "Version components are out of range: 1.9.21".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final int compareTo(Object object) {
        object = (mo1_2)object;
        Intrinsics.checkNotNullParameter(object, "other");
        int n3 = this.d;
        int n4 = ((mo1_2)object).d;
        return n3 - n4;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof mo1_2;
        if (bl3) {
            object = (mo1_2)object;
        } else {
            n3 = 0;
            object = null;
        }
        bl3 = false;
        if (object == null) {
            return false;
        }
        int n4 = this.d;
        n3 = ((mo1_2)object).d;
        if (n4 != n3) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.a;
        stringBuilder.append(n3);
        n3 = 46;
        stringBuilder.append((char)n3);
        int n4 = this.b;
        stringBuilder.append(n4);
        stringBuilder.append((char)n3);
        n3 = this.c;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

