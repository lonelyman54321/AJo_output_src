/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from H93
 */
public final class h93_0
implements Iterable,
Iterator,
KMappedMarker {
    public final l73 a;
    public final int b;
    public final int c;
    public final int d;
    public final Lx e;
    public int f;

    public h93_0(l73 object, int n3, Q11 q11) {
        block12: {
            int n4;
            int n7;
            this.a = object;
            int[] nArray = ((l73)object).a;
            this.b = n7 = n73.d(nArray, n3);
            long[] lArray = null;
            q11.getClass();
            this.c = 0;
            q11.getClass();
            int n8 = ((l73)object).b;
            if (++n3 < n8) {
                object = ((l73)object).a;
                n4 = n73.d((int[])object, n3);
            } else {
                n4 = ((l73)object).d;
            }
            this.d = n4 -= n7;
            object = new Object();
            ArrayList arrayList = q11.a;
            int n10 = 128;
            n7 = 64;
            if (arrayList != null) {
                n8 = arrayList.size();
                for (int i3 = 0; i3 < n8; ++i3) {
                    Object object2 = arrayList.get(i3);
                    int n14 = object2 instanceof Q11;
                    if (n14 == 0) continue;
                    object2 = (Q11)object2;
                    object2.getClass();
                    object2.getClass();
                    for (n14 = 0; n14 < 0; ++n14) {
                        int n15;
                        int n16;
                        long l2;
                        long l3 = 1L;
                        if (n14 < n7) {
                            l3 <<= n14;
                            l2 = ((Lx)object).a;
                            ((Lx)object).a = l3 |= l2;
                            continue;
                        }
                        if (n14 < n10) {
                            n16 = n14 + -64;
                            l3 <<= n16;
                            l2 = ((Lx)object).b;
                            ((Lx)object).b = l3 |= l2;
                            continue;
                        }
                        n16 = n14 / 64;
                        int n17 = n16 + -2;
                        int n18 = n14 % 64;
                        l3 <<= n18;
                        long[] lArray2 = ((Lx)object).c;
                        if (lArray2 == null) {
                            n18 = n16 + -1;
                            ((Lx)object).c = lArray2 = new long[n18];
                        }
                        if (n17 >= (n15 = lArray2.length)) {
                            lArray2 = Arrays.copyOf(lArray2, n16 += -1);
                            object2 = "copyOf(this, newSize)";
                            Intrinsics.checkNotNullExpressionValue(lArray2, (String)object2);
                            ((Lx)object).c = lArray2;
                        }
                        long l4 = lArray2[n17];
                        lArray2[n17] = l3 |= l4;
                    }
                }
            }
            this.e = object;
            n3 = this.c;
            lArray = ((Lx)object).c;
            if (lArray != null) {
                n10 = (lArray.length + 2) * 64;
            }
            while (n3 < n10) {
                n7 = (int)(((Lx)object).a(n3) ? 1 : 0);
                if (n7 != 0) {
                    ++n3;
                    continue;
                }
                break block12;
            }
            n3 = -1 >>> 1;
        }
        this.f = n3;
    }

    public final boolean hasNext() {
        int n3 = this.f;
        int n4 = this.d;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        return this;
    }

    public final Object next() {
        Object object;
        int n3;
        block4: {
            int n4;
            n3 = this.f;
            if (n3 >= 0 && n3 < (n4 = this.d)) {
                object = this.a.c;
                int n7 = this.b + n3;
                object = object[n7];
            } else {
                n4 = 0;
                object = null;
            }
            ++n3;
            Lx lx = this.e;
            long[] lArray = lx.c;
            int n8 = lArray != null ? (lArray.length + 2) * 64 : 128;
            while (n3 < n8) {
                boolean bl2 = lx.a(n3);
                if (bl2) {
                    ++n3;
                    continue;
                }
                break block4;
            }
            n3 = -1 >>> 1;
        }
        this.f = n3;
        return object;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

