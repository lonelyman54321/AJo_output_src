/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LongSparseArray
 */
import android.util.LongSparseArray;

/*
 * Renamed from qB1
 */
public final class qb1_1
extends db1_1 {
    public int a;
    public final /* synthetic */ LongSparseArray b;

    public qb1_1(LongSparseArray longSparseArray) {
        this.b = longSparseArray;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        LongSparseArray longSparseArray = this.b;
        int n4 = longSparseArray.size();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final long nextLong() {
        int n3;
        int n4 = this.a;
        this.a = n3 = n4 + 1;
        return this.b.keyAt(n4);
    }
}

