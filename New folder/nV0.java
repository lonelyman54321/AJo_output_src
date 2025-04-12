/*
 * Decompiled with CFR 0.152.
 */
public final class nV0 {
    public final int a;

    public /* synthetic */ nV0(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = (int)(nV0.a(n3, 0) ? 1 : 0);
        String string2 = n4 != 0 ? "Normal" : ((n3 = (int)(nV0.a(n3, n4 = 1) ? 1 : 0)) != 0 ? "Italic" : "Invalid");
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof nV0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (nV0)object;
            n3 = this.a;
            int n4 = ((nV0)object).a;
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
        return nV0.b(this.a);
    }
}

