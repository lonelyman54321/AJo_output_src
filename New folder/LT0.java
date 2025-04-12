/*
 * Decompiled with CFR 0.152.
 */
public final class LT0 {
    public final int a;

    public /* synthetic */ LT0(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String b(int n3) {
        int n4 = LT0.a(n3, 1);
        String string2 = n4 != 0 ? "Next" : ((n4 = LT0.a(n3, 2)) != 0 ? "Previous" : ((n4 = LT0.a(n3, 3)) != 0 ? "Left" : ((n4 = LT0.a(n3, 4)) != 0 ? "Right" : ((n4 = LT0.a(n3, 5)) != 0 ? "Up" : ((n4 = LT0.a(n3, 6)) != 0 ? "Down" : ((n4 = LT0.a(n3, 7)) != 0 ? "Enter" : ((n3 = (int)(LT0.a(n3, n4 = 8) ? 1 : 0)) != 0 ? "Exit" : "Invalid FocusDirection")))))));
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof LT0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (LT0)object;
            n3 = this.a;
            int n4 = ((LT0)object).a;
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
        return LT0.b(this.a);
    }
}

