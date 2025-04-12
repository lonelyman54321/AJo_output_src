/*
 * Decompiled with CFR 0.152.
 */
public final class Hl {
    public static Ug1 a(xw0_1 xw0_12) {
        xJ2 xJ22 = xJ2.Restart;
        long l2 = 0;
        Ug1 ug1 = new Ug1(xw0_12, xJ22, l2);
        return ug1;
    }

    public static xa3_2 b(float f5, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            f5 = 1500.0f;
        }
        if ((n3 &= 4) != 0) {
            object = null;
        }
        xa3_2 xa3_22 = new xa3_2(1.0f, f5, object);
        return xa3_22;
    }

    public static Qs3 c(int n3, int n4, cx0_0 cx0_02, int n7) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = 300;
        }
        if ((n8 = n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 &= 4) != 0) {
            cx0_02 = ex0_0.a;
        }
        Qs3 qs3 = new Qs3(n3, n4, cx0_02);
        return qs3;
    }
}

