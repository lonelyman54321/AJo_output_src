/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from QZ2
 */
public final class qz2_1
implements Iterator,
KMappedMarker {
    public int a;
    public final /* synthetic */ SerialDescriptor b;

    public qz2_1(SerialDescriptor serialDescriptor) {
        int n3;
        this.b = serialDescriptor;
        this.a = n3 = serialDescriptor.d();
    }

    public final boolean hasNext() {
        int n3 = this.a;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3;
        SerialDescriptor serialDescriptor = this.b;
        int n4 = serialDescriptor.d();
        int n7 = this.a;
        this.a = n3 = n7 + -1;
        return serialDescriptor.g(n4 -= n7);
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

