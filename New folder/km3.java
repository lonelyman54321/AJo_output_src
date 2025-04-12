/*
 * Decompiled with CFR 0.152.
 */
public final class km3 {
    public static Wo0 a() {
        float f5 = 1.0f;
        Wo0 wo0 = new Wo0(f5, f5);
        return wo0;
    }

    public static final boolean b(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String c(int n3) {
        int n4 = km3.b(n3, 1);
        String string2 = n4 != 0 ? "Clip" : ((n4 = km3.b(n3, 2)) != 0 ? "Ellipsis" : ((n3 = (int)(km3.b(n3, n4 = 3) ? 1 : 0)) != 0 ? "Visible" : "Invalid"));
        return string2;
    }
}

