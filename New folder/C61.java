/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class C61
implements List,
KMappedMarker {
    public Object[] a;
    public long[] b;
    public int c;
    public int d;
    public boolean e;

    public C61() {
        int n3 = 16;
        Object[] objectArray = new Object[n3];
        this.a = objectArray;
        long[] lArray = new long[n3];
        this.b = lArray;
        this.c = -1;
        this.e = true;
    }

    public final long a() {
        float f5 = 1.0f / 0.0f;
        long l2 = D61.a(f5, false);
        int n3 = this.c + 1;
        int n4 = xx_2.h(this);
        if (n3 <= n4) {
            while (true) {
                long[] lArray;
                long l3;
                int n7;
                if ((n7 = pr0_0.b(l3 = (lArray = this.b)[n3], l2)) < 0) {
                    l2 = l3;
                }
                long l4 = l2 >> 32;
                float f6 = Float.intBitsToFloat((int)l4);
                int n8 = 0;
                float f7 = f6 - 0.0f;
                n7 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
                if (n7 < 0 && (n8 = (int)(l4 = 0xFFFFFFFFL & l2)) != 0) {
                    return l2;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return l2;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void c(LP1$c object, float f5, boolean bl2, Function0 function0) {
        Object[] objectArray;
        int n3;
        int n4 = this.c;
        this.c = n3 = n4 + 1;
        Object[] objectArray2 = this.a;
        int n7 = objectArray2.length;
        if (n3 >= n7) {
            n3 = objectArray2.length + 16;
            objectArray2 = Arrays.copyOf(objectArray2, n3);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray2, string2);
            this.a = objectArray2;
            objectArray2 = this.b;
            objectArray = Arrays.copyOf((long[])objectArray2, n3);
            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            this.b = (long[])objectArray;
        }
        objectArray = this.a;
        int n8 = this.c;
        objectArray[n8] = object;
        object = this.b;
        long l2 = D61.a(f5, bl2);
        object[n8] = l2;
        this.d();
        function0.invoke();
        this.c = n4;
    }

    public final void clear() {
        this.c = -1;
        this.d();
        this.e = true;
    }

    public final boolean contains(Object object) {
        int n3 = object instanceof LP1$c;
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.indexOf(object = (LP1$c)object);
        if (n4 != (n3 = -1)) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            LP1$c lP1$c = (LP1$c)object.next();
            bl2 = this.contains(lP1$c);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final void d() {
        int n3 = this.c + 1;
        int n4 = xx_2.h(this);
        if (n3 <= n4) {
            while (true) {
                Object[] objectArray = this.a;
                objectArray[n3] = null;
                if (n3 == n4) break;
                ++n3;
            }
        }
        this.d = n3 = this.c + 1;
    }

    public final Object get(int n3) {
        Object object = this.a[n3];
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (LP1$c)object;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof LP1$c;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (LP1$c)object;
        n3 = xx_2.h(this);
        if (n3 >= 0) {
            int n7 = 0;
            while (true) {
                Object object2;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(object2 = this.a[n7], object)) {
                    n4 = n7;
                    break;
                }
                if (n7 == n3) break;
                ++n7;
            }
        }
        return n4;
    }

    public final boolean isEmpty() {
        int n3 = this.d;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        C61$a c61$a = new C61$a(this, 0, 7);
        return c61$a;
    }

    public final int lastIndexOf(Object object) {
        int n3 = object instanceof LP1$c;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (LP1$c)object;
        for (n3 = xx_2.h(this); n4 < n3; n3 += -1) {
            Object object2 = this.a[n3];
            boolean bl2 = Intrinsics.areEqual(object2, object);
            if (!bl2) continue;
            n4 = n3;
            break;
        }
        return n4;
    }

    public final ListIterator listIterator() {
        C61$a c61$a = new C61$a(this, 0, 7);
        return c61$a;
    }

    public final ListIterator listIterator(int n3) {
        C61$a c61$a = new C61$a(this, n3, 6);
        return c61$a;
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void replaceAll(UnaryOperator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final int size() {
        return this.d;
    }

    public final void sort(Comparator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final List subList(int n3, int n4) {
        C61$b c61$b = new C61$b(this, n3, n4);
        return c61$b;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }
}

