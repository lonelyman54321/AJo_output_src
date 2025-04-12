/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yJ2
 */
public final class yj2_0 {
    public static int a(int n3, int n4) {
        int n7;
        int n8 = 1;
        for (int i3 = 1; i3 <= (n7 = 2); ++i3) {
            int n10 = (n3 + i3) % 3;
            if (n10 != 0 && !(n10 != n8 ? n10 == n7 && (n7 = n4 & 2) != 0 : (n7 = n4 & 1) != 0)) {
                continue;
            }
            return n10;
        }
        return n3;
    }
}

