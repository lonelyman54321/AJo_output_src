/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LongSparseArray
 */
import android.util.LongSparseArray;

public final class ah
implements Runnable {
    public final /* synthetic */ pg_1 a;
    public final /* synthetic */ LongSparseArray b;

    public /* synthetic */ ah(pg_1 pg_12, LongSparseArray longSparseArray) {
        this.a = pg_12;
        this.b = longSparseArray;
    }

    public final void run() {
        pg_1 pg_12 = this.a;
        LongSparseArray longSparseArray = this.b;
        Pg$b.a(pg_12, longSparseArray);
    }
}

