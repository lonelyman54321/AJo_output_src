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
import coil.memory.e$a;
import coil.memory.e$b;
import coil.memory.g;
import coil.memory.h;
import java.util.Map;

public final class e
implements g {
    public final h a;
    public final e$b b;

    public e(int n3, h object) {
        this.a = object;
        this.b = object = new e$b(n3, this);
    }

    public final void a(int n3) {
        int n4 = 40;
        e$b e$b = this.b;
        if (n3 >= n4) {
            e$b.evictAll();
        } else {
            n4 = 10;
            if (n4 <= n3 && n3 < (n4 = 20)) {
                n3 = e$b.size() / 2;
                e$b.trimToSize(n3);
            }
        }
    }

    public final MemoryCache$b b(MemoryCache$Key object) {
        Object object2 = this.b;
        if ((object = (e$a)((WC1)object2).get(object)) != null) {
            Bitmap bitmap = ((e$a)object).a;
            object = ((e$a)object).b;
            object2 = new MemoryCache$b(bitmap, (Map)object);
        } else {
            object2 = null;
        }
        return object2;
    }

    public final void c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map2) {
        Object object;
        int n3;
        int n4 = b.a(bitmap);
        if (n4 <= (n3 = ((WC1)(object = this.b)).maxSize())) {
            e$a e$a = new e$a(bitmap, map2, n4);
            ((WC1)object).put(memoryCache$Key, e$a);
        } else {
            ((WC1)object).remove(memoryCache$Key);
            object = this.a;
            object.c(memoryCache$Key, bitmap, map2, n4);
        }
    }
}

