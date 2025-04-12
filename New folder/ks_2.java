/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from kS
 */
public final class ks_2
implements KSerializer {
    public static final ks_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$c wz2$c = wz2$c.a;
        b = object = new yz2_1("kotlin.Char", wz2$c);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.u());
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        char c2 = ((Character)object).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.C(c2);
    }
}

