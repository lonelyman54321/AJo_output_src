/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Sp
 */
public final class sp_1
implements Iterable,
KMappedMarker {
    public final /* synthetic */ Object[] a;

    public sp_1(Object[] objectArray) {
        this.a = objectArray;
    }

    public final Iterator iterator() {
        return ArrayIteratorKt.iterator(this.a);
    }
}

