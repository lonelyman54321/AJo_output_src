/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from GU
 */
public final class gu_0
implements dx2_1 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public gu_0(int[] nArray, long[] lArray, long[] lArray2, long[] lArray3) {
        int n3;
        this.b = nArray;
        this.c = lArray;
        this.d = lArray2;
        this.e = lArray3;
        this.a = n3 = nArray.length;
        if (n3 > 0) {
            int n4 = n3 + -1;
            long l2 = lArray2[n4];
            long l3 = lArray3[n3 += -1];
            this.f = l2 += l3;
        } else {
            long l4;
            this.f = l4 = 0L;
        }
    }

    public final dX2$a d(long l2) {
        int n3;
        long[] lArray = this.e;
        int n4 = 1;
        int n7 = gz3.d(lArray, l2, n4 != 0);
        long l3 = lArray[n7];
        long[] lArray2 = this.c;
        long l4 = lArray2[n7];
        fx2_0 fx2_02 = new fx2_0(l3, l4);
        Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object < 0 && n7 != (n3 = this.a - n4)) {
            l3 = lArray[n7 += n4];
            long l7 = lArray2[n7];
            fx2_0 fx2_03 = new fx2_0(l3, l7);
            dX2$a dX2$a = new dX2$a(fx2_02, fx2_03);
            return dX2$a;
        }
        dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
        return dX2$a;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChunkIndex(length=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", sizes=");
        String string2 = Arrays.toString(this.b);
        stringBuilder.append(string2);
        stringBuilder.append(", offsets=");
        string2 = Arrays.toString(this.c);
        stringBuilder.append(string2);
        stringBuilder.append(", timeUs=");
        string2 = Arrays.toString(this.e);
        stringBuilder.append(string2);
        stringBuilder.append(", durationsUs=");
        string2 = Arrays.toString(this.d);
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

