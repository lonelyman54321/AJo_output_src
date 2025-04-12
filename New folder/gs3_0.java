/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gs3
 */
public final class gs3_0
extends y0_0 {
    public int c;
    public Object[] d;
    public boolean e;

    public gs3_0(Object[] objectArray, int n3, int n4, int n7) {
        super(n3, n4);
        this.c = n7;
        Object[] objectArray2 = new Object[n7];
        this.d = objectArray2;
        int n8 = 1;
        n4 = n3 == n4 ? 1 : 0;
        this.e = n4;
        objectArray2[0] = objectArray;
        this.c(n3 -= n4, n8);
    }

    public final Object a() {
        int n3 = this.a & 0x1F;
        Object object = this.d;
        int n4 = this.c + -1;
        object = object[n4];
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return object[n3];
    }

    public final void c(int n3, int n4) {
        int n7;
        int n8 = (this.c - n4) * 5;
        while (n4 < (n7 = this.c)) {
            Object[] objectArray = this.d;
            int n10 = n4 + -1;
            Object object = objectArray[n10];
            String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
            Intrinsics.checkNotNull(object, string2);
            object = object;
            int n14 = Oz3.a(n3, n8);
            objectArray[n4] = object = object[n14];
            n8 += -5;
            ++n4;
        }
    }

    public final void d(int n3) {
        int n4;
        int n7 = 0;
        while ((n4 = Oz3.a(this.a, n7)) == n3) {
            n7 += 5;
        }
        if (n7 > 0) {
            n3 = this.c + -1;
            n3 -= (n7 /= 5);
            n7 = this.a;
            this.c(n7, ++n3);
        }
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            Object object = this.a();
            int n3 = this.a;
            int n4 = 1;
            this.a = n3 += n4;
            int n7 = this.b;
            if (n3 == n7) {
                this.e = n4;
                return object;
            }
            this.d(0);
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            this.a = n3 = this.a + -1;
            n3 = (int)(this.e ? 1 : 0);
            if (n3 != 0) {
                this.e = false;
                return this.a();
            }
            this.d(31);
            return this.a();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

