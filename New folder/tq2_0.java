/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Tq2
 */
public abstract class tq2_0
implements Iterator,
KMappedMarker {
    public final is3_0[] a;
    public int b;
    public boolean c;

    public tq2_0(hs3_0 hs3_02, is3_0[] object) {
        this.a = object;
        this.c = true;
        object = object[0];
        Object[] objectArray = hs3_02.d;
        int n3 = Integer.bitCount(hs3_02.a) * 2;
        ((is3_0)object).a(objectArray, n3, 0);
        this.b = 0;
        this.a();
    }

    public final void a() {
        int n3 = this.b;
        is3_0[] is3_0Array = this.a;
        is3_0 is3_02 = is3_0Array[n3];
        int n4 = is3_02.c;
        int n7 = is3_02.b;
        if (n4 < n7) {
            return;
        }
        while (true) {
            Object[] objectArray;
            n7 = -1;
            n4 = 0;
            if (n7 >= n3) break;
            int n8 = this.c(n3);
            if (n8 == n7) {
                objectArray = is3_0Array[n3];
                int n10 = objectArray.c;
                Object[] objectArray2 = objectArray.a;
                int n14 = objectArray2.length;
                if (n10 < n14) {
                    n8 = objectArray2.length;
                    objectArray.c = ++n10;
                    n8 = this.c(n3);
                }
            }
            if (n8 != n7) {
                this.b = n8;
                return;
            }
            if (n3 > 0) {
                n7 = n3 + -1;
                is3_02 = is3_0Array[n7];
                n8 = is3_02.c;
                objectArray = is3_02.a;
                int cfr_ignored_0 = objectArray.length;
                is3_02.c = ++n8;
            }
            is3_02 = is3_0Array[n3];
            Object[] objectArray3 = hs3_0.e.d;
            is3_02.a(objectArray3, 0, 0);
            n3 += -1;
        }
        this.c = false;
    }

    public final int c(int n3) {
        Object object = this.a;
        Object[] objectArray = object[n3];
        int n4 = objectArray.c;
        int n7 = objectArray.b;
        if (n4 < n7) {
            return n3;
        }
        objectArray = objectArray.a;
        n7 = objectArray.length;
        if (n4 < n7) {
            n7 = objectArray.length;
            objectArray = objectArray[n4];
            Object[] objectArray2 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>";
            Intrinsics.checkNotNull(objectArray, (String)objectArray2);
            objectArray = (hs3_0)objectArray;
            n4 = 6;
            n7 = 0;
            if (n3 == n4) {
                n4 = n3 + 1;
                object = object[n4];
                objectArray = objectArray.d;
                n4 = objectArray.length;
                ((is3_0)object).a(objectArray, n4, 0);
            } else {
                n4 = n3 + 1;
                object = object[n4];
                objectArray2 = objectArray.d;
                int n8 = Integer.bitCount(objectArray.a) * 2;
                ((is3_0)object).a(objectArray2, n8, 0);
            }
            return this.c(++n3);
        }
        return -1;
    }

    public final boolean hasNext() {
        return this.c;
    }

    public Object next() {
        boolean bl2 = this.c;
        if (bl2) {
            Object object = this.a;
            int n3 = this.b;
            object = object[n3].next();
            this.a();
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

