/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$t$a;
import java.util.Set;

public final class RecyclerView$t {
    public SparseArray a;
    public int b;
    public Set c;

    public final RecyclerView$t$a a(int n3) {
        SparseArray sparseArray = this.a;
        RecyclerView$t$a recyclerView$t$a = (RecyclerView$t$a)sparseArray.get(n3);
        if (recyclerView$t$a == null) {
            recyclerView$t$a = new RecyclerView$t$a();
            sparseArray.put(n3, (Object)recyclerView$t$a);
        }
        return recyclerView$t$a;
    }
}

