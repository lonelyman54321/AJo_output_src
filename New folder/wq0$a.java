/*
 * Decompiled with CFR 0.152.
 */
public final class wq0$a
extends wq0 {
    public final int a;

    public wq0$a(int n3) {
        this.a = n3;
        if (n3 > 0) {
            return;
        }
        String string2 = "px must be > 0.".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                int n3 = object instanceof wq0$a;
                if (n3 == 0) break block4;
                object = (wq0$a)object;
                n3 = this.a;
                int n4 = ((wq0$a)object).a;
                if (n3 == n4) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}

