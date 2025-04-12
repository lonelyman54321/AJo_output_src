/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wa1
 */
public final class wa1_1 {
    public static final wa1_1 d;
    public static final wa1_1 e;
    public static final wa1_1 f;
    public static final wa1_1 g;
    public static final wa1_1 h;
    public final String a;
    public final int b;
    public final int c;

    static {
        wa1_1 wa1_12;
        String string2 = "HTTP";
        d = wa1_12 = new wa1_1(string2, 2, 0);
        int n3 = 1;
        e = wa1_12 = new wa1_1(string2, n3, n3);
        f = wa1_12 = new wa1_1(string2, n3, 0);
        g = wa1_12 = new wa1_1("SPDY", 3, 0);
        h = wa1_12 = new wa1_1("QUIC", n3, 0);
    }

    public wa1_1(String string2, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof wa1_1;
        if (n3 == 0) {
            return false;
        }
        object = (wa1_1)object;
        String string2 = this.a;
        String string3 = ((wa1_1)object).a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((wa1_1)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        int n7 = ((wa1_1)object).c;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append('/');
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append('.');
        n3 = this.c;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

