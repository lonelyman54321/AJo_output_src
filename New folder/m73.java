/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class m73
implements E30,
Iterable,
KMappedMarker {
    public final l73 a;
    public final int b;
    public final int c;

    public m73(l73 l732, int n3, int n4) {
        this.a = l732;
        this.b = n3;
        this.c = n4;
    }

    public final Iterable a() {
        return this;
    }

    public final Object e() {
        Object object = this.a;
        Object[] objectArray = ((l73)object).a;
        int n3 = this.b;
        boolean bl2 = n73.h(objectArray, n3);
        if (bl2) {
            objectArray = ((l73)object).c;
            object = ((l73)object).a;
            n3 = n3 * 5 + 4;
            Object object2 = object[n3];
            object = objectArray[object2];
        } else {
            boolean bl3 = false;
            object = null;
        }
        return object;
    }

    public final Object f() {
        Object object = this.a;
        int n3 = ((l73)object).g;
        int n4 = this.c;
        if (n3 == n4) {
            object = ((l73)object).h();
            try {
                n3 = this.b;
                Ae ae2 = ((k73)object).a(n3);
                return ae2;
            }
            finally {
                ((k73)object).c();
            }
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final Iterable getData() {
        l73 l732 = this.a;
        int n3 = this.b;
        Q11 q11 = l732.l(n3);
        KMappedMarker kMappedMarker = q11 != null ? new h93_0(l732, n3, q11) : new fi0_1(l732, n3);
        return kMappedMarker;
    }

    public final Object getKey() {
        Object object = this.a;
        Object[] objectArray = ((l73)object).a;
        int n3 = this.b;
        boolean bl2 = n73.g(objectArray, n3);
        if (bl2) {
            objectArray = ((l73)object).c;
            int n4 = n73.k(((l73)object).a, n3);
            object = objectArray[n4];
            Intrinsics.checkNotNull(object);
        } else {
            object = ((l73)object).a;
            Object object2 = object[n3 *= 5];
            object = (int)object2;
        }
        return object;
    }

    public final String getSourceInfo() {
        Object object = this.a;
        Object[] objectArray = ((l73)object).a;
        int n3 = this.b;
        boolean bl2 = n73.f(objectArray, n3);
        Object object2 = null;
        if (bl2) {
            objectArray = ((l73)object).c;
            int n4 = n73.b(((l73)object).a, n3);
            object = objectArray[n4];
            bl2 = object instanceof String;
            if (bl2) {
                object2 = object;
                object2 = (String)object;
            }
        } else if ((object = ((l73)object).l(n3)) != null) {
            object2 = null;
            object.getClass();
        }
        return object2;
    }

    public final Iterator iterator() {
        Object object = this.a;
        int n3 = ((l73)object).g;
        int n4 = this.c;
        if (n3 == n4) {
            KMappedMarker kMappedMarker;
            n3 = this.b;
            Q11 q11 = ((l73)object).l(n3);
            if (q11 != null) {
                Se se = new Se(n3);
                kMappedMarker = new I93((l73)object, n3, q11, se);
            } else {
                n4 = n3 + 1;
                int[] nArray = ((l73)object).a;
                int n7 = n73.e(nArray, n3) + n3;
                kMappedMarker = new p11_0((l73)object, n4, n7);
            }
            return kMappedMarker;
        }
        object = new ConcurrentModificationException();
        throw object;
    }
}

