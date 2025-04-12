/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from mB1
 */
public final class mb1_2
implements KSerializer {
    public static final mb1_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$g wz2$g = wz2$g.a;
        b = object = new yz2_1("kotlin.Long", wz2$g);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.k();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        long l2 = ((Number)object).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.q(l2);
    }
}

