/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from n43
 */
public final class n43_0
implements KSerializer {
    public static final n43_0 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$h wz2$h = wz2$h.a;
        b = object = new yz2_1("kotlin.Short", wz2$h);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.p();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        short s7 = ((Number)object).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(s7);
    }
}

