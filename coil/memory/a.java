/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import coil.memory.MemoryCache$b;
import coil.memory.g;
import coil.memory.h;
import java.util.Map;

public final class a
implements g {
    public final h a;

    public a(h h3) {
        this.a = h3;
    }

    public final void a(int n3) {
    }

    public final MemoryCache$b b(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    public final void c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map2) {
        int n3 = b.a(bitmap);
        this.a.c(memoryCache$Key, bitmap, map2, n3);
    }
}

