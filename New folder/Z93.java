/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;

public final class Z93 {
    public int a;
    public final SparseArray b;
    public final n60_0 c;

    public Z93(im0 im02) {
        SparseArray sparseArray;
        this.b = sparseArray = new SparseArray();
        this.c = im02;
        this.a = -1;
    }

    public final Object a(int n3) {
        int n4;
        SparseArray sparseArray;
        int n7 = this.a;
        int n8 = -1;
        if (n7 == n8) {
            n7 = 0;
            this.a = 0;
        }
        while (true) {
            n7 = this.a;
            sparseArray = this.b;
            if (n7 <= 0 || n3 >= (n7 = sparseArray.keyAt(n7))) break;
            this.a = n7 = this.a + -1;
        }
        while ((n7 = this.a) < (n4 = sparseArray.size() + -1)) {
            n7 = this.a + 1;
            if (n3 < (n7 = sparseArray.keyAt(n7))) break;
            this.a = n7 = this.a + 1;
        }
        n3 = this.a;
        return sparseArray.valueAt(n3);
    }
}

