/*
 * Decompiled with CFR 0.152.
 */
public final class qO0
implements lg3_0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public qO0() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public final int a(Vo0 vo0) {
        return this.b;
    }

    public final int b(Vo0 vo0, bp1_0 bp1_02) {
        return this.c;
    }

    public final int c(Vo0 vo0) {
        return this.d;
    }

    public final int d(Vo0 vo0, bp1_0 bp1_02) {
        return this.a;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof qO0;
        if (n4 == 0) {
            return false;
        }
        object = (qO0)object;
        int n7 = this.a;
        n4 = ((qO0)object).a;
        if (n7 != n4 || (n4 = this.b) != (n7 = ((qO0)object).b) || (n4 = this.c) != (n7 = ((qO0)object).c) || (n4 = this.d) != (n3 = ((qO0)object).d)) {
            bl2 = false;
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
        StringBuilder stringBuilder = new StringBuilder("Insets(left=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", top=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", right=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", bottom=");
        n3 = this.d;
        return tu.a(stringBuilder, n3, ')');
    }
}

