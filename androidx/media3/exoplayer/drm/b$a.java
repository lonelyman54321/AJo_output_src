/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a$a;
import androidx.media3.exoplayer.source.j$b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b$a {
    public final int a;
    public final j$b b;
    public final CopyOnWriteArrayList c;

    public b$a() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this(copyOnWriteArrayList, 0, null);
    }

    public b$a(CopyOnWriteArrayList copyOnWriteArrayList, int n3, j$b j$b) {
        this.c = copyOnWriteArrayList;
        this.a = n3;
        this.b = j$b;
    }

    public final void a() {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b2 = b$a$a.b;
            Wv0 wv0 = new Wv0(this, b2);
            b$a$a = b$a$a.a;
            gz3.L((Handler)b$a$a, wv0);
        }
    }

    public final void b() {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b2 = b$a$a.b;
            Uv0 uv0 = new Uv0(this, b2);
            b$a$a = b$a$a.a;
            gz3.L((Handler)b$a$a, uv0);
        }
    }

    public final void c() {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b2 = b$a$a.b;
            Vv0 vv0 = new Vv0(this, b2);
            b$a$a = b$a$a.a;
            gz3.L((Handler)b$a$a, vv0);
        }
    }

    public final void d(int n3) {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b2 = b$a$a.b;
            sv0_0 sv0_02 = new sv0_0(this, b2, n3);
            b$a$a = b$a$a.a;
            gz3.L((Handler)b$a$a, sv0_02);
        }
    }

    public final void e(Exception exception) {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b2 = b$a$a.b;
            Rv0 rv0 = new Rv0(this, b2, exception);
            b$a$a = b$a$a.a;
            gz3.L((Handler)b$a$a, rv0);
        }
    }

    public final void f() {
        boolean bl2;
        Iterator iterator = this.c.iterator();
        while (bl2 = iterator.hasNext()) {
            b$a$a b$a$a = (b$a$a)iterator.next();
            b b2 = b$a$a.b;
            Tv0 tv0 = new Tv0(this, b2);
            b$a$a = b$a$a.a;
            gz3.L((Handler)b$a$a, tv0);
        }
    }
}

