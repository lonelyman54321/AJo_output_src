/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from BF
 */
public final class bf_2
implements KSerializer {
    public static final bf_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$b wz2$b = wz2$b.a;
        b = object = new yz2_1("kotlin.Byte", wz2$b);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.D();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        byte by2 = ((Number)object).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(by2);
    }
}

