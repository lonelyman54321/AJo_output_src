/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lu3
 */
public final class lu3_0
implements Comparable {
    public static final lu3$a b;
    public final short a;

    static {
        lu3$a lu3$a;
        b = lu3$a = new lu3$a(null);
    }

    public /* synthetic */ lu3_0(short s7) {
        this.a = s7;
    }

    public final /* synthetic */ int compareTo(Object object) {
        int n3 = ((lu3_0)object).a;
        int n4 = this.a;
        char c2 = (char)-1;
        return Intrinsics.compare(n4 &= c2, n3 &= c2);
    }

    public final boolean equals(Object object) {
        short s7 = object instanceof lu3_0;
        boolean bl2 = false;
        if (s7 != 0) {
            object = (lu3_0)object;
            s7 = this.a;
            short s8 = ((lu3_0)object).a;
            if (s7 == s8) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        short s7 = this.a;
        return String.valueOf((char)-1 & s7);
    }
}

