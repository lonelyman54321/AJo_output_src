/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.g;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.b$a$a;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$c;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.k$a;
import androidx.media3.exoplayer.source.k$a$a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a
implements j {
    public final ArrayList a;
    public final HashSet b;
    public final k$a c;
    public final b$a d;
    public Looper e;
    public g f;
    public nu2 g;

    public a() {
        int n3 = 1;
        Object object = new ArrayList(n3);
        this.a = object;
        super(n3);
        this.b = object;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.c = object = new k$a(copyOnWriteArrayList, 0, null);
        this.d = object = new b$a();
    }

    public final void a(Handler handler, k k2) {
        handler.getClass();
        k$a k$a = this.c;
        k$a.getClass();
        k$a$a k$a$a = new Object();
        k$a$a.a = handler;
        k$a$a.b = k2;
        k$a.c.add(k$a$a);
    }

    public final void b(k k2) {
        boolean bl2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator iterator = copyOnWriteArrayList.iterator();
        while (bl2 = iterator.hasNext()) {
            k$a$a k$a$a = (k$a$a)iterator.next();
            k k3 = k$a$a.b;
            if (k3 != k2) continue;
            copyOnWriteArrayList.remove(k$a$a);
        }
    }

    public final void d(Handler handler, b b2) {
        handler.getClass();
        b$a b$a = this.d;
        b$a.getClass();
        b$a$a b$a$a = new Object();
        b$a$a.a = handler;
        b$a$a.b = b2;
        b$a.c.add(b$a$a);
    }

    public final void e(b b2) {
        boolean bl2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator iterator = copyOnWriteArrayList.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b3 = b$a$a.b;
            if (b3 != b2) continue;
            copyOnWriteArrayList.remove(b$a$a);
        }
    }

    public final void g(j$c j$c) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean bl2 = hashSet.isEmpty();
        hashSet.add(j$c);
        if (bl2) {
            this.r();
        }
    }

    public /* synthetic */ void h(MediaItem mediaItem) {
    }

    public final void i(j$c j$c, Kq3 kq3, nu2 object) {
        boolean bl2;
        Looper looper = Looper.myLooper();
        Looper looper2 = this.e;
        if (looper2 != null && looper2 != looper) {
            bl2 = false;
            looper2 = null;
        } else {
            bl2 = true;
        }
        ct3.a(bl2);
        this.g = object;
        object = this.f;
        this.a.add(j$c);
        looper2 = this.e;
        if (looper2 == null) {
            this.e = looper;
            object = this.b;
            ((HashSet)object).add(j$c);
            this.s(kq3);
        } else if (object != null) {
            this.g(j$c);
            j$c.a(this, (g)object);
        }
    }

    public final void j(j$c object) {
        ArrayList arrayList = this.a;
        arrayList.remove(object);
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            this.e = null;
            this.f = null;
            this.g = null;
            object = this.b;
            ((HashSet)object).clear();
            this.u();
        } else {
            this.k((j$c)object);
        }
    }

    public final void k(j$c j$c) {
        boolean bl2;
        HashSet hashSet = this.b;
        boolean bl3 = hashSet.isEmpty() ^ true;
        hashSet.remove(j$c);
        if (bl3 && (bl2 = hashSet.isEmpty())) {
            this.q();
        }
    }

    public /* synthetic */ boolean m() {
        return true;
    }

    public /* synthetic */ g o() {
        return null;
    }

    public /* synthetic */ boolean p(MediaItem mediaItem) {
        return false;
    }

    public void q() {
    }

    public void r() {
    }

    public abstract void s(Kq3 var1);

    public final void t(g g3) {
        boolean bl2;
        this.f = g3;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            j$c j$c = (j$c)iterator.next();
            j$c.a(this, g3);
        }
    }

    public abstract void u();
}

