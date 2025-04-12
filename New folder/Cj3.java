/*
 * Decompiled with CFR 0.152.
 */
public final class Cj3 {
    public final int a;

    public /* synthetic */ Cj3(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = Cj3.a(n3, 1);
        String string2 = n4 != 0 ? "Left" : ((n4 = Cj3.a(n3, 2)) != 0 ? "Right" : ((n4 = Cj3.a(n3, 3)) != 0 ? "Center" : ((n4 = Cj3.a(n3, 4)) != 0 ? "Justify" : ((n4 = Cj3.a(n3, 5)) != 0 ? "Start" : ((n4 = Cj3.a(n3, 6)) != 0 ? "End" : ((n3 = (int)(Cj3.a(n3, n4 = -1 << -1) ? 1 : 0)) != 0 ? "Unspecified" : "Invalid"))))));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Cj3;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Cj3)object;
            n3 = this.a;
            int n4 = ((Cj3)object).a;
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
        return Cj3.b(this.a);
    }
}

