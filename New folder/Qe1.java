/*
 * Decompiled with CFR 0.152.
 */
public final class Qe1 {
    public final int a;

    public /* synthetic */ Qe1(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = Qe1.a(n3, -1);
        String string2 = n4 != 0 ? "Unspecified" : ((n4 = Qe1.a(n3, 0)) != 0 ? "None" : ((n4 = Qe1.a(n3, 1)) != 0 ? "Default" : ((n4 = Qe1.a(n3, 2)) != 0 ? "Go" : ((n4 = Qe1.a(n3, 3)) != 0 ? "Search" : ((n4 = Qe1.a(n3, 4)) != 0 ? "Send" : ((n4 = Qe1.a(n3, 5)) != 0 ? "Previous" : ((n4 = Qe1.a(n3, 6)) != 0 ? "Next" : ((n3 = (int)(Qe1.a(n3, n4 = 7) ? 1 : 0)) != 0 ? "Done" : "Invalid"))))))));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Qe1;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Qe1)object;
            n3 = this.a;
            int n4 = ((Qe1)object).a;
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
        return Qe1.b(this.a);
    }
}

