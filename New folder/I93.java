/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class I93
implements Iterator,
KMappedMarker {
    public final l73 a;
    public final int b;
    public final Q11 c;
    public final i0_0 d;
    public final int e;
    public int f;

    public I93(l73 l732, int n3, Q11 q11, i0_0 i0_02) {
        int n4;
        this.a = l732;
        this.b = n3;
        this.c = q11;
        this.d = i0_02;
        this.e = n4 = l732.g;
    }

    public final boolean hasNext() {
        int n3;
        int n4;
        ArrayList arrayList = this.c.a;
        boolean bl2 = false;
        if (arrayList != null && (n4 = this.f) < (n3 = arrayList.size())) {
            bl2 = true;
        }
        return bl2;
    }

    public final Object next() {
        block7: {
            E30 e30;
            block6: {
                l73 l732;
                int n3;
                Object object;
                block5: {
                    int n4;
                    object = this.c.a;
                    e30 = null;
                    if (object != null) {
                        int n7;
                        n3 = this.f;
                        this.f = n7 = n3 + 1;
                        object = ((ArrayList)object).get(n3);
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    n3 = object instanceof Ae;
                    l732 = this.a;
                    if (n3 == 0) break block5;
                    object = (Ae)object;
                    n4 = ((Ae)object).a;
                    n3 = this.e;
                    e30 = new m73(l732, n4, n3);
                    break block6;
                }
                n3 = object instanceof Q11;
                if (n3 == 0) break block7;
                object = (Q11)object;
                int n8 = this.f + -1;
                i0_0 i0_02 = this.d;
                dI2 dI22 = new dI2(i0_02, n8);
                n8 = this.b;
                e30 = new J93(l732, n8, (Q11)object, dI22);
            }
            return e30;
        }
        p30_0.d("Unexpected group information structure");
        throw null;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

