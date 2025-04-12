/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Go1
 */
public final class go1_1
implements xw0_1 {
    public final Go1$b a;

    public go1_1(Go1$b go1$b) {
        this.a = go1$b;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final sa3_0 g(Vs3 vs3) {
        int n3;
        Object object = this;
        Object object2 = this.a;
        int n4 = ((ho1_0)object2).b.e + 2;
        Object object3 = new sr1_0(n4);
        Object object4 = ((ho1_0)object2).b;
        int n7 = ((Qi1)object4).e;
        tr1_1 tr1_12 = new tr1_1(n7);
        Object object5 = ((Qi1)object4).b;
        Object[] objectArray = ((Qi1)object4).c;
        long[] lArray = ((Qi1)object4).a;
        int n8 = lArray.length + -2;
        if (n8 >= 0) {
            int n10 = 0;
            while (true) {
                void var31_33;
                void var33_43;
                long l2 = lArray[n10];
                long l3 = l2 ^ (long)-1;
                int n14 = 7;
                l3 = l3 << n14 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object6 == false) {
                    void var10_11;
                    int[] nArray = object5;
                    var33_43 = var10_11;
                } else {
                    void var10_12;
                    int n15 = ~(n10 - n8) >>> 31;
                    int n16 = 8;
                    n15 = 8 - n15;
                    for (n14 = 0; n14 < n15; l2 >>= n3, ++n14) {
                        void var31_37;
                        long l8 = l2 & 0xFFL;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object7 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object7 < 0) {
                            void var31_35;
                            int n17 = (n10 << 3) + n14;
                            int n18 = object5[n17];
                            void var32_42 = var31_35 = var10_12[n17];
                            Go1$a go1$a = (Go1$a)var31_35;
                            ((sr1_0)object3).b(n18);
                            int[] nArray = object5;
                            object5 = vs3.a();
                            var33_43 = var10_12;
                            Object object8 = go1$a.a;
                            object5 = (Ol)object5.invoke(object8);
                            cx0_0 cx0_02 = go1$a.b;
                            n16 = go1$a.c;
                            object = new RA3((Ol)object5, cx0_02, n16);
                            tr1_12.i(n18, object);
                        } else {
                            int[] nArray = object5;
                            var33_43 = var10_12;
                        }
                        n3 = 8;
                        object = this;
                        object5 = var31_37;
                        void var10_16 = var33_43;
                        n16 = 8;
                    }
                    int[] nArray = object5;
                    var33_43 = var10_12;
                    n3 = 8;
                    if (n15 != n3) break;
                }
                if (n10 == n8) break;
                ++n10;
                object = this;
                object5 = var31_33;
                void var10_17 = var33_43;
            }
        }
        n3 = 0;
        object = null;
        n7 = (int)(((Qi1)object4).a(0) ? 1 : 0);
        if (n7 == 0) {
            n7 = ((Ni1)object3).b;
            if (n7 < 0) {
                object2 = new StringBuilder("Index 0 must be in 0..");
                int n19 = ((Ni1)object3).b;
                ((StringBuilder)object2).append(n19);
                object3 = ((StringBuilder)object2).toString();
                object = new IndexOutOfBoundsException((String)object3);
                throw object;
            }
            int n20 = 1;
            ((sr1_0)object3).c(n7 += n20);
            object5 = ((Ni1)object3).a;
            int n21 = ((Ni1)object3).b;
            if (n21 != 0) {
                rp_1.f(n20, 0, n21, (int[])object5, (int[])object5);
            }
            object5[0] = 0;
            ((Ni1)object3).b = n3 = ((Ni1)object3).b + n20;
        }
        n3 = ((ho1_0)object2).a;
        if ((n3 = (int)(((Qi1)object4).a(n3) ? 1 : 0)) == 0) {
            n3 = ((ho1_0)object2).a;
            ((sr1_0)object3).b(n3);
        }
        if ((n3 = ((Ni1)object3).b) != 0) {
            object4 = ((Ni1)object3).a;
            Intrinsics.checkNotNullParameter(object4, "<this>");
            n7 = 0;
            object5 = null;
            Arrays.sort((int[])object4, 0, n3);
        }
        int n22 = ((ho1_0)object2).a;
        object4 = ex0_0.c;
        return new sa3_0((sr1_0)object3, tr1_12, n22, (dx0_0)object4);
    }
}

