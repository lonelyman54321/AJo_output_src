/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 */
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.c;

public final class oe$b {
    public final c a;
    public final SparseArray b;

    public oe$b(c c2, SparseArray sparseArray) {
        int n3;
        this.a = c2;
        SparseBooleanArray sparseBooleanArray = c2.a;
        int n4 = sparseBooleanArray.size();
        SparseArray sparseArray2 = new SparseArray(n4);
        for (n4 = 0; n4 < (n3 = sparseBooleanArray.size()); ++n4) {
            n3 = c2.a(n4);
            oe$a oe$a = (oe$a)sparseArray.get(n3);
            oe$a.getClass();
            sparseArray2.append(n3, (Object)oe$a);
        }
        this.b = sparseArray2;
    }

    public final boolean a(int n3) {
        return this.a.a.get(n3);
    }
}

