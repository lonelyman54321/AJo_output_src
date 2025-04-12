/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class C91$a {
    public int a;
    public final ArrayList b;
    public final ie2_2 c;
    public w31_0[] d;
    public int e;
    public int f;
    public int g;

    public C91$a(R91$b w31_0Array) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(w31_0Array, "source");
        this.a = 4096;
        this.b = arrayList = new ArrayList();
        w31_0Array = o72_0.b((a93_0)w31_0Array);
        this.c = w31_0Array;
        w31_0Array = new w31_0[8];
        this.d = w31_0Array;
        this.e = 7;
    }

    public final int a(int n3) {
        int n4 = 0;
        if (n3 > 0) {
            int n7;
            int n8;
            int n10;
            w31_0[] w31_0Array = this.d;
            for (n10 = w31_0Array.length + -1; n10 >= (n8 = this.e) && n3 > 0; n10 += -1) {
                w31_0 w31_02 = this.d[n10];
                Intrinsics.checkNotNull(w31_02);
                n8 = w31_02.c;
                n3 -= n8;
                this.g = n7 = this.g - n8;
                this.f = n8 = this.f + -1;
                ++n4;
            }
            w31_0[] w31_0Array2 = this.d;
            n10 = n8 + 1;
            n8 = n8 + 1 + n4;
            n7 = this.f;
            System.arraycopy(w31_0Array2, n10, w31_0Array2, n8, n7);
            this.e = n3 = this.e + n4;
        }
        return n4;
    }

    public final ff_2 b(int n3) {
        Object object;
        block4: {
            Object object2;
            block3: {
                int n4;
                int n7;
                block2: {
                    if (n3 < 0 || n3 > (n7 = ((w31_0[])(object = c91_0.a)).length + -1)) break block2;
                    object2 = object[n3].a;
                    break block3;
                }
                object = c91_0.a;
                int n8 = ((w31_0[])object).length;
                n7 = this.e + 1 + (n8 = n3 - n8);
                if (n7 < 0 || n7 >= (n4 = ((w31_0[])(object = this.d)).length)) break block4;
                object2 = object[n7];
                Intrinsics.checkNotNull(object2);
                object2 = ((w31_0)object2).a;
            }
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Header index too large ");
        stringBuilder.append(++n3);
        String string2 = stringBuilder.toString();
        object = new IOException(string2);
        throw object;
    }

    public final void c(w31_0 objectArray) {
        int n3;
        w31_0[] w31_0Array = this.b;
        w31_0Array.add(objectArray);
        int n4 = this.a;
        int n7 = 0;
        w31_0[] w31_0Array2 = null;
        int n8 = objectArray.c;
        if (n8 > n4) {
            int n10;
            objectArray = this.d;
            rp_1.o(null, objectArray);
            this.e = n10 = this.d.length + -1;
            this.f = 0;
            this.g = 0;
            return;
        }
        int n14 = this.g + n8 - n4;
        this.a(n14);
        n4 = this.f + 1;
        w31_0[] w31_0Array3 = this.d;
        int n15 = w31_0Array3.length;
        if (n4 > n15) {
            n4 = w31_0Array3.length * 2;
            w31_0Array = new w31_0[n4];
            n15 = w31_0Array3.length;
            int n16 = w31_0Array3.length;
            System.arraycopy(w31_0Array3, 0, w31_0Array, n15, n16);
            w31_0Array2 = this.d;
            this.e = n7 = w31_0Array2.length + -1;
            this.d = w31_0Array;
        }
        n4 = this.e;
        this.e = n7 = n4 + -1;
        this.d[n4] = objectArray;
        this.f = n3 = this.f + 1;
        this.g = n3 = this.g + n8;
    }

    public final ff_2 d() {
        ff_2 ff_22;
        ce_2 ce_22;
        int n3 = 8;
        Object object = this.c;
        int n4 = object.readByte();
        Object[] objectArray = ez3.a;
        int n7 = n4 & 0xFF;
        int n8 = 128;
        int n10 = 0;
        if ((n4 &= n8) == n8) {
            n4 = 1;
        } else {
            n4 = 0;
            ce_22 = null;
        }
        n8 = 127;
        n7 = this.e(n7, n8);
        long l2 = n7;
        if (n4 != 0) {
            long l3;
            ce_22 = new ce_2();
            Object object2 = ub1_1.a;
            Intrinsics.checkNotNullParameter(object, "source");
            Intrinsics.checkNotNullParameter(ce_22, "sink");
            object2 = ub1_1.c;
            long l4 = 0L;
            Object object3 = object2;
            long l7 = l4;
            int n14 = 0;
            while ((l3 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1)) < 0) {
                l3 = object.readByte();
                l3 = l3 & 0xFF;
                n10 = n10 << n3 | l3;
                n14 += n3;
                while (n14 >= n3) {
                    l3 = n14 + -8;
                    l3 = n10 >>> l3 & 0xFF;
                    object3 = object3.a;
                    Intrinsics.checkNotNull(object3);
                    object3 = object3[l3];
                    Intrinsics.checkNotNull(object3);
                    Ub1$a[] ub1$aArray = object3.a;
                    if (ub1$aArray == null) {
                        l3 = object3.b;
                        ce_22.U((int)l3);
                        int n15 = object3.c;
                        n14 -= n15;
                        object3 = object2;
                        continue;
                    }
                    n14 += -8;
                }
                long l8 = 1L;
                l7 += l8;
            }
            while (n14 > 0) {
                int n16 = 8 - n14;
                n16 = n10 << n16 & 0xFF;
                objectArray = object3.a;
                Intrinsics.checkNotNull(objectArray);
                object = objectArray[n16];
                Intrinsics.checkNotNull(object);
                objectArray = ((Ub1$a)object).a;
                if (objectArray != null || (n7 = ((Ub1$a)object).c) > n14) break;
                n16 = ((Ub1$a)object).b;
                ce_22.U(n16);
                n14 -= n7;
                object3 = object2;
            }
            long l12 = ce_22.b;
            ff_22 = ce_22.b0(l12);
        } else {
            ff_22 = object.b0(l2);
        }
        return ff_22;
    }

    public final int e(int n3, int n4) {
        int n7;
        if ((n3 &= n4) < n4) {
            return n3;
        }
        n3 = 0;
        while (true) {
            ie2_2 ie2_22 = this.c;
            int n8 = ie2_22.readByte();
            n7 = n8 & 0xFF;
            int n10 = n8 & 0x80;
            if (n10 == 0) break;
            n8 = (n8 & 0x7F) << n3;
            n4 += n8;
            n3 += 7;
        }
        n3 = n7 << n3;
        return n4 + n3;
    }
}

