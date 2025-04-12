/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gc1
 */
public final class gc1_1 {
    public final int a;

    public /* synthetic */ gc1_1(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = gc1_1.a(n3, 1);
        String string2 = n4 != 0 ? "Hyphens.None" : ((n4 = gc1_1.a(n3, 2)) != 0 ? "Hyphens.Auto" : ((n3 = (int)(gc1_1.a(n3, n4 = -1 << -1) ? 1 : 0)) != 0 ? "Hyphens.Unspecified" : "Invalid"));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof gc1_1;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (gc1_1)object;
            n3 = this.a;
            int n4 = ((gc1_1)object).a;
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
        return gc1_1.b(this.a);
    }
}

