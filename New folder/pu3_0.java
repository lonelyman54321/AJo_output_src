/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from pu3
 */
public final class pu3_0
implements KSerializer {
    public static final pu3_0 a;
    public static final yh1_2 b;

    static {
        KSerializer kSerializer;
        a = kSerializer = new Object();
        xe_1.C(ShortCompanionObject.INSTANCE);
        kSerializer = n43_0.a;
        b = ah1_2.a("kotlin.UShort", kSerializer);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object object = b;
        short s7 = decoder.n((SerialDescriptor)object).p();
        object = new lu3_0(s7);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        short s7 = ((lu3_0)object).a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        yh1_2 yh1_22 = b;
        encoder.o(yh1_22).w(s7);
    }
}

