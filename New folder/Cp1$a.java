/*
 * Decompiled with CFR 0.152.
 */
public final class Cp1$a {
    public final int a;
    public final int b;
    public final boolean c;

    public Cp1$a(int n3, int n4, boolean bl2) {
        this.a = n3;
        this.b = n4;
        this.c = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Cp1$a;
        if (n3 == 0) {
            return false;
        }
        object = (Cp1$a)object;
        int n4 = this.a;
        n3 = ((Cp1$a)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((Cp1$a)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c ? 1 : 0;
        int n7 = ((Cp1$a)object).c;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c ? 1 : 0;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BidiRun(start=");
        int bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", end=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", isRtl=");
        boolean bl3 = this.c;
        return AR.a(stringBuilder, bl3, ')');
    }
}

