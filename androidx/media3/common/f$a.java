/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.c;

public final class f$a {
    public final c a;

    static {
        new SparseBooleanArray();
        ct3.f(false ^ true);
        gz3.D(0);
    }

    public f$a(c c2) {
        this.a = c2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof f$a;
        if (!bl2) {
            return false;
        }
        object = (f$a)object;
        c c2 = this.a;
        object = ((f$a)object).a;
        return c2.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

