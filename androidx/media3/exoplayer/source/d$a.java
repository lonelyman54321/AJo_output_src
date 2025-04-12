/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.g;
import androidx.media3.exoplayer.source.d$d;
import androidx.media3.exoplayer.source.h$a;
import androidx.media3.exoplayer.source.s;
import java.util.Collection;
import java.util.HashMap;

public final class d$a
extends H0 {
    public final int f;
    public final int g;
    public final int[] h;
    public final int[] i;
    public final g[] j;
    public final Object[] k;
    public final HashMap l;

    public d$a(Collection object, s object2, boolean bl2) {
        super(bl2, (s)object2);
        boolean bl3;
        int n3 = object.size();
        Object[] objectArray = new int[n3];
        this.h = objectArray;
        objectArray = new int[n3];
        this.i = objectArray;
        objectArray = new g[n3];
        this.j = (g[])objectArray;
        object2 = new Object[n3];
        this.k = object2;
        super();
        this.l = object2;
        object = object.iterator();
        n3 = 0;
        object2 = null;
        bl2 = false;
        objectArray = null;
        int n4 = 0;
        Integer n7 = null;
        while (bl3 = object.hasNext()) {
            Object object3 = (d$d)object.next();
            Object object4 = this.j;
            h$a h$a = ((d$d)object3).a.o;
            object4[n4] = h$a;
            this.i[n4] = n3;
            this.h[n4] = (int)(bl2 ? 1 : 0);
            int n8 = ((g)h$a).p();
            n3 += n8;
            n8 = this.j[n4].i();
            bl2 += n8;
            object4 = this.k;
            object4[n4] = object3 = ((d$d)object3).b;
            object4 = this.l;
            int n10 = n4 + 1;
            n7 = n4;
            ((HashMap)object4).put(object3, n7);
            n4 = n10;
        }
        this.f = n3;
        this.g = (int)(bl2 ? 1 : 0);
    }

    public final int i() {
        return this.g;
    }

    public final int p() {
        return this.f;
    }

    public final int r(Object object) {
        HashMap hashMap = this.l;
        int n3 = (object = (Integer)hashMap.get(object)) == null ? -1 : (Integer)object;
        return n3;
    }

    public final int s(int n3) {
        return gz3.c(this.h, ++n3, false, false);
    }

    public final int t(int n3) {
        return gz3.c(this.i, ++n3, false, false);
    }

    public final Object u(int n3) {
        return this.k[n3];
    }

    public final int v(int n3) {
        return this.h[n3];
    }

    public final int w(int n3) {
        return this.i[n3];
    }

    public final g z(int n3) {
        return this.j[n3];
    }
}

