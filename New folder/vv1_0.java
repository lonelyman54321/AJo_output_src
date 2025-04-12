/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.c;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * Renamed from vv1
 */
public final class vv1_0 {
    public final VV a;
    public final H21 b;
    public final vv1$b c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public vv1_0(Looper looper, VV vV, vv1$b vv1$b) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this(copyOnWriteArraySet, looper, vV, vv1$b, true);
    }

    public vv1_0(CopyOnWriteArraySet object, Looper looper, VV vV, vv1$b vv1$b, boolean bl2) {
        this.a = vV;
        this.d = object;
        this.c = vv1$b;
        this.g = object = new Object();
        object = new ArrayDeque();
        this.e = object;
        object = new ArrayDeque();
        this.f = object;
        object = new tv1(this);
        this.b = object = vV.b(looper, (Handler.Callback)object);
        this.i = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object) {
        object.getClass();
        Object object2 = this.g;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.h;
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                CopyOnWriteArraySet copyOnWriteArraySet = this.d;
                vv1$c vv1$c = new vv1$c(object);
                copyOnWriteArraySet.add(vv1$c);
                return;
            }
            throw throwable2;
        }
    }

    public final void b() {
        boolean bl2;
        this.g();
        Object object = this.f;
        boolean bl3 = ((ArrayDeque)object).isEmpty();
        if (bl3) {
            return;
        }
        Object object2 = this.b;
        int n3 = object2.a();
        int n4 = 1;
        if (n3 == 0) {
            rh3$a_0 rh3$a_0 = object2.b(n4);
            object2.g(rh3$a_0);
        }
        object2 = this.e;
        n3 = ((ArrayDeque)object2).isEmpty() ^ n4;
        ((ArrayDeque)object2).addAll(object);
        ((ArrayDeque)object).clear();
        if (n3 != 0) {
            return;
        }
        while (!(bl2 = ((ArrayDeque)object2).isEmpty())) {
            object = (Runnable)((ArrayDeque)object2).peekFirst();
            object.run();
            ((ArrayDeque)object2).removeFirst();
        }
    }

    public final void c(int n3, vv1$a vv1$a) {
        this.g();
        AbstractCollection abstractCollection = this.d;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(abstractCollection);
        abstractCollection = this.f;
        uv1_1 uv1_12 = new uv1_1(copyOnWriteArraySet, n3, vv1$a);
        ((ArrayDeque)abstractCollection).add(uv1_12);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        boolean bl2;
        this.g();
        Iterator iterator = this.g;
        synchronized (iterator) {
            this.h = bl2 = true;
        }
        iterator = this.d.iterator();
        while (true) {
            boolean bl3;
            if (!(bl3 = iterator.hasNext())) {
                this.d.clear();
                return;
            }
            Object object = (vv1$c)iterator.next();
            vv1$b vv1$b = this.c;
            ((vv1$c)object).d = bl2;
            boolean bl4 = ((vv1$c)object).c;
            if (!bl4) continue;
            bl4 = false;
            ((vv1$c)object).c = false;
            c c2 = ((vv1$c)object).b.b();
            object = ((vv1$c)object).a;
            vv1$b.a(object, c2);
        }
    }

    public final void e(Object object) {
        boolean bl2;
        this.g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator iterator = copyOnWriteArraySet.iterator();
        while (bl2 = iterator.hasNext()) {
            vv1$c vv1$c = (vv1$c)iterator.next();
            Object object2 = vv1$c.a;
            boolean bl3 = object2.equals(object);
            if (!bl3) continue;
            vv1$c.d = true;
            bl3 = vv1$c.c;
            if (bl3) {
                bl3 = false;
                vv1$c.c = false;
                object2 = vv1$c.b.b();
                Object object3 = vv1$c.a;
                vv1$b vv1$b = this.c;
                vv1$b.a(object3, (c)object2);
            }
            copyOnWriteArraySet.remove(vv1$c);
        }
    }

    public final void f(int n3, vv1$a vv1$a) {
        this.c(n3, vv1$a);
        this.b();
    }

    public final void g() {
        Thread thread2;
        boolean bl2 = this.i;
        if (!bl2) {
            return;
        }
        Thread thread3 = Thread.currentThread();
        if (thread3 == (thread2 = this.b.e().getThread())) {
            bl2 = true;
        } else {
            bl2 = false;
            thread3 = null;
        }
        ct3.f(bl2);
    }
}

