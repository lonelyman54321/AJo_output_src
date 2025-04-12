/*
 * Decompiled with CFR 0.152.
 */
public final class Vh1 {
    public final int a;

    public /* synthetic */ Vh1(int n3) {
        this.a = n3;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Vh1;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Vh1)object;
            n3 = this.a;
            int n4 = ((Vh1)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int n3 = this.a;
        int n4 = 1;
        String string2 = n3 == n4 ? "Touch" : (n3 == (n4 = 2) ? "Keyboard" : "Error");
        return string2;
    }
}

