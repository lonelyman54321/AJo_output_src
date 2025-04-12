/*
 * Decompiled with CFR 0.152.
 */
public final class A63 {
    public static final A63 c;
    public final int a;
    public final int b;

    static {
        A63 a63;
        int n3 = -1;
        c = a63 = new A63(n3, n3);
        new A63(0, 0);
    }

    public A63(int n3, int n4) {
        int n7 = -1;
        n7 = n3 != n7 && n3 < 0 || n4 != n7 && n4 < 0 ? 0 : 1;
        ct3.a(n7 != 0);
        this.a = n3;
        this.b = n4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n3 = object instanceof A63;
        if (n3 != 0) {
            int n4;
            object = (A63)object;
            n3 = this.a;
            int n7 = ((A63)object).a;
            if (n3 == n7 && (n3 = this.b) == (n4 = ((A63)object).b)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = n3 << 16;
        n3 = n3 >>> 16 | n4;
        n4 = this.b;
        return n3 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append("x");
        n3 = this.b;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

