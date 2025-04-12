/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
package androidx.recyclerview.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$b {
    public final SparseIntArray a;
    public final SparseIntArray b;

    public GridLayoutManager$b() {
        SparseIntArray sparseIntArray;
        this.a = sparseIntArray = new SparseIntArray();
        this.b = sparseIntArray = new SparseIntArray();
    }

    public final int a(int n3, int n4) {
        int n7 = this.c(n3);
        int n8 = 0;
        int n10 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n14 = this.c(i3);
            if ((n8 += n14) == n4) {
                ++n10;
                n8 = 0;
                continue;
            }
            if (n8 <= n4) continue;
            ++n10;
            n8 = n14;
        }
        if ((n8 += n7) > n4) {
            ++n10;
        }
        return n10;
    }

    public int b(int n3, int n4) {
        int n7 = this.c(n3);
        if (n7 == n4) {
            return 0;
        }
        int n8 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n10 = this.c(i3);
            if ((n8 += n10) == n4) {
                n8 = 0;
                continue;
            }
            if (n8 <= n4) continue;
            n8 = n10;
        }
        if ((n7 += n8) <= n4) {
            return n8;
        }
        return 0;
    }

    public abstract int c(int var1);

    public final void d() {
        this.a.clear();
    }
}

