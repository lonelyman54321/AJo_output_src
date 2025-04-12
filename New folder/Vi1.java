/*
 * Decompiled with CFR 0.152.
 */
public final class Vi1 {
    public static final Vi1 e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        Vi1 vi1;
        e = vi1 = new Vi1(0, 0, 0, 0);
    }

    public Vi1(int n3, int n4, int n7, int n8) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Vi1;
        if (n3 == 0) {
            return false;
        }
        object = (Vi1)object;
        int n4 = this.a;
        n3 = ((Vi1)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((Vi1)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((Vi1)object).c;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d;
        int n7 = ((Vi1)object).d;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IntRect.fromLTRB(");
        int n3 = this.a;
        stringBuilder.append(n3);
        String string2 = ", ";
        stringBuilder.append(string2);
        int n4 = this.b;
        stringBuilder.append(n4);
        stringBuilder.append(string2);
        n4 = this.c;
        stringBuilder.append(n4);
        stringBuilder.append(string2);
        n3 = this.d;
        return tu.a(stringBuilder, n3, ')');
    }
}

