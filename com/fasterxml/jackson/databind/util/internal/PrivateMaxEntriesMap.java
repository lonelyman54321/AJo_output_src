/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$AddTask;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$RemovalTask;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$UpdateTask;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$b;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$c;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$e;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$g;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$i;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$k;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

public final class PrivateMaxEntriesMap
extends AbstractMap
implements ConcurrentMap,
Serializable {
    public static final int p = 0;
    public static final int q = 0;
    static final long serialVersionUID = 1L;
    public final ConcurrentHashMap a;
    public final int b;
    public final long[] c;
    public final lu1_1 d;
    public final AtomicLong e;
    public final AtomicLong f;
    public final ReentrantLock g;
    public final ConcurrentLinkedQueue h;
    public final AtomicLongArray i;
    public final AtomicLongArray j;
    public final AtomicReferenceArray k;
    public final AtomicReference l;
    public transient PrivateMaxEntriesMap$g m;
    public transient PrivateMaxEntriesMap$k n;
    public transient PrivateMaxEntriesMap$e o;

    static {
        int n3 = Runtime.getRuntime().availableProcessors();
        int n4 = 1;
        n3 = Integer.numberOfLeadingZeros(n3 - n4);
        n3 = 32 - n3;
        n3 = n4 << n3;
        p = n3 = Math.min(4, n3);
        q = n3 - n4;
    }

    public PrivateMaxEntriesMap(PrivateMaxEntriesMap$b serializable) {
        Serializable serializable2;
        int n3;
        this.b = n3 = ((PrivateMaxEntriesMap$b)((Object)serializable)).a;
        long l2 = Math.min(((PrivateMaxEntriesMap$b)((Object)serializable)).c, 9223372034707292160L);
        this.f = serializable2 = new AtomicLong(l2);
        int n4 = ((PrivateMaxEntriesMap$b)((Object)serializable)).b;
        super(n4, 0.75f, n3);
        this.a = serializable2;
        serializable = new Serializable();
        this.g = serializable;
        serializable = new Serializable();
        this.e = serializable;
        serializable = new Serializable();
        this.d = serializable;
        this.h = serializable = new Serializable();
        Object object = PrivateMaxEntriesMap$c.IDLE;
        super((PrivateMaxEntriesMap$c)((Object)object));
        this.l = serializable;
        n4 = p;
        object = new long[n4];
        this.c = (long[])object;
        super(n4);
        this.i = object;
        super(n4);
        this.j = object;
        super(n4 *= 16);
        this.k = object;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Proxy required");
        throw object;
    }

    public final void a(PrivateMaxEntriesMap$h serializable) {
        Object object = Thread.currentThread();
        int n3 = (int)((Thread)object).getId();
        int n4 = q & n3;
        AtomicLongArray atomicLongArray = this.i;
        long l2 = atomicLongArray.get(n4);
        long l3 = 1L + l2;
        atomicLongArray.lazySet(n4, l3);
        l3 = (long)15 & l2;
        n3 = (int)l3;
        AtomicReferenceArray atomicReferenceArray = this.k;
        int n7 = n4 * 16 + n3;
        atomicReferenceArray.lazySet(n7, serializable);
        serializable = this.j;
        long l4 = ((AtomicLongArray)serializable).get(n4);
        l2 -= l4;
        l4 = 4;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 < 0) {
            l7 = 1;
        } else {
            l7 = 0;
            serializable = null;
        }
        object = (PrivateMaxEntriesMap$c)((Object)this.l.get());
        l7 = (long)((PrivateMaxEntriesMap$c)((Object)object)).shouldDrainBuffers((boolean)l7);
        if (l7 != false) {
            this.i();
        }
    }

    public final void c(Runnable object) {
        this.h.add(object);
        object = this.l;
        PrivateMaxEntriesMap$c privateMaxEntriesMap$c = PrivateMaxEntriesMap$c.REQUIRED;
        ((AtomicReference)object).lazySet(privateMaxEntriesMap$c);
        this.i();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void clear() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block8: {
            Object object;
            Serializable serializable;
            Object object2;
            reentrantLock = this.g;
            reentrantLock.lock();
            try {
                while (true) {
                    object2 = this.d;
                    object2 = ((lu1_1)object2).e();
                    if ((object2 = (PrivateMaxEntriesMap$h)object2) != null) {
                        serializable = this.a;
                        object = ((PrivateMaxEntriesMap$h)object2).a;
                        ((ConcurrentHashMap)serializable).remove(object, object2);
                        this.g((PrivateMaxEntriesMap$h)object2);
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            object2 = null;
            {
                int n3;
                for (int i3 = 0; i3 < (n3 = ((AtomicReferenceArray)(serializable = this.k)).length()); ++i3) {
                    n3 = 0;
                    object = null;
                    ((AtomicReferenceArray)serializable).lazySet(i3, null);
                }
                while (true) {
                    object2 = this.h;
                    object2 = ((ConcurrentLinkedQueue)object2).poll();
                    if ((object2 = (Runnable)object2) == null) {
                        reentrantLock.unlock();
                        return;
                    }
                    object2.run();
                }
            }
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public final boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    public final boolean containsValue(Object object) {
        boolean bl2;
        object.getClass();
        Iterator iterator = this.a.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2 = ((PrivateMaxEntriesMap$h)iterator.next()).d();
            bl2 = object2.equals(object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final void e() {
        int n3;
        Runnable runnable2 = Thread.currentThread();
        long l2 = ((Thread)runnable2).getId();
        int n4 = (int)l2;
        int n7 = p + n4;
        while (true) {
            int n8;
            AtomicLongArray atomicLongArray = null;
            if (n4 >= n7) break;
            int n10 = q & n4;
            AtomicLongArray atomicLongArray2 = this.i;
            long l3 = atomicLongArray2.get(n10);
            for (n3 = 0; n3 < (n8 = 8); ++n3) {
                long[] lArray = this.c;
                long l4 = lArray[n10];
                Object object = this.k;
                long l7 = 15;
                int n14 = (int)(l4 &= l7);
                int n15 = n10 * 16 + n14;
                PrivateMaxEntriesMap$h privateMaxEntriesMap$h = (PrivateMaxEntriesMap$h)((AtomicReferenceArray)object).get(n15);
                if (privateMaxEntriesMap$h == null) break;
                ((AtomicReferenceArray)object).lazySet(n15, null);
                lu1_1 lu1_12 = this.d;
                n14 = (int)(lu1_12.c(privateMaxEntriesMap$h) ? 1 : 0);
                if (n14 != 0 && privateMaxEntriesMap$h != (object = lu1_12.b)) {
                    object = privateMaxEntriesMap$h.a();
                    PrivateMaxEntriesMap$h privateMaxEntriesMap$h2 = privateMaxEntriesMap$h.getNext();
                    if (object == null) {
                        lu1_12.a = privateMaxEntriesMap$h2;
                    } else {
                        ((PrivateMaxEntriesMap$h)object).c = privateMaxEntriesMap$h2;
                        privateMaxEntriesMap$h.c(null);
                    }
                    if (privateMaxEntriesMap$h2 == null) {
                        lu1_12.b = object;
                    } else {
                        privateMaxEntriesMap$h2.b = object;
                        privateMaxEntriesMap$h.b(null);
                    }
                    object = lu1_12.b;
                    lu1_12.b = privateMaxEntriesMap$h;
                    if (object == null) {
                        lu1_12.a = privateMaxEntriesMap$h;
                    } else {
                        object.b(privateMaxEntriesMap$h);
                        privateMaxEntriesMap$h.c((ku1_1)object);
                    }
                }
                l4 = lArray[n10];
                l7 = 1L;
                lArray[n10] = l4 += l7;
            }
            atomicLongArray = this.j;
            atomicLongArray.lazySet(n10, l3);
            ++n4;
        }
        while (n3 < (n7 = 16) && (runnable2 = (Runnable)this.h.poll()) != null) {
            runnable2.run();
            ++n3;
        }
    }

    public final Set entrySet() {
        PrivateMaxEntriesMap$e privateMaxEntriesMap$e = this.o;
        if (privateMaxEntriesMap$e == null) {
            this.o = privateMaxEntriesMap$e = new PrivateMaxEntriesMap$e(this);
        }
        return privateMaxEntriesMap$e;
    }

    public final void f() {
        Object object;
        long l2;
        Serializable serializable;
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = (l3 = (serializable = this.e).get()) - (l2 = ((AtomicLong)(object = this.f)).get())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            serializable = (PrivateMaxEntriesMap$h)this.d.e();
            if (serializable == null) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = this.a;
            object = ((PrivateMaxEntriesMap$h)serializable).a;
            concurrentHashMap.remove(object, serializable);
            this.g((PrivateMaxEntriesMap$h)serializable);
        }
    }

    public final void g(PrivateMaxEntriesMap$h serializable) {
        Object object;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l2;
        boolean bl2;
        while (!(bl2 = ((AtomicReference)serializable).compareAndSet(privateMaxEntriesMap$l2 = (PrivateMaxEntriesMap$l)((AtomicReference)serializable).get(), privateMaxEntriesMap$l = new PrivateMaxEntriesMap$l(object = privateMaxEntriesMap$l2.b, 0)))) {
        }
        serializable = this.e;
        long l2 = ((AtomicLong)serializable).get();
        long l3 = Math.abs(privateMaxEntriesMap$l2.a);
        ((AtomicLong)serializable).lazySet(l2 -= l3);
    }

    public final Object get(Object object) {
        ConcurrentHashMap concurrentHashMap = this.a;
        if ((object = (PrivateMaxEntriesMap$h)concurrentHashMap.get(object)) == null) {
            return null;
        }
        this.a((PrivateMaxEntriesMap$h)object);
        return ((PrivateMaxEntriesMap$h)object).d();
    }

    public final Object h(Object object, Object object2, boolean bl2) {
        Object object3;
        object.getClass();
        object2.getClass();
        int n3 = 1;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l = new PrivateMaxEntriesMap$l(object2, n3);
        object2 = new PrivateMaxEntriesMap$h(object, privateMaxEntriesMap$l);
        block0: while (true) {
            boolean bl3;
            object = this.a;
            object3 = ((PrivateMaxEntriesMap$h)object2).a;
            if ((object = (PrivateMaxEntriesMap$h)((ConcurrentHashMap)object).putIfAbsent(object3, object2)) == null) {
                object = new PrivateMaxEntriesMap$AddTask(this, (PrivateMaxEntriesMap$h)object2);
                this.c((Runnable)object);
                return null;
            }
            if (bl2) {
                this.a((PrivateMaxEntriesMap$h)object);
                return ((PrivateMaxEntriesMap$h)object).d();
            }
            do {
                if (!(bl3 = ((PrivateMaxEntriesMap$l)(object3 = (PrivateMaxEntriesMap$l)((AtomicReference)object).get())).a())) continue block0;
            } while (!(bl3 = ((AtomicReference)object).compareAndSet(object3, privateMaxEntriesMap$l)));
            break;
        }
        int n4 = ((PrivateMaxEntriesMap$l)object3).a;
        if ((n3 -= n4) == 0) {
            this.a((PrivateMaxEntriesMap$h)object);
        } else {
            object2 = new PrivateMaxEntriesMap$UpdateTask(this, (PrivateMaxEntriesMap$h)object, n3);
            this.c((Runnable)object2);
        }
        return ((PrivateMaxEntriesMap$l)object3).b;
    }

    public final void i() {
        AtomicReference atomicReference = this.l;
        ReentrantLock reentrantLock = this.g;
        boolean bl2 = reentrantLock.tryLock();
        if (bl2) {
            Object v4;
            boolean bl3;
            PrivateMaxEntriesMap$c privateMaxEntriesMap$c;
            PrivateMaxEntriesMap$c privateMaxEntriesMap$c2 = PrivateMaxEntriesMap$c.PROCESSING;
            try {
                atomicReference.lazySet(privateMaxEntriesMap$c2);
                this.e();
                privateMaxEntriesMap$c = PrivateMaxEntriesMap$c.IDLE;
            }
            catch (Throwable throwable) {
                Object v5;
                boolean bl4;
                PrivateMaxEntriesMap$c privateMaxEntriesMap$c3 = PrivateMaxEntriesMap$c.PROCESSING;
                PrivateMaxEntriesMap$c privateMaxEntriesMap$c4 = PrivateMaxEntriesMap$c.IDLE;
                while (!(bl4 = atomicReference.compareAndSet(privateMaxEntriesMap$c3, privateMaxEntriesMap$c4)) && (v5 = atomicReference.get()) == privateMaxEntriesMap$c3) {
                }
                reentrantLock.unlock();
                throw throwable;
            }
            while (!(bl3 = atomicReference.compareAndSet(privateMaxEntriesMap$c2, privateMaxEntriesMap$c)) && (v4 = atomicReference.get()) == privateMaxEntriesMap$c2) {
            }
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Set keySet() {
        PrivateMaxEntriesMap$g privateMaxEntriesMap$g = this.m;
        if (privateMaxEntriesMap$g == null) {
            this.m = privateMaxEntriesMap$g = new PrivateMaxEntriesMap$g(this);
        }
        return privateMaxEntriesMap$g;
    }

    public final Object put(Object object, Object object2) {
        return this.h(object, object2, false);
    }

    public final Object putIfAbsent(Object object, Object object2) {
        return this.h(object, object2, true);
    }

    public final Object remove(Object object) {
        int n3;
        Object object2;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l;
        boolean bl2;
        boolean bl3;
        Object object3 = this.a;
        if ((object = (PrivateMaxEntriesMap$h)((ConcurrentHashMap)object3).remove(object)) == null) {
            return null;
        }
        while ((bl3 = ((PrivateMaxEntriesMap$l)(object3 = (PrivateMaxEntriesMap$l)((AtomicReference)object).get())).a()) && !(bl2 = ((AtomicReference)object).compareAndSet(object3, privateMaxEntriesMap$l = new PrivateMaxEntriesMap$l(object2 = ((PrivateMaxEntriesMap$l)object3).b, n3 = -((PrivateMaxEntriesMap$l)object3).a)))) {
        }
        object3 = new PrivateMaxEntriesMap$RemovalTask(this, (PrivateMaxEntriesMap$h)object);
        this.c((Runnable)object3);
        return ((PrivateMaxEntriesMap$h)object).d();
    }

    public final boolean remove(Object object, Object object2) {
        ConcurrentHashMap concurrentHashMap = this.a;
        PrivateMaxEntriesMap$h privateMaxEntriesMap$h = (PrivateMaxEntriesMap$h)concurrentHashMap.get(object);
        if (privateMaxEntriesMap$h != null && object2 != null) {
            boolean bl2;
            Object object3;
            PrivateMaxEntriesMap$l privateMaxEntriesMap$l = (PrivateMaxEntriesMap$l)privateMaxEntriesMap$h.get();
            while (object2 == (object3 = privateMaxEntriesMap$l.b) || (bl2 = object3.equals(object2))) {
                boolean bl3;
                bl2 = privateMaxEntriesMap$l.a();
                if (bl2) {
                    int n3 = -privateMaxEntriesMap$l.a;
                    Object object4 = privateMaxEntriesMap$l.b;
                    object3 = new PrivateMaxEntriesMap$l(object4, n3);
                    bl3 = privateMaxEntriesMap$h.compareAndSet(privateMaxEntriesMap$l, object3);
                } else {
                    bl3 = false;
                    privateMaxEntriesMap$l = null;
                }
                if (bl3) {
                    boolean bl4 = concurrentHashMap.remove(object, privateMaxEntriesMap$h);
                    if (!bl4) break;
                    object = new PrivateMaxEntriesMap$RemovalTask(this, privateMaxEntriesMap$h);
                    this.c((Runnable)object);
                    return true;
                }
                privateMaxEntriesMap$l = (PrivateMaxEntriesMap$l)privateMaxEntriesMap$h.get();
                bl2 = privateMaxEntriesMap$l.a();
                if (bl2) continue;
            }
        }
        return false;
    }

    public final Object replace(Object object, Object object2) {
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l;
        boolean bl2;
        object.getClass();
        object2.getClass();
        int n3 = 1;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l2 = new PrivateMaxEntriesMap$l(object2, n3);
        object = (PrivateMaxEntriesMap$h)this.a.get(object);
        int n4 = 0;
        object2 = null;
        if (object == null) {
            return null;
        }
        do {
            if (bl2 = (privateMaxEntriesMap$l = (PrivateMaxEntriesMap$l)((AtomicReference)object).get()).a()) continue;
            return null;
        } while (!(bl2 = ((AtomicReference)object).compareAndSet(privateMaxEntriesMap$l, privateMaxEntriesMap$l2)));
        n4 = privateMaxEntriesMap$l.a;
        if ((n3 -= n4) == 0) {
            this.a((PrivateMaxEntriesMap$h)object);
        } else {
            object2 = new PrivateMaxEntriesMap$UpdateTask(this, (PrivateMaxEntriesMap$h)object, n3);
            this.c((Runnable)object2);
        }
        return privateMaxEntriesMap$l.b;
    }

    public final boolean replace(Object object, Object object2, Object object3) {
        Object object4;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l;
        boolean bl2;
        object.getClass();
        object2.getClass();
        object3.getClass();
        boolean bl3 = true;
        PrivateMaxEntriesMap$l privateMaxEntriesMap$l2 = new PrivateMaxEntriesMap$l(object3, (int)(bl3 ? 1 : 0));
        object = (PrivateMaxEntriesMap$h)this.a.get(object);
        object3 = null;
        if (object == null) {
            return false;
        }
        while ((bl2 = (privateMaxEntriesMap$l = (PrivateMaxEntriesMap$l)((AtomicReference)object).get()).a()) && (object2 == (object4 = privateMaxEntriesMap$l.b) || (bl2 = object4.equals(object2)))) {
            bl2 = ((AtomicReference)object).compareAndSet(privateMaxEntriesMap$l, privateMaxEntriesMap$l2);
            if (!bl2) continue;
            int n3 = privateMaxEntriesMap$l.a;
            if ((n3 = 1 - n3) == 0) {
                this.a((PrivateMaxEntriesMap$h)object);
            } else {
                object3 = new PrivateMaxEntriesMap$UpdateTask(this, (PrivateMaxEntriesMap$h)object, n3);
                this.c((Runnable)object3);
            }
            return bl3;
        }
        return false;
    }

    public final int size() {
        return this.a.size();
    }

    public final Collection values() {
        PrivateMaxEntriesMap$k privateMaxEntriesMap$k = this.n;
        if (privateMaxEntriesMap$k == null) {
            this.n = privateMaxEntriesMap$k = new PrivateMaxEntriesMap$k(this);
        }
        return privateMaxEntriesMap$k;
    }

    public Object writeReplace() {
        PrivateMaxEntriesMap$i privateMaxEntriesMap$i = new PrivateMaxEntriesMap$i(this);
        return privateMaxEntriesMap$i;
    }
}

