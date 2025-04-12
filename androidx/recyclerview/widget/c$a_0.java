/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
package androidx.recyclerview.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.p;

/*
 * Renamed from androidx.recyclerview.widget.C$a
 */
public final class c$a_0
implements be3_0 {
    public final SparseIntArray a;
    public final SparseIntArray b;
    public final p c;
    public final /* synthetic */ C d;

    public c$a_0(C c2, p p2) {
        this.d = c2;
        int n3 = 1;
        super(n3);
        this.a = c2;
        super(n3);
        this.b = c2;
        this.c = p2;
    }

    public final int a(int n3) {
        Object object = this.b;
        int n4 = object.indexOfKey(n3);
        if (n4 >= 0) {
            return object.valueAt(n4);
        }
        CharSequence charSequence = wk0_0.a(n3, "requested global type ", " does not belong to the adapter:");
        RecyclerView$f recyclerView$f = this.c.c;
        charSequence.append(recyclerView$f);
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public final int b(int n3) {
        int n4;
        int n7;
        SparseIntArray sparseIntArray = this.a;
        int n8 = sparseIntArray.indexOfKey(n3);
        if (n8 > (n7 = -1)) {
            return sparseIntArray.valueAt(n8);
        }
        C c2 = this.d;
        n7 = c2.b;
        c2.b = n4 = n7 + 1;
        c2 = c2.a;
        p p2 = this.c;
        c2.put(n7, p2);
        sparseIntArray.put(n3, n7);
        this.b.put(n7, n3);
        return n7;
    }
}

