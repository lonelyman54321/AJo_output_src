/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ZA1 {
    public int a;
    public long[] b;

    public ZA1() {
        this(32);
    }

    public ZA1(int n3) {
        long[] lArray = new long[n3];
        this.b = lArray;
    }

    public final void a(long l2) {
        long[] lArray;
        int n3 = this.a;
        long[] lArray2 = this.b;
        int n4 = lArray2.length;
        if (n3 == n4) {
            this.b = lArray = Arrays.copyOf(lArray2, n3 *= 2);
        }
        lArray = this.b;
        int n7 = this.a;
        this.a = n4 = n7 + 1;
        lArray[n7] = l2;
    }

    public final void b(long[] lArray) {
        int n3 = this.a;
        int n4 = lArray.length;
        long[] lArray2 = this.b;
        int n7 = lArray2.length;
        if ((n3 += n4) > n7) {
            n7 = Math.max(lArray2.length * 2, n3);
            this.b = lArray2 = Arrays.copyOf(lArray2, n7);
        }
        lArray2 = this.b;
        n7 = this.a;
        int n8 = lArray.length;
        System.arraycopy(lArray, 0, lArray2, n7, n8);
        this.a = n3;
    }

    public final long c(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.a)) {
            return this.b[n3];
        }
        CharSequence charSequence = wk0_0.a(n3, "Invalid index ", ", size is ");
        int n7 = this.a;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }
}

