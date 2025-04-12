/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.K$d;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.a_0;

public final class CodedOutputStream$b
extends CodedOutputStream {
    public final byte[] d;
    public final int e;
    public int f;

    public CodedOutputStream$b(byte[] object, int n3) {
        int n4 = ((byte[])object).length - n3 | n3;
        if (n4 >= 0) {
            this.d = object;
            this.f = 0;
            this.e = n3;
            return;
        }
        object = ((byte[])object).length;
        Integer n7 = 0;
        Integer n8 = n3;
        Object[] objectArray = new Object[]{object, n7, n8};
        object = String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void D(byte by2) {
        Object object;
        int n3 = 1;
        try {
            object = this.d;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new CodedOutputStream$OutOfSpaceException;
            Integer n4 = this.f;
            Integer n7 = this.e;
            Integer n8 = n3;
            Object[] objectArray = new Object[3];
            objectArray[0] = n4;
            objectArray[n3] = n7;
            objectArray[2] = n8;
            String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n10 = this.f;
        int n14 = n10 + 1;
        this.f = n14;
        object[n10] = by2;
    }

    public final void E(int n3, boolean bl2) {
        this.U(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.D((byte)n3);
    }

    public final void F(int n3, byte[] byArray) {
        this.W(n3);
        this.Z(byArray, 0, n3);
    }

    public final void G(int n3, DF dF) {
        this.U(n3, 2);
        this.H(dF);
    }

    public final void H(DF dF) {
        int n3 = dF.size();
        this.W(n3);
        dF.h(this);
    }

    public final void I(int n3, int n4) {
        this.U(n3, 5);
        this.J(n4);
    }

    public final void J(int n3) {
        Object object;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        try {
            object = this.d;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new CodedOutputStream$OutOfSpaceException;
            Integer n10 = this.f;
            Integer n14 = this.e;
            Integer n15 = n8;
            Object object2 = new Object[n4];
            object2[0] = n10;
            object2[n8] = n14;
            object2[n7] = n15;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n16 = this.f;
        int n17 = n16 + 1;
        this.f = n17;
        int n18 = n3 & 0xFF;
        object[n16] = n18;
        n18 = n16 + 2;
        this.f = n18;
        byte by2 = (byte)(n3 >> 8 & 0xFF);
        object[n17] = by2;
        n17 = n16 + 3;
        this.f = n17;
        by2 = (byte)(n3 >> 16 & 0xFF);
        object[n18] = by2;
        n16 += 4;
        this.f = n16;
        n3 = (byte)(n3 >> 24 & 0xFF);
        object[n17] = n3;
    }

    public final void K(int n3, long l2) {
        this.U(n3, 1);
        this.L(l2);
    }

    public final void L(long l2) {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        try {
            object = this.d;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.f;
            Integer n8 = this.e;
            Integer n10 = n7;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2[n7] = n8;
            object2[n4] = n10;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException((String)object2, indexOutOfBoundsException);
            throw codedOutputStream$OutOfSpaceException;
        }
        int n14 = this.f;
        int n15 = n14 + 1;
        this.f = n15;
        int n16 = (int)l2 & 0xFF;
        object[n14] = n16;
        n16 = n14 + 2;
        this.f = n16;
        int n17 = 8;
        long l3 = l2 >> n17;
        int n18 = (int)l3;
        byte by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 3;
        this.f = n15;
        l3 = l2 >> 16;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 4;
        this.f = n16;
        l3 = l2 >> 24;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 5;
        this.f = n15;
        l3 = l2 >> 32;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 6;
        this.f = n16;
        l3 = l2 >> 40;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 7;
        this.f = n15;
        l3 = l2 >> 48;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n14 += n17;
        this.f = n14;
        n14 = 56;
        int n19 = (int)(l2 >>= n14);
        byte by4 = (byte)(n19 & 0xFF);
        object[n15] = by4;
    }

    public final void M(int n3, int n4) {
        this.U(n3, 0);
        this.N(n4);
    }

    public final void N(int n3) {
        if (n3 >= 0) {
            this.W(n3);
        } else {
            long l2 = n3;
            this.Y(l2);
        }
    }

    public final void O(int n3, wo1_1 wo1_12, st2_0 st2_02) {
        this.U(n3, 2);
        Object object = wo1_12;
        n3 = ((a_0)wo1_12).c(st2_02);
        this.W(n3);
        object = this.a;
        st2_02.b(wo1_12, (L)object);
    }

    public final void P(wo1_1 wo1_12) {
        int n3 = wo1_12.getSerializedSize();
        this.W(n3);
        wo1_12.d(this);
    }

    public final void Q(int n3, wo1_1 wo1_12) {
        int n4 = 1;
        int n7 = 3;
        this.U(n4, n7);
        int n8 = 2;
        this.V(n8, n3);
        this.U(n7, n8);
        this.P(wo1_12);
        this.U(n4, 4);
    }

    public final void R(int n3, DF dF) {
        int n4 = 1;
        int n7 = 3;
        this.U(n4, n7);
        this.V(2, n3);
        this.G(n7, dF);
        this.U(n4, 4);
    }

    public final void S(int n3, String string2) {
        this.U(n3, 2);
        this.T(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void T(String string2) {
        K$d k$d2;
        int n3;
        block9: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block8: {
                byte[] byArray;
                int n4;
                int n7;
                block10: {
                    int n8;
                    n3 = this.f;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block8;
                    }
                    catch (K$d k$d2) {
                        break block9;
                    }
                    {
                        n7 = CodedOutputStream.z(n7);
                        n8 = string2.length();
                        n8 = CodedOutputStream.z(n8);
                        n4 = this.e;
                        byArray = this.d;
                        if (n8 != n7) break block10;
                        n7 = n3 + n8;
                    }
                    {
                        this.f = n7;
                        n4 -= n7;
                    }
                    {
                        K$b k$b = K.a;
                        n7 = k$b.b(string2, byArray, n7, n4);
                        this.f = n3;
                        n4 = n7 - n3 - n8;
                    }
                    this.W(n4);
                    this.f = n7;
                    return;
                }
                n7 = K.b(string2);
                this.W(n7);
                n7 = this.f;
                n4 -= n7;
                {
                    K$b k$b = K.a;
                    this.f = n7 = k$b.b(string2, byArray, n7, n4);
                    return;
                }
            }
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException2);
            throw codedOutputStream$OutOfSpaceException;
        }
        this.f = n3;
        this.C(string2, k$d2);
    }

    public final void U(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.W(n3);
    }

    public final void V(int n3, int n4) {
        this.U(n3, 0);
        this.W(n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void W(int n3) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        int n4;
        int n7;
        int n8 = 1;
        int n10 = CodedOutputStream.c;
        int n14 = this.e;
        Object object = this.d;
        if (n10 != 0 && (n10 = Ye.a()) == 0 && (n7 = n14 - (n10 = this.f)) >= (n4 = 5)) {
            n14 = n3 & 0xFFFFFF80;
            if (n14 == 0) {
                this.f = n8 += n10;
                long l2 = n10;
                n3 = (byte)n3;
                nw3.m(object, l2, (byte)n3);
                return;
            }
            this.f = n14 = n10 + 1;
            long l3 = n10;
            n7 = (byte)(n3 | 0x80);
            nw3.m(object, l3, (byte)n7);
            n10 = n3 >>> 7;
            n14 = n10 & 0xFFFFFF80;
            if (n14 == 0) {
                n3 = this.f;
                this.f = n8 += n3;
                long l4 = n3;
                n3 = (byte)n10;
                nw3.m(object, l4, (byte)n3);
                return;
            }
            n14 = this.f;
            this.f = n7 = n14 + 1;
            long l7 = n14;
            n10 = (byte)(n10 | 0x80);
            nw3.m(object, l7, (byte)n10);
            n10 = n3 >>> 14;
            n14 = n10 & 0xFFFFFF80;
            if (n14 == 0) {
                n3 = this.f;
                this.f = n8 += n3;
                l7 = n3;
                n3 = (byte)n10;
                nw3.m(object, l7, (byte)n3);
                return;
            }
            n14 = this.f;
            this.f = n7 = n14 + 1;
            l7 = n14;
            n10 = (byte)(n10 | 0x80);
            nw3.m(object, l7, (byte)n10);
            n10 = n3 >>> 21;
            n14 = n10 & 0xFFFFFF80;
            if (n14 == 0) {
                n3 = this.f;
                this.f = n8 += n3;
                l7 = n3;
                n3 = (byte)n10;
                nw3.m(object, l7, (byte)n3);
                return;
            }
            n14 = this.f;
            this.f = n7 = n14 + 1;
            l7 = n14;
            n10 = (byte)(n10 | 0x80);
            nw3.m(object, l7, (byte)n10);
            n3 >>>= 28;
            n10 = this.f;
            this.f = n8 += n10;
            long l8 = n10;
            n3 = (byte)n3;
            nw3.m(object, l8, (byte)n3);
            return;
        }
        while (true) {
            if ((n10 = n3 & 0xFFFFFF80) == 0) {
                try {
                    n10 = this.f;
                    this.f = n7 = n10 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                n3 = (byte)n3;
                object[n10] = n3;
                return;
            }
            n10 = this.f;
            this.f = n7 = n10 + 1;
            n7 = (byte)(n3 & 0x7F | 0x80);
            {
                object[n10] = n7;
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = this.f;
        Integer n15 = n14;
        Integer n16 = n8;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n8] = n15;
        objectArray[2] = n16;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(string2, indexOutOfBoundsException2);
        throw codedOutputStream$OutOfSpaceException;
    }

    public final void X(int n3, long l2) {
        this.U(n3, 0);
        this.Y(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Y(long l2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        byte by2;
        int n3 = 1;
        byte by4 = CodedOutputStream.c;
        int n4 = this.e;
        int n7 = 7;
        long l3 = 0L;
        long l4 = -128;
        byte[] byArray = this.d;
        if (by4 != 0) {
            by4 = this.f;
            by2 = 10;
            if ((by4 = n4 - by4) >= by2) {
                while (true) {
                    long l7;
                    long l8;
                    if ((by2 = (byte)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                        by4 = this.f;
                        this.f = n3 += by4;
                        long l12 = by4;
                        byte by5 = (byte)l2;
                        nw3.m(byArray, l12, by5);
                        return;
                    }
                    by4 = this.f;
                    this.f = n4 = by4 + 1;
                    l7 = by4;
                    by2 = (byte)((int)l2 & 0x7F | 0x80);
                    nw3.m(byArray, l7, by2);
                    l2 >>>= n7;
                }
            }
        }
        while (true) {
            long l14;
            long l15;
            if ((by4 = (byte)((l15 = (l14 = l2 & l4) - l3) == 0L ? 0 : (l15 < 0L ? -1 : 1))) == 0) {
                try {
                    by4 = this.f;
                    this.f = n7 = by4 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                int n8 = (int)l2;
                byte by6 = (byte)n8;
                byArray[by4] = by6;
                return;
            }
            by4 = this.f;
            by2 = by4 + 1;
            this.f = by2;
            by2 = (byte)((int)l2 & 0x7F | 0x80);
            {
                byArray[by4] = by2;
                l2 >>>= n7;
                continue;
            }
            break;
        }
        Integer n10 = this.f;
        Integer n14 = n4;
        Integer n15 = n3;
        Object[] objectArray = new Object[3];
        objectArray[0] = n10;
        objectArray[n3] = n14;
        objectArray[2] = n15;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(string2, indexOutOfBoundsException2);
        throw codedOutputStream$OutOfSpaceException;
    }

    public final void Z(byte[] byArray, int n3, int n4) {
        Object object;
        try {
            object = this.d;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.f;
            Integer n7 = this.e;
            Object object2 = n4;
            Object[] objectArray = new Object[]{object, n7, object2};
            object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException((String)object2, indexOutOfBoundsException);
            throw codedOutputStream$OutOfSpaceException;
        }
        int n8 = this.f;
        System.arraycopy(byArray, n3, object, n8, n4);
        int n10 = this.f + n4;
        this.f = n10;
    }

    public final void d(byte[] byArray, int n3, int n4) {
        this.Z(byArray, n3, n4);
    }
}

