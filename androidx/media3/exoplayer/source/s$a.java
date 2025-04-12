/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.s;
import java.util.Arrays;
import java.util.Random;

public final class s$a
implements s {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public s$a() {
        Random random = new Random();
        this(random);
    }

    public s$a(Random random) {
        int[] nArray = new int[]{};
        this(nArray, random);
    }

    public s$a(int[] nArray, Random object) {
        int n3;
        this.b = nArray;
        this.a = object;
        object = new int[nArray.length];
        this.c = (int[])object;
        int n4 = 0;
        object = null;
        while (n4 < (n3 = nArray.length)) {
            int[] nArray2 = this.c;
            int n7 = nArray[n4];
            nArray2[n7] = n4++;
        }
    }

    public final s$a a(int n3, int n4) {
        int n7;
        int n8 = n4 - n3;
        int[] nArray = this.b;
        int n10 = nArray.length - n8;
        int[] nArray2 = new int[n10];
        int n14 = 0;
        for (int i3 = 0; i3 < (n7 = nArray.length); ++i3) {
            n7 = nArray[i3];
            if (n7 >= n3 && n7 < n4) {
                ++n14;
                continue;
            }
            int n15 = i3 - n14;
            if (n7 >= n3) {
                n7 -= n8;
            }
            nArray2[n15] = n7;
        }
        long l2 = this.a.nextLong();
        Random random = new Random(l2);
        s$a s$a = new s$a(nArray2, random);
        return s$a;
    }

    public final int b(int n3) {
        int[] nArray = this.c;
        n3 = nArray[n3];
        int n4 = -1;
        if ((n3 += n4) >= 0) {
            nArray = this.b;
            n4 = nArray[n3];
        }
        return n4;
    }

    public final int c(int n3) {
        int[] nArray = this.b;
        int n4 = nArray.length;
        n3 = (n3 = this.c[n3] + 1) < n4 ? nArray[n3] : -1;
        return n3;
    }

    public final int d() {
        int n3;
        int[] nArray = this.b;
        int n4 = nArray.length;
        if (n4 > 0) {
            n4 = nArray.length + -1;
            n3 = nArray[n4];
        } else {
            n3 = -1;
        }
        return n3;
    }

    public final s$a e() {
        long l2 = this.a.nextLong();
        Random random = new Random(l2);
        s$a s$a = new s$a(random);
        return s$a;
    }

    public final int f() {
        int n3;
        int[] nArray = this.b;
        int n4 = nArray.length;
        if (n4 > 0) {
            n4 = 0;
            n3 = nArray[0];
        } else {
            n3 = -1;
        }
        return n3;
    }

    public final s$a g(int n3, int n4) {
        int n7;
        int n8;
        Random random;
        int[] nArray;
        int[] nArray2 = new int[n4];
        int[] nArray3 = new int[n4];
        int n10 = 0;
        int n14 = 0;
        int[] nArray4 = null;
        while (true) {
            nArray = this.b;
            random = this.a;
            if (n14 >= n4) break;
            int n15 = nArray.length + 1;
            nArray2[n14] = n15 = random.nextInt(n15);
            n15 = n14 + 1;
            int n16 = random.nextInt(n15);
            nArray3[n14] = n8 = nArray3[n16];
            nArray3[n16] = n14 += n3;
            n14 = n15;
        }
        Arrays.sort(nArray2);
        n14 = nArray.length + n4;
        nArray4 = new int[n14];
        n8 = 0;
        int n17 = 0;
        while (n10 < (n7 = nArray.length + n4)) {
            if (n8 < n4 && n17 == (n7 = nArray2[n8])) {
                n7 = n8 + 1;
                nArray4[n10] = n8 = nArray3[n8];
                n8 = n7;
            } else {
                n7 = n17 + 1;
                nArray4[n10] = n17 = nArray[n17];
                if (n17 >= n3) {
                    nArray4[n10] = n17 += n4;
                }
                n17 = n7;
            }
            ++n10;
        }
        long l2 = random.nextLong();
        Random random2 = new Random(l2);
        s$a s$a = new s$a(nArray4, random2);
        return s$a;
    }

    public final int getLength() {
        return this.b.length;
    }
}

