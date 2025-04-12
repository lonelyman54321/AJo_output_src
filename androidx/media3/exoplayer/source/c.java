/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.g;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.c$a;
import androidx.media3.exoplayer.source.c$b;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.j$c;
import androidx.media3.exoplayer.source.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public abstract class c
extends a {
    public final HashMap h;
    public Handler i;
    public Kq3 j;

    public c() {
        HashMap hashMap;
        this.h = hashMap = new HashMap();
    }

    public void l() {
        boolean bl2;
        Iterator iterator = this.h.values().iterator();
        while (bl2 = iterator.hasNext()) {
            j j3 = ((c$b)iterator.next()).a;
            j3.l();
        }
    }

    public void q() {
        boolean bl2;
        Iterator iterator = this.h.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (c$b)iterator.next();
            j j3 = ((c$b)object).a;
            object = ((c$b)object).b;
            j3.k((j$c)object);
        }
    }

    public void r() {
        boolean bl2;
        Iterator iterator = this.h.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (c$b)iterator.next();
            j j3 = ((c$b)object).a;
            object = ((c$b)object).b;
            j3.g((j$c)object);
        }
    }

    public void u() {
        boolean bl2;
        HashMap hashMap = this.h;
        Iterator iterator = hashMap.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (c$b)iterator.next();
            j j3 = ((c$b)object).a;
            j$c j$c = ((c$b)object).b;
            j3.j(j$c);
            j3 = ((c$b)object).a;
            object = ((c$b)object).c;
            j3.b((k)object);
            j3.e((b)object);
        }
        hashMap.clear();
    }

    public abstract j$b v(Object var1, j$b var2);

    public long w(long l2, Object object) {
        return l2;
    }

    public int x(int n3, Object object) {
        return n3;
    }

    public abstract void y(Object var1, j var2, g var3);

    public final void z(Object object, j j3) {
        Object object2 = this.h;
        boolean bl2 = ((HashMap)object2).containsKey(object) ^ true;
        ct3.a(bl2);
        v30_0 v30_02 = new v30_0(this, object);
        c$a c$a = new c$a(this, object);
        c$b c$b = new c$b(j3, v30_02, c$a);
        ((HashMap)object2).put(object, c$b);
        object = this.i;
        object.getClass();
        j3.a((Handler)object, c$a);
        object = this.i;
        object.getClass();
        j3.d((Handler)object, c$a);
        object = this.j;
        object2 = this.g;
        ct3.h(object2);
        j3.i(v30_02, (Kq3)object, (nu2)object2);
        object = this.b;
        boolean bl3 = ((HashSet)object).isEmpty() ^ true;
        if (!bl3) {
            j3.k(v30_02);
        }
    }
}

