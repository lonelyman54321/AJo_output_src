/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fr1
 */
public abstract class fr1_0 {
    public final boolean a;
    public final lr1_1 b;
    public final int c;
    public final int d;
    public final uq1_1 e;
    public final pr1_0 f;

    public fr1_0(lr1_1 lr1_12, int n3, int n4, uq1_1 uq1_12, pr1_0 pr1_02) {
        this.a = true;
        this.b = lr1_12;
        this.c = n3;
        this.d = n4;
        this.e = uq1_12;
        this.f = pr1_02;
    }

    public final long a(int n3, int object) {
        String string2;
        Object object2;
        block11: {
            long l2;
            block10: {
                int n4;
                int n7;
                block8: {
                    block9: {
                        int[] nArray;
                        Object object3 = this.b;
                        n7 = 1;
                        if (object == n7) {
                            object2 = ((lr1_1)object3).a;
                            n3 = object2[n3];
                        } else {
                            object = object + n3 - n7;
                            nArray = ((lr1_1)object3).b;
                            int n8 = nArray[object];
                            object3 = ((lr1_1)object3).a;
                            object = object3[object];
                            n3 = nArray[n3];
                            n3 = (n8 += object) - n3;
                        }
                        object = 0;
                        object2 = null;
                        if (n3 < 0) {
                            n3 = 0;
                        }
                        boolean bl2 = this.a;
                        nArray = null;
                        string2 = ") must be >= 0";
                        n4 = -1 >>> 1;
                        if (!bl2) break block8;
                        if (n3 < 0) {
                            n7 = 0;
                        }
                        if (n7 == 0) break block9;
                        l2 = f60.i(n3, n3, 0, n4);
                        break block10;
                    }
                    object2 = new StringBuilder;
                    ((StringBuilder)object2)("width(");
                    ((StringBuilder)object2).append(n3);
                    ((StringBuilder)object2).append(string2);
                    hz0.a(((StringBuilder)object2).toString());
                    throw null;
                }
                if (n3 < 0) {
                    n7 = 0;
                }
                if (n7 == 0) break block11;
                l2 = f60.i(0, n4, n3, n3);
            }
            return l2;
        }
        object2 = new StringBuilder;
        ((StringBuilder)object2)("height(");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(string2);
        hz0.a(((StringBuilder)object2).toString());
        throw null;
    }

    public abstract er1_0 b(int var1, dr1_0[] var2, List var3, int var4);

    public final er1_0 c(int n3) {
        int n4;
        int n7;
        fr1_0 fr1_02 = this;
        int n8 = n3;
        pr1$c pr1$c = this.f.b(n3);
        List list = pr1$c.b;
        int n10 = list.size();
        int n14 = 0;
        int n15 = pr1$c.a;
        n7 = n10 != 0 && (n7 = n15 + n10) != (n4 = this.c) ? this.d : 0;
        dr1_0[] dr1_0Array = new dr1_0[n10];
        int n16 = 0;
        while (n14 < n10) {
            long l2 = ((J11)list.get((int)n14)).a;
            int n17 = (int)l2;
            long l3 = fr1_02.a(n16, n17);
            int n18 = n15 + n14;
            dr1_0 dr1_02 = fr1_02.e.c(n18, n16, n17, n7, l3);
            n16 += n17;
            dr1_0Array[n14] = dr1_02;
            ++n14;
        }
        return fr1_02.b(n8, dr1_0Array, list, n7);
    }
}

