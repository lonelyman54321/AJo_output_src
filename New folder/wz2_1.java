/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from wZ2
 */
public final class wz2_1
extends xz2_2
implements Iterator,
f80_0,
KMappedMarker {
    public int a;
    public Object b;
    public Iterator c;
    public f80_0 d;

    public final j90_0 a(f80_0 f80_02, Object object) {
        this.b = object;
        this.a = 3;
        this.d = f80_02;
        object = j90_0.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(f80_02, "frame");
        return object;
    }

    public final Object c(Iterator object, f80_0 f80_02) {
        boolean bl2 = object.hasNext();
        if (!bl2) {
            return Unit.a;
        }
        this.c = object;
        this.a = 2;
        this.d = f80_02;
        object = j90_0.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(f80_02, "frame");
        return object;
    }

    public final RuntimeException d() {
        RuntimeException runtimeException;
        int n3 = this.a;
        int n4 = 4;
        if (n3 != n4) {
            n4 = 5;
            if (n3 != n4) {
                String string2 = "Unexpected state of the iterator: ";
                CharSequence charSequence = new StringBuilder(string2);
                int n7 = this.a;
                charSequence.append(n7);
                charSequence = charSequence.toString();
                runtimeException = new IllegalStateException((String)charSequence);
            } else {
                String string3 = "Iterator has failed.";
                runtimeException = new IllegalStateException(string3);
            }
        } else {
            runtimeException = new NoSuchElementException();
        }
        return runtimeException;
    }

    public final CoroutineContext getContext() {
        return f.a;
    }

    public final boolean hasNext() {
        while (true) {
            Object object;
            int bl2 = this.a;
            boolean bl3 = false;
            Object object2 = null;
            if (bl2) {
                int n3 = 2;
                int n4 = 1;
                if (bl2 != n4) {
                    int n7;
                    if (bl2 != n3 && bl2 != (n7 = 3)) {
                        int n8 = 4;
                        if (bl2 == n8) {
                            return false;
                        }
                        throw this.d();
                    }
                    return n4;
                }
                object = this.c;
                Intrinsics.checkNotNull(object);
                bl2 = (int)(object.hasNext() ? 1 : 0);
                if (bl2) {
                    this.a = n3;
                    return n4;
                }
                this.c = null;
            }
            bl2 = 5;
            this.a = bl2;
            object = this.d;
            Intrinsics.checkNotNull(object);
            this.d = null;
            object2 = tl2_2.b;
            object2 = Unit.a;
            object.resumeWith(object2);
        }
    }

    public final Object next() {
        int n3;
        int n4 = this.a;
        if (n4 != 0 && n4 != (n3 = 1)) {
            int n7 = 2;
            if (n4 != n7) {
                n3 = 3;
                if (n4 == n3) {
                    this.a = 0;
                    Object object = this.b;
                    this.b = null;
                    return object;
                }
                throw this.d();
            }
            this.a = n3;
            Iterator iterator = this.c;
            Intrinsics.checkNotNull(iterator);
            return iterator.next();
        }
        n4 = (int)(this.hasNext() ? 1 : 0);
        if (n4 != 0) {
            return this.next();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final void resumeWith(Object object) {
        vl2_2.b(object);
        this.a = 4;
    }
}

