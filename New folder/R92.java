/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class R92
extends i0_0 {
    public I92[] a;
    public int b;
    public int[] c;
    public int d;
    public Object[] e;
    public int f;
    public int g;
    public int h;

    public R92() {
        int n3 = 16;
        Object[] objectArray = new I92[n3];
        this.a = objectArray;
        objectArray = new int[n3];
        this.c = (int[])objectArray;
        Object[] objectArray2 = new Object[n3];
        this.e = objectArray2;
    }

    public static final int Q(R92 r92, int n3) {
        int n4;
        r92.getClass();
        if (n3 == 0) {
            n4 = 0;
            r92 = null;
        } else {
            n4 = 32 - n3;
            n3 = -1;
            n4 = n3 >>> n4;
        }
        return n4;
    }

    public final void R() {
        this.b = 0;
        this.d = 0;
        Object[] objectArray = this.e;
        int n3 = this.f;
        rp_1.n(0, n3, null, objectArray);
        this.f = 0;
    }

    public final void S(mp mp2, q73 q732, F30$a f30$a) {
        boolean bl2 = this.U();
        if (bl2) {
            int n3;
            int n4;
            R92$a r92$a = new R92$a(this);
            do {
                R92 r92 = r92$a.d;
                Object object = r92.a;
                int n7 = r92$a.a;
                object = object[n7];
                Intrinsics.checkNotNull(object);
                ((I92)object).a(r92$a, mp2, q732, f30$a);
                n4 = r92$a.a;
                n7 = r92.b;
                if (n4 >= n7) break;
                I92[] i92Array = r92.a;
                object = i92Array[n4];
                Intrinsics.checkNotNull(object);
                n7 = r92$a.b;
                int n8 = ((I92)object).a;
                r92$a.b = n7 += n8;
                n7 = r92$a.c;
                n4 = ((I92)object).b;
                r92$a.c = n7 += n4;
                r92$a.a = n4 = r92$a.a + 1;
                n3 = r92.b;
            } while (n4 < n3);
        }
        this.R();
    }

    public final boolean T() {
        int n3 = this.b;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean U() {
        int n3 = this.b;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final I92 V() {
        Object object = this.a;
        int n3 = this.b + -1;
        object = object[n3];
        Intrinsics.checkNotNull(object);
        return object;
    }

    public final void W(I92 i92) {
        int n3 = i92.a;
        int n4 = i92.b;
        if (n3 == 0 && n4 == 0) {
            this.X(i92);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot push ");
        stringBuilder.append(i92);
        stringBuilder.append(" without arguments because it expects ");
        stringBuilder.append(n3);
        stringBuilder.append(" ints and ");
        stringBuilder.append(n4);
        stringBuilder.append(" objects.");
        sn2.b(stringBuilder.toString());
        throw null;
    }

    public final void X(I92 i92) {
        int n3;
        Object[] objectArray = null;
        this.g = 0;
        this.h = 0;
        int n4 = this.b;
        Object[] objectArray2 = this.a;
        int n7 = objectArray2.length;
        int n8 = 1024;
        String string2 = "copyOf(this, newSize)";
        if (n4 == n7) {
            n7 = n4 > n8 ? 1024 : n4;
            objectArray = Arrays.copyOf(objectArray2, n4 += n7);
            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            this.a = objectArray;
        }
        n4 = this.d;
        int n10 = i92.a;
        objectArray2 = this.c;
        n7 = objectArray2.length;
        if ((n4 += n10) > n7) {
            if ((n7 += (n3 = n7 > n8 ? 1024 : n7)) >= n4) {
                n4 = n7;
            }
            objectArray = Arrays.copyOf((int[])objectArray2, n4);
            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            this.c = (int[])objectArray;
        }
        n4 = this.f;
        n10 = i92.b;
        Object[] objectArray3 = this.e;
        n3 = objectArray3.length;
        if ((n4 += n10) > n3) {
            if (n3 <= n8) {
                n8 = n3;
            }
            if ((n3 += n8) >= n4) {
                n4 = n3;
            }
            objectArray = Arrays.copyOf(objectArray3, n4);
            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            this.e = objectArray;
        }
        objectArray = this.a;
        n7 = this.b;
        this.b = n8 = n7 + 1;
        objectArray[n7] = i92;
        n4 = this.d;
        int n14 = i92.a;
        this.d = n4 += n14;
        this.f = n14 = this.f + n10;
    }
}

