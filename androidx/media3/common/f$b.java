/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.c;

public final class f$b {
    public final c a;

    public f$b(c c2) {
        this.a = c2;
    }

    public final boolean a(int ... nArray) {
        c c2 = this.a;
        c2.getClass();
        int n3 = nArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = nArray[i3];
            SparseBooleanArray sparseBooleanArray = c2.a;
            if ((n4 = (int)(sparseBooleanArray.get(n4) ? 1 : 0)) == 0) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof f$b;
        if (!bl2) {
            return false;
        }
        object = (f$b)object;
        c c2 = this.a;
        object = ((f$b)object).a;
        return c2.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

