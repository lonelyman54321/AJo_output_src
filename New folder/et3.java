/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class et3 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;

    public final void a(float f5, int n3) {
        int n4;
        Object[] objectArray;
        int n7 = this.f;
        int[] nArray = this.d;
        int n8 = nArray.length;
        if (n7 >= n8) {
            n7 = nArray.length * 2;
            this.d = objectArray = Arrays.copyOf(nArray, n7);
            objectArray = this.e;
            n4 = objectArray.length * 2;
            objectArray = Arrays.copyOf((float[])objectArray, n4);
            this.e = objectArray;
        }
        objectArray = this.d;
        n4 = this.f;
        objectArray[n4] = n3;
        float[] fArray = this.e;
        this.f = n7 = n4 + 1;
        fArray[n4] = f5;
    }

    public final void b(int n3, int n4) {
        int n7;
        int[] nArray;
        int n8 = this.c;
        int[] nArray2 = this.a;
        int n10 = nArray2.length;
        if (n8 >= n10) {
            n8 = nArray2.length * 2;
            this.a = nArray = Arrays.copyOf(nArray2, n8);
            nArray = this.b;
            n7 = nArray.length * 2;
            nArray = Arrays.copyOf(nArray, n7);
            this.b = nArray;
        }
        nArray = this.a;
        n7 = this.c;
        nArray[n7] = n3;
        int[] nArray3 = this.b;
        this.c = n8 = n7 + 1;
        nArray3[n7] = n4;
    }

    public final void c(int n3, String string2) {
        int n4;
        Object[] objectArray;
        int n7 = this.i;
        int[] nArray = this.g;
        int n8 = nArray.length;
        if (n7 >= n8) {
            n7 = nArray.length * 2;
            this.g = objectArray = Arrays.copyOf(nArray, n7);
            objectArray = this.h;
            n4 = objectArray.length * 2;
            objectArray = (String[])Arrays.copyOf(objectArray, n4);
            this.h = (String[])objectArray;
        }
        objectArray = this.g;
        n4 = this.i;
        objectArray[n4] = n3;
        String[] stringArray = this.h;
        this.i = n7 = n4 + 1;
        stringArray[n4] = string2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TypedBundle{mCountInt=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", mCountFloat=");
        n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(", mCountString=");
        return g30.a(this.i, ", mCountBoolean=0}", stringBuilder);
    }
}

