/*
 * Decompiled with CFR 0.152.
 */
public final class oV0 {
    public final int a;

    public /* synthetic */ oV0(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = oV0.a(n3, 0);
        String string2 = n4 != 0 ? "None" : ((n4 = oV0.a(n3, 1)) != 0 ? "All" : ((n4 = oV0.a(n3, 2)) != 0 ? "Weight" : ((n3 = (int)(oV0.a(n3, n4 = 3) ? 1 : 0)) != 0 ? "Style" : "Invalid")));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof oV0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (oV0)object;
            n3 = this.a;
            int n4 = ((oV0)object).a;
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
        return oV0.b(this.a);
    }
}

