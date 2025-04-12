/*
 * Decompiled with CFR 0.152.
 */
public final class Pj3 {
    public final int a;

    public /* synthetic */ Pj3(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = Pj3.a(n3, 1);
        String string2 = n4 != 0 ? "Ltr" : ((n4 = Pj3.a(n3, 2)) != 0 ? "Rtl" : ((n4 = Pj3.a(n3, 3)) != 0 ? "Content" : ((n4 = Pj3.a(n3, 4)) != 0 ? "ContentOrLtr" : ((n4 = Pj3.a(n3, 5)) != 0 ? "ContentOrRtl" : ((n3 = (int)(Pj3.a(n3, n4 = -1 << -1) ? 1 : 0)) != 0 ? "Unspecified" : "Invalid")))));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Pj3;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Pj3)object;
            n3 = this.a;
            int n4 = ((Pj3)object).a;
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
        return Pj3.b(this.a);
    }
}

