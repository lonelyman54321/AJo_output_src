/*
 * Decompiled with CFR 0.152.
 */
public final class Br1$a {
    public final int a;
    public final int b;

    public Br1$a(int n3, int n4) {
        this.a = n3;
        this.b = n4;
        if (n3 >= 0) {
            if (n4 >= n3) {
                return;
            }
            String string2 = "end index greater than start".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = "negative start index".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Br1$a;
        if (n3 == 0) {
            return false;
        }
        object = (Br1$a)object;
        int n4 = this.a;
        n3 = ((Br1$a)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        int n7 = ((Br1$a)object).b;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Interval(start=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", end=");
        n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

