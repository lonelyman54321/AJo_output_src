/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from zo1
 */
public final class zo1_0 {
    public final int a;

    public /* synthetic */ zo1_0(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = zo1_0.a(n3, 0);
        String string2 = n4 != 0 ? "Unspecified" : ((n4 = zo1_0.a(n3, 1)) != 0 ? "Text" : ((n4 = zo1_0.a(n3, 2)) != 0 ? "Ascii" : ((n4 = zo1_0.a(n3, 3)) != 0 ? "Number" : ((n4 = zo1_0.a(n3, 4)) != 0 ? "Phone" : ((n4 = zo1_0.a(n3, 5)) != 0 ? "Uri" : ((n4 = zo1_0.a(n3, 6)) != 0 ? "Email" : ((n4 = zo1_0.a(n3, 7)) != 0 ? "Password" : ((n4 = zo1_0.a(n3, 8)) != 0 ? "NumberPassword" : ((n3 = (int)(zo1_0.a(n3, n4 = 9) ? 1 : 0)) != 0 ? "Decimal" : "Invalid")))))))));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof zo1_0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (zo1_0)object;
            n3 = this.a;
            int n4 = ((zo1_0)object).a;
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
        return zo1_0.b(this.a);
    }
}

