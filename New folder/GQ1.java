/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.math.IntMath;

public final class GQ1 {
    public static int a(Vm2 vm2, int n3, int n4, int n7) {
        int n8 = Math.max(Math.max(n3, n4), n7);
        int n10 = 31;
        int n14 = 1;
        n8 = n8 <= n10 ? 1 : 0;
        ct3.a(n8 != 0);
        n8 = (n14 << n3) - n14;
        n10 = (n14 << n4) - n14;
        int n15 = IntMath.checkedAdd(n8, n10);
        IntMath.checkedAdd(n15, n14 <<= n7);
        n14 = vm2.b();
        n15 = -1;
        if (n14 < n3) {
            return n15;
        }
        if ((n3 = vm2.g(n3)) == n8) {
            n8 = vm2.b();
            if (n8 < n4) {
                return n15;
            }
            n4 = vm2.g(n4);
            n3 += n4;
            if (n4 == n10) {
                n4 = vm2.b();
                if (n4 < n7) {
                    return n15;
                }
                int n16 = vm2.g(n7);
                n3 += n16;
            }
        }
        return n3;
    }

    public static void b(Vm2 vm2) {
        vm2.o(3);
        vm2.o(8);
        int n3 = vm2.f();
        boolean bl2 = vm2.f();
        if (n3 != 0) {
            n3 = 5;
            vm2.o(n3);
        }
        if (bl2) {
            n3 = 6;
            vm2.o(n3);
        }
    }

    public static void c(Vm2 vm2) {
        int n3 = 2;
        int n4 = vm2.g(n3);
        int n7 = 6;
        if (n4 == 0) {
            vm2.o(n7);
            return;
        }
        int n8 = 5;
        int n10 = 8;
        int n14 = GQ1.a(vm2, n8, n10, 16);
        int n15 = 1;
        n14 += n15;
        int n16 = 7;
        if (n4 == n15) {
            vm2.o(n14 *= 7);
        } else if (n4 == n3) {
            n4 = vm2.f() ? 1 : 0;
            int n17 = n4 != 0 ? 1 : 5;
            if (n4 != 0) {
                n8 = 7;
            }
            if (n4 != 0) {
                n7 = 8;
            }
            n4 = 0;
            for (n10 = 0; n10 < n14; n10 += n15) {
                int n18 = vm2.f();
                int n19 = 180;
                if (n18 != 0) {
                    vm2.o(n16);
                    n18 = 0;
                } else {
                    int n20;
                    n18 = vm2.g(n3);
                    if (n18 == (n20 = 3) && (n18 = vm2.g(n8) * n17) != 0) {
                        vm2.n();
                    }
                    if ((n18 = vm2.g(n7) * n17) != 0 && n18 != n19) {
                        vm2.n();
                    }
                    vm2.n();
                }
                if (n18 == 0 || n18 == n19 || (n18 = (int)(vm2.f() ? 1 : 0)) == 0) continue;
                ++n10;
            }
        }
    }
}

