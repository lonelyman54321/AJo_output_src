/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Yi1
 */
public final class yi1_2
implements KSerializer {
    public static final yi1_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$f wz2$f = wz2$f.a;
        b = object = new yz2_1("kotlin.Int", wz2$f);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.i();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        int n3 = ((Number)object).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.J(n3);
    }
}

