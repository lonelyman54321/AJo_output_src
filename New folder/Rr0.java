/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;

public final class Rr0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 object, long l2, float f5, float f6, b30_0 b30_02, int n3, int n4) {
        Object object2;
        float f7;
        float f8;
        long l3;
        int n7;
        float f11;
        float f12;
        int n8;
        long l4;
        Object object3;
        int n10;
        int n14;
        Object object4;
        Object object5;
        int n15;
        block24: {
            block23: {
                block19: {
                    block22: {
                        block21: {
                            block20: {
                                n15 = n3;
                                int n16 = -1249392198;
                                object5 = b30_02;
                                object4 = b30_02.g(n16);
                                n14 = n4 & 1;
                                if (n14 != 0) {
                                    int n17;
                                    n10 = n17 = n3 | 6;
                                    object3 = object;
                                } else {
                                    int n18 = n3 & 6;
                                    if (n18 == 0) {
                                        object3 = object;
                                        n10 = ((j30_0)object4).J(object) ? 1 : 0;
                                        n10 = n10 != 0 ? 4 : 2;
                                        n10 |= n15;
                                    } else {
                                        object3 = object;
                                        n10 = n3;
                                    }
                                }
                                int n19 = n15 & 0x30;
                                if (n19 != 0) break block19;
                                n19 = n4 & 2;
                                if (n19 != 0) break block20;
                                l4 = l2;
                                n8 = ((j30_0)object4).d(l2) ? 1 : 0;
                                if (n8 == 0) break block21;
                                n8 = 32;
                                f12 = 4.5E-44f;
                                break block22;
                            }
                            l4 = l2;
                        }
                        n8 = 16;
                        f12 = 2.2E-44f;
                    }
                    n10 |= n8;
                    break block23;
                }
                l4 = l2;
            }
            n8 = n4 & 4;
            if (n8 != 0) {
                n10 |= 0x180;
            } else {
                int n20 = n15 & 0x180;
                if (n20 == 0) {
                    f11 = f5;
                    n7 = ((j30_0)object4).b(f5);
                    n7 = n7 != 0 ? 256 : 128;
                }
            }
            f11 = f5;
            break block24;
            n10 |= n7;
        }
        n10 = (n10 | 0xC00) & 0x493;
        n7 = 1170;
        if (n10 == n7 && (n10 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object5 = object3;
            l3 = l4;
            f8 = f11;
            f7 = f6;
        } else {
            fG2$a fG2$a;
            long l7;
            float f14;
            ((j30_0)object4).r0();
            n10 = n15 & 1;
            object2 = LP1$a.b;
            if (n10 != 0 && (n10 = (int)(((j30_0)object4).c0() ? 1 : 0)) == 0) {
                ((j30_0)object4).D();
                f14 = f6;
                l7 = l4;
            } else {
                if (n14 != 0) {
                    object3 = object2;
                }
                if ((n14 = n4 & 2) != 0) {
                    object5 = mz_0.a;
                    object5 = (lZ)((j30_0)object4).j((H30)object5);
                    l7 = ((lZ)object5).e();
                    n14 = 1039516303;
                    f14 = 0.12f;
                    l7 = OX.b(l7, f14);
                } else {
                    l7 = l4;
                }
                if (n8 != 0) {
                    n14 = 1;
                    f11 = f14 = (float)n14;
                }
                f14 = 0.0f;
            }
            ((j30_0)object4).U();
            int n21 = 0;
            f7 = 0.0f;
            Object object6 = null;
            float f15 = f14 - 0.0f;
            n8 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (n8 != 0) {
                n8 = 0;
                f12 = 0.0f;
                fG2$a = null;
                int n22 = 14;
                object = object2;
                f5 = 0.0f;
                f6 = 0.0f;
                object2 = h.i((LP1)object2, f14, 0.0f, 0.0f, 0.0f, n22);
            }
            n21 = xs0_0.a(f11, 0.0f);
            n8 = 1065353216;
            f12 = 1.0f;
            if (n21 != 0) {
                n21 = -129374855;
                ((j30_0)object4).K(n21);
                object6 = O30.f;
                object6 = (Vo0)((j30_0)object4).j((H30)object6);
                f7 = object6.getDensity();
                f7 = f12 / f7;
                ((j30_0)object4).T(false);
            } else {
                n21 = -129316234;
                ((j30_0)object4).K(n21);
                ((j30_0)object4).T(false);
                f7 = f11;
            }
            object2 = object3.then((LP1)object2);
            object6 = j.d(j.c((LP1)object2, f12), f7);
            fG2$a = fg2_1.a;
            object6 = a.b((LP1)object6, l7, fG2$a);
            HA.a((LP1)object6, (b30_0)object4, 0);
            f7 = f14;
            object5 = object3;
            l3 = l7;
            f8 = f11;
        }
        CF2 cF2 = ((j30_0)object4).X();
        if (cF2 != null) {
            object4 = object2;
            n15 = n3;
            n8 = n4;
            cF2.d = object2 = new Rr0$a((LP1)object5, l3, f8, f7, n3, n4);
        }
    }
}

