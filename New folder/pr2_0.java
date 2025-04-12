/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/*
 * Renamed from pr2
 */
public final class pr2_0
extends y0_0
implements KMutableListIterator {
    public final nr2 c;
    public int d;
    public gs3_0 e;
    public int f;

    public pr2_0(nr2 nr22, int n3) {
        int n4;
        int n7 = nr22.a();
        super(n3, n7);
        this.c = nr22;
        this.d = n4 = nr22.f();
        this.f = -1;
        this.c();
    }

    public final void a() {
        int n3 = this.d;
        nr2 nr22 = this.c;
        int n4 = nr22.f();
        if (n3 == n4) {
            return;
        }
        ConcurrentModificationException concurrentModificationException = new ConcurrentModificationException();
        throw concurrentModificationException;
    }

    public final void add(Object object) {
        int n3;
        this.a();
        int n4 = this.a;
        nr2 nr22 = this.c;
        nr22.add(n4, object);
        this.a = n3 = this.a + 1;
        this.b = n3 = nr22.a();
        this.d = n3 = nr22.f();
        this.f = -1;
        this.c();
    }

    public final void c() {
        Object[] objectArray = this.c;
        Object[] objectArray2 = objectArray.f;
        if (objectArray2 == null) {
            this.e = null;
            return;
        }
        int n3 = objectArray.h;
        int n4 = this.a;
        int n7 = 1;
        if (n4 > (n3 = n3 - n7 & 0xFFFFFFE0)) {
            n4 = n3;
        }
        int n8 = objectArray.d / 5 + n7;
        gs3_0 gs3_02 = this.e;
        if (gs3_02 == null) {
            gs3_0 gs3_03;
            this.e = gs3_03 = new gs3_0(objectArray2, n4, n3, n8);
        } else {
            Intrinsics.checkNotNull(gs3_02);
            gs3_02.a = n4;
            gs3_02.b = n3;
            gs3_02.c = n8;
            Object[] objectArray3 = gs3_02.d;
            int n10 = objectArray3.length;
            if (n10 < n8) {
                objectArray = new Object[n8];
                gs3_02.d = objectArray;
            }
            objectArray = gs3_02.d;
            n10 = 0;
            objectArray3 = null;
            objectArray[0] = objectArray2;
            if (n4 == n3) {
                n10 = 1;
            }
            gs3_02.e = n10;
            gs3_02.c(n4 -= n10, n7);
        }
    }

    public final Object next() {
        this.a();
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            this.f = n3 = this.a;
            Object[] objectArray = this.e;
            nr2 nr22 = this.c;
            if (objectArray == null) {
                int n7;
                objectArray = nr22.g;
                this.a = n7 = n3 + 1;
                return objectArray[n3];
            }
            n3 = (int)(objectArray.hasNext() ? 1 : 0);
            if (n3 != 0) {
                this.a = n3 = this.a + 1;
                return objectArray.next();
            }
            Object[] objectArray2 = nr22.g;
            int n8 = this.a;
            this.a = n4 = n8 + 1;
            int n10 = objectArray.b;
            return objectArray2[n8 -= n10];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final Object previous() {
        this.a();
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            int n4;
            n3 = this.a;
            this.f = n4 = n3 + -1;
            Object[] objectArray = this.e;
            nr2 nr22 = this.c;
            if (objectArray == null) {
                objectArray = nr22.g;
                this.a = n3 += -1;
                return objectArray[n3];
            }
            int n7 = objectArray.b;
            if (n3 > n7) {
                objectArray = nr22.g;
                this.a = n3 += -1;
                return objectArray[n3 -= n7];
            }
            this.a = n3 += -1;
            return objectArray.previous();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        this.a();
        int n3 = this.f;
        int n4 = -1;
        if (n3 != n4) {
            nr2 nr22 = this.c;
            nr22.c(n3);
            n3 = this.f;
            int n7 = this.a;
            if (n3 < n7) {
                this.a = n3;
            }
            this.b = n3 = nr22.a();
            this.d = n3 = nr22.f();
            this.f = n4;
            this.c();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public final void set(Object object) {
        this.a();
        int n3 = this.f;
        int n4 = -1;
        if (n3 != n4) {
            int n7;
            nr2 nr22 = this.c;
            nr22.set(n3, object);
            this.d = n7 = nr22.f();
            this.c();
            return;
        }
        object = new IllegalStateException();
        throw object;
    }
}

