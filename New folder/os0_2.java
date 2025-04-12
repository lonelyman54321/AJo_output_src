/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from os0
 */
public final class os0_2
implements KSerializer {
    public static final os0_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$d wz2$d = wz2$d.a;
        b = object = new yz2_1("kotlin.Double", wz2$d);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.s();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        double d2 = ((Number)object).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.f(d2);
    }
}

