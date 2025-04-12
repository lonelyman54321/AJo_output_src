/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class B01 {
    public final float[] a;
    public final int[] b;

    public B01(int[] nArray, float[] fArray) {
        this.a = fArray;
        this.b = nArray;
    }

    public final void a(B01 b01) {
        int[] nArray;
        int n3;
        for (int i3 = 0; i3 < (n3 = (nArray = b01.b).length); ++i3) {
            int n4;
            float f5 = b01.a[i3];
            float[] fArray = this.a;
            fArray[i3] = f5;
            int[] nArray2 = this.b;
            nArray2[i3] = n4 = nArray[i3];
        }
    }

    public final B01 b(float[] fArray) {
        int n3;
        int n4 = fArray.length;
        int[] nArray = new int[n4];
        B01 b01 = null;
        for (int i3 = 0; i3 < (n3 = fArray.length); ++i3) {
            float f5 = fArray[i3];
            float[] fArray2 = this.a;
            int n7 = Arrays.binarySearch(fArray2, f5);
            int[] nArray2 = this.b;
            if (n7 >= 0) {
                n3 = nArray2[n7];
            } else if ((n7 = -(n7 + 1)) == 0) {
                n3 = nArray2[0];
            } else {
                int n8 = nArray2.length + -1;
                if (n7 == n8) {
                    n3 = nArray2.length + -1;
                    n3 = nArray2[n3];
                } else {
                    n8 = n7 + -1;
                    float f6 = fArray2[n8];
                    float f7 = fArray2[n7];
                    n8 = nArray2[n8];
                    n7 = nArray2[n7];
                    f5 -= f6;
                    n3 = hh3_1.c(f5 /= (f7 -= f6), n8, n7);
                }
            }
            nArray[i3] = n3;
        }
        b01 = new B01(nArray, fArray);
        return b01;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = B01.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (B01)object;
            object2 = this.a;
            object3 = ((B01)object).a;
            boolean bl4 = Arrays.equals((float[])object2, (float[])object3);
            if (!bl4 || !(bl3 = Arrays.equals((int[])(object2 = (Object)this.b), (int[])(object = (Object)((B01)object).b)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Arrays.hashCode(this.a) * 31;
        return Arrays.hashCode(this.b) + n3;
    }
}

