/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from SZ2
 */
public final class sz2_2
implements Iterable,
KMappedMarker {
    public final /* synthetic */ SerialDescriptor a;

    public sz2_2(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    public final Iterator iterator() {
        SerialDescriptor serialDescriptor = this.a;
        rz2_2 rz2_22 = new rz2_2(serialDescriptor);
        return rz2_22;
    }
}

