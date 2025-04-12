/*
 * Decompiled with CFR 0.152.
 */
public final class To0 {
    public int a = 0;

    public To0() {
        this(0);
    }

    public To0(int n3) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof To0;
        if (n3 == 0) {
            return false;
        }
        object = (To0)object;
        n3 = this.a;
        int n4 = ((To0)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeltaCounter(count=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }
}

