/*
 * Decompiled with CFR 0.152.
 */
public final class P92 {
    public static final void a(q73 q732, mp mp2, int n3) {
        int n4;
        int n7;
        while (!(n3 > (n7 = q732.v) && n3 < (n4 = q732.u) || n7 == 0 && n3 == 0)) {
            q732.H();
            n7 = q732.v;
            int[] nArray = q732.b;
            n7 = q732.p(n7);
            n7 = n73.h(nArray, n7) ? 1 : 0;
            if (n7 != 0) {
                mp2.h();
            }
            q732.i();
        }
        return;
    }
}

