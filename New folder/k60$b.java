/*
 * Decompiled with CFR 0.152.
 */
public final class k60$b
extends k60_0 {
    public final int a;

    public k60$b(int n3) {
        this.a = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof k60$b;
        if (n3 == 0) {
            return false;
        }
        object = (k60$b)object;
        n3 = this.a;
        int n4 = ((k60$b)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConstraintsNotMet(reason=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }
}

