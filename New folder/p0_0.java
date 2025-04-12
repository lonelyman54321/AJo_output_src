/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from P0
 */
public abstract class p0_0
implements Iterator,
KMappedMarker {
    public hb3_1 a;
    public Object b;

    public p0_0() {
        hb3_1 hb3_12;
        this.a = hb3_12 = hb3_1.NotReady;
    }

    public abstract void a();

    public final boolean hasNext() {
        Object object;
        Object object2;
        block2: {
            boolean bl2;
            block3: {
                block4: {
                    object2 = this.a;
                    object = hb3_1.Failed;
                    if (object2 == object) break block2;
                    int[] nArray = P0$a.$EnumSwitchMapping$0;
                    int n3 = object2.ordinal();
                    n3 = nArray[n3];
                    bl2 = false;
                    nArray = null;
                    int n4 = 1;
                    if (n3 == n4) break block3;
                    int n7 = 2;
                    if (n3 == n7) break block4;
                    this.a = object;
                    this.a();
                    object2 = this.a;
                    object = hb3_1.Ready;
                    if (object2 != object) break block3;
                }
                bl2 = true;
            }
            return bl2;
        }
        object = "Failed requirement.".toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            hb3_1 hb3_12;
            this.a = hb3_12 = hb3_1.NotReady;
            return this.b;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

