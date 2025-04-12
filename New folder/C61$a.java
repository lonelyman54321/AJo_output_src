/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class C61$a
implements ListIterator,
KMappedMarker {
    public int a;
    public final int b;
    public final int c;
    public final /* synthetic */ C61 d;

    public C61$a(C61 c61, int n3, int n4) {
        if ((n4 &= 1) != 0) {
            n3 = 0;
        }
        n4 = c61.d;
        this(c61, n3, 0, n4);
    }

    public C61$a(C61 c61, int n3, int n4, int n7) {
        this.d = c61;
        this.a = n3;
        this.b = n4;
        this.c = n7;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        int n4 = this.c;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean hasPrevious() {
        int n3 = this.a;
        int n4 = this.b;
        n3 = n3 > n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3;
        Object object = this.d.a;
        int n4 = this.a;
        this.a = n3 = n4 + 1;
        object = object[n4];
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (LP1$c)object;
    }

    public final int nextIndex() {
        int n3 = this.a;
        int n4 = this.b;
        return n3 - n4;
    }

    public final Object previous() {
        int n3;
        Object object = this.d.a;
        this.a = n3 = this.a + -1;
        object = object[n3];
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (LP1$c)object;
    }

    public final int previousIndex() {
        int n3 = this.a;
        int n4 = this.b;
        return n3 - n4 + -1;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

