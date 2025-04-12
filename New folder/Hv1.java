/*
 * Decompiled with CFR 0.152.
 */
public final class Hv1 {
    public final int a;

    public /* synthetic */ Hv1() {
        this.a = 0;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Hv1;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Hv1)object;
            n3 = this.a;
            int n4 = ((Hv1)object).a;
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
        return "Polite";
    }
}

