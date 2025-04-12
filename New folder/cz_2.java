/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from cz
 */
public final class cz_2
implements KSerializer {
    public static final cz_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$a wz2$a = wz2$a.a;
        b = object = new yz2_1("kotlin.Boolean", wz2$a);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.t();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        boolean bl2 = (Boolean)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.x(bl2);
    }
}

