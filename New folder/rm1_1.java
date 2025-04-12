/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from rm1
 */
public final class rm1_1
implements Iterator,
KMappedMarker {
    public final ml1_2 a;
    public final ce2_2 b;
    public final qp0_2 c;

    public rm1_1(ml1_2 ml1_22, ce2_2 ce2_22, KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        Intrinsics.checkNotNullParameter(ce2_22, "lexer");
        Intrinsics.checkNotNullParameter(kSerializer, "deserializer");
        this.a = ml1_22;
        this.b = ce2_22;
        this.c = kSerializer;
    }

    public final boolean hasNext() {
        byte by2;
        ce2_2 ce2_22 = this.b;
        byte by4 = ce2_22.w();
        if (by4 != (by2 = 10)) {
            by4 = 1;
        } else {
            by4 = 0;
            ce2_22 = null;
        }
        return by4 != 0;
    }

    public final Object next() {
        pj3_2 pj3_22 = pj3_2.OBJ;
        qp0_2 qp0_22 = this.c;
        SerialDescriptor serialDescriptor = qp0_22.getDescriptor();
        ml1_2 ml1_22 = this.a;
        ce2_2 ce2_22 = this.b;
        ce3_2 ce3_22 = new ce3_2(ml1_22, pj3_22, ce2_22, serialDescriptor, null);
        return ce3_22.e(qp0_22);
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

