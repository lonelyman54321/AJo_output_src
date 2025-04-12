/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from kS0
 */
public final class ks0_2
implements KSerializer {
    public static final ks0_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$e wz2$e = wz2$e.a;
        b = object = new yz2_1("kotlin.Float", wz2$e);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.q());
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        float f5 = ((Number)object).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.z(f5);
    }
}

