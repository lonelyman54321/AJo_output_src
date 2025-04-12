/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.memory.MemoryCache$Key;
import coil.memory.MemoryCache$b;
import coil.memory.g;
import coil.memory.h;
import java.util.Map;

public final class d
implements MemoryCache {
    public final g a;
    public final h b;

    public d(g g3, h h3) {
        this.a = g3;
        this.b = h3;
    }

    public final void a(int n3) {
        this.a.a(n3);
        this.b.a(n3);
    }

    public final MemoryCache$b b(MemoryCache$Key memoryCache$Key) {
        MemoryCache$b memoryCache$b = this.a.b(memoryCache$Key);
        if (memoryCache$b == null) {
            memoryCache$b = this.b.b(memoryCache$Key);
        }
        return memoryCache$b;
    }

    public final void c(MemoryCache$Key object, MemoryCache$b memoryCache$b) {
        Object object2 = e.b(((MemoryCache$Key)object).b);
        object = ((MemoryCache$Key)object).a;
        MemoryCache$Key memoryCache$Key = new MemoryCache$Key((String)object, (Map)object2);
        object = e.b(memoryCache$b.b);
        object2 = this.a;
        memoryCache$b = memoryCache$b.a;
        object2.c(memoryCache$Key, (Bitmap)memoryCache$b, (Map)object);
    }
}

