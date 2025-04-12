/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class Fu1$a
implements Iterator,
KMappedMarker {
    public String a;
    public boolean b;
    public final /* synthetic */ fu1_2 c;

    public Fu1$a(fu1_2 fu1_22) {
        this.c = fu1_22;
    }

    public final boolean hasNext() {
        boolean bl2;
        String string2 = this.a;
        boolean bl3 = true;
        if (string2 == null && !(bl2 = this.b)) {
            this.a = string2 = this.c.a.readLine();
            if (string2 == null) {
                this.b = bl3;
            }
        }
        if ((string2 = this.a) == null) {
            bl3 = false;
        }
        return bl3;
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            String string2 = this.a;
            this.a = null;
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

