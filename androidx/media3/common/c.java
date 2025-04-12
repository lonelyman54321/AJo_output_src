/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
package androidx.media3.common;

import android.util.SparseBooleanArray;

public final class c {
    public final SparseBooleanArray a;

    public c(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int n3) {
        SparseBooleanArray sparseBooleanArray = this.a;
        int n4 = sparseBooleanArray.size();
        ct3.d(n3, n4);
        return sparseBooleanArray.keyAt(n3);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof c;
        if (n3 == 0) {
            return false;
        }
        object = (c)object;
        n3 = gz3.a;
        int n4 = 24;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (n3 < n4) {
            SparseBooleanArray sparseBooleanArray2;
            n3 = sparseBooleanArray.size();
            if (n3 != (n4 = (sparseBooleanArray2 = ((c)object).a).size())) {
                return false;
            }
            for (n3 = 0; n3 < (n4 = sparseBooleanArray.size()); ++n3) {
                int n7;
                n4 = this.a(n3);
                if (n4 == (n7 = ((c)object).a(n3))) continue;
                return false;
            }
            return bl2;
        }
        object = ((c)object).a;
        return sparseBooleanArray.equals(object);
    }

    public final int hashCode() {
        int n3 = gz3.a;
        int n4 = 24;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (n3 < n4) {
            int n7;
            n3 = sparseBooleanArray.size();
            for (n4 = 0; n4 < (n7 = sparseBooleanArray.size()); ++n4) {
                n3 *= 31;
                n7 = this.a(n4);
                n3 += n7;
            }
            return n3;
        }
        return sparseBooleanArray.hashCode();
    }
}

