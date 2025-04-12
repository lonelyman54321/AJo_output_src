/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

public final class WR1
implements RandomAccess {
    public Object[] a;
    public WR1$a b;
    public int c;

    public WR1(Object[] objectArray) {
        this.a = objectArray;
        this.c = 0;
    }

    public final void a(int n3, Object object) {
        int n4 = this.c + 1;
        this.i(n4);
        Object[] objectArray = this.a;
        int n7 = this.c;
        if (n3 != n7) {
            int n8 = n3 + 1;
            rp_1.i(objectArray, n8, objectArray, n3, n7);
        }
        objectArray[n3] = object;
        this.c = n3 = this.c + 1;
    }

    public final void b(Object object) {
        int n3 = this.c + 1;
        this.i(n3);
        Object[] objectArray = this.a;
        int n4 = this.c;
        objectArray[n4] = object;
        this.c = ++n4;
    }

    public final void c(int n3, WR1 wR1) {
        int n4;
        int n7 = wR1.k();
        if (n7 != 0) {
            return;
        }
        n7 = this.c;
        int n8 = wR1.c;
        this.i(n7 += n8);
        Object[] objectArray = this.a;
        n8 = this.c;
        if (n3 != n8) {
            n4 = wR1.c + n3;
            rp_1.i(objectArray, n4, objectArray, n3, n8);
        }
        Object[] objectArray2 = wR1.a;
        n4 = wR1.c;
        rp_1.i(objectArray2, n3, objectArray, 0, n4);
        n3 = this.c;
        int n10 = wR1.c;
        this.c = n3 += n10;
    }

    public final void d(int n3, List list) {
        int n4;
        int n7;
        int n8 = list.isEmpty();
        if (n8 != 0) {
            return;
        }
        n8 = this.c;
        int n10 = list.size() + n8;
        this.i(n10);
        Object[] objectArray = this.a;
        n10 = this.c;
        if (n3 != n10) {
            n10 = list.size() + n3;
            n7 = this.c;
            rp_1.i(objectArray, n10, objectArray, n3, n7);
        }
        n10 = list.size();
        for (n7 = 0; n7 < n10; ++n7) {
            int n14 = n3 + n7;
            Object e2 = list.get(n7);
            objectArray[n14] = e2;
        }
        n3 = this.c;
        this.c = n4 = list.size() + n3;
    }

    public final boolean e(int n3, Collection collection) {
        int n4;
        int n7;
        int n8 = collection.isEmpty();
        int n10 = 0;
        if (n8 != 0) {
            return false;
        }
        n8 = this.c;
        int n14 = collection.size() + n8;
        this.i(n14);
        Object[] objectArray = this.a;
        n14 = this.c;
        if (n3 != n14) {
            n14 = collection.size() + n3;
            n7 = this.c;
            rp_1.i(objectArray, n14, objectArray, n3, n7);
        }
        Object object = collection;
        object = ((Iterable)collection).iterator();
        while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object e2 = object.next();
            int n15 = n10 + 1;
            if (n10 >= 0) {
                objectArray[n10 += n3] = e2;
                n10 = n15;
                continue;
            }
            xx_2.n();
            throw null;
        }
        n3 = this.c;
        this.c = n4 = collection.size() + n3;
        return true;
    }

    public final List f() {
        WR1$a wR1$a = this.b;
        if (wR1$a == null) {
            this.b = wR1$a = new WR1$a(this);
        }
        return wR1$a;
    }

    public final void g() {
        int n3;
        Object[] objectArray = this.a;
        for (int i3 = this.c + -1; (n3 = -1) < i3; i3 += -1) {
            n3 = 0;
            objectArray[i3] = null;
        }
        this.c = 0;
    }

    public final boolean h(Object object) {
        int n3 = this.c;
        int n4 = 1;
        if ((n3 -= n4) >= 0) {
            int n7 = 0;
            while (true) {
                Object object2;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(object2 = this.a[n7], object)) {
                    return n4 != 0;
                }
                if (n7 == n3) break;
                ++n7;
            }
        }
        return false;
    }

    public final void i(int n3) {
        Object object = this.a;
        int n4 = ((Object[])object).length;
        if (n4 < n3) {
            n4 = ((Object[])object).length * 2;
            n3 = Math.max(n3, n4);
            Object[] objectArray = Arrays.copyOf(object, n3);
            object = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray, (String)object);
            this.a = objectArray;
        }
    }

    public final int j(Object object) {
        int n3 = this.c;
        if (n3 > 0) {
            Object[] objectArray = this.a;
            int n4 = 0;
            do {
                Object object2;
                boolean bl2;
                if (!(bl2 = Intrinsics.areEqual(object, object2 = objectArray[n4]))) continue;
                return n4;
            } while (++n4 < n3);
        }
        return -1;
    }

    public final boolean k() {
        int n3 = this.c;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean l() {
        int n3 = this.c;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean m(Object object) {
        int n3 = this.j(object);
        if (n3 >= 0) {
            this.n(n3);
            return true;
        }
        return false;
    }

    public final Object n(int n3) {
        Object[] objectArray = this.a;
        Object object = objectArray[n3];
        int n4 = this.c;
        int n7 = n4 + -1;
        if (n3 != n7) {
            n7 = n3 + 1;
            rp_1.i(objectArray, n3, objectArray, n7, n4);
        }
        this.c = n3 = this.c + -1;
        objectArray[n3] = null;
        return object;
    }

    public final void o(int n3, int n4) {
        if (n4 > n3) {
            Object[] objectArray;
            int n7 = this.c;
            if (n4 < n7) {
                objectArray = this.a;
                rp_1.i(objectArray, n3, objectArray, n4, n7);
            }
            n7 = this.c;
            if ((n3 = n7 - (n4 -= n3)) <= (n7 += -1)) {
                n4 = n3;
                while (true) {
                    objectArray = this.a;
                    objectArray[n4] = null;
                    if (n4 == n7) break;
                    ++n4;
                }
            }
            this.c = n3;
        }
    }

    public final void p(Comparator comparator) {
        Object[] objectArray = this.a;
        int n3 = this.c;
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objectArray, 0, n3, comparator);
    }
}

