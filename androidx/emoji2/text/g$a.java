/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package androidx.emoji2.text;

import android.util.SparseArray;

public final class g$a {
    public final SparseArray a;
    public rt3 b;

    public g$a() {
        this(1);
    }

    public g$a(int n3) {
        SparseArray sparseArray;
        this.a = sparseArray = new SparseArray(n3);
    }

    public final void a(rt3 rt32, int n3, int n4) {
        g$a g$a;
        int n7 = rt32.a(n3);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            n7 = 0;
            g$a = null;
        } else {
            g$a = (g$a)sparseArray.get(n7);
        }
        if (g$a == null) {
            g$a = new g$a();
            int n8 = rt32.a(n3);
            sparseArray.put(n8, (Object)g$a);
        }
        if (n4 > n3) {
            g$a.a(rt32, ++n3, n4);
        } else {
            g$a.b = rt32;
        }
    }
}

