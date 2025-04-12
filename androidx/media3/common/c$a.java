/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.c;

public final class c$a {
    public final SparseBooleanArray a;
    public boolean b;

    public c$a() {
        SparseBooleanArray sparseBooleanArray;
        this.a = sparseBooleanArray = new SparseBooleanArray();
    }

    public final void a(int n3) {
        boolean bl2 = this.b;
        boolean bl3 = true;
        ct3.f(bl2 ^ bl3);
        this.a.append(n3, bl3);
    }

    public final c b() {
        boolean bl2 = this.b;
        boolean bl3 = true;
        ct3.f(bl2 ^ bl3);
        this.b = bl3;
        SparseBooleanArray sparseBooleanArray = this.a;
        c c2 = new c(sparseBooleanArray);
        return c2;
    }
}

