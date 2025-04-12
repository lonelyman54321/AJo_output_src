/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class ej1 {
    public int[] a;
    public int b;

    public ej1(int n3) {
        int[] nArray = new int[n3];
        this.a = nArray;
    }

    public final void a(int n3, int n4, int n7) {
        int n8 = this.b;
        int n10 = n8 + 3;
        int[] nArray = this.a;
        int n14 = nArray.length;
        if (n10 >= n14) {
            n14 = nArray.length * 2;
            nArray = Arrays.copyOf(nArray, n14);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(nArray, string2);
            this.a = nArray;
        }
        nArray = this.a;
        nArray[n8] = n3 += n7;
        n3 = n8 + 1;
        nArray[n3] = n4 += n7;
        nArray[n8 += 2] = n7;
        this.b = n10;
    }

    public final void b(int n3, int n4, int n7, int n8) {
        int n10 = this.b;
        int n14 = n10 + 4;
        int[] nArray = this.a;
        int n15 = nArray.length;
        if (n14 >= n15) {
            n15 = nArray.length * 2;
            nArray = Arrays.copyOf(nArray, n15);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(nArray, string2);
            this.a = nArray;
        }
        nArray = this.a;
        nArray[n10] = n3;
        n3 = n10 + 1;
        nArray[n3] = n4;
        n3 = n10 + 2;
        nArray[n3] = n7;
        nArray[n10 += 3] = n8;
        this.b = n14;
    }

    public final void c(int n3, int n4) {
        if (n3 < n4) {
            int n7;
            int n8 = n3 + -3;
            for (n7 = n3; n7 < n4; n7 += 3) {
                int[] nArray = this.a;
                int n10 = nArray[n7];
                int n14 = nArray[n4];
                if (n10 >= n14) {
                    if (n10 != n14) continue;
                    n10 = n7 + 1;
                    n14 = n4 + 1;
                    int n15 = nArray[n14];
                    if ((n10 = nArray[n10]) > n15) continue;
                }
                this.d(n8 += 3, n7);
            }
            n7 = n8 + 3;
            this.d(n7, n4);
            this.c(n3, n8);
            this.c(n8 += 6, n4);
        }
    }

    public final void d(int n3, int n4) {
        int n7;
        int n8;
        int[] nArray = this.a;
        int n10 = nArray[n3];
        nArray[n3] = n8 = nArray[n4];
        nArray[n4] = n10;
        n10 = n3 + 1;
        n8 = n4 + 1;
        int n14 = nArray[n10];
        nArray[n10] = n7 = nArray[n8];
        nArray[n8] = n14;
        n10 = nArray[n3 += 2];
        nArray[n3] = n8 = nArray[n4 += 2];
        nArray[n4] = n10;
    }
}

