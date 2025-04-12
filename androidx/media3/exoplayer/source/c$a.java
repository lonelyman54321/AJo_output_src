/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.c;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.k$a;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c$a
implements k,
b {
    public final Object a;
    public k$a b;
    public b$a c;
    public final /* synthetic */ c d;

    public c$a(c object, Object object2) {
        this.d = object;
        CopyOnWriteArrayList copyOnWriteArrayList = ((a)object).c.c;
        Object object3 = new k$a(copyOnWriteArrayList, 0, null);
        this.b = object3;
        object = ((a)object).d.c;
        this.c = object3 = new b$a((CopyOnWriteArrayList)object, 0, null);
        this.a = object2;
    }

    public final void I(int n3, j$b object, Iv1 iv1, jm1_0 object2) {
        if ((n3 = (int)(this.a(n3, (j$b)object) ? 1 : 0)) != 0) {
            k$a k$a = this.b;
            object = this.j((jm1_0)object2, (j$b)object);
            k$a.getClass();
            object2 = new qn1_1(k$a, iv1, (jm1_0)object);
            k$a.a((n60_0)object2);
        }
    }

    public final void J(int n3, j$b object, jm1_0 object2) {
        if ((n3 = (int)(this.a(n3, (j$b)object) ? 1 : 0)) != 0) {
            k$a k$a = this.b;
            object = this.j((jm1_0)object2, (j$b)object);
            k$a.getClass();
            object2 = new mN1(k$a, (jm1_0)object);
            k$a.a((n60_0)object2);
        }
    }

    public final void L(int n3, j$b j$b) {
        if ((n3 = (int)(this.a(n3, j$b) ? 1 : 0)) != 0) {
            b$a b$a = this.c;
            b$a.a();
        }
    }

    public final void N(int n3, j$b object, Iv1 iv1, jm1_0 object2) {
        if ((n3 = (int)(this.a(n3, (j$b)object) ? 1 : 0)) != 0) {
            k$a k$a = this.b;
            object = this.j((jm1_0)object2, (j$b)object);
            k$a.getClass();
            object2 = new nN1(k$a, iv1, (jm1_0)object);
            k$a.a((n60_0)object2);
        }
    }

    public final void O(int n3, j$b j$b, int n4) {
        if ((n3 = (int)(this.a(n3, j$b) ? 1 : 0)) != 0) {
            b$a b$a = this.c;
            b$a.d(n4);
        }
    }

    public final void R(int n3, j$b j$b) {
        if ((n3 = (int)(this.a(n3, j$b) ? 1 : 0)) != 0) {
            b$a b$a = this.c;
            b$a.b();
        }
    }

    public final void S(int n3, j$b j$b, Exception exception) {
        if ((n3 = (int)(this.a(n3, j$b) ? 1 : 0)) != 0) {
            b$a b$a = this.c;
            b$a.e(exception);
        }
    }

    public final boolean a(int n3, j$b j$b) {
        block14: {
            Object object;
            Object object2;
            block13: {
                boolean bl2;
                int n4;
                block12: {
                    block11: {
                        object2 = this.a;
                        object = this.d;
                        if (j$b != null) {
                            if ((j$b = ((c)object).v(object2, j$b)) == null) {
                                return false;
                            }
                        } else {
                            j$b = null;
                        }
                        n3 = ((c)object).x(n3, object2);
                        object2 = this.b;
                        n4 = ((k$a)object2).a;
                        if (n4 != n3) break block11;
                        n4 = gz3.a;
                        object2 = ((k$a)object2).b;
                        bl2 = Objects.equals(object2, j$b);
                        if (bl2) break block12;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = ((a)object).c.c;
                    this.b = object2 = new k$a(copyOnWriteArrayList, n3, j$b);
                }
                object2 = this.c;
                n4 = ((b$a)object2).a;
                if (n4 != n3) break block13;
                n4 = gz3.a;
                object2 = ((b$a)object2).b;
                bl2 = Objects.equals(object2, j$b);
                if (bl2) break block14;
            }
            object = ((a)object).d.c;
            this.c = object2 = new b$a((CopyOnWriteArrayList)object, n3, j$b);
        }
        return true;
    }

    public final void b0(int n3, j$b j$b) {
        if ((n3 = (int)(this.a(n3, j$b) ? 1 : 0)) != 0) {
            b$a b$a = this.c;
            b$a.c();
        }
    }

    public final void i0(int n3, j$b object, Iv1 iv1, jm1_0 jm1_02, IOException iOException, boolean bl2) {
        if ((n3 = (int)(this.a(n3, (j$b)object) ? 1 : 0)) != 0) {
            k$a k$a = this.b;
            jm1_0 jm1_03 = this.j(jm1_02, (j$b)object);
            k$a.getClass();
            object = new pn1_0(k$a, iv1, jm1_03, iOException, bl2);
            k$a.a((n60_0)object);
        }
    }

    public final jm1_0 j(jm1_0 jm1_02, j$b object) {
        object = this.d;
        Object object2 = this.a;
        long l2 = jm1_02.e;
        long l3 = ((c)object).w(l2, object2);
        long l4 = jm1_02.f;
        long l7 = ((c)object).w(l4, object2);
        Object object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object3 == false && (object3 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1)) == false) {
            return jm1_02;
        }
        int n3 = jm1_02.b;
        d d2 = jm1_02.c;
        int n4 = jm1_02.a;
        object = new jm1_0(n4, n3, d2, l3, l7);
        return object;
    }

    public final void l0(int n3, j$b j$b) {
        if ((n3 = (int)(this.a(n3, j$b) ? 1 : 0)) != 0) {
            b$a b$a = this.c;
            b$a.f();
        }
    }

    public final void n0(int n3, j$b object, Iv1 iv1, jm1_0 object2) {
        if ((n3 = (int)(this.a(n3, (j$b)object) ? 1 : 0)) != 0) {
            k$a k$a = this.b;
            object = this.j((jm1_0)object2, (j$b)object);
            k$a.getClass();
            object2 = new on1_0(k$a, iv1, (jm1_0)object);
            k$a.a((n60_0)object2);
        }
    }
}

