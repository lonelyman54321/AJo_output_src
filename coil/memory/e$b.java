/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import coil.memory.e;
import coil.memory.e$a;
import coil.memory.h;
import java.util.Map;

public final class e$b
extends WC1 {
    public final /* synthetic */ e a;

    public e$b(int n3, e e2) {
        this.a = e2;
        super(n3);
    }

    public final void entryRemoved(boolean bl2, Object object, Object object2, Object object3) {
        object = (MemoryCache$Key)object;
        object2 = (e$a)object2;
        object3 = (e$a)object3;
        h h3 = this.a.a;
        object3 = ((e$a)object2).a;
        Map map2 = ((e$a)object2).b;
        int n3 = ((e$a)object2).c;
        h3.c((MemoryCache$Key)object, (Bitmap)object3, map2, n3);
    }

    public final int sizeOf(Object object, Object object2) {
        object = (MemoryCache$Key)object;
        return ((e$a)object2).c;
    }
}

